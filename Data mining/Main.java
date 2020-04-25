#include<iostream>
using namespace std;
int main()
{
  int a,b,c,odd=0,even=0;
  cin>>a;
  b=a;
  while(b>0)
  {
    c=b%10;
    b=b/10;
    if(c%2==0)
    {
      even=even+c;
    }
    else
      odd=odd+c;
  }
  if(even==odd)
    cout<<"Yes";
  else
    cout<<"No";
  //Type your code here.
}