(ns compojure.player.tonal 
  (:require [compojure.player.random :as random])
  (:require [compojure.music.constants :as constants])
  (:require [clojure.tools.logging :as log]))

(defn play []
  (log/info "Starting tonal composition")
  (random/playRandomSequence constants/c true)
  (random/addExtraVoice random/playRandomSequence constants/c true) 
)
