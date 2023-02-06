package LibertyItInterview;

public class Task2Version2 {

    public static void main(String[] args) {
        int[] A=new int[]{5,19,8,1};
        int[] A1=new int[]{10,10};
        int[] A2=new int[]{3,0,5};

        // object of the solution
        Task2Version2 answerSolution = new Task2Version2();
        System.out.println("Answer : " + answerSolution.solution(A2));



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
        double updatedPollution =0;

        double sumPollution2 = 0;



        if (sumPollution > desiredPollution) {
//            double desiredPollution2 = sumPollution2 / 2;

            for (int j = 0; j < A.length-1; j++) {
//                double desiredPollution2 = sumPollution2 / 2;
                sumPollution2=sumPollution2+A[j];

                if(sumPollution2>=sumPollution2/2){
                    if(updatedPollution<sumPollution) {
                        updatedPollution = updatedPollution + (A[j] / 2);
                        filters++;
                    }

                }

            }
            System.out.println("Amount of the filters: " + filters);
        }
        System.out.println("Amount of polution after division: "+updatedPollution);
        System.out.println("Sum of the pollution in the all factories NEW: " + sumPollution2);
//        System.out.println("desired polution NEW: "+ desiredPollution2);
        return filters;
    }




}
