
# :wave: Sesión 02: Multi Hilos y procesos concurrentes

## 🎯  Objetivo de la sesión:

- Generar hilos y utilizar los pools
- Implementar la interface Runnable

## ⚙ Requisitos

- MySQL (o MariaDB) en el equipo y tener las credenciales de _root_
- IntelliJ IDEA Community Edition
- Apache Maven 3.8.4 o superior
- JDK (o OpenJDK)

## Objetivos 

- Comprobar la diferencia entre un proceso y un hilo.
- Utilizar la programación mediante el uso de hilos.
- Analizar la clase Thread y la interfaz Runnable de Java.

## Organización de la clase 

Java threads es la clase base de Java para definir hilos que se ejecutan dentro de un mismo programa; ahora se realizará la creación de hilos extendiendo la clase Thread.

- [Ejemplo 01](./Ejemplo-01/Readme.md)
- [Reto 01](./Reto-01/Readme.md)

La interfaz Runnable es la forma más normal para crear hilos; ahora se realizará la creación de hilos extendiendo la interface Thread.

- [Ejemplo 02](./Ejemplo-02/Readme.md)
- [Reto 02](./Reto-02/Readme.md)

Un thread pool reutiliza los threads creados previamente para ejecutar tareas actuales y ofrece una solución al problema de la sobrecarga del ciclo de subprocesos y la hiperpaginación de recursos; ahora utilizarás los Thread Pools.

- [Ejemplo 03](Ejemplo-03)

Postwork

- [Postwork](./Postwork/Readme.md)
