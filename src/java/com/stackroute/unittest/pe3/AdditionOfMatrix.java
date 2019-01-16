/**
 *Akshay Badiger
 *
 *Boeing India Pvt Ltd
 *
 * Stackroute
 */
package com.stackroute.unittest.pe3;

import java.util.Scanner;
/** Write a program to compute the addition of two matrix, Read the number of rows and columns as input, also the values of each matrix
 *
 * @version 1.0 11-1-2018
 *
 * @author Akshay Badiger
 */


public class AdditionOfMatrix {
public static int[][] sumOfMatrix(int rows,int columns,int[][] matrixA,int[][] matrixB) {
    int[][] result = new int[rows][columns];
    if (matrixA.length != matrixB.length) {
        return null; }
    else {
        String s = "";
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                result[i][j] = matrixA[i][j] + matrixB[i][j];
                s = s + result[i][j]; }
        }
        System.out.println(s + " ");
        return result; } }
}
