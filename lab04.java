/*
 * lab04.java
 * 
 * Copyright 2021 S. Betül YAZICIOĞLU <S. Betül YAZICIOĞLU@SENABETUL>
 * 
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301, USA.
 * 
 * 
 */
import java.util.Scanner;


public class anonymous {
	
/*sena betul yazicioglu-20120205061
*yazicioglusenabetul@gmail.com
* bu program verilen sayilarin faktoriyel,fibonacci,ebob hesabini yapar ve verilen sayinin piramidini olusturur.
* Collatz sanisiyla da verilen sayinin dizisini bulup, dizinin uzunlugunu yazdirir
*/
import java.util.Scanner; 
    
    long factorial(int n){
        
        int f=1; /* f-->factorial */
        
        for(int i=1 ; i<=n ; i++){
            f*=i;
        }
        return f;
    }
    
    long fibonacci(int n){
        
        if(n==0 || n==1){
        return n;
        }
        return fibonacci(n-1) + fibonacci(n-2);
        
    }   
    
    void printPyramidNumbers(int satir){
        
        int i,j;
        
        for(i=1 ; i<=satir ; i++){
            
            for(j= 1 ; j<=i ; j++ ){
                System.out.print(j);
                
            }
            
             System.out.println();
            
        }
        
    }
    
    int gcd(int a, int b){
        
        if(b==0){
        return a;
        }
        return gcd(b,a%b);
    }		
    
    
    int lengthOfCollatzSeq(int n){
     
     int sayac=1;
     
     while (n != 1)
        {
        
        System.out.print(n + " ");
        
        if(n%2==0){
            n=n/2;
        }
        else
           n=3*n+1;
       
       sayac++;
        }
     
     return sayac;
       
        
    }
 
}

