#include<iostream>
using namespace std;
int main()
{
  float a;
  cin>>a;
  if(a<=200)
    cout<<"Rs."<<int(a*0.5);
  else if(a<=400)
    cout<<"Rs."<<int((a*0.65)+100);
  else if(a<=600)
    cout<<"Rs."<<int((a*0.80)+200);
  else if(a>600)
    cout<<"Rs."<<int((a*1.25)+425);
  //Type your code here.
}