(ns skimbot3000.controller.results-controller-spec
  (:use [speclj.core]
        [skimbot3000.controller.results-controller]
        [joodo.spec-helpers.controller]))

(describe "Results Controller"

  (with-mock-rendering)
  (with-routes results-controller)
  (with response)

  (it "renders the end page"
    (let [response (do-get (format "/results/end"))]
      (should= 200 (:status response))
      (should= "end" @rendered-template)))
  )
