package com.core.java.dsa.arrays;

import java.util.Arrays;

public class ArrayDesign {
    int size;
    int capacity;
    int[] arr;

    public ArrayDesign() {
        this.size = 0;
        this.capacity = 10;
        this.arr = new int[capacity];
    }

    public ArrayDesign(int capacity) {
        this.size = 0;
        this.capacity = capacity;
        this.arr = new int[capacity];
    }

    public int size() {
        return size;
    }

    public int capacity() {
        return capacity;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public String toString() {
        String str = "";

        for(int i = 0;i<size; i++){
            str = str + "" + arr[i] + ",";
        }

        if (size != 0)
            str = str.substring(0, str.length() - 1);

        str =  "[" + str + "]";
        return str;

        //return Arrays.toString(arr);
    }

    public void add(int element) {
        if (size == capacity) {
            resizeArray();
        }
        arr[size] = element;
        size++;
    }

    public void add(int position, int element) {
        if (size == capacity) {
            resizeArray();
        }

        int index = position - 1;
        for (int i = capacity - 1; i > index; i--) {
            arr[i] = arr[i - 1];
        }

        arr[index] = element;
        size++;
    }

    public void removeAt(int index){
        for(int i = 0; i<=capacity-2; i++){
            arr[i] = arr[i+1];
        }
        arr[size-1] = 0;

        size--;
    }

    public void removeElement(int element){
        int myIndex = -1;
        for(int i = 0; i<arr.length-1; i++){
            if(arr[i] == element)
                myIndex = i;
        }

        if(myIndex != -1){
            removeAt(myIndex);
        }
    }

    public boolean contains(int element){
        for(int i = 0; i<arr.length; i++){
            if(arr[i] == element){
                return true;
            }
        }

        return false;
    }


    public static void main(String[] args) {
        ArrayDesign array = new ArrayDesign(5);
        System.out.println(array.toString());
        System.out.println("size : " + array.size());
        System.out.println("isEmpty : " + array.isEmpty());
        System.out.println("capacity : " + array.capacity());

        System.out.println("==============================");
        array.add(110);
        array.add(120);
        array.add(130);
        array.add(140);

        System.out.println(array.toString());
        System.out.println("size : " + array.size());
        System.out.println("isEmpty : " + array.isEmpty());
        System.out.println("capacity : " + array.capacity());

        System.out.println("==============================");

        array.add(3, 77);
        array.add(3, 88);
        array.add(3, 99);

        System.out.println(array.toString());
        System.out.println("size : " + array.size());
        System.out.println("isEmpty : " + array.isEmpty());
        System.out.println("capacity : " + array.capacity());

        System.out.println("==============================");

        array.add( 177);
        array.add( 188);
        array.add( 299);
        array.add( 399);
        array.add( 499);
        array.add( 599);

        System.out.println(array.toString());
        System.out.println("size : " + array.size());
        System.out.println("isEmpty : " + array.isEmpty());
        System.out.println("capacity : " + array.capacity());

        System.out.println("==============================");
        System.out.println(array.toString());
        array.removeAt(0);
        System.out.println(array.toString());
        System.out.println("size : " + array.size());
        System.out.println("isEmpty : " + array.isEmpty());
        System.out.println("capacity : " + array.capacity());

        System.out.println("==============================");
        System.out.println(array.toString());
        System.out.println(array.contains(9));
        System.out.println(array.toString());
        System.out.println("size : " + array.size());
        System.out.println("isEmpty : " + array.isEmpty());
        System.out.println("capacity : " + array.capacity());

        System.out.println("==============================");
        System.out.println(array.toString());
        array.removeElement(140);
        System.out.println(array.toString());
        System.out.println("size : " + array.size());
        System.out.println("isEmpty : " + array.isEmpty());
        System.out.println("capacity : " + array.capacity());
    }

    private void resizeArray() {
        // Resize the array
        int newCapacity = capacity + (capacity >> 1);
        int temp[] = new int[newCapacity];
        System.arraycopy(arr, 0, temp, 0, capacity);
        this.arr = temp;
        this.capacity = newCapacity;
    }


}
