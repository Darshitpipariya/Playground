#include<iostream>
using namespace std;
int main()
{
  int a,b=5,c=6;
  cin>>a;
  while(a>0)
  {
    cout<<c<<" ";
    c=c+b;
    b=b+5;
    a=a-1;
  }
}