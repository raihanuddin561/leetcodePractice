package codilePractice;

public class Practice {
    public static void main(String[] args) {
        /*MissingNumber sd = new MissingNumber();
        int[] arr = {1, 2, 3};
       int missing = sd.solution(arr);
        System.out.println(missing);*/
      /*  CropMessage cm = new CropMessage();
        String msg = "I love c oding. I am not pro. I am learner. So I love to join to get knowledge";
        String sort = cm.croppedMsg(msg,8);
        System.out.println(sort);*/
        PollutionFilter pf = new PollutionFilter();
       int r= pf.solution(new int[]{4,0,5});
        System.out.println(r);
    }
}
