(defproject compojure "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "GNU GPL v2"
            :url "https://www.gnu.org/licenses/gpl-2.0.txt"}
  :dependencies [[org.clojure/clojure "1.8.0"] [alda "1.0.0-rc34"] [org.clojure/tools.logging "0.2.3"]]
  :main ^:skip-aot compojure.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
