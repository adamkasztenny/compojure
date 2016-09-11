(ns compojure.core
  (:require [compojure.player.atonal :as atonal])
  (:require [compojure.player.tonal :as tonal])
  (:require [compojure.player.serial :as serial])
  (:gen-class))

(def usage (str "\nUSAGE: compojure player\nwhere player is tonal, atonal, serial"))

(defn runPlayer [player]
  (if (= player "atonal")
    (atonal/play)
  )

  (if (= player "serial")
    (serial/play)
  )

  (if (= player "tonal")
    (tonal/play)
  )
)

(defn -main [& args]
  (when (empty? args)
    (println "Specify a player")
	(println usage)
    (System/exit 1))
  
  (doseq [player args] (runPlayer player))
)
