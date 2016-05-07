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
  [f vals]
  (letfn [(take-while-fun [vals1]
            (take-while f (vec vals1)))
          (drop-while-fun [vals1]
            (drop-while f (vec vals1)))]
         [(take-while-fun vals) (drop-while-fun vals)]))
(def l '(1 1 2 3 3))
(span2 (partial = (first l)) l)
(def ls '(a a a b c c d d))
(span2 (partial = (first ls)) ls) 
(span2 odd? [1 3 2 4 5])
