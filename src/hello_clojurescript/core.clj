(ns hello-clojurescript.core
  (:require [ring.adapter.jetty :as jetty]
            [ring.middleware.resource :as resources]))


(defn handler [request]
  {:status 200
   :headers {"Content-Type" "text/html"}
   :body 
   (str "<!DOCTYPE html>"
        "<html>"
        "<head>"
        "</head>"
        "<body>"
        "<p id=\"clickable\">Click me!</p>"
        "<p id=\"toggle\">Toggle Visible</p>"
        "<script src=\"http://code.jquery.com/jquery-1.8.2.min.js\"></script>"
        "<script src=\"js/cljs.js\"></script>"
        "</body>"
        "</html>")})

(def app 
  (-> handler
    (resources/wrap-resource "public")))

(defn -main [& args]
  (jetty/run-jetty app {:port 3000}))
