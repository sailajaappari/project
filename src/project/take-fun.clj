(defn take-vals
  "Implement take function"
  [x nums]
  (loop [nums1 nums res [] cnt 0]
    (if (>= cnt (count nums))
       res
       (if (>= cnt x)
         (recur (rest nums1) res (inc cnt))
         (recur (rest nums1) (conj res (first nums1)) (inc cnt))))))

(take-vals 3 [1 2 3 4 5 6])
(take-vals 4 [-1 -2 -3 0 1 2 3])
(take-vals 2 [])

