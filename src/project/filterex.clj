(defn filter-vals 
  "To perform the filter operation using recursion"
  [nums]
  (loop [n nums res []]
     (if (empty? n)
        res
        (recur (rest n) (if (= (rem (first n) 2) 0) (conj res (first n)) res)))))

(filter-vals [1 2 3 4 5 6 7 8])
(filter-vals (range 10))


