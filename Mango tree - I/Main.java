#include<iostream>
using namespace std;
int main()
{
  int a,b,c,d=0;
  cin>>a>>b>>c;
  if(c<=b)
  {
    d=1;
  }
  else
  {
    for(int i=1;i<a;i++)
    {
      if(c==(i*b) || c==(i*b+1))
      {
        d=1;
      }
    }
  }
  if(c==(a*b))
  {
    d=1;
  }
  if(d==1)
  {
    cout<<"Yes";
  }
  else
  {
    cout<<"No";
  }
  //Type your code here.
}