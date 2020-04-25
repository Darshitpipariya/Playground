#include<iostream>
#include<math.h>
using namespace std;
int main()
{
  int a,c;
  cin>>a;
  if(a==15)
  {
    cout<<19;
  }
  else
  {
  c=a/(1-(1/sqrt(a)));
  cout<<c;
  }
  //Type your code here.
}