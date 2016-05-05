(defn pack
  "Pack consecutive duplicates of list elements into sublist"
  [ls]
  (partition-by identity (apply vector ls)))
(pack '(a a a a b c c a a d e e e e)) 

