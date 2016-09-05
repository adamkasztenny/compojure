(ns compojure.player.random
  (:require [alda.lisp :refer :all])
  (:require [alda.now  :as now])
  (:require [compojure.music.constants :as constants]))

(defn randomNoteLength [] (rand-nth constants/noteLengths))

(defn randomOctave [] (rand-nth [(:octave :up) (:octave :down)]))

(defn randomInstrument [] (rand-nth constants/instruments))

(defn playRandomSequence [notes]
  (tempo! (rand 220)) 
  
  (defn randomNote [] (rand-nth notes))
  (defn randomPlayedNote [] (note (randomNote) (duration (note-length (randomNoteLength)))))

  (now/play!
    (part (randomInstrument) 
          (take (rand 300) (repeatedly #(randomPlayedNote)))
  ))
)

(defn addExtraVoice [f notes]
  (loop []
  (Thread/sleep (* 1000 (rand 300)))
  (if (< 5 (rand 10)) (f notes)) (recur))
)
