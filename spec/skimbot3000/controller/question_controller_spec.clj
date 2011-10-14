(ns skimbot3000.controller.question-controller-spec
  (:use [speclj.core]
        [skimbot3000.controller.question-controller]
        [joodo.spec-helpers.controller]))

(describe "Question Controller"

  (with-mock-rendering)
  (with-routes question-controller)
  (with response )

  (it "renders the question page"
    (let [response (do-get (format "/question/0"))]
      (should= 200 (:status response))
      (should= "question" @rendered-template))
    )

  (it "renders the correct answer page"
    (let [response (do-get (format "/question/0/answer/0"))]
      (should= 200 (:status response))
      (should= "correct" @rendered-template))
    )

  (it "renders the wrong answer page"
    (let [response (do-get (format "/question/0/answer/1"))]
      (should= 200 (:status response))
      (should= "wrong" @rendered-template)))

  )
