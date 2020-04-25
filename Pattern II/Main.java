#include<iostream>
using namespace std;
int main()
{
  int a,b=1,c;
  cin>>a;
  for(int i=1;i<=a;i++)
  {
    if(i%2!=0)
    { 
      for(int j=1;j<i;j++)
      {
        cout<<b<<"*";
        b=b+1;
      }
      cout<<b;
      b=b+1;
    }
    else
    {
      b=b+i;
      for(int j=1;j<i;j++)
      {
        b=b-1;
        cout<<b<<"*";
      }
      b=b-1;
      cout<<b;
      b=b+i;
    }
    cout<<"\n";
  }
}