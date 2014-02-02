(defproject metosin/ring-swagger-ui "2.0.4"
  :description "Swagger-UI for Ring apps"
  :url "https://github.com/metosin/ring-swagger-ui"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"
            :distribution :repo
            :comments "same as Clojure"}
  :resource {:resource-paths ["ext/swagger-ui/dist" "resources/swagger-ui"]
             :target-path "target/resources/swagger-ui"
             :excludes [#"ext/swagger-ui/dist/index\.html" #".*\.DS_Store"]}
  :resource-paths ["target/resources"]
  :hooks [leiningen.resource]
  :profiles {:dev {:plugins [[lein-clojars "0.9.1"]
                             [lein-resource "0.3.3"]]}})
