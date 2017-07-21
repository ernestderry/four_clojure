(ns four_clojure.exercise90)

(into #{} (for [x #{1 2 3 4 5} y #{7 8 9 10}] 
  [x y]))

(defn cartisean [s1 s2] (set (for [x s1 y s2] [x y])))

(cartisean (range 3) (range 3))
