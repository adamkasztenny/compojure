(ns compojure.player.random
  (:require [alda.lisp :refer :all])
  (:require [alda.now  :as now])
  (:require [compojure.music.constants :as constants]))

(defn randomNoteLength [] (rand-nth constants/noteLengths))

(defn randomOctave [] (rand-nth [(:octave :up) (:octave :down)]))

(defn randomInstrument [] (rand-nth constants/instruments))

(defn playRandomSequence [notes] 
  (def time (randomNoteLength))
  (def instrument (randomInstrument))
  
  (defn randomNote [] (rand-nth notes))
  (defn randomPlayedNote [] (note (randomNote) (duration (note-length time))))
  
  (now/play!
    (part instrument 
          (take (rand 300) (repeatedly #(randomPlayedNote)))
  ))
)
