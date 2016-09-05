(ns compojure.player.tonal 
  (:require [compojure.player.random :as random])
  (:require [compojure.music.constants :as constants]))

(defn play []
  (println "Starting tonal composition")
  (random/playRandomSequence constants/c true)
  (random/addExtraVoice random/playRandomSequence constants/c) 
)
