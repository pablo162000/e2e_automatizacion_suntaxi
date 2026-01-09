AUTOMATIZACIÓN E2E – SERENITY BDD

Autor: Pablo Suntaxi
Proyecto: Flujo de compra E2E – Saucedemo
Repositorio: (URL del repositorio GitHub)

----------------------------------------------------
DESCRIPCIÓN
----------------------------------------------------
Este proyecto contiene una prueba automatizada End-to-End (E2E) del flujo de
compra en la página https://www.saucedemo.com, implementada con Serenity BDD
utilizando el patrón Screenplay y Cucumber.

----------------------------------------------------
TECNOLOGÍAS UTILIZADAS
----------------------------------------------------
- Java JDK: 17
- Gradle: 7.6.1
- Serenity BDD: 4.0.46
- Serenity Cucumber: 4.0.46
- JUnit: 4.13.2
- WebDriverManager: 5.9.2
- Navegador: Google Chrome

----------------------------------------------------
CONFIGURACIÓN PREVIA
----------------------------------------------------
1. Tener instalado Java JDK 17 y configurado JAVA_HOME
2. Tener Google Chrome instalado
3. Clonar el repositorio del proyecto

----------------------------------------------------
EJECUCIÓN DE LAS PRUEBAS
----------------------------------------------------
Desde la raíz del proyecto ejecutar el siguiente comando
utilizando Gradle Wrapper, según el sistema operativo:

Windows (PowerShell):
> .\gradlew clean test

Linux / macOS:
> ./gradlew clean test

Este comando:
- Limpia ejecuciones anteriores
- Ejecuta el escenario automatizado
- Genera el reporte Serenity

----------------------------------------------------
REPORTES
----------------------------------------------------
Reporte Serenity (principal):
target/site/serenity/index.html

Reporte Cucumber (JSON):
build/cucumber-report/cucumber.json

----------------------------------------------------
OBSERVACIONES
----------------------------------------------------
- Los datos del checkout se leen desde un archivo JSON externo
- El WebDriver se gestiona automáticamente con WebDriverManager
