(ns hello-clojurescript
  (:use [jayq.core :only [$ delegate css inner toggle]]))

(def $body ($ :body))

(delegate $body :#clickable :click
          (fn [e]
            (toggle ($ :#toggle))))
