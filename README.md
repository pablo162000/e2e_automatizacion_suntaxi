# Automatización E2E – Serenity BDD

**Autor:** Pablo Suntaxi  
**Proyecto:** Flujo de compra E2E – Saucedemo  

---

## Descripción
Este proyecto contiene una prueba automatizada **End-to-End (E2E)** del flujo de
compra en la página https://www.saucedemo.com, implementada con **Serenity BDD**
utilizando el patrón **Screenplay** y **Cucumber**.

---

## Tecnologías utilizadas
- **Java JDK:** 17
- **Gradle:** 7.6.1
- **Serenity BDD:** 4.0.46
- **Serenity Cucumber:** 4.0.46
- **JUnit Platform:** JUnit 5
- **Navegador:** Google Chrome

---

## Prerequisitos
Antes de ejecutar las pruebas, es necesario contar con lo siguiente en la máquina local:

- Sistema operativo Windows / Linux / macOS
- Java JDK 17 instalado
- Variable de entorno **JAVA_HOME** configurada
- Google Chrome instalado
- Gradle Wrapper incluido en el proyecto

Para validar la instalación de Java:
```bash
java -version
```
## Configuración previa
1. Clonar el repositorio del proyecto.

2. Abrir el proyecto en IntelliJ IDEA.

3. Verificar que el JDK configurado en el proyecto sea Java 17.

## Configuración previa
- El WebDriver (ChromeDriver) es gestionado automáticamente por Serenity BDD
  mediante la propiedad:
  webdriver.autodownload=true
- Esta propiedad se encuentra definida en el archivo serenity.conf.
- No es necesario instalar ni configurar WebDriverManager manualmente.

## Instrucciones para ejecutar las pruebas
Desde la raíz del proyecto ejecutar el siguiente comando utilizando Gradle Wrapper,
según el sistema operativo:

### Windows (PowerShell)
```powershell
.\gradlew clean test
```
Este comando realiza las siguientes acciones:
- Limpia ejecuciones anteriores
- Ejecuta el escenario automatizado
- Genera los reportes de Serenity y Cucumber

### Para correr localmente desde IntelliJ:
  Ejecutar la clase RunnerTest (Runner simple)


## Reportes
### Reporte Serenity (principal)
```txt
target/site/serenity/index.html
```
### Reporte Cucumber (JSON / HTML / XML)
```txt
build/cucumber-report/
```
## Reporte Serenity (sin ejecución)

El repositorio incluye el reporte Serenity BDD generado a partir de la última
ejecución del escenario automatizado.

El reporte puede visualizarse directamente sin ejecutar las pruebas en la siguiente ruta:
```txt
target/site/serenity/index.html
```
## Información adicional
- El proyecto utiliza el patrón Screenplay para mejorar la mantenibilidad
y legibilidad del código.

- Los datos del proceso de checkout se leen desde un archivo JSON externo.

- Los reportes de Serenity se generan automáticamente al finalizar la ejecución
de las pruebas.
