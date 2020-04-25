#include<iostream>
using namespace std;
int disum(int a)
{
  if((a/10)==0)
    return a;
  else
  {
    int sum=0,b=a;
    while(b>0)
    {
      sum=sum+(b%10);
      b=b/10;
    }
    disum(sum);
  }
}
int main()
{
  int a;
  cin>>a;
  cout<<disum(a);
}