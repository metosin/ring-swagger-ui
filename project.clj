(defproject metosin/ring-swagger-ui "5.33.0"
  :description "Swagger UI for Ring apps"
  :url "https://github.com/metosin/ring-swagger-ui"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"
            :distribution :repo
            :comments "same as Clojure"}
  ;; CI (.github/workflows/release.yml) sets CLOJARS_USERNAME and
  ;; CLOJARS_PASSWORD; locally ~/.lein/credentials.clj.gpg still works.
  :deploy-repositories [["clojars" {:sign-releases false
                                    :username [:env/clojars_username :gpg]
                                    :password [:env/clojars_password :gpg]}]]
  :resource {:resource-paths ["ext/swagger-ui/dist"
                              "resources/swagger-ui"]
             :target-path "target/resources/swagger-ui"
             :skip-stencil [#".*"]
             :includes [#".*/favicon.*\.png"
                        #".*/swagger-ui\.css.*"
                        #".*/index\.css"
                        #".*/swagger-ui-.*\.js.*"
                        #".*/swagger-initializer\.js"
                        #".*/oauth2-redirect\.js"
                        #".*/.*\.html"]
             :excludes [#"ext/.*/swagger-initializer\.js"]}
  :resource-paths ["target/resources" "resources-graalvm"]
  :hooks [leiningen.resource]
  :profiles {:dev {:plugins [[lein-resource "17.06.1"]]}})
