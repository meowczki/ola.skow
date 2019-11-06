package edu.ib;

import java.util.List;

public class BisekcjaWyniki {
    private List<Double> epsilonA;

    public BisekcjaWyniki(List<Double> epsilonA, List<Double> epsilonT, List<Double> wyniki) {
        this.epsilonA = epsilonA;
        this.epsilonT = epsilonT;
        this.wyniki = wyniki;
    }

    private List<Double> epsilonT;

    public List<Double> getEpsilonA() {
        return epsilonA;
    }

    public void setEpsilonA(List<Double> epsilonA) {
        this.epsilonA = epsilonA;
    }

    public List<Double> getEpsilonT() {
        return epsilonT;
    }

    public void setEpsilonT(List<Double> epsilonT) {
        this.epsilonT = epsilonT;
    }

    public List<Double> getWyniki() {
        return wyniki;
    }

    public void setWyniki(List<Double> wyniki) {
        this.wyniki = wyniki;
    }

    private List<Double> wyniki;
}
