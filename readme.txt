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
- JUnit Platform (JUnit 5)
- Navegador: Google Chrome

----------------------------------------------------
CONFIGURACIÓN PREVIA
----------------------------------------------------
1. Tener instalado Java JDK 17 y configurado JAVA_HOME
2. Tener Google Chrome instalado
3. Clonar el repositorio del proyecto

----------------------------------------------------
CONFIGURACIÓN DEL DRIVER
----------------------------------------------------
- El WebDriver (ChromeDriver) es gestionado automáticamente por Serenity BDD
  mediante la propiedad `webdriver.autodownload=true` definida en serenity.conf.
- No es necesario instalar ni configurar WebDriverManager manualmente.

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

Reporte Cucumber (JSON / HTML / XML):
build/cucumber-report/

----------------------------------------------------
OBSERVACIONES
----------------------------------------------------
- El proyecto utiliza el patrón Screenplay para una mejor mantenibilidad
- Los datos del checkout se leen desde un archivo JSON externo
- Los reportes de Serenity se generan automáticamente al finalizar la ejecución

