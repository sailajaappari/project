(defn take-vals
  "Implement take function"
  [nums x]
  (loop [res [] cnt 0]
    (if (or (= cnt x) (= (count nums) 0))
       res
       (recur (conj res (get nums cnt)) (inc cnt)))))

(take-vals [1 2 3 4 5 6] 3)
(take-vals [-1 -2 -3 0 1 2 3] 4)
(take-vals [] 2)

