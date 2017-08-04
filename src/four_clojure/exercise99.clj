(ns four_clojure.exercise99)

(defn prodDigit [a b] 
  (let [product (* a b)] 
    (loop [p product result []]
      (if (< p 10)
        (cons p result)
        (recur (int (/ p 10)) (cons (mod p 10) result))))))


(defn prodDigit2 [a b] 
  (map #(Character/digit % 10) (seq (str (* a b)))))

(defn prodDigit3 [a b] (map #(Integer/parseInt (str %)) (seq (str (* a b)))))

(println (= [1] (prodDigit3 1 1)))
(println (= [1 0] (prodDigit3 1 10)))
(println (= [4 0 9 6] (prodDigit3 64 64)))

