package biquadratesolution;

public class Biquadratesolution {


    public static void main(String[] args) {
       BiquadraticEquation BQE = new BiquadraticEquation(1,2,1);
       double[] Solution;
       Solution = BQE.GetSolution();
       for (int i = 0; i < 2;i++){
       System.out.println(Solution[i]);
       }
    }
    
}
