(ns four_clojure.exercise166)

(defn comparison2 [op a b]
  (if (and (not(op a b)) (not(op b a))) 
    :eq
    (if (op a b) :lt :gt)))

(defn comparison [op a b]
  (cond
    (op a b) :lt
    (op b a) :gt
    :else :eq
    ))


(println (= :gt (comparison < 5 1)))
(println (= :lt (comparison < 1 5)))
(println (= :gt (comparison > 1 5)))
(println (= :lt (comparison > 5 1)))
(println (= :eq (comparison < 5 5)))
(println (= :eq (comparison (fn [x y] (< (count x) (count y))) "pear" "plum")))
(println (= :lt (comparison (fn [x y] (< (mod x 5) (mod y 5))) 21 3)))
