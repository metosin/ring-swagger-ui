(defproject metosin/ring-swagger-ui "2.0.16-1"
  :description "Swagger UI for Ring apps"
  :url "https://github.com/metosin/ring-swagger-ui"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"
            :distribution :repo
            :comments "same as Clojure"}
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [ring/ring-core "1.2.2"]
                 [clout "1.1.0"]]
  :resource {:resource-paths ["ext/swagger-ui/dist" "resources/swagger-ui"]
             :target-path "target/resources/swagger-ui"
             :skip-stencil [ #".*/images/.*" ]
             :excludes [#"ext/swagger-ui/dist/index\.html" #".*\.DS_Store"]}
  :resource-paths ["target/resources"]
  :hooks [leiningen.resource]
  :profiles {:dev {:dependencies [[midje "1.6.3"]]
                   :plugins [[lein-clojars "0.9.1"]
                             [lein-resource "0.3.3"]]}})
