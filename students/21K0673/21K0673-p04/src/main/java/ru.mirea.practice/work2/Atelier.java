package ru.mirea.practice.work2;

public class Atelier extends Clothes{
    public void dressWomen(Clothes[] clothes) {

    }

    public void dressMan(Clothes[] clothes) {

    }

    public static void main(String[] args) {
        Clothes[] clothes = {
                new Pants(EnumAtelier.L, 2000, "orange"),
                new Skirt(EnumAtelier.XXS, 3000, "yellow"),
                new Tie(EnumAtelier.XS, 1000, "orange"),
                new TShirt(EnumAtelier.M, 500, "black")};
    }
}