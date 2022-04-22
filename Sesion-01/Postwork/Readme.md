
# Postwork 01: Gestión de bases de datos

## 🎩 Objetivo

- Formar equipos de entre dos y tres integrantes.
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

Sigue estas instrucciones:

1. Clonen el proyecto de la carpeta [base](./base).

2. A partir de los siguientes diagramas generen las entidades, las cuales serán utilizadas como modelos.

    ![Clases](img/Diagrama_de_clases.png)

    ![ER](img/Diagrama_ER.png)

    a. Curso
    
    b. Estudiante
    
    c. Materia

3. Ahora generen los repositorios.

    a. CursoRepository
    
    b. EstudianteRepository

    c. MateriaRepository

4. Ahora generen los siguientes casos de prueba:

    - Crear y almacenar (Por lo menos uno de cada uno):
        
        - Estudiante
    
        - Materia
    
        - Curso
        
    - Una vez creado el curso, agregar la calificación del estudiante.

5. Ya para terminar recomendamos buscar información sobre las siguientes anotaciones 

    - @ElementCollection
    
    - @CollectionTable
    
    - @MapKeyJoinColumn.

<br/>
<br/>

## ✅ Checklist 

Asegúrate que el postwork contenga todo lo siguiente, ya que esto se evaluará al término del módulo.

- [ ] El usuario puede ejecutar el proyecto base.

- [ ] El proyecto contiene los tres modelos (Curso, Estudiante y Materia).

- [ ] El proyecto contiene los tres repositorios (CursoRepository, EstudianteRepository y MateriaRepository)

- [ ] Las pruebas crean y almacenan, estudiante, materia y curso.

- [ ] Las pruebas asignan la calificación de algún estudiante en un curso.

<br/>
<br/>

[Regresar ](../Readme.md)(Sesión 01)

[Siguiente ](../../Sesion-02/Readme.md)(Sesión 02)
