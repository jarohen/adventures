(ns adventures.core
  (:require [clojure.java.io :as io]
            [clojure.string :as s]))

(defn list-files [dir]
  (file-seq dir))

(def plays (map slurp (list-files (io/file "data"))))

(defn split-into-words [play]
  (map (fn [line]
         (s/split line #"\s+"))
       (s/split-lines play)))

(defn split-line-into-half [line]
  (split-at (/ (count line) 2) line))

(split-into-words "Shall I compare thee to a summer's day?\nThou art more lovely and more temperate")

(defn half-lines [play]
  (mapcat split-line-into-half
          (split-into-words play)))
 
(defn random-line [half-lines]
  (rand-nth half-lines) (rand-nth))
