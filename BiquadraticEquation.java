package biquadratesolution;


public class BiquadraticEquation {
    private double A, B, C;
    
public BiquadraticEquation(double a, double b, double c){
        this.A = a;
        this.B = b;
        this.C = c;
}

private double GetDiscriminant(){
 double D;
    D = this.B*this.B - 4*this.A*this.C;
 return D;
}

public double[] GetSolution(){
    double[] Solution = new double[2];
    double x1,x2;
    double D = this.GetDiscriminant();
    if (D>0){
        x1 = (-this.B + Math.sqrt(D))/(2*this.A);
        x2 = (-this.B - Math.sqrt(D))/(2*this.A);
        Solution[0] = x1;
        Solution[1] = x2;
    }
    if (D==0){
        x1 = (-this.B)/(2*this.A);
        Solution[0] = x1;
        Solution[1] = null;
    }
    if (D<0){
        System.out.println("При данных значениях коэффициентов A, B, C невозможно найти значение в пределах действительных чисел");
    }
    return Solution;
}

}

