(defn drop-vals
  "To implement drop function"
  [x nums]
  (loop [nums1 nums res [] cnt 0]
    (if (>= cnt (count nums))
       res
       (if (< cnt x)
          (recur (rest nums1) res (inc cnt))
          (recur (rest nums1) (conj res (first nums1)) (inc cnt))))))
(drop-vals 3 [1 2 3 4 5 6 7])
(drop-vals 2 [])


