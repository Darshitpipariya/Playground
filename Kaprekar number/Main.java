#include<iostream>
using namespace std;
int main()
{
  int a,b=0,c,d,e=0,f,div=1,g;
  cin>>a;
  c=a;
  while(c>0)
  {
    b=b+1;
    c=c/10;
  }
  d=a*a;
  while(b!=0)
  {
   div=div*10;
    b=b-1;
  }
  e=d%div;
  f=d/div;
  g=f+e;
  if(g==a)
  {
    cout<<"Kaprekar Number";
  }
  else
    cout<<"Not a Kaprekar Number";
  //Type your code here.
}