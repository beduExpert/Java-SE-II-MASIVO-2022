# Postwork 07: Microservicios

## 🎩 Objetivo

- Realizar microservicios a un servidor de MongoDB, para almacenar y consultar registros alojados en la base de datos.
- A lo largo de este proyecto reafirmaremos lo que se ha aprendido durante las sesiones.

## 🎯 Requisitos 

- IntelliJ IDEA Community Edition
- JDK (o OpenJDK)
- Reto 03

## 🚀 Desarrollo

Completa las siguientes instrucciones para completar el séptimo postwork:

1. Clona el proyecto del Reto 03: 

2. En el archivo **pom** cambiar la siguiente dependencia:

    ```xml
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-data-jpa</artifactId>
    </dependency>
    ```

    Por la siguiente:

    ```xml
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-data-mongodb-reactive</artifactId>
    </dependency>
    ```

    **Tip** -> En caso de no encontrar la dependencia de jpa, agregar la de mongodb-reactive al inicio de las dependencias

3. Ahora ocupando una base de datos MongoDB la cual se llamará "empleado", puedes crear tu cuenta en [MongoDB Atlas](https://www.mongodb.com/atlas/database) <- Es gratis.

4. Modificamos la clase EmpleadoRepository pasarla a ser una interfaz:

    ```java
    public interface EmpleadoRepository extends ReactiveMongoRepository<Empleado, String>{
    }
    ```

5. Agregamos el uri de conexión en el archivo **application.properties** lo encontrarás dentro de **resources**.

    ```properties
    spring.data.mongodb.uri=mongodb+srv://<user>:<password>@cluster0.ijbvb.mongodb.net/empleado?retryWrites=true&w=majority
    ```

6. Modifica el controlador con los métodos que nos devuelve la interfaz.

    ![Metodos](img/img_01.png)

7. Por último ejecuta los tres servicios creados, notarás que ahora los datos se almacenan en MongoDB Atlas.

    - Crear empleado

        ![Prueba 1](img/img_02.png)

    - Consultar empleados
    
        ![Prueba 2](img/img_03.png)

    - Consultar empleado por id
    
        ![Prueba 3](img/img_04.png)

    - Registros desde MongoDB Atlas

        ![Prueba 1](img/img_05.png)

<br/>

## ✅ Checklist 

Asegúrate que tu postwork contenga todo lo siguiente, ya que esto se evaluará al término del módulo.

- [ ] El proyecto no muestra warnings ni errores durante su ejecución.

- [ ] El proyecto logra conectarse al servidor de MongoDB.

- [ ] Es posible registrar un empleado con POST al API.

- [ ] Es posible consultar todos los empleados con GET.

- [ ] Es posible consultar un empleado por su ID con GET.


<br/>
<br/>

[Regresar ](../Readme.md)(Sesión 07)

[Siguiente ](../../Sesion-08/Readme.md)(Sesión 08)