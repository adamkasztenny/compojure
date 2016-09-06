(ns compojure.player.serial 
  (:require [alda.lisp :refer :all])
  (:require [alda.now  :as now])
  (:require [compojure.player.random :as random])
  (:require [compojure.music.constants :as constants])
  (:require [clojure.tools.logging :as log]))

(defn serial [notes & [tonal]] ; tonal is just thrown away here, of course! 
  (log/info "Starting voice")
  (def currentTempo (rand 240))
  (log/info (str "Using tempo " currentTempo))
  (tempo! currentTempo)
  
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
  (log/info "Starting serial composition")
  (serial constants/notes)
  (random/addExtraVoice serial constants/notes) 
)
