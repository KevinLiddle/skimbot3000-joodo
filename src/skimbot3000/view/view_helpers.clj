(ns skimbot3000.view.view-helpers
  "Put helper functions for views in this namespace."
  (:use
    [joodo.views :only (render-partial *view-context*)]
    [hiccup.page-helpers]
    [hiccup.form-helpers]
    [skimbot3000.model.question]))
