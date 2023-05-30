package domain;

public abstract class CNfactory {
    
    static public ComplexNumber createCN(double r, double i) {
        ComplexNumber cn = new ComplexNumber(r, i);
        return cn;
    }

}