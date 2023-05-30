package domain;

public class CNaddition {

    static public ComplexNumber add(ComplexNumber cn1, ComplexNumber cn2) {
        
        double reals = cn1.getReal() + cn2.getReal();
        double imaginaries = cn1.getImaginary() + cn2.getImaginary();

        ComplexNumber cn = new ComplexNumber(reals, imaginaries);
        return cn;
    }

}