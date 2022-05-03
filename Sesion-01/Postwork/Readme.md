
# Postwork 01: Gestión de bases de datos

## 🎩 Objetivo

- Practicar las consultas CRUD sobre la base de datos.
- Crear las entidades y repositorios que usaremos para el proyecto.

## 🎯 Requisitos

- MySQL instalado y configurado
- Apache Maven 3.8.4 o superior
- JDK (o OpenJDK)

## 🚀 Desarrollo

**Antes de revisar los requerimientos de este postwork, formen equipos de entre dos y tres personas. Los cuales estarán trabajando durante todo el módulo.**

A continuación deberán definir el proyecto, con el que trabajarán el resto de sus postwork.

*Recuerda que el trabajo es en equipo.*

Sigan las siguientes instrucciones:

1. Un elemento del equipo deberá clonar el proyecto de la carpeta [base](./base).

2. A partir de los siguientes diagramas generen las entidades, las cuales serán utilizadas como modelos, otro elemento creará las siguientes entidades.

    ![Clases](img/Diagrama_de_clases.png)

    ![ER](img/Diagrama_ER.png)

    a. Curso
    
    b. Estudiante
    
    c. Materia

3. También generen los repositorios.

    a. CursoRepository
    
    b. EstudianteRepository

    c. MateriaRepository

4. Una vez creados los repositorios, alguién más desarrollará los siguientes casos de prueba:

    - Crear y almacenar (Por lo menos uno de cada uno):
        
        - Estudiante
    
        - Materia
    
        - Curso
        
    - Una vez creado el curso, agregar la calificación del estudiante.

5. Para finalizar, se recomienda que como equipo busquen información sobre las siguientes anotaciones. 

    - @ElementCollection
    
    - @CollectionTable
    
    - @MapKeyJoinColumn.

<br/>
<br/>

[Regresar ](../Readme.md)(Sesión 01)

[Siguiente ](../../Sesion-02/Readme.md)(Sesión 02)
