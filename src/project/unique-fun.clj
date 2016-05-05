(defn unique
  "Eliminate consecutive duplicates of list"
   [ls]
   (map first (partition-by identity (apply vector ls))))
(unique '(a a a b c c a a d e e e e)) 
