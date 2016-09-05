(ns compojure.player.random
  (:require [alda.lisp :refer :all])
  (:require [alda.now  :as now])
  (:require [compojure.music.constants :as constants])
  (:require [clojure.tools.logging :as log]))

(defn randomNoteLength [] (rand-nth constants/noteLengths))

(defn randomOctave [] (rand-nth [(:octave :up) (:octave :down)]))

(defn randomInstrument [] (rand-nth constants/instruments))

(defn randomKeySignature [] 
  (def keySignature (key-signature [(rand-nth constants/keySignatures) 
                                    (if (< 5 (rand 10)) (rand-nth [:flat :sharp])) 
                                    (rand-nth [:minor :major])]))
  (log/info (str "Using key signature " keySignature))
  keySignature
)

(defn playRandomSequence [notes & [tonal]]
  (log/info "Starting voice")
  (def currentTempo (rand 240))
  (log/info (str "Using tempo " currentTempo))
  (tempo! currentTempo) 
 
  (def lengthSubset (take (rand 3) (repeatedly #(randomNoteLength))))

  (defn randomChosenNote [] 
    (if (< 7 (rand 10)) (randomNoteLength) (rand-nth lengthSubset)))

  (defn randomNote [] (rand-nth notes))
  (defn randomPlayedNote [] (note (randomNote) (duration (note-length (randomChosenNote)))))

  (defn randomEvent [] (if (< 5 (rand 10)) (randomPlayedNote) (randomOctave)))

  (now/play!
    (part (randomInstrument) 
    (if tonal (randomKeySignature))
          (take (rand 500) (repeatedly #(randomEvent)))
)))

(defn addExtraVoice [f notes]
  (loop []
  (Thread/sleep (* 1000 (rand 200)))
  (if (< 5 (rand 10)) (f notes)) (recur))
)
