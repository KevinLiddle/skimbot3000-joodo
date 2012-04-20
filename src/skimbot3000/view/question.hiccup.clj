(let [question-id (:question-id *view-context*)
      question (:question *view-context*)
      answers (:answers *view-context*)]
  (list
    [:h2 {:class "question"} question]
    [:ul {:class "answers"}
      (for [i (range 0 (count answers))]
        [:li
          [:a {:href (str "/question/" question-id "/answer/" i)} (nth answers i)]
         ]
        )
     ]
    )
  )
