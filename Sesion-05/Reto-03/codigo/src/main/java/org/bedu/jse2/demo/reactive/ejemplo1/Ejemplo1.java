package org.bedu.jse2.demo.reactive.ejemplo1;


import io.reactivex.Single;
import org.bedu.jse2.demo.reactive.generator.RxJavaObservableGenerator;

public class Ejemplo1 {

   static  Single<Integer> sumarSingle(){
       return RxJavaObservableGenerator
               .observableStream()
               .reduce(0,(a,b) -> a + b);
   }

   static Integer sumar(){
       return RxJavaObservableGenerator
               .observableStream()
               .reduce(0,(a,b) -> a + b)
               .blockingGet();
   }

   static Single<Integer> reto(){
       return RxJavaObservableGenerator
               .observableStream()
               .map( v -> v*v*v)
               .filter(v -> v > 50)
               .reduce(0, Integer::sum);
   }

}
