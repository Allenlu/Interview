package interview;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WalMart {

    public static void main(String[] args){
        String[] problems = new String[]{"abc","bcd","abc","cdf"};
        String[] ans =solution(problems,10);
        System.out.println(String.join(",", ans));
    }

    private static String[] solution(String[] problems,int topN){
        Map<String,Integer> counterMap= new HashMap<>();
        for(String problem:problems){
            Integer cnt = counterMap.getOrDefault(problem,0);
            counterMap.put(problem,++cnt);
            System.out.printf("cnt cal: key %s value %s%n",problem,cnt);
        }

        List<String> ans = counterMap.entrySet().stream()
                .sorted((entryA,entryB)-> entryB.getValue()-entryA.getValue())
                .map(Map.Entry::getKey)
                .toList();

        return ans.size()<topN?
                ans.toArray(new String[0]):
                ans.subList(0,topN).toArray(new String[topN]);
    }
}
