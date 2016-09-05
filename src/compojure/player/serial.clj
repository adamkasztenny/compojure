(ns compojure.player.serial 
  (:require [alda.lisp :refer :all])
  (:require [alda.now  :as now])
  (:require [compojure.player.random :as random])
  (:require [compojure.music.constants :as constants]))

(defn serial [notes] 
  (tempo! (rand 220)) 
  
  (def noteOrder (shuffle notes))

  (def notesWithLengths (for [n noteOrder]
    (note n (duration (note-length (random/randomNoteLength))))
  ))

  (now/play!
    (part (random/randomInstrument)
          (take (rand 300) (cycle notesWithLengths))
  ))
)

(defn play [] 
  (println "Starting serial composition")
  (serial constants/notes)
  (random/addExtraVoice serial constants/notes) 
)
