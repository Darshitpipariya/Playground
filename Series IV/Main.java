#include<iostream>
using namespace std;
int main()
{
  int a,b=2,c=0,d=0;
  cin>>a;
  while(a>0)
  {
    cout<<c<<" ";
    d=d+1;
    if(d==2)
    {
      b=b+4;
      d=0;
    }
    
    c=c+b;
    a=a-1;
    
  }
  //Type your code here.
}