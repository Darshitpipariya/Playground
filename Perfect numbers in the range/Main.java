#include<iostream>
using namespace std;
int main()
{
  int a,b,c,d;
  cin>>a>>b;
  for(int i=a+1;i<b;i++)
  {
    int t=i,sum=0,j=1;
    while(j<i)
    {
      if(i%j==0)
        sum=sum+j;
      j=j+1;
    }
    if(sum==i)
      cout<<i<<" ";
  }
}