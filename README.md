# serenity-cucumber-archetype









## 🧪 Ejecutar validación de Gherkin

Haz clic en el botón para correr la validación de los archivos `.feature`:

``````
mvn clean verify -Dcucumber.filter.tags=@CompleteLoginSuccessful -Dcucumber.features=src/test/resources/features/Login/Login.feature

