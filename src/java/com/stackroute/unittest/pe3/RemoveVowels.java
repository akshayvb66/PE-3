/**
 *Akshay Badiger
 *
 *Boeing India Pvt Ltd
 *
 * Stackroute
 */
package com.stackroute.unittest.pe3;

/**Write a program to set up an array of places, Loop round and remove the vowels. Display the new words in console
 *
 * @version 1.0 11-1-2018
 *
 * @author Akshay Badiger
 */


public class RemoveVowels {
    public static String[]  vowelsRemove(int size , String[] places){
        String[] removed = new String[size];
        for(int i=0;i<size;i++){
            places[i]=places[i].replaceAll("[aeiou]","");
            removed[i]=places[i]; }
        return removed; }
}
