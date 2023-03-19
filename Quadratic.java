/*
 * Quadratic.java
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

public class Quadratic{
 
 double a,b,c,x1,x2;

public double getX1(){
  return this.x1;
}

public double getX2(){
  return this.x2;
}

public double getDiscriminant(){

  double d = b*b - (4*a*c);
  return d;
}

public Quadratic(double a,double b,double c){
  
  this.a=a;
  this.b=b;
  this.c=c;
  
  double d = getDiscriminant();
  x1 = (-b + Math.sqrt(d))/(2*a);
  x2 = (-b - Math.sqrt(d))/(2*a); 
}

public static void main(String[] args) {

Scanner scanner = new Scanner(System.in);

double a= scanner.nextDouble();
double b= scanner.nextDouble();
double c= scanner.nextDouble();

Quadratic q = new Quadratic(a,b,c);

System.out.println("x1: " + q.getX1());
System.out.println("x2: " + q.getX2());

}
}
