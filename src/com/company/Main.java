package com.company;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private Scanner input = new Scanner(System.in);
    private List<String> nameList;
    public static void main(String[] args) {
        Main main = new Main();
        main.testingLists();
    }
    private void testingLists() {
        nameList = new ArrayList<>();
        nameList.add("Luke");
        nameList.add("Timmie");
        nameList.add("Bob");
        nameList.add("Bin");
        nameList.add("hank211");
        nameList.add("Your Mom");
        for (int i = 0; i < nameList.size(); i++) {
            System.out.println((i+1)+" "+nameList.get(i));
        }
    }
}

