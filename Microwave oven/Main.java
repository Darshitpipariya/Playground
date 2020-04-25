#include<iostream>
using namespace std;
int main()
{
  int a;
  float b,c;
  cin>>a>>b;
  switch(a)
  {
    case 1:c=float(b);
      cout<<b;
      break;
    case 2:c=float(b/2)+b;
      cout<<c;
      break;
    case 3:c=float(2*b);
      cout<<c;
      break;
    default:cout<<"Number of items is more";
      
  }
  //Type your code here.
}