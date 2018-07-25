package lang;
/*
 * 		IMMUTABILITY::=-=>
 * 							String objects are immutable in nature 
 * 								once we create an object we can't perform  any changes to the existing object if we are trying to make change 
 * 								with those changes an new  object will   be created , 	this behavior is nothing but 
 * 									"IMMUTABILITY"
 * 
 * 		FOR EVERY CREATION OF  THE STRING OBJECT  THE OBJECT IS PLACED AT THE HEAP AND SCP[STRING CONSTANT POLE ] AREA
 * 
 * 		-->in String class --->.equals() method is overridden for content comparison
 */

public class String_Class {
	
	public static void main(String[] args)
	{
		String n = new String("object-heap+scp");
		String n1=n.concat("runtimme");//--------->runtime object is created in heap [n1----->object-heap+scpruntimme]
		String n2=n.concat("object-heap+scp"); //----->no new object will be created [n2----->SCP area's reference]
	}

}
