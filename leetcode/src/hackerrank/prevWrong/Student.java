package hackerrank.prevWrong;

import java.util.Arrays;

public class Student extends Person{
    int[] testScores;
    public Student(String firstName,String lastName,int idNumber,int[] testScores){
        super(firstName,lastName,idNumber);
        this.testScores = testScores;
    }

    public char calculate(){
        int sum = Arrays.stream(testScores).sum();
        int avg = sum/testScores.length;
        return checkAvg(avg);
    }

    private char checkAvg(int avg) {
       if(avg<40){
           return 'T';
       }else if(avg>=40 && avg<55){
           return 'D';
       } else if (avg>=55 && avg<70) {
           return 'P';
       } else if (avg>=70 && avg<80) {
           return 'A';
       } else if (avg>=80 && avg<90) {
           return 'E';
       } else if (avg>=90 && avg<=100) {
           return 'O';

       }
       return ' ';

    }
}
