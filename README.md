# ring-swagger-ui

Packaged version of Swagger-UI for ring-based clojure apps.

## Usage

FIXME

### Init
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

## License

Copyright © 2014 Metosin Oy

Distributed under the Eclipse Public License, the same as Clojure.
