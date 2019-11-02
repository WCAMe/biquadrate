package biquadratesolution;

import java.util.*;


public class BiquadrateEquation {
    private final double a;
    private final double b;
    private final double c;
    
    public BiquadrateEquation(double a, double b, double c){
            this.a = a;
            this.b = b;
            this.c = c;
    }

    private double getDiscriminant(){
        double d;
        d = b*b - 4*a*c;
        return d;
    }

    public Collection getSolution() throws MyException{
        Collection solution = new ArrayList();
        double x1,x2;
        if (a == 0){
            x1 = -c/b;
            solution.add(x1);
        }
        else{
            double D = this.getDiscriminant();
            if (D>0){
                x1 = (-b + Math.sqrt(D))/(2*a);
                x2 = (-b - Math.sqrt(D))/(2*a);
                solution.add(x1);
                solution.add(x2);
            }
            else if (D==0){
                x1 = (-b)/(2*a);
                solution.add(x1);
            }
            if (D < 0){
                throw new MyException("При данных значениях коэффициентов A, B, C невозможно найти значение в пределах действительных чисел");
        }
            }
        return solution;
    }
    public void showSolution(Collection solution){
        System.out.println(solution);
    }
}
