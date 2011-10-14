(doctype :html5)
[:html
 [:head
  [:meta {:http-equiv "Content-Type" :content "text/html" :charset "iso-8859-1"}]
  [:title "skimbot3000"]
  (include-css "/stylesheets/skimbot3000.css")
  (include-js "/javascript/skimbot3000.js")]
 [:body
  (eval (:template-body joodo.views/*view-context*))
]]