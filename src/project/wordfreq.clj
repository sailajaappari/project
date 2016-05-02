(def s "marry had a little lamp little lamp")
(frequencies (clojure.string/split s #" ")) 


(def words (clojure.string/split s #" "))
(defn count-words
  "to count frequency of words"
  ([ws] (count-words (rest ws) {} (first ws) (count ws)))
  ([ws m fw cnt]
      (if (= cnt 0)
         m
         (if (contains? m fw)
            (count-words (rest ws) (assoc m fw (inc (second (find m fw)))) (first ws) (dec cnt))
            (count-words (rest ws) (assoc m fw 1) (first ws) (dec cnt))))))
(count-words words) 








