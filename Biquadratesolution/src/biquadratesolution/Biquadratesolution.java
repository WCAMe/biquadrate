package biquadratesolution;

public class Biquadratesolution {


    public static void main(String[] args) {
       BiquadraticEquation bqe = new BiquadraticEquation(1,2,1);
       double[] solution;
       solution = bqe.getSolution();
       for (int i = 0; i < 2;i++){
       System.out.println(solution[i]);
       }
    }
    
}
