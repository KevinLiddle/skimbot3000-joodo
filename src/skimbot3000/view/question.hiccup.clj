(let [question-id (:question-id *view-context*)]
  (list
    [:h2 {:class "question"} (prompt question-id)]
    [:ul {:class "answers"}
      (for [i (range 0 (count (options question-id)))]
        [:li
          [:a {:href (str "/question/" question-id "/answer/" i)} (nth (options question-id) i)]
         ]
        )
     ]
    )
  )
