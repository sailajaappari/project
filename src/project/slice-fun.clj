(defn slice
   "Slice is the list containing the elements between the ith and kth element of the original list including both limits"
   [vals x y]
   (take (- y (- x 1)) (drop (- x 1) vals)))

(slice '(a b c d e f g h i j k) 3 7)
(slice [1 2 3 4 5 6 7 8 9] 5 8)
