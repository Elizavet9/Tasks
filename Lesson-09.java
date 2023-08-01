/* Task 3
Дан массив. Составить программу:
1.расчета квадратного корня из любого элемента массива;
2.расчета среднего арифметического двух любых элементов массива;
Предусмотреть возможность ошибочных обращений вне границ массива.
*/
import java.util.*;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void printArray(int [] array){
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static int[] generateArray(int n){
        Random r = new Random();
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++){
            array[i] = r.nextInt(100);
        }
        return array;
    }

    public static void sqrtOfElementArray(int[] array, int n){
      int l = array.length;
      if ((n < 0) || (n >= l)) {
      System.out.println("Данного элемента нет в массиве!");
      }
      else {
      double sqrt = Math.sqrt(array[n]);
      System.out.printf("Квадратный корень %d элемента массива равен - %.3f\n", n,sqrt);
      }
    }
    
    public static void avgOfElementArray(int[] array, int a, int b){
      int l = array.length;
      if ((a < 0) || (a >= l) || (b < 0) || (b >= l)) {
      System.out.println("Данных элементов нет в массиве!");
      }
      else {
      double avg = (array[a] + array[b]) / 2.00;
      System.out.printf("Среднее арифметическое %d и %d элемента массива равен - %.1f\n", a,b,avg);
      }
    }
      
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        int [] array = generateArray(5);
        printArray(array);
        
        sqrtOfElementArray(array,n);
        avgOfElementArray(array,a,b);
    }
}

/* Task 5
Дан массив. Напечатать: 
1.все неотрицательные элементы
2.все элементы, не превышающие число 100
*/
import java.util.*;
import java.util.Random;

public class Main {
  
    public static void printArray(int [] array){
      for (int i = 0; i < array.length; i++){
        System.out.print(array[i] + " ");
      }
      System.out.println();
    }
    
    public static void printNonNegativeElements(int[] array){
      for (int i = 0; i < array.length; i++){
        if (array[i] >= 0){
          System.out.print(array[i] + " ");
        }
      }
      System.out.println();
    }
    
    public static void printElementsOver100(int[] array){
      for (int i = 0; i < array.length; i++){
        if (array[i] > 100){
          System.out.print(array[i] + " ");
        }
      }
      System.out.println();
    }

    public static void main(String[] args) {
      
      int [] array = {1, 102, -5, 6, -9, 3, 16, 123, -100};
      printArray(array);
      
      printNonNegativeElements(array);  //1 102 6 3 16 123
      printElementsOver100(array);      //102 123

  }
}

/* Task 7
Дан массив. Поменять местами: 
1.второй и пятый элементы; 
2.третий и максимальный элементы. 
Если элементов с максимальным значением не сколько, то в обмене должен участвовать первый из них.
*/
import java.util.*;
import java.util.Random;

public class Main {

  public static void printArray(int[] array) {
    for (int i = 0; i < array.length; i++) {
      System.out.print(array[i] + " ");
    }
    System.out.println();
  }
  
  public static int[] generateArray(int n) {
    Random r = new Random();
    int[] array = new int[n];
    for (int i = 0; i < array.length; i++) {
      array[i] = r.nextInt(100);
    }
    return array;
  }
  
  public static int findMaxElement(int[] array) {
    int max = array[0];
    for (int i = 0; i < array.length; i++) {
      if (array[i] > max) {
        max = array[i];
      }
    }
    return max;
  }

  public static int findIndexOfMaxElement(int[] array) {
    int index = 0;
    int max = findMaxElement(array);
    for (int i = 0; i < array.length; i++) {
      if (array[i] == max) {
        index = i;
        break;
      }
    }
    return index;
  }
  
  public static int[] swapElementsOfArray(int[] array, int n, int m) {
    int l = array.length;
    if ((n < 0) || (m < 0) || (n >= l) || (m >= l)) {
      System.out.println("Элементы поменять нельзя!!!");
      return array;
    } else {
      int temp = array[n];
      array[n] = array[m];
      array[m] = temp;
      return array;
    }
  }

  public static void main(String[] args) {

    int[] array = generateArray(10);
    System.out.println("Массив:");
    printArray(array);
    
    System.out.println("Меняем местами 2 и 5 элементы");
    swapElementsOfArray(array, 2, 5);
    printArray(array);
    
    System.out.println("Индекс максимального элемента - "+findIndexOfMaxElement(array));
    System.out.println("Меняем местами 3 и максимальный элементы");
    swapElementsOfArray(array, 3, findIndexOfMaxElement(array));
    printArray(array);
    
  }
}

/* Task 8 
Дан двумерный массив. 
1.Вывести на экран элемент, расположенный в правом верхнем углу массива
2.Вывести на экран элемент, расположенный в левом нижнем углу массива
*/
import java.util.*;
import java.util.Random;

public class Main {

  public static void printArray(int[][] array) {
    for (int i = 0; i < array.length; i++){
      for (int j = 0; j < array[i].length; j++){
        System.out.print(array[i][j] + "\t");
      }
      System.out.println();
    }
  }

  public static int[][] generateArray(int n, int m) {
    Random r = new Random();
    int[][] array = new int[n][m];
    for (int i = 0; i < array.length; i++) 
      for (int j = 0; j < array[i].length; j++){
      array[i][j] = r.nextInt(100);
    }
    return array;
  }

  public static void main(String[] args) {

    int[][] array = generateArray(3,3);
    printArray(array);
    
    System.out.println("Элемент, расположенный в правом верхнем углу массива - " + array[0][2]);
    System.out.println("Элемент, расположенный в левом нижнем углу массива - " + array[2][0]);
  
  }
}

/* Task 10
Дан двумерный массив. Определить: 
1.сумму всех элементов третьей строки массива
2.сумму всех элементов второго столбца массива
*/
import java.util.*;
import java.util.Random;

public class Main {

  public static void printArray(int[][] array) {
    for (int i = 0; i < array.length; i++){
      for (int j = 0; j < array[i].length; j++){
        System.out.print(array[i][j] + "\t");
      }
      System.out.println();
    }
  }

  public static int[][] generateArray(int n, int m) {
    Random r = new Random();
    int[][] array = new int[n][m];
    for (int i = 0; i < array.length; i++) 
      for (int j = 0; j < array[i].length; j++){
      array[i][j] = r.nextInt(100);
    }
    return array;
  }
  
  public static void sumArray(int[][] array){
      int sum = 0;
      for (int i = 0; i < array.length; i++) 
      for (int j = 0; j < array[i].length; j++){
        sum = sum + array[i][j];
      }
      System.out.printf("Сумма элементов всего массива - %d\n", sum);
    }
   
  public static void sumArrayRow(int[][] array, int row){
      int sum = 0;
      for (int i = 0; i < array.length; i++) {
        sum = sum + array[row][i];
      }
      System.out.printf("Сумма элементов заданной строки массива - %d\n",sum);
    }
    
  public static void sumArrayCol(int[][] array, int col){
      int sum = 0;
      for (int i = 0; i < array.length; i++) {
        sum = sum + array[i][col];
      }
      System.out.printf("Сумма элементов заданного столбца массива - %d\n",sum);
    }

  public static void main(String[] args) {

    int[][] array = generateArray(4,4);
    printArray(array);
    
    sumArray(array);
    sumArrayRow(array,2);
    sumArrayCol(array,1);
  
  }
}

// Task 9-11
/*Дан двумерный массив. 
1.поменять местами первую и третью строки
2.поменять местами второй и последний столбцы
*/
import java.util.*;
import java.util.Random;

public class Main {
  public static void printArray(int[][] array) {
    for (int i = 0; i < array.length; i++){
      for (int j = 0; j < array[i].length; j++){
        System.out.print(array[i][j] + "\t");
      }
      System.out.println();
    }
  }
  
  public static int[][] generateArray(int n, int m) {
    Random r = new Random();
    int[][] array = new int[n][m];
    for (int i = 0; i < array.length; i++) 
      for (int j = 0; j < array[i].length; j++){
      array[i][j] = r.nextInt(100);
    }
    return array;
  }
  
  public static int[][] swapRowsArray(int[][] array, int n, int m) {
     int l = array.length;
    if ((n < 0) || (m < 0) || (n >= l) || (m >= l)) {
      System.out.println("Строки поменять нельзя!");
      return array;
    } else {
    for (int i = 0; i < array.length; i++) {
      int temp = array[n][i];
      array[n][i] = array[m][i];
      array[m][i] = temp;
      
      }
    }
    return array;
  }
  
  public static int[][] swapColsArray(int[][] array, int n, int m) {
    int l = array.length;
    if ((n < 0) || (m < 0) || (n >= l) || (m >= l)) {
      System.out.println("Столбцы поменять нельзя!");
      return array;
    } else {
    for (int i = 0; i < array.length; i++) {
      int temp = array[i][n];
      array[i][n] = array[i][m];
      array[i][m] = temp;
      }
    }
    return array;
  }
  
  public static void main(String[] args) {

    int[][] array = generateArray(4,4);
    printArray(array);
    
    System.out.println("Меняем строки местами..");
    swapRowsArray(array,0,2);
    printArray(array);
    
    System.out.println("Меняем столбцы местами..");
    swapColsArray(array,1,3);
    printArray(array);
  }
}

/* Tasks 9-1. Вывести элементы массива на экран в обратном порядке.
*/
import java.util.*;
import java.util.Random;

public class Main {
  
    public static void printArray(int [] array){
      for (int i = 0; i < array.length; i++){
        System.out.print(array[i] + " ");
      }
      System.out.println();
    }
    
    public static int[] generatArray(int n){
      Random r = new Random();
      int[] array = new int[n];
      for (int i = 0; i < array.length; i++){
        array[i] = r.nextInt(100)-50;
      }
      return array;
    }
    
    public static int[] reversePrintArray(int [] array){
      for (int i = array.length - 1; i >= 0; i--){
        System.out.print(array[i] + " ");
      }
      return array;
    }
    
    public static void main(String[] args) {
      
      int [] array = generatArray(10);
      printArray(array);
      
      System.out.println("Элементы массива в обратном порядке:");
      reversePrintArray(array);
  }
}

/* Tasks 9-2. Определить: 
1. сумму всех элементов массива; 
2. произведение всех элементов массива; 
3. сумму квадратов всех элементов массива;
4. сумму шести первых элементов массива
*/
import java.util.*;
import java.util.Random;

public class Main {
  
    public static void printArray(int [] array){
      for (int i = 0; i < array.length; i++){
        System.out.print(array[i] + " ");
      }
      System.out.println();
    }
    
    public static int[] generatArray(int n){
      Random r = new Random();
      int[] array = new int[n];
      for (int i = 0; i < array.length; i++){
        array[i] = r.nextInt(50);
      }
      return array;
    }
    
    public static void sumOfElementsArray(int [] array){
      int sum = 0;
      for (int i = 0; i < array.length; i++){
        sum = sum + array[i];
      }
      System.out.printf("1. Cумма всех элементов массива равна %d\n", sum);
    }
    
    public static void productOfElementsArray(int [] array){
      long p = 1;
      for (int i = 0; i < array.length; i++){
        p = p * array[i];
      }
      System.out.printf("2. Произведение всех элементов массива равна %d\n", p);
    }
    
    public static void sumOfSquarestOfElementsArray(int [] array){
      double sum = 0;
      for (int i = 0; i < array.length; i++){
        sum = sum + (Math.pow(array[i],2));
      }
      System.out.printf("3. Cумма квадратов всех элементов массива равна %.2f\n", sum);
    }
    
    public static void sumOfFirstSixElementsArray(int [] array){
      int l = array.length;
      int sum = 0;
      if (5 >= l)
        System.out.println("Массив должен быть больше шести элементов!");
      else {
        for (int i = 0; i <= 5; i++)
          sum = sum + array[i];
        System.out.printf("4. Cумма шести первых элементов массива равна %d\n", sum); 
      }
    }
    
    public static void main(String[] args) {
      
      int [] array = generatArray(7);
      printArray(array);
      
      sumOfElementsArray(array);
      productOfElementsArray(array);
      sumOfSquarestOfElementsArray(array);
      sumOfFirstSixElementsArray(array);
      
  }
}

/* Tasks 9-3. Вывести сумму всех положительных элементов массива.
*/
import java.util.*;
import java.util.Random;

public class Main {
  
    public static void printArray(int [] array){
      for (int i = 0; i < array.length; i++){
        System.out.print(array[i] + " ");
      }
      System.out.println();
    }
    
    public static int[] generatArray(int n){
      Random r = new Random();
      int[] array = new int[n];
      for (int i = 0; i < array.length; i++){
        array[i] = r.nextInt(50)-25;
      }
      return array;
    }
    
    public static void printSumOfPositiveElementsArray(int [] array){
      int sum = 0;
      for (int i = 0; i < array.length; i++){
        if (array[i] >= 0)
         sum = sum + array[i]; 
      }
      System.out.printf("Cумма всех положительных элементов массива %d\n", sum);
    }
    
    public static void main(String[] args) {
      
      int [] array = generatArray(7);
      printArray(array);
      
      printSumOfPositiveElementsArray(array);
  }
}

/* Tasks 9-4. Посчитать сумму элементов, кратных 5.
*/
import java.util.*;
import java.util.Random;

public class Main {
  
    public static void printArray(int [] array){
      for (int i = 0; i < array.length; i++){
        System.out.print(array[i] + " ");
      }
      System.out.println();
    }
    
    public static int[] generatArray(int n){
      Random r = new Random();
      int[] array = new int[n];
      for (int i = 0; i < array.length; i++){
        array[i] = r.nextInt(50);
      }
      return array;
    }
    
    public static void sumOfElementsArrayDivisibleOfFive(int [] array){
      int sum = 0;
      for (int i = 0; i < array.length; i++){
        if (array[i] % 5 == 0)
         sum = sum + array[i]; 
      }
      System.out.printf("Cумма элементов массива, кратных 5 = %d\n", sum);
    }    
    
    public static void main(String[] args) {
      
      int [] array = generatArray(7);
      printArray(array);
      
      sumOfElementsArrayDivisibleOfFive(array);
  }
}

/* Tasks 9-5. Найти номер последнего минимального элемента массива.
*/
import java.util.*;
import java.util.Random;

public class Main {

    public static void printArray(int [] array){

        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static int[] generateArray(int n){
        Random r = new Random();
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++){
            array[i] = r.nextInt(100);
        }
        return array;
    }
    
    public static int findMinElement(int[] array) {
      int min = array[0];
      for(int i = 0; i < array.length; i++) {
        if(array[i] < min) {
          min = array[i];
        }
      }
      return min;
    }
    
    public static int findIndexOfMinElement(int[] array) {
      int index = 0;
      int min = findMinElement(array);
      for(int i = 0; i < array.length; i++) {
        if(array[i] == min) {
          index = i;
        }
      }
      return index;
    }
    
    public static void main(String[] args) {
        int [] array = {3, -1, 9, 13, 5, 7, -1, 8};
        printArray(array);
        
        System.out.println("Минимальный элемент равен " + findMinElement(array));
        System.out.println("Индекс последнего минимального элемента равен " +findIndexOfMinElement(array));
        
    }
}

/* Tasks 9-6. Дан массив. 
Вывести на экран с начала его неотрицательные элементы, затем отрицательные.
*/
import java.util.*;
import java.util.Random;

public class Main {
  
    public static void printArray(int [] array){
      for (int i = 0; i < array.length; i++){
        System.out.print(array[i] + " ");
      }
      System.out.println();
    }
    
    public static int[] generatArray(int n){
      Random r = new Random();
      int[] array = new int[n];
      for (int i = 0; i < array.length; i++){
        array[i] = r.nextInt(50)-20;
      }
      return array;
    }
    
    public static void nonNegativeThenNegativeElementsArray(int [] array){
      for (int i = 0; i < array.length; i++){
        if (array[i] >= 0)
        System.out.print(array[i] + " ");
      }
      System.out.println();
      for (int i = 0; i < array.length; i++){
        if (array[i] < 0)
        System.out.print(array[i] + " ");
      }
      System.out.println();
    }
    
    public static void main(String[] args) {
      
      int [] array = generatArray(7);
      printArray(array);
      
      nonNegativeThenNegativeElementsArray(array);
  }
}

/* Tasks 9-2-1. Дан массив. Определить: 
1. количество максимальных элементов в массиве; 
2. количество минимальных элементов в массиве.
*/
import java.util.*;
import java.util.Random;

public class Main {

    public static void printArray(int [] array){

        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
    
    public static int[] generateArray(int n){
        Random r = new Random();
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++){
            array[i] = r.nextInt(7);
        }
        return array;
    }

    public static int findMinElement(int[] array) {
      int min = array[0];
      for(int i = 0; i < array.length; i++) {
        if(array[i] < min) {
          min = array[i];
        }
      }
      return min;
    }
    
    public static void counterOfMinElement(int[] array) {
      int index = 0;
      int count = 0;
      int min = findMinElement(array);
      for(int i = 0; i < array.length; i++) {
        if(array[i] == min) {
          index = i;
          count++;
        }
      }
      System.out.println("Количество минимальных элементов = " + count);
    }
    
    public static int findMaxElement(int[] array) {
      int max = array[0];
      for(int i = 0; i < array.length; i++) {
        if(array[i] > max) {
          max = array[i];
        }
      }
      return max;
    } 
    
    public static void counterOfMaxElement(int[] array) {
      int index = 0;
      int count = 0;
      int max = findMaxElement(array);
      for(int i = 0; i < array.length; i++) {
        if(array[i] == max) {
          index = i;
          count++;
        }
      }
      System.out.println("Количество максимальных элементов = " + count);
    }
    
    public static void main(String[] args) {
      int [] array = generateArray(9);
      printArray(array);
        
      System.out.println("Минимальный элемент = " + findMinElement(array)); 
      counterOfMinElement(array);      
      System.out.println("Максимальный элемент = " + findMaxElement(array));
      counterOfMaxElement(array); 
    }
}

/* Tasks 9-2-2. Составить программу: 
1. нахождения минимального значения среди элементов любой строки двумерного массива;
2. нахождения максимального значения среди элементов любого столбца двумерного массива.
*/
import java.util.*;
import java.util.Random;

public class Main {
  public static void printArray(int[][] array) {
    for (int i = 0; i < array.length; i++){
      for (int j = 0; j < array[i].length; j++){
        System.out.print(array[i][j] + "\t");
      }
      System.out.println();
    }
  }
  
  public static int[][] generateArray(int n, int m) {
    Random r = new Random();
    int[][] array = new int[n][m];
    for (int i = 0; i < array.length; i++) 
      for (int j = 0; j < array[i].length; j++){
      array[i][j] = r.nextInt(100);
    }
    return array;
  }
  
  public static void findMinElementRow(int[][] array, int row) {
      int min = array[row][0];
      for(int i = 0; i < array.length; i++){
        if(array[row][i] < min) {
          min = array[row][i];
        }
    }
    System.out.printf("Минимальное значение элемента строки %d равно %d\n", row, min);
  }
  
  public static void findMaxElementCol(int[][] array, int col) {
      int max = array[0][col];
      for(int i = 0; i < array.length; i++){
        if(array[i][col] > max) {
          max = array[i][col];
        }
      }
    System.out.printf("Максимальное значение элемента столбца %d равно %d\n", col, max);
  }
  
  public static void main(String[] args) {

    int[][] array = generateArray(4,4);
    printArray(array);
    
    findMinElementRow(array, 2);
    findMaxElementCol(array, 3);
  }
}
