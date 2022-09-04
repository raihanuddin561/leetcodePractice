package dsaPractice;

public class SkipString {
    public static void main(String[] args) {
        String s="baccappled";
      //  String s="baccad";
      //  System.out.println(skip(s,'a'));
        System.out.println(skipWord(s,"apple"));
    }
   /* static String subString(String s,int i,char c){
        if(i==s.length()) return s;
        String sub = "";
        if(i<s.length()-1&&s.charAt(i)==c)  {
            sub = s.substring(i+1);
            s=s.substring(0,i)+sub;
        }
        else i++;

        return subString(s,i,c);
    }*/

    static String skip(String s,char c){
        if(s.isEmpty()) return "";
        char ch = s.charAt(0);
        if(c==ch) return skip(s.substring(1),c);
        else return ch+skip(s.substring(1),c);
    }
    static String skipWord(String s, String word){
        if(s.isEmpty()) return "";
        if(s.startsWith(word)) return skipWord(s.substring(word.length()),word);
        else return s.charAt(0)+skipWord(s.substring(1),word);
    }
}
