#include<iostream>
using namespace std;
int main()
{
  int a;
  cin>>a;
  a=a-1;
  for(int i=0;i<4;i++)
  {
    a=a+1;
    for(int j=0;j<=i;j++)
    {
      cout<<a;
    }
    cout<<"\n";
  }
  a=a+1;
  for(int i=4;i>0;i--)
  {
    a=a-1;
    for(int j=0;j<i;j++)
    {
      cout<<a;
    }
    cout<<"\n";
  }
}