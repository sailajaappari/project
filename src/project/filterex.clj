(defn filter-vals 
  "To perform the filter operation using recursion"
  [f nums]
  (loop [n nums res []]
     (if (empty? n)
        res       
        (if (= f "even?")
          (recur (rest n) (if (= (rem (first n) 2) 0)
                             (conj res (first n))
                             res))
          (recur (rest n) (if (> (rem (first n) 2) 0)
                             (conj res (first n))
                             res))))))
(filter-vals "even?" [1 2 3 4 5 6 7 8])
(filter-vals "odd?" (range 10))




