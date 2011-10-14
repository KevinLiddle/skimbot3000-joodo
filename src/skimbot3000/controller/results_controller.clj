(ns skimbot3000.controller.results-controller
  (:use [compojure.core :only (routes GET)]
        [joodo.views :only (render-template)]))

(def results-controller
  (->
    (routes
      (GET "/results/end" []
           (render-template "end")))))
