(defproject adventures "0.1.0-SNAPSHOT"
  :repositories {"sonatype-oss-public"
                 "https://oss.sonatype.org/content/groups/public/"}

  :min-lein-version "2.2.0"
  
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [clj-http "0.7.6"]
                 [org.clojure/core.async "0.1.0-SNAPSHOT"]
                 [org.clojure/tools.nrepl "0.2.3"]

                 [ring "1.2.0"]
                 [compojure "1.1.5"]
                 [hiccup "1.0.4"]]

  :main adventures.main)
