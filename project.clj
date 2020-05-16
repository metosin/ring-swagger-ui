(defproject metosin/ring-swagger-ui "3.25.3"
  :description "Swagger UI for Ring apps"
  :url "https://github.com/metosin/ring-swagger-ui"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"
            :distribution :repo
            :comments "same as Clojure"}
  :resource {:resource-paths ["ext/swagger-ui/dist" "resources/swagger-ui"
                              "ext/swagger-ui/public" "resources/swagger-ui"]
             :target-path "target/resources/swagger-ui"
             :skip-stencil [ #".*" ]
             :includes [#".*/favicon.*\.png"
                        #".*/swagger-ui\.css.*"
                        #".*/swagger-ui-.*\.js.*"
                        #".*/.*\.html"]
             :excludes [#"ext/.*/index\.html"]}
  :resource-paths ["target/resources"]
  :hooks [leiningen.resource]
  :profiles {:dev {:plugins [[lein-resource "17.06.1"]]}})
