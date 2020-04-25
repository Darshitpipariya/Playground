#include<iostream>
using namespace std;
int gcd(int a,int b,int c,int small)
{
  while(small>=1)
  {
    if(a%small==0 && b%small==0 && c%small==0)
      return small;
    small=small-1;
  }
  return 1;
}
int main()
{
  int a,b,c,d,small=0;
  cin>>a>>b>>c>>d;
  if(b>a)
  {
    if(c>a)
      small=a;
    else
      small=c;
  }
  else
  {
    if(c>b)
      small=b;
    else
      small=c;
  }
  if(gcd(a,b,c,small)==d)
    cout<<"Answer is correct.";
  else
    cout<<"Answer is wrong.";
}