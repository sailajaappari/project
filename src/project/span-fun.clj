(defn span
  "Divide the vector into two list at predicate"
  [x nums]
  (split-at x nums))
(span 2 [1 2 3 4 1 2 3 4]) 
(span 9 [1 2 3])
(span 0 [1 2 3])


(defn span1 
  [x nums]
  (split-with (partial > (second x)) nums))

(span1 '(< 3) [1 2 3 4 1 2 3 4]) 
(span1 '(< 9) [1 2 3])
(span1 '(< 0) [1 2 3])
(span1 '(< 0) [-1 2 3 -2])



(defn span2
  [vals]
  (letfn [(take-while-fun [vals1]
            (take-while (partial = (first (vec vals1))) (vec vals1)))
          (drop-while-fun [vals1]
            (drop-while (partial = (first (vec vals1))) (vec vals1)))]
         [(take-while-fun vals) (drop-while-fun vals)]))
(span2 '(1 1 2 3 3))
(span2 '(a a a b c c d d))
