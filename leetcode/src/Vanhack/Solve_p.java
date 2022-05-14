package Vanhack;

public class Solve_p {
    public static int bowling_score(String frames) {
        String[] bowls = frames.split(" ");
        int total = 0;
        int next = 0;
        int counter = 0;
        boolean bonus = false;
        int doubleBonus = 0;
        int start = 0,end =bowls.length-1;
        while (start<end){
            String s = bowls[start];
            if(s.equals("X")){
                total+=10;
                next = start+1;
                if(next==end){
                    if(bowls[next].toCharArray()[0]=='X') {
                        total += calculatePoint(bowls[next].toCharArray(), 2);
                    }else total += calculatePoint(bowls[next].toCharArray(), 2);

                }else if(next<end){
                    if(bowls[next].equals("X")){
                        total +=10;
                        next = next+1;
                        if(bowls[next].equals("X")){
                            total+=10;
                        }else {
                            total+=parsingInt(String.valueOf(bowls[next].toCharArray()[0]));
                        }
                    }else {
                        if(bowls[next].contains("/")) total+=10;
                        else total+=calculatePoint(bowls[next].toCharArray(),2);
                    }
                }
            } else if (bowls[start].contains("/")) {
                next = start+1;
                total += calculatePoint (bowls[next].toCharArray(),1)+10;

            }else total+= calculatePoint(bowls[start].toCharArray(),2);
            start++;
        }
        if(start==end){
            total+=calculateLastPoint(bowls[start]);
        }


        System.out.println("Total point: "+total);

        return total;
    }

    private static int calculateLastPoint(String bowl) {
        char[] arr = bowl.toCharArray();
        int p = 0;
        for(char c:arr){
            if(c=='X'){
                p+=10;
            }else if(c=='/'){
                p+=10-parsingInt(String.valueOf(arr[0]));
            }else p+=parsingInt(String.valueOf(c));
        }
        return p;
    }

    static int parsingInt(String s){
        if(s.equals("X")){
            return 10;
        }
        return  Integer.parseInt(s);
    }
    private static int calculatePoint(char[] arr,int length) {
        int point = 0;

        for(int i=0;i<length;i++){
            if(arr[i]=='X'){
                point+=10;
            }else if(arr[i]=='/'){
                point+=(10-parsingInt(String.valueOf(arr[0])));
            }else point+=parsingInt(String.valueOf(arr[i]));
        }
        return point;
    }
}
