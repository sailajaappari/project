(defn rotate
  "Rotate a list n places to the left"
  [vals n]
  (concat (drop n vals) (take n vals)))
(rotate '(a b c d e f g h) 3) 
(rotate [1 2 3 4 5 6 7 8] 4)
(rotate (range 1 100) 25)
