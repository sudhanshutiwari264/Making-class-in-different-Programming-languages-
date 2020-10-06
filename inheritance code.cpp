#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;

class Publication
{   
    public:
    string title;
    float price;
    void getdata()
    {
        cin>>title>>price;
    }

    void putdata()
    {
        cout<<title<<endl;
        cout<<price<<endl;
    }
};
class Book:public Publication {
    public:
    int page_count;
    void getdata()
    {
        Publication::getdata();
        cin>>page_count;
    }
    void putdata()
    {
        Publication::putdata();
        cout<<page_count<<endl;
    }
};
class Tape:public Publication{
    public:
    float time;
    void getdata()
    {
        Publication::getdata();
        cin>>time;    
    }
    void putdata()
    {
        Publication::putdata();
        cout<<time;
    }
}; 

int main() {
    Book b;
    Tape t;
    b.getdata();
    t.getdata();
     if(b.price<0 || b.page_count<0)
    {
        cout<<-1<<endl;
    }
    else
    {
        b.putdata();
        
    }
    if(t.price<0||t.time<0)
    {
        cout<<-1<<endl;
    }
    else
    {
        t.putdata();
    }

    
    
   
    return 0;
}
