(ns chapter1.c116
  (:require [clojure.java.io :as io])
  (:gen-class :main true))

(defn abs
  [n]
  (cond (> n 0) n
        (= n 0) 0
        (< n 0) (- n)))

(defn -main
  [& args]
  (println (str "Absolute of -5 is: " (abs (- 5)))))