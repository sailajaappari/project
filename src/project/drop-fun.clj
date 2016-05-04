(defn drop-vals
  "To implement drop function"
  [nums x]
  (loop [res [] cnt x]
     (if (>= cnt (count nums))
        res
        (recur (conj res (get nums cnt)) (inc cnt)))))
(drop-vals [1 2 3 4 5 6 7] 3)

(drop-vals [] 2)


