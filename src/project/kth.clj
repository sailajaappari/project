(defn find-kth
  "find kth element of a list with out recursion "
  [nums x]
  (get nums x))

(find-kth [10 12 14 25 20 15 18] 3)
(find-kth [10 12 5] 3)


