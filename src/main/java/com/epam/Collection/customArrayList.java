package com.epam.Collection;

import java.util.Arrays;

public class customArrayList<E> {
   static final int initial_size=10;
   int size=0;
   Object data[]= {};
   
   public customArrayList() {
       data = new Object[initial_size];
  }
   public E fetch(int index) {
       if (index < 0 || index >= size) 
              throw new IndexOutOfBoundsException();
       
       return (E)data[index]; 
  }

   public void add(E e) {
	   if (size == data.length) 
           manageCapacity(); 
    
       data[size++] = e;
  }
   public Object remove(int index) {
      
    if (index < 0 || index >= size) 
              throw new IndexOutOfBoundsException();
       
      Object elementRemoved = data[index];
       for (int i = index; i < size - 1; i++) {
              data[i] = data[i + 1];
       }
       size--;

       return elementRemoved;
   }
   public void print() {
       for (int i = 0; i < size; i++) 
              System.out.print(data[i] + "   ");
       
   }
   public void manageCapacity() {
       data = Arrays.copyOf(data, data.length*2);
}
   
    
}

