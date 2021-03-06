/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package floyd_warshall;

import java.util.*;
import java.lang.*;
import java.io.*;

public class Floyd_Warshall {

    static int infinity = 9999;

    public static void main(String[] args) {

        System.out.println("The following matrix shows the shortest paths between every pairs in the graph");

        //implement the matrix       
        int graph[][] = {{0, 10, infinity, infinity, infinity, 5, infinity, infinity, infinity, infinity},
        {infinity, 0, 3, infinity, 3, infinity, infinity, infinity, infinity, infinity},
        {infinity, infinity, 0, 4, infinity, infinity, infinity, 5, infinity, infinity},
        {infinity, infinity, infinity, 0, infinity, infinity, infinity, infinity, 4, infinity},
        {infinity, infinity, 4, infinity, 0, infinity, 2, infinity, infinity, infinity},
        {infinity, 3, infinity, infinity, infinity, 0, infinity, infinity, infinity, 2},
        {infinity, infinity, infinity, 7, infinity, infinity, 0, infinity, infinity, infinity},
        {infinity, infinity, infinity, 4, infinity, infinity, infinity, 0, 3, infinity},
        {infinity, infinity, infinity, infinity, infinity, infinity, infinity, infinity, 0, infinity},
        {infinity, infinity, infinity, infinity, infinity, infinity, 8, infinity, infinity, 0}
        };
        algorithm c = new algorithm();

        //call the fanction that will check the matrix and print it
        c.floydWarshall(graph);
    }

}
