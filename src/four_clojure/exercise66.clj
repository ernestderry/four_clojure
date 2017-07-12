(ns four_clojure.exercise66)

(defn hcd [x y] (
    cond 
      (> x y) (hcd (- x y) y)
      (< x y) (hcd (- y x) x)
      :equal x)
  ) 


(println (= 0 (hcd 0 0)))
(println (= 1 (hcd 1 1)))
(println (= 1 (hcd 1 2)))
(println (= 1 (hcd 2 1)))
(println (= 2 (hcd 2 2)))
(println (= 2 (hcd 4 2)))
(println (= 2 (hcd 2 4)))
(println (= 4 (hcd 12 4)))

(hcd 123234930 34534220)


