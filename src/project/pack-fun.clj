(defn pack1
  "Pack consecutive duplicates of list elements into sublist"
  [ls]
  (partition-by identity (apply vector ls)))
(pack1 '(a a a a b c c a a d e e e e)) 



(defn span
  [vals]
  (if (empty? vals)
    []
    (letfn [(take-while-fun [vals1]
              (take-while (partial = (first (vec vals1))) (vec vals1)))
            (drop-while-fun [vals1]
              (drop-while (partial = (first (vec vals1))) (vec vals1)))]
           [(take-while-fun vals) (drop-while-fun vals)])))

(defn pack 
  [nums]
  (loop [nums1 nums
         res []]
        (if (empty? nums1)
           res
           (recur (rest (span nums1)) (conj res (first (span nums1)))))))
(pack '(a a a b c c d a a e e e))



