;;subsequences
(= (take 3 (range 10)) '(0 1 2))
(= (drop 3 (range 5)) '(3 4))
(= (take-last 3 (range 10)) '(7 8 9))
(= (drop-last 3 (range 5)) '(0 1))
(take-while pos? [3 2 1 0 -1 -2 -3])
(= (filter even? (range 10)) '(0 2 4 6 8))
(= (remove even? (range 10)) '(1 3 5 7 9))
(partition 2 [1 2 3 4 5 6 7])
(partition 4 5 (range 16))
(partition-by even? [1 1 2 3 4 6 7 9])
(= (reduce + 10 [1 2 3 4]) 20)
(reductions + 10 [1 2 3 4])
(filter (fn [n] (if (= (rem n 2) 0) n)) (range 10))
(take 10 (filter odd? (iterate inc 0)))
(take 3 (partition 2 (filter even? (iterate inc 0))))
(take 3 (partition 2 3 (filter even? (iterate inc 0))))
(take 3 (map (fn [coll] (* (first coll) (second coll))) (partition 2 (filter odd? (iterate inc 0)))))
(reduce + (take 3 (map (fn [coll] (* (first coll) (second coll))) (partition 2 (filter odd? (iterate inc 0))))))






