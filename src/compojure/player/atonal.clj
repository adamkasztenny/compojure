(ns compojure.player.atonal 
  (:require [compojure.player.random :as random])
  (:require [compojure.music.constants :as constants]))

(defn play [] 
  (println "Starting atonal composition")
  (random/playRandomSequence constants/notes)
  (random/addExtraVoice random/playRandomSequence constants/notes) 
)
