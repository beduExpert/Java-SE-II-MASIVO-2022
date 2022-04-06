package com.example.BP.retos;

import java.util.ArrayList;

public class QuickSortAlgorithm {

    private QuickSortAlgorithm() {
    }

    public static  ArrayList<Number> sort(ArrayList<Number> u ) {

        if(u.size() < 2){
            return u;
        }

        Number t = (u.get(u.size() - 1).doubleValue() + u.get(0).doubleValue()) / 2;

        ArrayList<Number> l = new ArrayList<>();
        ArrayList<Number> r = new ArrayList<>();

        for (int i = 0; i < u.size(); i++) {
            Number x = u.get(i);
            if (x.doubleValue() < t.doubleValue() ) {
                l.add(x);
            } else {
                r.add(x);
            }
        }

        ArrayList<Number> l2 =  sort(l);
        ArrayList<Number> r2 =  sort(r);

        ArrayList<Number> y = new ArrayList<>();

        for(int i = 0; i < l2.size(); i++){
            y.add(l2.get(i));
        }

        for(int i = 0; i < r2.size(); i++){
            y.add(r2.get(i));
        }


        return y;
    }
}
