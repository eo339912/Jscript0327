package com.yedam.lambda;

import java.util.Scanner;
import java.util.function.BooleanSupplier;
import java.util.function.IntSupplier;

public class SupplierExample {
   public static void main(String[] args) {
      IntSupplier intSup = () -> { //getAsInt( 매개값은 없는데 반환값은 있음      
         int num = (int) (Math.random() * 6) + 1;
         return num;  
      };
      int result = intSup.getAsInt();
      System.out.println(result); //실행시 1~6까지 무작위 숫자 추첨
      
      BooleanSupplier boolSup = () -> {
    	  Scanner scn = new Scanner(System.in);
    	  
    	  int num = (int) (Math.random() * 6) + 1;
    	  System.out.println(num);
    	  System.out.println("값을 입력하세요.");
    	  int inputValue = scn.nextInt();
    	      	  
    	  if(num == inputValue) {
    		  return true; 
    	  }else {    		  
    		  return false;  
    	  }
      };
      if(boolSup.getAsBoolean()) {
    	  System.out.println("같습니다.");
      }else{
    	  System.out.println("다릅니다.");
      };
      
   } // e of m
} // e of c