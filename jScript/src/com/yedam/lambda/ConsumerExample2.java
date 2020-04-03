package com.yedam.lambda;

import java.util.function.BiConsumer;

class Stude {
   String name;
   int age;

   public Stude(String name, int age) {
      this.name = name;
      this.age = age;
   }

   void getInfo() {
      System.out.println("이름: " + this.name + ", 나이: " + this.age);
   }
}

public class ConsumerExample2 {
   public static void main(String[] args) {
      BiConsumer<Students, String> biCon = (std, str) -> {
         System.out.println(str + " ");
         std.getInfo(); // 안녕하세요 이름:?? 나이: ??
      };
      Students s1 = new Students("Seo ", 18);
      String s2 = "안녕.";
     biCon.accept(s1, s2); // 어셉트는 리턴타입 없다
   //   printAccept(biCon, s1, s2);
   }

   // 인터페이스가 매개값으로 들어 갈 수도 있다.
   static <T, U> void printAccept(BiConsumer<Stude, String> biCon, 
                           Stude std, 
                           String str) {
      
      biCon = (s1, s2) -> {
         System.out.println(s2 + " ");
         s1.getInfo();
      };
      biCon.accept(new Stude("Kim", 33), "ㅇ앙녕");

   } // e of m
}// e of c