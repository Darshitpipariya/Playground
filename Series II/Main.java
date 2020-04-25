#include<iostream>
using namespace std;
int main()
{
  int a,b=104,c=121;
  cin>>a;
  while(a!=0)
  {
    cout<<c<<" ";
    c=c+b;
    b=b+32;
    a=a-1;
  }
}