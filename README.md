# ESTRUCTURA MODULAR DEL PROYECTO
Se muestra en consola los resultados
El sistema está desarrollado bajo el enfoque de **programación modular**, fragmentando el código fuente en tres clases independientes de Java. Cada componente posee una responsabilidad única y bien definida dentro de la aplicación:
1. **Clase principal e interfaz de usuario.** Alberga el método `main` y gestiona la interacción directa con el usuario a través de la consola. Coordina la lectura de nuevos datos o la selección de matrices predeterminadas, para luego canalizar la información hacia los algoritmos de resolución y mostrar los resultados finales.
2.**Núcleo de lógica matemática.** Centraliza los procedimientos numéricos pesados, implementando de forma estricta los métodos de **Eliminación Gaussiana** y **Gauss-Jordan**. Esta clase se encuentra totalmente desacoplada de la interfaz, facilitando su reutilización en otros entornos.
3.**Gestor de entrada de datos.** Se encarga exclusivamente de la administración y estructura de las matrices. Controla la captura dinámica de ecuaciones paso a paso mediante consola y almacena los arreglos por defecto orientados a pruebas rápidas de ejecución.
# GUÍA DE COMPILACIÓN Y EJECUCIÓN
###  Validación del Paquete en el IDE
Asegúrate de que los archivos `Lanzador_GaussJ.java`, `GaussJ.java` y `DefmatrizGJ.java` compartan el mismo paquete dentro de tu entorno de desarrollo. Si utilizas **IntelliJ IDEA**, verifica en el panel lateral izquierdo (`Project`) que las tres clases estén correctamente ubicadas bajo el directorio raíz de fuentes (`src`).
### Ejecución de la Clase Principal
Lanza la aplicación ejecutando la clase `Lanzador_GaussJ.java`. Al encontrarse en el mismo directorio de trabajo, el compilador identificará de manera automática las referencias cruzadas hacia las clases secundarias (`GaussJ` y `DefmatrizGJ`) sin necesidad de configuraciones adicionales.
### Interacción en Consola
Observa la sección inferior del IDE (pestaña `Run`). El entorno compilará en segundo plano y desplegará un menú interactivo en la consola. Verifica que aparezca la opción *"Ingresar datos por consola"* sin arrojar ningún tipo de error de sintaxis o de símbolos.
# DEMOSTRACIÓN DE EJECUCIÓN

### Escenario 1: Ejecución con Datos Predeterminados
Al seleccionar la matriz por defecto del menú interactivo, el sistema procesa y despliega la siguiente salida en consola:
**MÉTODO DE GAUSS-JORDÁN 
1. Ingresar datos por la consola
2. Usar matriz por defecto del ejemplo
Seleccione una opción: 2
Soluciones del sistema (Gauss-Jordan):
x1 = 2.3990
x2 = -4.4998
x3 = 3.3292
El proceso finalizó con el código de salida 0.
### Escenario 2: Ejecución con Entrada de Datos Manual
Ejemplo de comportamiento del sistema al capturar manualmente un sistema de 3 ecuaciones lineales:
**MÉTODO DE GAUSS-JORDÁN - MÉTODOS NUMÉRICOS
1. Ingresar datos por la consola
2. Usar matriz por defecto del ejemplo
Seleccione una opción: 1
Ingrese el número de ecuaciones (variables): 3
Ingrese los coeficientes y el término independiente para cada ecuación:
> Ecuación 1: Coeficiente x1: 2 | Coeficiente x2: 3 | Coeficiente x3: 8 | Término (b1): 12
> Ecuación 2: Coeficiente x1: 1 | Coeficiente x2: 4 | Coeficiente x3: 3 | Término (b2): 24
> Ecuación 3: Coeficiente x1: 9 | Coeficiente x2: 6 | Coeficiente x3: 0 | Término (b3): 12
Soluciones del sistema (Gauss-Jordan):
x1 = -3.3846
x2 = 7.0769
x3 = -0.3077

El proceso finalizó con el código de salida 0.
```
