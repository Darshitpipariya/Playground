#include<iostream>
using namespace std; 
int main()
{
  int a,b=0;
  cin>>a; 
  do
  {b=b+1;
   a=a/10;}
  while(a>0);
  cout<<b; 
  // Type your code here
}