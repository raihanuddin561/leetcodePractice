package codilePractice;

public class CropMessage {
    public String croppedMsg(String msg,int k){
        String subString = "";
        int limit = k;
        if(msg.charAt(k-1)==' '){
           subString= msg.substring(0,k-1);
        }else {
            while (msg.charAt(limit)!=' '){
                limit--;
            }
            subString = msg.substring(0,limit);
        }
        return subString.trim();
    }
}
