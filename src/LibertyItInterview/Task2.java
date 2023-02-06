package LibertyItInterview;

public class Task2 {

    public static void main(String[] args) {
        int[] A=new int[]{5,19,8,1};
        int[] A1=new int[]{10,10};
        int[] A2=new int[]{3,0,5};

        // object of the solution
        Task2 answerSolution = new Task2();
        System.out.println("Answer : " + answerSolution.solution(A));



    }

    public int solution(int[] A) {
        int filters = 0;
        double sumPollution = 0;

        //find the sum pollution
        for (int i = 0; i < A.length; i++) {
            sumPollution = sumPollution + A[i];
        }
        double desiredPollution = sumPollution / 2;
        System.out.println("Sum of the pollution in the all factories: " + sumPollution);
        System.out.println("desired polution: "+ desiredPollution);
        int updatedPollution =0;

        if (sumPollution > desiredPollution) {
            for (int j = 0; j < A.length; j++) {
                sumPollution=sumPollution+A[j];
                if(sumPollution>desiredPollution){
                    sumPollution=sumPollution+(A[j]/2);
                    filters++;
                }
            }
            System.out.println("Amount of the filters: " + filters);
        }
        System.out.println("Amount of polution after division: "+updatedPollution);
        return filters;
    }

}
