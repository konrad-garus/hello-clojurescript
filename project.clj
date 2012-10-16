(defproject hello-clojurescript "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.4.0"]
                 [ring "1.1.6"]
                 [jayq "0.1.0-alpha3"]]
  :plugins [[lein-cljsbuild "0.2.8"]]
  :cljsbuild
  {
   :source-path "src-cljs"
   :compiler
   {
    :output-to "resources/public/js/cljs.js"
    :optimizations :simple
    :pretty-print true
    }
   }
  :main hello-clojurescript.core
  )
