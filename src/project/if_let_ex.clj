(defn sum-even-numbers 
  [nums]
  (if-let [nums (seq (filter even? nums))]
     (reduce + nums)
     "Even numbers not found"))
(sum-even-numbers (range 10))
(sum-even-numbers [1 3 5])


(defn ex [val]
  (if-let [arg val]
     "true"
     "false"))
(ex 10)
(ex nil)
(ex 0)

