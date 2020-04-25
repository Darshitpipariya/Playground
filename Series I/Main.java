#include<iostream>
using namespace std;
int main()
{
  int a,c=1,d;
  float b=0.5;
  cin>>a;
  while(a!=0)
  {
    cout<<b<<" ";
    b=b+c;
    c=c*3;
    a=a-1;
  }
}