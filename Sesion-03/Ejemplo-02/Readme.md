# Ejemplo 02: High Order Functions

## Objetivo

 - Conocer qué son y cómo funcionan las High Order Functions.
 - Crear una High Order Functions.
 - Crear una clase con un método que reciba una lista de enteros y les aplique una función arbitraria.

## Requisitos

- Apache Maven 3.8.4 o superior
- JDK (o OpenJDK)

## Maven

Para ejecutar las pruebas de maven usa:

```bash
mvn test
```

## Desarrollo

- Clase contenedora

    1. Crea la clase Ejemplo2 en el paquete `org.bedu.jse2.demo.ejemplos`

    2. Agrega el siguiente bloque de código
    
        ```java
        List<Integer> transformar(Iterable<Integer> conjunto, Function<Integer, Integer> funcion){
            return null;
        }
        ```

- Prueba unitaria
    1. Crea una prueba para la clase Ejemplo2

        ![Crear prueba](img/figura01.png)
    
    2. Agrega el siguiente código

        ```java
        import static org.assertj.core.api.Assertions.assertThat;

        class Ejemplo2Test {
        private final List<Integer> CONJUNTO = Arrays.asList(1, 4, 6, 2, -5, 9);

            @Test
            @DisplayName("Negativos")
            void negatives() {
                Ejemplo2 ejemplo2 = new Ejemplo2();

                List<Integer> real = ejemplo2.transformar(CONJUNTO, s -> -s);

                assertThat(real).containsExactly(-1, -4, -6, -2, 5, -9);

            }

            @Test
            @DisplayName("Cuadrados")
            void squares() {
                Ejemplo2 ejemplo2 = new Ejemplo2();

                List<Integer> real = ejemplo2.transformar(CONJUNTO, s -> s * s);

                assertThat(real).containsExactly(1, 16, 36, 4, 25, 81);

            }
        }
        ```

    3. Si ejecutas la prueba en este momento fallará ya que estamos regresando null.

        Esta prueba intenta aplicar dos funciones distintas al mismo método, y espera tener resultados acordes a la función dada.


- Implementando la funcionalidad 

    1. Reemplaza el código de la clase Ejemplo2 de la siguiente manera
        
        ```java
        List<Integer> transformar(Iterable<Integer> conjunto, Function<Integer, Integer> funcion){

                List<Integer> nuevaLista = new ArrayList<>();
                for(Integer value : conjunto){
                    nuevaLista.add(funcion.apply(value));
                }

                return nuevaLista;
            }
        ```

    2. Vuelve a ejecutar la prueba

        En este ejemplo creamos un operador capaz de recibir una función arbitraria y aplicarla sobre un conjunto de enteros.


<br/>

[Siguiente ](../Reto-02/Readme.md)(Reto 2)