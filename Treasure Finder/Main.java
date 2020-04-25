#include<iostream>
using namespace std;
int main()
{
  int a,b,c,max,mid,min,code;
  cin>>a>>b>>c;
  if(a>b)
  {
    if(a>c)
    {
      max=a;
    }
    else
    {
      max=c;
    }
  }
  else
  {
    if(b>c)
    {
      max=b;
      min=c;
    }
    else
    {
      min=b;
      max=c;
    }
  }
  if(max==a)
  {
    if(b<c)
    {
      min=b;
      mid=c;
    }
    else
    {
      min=c;
      mid=b;
    }
  }
  else if(max==b)
  {
    if(a<c)
    {
      min=a;
      mid=c;
    }
    else
    {
      min=c;
      mid=a;
    }
  }
  else if(max==c)
  {
    if(a<b)
    {
      mid=b;
      min=a;
    }
    else
    {
      min=b;
      mid=a;
    }
  }
  
  if(max%min==0 && mid%min==0)
  {
    code=min;
  }
  else
  {
    code=1;
  }
  cout<<"The treasure is in box which has number "<<mid;
  cout<<"\nThe code to open the box is "<<code;
  //Type your code here.
}