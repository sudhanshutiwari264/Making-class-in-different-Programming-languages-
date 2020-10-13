/*
Real life example of polymorphism: A person at the same time can have different characteristic. Like a 
man at the same time is a father, a husband, an employee. So the same person posses different behaviour 
in different situations. This is called polymorphism.

Polymorphism is considered as one of the important features of Object Oriented Programming. Polymorphism 
allows us to perform a single action in different ways. In other words, polymorphism allows you to define 
one interface and have multiple implementations. The word “poly” means many and “morphs” means forms, So it 
means many forms.

*/

/*
In Java polymorphism is mainly divided into two types:

(01)Compile time Polymorphism(Overloading)
(02)Runtime Polymorphism(Overiding)


*/

//(01)Overloaing Example

        //Method Overloading
class MultiplyFun { 
  
    // Method with 2 parameter 
    static int Multiply(int a, int b) 
    { 
        return a * b; 
    } 
  
    // Method with the same name but 2 double parameter 
    static double Multiply(double a, double b) 
    { 
        return a * b; 
    } 
} 
  
class Main { 
    public static void main(String[] args) 
    { 
  
        System.out.println(MultiplyFun.Multiply(2, 4)); 
  
        System.out.println(MultiplyFun.Multiply(5.5, 6.3)); 
    } 
} 
        //Operator Overloading
class OperatorOVERDDN { 
  
    void operator(String str1, String str2) 
    { 
        String s = str1 + str2; 
        System.out.println("Concatinated String - "
                           + s); 
    } 
  
    void operator(int a, int b) 
    { 
        int c = a + b; 
        System.out.println("Sum = " + c); 
    } 
} 
  
class Main { 
    public static void main(String[] args) 
    { 
        OperatorOVERDDN obj = new OperatorOVERDDN(); 
        obj.operator(2, 3); 
        obj.operator("joe", "now"); 
    } 
} 



//overriding Example
class Parent { 
  
    void Print() 
    { 
        System.out.println("parent class"); 
    } 
} 
  
class subclass1 extends Parent { 
  
    void Print() 
    { 
        System.out.println("subclass1"); 
    } 
} 
  
class subclass2 extends Parent { 
  
    void Print() 
    { 
        System.out.println("subclass2"); 
    } 
} 
  
class TestPolymorphism3 { 
    public static void main(String[] args) 
    { 
  
        Parent a; 
  
        a = new subclass1(); 
        a.Print(); 
  
        a = new subclass2(); 
        a.Print(); 
    } 
} 