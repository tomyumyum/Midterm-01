
   public class Stack {
       public static void main(String[] args) {
            Stack<String> resume = new Stack<>(); //Declare a stack
            resume.push("JavaScript"); //first element inserted
            System.out.println("Is empty: \t" + resume.isEmpty()); // return a empty stack but it has a element.
            resume.push("Scala"); 
            resume.push("C++"); 
            resume.push("Dart"); 
            resume.push("Go"); 
     
            resume.pop(); 
            System.out.println("Stack : \t" + resume); //full stack array[]
            resume.push("Python"); 
            System.out.println("search() : \t" + resume.search("Scala")); // location of Scala from the top of the Stack.
            System.out.println("pop() : \t" + resume.pop()); // return objects that has been removed.
            System.out.println("pop() : \t" + resume.pop()); // return objects that has been removed. 
            System.out.println("search() : \t" + resume.search("Dart")); // return -1 becasue Dart is poped
            System.out.println("After pop() : \t" + resume); // full stack array[]
            System.out.println("pop() : \t" + resume.pop()); // return objects that has been removed. 
            System.out.println("Is empty : \t" + resume.isEmpty()); // return true if empty
            System.out.println("Stack:  \t" + resume);// full stack array[]
        }
    }
    
/*
Is empty: false
Stack : [JavaScript, Scala, C++, Dart]
search() : 4
pop() : Python
pop() : Dart
search() : -1
After pop() : [JavaScript, Scala, C++]
pop() : C++
Is empty : false
Stack: [JavaScript, Scala]
 */