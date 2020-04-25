#include<iostream>
using namespace std;
int main()
{
  int a;
  cin>>a;
  for(int i=1;i<=a;i++)
  {
    if(i%2 !=0)
    {
      for(int j=1;j<a;j++)
      {
        cout<<i;
      }
      int b=i+1;
      cout<<b;
      cout<<"\n";
    }
    else
    {
      int b=i+1;
      cout<<b;
      for(int j=1;j<a;j++)
      {
        cout<<i;
      }
      cout<<"\n";
    }
  }
}