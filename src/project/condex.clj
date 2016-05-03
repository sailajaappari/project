(defn grade
  "To implement function using cond"
  [marks]
  (cond
    (>= marks 90) "A grade"
    (>= marks 80) "B grade"
    (>= marks 70) "C grade"
    (>= marks 60) "D grade"
    (>= marks 50) "E grade"
    :else "fail"))

(grade 93)
(grade 87)
(grade 60)
(grade 45)
