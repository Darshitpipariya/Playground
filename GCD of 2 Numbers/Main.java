#include<iostream>
using namespace std;
int gcd(int a,int b)
{
  if(b==0)
    return a;
  else
  {
    if(a<b)
    {
      gcd(a,b%a);
    }
    else
      gcd(b,a%b);
  }
}
int main()
{
  int a,b;
  cin>>a>>b;
  cout<<"G.C.D of "<<a<<" and "<<b<<" = "<<gcd(a,b);
  //Type your code here.
}