(defn take-while-vals
  "Implement take-while function"
  [f nums]
  (case f
    "neg?" (loop [n (rest nums) res [] x (first nums)]
            (if (>= x 0)
               res
               (recur (rest n) (conj res x) (first n))))
    "pos?" (loop [n (rest nums) res [] x (first nums)]
            (if (< x 0)
               res
               (recur (rest n) (conj res x) (first n))))
    "odd?" (loop [n (rest nums) res [] x (first nums)]
            (if (= (mod x 2) 0)
               res
               (recur (rest n) (conj res x) (first n))))
    "even?" (loop [n (rest nums) res [] x (first nums)]
            (if (> (mod x 2) 0)
               res
               (recur (rest n) (conj res x) (first n))))
      ))

(take-while-vals "neg?" [-1 -2 0 -1 2 3])
(take-while-vals "odd?" [1 3 4 5 6 7]) 
(take-while-vals "pos?" [1 -1 2 -2])
(take-while-vals "even?" [1 2 3 4]) 



