#include<iostream>
using namespace std;
int main()
{
  int fa,fd,fc,sa,sd,sc,aa,ad,ac;
  float ft,st,at;
  cin>>fa>>fd>>fc>>sa>>sd>>sc>>aa>>ad>>ac;
  ft=fa+fc-((fa*fd)/100);
  st=sa+sc-((sa*sd)/100);
  at=aa+ac-((aa*ad)/100);
  cout<<"In Flipkart Rs."<<ft;
  cout<<"\nIn Snapdeal Rs."<<st;
  cout<<"\nIn Amazon Rs."<<at;
  if(ft<at)
  {
    if(ft<=st)
      cout<<"\nHe will prefer Flipkart";
    else
      cout<<"\nHe will prefer Snapdeal";
  }
  else
  {
    if(at<=st)
      cout<<"\nHe will prefer Amazon";
    else
      cout<<"\nHe will prefer Snapdeal";
  }
    
  //Type your code here.
}