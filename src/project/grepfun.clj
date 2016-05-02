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
