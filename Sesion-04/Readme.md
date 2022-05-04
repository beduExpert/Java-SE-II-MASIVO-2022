
# :wave:  Sesión 04: Procesos asíncronos

## 🎯  Objetivo de la sesión:

- Ejecutar múltiples procesos de forma paralela y esperar la respuesta o finalización de estos procesos.

## ⚙ Requisitos

- MySQL (o MariaDB) en el equipo y tener las credenciales de _root_
- IntelliJ IDEA Community Edition
- Apache Maven 3.8.4 o superior
- JDK (o OpenJDK)

## Objetivos 

- Utilizar la programación asíncrona y la Non-Blocking API de Java.
- Implementar la programación reactiva en Java.

## Organización de la clase 

Un proceso asíncrono es una función que ejecuta una tarea en segundo plano sin la necesidad de esperar a que finalice la tarea; ahora se realizarán un ejercicio y un ejemplo respecto al tema:

- [Ejemplo 01](./Ejemplo-01/Readme.md) 
- [Reto 01](./Reto-01/Readme.md) 

CompletableFuture se utiliza para la programación asíncrona en Java, tener este tipo de paralelismo mejora enormemente el rendimiento de sus programas; ahora se ejemplificará por medio de la recolección de información con CompletableFuture:

- [Ejemplo 02](./Ejemplo-02/Readme.md)
- [Reto 02](./Reto-02/Readme.md)

El Event loop es una cola de funciones, cada función devuelve un valor que la inserta en una cola o fila; ahora se practicará el Event loop:

- [Ejemplo 03](./Ejemplo-03/Readme.md)
- [Reto 03](./Reto-03/Readme.md)

Postwork

- [Postwork](./Postwork/Readme.md)
