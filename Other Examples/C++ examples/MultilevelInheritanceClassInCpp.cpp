/**  The class manager is inherited from the class emp which ,emp class is also inherited from 
 * class person .Thus the class emp  will possess ->
 * public  functions: void get1() from person class and void get2()  
 * protected variables: name , age from person class,basic, hra
 * And the class manager will possess->
 * public functions: void get1() from person class, void get2() from emp class, void get3(),void display()
 * protected variables: name , age from person class , hra from emp class , basic, deptcode
 */







#include<iostream >
 
class person {
    protected:
    int age;
    char *name;
    publi:void get1();
};
class emp : public person {
    protected:
    int basic,hra;
    public:
    void get2();
};
class manager : public emp{
    protected:
    int deptcode;
    public:
    void get3();
    void display();
};
void person :: get1() {
    cout<<"Enter your age\n";
    cin>>age;
    cout<< "Enter your Name\n";
    cin>>name;
}
void emp :: get2() {
    cout<<"Enter your basic and hra\n";
    cin>>basic>>hra;
}
void manager :: get3() {
    cout<<"Enter your deptcode\n";
    cin>>deptcode;
}
void manager :: display() {
    cout<<"name is "<<name;
    cout<<"\n age is"<<age;
    cout<<"\n basic and hra"<<basic<<" "<<hra;
    cout<<"\n deptcode is "<<deptcode;
}
void main(){
    manager obj;
    obj.get1();
    obj.get2();
    obj.get3();
    obj.display();
     
}

/**  Output->
 * Enter your age
 * 18
 * Enter your Name
 * Ansuman
 * Enter your basic and hra
 * 25000 5000
 * Enter your deptcode
 * 1001
 * name is Ansuman
 * age is 25
 * basic and hra 25000 5000
 * deptcode is 1001
 */