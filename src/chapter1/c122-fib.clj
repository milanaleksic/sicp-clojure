(ns chapter1.c122-fib
  (:require [clojure.java.io :as io])
  (:gen-class :main true))

; tree recursion process
(defn fib [n]
  (cond (= n 1) 1
    (= n 0) 0
    :else (+ (fib (- n 2)) (fib (- n 1)))))

; iterative process
(defn fib2 [n]
  (defn fib-iter [a b count]
    (if (= count 0)
      b
      (fib-iter (+ a b) a ( - count 1))))
  (fib-iter 1 0 n))

(fib 28)
(fib2 28)
