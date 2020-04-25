#include<iostream>
using namespace std;
int main()
{
  int x,r,y;
  double interest,amount,discount,total;
  cin>>x>>r>>y;
  interest=(x*r*y)/100;
  amount=x+interest;
  discount=(interest*2)/100;
  total=x+interest-discount;
  cout<<interest<<"\n"<<amount<<"\n"<<discount<<"\n"<<total;
  //Type your code here.
}