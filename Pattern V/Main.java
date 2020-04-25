#include<iostream>
using namespace std;
int main()
{
  int a,c=0,co=1;
  cin>>a;
  for(int i=a;i>0;i--)
  {
    int d=c*2;
    for(int k=0;k<d;k++)
    {
      cout<<"-";
    }
    for(int j=1;j<=i;j++)
    {
      cout<<co<<"*";
      co=co+1;
    }
    int re=((a*(a+1))/2)+(((i-1)*(i))/2)+1;
    for(int l=1;l<i;l++)
    {
      cout<<re<<"*";
      re=re+1;
    }
    cout<<re;
    cout<<"\n";
    c=c+1;
  }
}