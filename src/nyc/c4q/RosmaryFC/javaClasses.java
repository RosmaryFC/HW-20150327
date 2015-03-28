package nyc.c4q.RosmaryFC;

/**
 * Created by c4q-rosmary on 3/26/15.
 * 2. Java Classes

 You are provided with a Person class.
 This class has private fields name, phoneNumber and city, along with their getter and setter methods.

 Write a function called checkSameCity which accepts as input two Person instances and checks if they live in the same city.
 The function should return a boolean value
 A Person has recently had a child, whose name is 'Abc'.
 Write a function called registerChild which accepts as input a Person instance(Parent)
 and returns a new Person instance for the child, which has the same phoneNumber and city as the parent.
 */

public class javaClasses {
    public static void main (String[] args){
        Person jane = new Person("Jane");
        Person john = new Person("John");
        jane.setCity("corona");
        john.setCity("corona");

        System.out.println(checkSameCity(jane, john));

        Person mom = new Person ("Rose");
        mom.setCity("corona");
        mom.setPhoneNumber("3475555555");

        Person Abc = registerChild(mom); // setting person instance for child to equal registerChild method so it can be called from print method
        System.out.println(Abc.getPhoneNumber()); //input whichever method you would like to know about child
    }

    public static boolean checkSameCity (Person one, Person two){
        if(one.getCity().equalsIgnoreCase(two.getCity())) {
            return true;
        }


        return false;
    }

    public static Person registerChild (Person parent){

        Person child = new Person ("Abc");

        child.setCity(parent.getCity());
        child.setPhoneNumber(parent.getPhoneNumber());

        return child;
    }
}
