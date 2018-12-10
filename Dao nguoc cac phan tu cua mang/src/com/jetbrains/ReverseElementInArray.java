package com.jetbrains;
import java.util.Scanner;

public class ReverseElementInArray {
    public static void main(String[] args) {
        //kiem tre kich thuoc mang
        int size;
        int[] array;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a size");
        size = sc.nextInt();
        if(size > 20){
            System.out.println("Error");
        }
        //nhap gia tri cho mang
        array = new int[size];
        for(int i = 0;i<array.length;i++){
            System.out.println("Enter a element " + (i+1));
            array[i] = sc.nextInt();
        }
        System.out.printf("%-20s%s","Element in array:","\n");
        for(int j = 0;j < array.length;j++){
            System.out.println(array[j] + "\t");
        }
        //dao nguoc mang
        for(int j = 0;j < array.length/2;j++){
            int temp = array[j];
            array[j] = array[size - 1 - j];
            array[size - 1 - j] = temp;
        }
        System.out.printf("%-20s%s","Reverse array: ","\n");
        for(int j = 0;j < array.length;j++){
            System.out.println(array[j]+"\t");
        }
    }
}