package org.bedu.jse2.demo.reactive.generator;

import io.reactivex.Observable;

public class RxJavaObservableGenerator {
    private static final Integer[] LISTA = {1, 2, 3, 4, 5, 6};


    static public Observable<Integer> observableStream() {
        return Observable.fromArray(LISTA);
    }
}
