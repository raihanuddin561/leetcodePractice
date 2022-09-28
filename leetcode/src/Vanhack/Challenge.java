package Vanhack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Challenge {
    public static final String SLASH_N="\n";
    public static final String SLASH_N_STRING="slash_n";
    public static ArrayList<ArrayList<String>> parseCsv(
        String csv,
        String separator,
        String quote
    ) {
        StringBuilder sb = new StringBuilder();
        if(separator.equals(".")||separator.equals("$")||separator.equals("\\")) {
            sb.append("\\");
            sb.append(separator);
        }
        separator=sb.toString();
        ArrayList<ArrayList<String>> result = new ArrayList<>();
        if(csv.isEmpty()) {
            result.add(new ArrayList<>(Arrays.asList(csv)));
            return result;
        }
        Pattern ptrn = Pattern.compile("(?ism)"+quote+".*?"+quote);
        Matcher matcher = ptrn.matcher(csv);
        while (matcher.find()){
            String txt = matcher.group(0);
            String newTxt = txt.replaceAll(SLASH_N,SLASH_N_STRING);
            csv=csv.replaceAll(txt,newTxt);
        }
        String[] rows = csv.split(SLASH_N);
        for(String s:rows){
            ArrayList<String> list = new ArrayList<>();
            String[] cols = s.split(separator);
            for(String st:cols){
                if(st.length()>2&&st.charAt(0)=='"'&&st.charAt(st.length()-1)=='"'){
                    st=st.substring(1,st.length()-1);
                }
                list.add(st.replaceAll(SLASH_N_STRING,SLASH_N));
            }
            result.add(list);

        }
        return result;
    }

}