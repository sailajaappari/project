(defn find-last
  "Find the last element of a collection" 
  [nums]
  (get nums (- (count nums) 1)))
(find-last [10 13 12 25 26 20])
(find-last [1 2 3 4 5])

 
