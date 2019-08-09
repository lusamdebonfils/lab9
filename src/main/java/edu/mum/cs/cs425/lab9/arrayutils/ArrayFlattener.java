package edu.mum.cs.cs425.lab9.arrayutils;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ArrayFlattener {
    public int[] flattenArray(int[][] a_in){
        if(a_in == null) return null;
        return Arrays.stream(a_in).flatMapToInt((a)-> IntStream.of(a)).toArray();
    }
}
