(ns four_clojure.exercise99)

(defn prodDigit [a b] 
  (let [product (* a b)] 
    (loop [p product result []]
      (if (< p 10)
        (cons p result)
        (recur (int (/ p 10)) (cons (mod p 10) result))))))





(println (= [1] (prodDigit 1 1)))
(println (= [1 0] (prodDigit 1 10)))
(println (= [4 0 9 6] (prodDigit 64 64)))




