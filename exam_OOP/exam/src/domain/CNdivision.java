package domain;

public class CNdivision {
    
    static public ComplexNumber division(ComplexNumber cn1, ComplexNumber cn2) {

        double reals = (cn1.getReal() * cn2.getReal() + cn1.getImaginary() * cn2.getImaginary()) / (cn2.getReal() * cn2.getReal() + cn2.getImaginary() * cn2.getImaginary());
        double imaginaries = (cn1.getImaginary() * cn2.getReal() - cn1.getReal() * cn2.getImaginary()) / (cn2.getReal() * cn2.getReal() + cn2.getImaginary() * cn2.getImaginary());

        ComplexNumber cn = new ComplexNumber(reals, imaginaries);
        return cn;
    }

}