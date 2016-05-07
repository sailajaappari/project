
(defn take-while-vals
  "Implement take-while function"
  [f nums]
  (if (empty? nums)
    '()
    (loop [nums1 nums res []]
     (if-not (f (first nums1))
        (apply concat (list res))
        (recur (rest nums1) (conj res (first nums1)))))))

(take-while-vals neg? [-1 -2 0 -1 2 3])
(take-while-vals odd? [1 3 4 5 6 7]) 
(take-while-vals pos? [1 -1 2 -2])
(take-while-vals even? [1 2 3 4]) 
(take-while-vals odd? [])




