(ns chapter1.c116
  (:require [clojure.java.io :as io])
  (:gen-class :main true))

(defn abs
  [n]
  (cond (> n 0) n
        (= n 0) 0
        (< n 0) (- n)))

(defn abs2
  [n]
  (cond (< n 0) (- n)
        :else n))

(defn abs3
  [n]
  (if (< n 0) (- n)
        n))

(defn gte [x y]
  (or (> x y) (= x y)))

(defn -main
  [& args]
  (println (str "10 >= 5 == " (gte (10 5))))
  (println (str "Absolute of -5 is: " (abs3 (- 5)))))