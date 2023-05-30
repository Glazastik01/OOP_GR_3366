package domain;

public class actions {
    
    static public ComplexNumber add(ComplexNumber cn1, ComplexNumber cn2) {
        
        double reals = cn1.getReal() + cn2.getReal();
        double imaginaries = cn1.getImaginary() + cn2.getImaginary();

        ComplexNumber cn = new ComplexNumber(reals, imaginaries);
        return cn;
    }

    static public ComplexNumber multiplication(ComplexNumber cn1, ComplexNumber cn2) {

        double reals = cn1.getReal() * cn2.getReal() - cn1.getImaginary() * cn2.getImaginary();
        double imaginaries = cn1.getImaginary() * cn2.getReal() + cn1.getReal() * cn2.getImaginary();

        ComplexNumber cn = new ComplexNumber(reals, imaginaries);
        return cn;
    }

    static public ComplexNumber division(ComplexNumber cn1, ComplexNumber cn2) {

        double reals = (cn1.getReal() * cn2.getReal() + cn1.getImaginary() * cn2.getImaginary()) / (cn2.getReal() * cn2.getReal() + cn2.getImaginary() * cn2.getImaginary());
        double imaginaries = (cn1.getImaginary() * cn2.getReal() - cn1.getReal() * cn2.getImaginary()) / (cn2.getReal() * cn2.getReal() + cn2.getImaginary() * cn2.getImaginary());

        ComplexNumber cn = new ComplexNumber(reals, imaginaries);
        return cn;
    }

    public interface iAction {
        void act();
    }

    private iAction[] commands = new iAction[] {
        new iAction() {
            public void act() {
                add(null, null);
            }
        },
        new iAction() {
            public void act() {
                multiplication(null, null);
            }
        },
        new iAction() {
            public void act() {
                add(null, null);
            }
        }
    };

    public void act(int index) {
        commands[index].act();
    }

}