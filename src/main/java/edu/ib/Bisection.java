package edu.ib;

import java.util.ArrayList;
import java.util.List;

public class Bisection {

    public static double bisection(double a, double b, Function function, int iteracja) {
        if (function.function(a) * function.function(b) >= 0) {
            System.out.println("nieprawidłowy przedział");
            return 0;
        }
        double c = a;
        for (int i = 0; i < iteracja; i++) {
            c = (a + b) / 2;
            if (function.function(c) == 0.0)
                break;
            else if (function.function(c) * function.function(a) < 0)
                b = c;
            else
                a = c;
        }
        return c;
    }

    public static BisekcjaWyniki getEpsilonWynikiList(double a, double b, Function function, int iteracja, double trueValue) {
        List<Double> epsilonA = new ArrayList<>();
        List<Double> epsilonT = new ArrayList<>();
        List<Double> wyniki = new ArrayList<>();
        epsilonA.add(0.);
        wyniki.add(bisection(a, b, function, 1));
        epsilonT.add((wyniki.get(0) - trueValue) / trueValue);
        for (int i = 1; i < iteracja; i++) {
            wyniki.add(bisection(a, b, function, i + 1));
            epsilonA.add((wyniki.get(i - 1) - wyniki.get(i)) / wyniki.get(i));
            epsilonT.add((wyniki.get(i) - trueValue) / trueValue);
        }
        BisekcjaWyniki bw = new BisekcjaWyniki(epsilonA, epsilonT, wyniki);
        return bw;

    }

}
