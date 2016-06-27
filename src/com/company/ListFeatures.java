package com.company;

import java.text.SimpleDateFormat;
import java.util.*;


/**
 * Created by yby on 2016/6/27.
 */
public class ListFeatures {
    public static void main(String[] args){

//        Random radn = new Random(47);
//        List<Pet> pets = Pets.arrayList(7);
//        print(pets);
//
//        Hamster h = new Hamster();
//        pets.add(h);
//        print(pets);
//        print(pets.contains(h));
//
//        pets.remove(h);
//        Pet p = pets.get(2);
//        print(pets.indexOf(p));
//
//        pets.add(3, p);
//
//
//        Iterator<Pet> iter = pets.iterator();
//        while(iter.hasNext()){
//            System.out.println(iter.next());
//            iter.remove();
//        }
//        for(Pet pp:pets){
//            System.out.println(p);
//        }
//
//

        //牛客
        //demoSet();
       // demoKeyValue();
        //demoException();
//        try{
//            demoException2();
//        }catch (NullPointerException npe){
//            print("npe");
//        }catch(Exception e){
//            print("excep");
//        }finally {
//            print("finally");
//        }


        //demoCommon();
        demoClass();


    }
    public static void demoClass(){
        Animal animal = new Animal("jin", 1);
        animal.say();
        Animal animal2 = new Human("jin", 1, "china");
        animal2.say();
    }

    public static void demoCommon(){
        Random random = new Random();
        random.setSeed(11);
        print(random.nextInt(12));

        List<Integer> array = Arrays.asList(new Integer[]{1,2,3,4});
        print(array);
        Collections.shuffle(array);
        print(array);

        Date date = new Date();
        print(date);
        SimpleDateFormat form = new SimpleDateFormat("yyyy/MM/dd");
        print(form.format(date));

    }

    public static void demoException2() throws Exception{

        Exception e = new Exception();
        throw e;
    }
    public static void demoException(){
        try{
            print("hello");
            String a = null;
            a.indexOf('a');
        }catch (NullPointerException npe){
            print("npe");
        }catch(Exception e){
            print("excep");
        }finally {
            print("finally");
        }

    }
    public static void demoKeyValue(){

        Map<String, String> map = new HashMap<>();
        for (int i = 0; i < 4; i++) {
            map.put(String.valueOf(i), String.valueOf(i*i));
        }
        print(map);

        print(map.keySet());
        print(map.values());
        print(map.containsKey("1"));
        print(map.get("2"));
        print(map.replace("2","str"));
    }
    public static void demoSet(){
        Set<String> strSet = new HashSet<String>();

        for(int i=0; i<3; ++i){
            strSet.add(String.valueOf(i));
        }
        print(strSet);
        strSet.remove("1");
        strSet.contains("4");
    }
    static void  print( Object o){
        numIn++;
        System.out.println(numIn+":  "+o.toString());

    }
//    void print(int num, Collections o){
//        System.out.println(num+o.toString());
//    }

    static int numIn = 0;
}
