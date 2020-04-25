#include<iostream>
using namespace std;
int main()
{
  int a,b;
  cin>>a;
  for(int i=2;i<=a/2;i++)
  {
    if(a%i==0)
    {
      b=1;
      break;
    }
  }
  if(a==1)
    cout<<"Not eligible";
  else if(a==2)
    cout<<"Eligible";
  else if(b==0)
    cout<<"Eligible";
  else
    cout<<"Not eligible";
}