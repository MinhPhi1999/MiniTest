package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    double sum = 0;
    int count = 0;
    Book[] book = new Book[10];
    book[0] = new ProgrammingBook("111","Effective Java.1",1000,"Joshua Bloch","Java","Java Collection framework");
    book[1] = new ProgrammingBook("222","Effective Java.2",2000,"Joshua Bloch","Java","Java Collection framework");
    book[2] = new ProgrammingBook("333","Effective PHP",3000,"Joshua Bloch","PHP","Java Collection framework");
    book[3] = new ProgrammingBook("444","Effective Java.3",4000,"Joshua Bloch","Java","Java Collection framework");
    book[4] = new ProgrammingBook("555","Effective C",5000,"Joshua Bloch","C","Java Collection framework");
    book[5] = new FictionBook("666","Labyrinths.1",1000,"Jorge Luis Borges","Sách viễn tưởng");
    book[6] = new FictionBook("777","Labyrinths.2",2000,"Jorge Luis Borges","Sách viễn tưởng");
    book[7] = new FictionBook("888","Labyrinths.3",3000,"Jorge Luis Borges","Sách viễn tưởng");
    book[8] = new FictionBook("999","Labyrinths.4",4000,"Jorge Luis Borges","Sách viễn tưởng");
    book[9] = new FictionBook("000","Labyrinths.5",5000,"Jorge Luis Borges","Sách viễn tưởng");
// tính tổng tiền
        for (int i = 0; i < book.length; i++) {
             sum += book[i].getPrice();
        }
        System.out.println("giá 10 cuốn sách : " + sum + "USD");
// đếm số sách cùng language
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập kiểu language : ");
        String language = scanner.next();

        for (int i = 0; i < book.length; i++) {
            if (book[i] instanceof ProgrammingBook){
                if (((ProgrammingBook) book[i]).getLanguage().equalsIgnoreCase(language)){
                    count++;
                }
            }
        }
        System.out.println("số lượng là :" + count);
    }
}
