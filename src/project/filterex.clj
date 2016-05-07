(defn filter-vals 
  "To perform the filter operation using recursion"
  [f nums]
  (loop [n nums res []]
     (if (empty? n)
        res       
        (if (f (first n))
           (recur (rest n) (conj res (first n)))
           (recur (rest n) res)))))
(filter-vals even? [1 2 3 4 5 6 7 8])
(filter-vals odd? (range 10)) 




