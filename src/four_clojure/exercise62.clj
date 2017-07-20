(ns four_clojure.exercise62)

(defn reimp-iterate [f a]
    (lazy-seq (cons a (reimp-iterate f (f a)))))

