#include<iostream>
using namespace std;
int main()
{
  int a=0, b=1, n,c,count;
  cin>>n;
  while(n-2)
  {
    c=a+b;
    a=b;
    b=c;
    n=n-1;
  }
  cout<<c; 
  //Type your code here.
}