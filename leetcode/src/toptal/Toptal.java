package toptal;

public class Toptal {
    public static void main(String[] args) {
        /*
        T[0] = "test1a"  R[0] = "Wrong answer"
T[1] = "test2"   R[1] = "OK"
T[2] = "test1b"  R[2] = "Runtime error"
T[3] = "test1c"  R[3] = "OK"
T[4] = "test3"   R[4] = "Time limit exceeded"
         */
        /*SolutionToptal st = new SolutionToptal();
        String[] T = {"test2","test1b" ,"test1c","test3"};
        String[] R = {"OK","Runtime error","OK","Time limit exceeded"};
        st.solution(T,R);*/
        SolutionToptal3 st3 = new SolutionToptal3();
       // int[] arr = {2,1,3};
        //int[] arr = {2,1,4};
        int[] arr = {0,4,3,-1};
        st3.solution(arr,2);
    }
}
