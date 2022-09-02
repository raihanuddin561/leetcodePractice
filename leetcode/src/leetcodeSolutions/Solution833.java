package leetcodeSolutions;

public class Solution833 {
    public String findReplaceString(String s, int[] indices, String[] sources, String[] targets) {
        String sb= s;
        for(int i=0;i<indices.length;i++){
            int index=indices[i];
            String source=sources[i];
            int sourcLength=index+source.length();
            sourcLength=sourcLength>s.length()?s.length():sourcLength;
            String target=targets[i];
            String subString = s.substring(index,sourcLength);
            if(subString.equals(source)){
               sb= sb.replace(source,target);
            }
        }
        return sb;
    }
}
