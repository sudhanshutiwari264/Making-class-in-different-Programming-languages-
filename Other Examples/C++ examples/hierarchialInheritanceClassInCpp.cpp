/**Simple example of hierarchial Inheritance
 * Here class B ,class C, class D are inherited from the class A .in the main program the 
 * objects were created for all the subclass to access their member function.Thus
 * class B has -> 
 * public: get() from class A, add()
 * protected: y from class A ,x
 * private: m
 * class C has->
 * public: get() from class A, mul()
 * protected:  y from class A ,x
 * private: n
 * class D has->
 * public: get() from class A, division()
 *protected:  y from class A ,x
 * private: l 
 */



#include<iostream.h>
using namespace std;
class A{
    protected :
    int x,y;
    
    public:
    void get() {
        cout<<"\n Enter two values";
        cin>>x>>y;
    }
};
class B : class A {
    private:
    int m;
    public :
    void add(){
        m=x+y;
        cout<<"sum is "<<m;
    }
};
class C : class A {
    private:
    int n;
    public:
    void mul(){
        n=x*y;
        cout<<"The product is"<<n;
    }
};
class D : class A{
    private:
    float l;
    public :
        void division(){
            l=x/y;
            cout<<"The quotient is"<<l;
        }
    };
    void main (){
        B obj1;
        C obj2;
        D obj3;
        obj1.get();
        obj1.add();
        obj2.get();
        obj2.mul();
        obj3.get();
        obj3.division();
    }

    /** Output 
     * Enter two values 
     * 12 6
     * sum is 18
     * Enter two values
     * 12 6
     * The product is 72
     * Enter two values
     * 12 6
     * The quotient is 2
    */
