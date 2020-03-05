package com.epam.Collection;


public class customArrayListExample {
	public static void main(String args[]) {
	customArrayList<String> list=new customArrayList<String>();
	list.add("Telangana");
    list.add("MadhyaPradesh");
    list.add("Kerala");
    list.add("ArunachalPradesh");
    list.add("Karnataka");
    list.add("UttarPradesh");
    list.add("Gujarath");
    list.add("Goa");
    list.add("Tamilnadu");
    list.add("Bihar");
    
    System.out.println("Intial size of CustomArrayList: "+ list.initial_size);
    
    System.out.println("---------------------------------------");
    System.out.println("Print the elements in CustomArrayList:");
    list.print();
    System.out.println();
    System.out.println("---------------------------------------");
    
    System.out.println("Fetch an element from CustomArrayList by index: "+list.fetch(9));
    System.out.println("---------------------------------------");
    
    System.out.println("Adding Elements to CustomArrayList:");
    list.add("SriLanka");
    list.add("Pakistan");
       
    System.out.println("Print the elements in CustomArrayList:");
    list.print();
    System.out.println();
    System.out.println("------------------------------------------------");
    
    System.out.println("Remove element from CustomArrayList:");
    list.remove(2);
    
    System.out.println("Print the elements in CustomArrayList:");
    list.print();
    
    
    
 }
}
