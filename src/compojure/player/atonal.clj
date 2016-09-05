(ns compojure.player.atonal 
  (:require [compojure.player.random :as random])
  (:require [compojure.music.constants :as constants]))

(defn play [] 
  (random/playRandomSequence constants/notes)  
)
