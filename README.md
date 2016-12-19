# Ring-Swagger-UI

[![Clojars Project](http://clojars.org/metosin/ring-swagger-ui/latest-version.svg)](http://clojars.org/metosin/ring-swagger-ui)

Jar-packaged version of [Swagger-UI](https://github.com/wordnik/swagger-ui) for ring-based clojure web-apps (and other JVM apps).

## Usage

Add the dependency to your `project.clj` file
and you have full Swagger-UI ready in `/swagger-ui` on classpath.
You can override the `index.html`-page by putting a new page into your local `resources/swagger-ui`-directory.
The default URI for the api-docs is `/api/api-docs` but this can be changed by copying `resources/swagger-ui/conf.js` to your projects
resources dir and editing it.

You might also be interested in [Ring-Swagger](https://github.com/metosin/ring-swagger).
It provides a ring handler (`ring.swagger.ui/swagger-ui`) which can be used to create ring handler to serve the Swagger-ui.
The handler will dynamically serve `conf.js` with provided options so you can define api-docs path from Clojure.

## Usage

Example using [Compojure-api](https://github.com/metosin/compojure-api) and setting custom urls for swagger-docs and swagger-ui.
```Clojure
(defapi app
  (ring.swagger.ui/swagger-ui
    "/swagger-ui"
    :swagger-docs "/swagger-docs")
  (compojure.api.swagger/swagger-docs
    "/swagger-docs"
    :title "Sample Api"
    :description "Compojure Api sample application")
  ...)
```

## Packaging

### Initialize the submodules
```Shell
git submodule init
git submodule update
```

### New swagger-ui version
```Shell
pushd ext/swagger-ui
git fetch
git checkout <new tag>
popd
git add ext/swagger-ui # Update submodule to point into new swagger-ui
vim project.clj README.md # Edit version
git add project.clj README.md
diff -u resources/swagger-ui/index.html ext/swagger-ui/dist/index.html
# Fix local index.html
git commit -m "New version"
git tag -a "v2.y.z" -m "v2.y.z"
git push --tags origin master # Push new tags and master
lein do clean, install
```

## License

### Swagger-UI

Copyright 2016 SmartBear Software

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at [apache.org/licenses/LICENSE-2.0](http://www.apache.org/licenses/LICENSE-2.0)

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.

### Versioning

Follows Swagger-UI versions, except if build fix is required, then a build identifier
(.e.g `-1`, starting from 1), can be appended.

### These scripts

Copyright © 2014-2015 [Metosin Oy](http://www.metosin.fi)

Distributed under the Eclipse Public License, the same as Clojure.
