(ns chapter1.c118
  (:require [clojure.java.io :as io])
  (:gen-class :main true))

(defn abs [n]
  (if (< n 0) (- n)
    n))

(defn square [x]
  (* x x))

(defn average [x y]
  (/ (+ x y) 2))

(defn sqrt [x]
  (defn good-enough? [guess]
    (< (abs (- (square guess) x)) 0.001))
  (defn improve [guess]
    (average guess (/ x guess)))
  (defn sqrt-iter [guess]
    (if (good-enough? guess)
        guess
        (sqrt-iter (improve guess))))
  (sqrt-iter 1.0))

(defn -main [& args]
  (println "hello world!")
  (println (str "Square root of 81 is: " (sqrt 81))))

(str "Square root of 81 is: " (sqrt 81))
