## Reto 1

## Objetivos

* Refactorizar la clase QuickSortAlgorithm para que implemente los principios de código limpio y buenas practicas.

## Requisitos

- IntelliJ IDEA Community Edition
- JDK (o OpenJDK)

## Desarrollo

Para completar este reto, necesitas aplicar las buenas practicas aprendidas en el ejemplo 01 de está seción.

En la siguiente dirección encontraras el proyecto con el que trabajarás en este reto. [Proyecto](./codigo).

_Nota:_ El código cumple con el requisito funcional, pero es poco legible, te recomendamos moficicar los siguiente:

  - Usa nombres significativos.

  - Elimina estructuras complicadas de código.

  - Refactoriza a métodos privados así como cualquier elemento de lógica que veas compleja.

<br/>

<details>
  <summary>Solución</summary>

  <p>
    Cabe señalar que la propuesta presentada no es única. Diferentes personas pueden implementar diferentes reglas y niveles de refactorización
  </p>

  <ol>
      <li><strong>Usa nombres significativos</strong> Cambia los nombres de las variables para que sean más significativos.
        <ul>
            <li> u := listaOriginal </li>
            <li> t := pivote </li>
            <li> l := elementosMenores </li>
            <li> r := elementosMayores </li>
            <li> x := elemento </li>
            <li> l2:= elementosMenoresOrdenados </li>
            <li> r2:= elementosMayoresOrdenados </li>
            <li> y := listaOrdenada </li>
        </ul>
      </li>
      <br/>
      <li><strong>Programa para interfaces, no para clases concretas</strong> Cambia el uso de ArrayList<T> por List<T>.</li>
      <br/>
      <li><strong>KISS + DRY</strong> Elimina estructuras complicadas del código. 
        <ul>
          <li> El ciclo de selección de elementos no ocupa el valor del índice (i), por lo que se puede reemplazar por un ciclo <em>for(Number elemento : listaOriginal)<em></li>
          <li> Cuando se agregan todos los elementos de una lista se puede hacer desde el contructor o con el método <em>addAll</em></li>
          <li> Opcionalmente, podemos usar streams y lambdas para simplificar la separación de elementos.</li>
          <li> Opcionalmente, podemos hacer la separación y ordenamiento de las sublistas en una única operación.</li>
        </ul>
      </li>
      <br/>
      <li> 
        <strong>SRP</strong> Refactoriza a métodos privados cualquier elemento de lógica complicada. De este modo, si cambiamos la estrategia no deberemos modificar el cuerpo de la función principal.
        <ul>
          <li> La asignación del pivote puede no ser clara en una primera lectura</li>
          <li> Opcionalmente, si usaste programación funcional para filtrar la lista, puedes extraer la lógica a una HOF para mejorar la legibilidad</li>
        </ul>
     </li>
  </ol>
  <br/>

  <p>
    Si aplicamos todo esto, el resultado final será el siguiente:
  </p>

```java
package com.example.BP.retos;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class QuickSortAlgorithm {

    private QuickSortAlgorithm() {
    }

    public static List<Number> sort(List<Number> listaOriginal ) {

        if(listaOriginal.size() < 2){
            return listaOriginal;
        }

        double pivote = calcularPivote(listaOriginal);

        List<Number> elementosMenoresOrdenados =  sort(filtrar(listaOriginal, n -> n.doubleValue() < pivote));
        List<Number> elementosMayoresOrdenados =  sort(filtrar(listaOriginal, n -> n.doubleValue() >= pivote));

        List<Number> listaOrdenada = new ArrayList<>(elementosMenoresOrdenados);
        listaOrdenada.addAll(elementosMayoresOrdenados);

        return listaOrdenada;
    }

    private static Double calcularPivote(List<Number> listaOriginal) {
        final double primerElemento = listaOriginal.get(listaOriginal.size() - 1).doubleValue();
        final double ultimoElemento = listaOriginal.get(0).doubleValue();

        return (primerElemento + ultimoElemento) / 2;
    }

    private static List<Number> filtrar(List<Number> lista, Predicate<Number> predicate){
        return lista.stream().filter(predicate).collect(Collectors.toList());
    }
}
```

</details>


<br/>
<br/>

[Siguiente ](../Ejemplo-02/Readme.md)(Ejemplo 02)