# Postwork Sesión 02: Cálculo de promedios mediante hilos 

## 🎩 Objetivo 

- Practicar el uso de hilos con Java.
- Calcular promedios a través de múltiples hilos en su proyecto.

## 🎯 Requisitos 

- MySQL instalado y configurado
- Apache Maven 3.8.4 o superior
- JDK (o OpenJDK)

## 🚀 Desarrollo

Completen las siguientes instrucciones para realizar el segundo postwork:

**Realizar en equipo**

1. Utilicen el proyecto del postwork 1.

2. Generen un nuevo package con el nombre de multithreading.

3. Un miembro del equipo creará la clase CalculadorPromedioCurso que implemente un Runnable, su constructor deberá obtener el curso, con las calificaciones a promediar; además, el run deberá calcular el promedio y mostrar el resultado junto con el nombre del curso.

4. Otra persona deberá generar la clase Postwork2 la cual creará los cursos (cuatro como mínimo) con calificaciones aleatorias para cada uno de sus estudiantes. Como muestra dejaremos 20 estudiantes por curso.

5. Una vez generada la información otro miembro del equipo ejecutará el Runnable con un ExecutorService. Donde cada hilo deberá calcular cada curso.

<br/>

A continuación dejamos una imagen donde pueden visualizar el flujo general que tomará la aplicación.

![diagrama1](img/diagrama1.png)

<br/>
<br/>

[Regresar ](../Readme.md)(Sesión 02)

[Siguiente ](../../Sesion-03/Readme.md)(Sesión 03)
