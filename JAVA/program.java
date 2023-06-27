package JAVA;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Random;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Scanner;
import java.util.Stack;
// /**
//  * program
//  */
// public class program {
//     public static void main(String[] args) {
//         String s = null;
//         System.out.println(s);
       
//     }
    
// }

// class program
// {
//  public static void main(String[] args) {
//     short age = 10;
//     int salary = 123456;
//     float e = 2.7f;
//     double pi = 3.1415;
//     System.out.println(e); // 2.7
//     System.out.println(pi); // 3.1415
//     System.out.println(age); //10
//     System.out.println(salary); //123456
//     char ch = '1';
//     System.out.println(Character.isDigit(ch)); // true
//     ch = 'a';
//     System.out.println(Character.isDigit(ch)); // false
//     boolean flag1 = 123 <= 234;
//     System.out.println(flag1); // true
//     boolean flag2 = 123 >= 234 || flag1;
//     System.out.println(flag2); // true
//     boolean flag3 = flag1 ^ flag2;
//     System.out.println(flag3); // false
//     String msg ="Hello world";
//     System.out.println(msg); // Hello world
//     var a = 123;
//     System.out.println(a); // 123
//     var d = 123.456;
//     System.out.println(d); // 123.456
//     System.out.println(getType(a)); // Integer
//     System.out.println(getType(d)); // Double
//     d = 1022;
//     System.out.println(d); // 1022
//  //d = "mistake";
//  //error: incompatible types:
//  //String cannot be converted to double
//  }
//  static String getType(Object o){
//     return o.getClass().getSimpleName();
//  }
// }

// public class program {
//    public static void main(String[] args) {
//       int[] arr = new int[10];
//       System.out.println(arr.length); // 10
      
//       arr = new int[] { 1, 2, 3, 4, 5 };
//       System.out.println(arr.length); // 5
//    } 
// }

// public class program {
//    public static void main(String[] args) {
//       int[] arr[] = new int[3][5];
//          for (int[] line : arr) {
//             for (int item : line) {
//             System.out.printf("%d ", item);
//             }
//       System.out.println();
//       }
//    }
// }


// public class program {
//    public static void main(String[] args) {
//       int[][] arr = new int[3][5];
//          for (int i = 0; i < arr.length; i++) {
//             for (int j = 0; j < arr[i].length; j++) {
//                System.out.printf("%d ", arr[i][j]);
//             }
//          System.out.println();
//          } 
//       }
// }
// import java.util.Scanner;
// public class program {
//  public static void main(String[] args) {
//  Scanner iScanner = new Scanner(System.in);
//  System.out.printf("name: ");
//  String name = iScanner.nextLine();
//  System.out.printf("Привет, %s!", name);
//  iScanner.close();
//  }
// }

// public class program {
//  public static void main(String[] args) {
//  int a = 1, b = 2;
//  int c = a + b;
//  String res = String.format("%d + %d = %d \n", a, b, c);
//  System.out.printf("%d + %d = %d \n", a, b, c);
//  System.out.println(res);
//  }
// }

// public class program {
//  static void sayHi() {
//  System.out.println("hi!");
//  }
//  static int sum(int a, int b) {
//  return a+b;
//  }
//  static double factor(int n) {
//  if(n==1)return 1;
//  return n * factor(n-1);
//  }
//  public static void main(String[] args) {
//  sayHi(); // hi!
//  System.out.println(sum(1, 3)); // 4
//  System.out.println(factor(5)); // 120.0
//  }}

// public class program {
//  public static void main(String[] args) {
//  int value = 321;
//  int count = 0;
//  while (value != 0) {
//  value /= 10;
//  count++;
//  }
//  System.out.println(count);
//  }
// }
// public class program {
//  public static void main(String[] args) {
//  int s = 0;
//  for (int i = 1; i <= 10; i++) {
//  s += i;
//  }
//  System.out.println(s);
//  }
// }

// public class program {
//  public static void main(String[] args) {
//  int arr[] = new int[] {1, 2, 4, 66, 44};
//  for (int item : arr) {
//  System.out.printf("%d ", item);
//  }
//  System.out.println();
//  }
// }

// import java.io.FileWriter;
// import java.io.IOException;
// public class program {
//  public static void main(String[] args) {
//  try (FileWriter fw = new FileWriter("file.txt", false)) {
//  fw.write("line 1");
//  fw.append('\n');
//  fw.append('2');
//  fw.append('\n');
//  fw.write("line 3");
//  fw.flush();
//  } catch (IOException ex) {
//  System.out.println(ex.getMessage());
//  }
//  } }



// public class program {
//     public static void main(String[] args) throws Exception {
//         String [] arrayData =  lib.ReadLineFromFile("dataForTask3.txt");
//         for(int i = 0; i < arrayData.length; i++) {
//             System.out.println(PrintLine(arrayData[i]));
//         }
        
//     }
//     public static StringBuilder PrintLine(String line) {
//         String line1 = line.replace("{", "");
//         String line2 = line1.replace("}", "");
//         String line3 = line2.replaceAll("\"", "");
//         String line4 = line3.replace("[", "");
//         String line5 = line4.replace("]", "");
//         StringBuilder result = new StringBuilder("");
//         String [] arrayData = line5.split(",");
//         String [] listName = {"Студент ", " получил ", " по предмету "};
//         for (int i =0; i < arrayData.length; i++) {
//             String[] arrData = arrayData[i].split(":");
//             result.append(listName[i]);
//             result.append(arrData[1]);
//             }
//         return result;
//     }
// }

// public class program {
//     public static void main(String[] args) {
//         Object o = new Object();
//         ArrayList list = new ArrayList();
//         list.add(1);
//         list.add(.34f);
//         list.add("Hello");
//         list.add(true);
//     }
// }

// public class program {
//     public static void main(String[] args) {
//         Object o = new Object();
//         ArrayList<Integer> list = new ArrayList<>();
//         ArrayList<Integer> list1 = new ArrayList<>();
//         for (int i = 0; i < 10;i++) {
//             list.add(new Random().nextInt(15));
//             list1.add(new Random().nextInt(15));
        //}
        // list.add(167);
        // list.add(9, 167);
        // list.addAll(list1);
        // list.addAll(2, list1);
        // list.size();
        // list.get(2);
        // list.set(2,6);

        // ArrayList<String> list3 = new ArrayList<>();
        // list3.add("1");
        // list3.add("2");
        // list3.remove(0);
        // list3.remove("2");

        // list.clear();
        // list.trimToSize();
        // list.ensureCapacity(100);

        // list.subList(0,list.size()/2);
        // ArrayList<Integer> list4 = (ArrayList<Integer>) list.subList(0, list.size()/2);

//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i));
//        }

//        for (int i: list) {
//            System.out.println(i);
//        }
//
//        Iterator<Integer> iterator = list.iterator();
//        while (iterator.hasNext()){
//            int i = iterator.next();
//            System.out.println(i);
//            iterator.remove();
//        }

//        ListIterator<Integer> iterator = list.listIterator(list.size()/2);
//        while (iterator.hasPrevious()){
//            int i = iterator.previous();
//            System.out.println(i);
//            iterator.remove();
//            iterator.nextIndex();
//        }

//        list1.clear();
//        list.forEach(n -> list1.add(0, n));

//         System.out.println(list);
//         System.out.println(list1);
//         System.out.println("-".repeat(16));

//        list.retainAll(list1);
//         list.removeAll(list1);

//         list1.sort(new Comparator<Integer>() {
//             @Override
//             public int compare(Integer o1, Integer o2) {
//                 if (o1%3 != 0) return 0;
//                 if (o2%2 != 0) return 1;
//                 return -1;
//             }
//         });

//         System.out.println(list1);

//         LinkedList<Integer> linkedList = new LinkedList<>();

//         linkedList.add(1);
//         linkedList.add(2);
//         linkedList.add(3);
//         linkedList.add(null);
//         linkedList.add(1);
//         int t = linkedList.get(4);

// public class program {
//     public static void main(String[] args) {
        
//         ArrayList<Integer> list = new ArrayList<>();
//         for (int i = 0; i < 5;i++) {
//             list.add(new Random().nextInt(15));
//         }
//         System.out.println(list);
//         for (int i = list.size() - 1; i >= 0; i--) {
//            int rem = list.get(i) % 2;
//                 if (rem == 0) {
//                     list.remove(i);
//                 }
//             }
//          System.out.println("Список с удаленными четными числами:"  + list);
//     }
// }

// public class program {
//     public static void main(String[] args) {
        
//         ArrayList<Integer> list = new ArrayList<>();
//         for (int i = 0; i < 5;i++) {
//             list.add(new Random().nextInt(15));
//         }
//         System.out.println(list);
//         int max = list.get(0);
//         for (int i = list.size() - 1; i >= 0; i--) {
//             if (list.get(i) > max) {
//                max = list.get(i);
//             }
//         }
//       System.out.println("Максимальное значениe = "+max);  
//     }
// }

// public class program {
//     public static void main(String[] args) {
        
//         ArrayList<Integer> list = new ArrayList<>();
//         for (int i = 0; i < 5;i++) {
//             list.add(new Random().nextInt(15));
//         }
//         System.out.println(list);
//         int sum = 0;
//         int sr = 0;
//         for (int i = list.size() - 1; i >= 0; i--) {
//              sum = sum + list.get(i);
//              sr=sum/5;           
//         }
//       System.out.println("Cумма = "+sum);
//       System.out.println("Среднее арифмитическое = "+sr);  
//     }
// }


// public class program {
//     public static void main(String[] args) {
        
//         ArrayList<Integer> list = new ArrayList<>();
//         for (int i = 0; i < 5;i++) {
//             list.add(new Random().nextInt(15));
//         }
//         System.out.println(list);
//         int min = list.get(0);
//         for (int i = list.size() - 1; i >= 0; i--) {
//                 if (list.get(i) < min) {
//                     min = list.get(i);
//              }
//         }

//       System.out.println("Минимальное значениe = "+min);  
//     }
// }



// //Создать словарь. Ключ число, значение случайное число. Вывести пары в консоль
//  public class program {
//     public static void main(String[] args) {
//         Map<Integer, Integer> mp = new HashMap<Integer, Integer>();
//         for (int i = 0; i < 10; i++) {
//                 mp.put(i, new Random().nextInt(10));
//         }
//         for (var it : mp.entrySet())
//              System.out.println((it.getKey())+" "+it.getValue());
//      }

// }
// //Создать словарь. Ключ число, значение случайное число. Вывести пары в который
// //значение кратно 3 и не пользуясь методом EntrySet
// public class program {
//         public static void main(String[] args) {
//                 Map<Integer, Integer> mp = new HashMap<Integer, Integer>();
//                 for (int i = 0; i < 10; i++) {
//                         mp.put(i, new Random().nextInt(10));
//                 }
                
                
//                 for (int key: mp.keySet()) {
//                         if (mp.get(key) % 3 == 0){
//                         System.out.println(key + ": " + mp.get(key));
//                         }
//                 }
                
//         }
// }
// //Создать два словаря. Ключи - случайные числа, значение для первого словаря
// // мужские имена, а словарь воторой женские имена. Вывести мужские и женские имена
// //только если в обоих словарях есть соответствующий ключ.

// public class program {
//         public static void main(String[] args) {
//                 Map<Integer, String> man = new HashMap<Integer, String>();
//                 for (int i = 0; i < 4; i++) {
//                         Scanner iScanner = new Scanner(System.in);
//                         System.out.println("Введите мужское имя: ");
//                         String name = iScanner.nextLine();
//                         man.putIfAbsent(new Random().nextInt(10), name);
//                 }

//                 Map<Integer, String> women = new HashMap<Integer, String>();
//                 for (int i = 0; i < 4; i++) {
//                         Scanner iScanner = new Scanner(System.in);
//                         System.out.println("Введите женское имя: ");
//                         String name = iScanner.nextLine();
//                         women.putIfAbsent(new Random().nextInt(10), name);
//                 }
//                 for (var item : man.entrySet()) {
//                         System.out.println(item.getKey() + " " + item.getValue());         
//                 }
//                 System.out.println();
//                 for (var item : women.entrySet()) {
//                         System.out.println(item.getKey() + " " + item.getValue());
                        
//                 }
//                 for (int key : man.keySet()) {
//                         if (women.containsKey(key)) {
//                                 System.out.println(key + " " + man.get(key) + " " + women.get(key));
//                         }
//                 }

//         }
// }

// //Создать словарь. Ключ индекс, значение случайное число. Заменить значения их квадрами.
//  public class program {
//     public static void main(String[] args) {
//         Map<Integer, Integer> mp = new HashMap<Integer, Integer>();
//         for (int i = 0; i < 10; i++) {
//                 mp.put(i, new Random().nextInt(10));
//         }
//         System.out.println(mp);
//         for (int i = 0; i < mp.size(); i++) {
//                 mp.replace(i, mp.get(i)*mp.get(i));
//         }
//         System.out.println(mp);
//      }
//  }

// //Реализовать предыдущие задание без циклов

//  public class program {
//     public static void main(String[] args) {
//         Map<Integer, Integer> mp = new HashMap<Integer, Integer>();
//         for (int i = 0; i < 10; i++) {
//                 mp.put(i, new Random().nextInt(10));
//         }
//         System.out.println(mp);
//         mp.forEach((k,v) -> {
//                 mp.replace(k, v*v);
//                 System.out.println(mp.get(k));               
//         });
//         System.out.println(mp);
//     }
// }

// //Реализовать предыдущие задание без циклов и forEach.
//  public class program {
//     public static void main(String[] args) {
//         Map<Integer, Integer> mp = new HashMap<Integer, Integer>();
//         for (int i = 0; i < 10; i++) {
//                 mp.put(i, new Random().nextInt(10));
//         }
//         mp.replaceAll((k, v) -> (v * v));
//         System.out.println(mp);    
//     }
// }

public class program {

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



