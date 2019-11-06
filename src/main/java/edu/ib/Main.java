package edu.ib;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        double g=9.81;
        double m=68.1;
        double v=40.;
        double t=10.;

        BisekcjaWyniki bw1= Bisection.getEpsilonWynikiList(12,16,(c)->((g*m/c)*(1-Math.exp((-1*c*t/m)))-v),10, 14.8011);
        List<Double> epsilonA1=bw1.getEpsilonA();
        List<Double> epsilonT1=bw1.getEpsilonT();
        List<Double> wyniki1=bw1.getWyniki();


        BisekcjaWyniki bw2= Bisection.getEpsilonWynikiList(5,7,(x)->-0.5*x*x+2.5*x+4.5,10,6.4051);
        List<Double> epsilonA2=bw2.getEpsilonA();
        List<Double> epsilonT2=bw2.getEpsilonT();
        List<Double> wyniki2=bw2.getWyniki();

        BisekcjaWyniki bw3= Bisection.getEpsilonWynikiList(1,2,(x)->x*x*x+x*x-3*x-3,10,Math.sqrt(3.));
        List<Double> epsilonA3=bw3.getEpsilonA();
        List<Double> epsilonT3=bw3.getEpsilonT();
        List<Double> wyniki3=bw3.getWyniki();

        BisekcjaWyniki bw4= Bisection.getEpsilonWynikiList(275,320,(temp)->-139.34411+(1.575701*Math.pow(10,5)/temp)-(6.642308*Math.pow(10,7)/Math.pow(temp,2))+(1.243800*Math.pow(10,10)/Math.pow(temp,3))-(8.621949*Math.pow(10,11)/Math.pow(temp,4))-Math.log(8.10),20,0);
        List<Double> wyniki4=bw4.getWyniki();

        BisekcjaWyniki bw5= Bisection.getEpsilonWynikiList(275,320,(temp)->-139.34411+(1.575701*Math.pow(10,5)/temp)-(6.642308*Math.pow(10,7)/Math.pow(temp,2))+(1.243800*Math.pow(10,10)/Math.pow(temp,3))-(8.621949*Math.pow(10,11)/Math.pow(temp,4))-Math.log(12.),20,0);
        List<Double> wyniki5=bw5.getWyniki();
    }


}
