(defn span
  "Divide the vector into two list at predicate"
  [x nums]
  (split-at x nums))
(span 2 [1 2 3 4 1 2 3 4]) 
(span 9 [1 2 3])
(span 0 [1 2 3])
