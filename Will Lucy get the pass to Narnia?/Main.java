#include<iostream>
using namespace std;
int main()
{
  int a,b,c;
  cin>>a>>b>>c;
  cout<<"Enter first number : Enter second number : Menu";
  cout<<"\n1.Addition";
  cout<<"\n2.Subtraction";
  cout<<"\n3.Multiplication";
  cout<<"\n4.Division";
  cout<<"\n5.Remainder\n";
  switch(c)
  {
    case 1:cout<<a+b;
      break;
    case 2:cout<<a-b;
      break;
    case 3:cout<<a*b;
      break;
    case 4:cout<<a/b;
      break;
    case 5:cout<<a%b;
      break;
    default :cout<<"Invalid operation";
  }
}