(ns skimbot3000.model.question-spec
  (:use [speclj.core]
        [skimbot3000.model.question]))

(describe "Question Model"
  (it "checks the answer of question 0"
    (should (check-answer 0 0)))
  (it "checks a wrong answer"
    (should-not (check-answer 4 1)))
  (it "gets the prompt for the given question"
    (should= "What is your name?" (prompt 0)))
  (it "gets the options for the given question"
    (should= ["Skim" "Not Skim"] (options 0)))
  (it "gets the answer index of the given question"
    (should= 0 (answer-index 0))))
