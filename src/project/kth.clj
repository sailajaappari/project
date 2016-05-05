(defn find-kth
  "find kth element of a list with out recursion "
  [nums x]
  (if (< (count nums) x)
     nil
     (first (subvec nums x))))

(find-kth [10 12 14 25 20 15 18] 3)
(find-kth [10 12 5] 3)


