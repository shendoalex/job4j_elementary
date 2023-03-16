package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] surnames = new String[100500];
        float[] prices = new float[40];
        System.out.println("Array ages length = " + ages.length);
        System.out.println("Array surnames length = " + surnames.length);
        System.out.println("Array prices length = " + prices.length);
        String[] names = new String[4];
        names[0] = "Inga Golubeva";
        names[1] = "Hariton Pokrovski";
        names[2] = "Herman Izmailov";
        names[3] = "Jana Gorbunova";
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
        System.out.println(names[3]);
    }
}
