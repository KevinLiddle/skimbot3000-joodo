(ns skimbot3000.model.question)

(def questions
  [{:prompt "What is your name?", :options ["Skim" "Not Skim"], :answer_index 0}
    {:prompt "Do you filter your coffee through gold?", :options ["Yes" "No" "I don't drink coffee"], :answer_index 0}
    {:prompt "Which editor do you use?", :options ["TextMate" "IntelliJ" "Vim" "Emacs"], :answer_index 2}
    {:prompt "What is your preferred form of travel?", :options ["Walk" "Bike" "Car" "Public Transit" "Flying"], :answer_index 1}
    {:prompt "Can you banana kick?", :options ["Yes" "No"], :answer_index 0}
    {:prompt "Which is your favorite musical genre?", :options ["Rock" "Gangsta Rap" "Indie" "Dubstep" "80s" "Classical" "Other"], :answer_index 4}
    {:prompt "Do you use a mouse?", :options ["Yes" "No"], :answer_index 1}
    {:prompt "Where do you live?", :options ["Chicago" "New York" "L.A." "Dallas" "Other"], :answer_index 2}
    {:prompt "Where do you get your coffee?", :options ["Starbucks" "Caribou" "Intelligentsia" "Grocery Store" "I grow my own beans and make my own" "I import beans directly from Brazil" "I already told you, I don't drink coffee"], :answer_index 5}
    {:prompt "Do you know Skim?", :options ["Yes" "No" "Like skim milk?"], :answer_index -1}])

(defn check-answer [question answer]
  (= (get (nth questions question) :answer_index) answer))

(defn question-field [question-id field]
  (get (nth questions question-id) field))

(defn prompt [question-id]
  (question-field question-id :prompt))

(defn options [question-id]
  (question-field question-id :options))

(defn answer-index [question-id]
  (question-field question-id :answer_index))
