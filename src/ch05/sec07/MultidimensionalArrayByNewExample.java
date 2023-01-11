package ch05.sec07;

public class MultidimensionalArrayByNewExample {
    public static void main(String[] args) {

        int[][] mathScores = new int[2][3];

        for (int i = 0; i< mathScores.length; i++) {
            for ( int k=0; k< mathScores[i].length; k++) {

                System.out.println("mathScores[" + i + "] : " + mathScores[i][k]);
            }
        }
        System.out.println();

        mathScores[0][0] = 80;
        mathScores[0][1] = 83;
        mathScores[0][2] = 85;
        mathScores[1][0] = 86;
        mathScores[1][1] = 90;
        mathScores[1][2] = 92;

        int totalStudent = 0;
        int totalMathSum = 0;
        for (int i=0; i< mathScores.length; i++){
            totalStudent += mathScores[i].length;
            for(int k =0; k<mathScores[i].length; k++) {
                totalMathSum += mathScores[i][k];
            }
        }
        double totalMathAvg = (double) totalMathSum/ totalStudent;
        System.out.println("전체 학생의 수학 평균 점수 :" + totalMathAvg);
        System.out.println();

        //각 반의 학생 수가 다를 경우 점수 저장을 위한 2차원 배열 생성
        int[][] ennglishScores = new int[2][];
        ennglishScores[0] = new int[2]; // 여기 짚고 넘어가야됨 나중에.
        ennglishScores[1] = new int[3];

        for(int i=0; i< ennglishScores.length; i++) {
            for (int k = 0; k < ennglishScores[i].length; k++) {
                System.out.println("englishScore[" + i + "][" + k + "] " + ennglishScores[i][k]);
            }
        }
        ennglishScores[0][0] = 90;
        ennglishScores[0][1] = 91;
        ennglishScores[1][0] = 92;
        ennglishScores[1][1] = 93;
        ennglishScores[1][2] = 94;

        totalStudent = 0;
        int totalEnglishSum = 0;
        for(int i=0; i<ennglishScores.length; i++){
            totalStudent += ennglishScores[i].length;
            for (int k=0; k<ennglishScores[i].length; k++) {
                totalEnglishSum += ennglishScores[i][k];
            }
        }
        double totalEnglishAvg = (double) totalEnglishSum/totalStudent;
        System.out.println("전체 학생의 영어 평균 점수:" + totalEnglishAvg);
    }
}
