/* Problem Statement
A school is looking at automating the result processing for their students. Every student is identified with a roll number. The result is calculated by taking the test marks
of the subjects – English, Science and Math,along with his score in sports. Write a program to calculate the result (percentage scored) of 5 students using array of objects.
Create separate classes for Student, Test Marks, Sport Marks and Result with appropriate members. Inherit the Test Marks and Sports Marks class from the Student class and the
Result class from the Test Marks and Sport Marks classes. Write separate member functions for accepting the Student roll number and marks from the user. Also design the
inheritance diagram for the above. 
 Note: The members should be encapsulated well and the member functions of the class should not be inline.*/


/* using Multipath inheritence we can inherit the class student in both test_mark class and sport_score class.And the virtual base class will prevent the duplication of data 
member in both classes.*/



#include<iostream>
using namespace std;
class student    //base_class i.e Student class
{
	public:
	int roll;
	void getinput1(void);
 
};

class test_marks:virtual public student    //child_class of student class
{
	public:
	int eng;
	int sci;
	int math;
	void getinput2(void);
};

class sport_score:virtual public student   //child_class of student class
{
	public:
	int score;
	void getinput3(void);
};

class result:public test_marks, public sport_score    //child_class of student class , test_marks class and sport_score class
{
	public:
	float total;
	float avg;
	float percent;
	void calc_result(void);
};

void student::getinput1()
{
	cout<<"Enter student's Roll no."<<endl;
	cin>>roll;
}

void test_marks::getinput2()
{
	cout<<"Enter marks of english"<<endl;
	cin>>eng;
	cout<<"Enter marks of science"<<endl;
	cin>>sci;
	cout<<"Enter marks of math"<<endl;
	cin>>math;
}

void sport_score::getinput3()
{
	cout<<"Enter score in sports"<<endl;
	cin>>score;
}
void result::calc_result()
{
	total=eng+sci+math+score;
	avg=total/4.0;
	percent=(total/400.0)*100;
	cout<<"Student's Result : "<<percent<<endl;
}


int main() 
{
	int i;
	result r[5];
	for(i=0;i<5;i++)
	{
		cout<<"------------------"<<endl;
		cout<<"Details of student "<<i+1<<endl;
		r[i].getinput1();
		r[i].getinput2();
		r[i].getinput3();
		r[i].calc_result();
	}
	return 0;
}



/* output of the code

------------------
Details of student 1
Enter student's Roll no.
1
Enter marks of english
89
Enter marks of science
90
Enter marks of math
78
Enter score in sports
67
Student's Result : 81
------------------
Details of student 2
Enter student's Roll no.
2
Enter marks of english
89
Enter marks of science
78
Enter marks of math
90
Enter score in sports
76
Student's Result : 83.25
------------------
Details of student 3
Enter student's Roll no.
3
Enter marks of english
56
Enter marks of science
76
Enter marks of math
89
Enter score in sports
87
Student's Result : 77
------------------
Details of student 4
Enter student's Roll no.
4
Enter marks of english
67
Enter marks of science
87
Enter marks of math
98
Enter score in sports
89
Student's Result : 85.25
------------------
Details of student 5
Enter student's Roll no.
5
Enter marks of english
78
Enter marks of science
98
Enter marks of math
67
Enter score in sports
89
Student's Result : 83

--------------------------------
Process exited after 49.57 seconds with return value 0
Press any key to continue . . .*/

