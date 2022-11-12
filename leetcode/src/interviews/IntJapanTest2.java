package interviews;

public class IntJapanTest2 {
    public static void main(String[] args) {
        String[] wordList = {"hot", "dot", "dog", "lot", "log", "cog"};
        solution("hit","cog",wordList);
    }
    static int solution(String beginWord, String endWord, String[] wordList) {
        boolean[] check = new boolean[endWord.length()];
        int counter =1;
        for(String word:wordList){
            boolean taken =false;
            for(int i=0;i<word.length();i++){
                if(word.charAt(i)==endWord.charAt(i)&&!check[i]){
                    taken = true;
                    check[i]=true;
                }
            }
            if(taken) counter++;
        }
        return counter++;
    }
}
