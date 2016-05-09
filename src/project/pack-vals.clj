(defn drop-false-case
   [f1 nums2]
   (loop [vals nums2
          res []]
     (if (= (count vals) 0) 
        (apply concat (list res)) 
        (if (not  (f1 (first vals)))
          (recur (rest vals) res)
          (apply concat (apply concat (list (conj res vals))))))))


(defn take-false-case
   [f1 nums2]
   
   (loop [vals nums2
          res []]
     (if (= (count vals) 0)
        (apply concat (list res ))
        (if (f1 (first vals)) 
          (apply concat (list res))
          (recur (rest vals) (conj res (first vals)))))))
(defn pack
   "Pack consecutive duplicates of list elements into sublist"
   [f nums]
   (if (empty? nums)
     []
     (loop [nums1 nums
            res []]
        (if (= (count nums1) 0)
          res
          (if (f (first nums1))
            (recur (drop-while f nums1) (conj res (take-while f nums1)))
            (recur (drop-false-case f nums1) (conj res (take-false-case f nums1))))))))
(pack even? [1 3 5 2 3 4])
(pack odd? [1 2 3 4 5])
(pack odd? [2 4 1 3 5 6 7])


(defn unique
  "Eliminate consecutive duplicates of list"
   [f lst]
   (map first (pack f lst)))
(unique odd? [1 1 3 2 4 5])
(unique odd? [1 3 5 2 3 4])


(defn compress
  [f lst]
  (map #(list (count %) (first %)) (pack f lst)))
(compress odd? [1 3 5 2 3 4])
(compress even? [1 2 4 6 3 4 5 7])

 








