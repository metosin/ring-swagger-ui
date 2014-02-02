# ring-swagger-ui

Packaged version of [Swagger-UI](https://github.com/wordnik/swagger-ui) for ring-based clojure web-apps.

## Usage

Add the following dependency to your `project.clj` file:

    [metosin/ring-swagger-ui "2.0.4"]

, and you have full Swagger-UI ready in ```swagger-ui``` on classpath. The default URI for the looked api-docs is ```/api/docs```. You can override the ```index.html```-page by putting a new page into your local ```resources/swagger-ui```-directory.

If you are using Compojure, check out [Compojure-Api](https://github.com/metosin/compojure-api), which has a ready route function for serving the ui. Full working setup can be found from [Compojure-api-examples](https://github.com/metosin/compojure-api-examples).

## Packaging

### Initialize the submodules
```
git submodule init
git submodule update
```

### New swagger-ui version
```
pushd ext/swagger-ui
git fetch
git checkout <new tag>
popd
vim project.clj # Edit version
lein install
```

## TODO

- [ ] Custom API url
- [ ] Update index.html automatically
- [ ] Daily builds (Travis?)

## License

Copyright © 2014 Metosin Oy

Distributed under the Eclipse Public License, the same as Clojure.
