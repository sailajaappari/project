
(defn drop-while-vals
  "Implement drop-while function "
  [f nums]
  (loop [nums1 nums res [] cnt 0]
    (if (>= cnt (count nums))
       (apply concat (list res))
       (if (f (first nums1))
          (recur (rest nums1) res (inc cnt))
          (conj res nums1)))))
(drop-while-vals neg? [-1 -2 0 1 2 3])
(drop-while-vals pos? [1 -2 3]) 
(drop-while-vals even? [2 4 1 2 3 0])
(drop-while-vals odd? [1 2 4 5])
(drop-while-vals odd? [])

