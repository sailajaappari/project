(defn grep-word
  "To implement grep function"
  [v x]
  (loop [words v res [] letter x]
     (if (empty? words)
        res
        (recur (rest words)
               (if (= letter (str (first (first words))))
                  (conj res (first words))
                  res)
               letter))))
(grep-word ["hai" "how" "what" "hai" "do"] "h")



 (defn grep-sentence
     "to find the word in a sentence and display that sentence"
     [senlist word]
     (loop [senlist1 senlist res []]
        (if (empty? senlist1)
           res
           (recur (rest senlist1) (let [s (into #{} (clojure.string/split (first senlist1) #" "))]
                                       (if (contains? s word)
                                          (conj res (first senlist1))
                                          res))))))

(grep-sentence ["hai jack" "hello james" "jack hello"] "hello")


