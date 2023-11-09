package com.nano.CAO.computer.hamming;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import static java.lang.Math.pow;
import static java.util.Arrays.asList;

public class HammingEncoder implements Serializable {


    public static Boolean[] getHammingCode(List<Boolean> bitString){
        List<Boolean> newBitString  = new ArrayList<>();

        //step one define m as the data bits and r as the redundant bits.
        // 2 to the power R should be greater of equal to m + r + 1
        //there for R will be given by 2pow(r)>=m+r+1 and also 2 r must be power of 2
        int m = bitString.size();
        int r = -1;

        do{
            r++;

        }while(pow(2,r)<=m+ r + 1);
        System.out.println("Equation: 2 pow(" + r + ") >=  " + m +"+"+ r+ "+ 1");

        //create the box for the encoded bitString
        Boolean[] newString = new Boolean[m+r];
        //zero out the array
        for(int i = 0;i <r+m;i++){
             newString[i] = false;
        }

        //empty out the redundant spaces
        for(int i = 0;i <r;i++){
            System.out.println(i);
            int position =(int) pow(2,i);
            newString[position] = null;
        }


        //place the data at the position


        return newString;
    }



    public static void main(String [] args){
        System.out.println("STARTING");
        List<Boolean> bitString = asList(true,
                true,
                false,
                true,
                false,
                false,
                false,
                false,
                true,
                false,
                true,
                false,
                true,
                true,
                true,
                false);

        for (Boolean b :
                getHammingCode(bitString)) {
            if(b != null) {
                System.out.print(b.toString()+ " ");
            }else{
                System.out.print("p ");
            }
        }
        System.out.println();

    }


}
