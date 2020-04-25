#include<iostream>
#include<string.h>
using namespace std;
int main()
{
  int a;
  cin>>a;
  int b,c;
  while(a>0)
  {
    if(a/10>0)
    {
      b=a%10;
      c=a/10;
      a=c;
    }
    else
    {
      break;
    }

  }
    
  (b==c)?cout<<"Not possible":cout<<"Possible";
}