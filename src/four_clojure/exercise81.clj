(ns four_clojure.exercise81)

(defn set-inter [a b]
  (set (filter #(b %) a))
  )

(println (= #{} (set-inter #{} #{})))
(println (= #{1} (set-inter #{1} #{1})))
(println (= #{1 2} (set-inter #{1 2} #{1 2})))
(println (= #{1 2} (set-inter #{1 2} #{1 2 3})))
(println (= #{1 2} (set-inter #{1 2 3} #{1 2})))
(println (= #{9 3} (set-inter #{3 9 1 5 7 8} #{4 3 10 9 0})))
(println (= #{3 9} (set-inter #{3 9 1 5 7 8} #{4 3 10 9 0})))


