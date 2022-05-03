# :wave: Sesión 01: Gestión de bases de datos

## 🎯  Objetivo de la sesión:
- Conocer las distintas interfaces que Java proporciona para interactuar con las bases de datos

## 🎯 Qué aprenderán

- Aprender a realizar consultas CRUD sobre la base de datos.
- Comprender la complejidad de trabajar con entidades (base de
datos) y objetos (POO/Java).
- Conocer algunas herramientas para reducir el trabajo como ORM.

## ⚙ Requisitos

- MySQL (o MariaDB) en el equipo y tener las credenciales de _root_
- IntelliJ IDEA Community Edition
- Apache Maven 3.8.4 o superior
- JDK (o OpenJDK)

## 🎩  Objetivos 

- Que el alumno aprenda las interfaces para conectarse y hacer consultas a una base de datos.
- Comprender el modelo de abstracción usado en Java para las bases de datos.
- Aprender las ventajas de usar un ORM y JPA.

## Organización de la clase 

Spring Data JPA es un complemento que proporciona un framework que funciona con JPA y proporciona una abstracción completa sobre la capa de acceso a datos, incorpora el concepto de repositorios JPA y un conjunto de interfaces que define los métodos de consulta. Ahora se realizará la creación y configuración de una base de datos y conexión mediante Spring Data JPA.

	- [Ejemplo 01](./Ejemplo-01/Readme.md)
	- [Reto 01](./Reto-01/Readme.md)

Una entidad es algo elemental para comprender JPA. Es una clase POJO (Objeto Java Plano Antiguo) que proporciona un método constructor por defecto, no debe ser final y debe implementar Serializable para accesos remotos. Se trata de un conjunto de estados asociados juntos en una unidad. Ahora se realizará la creación de entidades y repositorios.

	- [Ejemplo 02](./Ejemplo-02/Readme.md)
	- [Reto 02](./Reto-02/Readme.md)
	
JUnit es un framework para la automatización de las pruebas en los proyectos  de software, por medio de éste se proporcionan herramientas, clases y métodos que le facilitan las pruebas y aseguran su consistencia y funcionalidad. Ahora se realizarán las pruebas de integración a reposotorios con JUnit.

	- [Ejemplo 03](./Ejemplo-03/Readme.md)
	- [Reto 03](./Reto-03/Readme.md)

Postwork

	- [Postwork](./Postwork/Readme.md)
