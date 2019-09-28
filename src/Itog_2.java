/*Написать программу сортировки по возрастанию заданного пользователем массива чисел.
Пользователь программы должен задавать размер массива и наполнять его числами.
Использовать одну из следующих сортировок: прямого выбора, вставки, быстрая, Шелла.*/

import java.util.Arrays;
import java.util.Scanner;

public class Itog_2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Задайте количество ячеек в массиве:");
        int num = in.nextInt();

        int[] listSort = new int[num];

        // ввод данных в ячейки
        for (int y = 0; y < listSort.length; y++) {
            System.out.println("Введите значение для ячейки " + y + ":");
            listSort[y] = in.nextInt();
        }
        //сортировка методом Шелла
        int i, j, k, h, m = 0, b = listSort.length;
        int[] d = { 1, 4, 10, 23, 57, 145, 356, 911, 1968, 4711, 11969, 27901, 84801 };
        while (d [m] < b) ++m;
        while (--m >= 0){
            k = d[m];
            for (i = k; i < b; i++){     // k-сортировка
                j = i;
                h = listSort[i];
                while ((j >= k) && (listSort[j-k] > h)){
                    listSort[j]=listSort[j-k];
                    j -= k;
                }
                listSort[j] = h;
            }
        }
        System.out.println("Ваш массив, отсортированный методом Шелла: " + Arrays.toString(listSort));
    }
}