(defn inc-more [nums]
   (if (first nums)
       (cons (inc (first nums)) (inc-more (rest nums)))
       nums))
(inc-more [1 2 3 4])


(defn generalize-all [f vals]
   (if (first vals)
       (cons (f (first vals)) (generalize-all f (rest vals)))
       vals))
(generalize-all inc [1 2 3]) 
(generalize-all keyword ["a" "b"])
(generalize-all list [:a :b :c])

(defn expand [f x cnt]
  (if (pos? cnt)
      (cons x (expand f (f x) (dec cnt)))))
(expand inc 0 10)

(= (take 10 (iterate inc 0)) (range 10))
(take 10 (iterate (fn [x] (if (odd? x) (+ x 1) (/ x 2))) 20))
(= (take 3 (repeat "hi")) '("hi" "hi" "hi"))
(= (range 5 20 5) '(5 10 15))
(take 3 (repeatedly rand))
(take 10 (cycle '(1 2 3)))

(map (fn [x val] (str x " : " val))
     [2 4 0]
     ["cars" "bikes" "aeroplane"])
(map + [1 2 3] [4 5 6] [7 8])
(map (fn [i x] (str i ":" x))
     (iterate inc 0)
     ["Lisp" "Clojure" "Python"])
(map-indexed (fn [i x] (str i ":" x)) ["Lisp" "Clojure" "Python"])
(interleave [:a :b :c] [1 2 3])
(interpose "and" [1 2 3])
(apply str (reverse "master"))
(apply str (shuffle (seq "master")))

