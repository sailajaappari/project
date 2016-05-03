(defn find-last-but-one
  "Find the last but one element of a coll"
  [nums]
  (get nums (- (count nums) 2)))
(find-last-but-one [19 16 10 25 26])
(find-last-but-one [])
