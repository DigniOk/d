package JAVA;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

public class HW4 {
    static void sortedPrint(Map<String, ArrayList> map) {

                Set<String> keySet = map.keySet();
                int maxCount = 0;
                int minCount = 1_000_000;

                for (var item : map.entrySet()) {
                        if (maxCount < item.getValue().size())
                                maxCount = item.getValue().size();
                        if (minCount > item.getValue().size())
                                minCount = item.getValue().size();

                }

                Stack<String> st = new Stack<>();
                int num = minCount;
                while (num <= maxCount) {
                        for (var item : map.entrySet()) {
                                if (item.getValue().size() == num) {
                                        st.push(item.getKey());
                                }
                        }
                        num += 1;
                }
                String name;
                for (int i = 0; i < keySet.size(); i++) {
                        name = st.pop();
                        for (var item : map.entrySet()) {
                                if (name == item.getKey()) {
                                        System.out.printf("%8s: ", item.getKey());
                                        System.out.println(item.getValue());
                                }
                        }
                }
                System.out.println();
        }
        
        public static void main(String[] args) {
                Map<String, ArrayList> contact = new HashMap<>() {
                        {
                                put("Крапивин", new ArrayList<Integer>() {
                                        {
                                                add(534534534);
                                                add(534534534);
                                                add(756756756);
                                        }
                                });
                                put("Антонов", new ArrayList<Integer>() {
                                        {
                                                add(454543534);
                                        }
                                });
                                put("Петров", new ArrayList<Integer>() {
                                        {
                                                add(444444446);
                                                add(232377878);

                                        }
                                });
                                put("Иванов", new ArrayList<Integer>() {
                                        {
                                                add(886644878);
                                                add(555222878);
                                                add(182830767);
                                                add(999999767);
                                        }
                                });
                        }
                };
                System.out.println("Справочник: ");
                sortedPrint(contact);
        }
}
    

