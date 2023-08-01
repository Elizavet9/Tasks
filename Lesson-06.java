/* Task 2
Напечатать числа в виде следующей таблицы:
5
5 5
5 5 5
5 5 5 5
5 5 5 5 5
*/

import java.util.*;
import java.util.Scanner;
public class Main {
    public static void elka(int number, int rows, int columns) {
            for(int i = 0; i < rows; i++) {
        for(int j = 0; j < columns; j++) {
          System.out.print(number + " ");
        }
        columns++;
        System.out.println();
      }
    }
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int number = sc.nextInt();   //5
     int rows = sc.nextInt();     //5
     int columns = sc.nextInt();  //1
     elka(number, rows, columns);
  }
}

/*Task 6-1. Написать метод, который принимает на вход натуральное число и возвращает true, 
если число – четное.
*/

import java.util.*;
import java.util.Scanner;
public class Main {
    public static boolean isEven(int n) {
      if (n % 2 == 0)
      return true;
      else
      return false;
    }
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      if ((n > 0))
        System.out.println(isEven(n));
      else
        System.out.println("Введите натуральное число!");
  }
}

/*Task 6-2. Имеется зарплата сотрудника – натуральное число. 
Реализовать функцию, которая рассчитывает премию сотрудника – вещественное число, 
исходя из таблицы
Зарплата сотрудника	Премия
<40000			        50% от зп
40000 <= x <80000	  70% от зп
>= 80000		        110% от зп
*/ 

import java.util.*;
import java.util.Scanner;
public class Main {
    public static double bonus(int s) {
      double b;
      if (s < 40000)
        b = s * 0.5;
      else if (s >= 40000 && s < 80000)
            b = s * 0.7;
            else 
            b = s * 1.1;
      return b;
    }
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int s = sc.nextInt();
      if (s < 0)
        System.out.println("Зарплата должна быть больше 0!");
      else
        System.out.println("Премия сотрудника = " + bonus(s));
  }
}

/*Task 6-3. Реализовать функцию, которая принимает на вход два числа n и m и возвращает n в степени m.
Реализовать перегрузку для типов данных.
*/
import java.util.*;
public class Main {
  
      public static double powMath(int n, int m){
      double pM;
      pM = Math.pow(n,m);
      return pM;
    }
      public static double powMath(double n, double m){
      double pM;
      pM = Math.pow(n,m);
      return pM;
    }
    public static void main(String[] args) {
      System.out.println(powMath(10, 2));
  }
}