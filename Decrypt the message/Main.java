#include<iostream>
using namespace std; 
int main()
{
  int a, b, c,i=0,d=0; 
  cin>>a>>b; 
  c=a+b;
  while(1)
  {
    i=i+1;
    c=c-i;
    if(c>-1)
    {
      if(c==0)
      {d=1;
      break; }
    }
    else
      break; 
  }
  if(d==1)
    cout<<"They can read the message";
  else
    cout<< "They can't read the message";
  return 0;
}