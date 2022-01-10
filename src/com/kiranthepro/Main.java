package com.kiranthepro;

import com.kiranthepro.library.libraryFunctions;
import com.kiranthepro.objects.cat;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {

    static ArrayList<cat> catList = new ArrayList<>();

    public static void main(String[] args) {
	// write your code here
        libraryFunctions.getInteger("TYPE: ");
        libraryFunctions.getDouble("TYPE: ");
        libraryFunctions.getString("TYPE: ");

        cat myCat = new cat(0, "whack", "cat", 3, 4, 30, "defo not chocolate", LocalDate.of(2022, 1, 9));
        cat myOtherCat = new cat(1, "bob", "cat", 3, 4.5, 30, "defo not chocolate", LocalDate.of(2022, 1, 9));

        System.out.println(myCat.toString());
        catList.add(myCat);
        catList.add(myOtherCat);
    }


}
