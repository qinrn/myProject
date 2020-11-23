package train.arithmetic.luogu;

import java.util.Scanner;

public class P1143_JinZhiZhuanHuan_M1 {// 方法1:不用Integer
	    static int First ;
	    static String num ;
	    static int Last ;
	    static long tenNum ;
	    static String ans ;
	    
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        
	        First = sc.nextInt();
	        num = sc.next();
	        Last = sc.nextInt();
	        tenNum = 0;
	        ans = "";
	        
	        String[] str = num.split("");
	        
	        for (int i = 0; i < str.length; i++) {
	            switch(str[i]) {
	                case "A" :
	                    str[i] = "10";
	                    break;
	                case "B" :
	                    str[i] = "11";
	                    break;
	                case "C" :
	                    str[i] = "12";
	                    break;
	                case "D" :
	                    str[i] = "13";
	                    break;
	                case "E" :
	                    str[i] = "14";
	                    break;
	                case "F" :
	                    str[i] = "15";
	                    break;
	            }
	            
	            
	        }
	        to_TEN(First,str);
	        
	        to_AIM(Last,tenNum);
	        
	        System.out.println(ans);        
	    }

	    private static void to_AIM(int l, long ten) {
	        int cur = 0;
	        while(ten > 0) {
	            cur = (int) (ten%l);
	            ten = ten / l;
	            if (cur > 9) {
	                switch(cur) {
	                case 10 :
	                    ans = "A"+ans;
	                    break;
	                case 11 :
	                    ans = "B"+ans;
	                    break;
	                case 12 :
	                    ans = "C"+ans;
	                    break;
	                case 13 :
	                    ans = "D"+ans;
	                    break;
	                case 14 :
	                    ans = "E"+ans;
	                    break;
	                case 15 :
	                    ans = "F"+ans;
	                    break;
	                }
	            }else {
	                ans = cur+ans;
	            }           
	        }       
	    }

	    private static void to_TEN(int f ,String[] s) {     
	        for (int i = 0; i < s.length; i++) {
	            int curNum = 0 ;
	            for (int j = 0; j < s[i].length(); j++) {
	                curNum *= 10;
	                curNum += (s[i].charAt(j) - '0');
	            }           
	            tenNum = (tenNum * f) + curNum;
	        }       
	    }

}
