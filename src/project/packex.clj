(defn drop-false-case
   [f1 nums2]
   (loop [vals nums2
          res []]
      (if (= (count nums2) 0)
         (apply concat (list res))
         (if (not  (f1 (first vals)))
           (recur (rest vals) res)
           (apply concat (apply concat (list (conj res vals))))))))


(defn take-false-case
   [f1 nums2]
   (loop [vals nums2
          res []]
     (if (= (count vals) 0)
        (apply concat (list res))
        (if (f1 (first vals)) 
          (apply concat (list res))
          (recur (rest vals) (conj res (first vals)))))))
(defn pack
   "Pack consecutive duplicates of list elements into sublist"
   [f nums]
   (loop [nums1 nums
          res []]
      (if (= (count nums1) 0)
         res
         (if (f (first nums1))
            (recur (drop-while f (vec nums1)) (conj res (take-while f (vec nums1))))
            (recur (drop-false-case f (vec nums1)) (conj res (take-false-case f (vec nums1))))))))
(pack even? [1 3 5 2 3 4])
(pack odd? [1 2 3 4 5])


(defn unique
  "Eliminate consecutive duplicates of list"
   [f lst]
   (map first (pack f lst)))
(unique odd? [1 1 3 2 4 5])




