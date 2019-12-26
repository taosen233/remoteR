package com.company;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {
    public  static  void print(int i,Object obj){
        System.out.println(String.format("{%d} %s",i,obj.toString()));
    }

    public  static  void demoList(){
        List<String> strList = new ArrayList<String>();
        for(int i = 0;i<3;i++){
            strList.add(String.valueOf(i));
        }
        List<String> strListB = new ArrayList<String>();
        for(int i = 0;i<3;i++){
            strListB.add(String.valueOf(i*i));
        }
        strList.addAll(strListB);
        Collections.sort(strList);
        print(1,strList);
        Collections.reverse(strList);
        print(2,strList);
        Collections.sort(strList, new Comparator<String>() {
            @Override
            public int compare(String s, String t1) {
                return s.compareTo(t1);
            }
        });
        print(3,strList);
    }

    public static  void demoMap(){
        Map<Integer,String> map=new HashMap<Integer, String>();
        for(int i =0;i<4;i++){
            map.put(i,String.valueOf(i*i));
        }
        print(1,map);
        for(Map.Entry entry:map.entrySet()){
            print(2,entry.getKey()+";"+entry.getValue());
        }
        print(3,map.keySet());
        print(4,map.values());
        print(5,map.containsKey(2));
        map.replace(1,"A");
        print(7,map);
    }

    public static void demoCommon(){
        Random r = new Random(2);
        for(int i = 0;i<3;i++){
            print(1,r.nextInt(100));
        }
        Date d = new Date();
        print(2,d);
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        print(3,df.format(d));
        print(4,DateFormat.getDateInstance(DateFormat.FULL).format(d));
        print(9,UUID.randomUUID());
        print(6,Math.floor(2.5));
    }

    public static void main(String[] args) {
        // write your code her
//        System.out.println("hello");
//        String str = "hello world";
//        System.out.println(str.indexOf("l"));
//        print(1,str.indexOf("o"));
//        print(2,str.charAt(6));
//        print(3,str.codePointAt(1));
//        print(4,str.concat("!!"));
//        print(5,str.replaceAll("o|l","a"));
//
//        StringBuffer sb = new StringBuffer();
//        sb.append(true);
//        sb.append(1);
//        sb.append(2.2);
//        print(6,sb.toString());
//        demoList();
//        demoMap();
        demoCommon();
    }
}
