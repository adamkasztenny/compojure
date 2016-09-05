(ns compojure.core
  (:require [compojure.player.atonal :as atonal])
  (:require [compojure.player.tonal :as tonal])
  (:require [compojure.player.serial :as serial])
  (:gen-class))

(def usage (str "\nUSAGE: compojure player\nwhere player is tonal, atonal, serial"))

(defn -main
  "Parses command line args and runs a player"
  [& args]

  (when (empty? args)
    (println "Specify a player")
	(println usage)
    (System/exit 1))

  (if (some #{"atonal"} args)
    (atonal/play)
  )

  (if (some #{"serial"} args)
    (serial/play)
  )

  (if (some #{"tonal"} args)
    (tonal/play)
  )
)
