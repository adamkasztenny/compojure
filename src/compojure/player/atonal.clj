(ns compojure.player.atonal 
  (:require [compojure.player.random :as random])
  (:require [compojure.music.constants :as constants])
  (:require [clojure.tools.logging :as log]))

(defn play [] 
  (log/info "Starting atonal composition")
  (random/playRandomSequence constants/notes)
  (random/addExtraVoice random/playRandomSequence constants/notes) 
)
