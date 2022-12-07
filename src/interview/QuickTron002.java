package interview;

public class QuickTron002 {

    public static void main(String[]args){
        String problem = "ABCCEFFFG";
        String ans =solution(problem);
        System.out.printf("duplication STR:%s",ans);
    }


    private static String solution(String problem){
        if(problem==null||problem.isBlank()){
            return "";
        }
        int left = 0;
        String ans = "";
        StringBuilder duplicationStr = new StringBuilder();
        for(int end = left+1 ; end < problem.length();end++){
            Character cInLeft = problem.charAt(left);
            Character cInEnd = problem.charAt(end);
            if(!cInLeft.equals(cInEnd)){
                left = Math.max(left,end+1);
                ans = ans.length() < duplicationStr.length()? duplicationStr.toString():ans;
                duplicationStr.setLength(0);
            }else{
                duplicationStr.append(cInEnd);
            }
        }
        return ans;
    }
}
