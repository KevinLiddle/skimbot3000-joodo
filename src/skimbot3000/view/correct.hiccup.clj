(let [question-id (:question-id *view-context*)
      answer-id (:answer-id *view-context*)]
  (list
    [:img {:src "/images/Skim_yes.png" :alt "Yessss"}]
    [:h2 "Skim is satisfied."]
    [:embed {:src "/sounds/SkimYes.mp3" :autostart "true" :hidden "true" :loop "false"}]

    (if (< (+ question-id 1) (count questions))
      [:a {:href (str "/question/" (+ question-id 1))} "Next Question"]
      [:a {:href "/results/end"} "Results"])

    ))
