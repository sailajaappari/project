(defn span
  "Split the list into two sublists with pred"
  [vals1]
  (letfn [(take-while-fun [vals]
            (take-while (partial = (first (vec vals))) (vec vals)))
          (drop-while-fun [vals]
            (drop-while (partial = (first (vec vals))) (vec vals)))]
         [(take-while-fun vals1) (drop-while-fun vals1)]))
(defn pack 
  "Pack consecutive duplicates of list elements into sublists"
  [nums]
  (loop [nums1 nums
         res []]
        (if (= (count nums1) 0)
           res
           (recur (apply concat (rest (span nums1))) (conj res (first (span nums1)))))))

(pack '(a a a a b c c a a d e e e))
(defn unique
  "Eliminate consecutive duplicates of list"
   [ls]
   (map first (pack ls)))
(unique '(a a a b c c a a d e e e e))



(defn compress
  "consecutive duplicates of elements are encoded as lists (n e) n is no.of duplicates of the element e"
  [vals]
  (map #(list (count %) (first %)) (pack vals)))
(compress '(a a a b c c a d d e e e e))
