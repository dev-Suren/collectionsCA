package com.binarysearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException
    {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(55);
        arrayList.add(76);
        arrayList.add(77);
        arrayList.add(76);
        arrayList.add(5);
        Collections.sort(arrayList);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("---------------please input tat you want to find it");
        int searchInput = Integer.parseInt(bufferedReader.readLine());
        int index1 = Collections.binarySearch(arrayList,searchInput);
        System.out.println("number is in this "+index1);
        System.out.println(arrayList.get(index1));


        List<String> names = new LinkedList<>();
        names.add("suren rana");
        names.add("raman shyam");
        names.add("bishwash rana");
        names.add("jaya shyam");
        Collections.sort(names);
        System.out.println("---------------Please input the name of the student---------");
        String searchInput1 = bufferedReader.readLine();
        int index = Collections.binarySearch(names,searchInput1);
        System.out.println("name is in "+index);
        System.out.println(names.get(index));




}}
