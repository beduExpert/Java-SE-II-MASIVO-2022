# Postwork 06: Clases genéricas

## 🎩 Objetivo

- Aplicar los conocimientos de Generics mediante un proyecto real.
- A lo largo de este proyecto reafirmamos lo que se ha aprendido durante las sesiones.

## 🎯 Requisitos 

- IntelliJ IDEA Community Edition
- JDK (o OpenJDK)
- Postwork de la sesión anterior

## 🚀 Desarrollo

Uno de los principales usos de Generics es poder implementar algoritmos independientes de sus parámetros.

Te recomendamos revisar la siguiente página como recurso adicional [Merge Sort](https://www.tutorialspoint.com/data_structures_algorithms/merge_sort_algorithm.htm)



Crea una implementación del algoritmo [Merge Sort](https://www.tutorialspoint.com/data_structures_algorithms/merge_sort_algorithm.htm) que cumpla con la siguiente interfaz:

<br/>

Completa las siguientes instrucciones para completar el sexto postwork:

1. Utiliza el proyecto de postwork 5.

2. Dentro del package tools crea la clase MergeSortAlgorithm. La cual estará encargada de ordenar de dos maneras diferentes y mezclar los dos ordenamientos.

3. El primer método de ordenamiento será con Comparable<t>.

    ```java
    public static <T extends Comparable<T>> List<T> sort(List<T> unsortedList) {
        return sort(unsortedList, Comparator.naturalOrder());
    }
    ```

4. El segundo ordenamiento será con List<T>.

    ```java
    public static <T> List<T> sort(List<T> unsortedList, Comparator<T> comparator) {
        if (unsortedList.size() == 1) {
            return unsortedList;
        }

        int middleElement = unsortedList.size() / 2;

        Deque<T> stackA = new ArrayDeque<>(sort(unsortedList.subList(0, middleElement), comparator));
        Deque<T> stackB = new ArrayDeque<>(sort(unsortedList.subList(middleElement, unsortedList.size()), comparator));

        return merge(stackA, stackB, comparator);
    }
    ```

5. Ahora agrega el merge el cual mezclará las listas ordenadas.

    ```java
    private static <T> List<T> merge(Deque<T> stackA, Deque<T> stackB, Comparator<T> comparator) {
        List<T> merged = new ArrayList<>();

        while (!stackA.isEmpty() && !stackB.isEmpty()) {
            if (comparator.compare(stackA.peekFirst(), stackB.peekFirst()) < 0) {
                merged.add(stackA.pop());
            } else {
                merged.add(stackB.pop());
            }
        }

        merged.addAll(stackA);
        merged.addAll(stackB);

        return merged;
    }
    ```

6. Por último agrega los test para la clase MergeSortAlgorithm.

    - Con la cual generamos una colección con cien mil números aleatorios.
    
    - Además de dos test:
    
        - Ordenar una colección de enteros
        
        - Ordenar una colección con un comparador

    ```java
    private static final Random RANDON_GENERATOR = new Random();
    private static final int COLLECTION_SIZE = 100000;

    private List<Integer> unsorted;

    @RequiredArgsConstructor
    @Data
    class Custom {
        private final int value;
    }

    @BeforeEach
    void setup() {
        unsorted = IntStream.rangeClosed(0, COLLECTION_SIZE)
                .mapToObj(i -> RANDON_GENERATOR.nextInt())
                .collect(Collectors.toList());
    }

    @Test
    @DisplayName("Ordena una colección de enteros")
    void sortsIntegerCollection() {
        List<Integer> sorted = MergeSortAlgorithm.sort(unsorted);

        assertThat(sorted.size()).isEqualTo(unsorted.size());

        IntStream.range(1, sorted.size())
                .forEach(idx -> assertThat(sorted.get(idx - 1)).isLessThanOrEqualTo(sorted.get(idx)));
    }

    @Test
    @DisplayName("Ordena una colección con un comparador")
    void sortsCollectionWithComparable() {

        List<Custom> customUnsorted = unsorted.stream()
                .map(Custom::new)
                .collect(Collectors.toList());

        List<Custom> sorted = MergeSortAlgorithm.sort(customUnsorted, Comparator.comparingInt(Custom::getValue));

        assertThat(sorted.size()).isEqualTo(customUnsorted.size());

        IntStream.range(1, sorted.size())
                .forEach(idx -> assertThat(sorted.get(idx - 1).getValue()).isLessThanOrEqualTo(sorted.get(idx).getValue()));
    }
    ```

7. Ejecuta los test.

<br/>

## ✅ Checklist 

Asegúrate que tu postwork contenga todo lo siguiente, ya que esto se evaluará al término del módulo.

- [ ] MergeSortAlgorithm tiene un método que ordena por números números naturales con un Comparable<t>.

- [ ] La clase MergeSortAlgorithm contiene un método que ordena una colección con un comparador.

- [ ] MergeSortAlgorithm tiene un método para mezclar los dos tipos de ordenamiento.

- [ ] La prueba MergeSortAlgorithmTest genera y agrega cien mil números aleatorios a una lista.

- [ ] Existen dos test para ejecutar los dos tipos de sort creados en la clase MergeSortAlgorithm.


<br/>
<br/>

[Regresar ](../Readme.md)(Sesión 06)

[Siguiente ](../../Sesion-07/Readme.md)(Sesión 07)