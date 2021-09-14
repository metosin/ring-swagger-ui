echo "Remove source maps"
sed -i -e '/\/\*# sourceMappingURL.*/d' target/resources/swagger-ui/swagger-ui.css
sed -i -e '/\/\/# sourceMappingURL.*/d' target/resources/swagger-ui/swagger-ui-bundle.js
sed -i -e '/\/\/# sourceMappingURL.*/d' target/resources/swagger-ui/swagger-ui-es-bundle-core.js
sed -i -e '/\/\/# sourceMappingURL.*/d' target/resources/swagger-ui/swagger-ui-es-bundle.js
sed -i -e '/\/\/# sourceMappingURL.*/d' target/resources/swagger-ui/swagger-ui-standalone-preset.js
