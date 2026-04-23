Cómo ejecutar el proyecto Factory Method en Java

1. Abrir una terminal y ubicarse en la carpeta `src` del proyecto:
   cd src

2. Compilar todos los archivos Java:
   javac refactoring_guru/factory_method/example/**/*.java

3. Ejecutar el programa principal:
   java refactoring_guru.factory_method.example.Demo

4. (Opcional) Cambiar la implementación en `Demo.java`:

* Usar HTML:
  dialog = new HtmlDialog();

* Usar Windows:
  dialog = new WindowsDialog();

5. Volver a compilar y ejecutar después de cualquier cambio:
   javac refactoring_guru/factory_method/example/**/*.java
   java refactoring_guru.factory_method.example.Demo

Ejemplo tomado de: https://refactoring.guru/es/design-patterns/factory-method/java/example
