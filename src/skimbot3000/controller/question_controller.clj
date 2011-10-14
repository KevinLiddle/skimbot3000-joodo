(ns skimbot3000.controller.question-controller
  (:use [compojure.core :only (routes GET)]
        [joodo.views :only (render-template)]
        [skimbot3000.model.question]))

(defn render-results [question-id answer-id]
  (if (check-answer question-id answer-id)
    (render-template "correct" :question-id question-id)
    (render-template "wrong" :question-id question-id)))

(def question-controller
  (->
    (routes
      (GET "/question/:question-id" [question-id]
           (render-template "question" :question-id (read-string question-id)))
      (GET "/question/:question-id/answer/:answer-id" [question-id answer-id]
           (render-results (read-string question-id) (read-string answer-id)))
      )
    )
  )
