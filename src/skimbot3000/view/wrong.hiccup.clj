(let [question-id (:question-id *view-context*)
      answer-id (:answer-id *view-context*)]
  (list
    [:img {:src "/images/Skim_sigh.png" :alt "Uugh"}]
    [:h2 "Skim is disappointed."]
    [:embed {:src "/sounds/Skim_sigh.mp3" :autostart "true" :hidden "true" :loop "false"}]

    (if (< (+ question-id 1) (count questions))
      [:a {:href (str "/question/" (+ question-id 1))} "Next Question"]
      [:a {:href "/results/end"} "Results"])

    ))
