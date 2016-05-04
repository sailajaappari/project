(defn drop-while-vals
  "Implement drop-while function "
  [f nums]
  (case f
    "neg?" (loop [res [] x (first nums) n (rest nums) cnt 0]
              (if (>= cnt (count nums))
                 res
                 (if (>= x 0)
                    (conj res (cons x n))
                    (recur res (first n) (rest n) (inc cnt)))))
    "pos?" (loop [res [] x (first nums) n (rest nums) cnt 0]
              (if (>= cnt (count nums))
                 res
                 (if (<= x 0)
                    (conj res (cons x n))
                    (recur res (first n) (rest n) (inc cnt)))))
    "odd?" (loop [res [] x (first nums) n (rest nums) cnt 0]
              (if (>= cnt (count nums))
                 res
                 (if (> (rem x 2) 0)
                    (recur res (first n) (rest n) (inc cnt))
                    (conj res (cons x n))
                    )))
    "even?"  (loop [res [] x (first nums) n (rest nums) cnt 0]
              (if (>= cnt (count nums))
                 res
                 (if (= (rem x 2) 0)
                    (recur res (first n) (rest n) (inc cnt))
                    (conj res (cons x n))
                    )))
   ))
(drop-while-vals "neg?" [-1 -2 0 1 2 -3])
(drop-while-vals "pos?" [1 2 0 1 -1])
(drop-while-vals "even?" [2 4 1 2 3 0])
(drop-while-vals "odd?" [1 2 4 5])
(drop-while-vals "odd?" [])

