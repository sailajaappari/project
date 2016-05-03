(defn calculator
   "implement function using case stmt"
   [a b f]
   (case f
      "+" (map + a b)
      "-" (map - a b)
      "*" (map * a b)
      "/" (map / a b)
      "default"))

(calculator 10 15 "+")
(calculator 20 23 "-")
(calculator 10 3 "=")
(calculator [1 2 3] [4 5 6] "+")
(calculator [1 2 3] [4 5 6] "/")
