#include<iostream>
using namespace std;
int main()
{
  int a, b, sum=0;
  cin>>a;
  b=a;
  while(b>0)
  {
    sum=sum+(b%10);
    b=b/10;
  }
  if(a%sum==0)
  {
    cout<<"Harshad Number";
  }
  else
    cout<<"Not Harshad Number";
  //Type your code here.
}