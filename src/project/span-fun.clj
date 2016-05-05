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
