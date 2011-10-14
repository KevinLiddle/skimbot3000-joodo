(ns skimbot3000.core
  (:use
    [compojure.core :only (defroutes GET)]
    [compojure.route :only (not-found)]
    [joodo.middleware.view-context :only (wrap-view-context)]
    [joodo.views :only (render-template render-html)]
    [joodo.controllers :only (controller-router)]))

(defroutes skimbot3000-routes
  (GET "/" [] (render-template "home"))
  (controller-router 'skimbot3000.controller)
  (not-found (render-template "not_found" :template-root "skimbot3000/view" :ns `skimbot3000.view.view-helpers)))

(def app-handler
  (->
    skimbot3000-routes
    (wrap-view-context :template-root "skimbot3000/view" :ns `skimbot3000.view.view-helpers)))

