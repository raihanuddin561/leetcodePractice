package dsaPractice;

public class FindUnique {
    public static void main(String[] args) {
        int[] arr={2,3,3,4,2,6,4};
        System.out.println(findUnique(arr));
    }

    private static int findUnique(int[] arr) {
        int unique=0;
        for(int a:arr){
            unique^=a;
        }
        return unique;
    }
}
