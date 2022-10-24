
   public class Stack {
       public static void main(String[] args) {
            Stack<String> resume = new Stack<>(); 
            resume.push("JavaScript"); 
            System.out.println("Is empty: \t" + resume.isEmpty()); 
            resume.push("Scala"); 
            resume.push("C++"); 
            resume.push("Dart"); 
            resume.push("Go"); 
     
            resume.pop(); 
            System.out.println("Stack : \t" + resume); 
            resume.push("Python"); 
            System.out.println("search() : \t" + resume.search("Scala")); 
            System.out.println("pop() : \t" + resume.pop()); 
            System.out.println("pop() : \t" + resume.pop()); 
            System.out.println("search() : \t" + resume.search("Dart")); 
            System.out.println("After pop() : \t" + resume); 
            System.out.println("pop() : \t" + resume.pop()); 
            System.out.println("Is empty : \t" + resume.isEmpty()); 
            System.out.println("Stack:  \t" + resume);
        }
    }
    
