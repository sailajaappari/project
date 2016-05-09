(defn duplicate
   "Duplicate the elements if a list"
   [vals]
   (interleave vals vals))
(duplicate '(a b c c d)) 
(duplicate [1 2 3 4])
