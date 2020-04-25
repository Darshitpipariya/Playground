#include<iostream>
using namespace std;
int main()
{
  int a,b,c;
  cin>>a>>b>>c;
  if(((c>=a+1) && (c<=a*2)) || ((c>=(a*b-(2*a)+1)) && (c<=a*b-a)) )
    cout<<"It is a mango tree";
  else
    cout<<"It is not a mango tree";
  //Type your code here.
}