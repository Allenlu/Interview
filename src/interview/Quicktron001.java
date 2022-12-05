package interview;

public class Quicktron001 {

    public static void main(String[] args){
        int[] source = new int[]{1,3,3,5,2,2,5};
        int ans = solution(source);
        System.out.println("ans ="+ans);
    }

    private static int solution(int[] sources){
        if(sources==null||sources.length==0){
            return -1;
        }
        int ans = 0;
        for(Integer item : sources){
            ans = item^ans;
        }
        return ans;
    }

}
