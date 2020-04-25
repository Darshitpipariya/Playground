#include<iostream>
using namespace std;
int main()
{
  int a;
  float b;
  cin>>a>>b;
 // cout<<b;
  if(a>13)
  {
    if(b<11)
      cout<<"$8.00";
    else
      cout<<"$5.00";
  }
  else
  {
    if(b<11)
      cout<<"$4.00";
    else
      cout<<"$2.00";
  }
  //Type your code here.
}