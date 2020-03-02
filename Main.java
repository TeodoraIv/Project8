package com.company;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void AscendingSortation(List<Student> list){
    list.sort((a, b) -> b.getSpeciality().compareTo(a.getSpeciality()));
    }
    public static void DescendingSortation(List<Student> list){
    list.sort((b, a) -> a.getSpeciality().compareTo(b.getSpeciality()));
    }
    public static void PrintDetailedList(List<Student> list) {
        list.forEach(item -> System.out.println("Name: " + item.getName() + ", University: " + item.getUniversity() +
                ", Speciality: " + item.getSpeciality() + ", Faculty Number: " + item.getFacNumber()));
    }
    public static void main(String[] args) {
    List<Student> spisuk = null;
    Scanner scan = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            spisuk.add(Student.StudentGenerator.make());
        }
        int choice;
        do {
            System.out.println("Please type 0 for descending sortation and 1 for ascending! ");
            choice = scan.nextInt();
        } while (choice == 0 || choice == 1);

     if(choice==0) DescendingSortation(spisuk);
     else AscendingSortation(spisuk);

    PrintDetailedList(spisuk);}
}