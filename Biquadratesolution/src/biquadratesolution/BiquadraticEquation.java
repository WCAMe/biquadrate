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
    D = B*B - 4*A*C;
 return D;
}

public double[] GetSolution(){
    double[] Solution = new double[2];
    double x1,x2;
    double D = this.GetDiscriminant();
    if (D>0){
        x1 = (-B + Math.sqrt(D))/(2*A);
        x2 = (-B - Math.sqrt(D))/(2*A);
        Solution[0] = x1;
        Solution[1] = x2;
    }
    if (D==0){
        x1 = (-B)/(2*A);
        Solution[0] = x1;
    }
    if (D<0){
        System.out.println("При данных значениях коэффициентов A, B, C невозможно найти значение в пределах действительных чисел");
    }
    return Solution;
}

}

