// Notes:
//  two dimensional arrays: double arr[y][x] (row x col)
//  ragged arrays: when the rows are not all the same length (# of columns per row)
//  length for 2d arrays: arr.length is # of rows; arr[y].length is # of columns in row x
//  three dimensional arrays convention: int arr[depth][row][col]
//  variable-length argument list: public int func(int... numbers)
//  java ArrayList class: analogous to C++ vector class
//      import java.util.ArrayList;
//      ArrayList<String> nameList = new ArrayList<String>();
//      nameList.add("name"); nameList.add(i, "name"); (inserts @ index i)
//      nameList.size();
//      nameList.get(i); (first element @ index 0)
//      nameList.set(i, "name"); (replaces item at index i)
//      can be used with enhanced for loop

import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

public class NiclasBBArrayList {
    private static Scanner input;
    public static void main(String args[]) throws IOException{
        File file = new File("basketballplayers.txt");
        if (!file.exists()) {
            System.out.println("File does not exist");
            return;
        }
        input = new Scanner(file);

        ArrayList<NiclasBasketballPlayer> list = new ArrayList<>();
        fillBBArrayList(list);
        printBBPlayers(list);

        input.close();
    }

    public static void fillBBArrayList(ArrayList<NiclasBasketballPlayer> list) {
        NiclasBasketballPlayer player;
        while(input.hasNext()) {
            player = new NiclasBasketballPlayer(input.nextLine(), input.nextLine(), input.nextLine());
            player.setShotAttempts(input.nextInt()); input.nextLine();
            player.setShotsMade(input.nextInt()); input.nextLine();
            list.add(player);
        }
    }

    public static void printBBPlayers(ArrayList<NiclasBasketballPlayer> list) {
        for (NiclasBasketballPlayer player : list) {
            player.displayPlayer();
        }
    }
}