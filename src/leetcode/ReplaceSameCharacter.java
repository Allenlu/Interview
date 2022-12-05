package leetcode;

import java.util.ArrayList;
import java.util.List;

public class ReplaceSameCharacter {

    public static Object[] test2(Object arr[]){
        int t=0;
        Object[] test2=new Object[arr.length];
        for (int i=0;i< arr.length;i++){
            boolean isTrue=true;
            for (int j=i+1;j< arr.length;j++){
                if (arr[i]==arr[j]){
                    isTrue=false;
                    break;
                }
            }
            if (isTrue){
                test2[t]=arr[i];
                t++;
            }
        }
        Object[] newArr=new Object[t];
        System.arraycopy(test2,0,newArr,0,t);
        return newArr;
    }


    public static Object[] test3(String[] arr){
        List<String> ans = new ArrayList<>();
        for(String e:arr){
            if(!ans.contains(e)){
                ans.add(e);
            }
        }
        return ans.toArray();
    }
    public static void main(String[] args){
//        String[] arr=new String[6];
//        arr[0]="a";
//        arr[1]="a";
//        arr[2]="a";
//        arr[3]="c";
//        arr[4]="a";
//        arr[5]="d";
//        System.out.println("去重前：");
//        for (int i=0;i< arr.length;i++){
//            System.out.println(arr[i].toString());
//        }
//        System.out.println("去重后：");
//        Object[] s=test3(arr);
//        for (int j=0;j<s.length;j++){
//            System.out.println(s[j].toString());
//
//        }
        }
}
