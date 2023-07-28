/* Task 3
Напечатать таблицу умноженияна 7: 
1 х 7 = 7 
2 х 7 = 14 
... 
9 х 7 = 63 
*/

import java.util.*;
public class Main {
    public static void main(String[] args) { 
      for(int i = 1; i < 10; i++) {
        System.out.printf("%d * 7 = %d\n", i, i*7);
      } 
    }
}

/* Task 4
Найти: 
2.сумму всех целых чисел от a до b (значения a и b вводятся с клавиатуры; b>=a).
*/

import java.util.*;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {  
      Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      int b = sc.nextInt();
      int sum = 0;
      if (b>=a){
      for(int i = a; i <= b; i++) {
        System.out.println("sum before = " + sum);
        System.out.println("i = " + i);
        sum = sum + i;
        System.out.println("sum after = " + sum);
        System.out.println("= = = = = = = = = = = = = =");
      }    
      System.out.println("sum = " + sum);
      }
      else {
        System.out.println("Второе число меньше первого!");
      }
  }
}

/*Task 8
Дано натуральное число. Определить:
1.количество цифр 3 в нем; 
2.сколько раз в нем встречается последняя цифра;
3.количество четных цифр в нем;
4.сумму его цифр, больших пяти;
5.произведение его цифр, больших семи;
6.сколько раз в нем встречаются цифры 0 и 5 (всего).
 */

import java.util.*;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);    
      int number = sc.nextInt();
      System.out.println("Число " + number);

      int countOfThree = 0;
      int countOfEven = 0;
      int lastNumber = number % 10;
      int countOfLastNumber = 0;
      int sumMoreFive = 0;
      int productMoreSeven = 1;
      int countOfZeroAndFive = 0;

      while(number != 0) {
        int lastDigit = number % 10;
        if(lastDigit == 3) {
          countOfThree++;
        }
        if(lastDigit % 2 == 0) {
          countOfEven++;
        }
        if (lastDigit == lastNumber){
          countOfLastNumber++;
        }
        if (lastDigit > 5){
          sumMoreFive = sumMoreFive + lastDigit;
        }
        if (lastDigit > 7){
          productMoreSeven = productMoreSeven * lastDigit;
        }
        if (lastDigit == 0 || lastDigit == 5){
          countOfZeroAndFive++;
        }     
        number = number / 10;
      }
      System.out.println("1. Количество цифр 3 в числе равно " + countOfThree);
      System.out.println("2. Количество последней цифры в числе равно " + countOfLastNumber);
      System.out.println("3. Количество четных цифр в числе равно " + countOfEven);
      System.out.println("4. Сумма чисел больше 5 равно " + sumMoreFive);
      System.out.println("5. Произведение чисел больше 7 равно " + productMoreSeven);
      System.out.println("6. Количество всего 0 и 5 в числе равно " + countOfZeroAndFive);
  }
}

/*Task 9
Имеется фрагмент программы в виде оператора цикла с параметром, 
обеспечивающий вывод на экран "столбиком" всех целых чисел от 10 до 30. 
Оформить этот фрагмент в виде: 
1.оператора цикла с предусловием; 
2.оператора цикла с постусловием.
*/

import java.util.*;
public class Main {
    public static void main(String[] args) {
        System.out.println("WHILE");
        int i = 10;
        while (i <= 30) {
            System.out.println(i);
            i++;
        }
        System.out.println("DO WHILE");
        int j = 10;
        do {
            System.out.println(j);
            j++;
        } while (j <= 30);
    }
}

/* Task 10
Дано натуральное число. 
1.Определить его максимальную цифру
2.Определить его минимальную цифру
*/

import java.util.*;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);    
      int number = sc.nextInt();
      int max = 0;
      int min = 9;     
      while(number != 0) {
        int lastDigit = number % 10;
        System.out.print(lastDigit + " ");       
        if(lastDigit > max) {
          max = lastDigit;
        }       
        if (lastDigit < min){
          min = lastDigit;
        }
        if((max == 9) && (min == 0)) {
          break;
        }  
        number = number / 10;
      }      
      System.out.println();
      System.out.println("Максимальная цифра = " + max);
      System.out.println("Минимальная цифра = " + min);    
  }
}

/* Task 12
Гражданин  1 марта открыл счет в банке, вложив  1000 руб. 
Через каждый месяц размер вклада увеличивается на 2% от имеющейся суммы. 
Определить:
1.за какой месяц величина ежемесячного увеличения вклада превысит 30 руб.;
2.через сколько месяцев размер вклада превысит 1200 руб.
*/

import java.util.*;
public class Main {
    public static void main(String[] args) {
      double dep = 1000;
      double dep1 = 1000;
      int countMonthDep = 0;
      double pct = 0;
      int countMonthPct = 0;
      while (dep < 1200){
        dep = dep * 1.02;
        countMonthDep++;
      }
      do {
        pct = dep1 * 0.02;
        dep1 = dep1 + pct;
        countMonthPct++;
        }
        while (pct < 30);
      System.out.printf("1. Величина ежемесячного увеличения вклада превысит 30 руб. через %d месяца. \n",countMonthPct);       
      System.out.printf("2. Размер вклада превысит 1200 руб. через %d месяцев. \n",countMonthDep);
  }
}

// Task 5-1. Составить программу вывода любого числа любое заданное число раз.

import java.util.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
      int number1 = sc.nextInt();
      int number2 = sc.nextInt();
      
      for (int i = 0; i < number2; i++){
        System.out.println(number1);
      }
  }
}

/* Task 5-2. Напечатать числа следующим образом:
25 25.5 24.8
26 26.5 25.8
...
35 35.5 34.8
*/

import java.util.*;
public class Main {
    public static void main(String[] args) {
      for (int i = 25; i <= 35; i++){
        System.out.printf("%d %d.5 %d.8\n", i, i, i - 1);
      }
  }
}

/* Task 5-3. Напечатать таблицу соответствия между весом в фунтах и весом в 
килограммах для значений 1, 2, ..., 10 фунтов (1 фунт = 453 г).
*/

import java.util.*;
public class Main {
    public static void main(String[] args) {      
      for (int i = 1; i <= 10; i++){
        System.out.printf("%d фунт = %d гр \n", i, i * 453);
      }
  }
}

// Task 5-4. Вычислить сумму 1+1/2+1/3+...+1/n.

import java.util.*;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      double sum = 1;     
      for (double i = 2; i <= n; i++){
        sum = sum + 1/i;
        System.out.println(sum);
      }
      System.out.printf("Сумма = %.2f", sum);
  }
}
