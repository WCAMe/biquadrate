package biquadratesolution;


public class BiquadraticEquation {
    private double a, b, c;
    
    public BiquadraticEquation(double a, double b, double c){
            this.a = a;
            this.b = b;
            this.c = c;
    }

    private double getDiscriminant(){
        double d;
        d = b*b - 4*a*c;
        return d;
    }

    public double[] getSolution(){
        double[] solution = new double[2];
        double x1,x2;
        if (a == 0){
            x1 = -c/b;
            solution[0] = x1;
        }
        else{
            double D = this.getDiscriminant();
            if (D>0){
                x1 = (-b + Math.sqrt(D))/(2*a);
                x2 = (-b - Math.sqrt(D))/(2*a);
                solution[0] = x1;
                solution[1] = x2;
            }
            if (D==0){
                x1 = (-b)/(2*a);
                solution[0] = x1;
            }
            if (D<0){
                System.out.println("При данных значениях коэффициентов A, B, C невозможно найти значение в пределах действительных чисел");
            }
        }
        return solution;
    }

}

