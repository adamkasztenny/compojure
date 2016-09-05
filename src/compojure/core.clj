(ns compojure.core
  (:require [compojure.player.atonal :as atonal])
  (:gen-class))

(defn -main
  "Parses command line args and runs a player"
  [& args]

  (when (empty? args)
    (println "Specify a player")
    (System/exit 0))

  (if (= (first args) "atonal")
    (atonal/play)
  )

)
