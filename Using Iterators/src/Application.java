import java.util.Iterator;
import java.util.LinkedList;

/*Iterators and Iterable Interface*/
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> animals = new LinkedList<String>();
		animals.add("Fox");
		animals.add("Dog");
		animals.add("Cat");
		animals.add("Rabbit");
		/*Normal way to iterate through this list is to use for each loop.
		 * HOwever this for each loop was introduced from java 6 onwards, before 
		 * that people used iterators. */
		for(String animalNames: animals){
			System.out.println("Animal: " +animalNames);
		}
		/*Iterator<template_type> it = list.iterator() which
		 *  returns an object of type iterator. Iterator can be used in  any
		 *  thing which uses or implements iterator interface. It hasNext
		 *   method, next method and remove method*/
		Iterator<String> it = animals.iterator();
		/*when we call the it.next() method for first time it looks like 
		 * iterator is pointing right before the first element of list*/
		String iteratorAnimal = it.next();
		System.out.println("iteratorAnimal: " +iteratorAnimal);
		/*Using loop*/
		while(it.hasNext()){
			String value = it.next();
			System.out.println("Next Item Value: " +value);
			/*you can also remove an item from the list like this: */
			if(value=="Cat"){
				it.remove();
				/*this can not be removal can not be done by using for each
				 * loop. Remember for each always uses iterator behind the scenes.
				 * if you have to add items as well while looping though the list 
				 * use ListIterator interface*/
			}
		}
	}

}
