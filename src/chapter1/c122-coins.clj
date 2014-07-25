(ns chapter1.c122-coins
  (:require [clojure.java.io :as io])
  (:gen-class :main true))

(defn count-change [amount]
  (cc amount 5))

(defn cc [amount kinds-of-coins]
  (cond (= amount 0) 1
        (or (< amount 0) (= kinds-of-coins 0)) 0
        :else (+
               (cc amount (- kinds-of-coins 1))
               (cc (- amount (get first-denomination kinds-of-coins)) kinds-of-coins))))

(def first-denomination
  {
   1 1
   2 5
   3 10
   4 25
   5 50
   })

(count-change 100)
