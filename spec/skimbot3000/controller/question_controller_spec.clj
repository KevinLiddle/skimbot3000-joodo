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

  (it "renders 404 when trying to mess with the question id"
    (let [response (do-get (format "/question/345678/answer/345678"))]
      (should= 404 (:status response))))

  (it "renders 404 when trying to mess with question id in question url"
    (let [response (do-get (format "/question/234567890"))]
      (should= 404 (:status response))))

  )
