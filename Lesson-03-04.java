/* Task 3-1
С некоторого момента прошло 234 дня. 
Сколько полных недель прошло за этот период? 
А месяцев?
*/
import java.util.*;
public class Main {
    public static void main(String[] args) {      
      int day = 234;
      int week = day / 7;          
      System.out.println(week);    // 33
      int month = day / 30;
      System.out.println(month);   // 7
  }
}

/* Task 3-2
Дано двузначное число 39. 
Найти:
a.число десятков в нем;
b.число единиц в нем;
c.сумму его цифр;
d.произведение его цифр.
*/
import java.util.*;
public class Main {
    public static void main(String[] args) {
      int n = 39;
      int d = n / 10;          
      System.out.println(d);    // 3
      int e = n % 10;
      System.out.println(e);   // 9      
      System.out.println("Сумма цифр числа "+ n +" равна " + (d + e));   // 12
      System.out.println("Произведение цифр числа "+ n +" равна " + (d * e));   // 27
  }
}

/* Task 4-2
Известно значение температуры по шкале Цельсия 36,6. 
Найти соответствующее значение температуры по шкале:
1.Фаренгейта;
2.Кельвина.
Для пересчета по шкале Фаренгейта необходимо исходное значение температуры умножить на  1,8
и к результату прибавить  32, 
а по шкале Кельвина абсолютное значение нуля соответствует 273,15 градуса по шкале Цельсия.
*/
import java.util.*;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) { 
     Scanner sc = new Scanner(System.in);
      double C = sc.nextDouble();
      double F = C * 1.8 + 32;
      double K = C + 273.15; 
      System.out.println("Температура по шкале Цельсия - " + C);
      System.out.println("Температура по шкале Фаренгейта - " + F);
      System.out.println("Температура по шкале Кельвина - " + K);
  }
}

/* Task 4-4
Известны площади круга и квадрата. Определить: 
1.уместится ли круг в квадрате? 
2.уместится ли квадрат в круге?
*/
import java.util.*;
public class Main {
    public static void main(String[] args) {
      double Scircle = 100.0;
      double Ssquare = 60.0;
      double Dcircle = 2 * Math.sqrt(Scircle / Math.PI);   // Диаметр круга
      double Asquare = Math.sqrt(Ssquare);                 // Сторана квадрата
      double Dsquare = Math.sqrt(2 * Ssquare);             // Диагональ квадрата
      if (Dcircle <= Asquare){
         System.out.println("Круг уместится в квадрат");
         }
          else {
              System.out.println("Круг не уместится в квадрат");  
              }  
      if (Dsquare <= Dcircle){
        System.out.println("Квадрат уместится в круг");
        }
        else {
            System.out.println("Квадрат не уместится в круг");  
            }
  }
}

/* Task 4-6
Составить программу, которая уменьшает первое введенное число в два раза, 
если оно больше второго введенного числа по абсолютной величине.
*/
import java.util.*;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n1 = sc.nextInt();
    int n2 = sc.nextInt();
    if (Math.abs(n1) > Math.abs(n2)){
      n1 = n1 / 2;
      System.out.println(n1);
      }
      else {
        System.out.println("Первое число меньше второго введенного числа!");
      }
  }
}

/* Task 4-7
Известен вес боксера-любителя. Известно, что вес таков, 
что боксер может быть отнесен к одной из трех весовых категорий: 
1.легкий вес — до 60 кг; 
2.средний вес — до 75 кг; 
3.тяжелый вес — до 91 кг;
4.супертяжелый вес – с 91 кг.
Определить, в какой категории будет выступать данный боксер.
По 3 варианту.
*/
import java.util.*;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) { 
    Scanner sc = new Scanner(System.in);
    int w = sc.nextInt();
    if(w <= 30) System.out.println("Неправильный вес!");
    else { 
        if(w >= 75){
                    if (w >= 91) System.out.println("Супертяжелый вес!");
                    else System.out.println("Тяжелый вес!");
                    }
        else {            
              if (w >= 60) System.out.println("Средний вес!");
              else System.out.println("Легкий вес!");  
             }
      }     
  }
}

/* Task 4-8
Составить программу, которая в зависимости от порядкового номера дня недели (1, 2, ..., 7)
выводит на экран его название (понедельник, вторник, ..., воскресенье).
*/
import java.util.*;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int day = sc.nextInt();
    switch(day){
      case 1:
        System.out.println("Понедельник");
      break;
      case 2:
        System.out.println("Вторник");
      break;
      case 3:
        System.out.println("Среда");
      break;
      case 4:
        System.out.println("Четверг");
      break;
      case 5:
        System.out.println("Пятница");
      break;
      case 6:
        System.out.println("Суббота");
      break;
      case 7:
        System.out.println("Воскресенье");
      break;
      default:
        System.out.println("Нет такого дня недели!");
      break;  
    }
  }
}
