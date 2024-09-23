# Ring-Swagger-UI

[![Clojars Project](http://clojars.org/metosin/ring-swagger-ui/latest-version.svg)](http://clojars.org/metosin/ring-swagger-ui)

Jar-packaged version of [Swagger-UI](https://github.com/swagger-api/swagger-ui) for ring-based clojure web-apps (and other JVM apps).

## Usage

Add the dependency to your `project.clj` file
and you have full Swagger-UI ready in `/swagger-ui` on classpath.
You can override the `index.html`-page by putting a new page into your local `resources/swagger-ui`-directory.
The default URI for the api-docs is `/api/api-docs` but this can be changed by providing `config.json`.

You might also be interested in [Ring-Swagger](https://github.com/metosin/ring-swagger).
It provides a ring handler (`ring.swagger.ui/swagger-ui`) which can be used to create ring handler to serve the Swagger-ui.
The handler will dynamically serve `config.json` with provided options so you can define api-docs path from Clojure.

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
vim project.clj # Edit version
git add project.clj
diff -u resources/swagger-ui/swagger-initializer.js ext/swagger-ui/dist/swagger-initializer.js
# Fix local index.html
git commit -m "New version"
git tag -a "v2.y.z" -m "v2.y.z"
git push --tags origin master # Push new tags and master
lein do clean, install
```

## License

### Swagger-UI

swagger-ui
Copyright 2020-2021 SmartBear Software Inc.

SwaggerUI is licensed under [Apache 2.0 license](https://github.com/swagger-api/swagger-ui/blob/master/LICENSE).
SwaggerUI comes with an explicit [NOTICE](https://github.com/swagger-api/swagger-ui/blob/master/NOTICE) file
containing additional legal notices and information.

### Versioning

Follows Swagger-UI versions, except if build fix is required, then a build identifier
(.e.g `-1`, starting from 1), can be appended.

### These scripts

Copyright © 2014-2023 [Metosin Oy](http://www.metosin.fi)

Distributed under the Eclipse Public License, the same as Clojure.
