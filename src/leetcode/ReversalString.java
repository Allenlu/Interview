package leetcode;

public class ReversalString {

    public static void main(String[] args){
        String problem = "www.taobao.com";
        String ans = solution(problem);
        System.out.println(ans);
    }

    private static String solution(String problem){
        if(problem==null||problem.length()==0)return null;
        StringBuilder ans =new StringBuilder();
        String[] temp = problem.split("\\.");
        for(int i = temp.length-1;i>=0;i--){
            ans.append(temp[i]);
            if(i!=0)
                ans.append(".");
        }
        return ans.toString();
    }
}
