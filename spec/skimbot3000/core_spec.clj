(ns skimbot3000.core-spec
  (:use
    [speclj.core]
    [joodo.spec-helpers.controller]
    [skimbot3000.core]))

(describe "skimbot3000"

  (with-mock-rendering)
  (with-routes app-handler)

  (it "handles home page"
    (let [result (do-get "/")]
      (should= 200 (:status result))
      (should= "home" @rendered-template)))
  )

(run-specs)
