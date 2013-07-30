(ns adventures.main
  (:require [ring.adapter.jetty :refer [run-jetty]]
            [clojure.tools.nrepl.server :as nrepl]
            [adventures.core :as core]
            [ring.util.response :refer [response]]))

(defn handler [req]
  (response (core/horse-shakespeare)))

(defn -main []
  (nrepl/start-server :port 7888)
  (run-jetty #'handler {:port (Integer/parseInt (System/getenv "PORT")) :join? false}))
