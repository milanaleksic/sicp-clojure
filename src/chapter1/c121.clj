(ns chapter1.c121
  (:require [clojure.java.io :as io])
  (:gen-class :main true))

; linear recursion process
(defn fact [n]
  (if (= 1 n)
    n
    (* n (fact (- n 1)))))

; linear iteration process
(defn fact2 [n]
  (defn fact-iter [product counter max-count]
    (if (> counter max-count)
      product
      (fact-iter (* counter product)
                 (+ counter 1)
                 max-count)))
  (fact-iter 1 1 n))

(fact 20)
(fact2 20)
