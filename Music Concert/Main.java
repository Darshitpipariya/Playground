#include<iostream>
#include<cstdlib>
using namespace std;
int main(){
  int a,o=0,e=0;
  cin>>a;
  int *pt;
  pt=(int*)malloc(a*sizeof(int));
  for(int i=0;i<a;i++)
  {
    cin>>*(pt+i);
    if(*(pt+i)%2==0)
    {
      e=e+1;
    }
    else
    {
      o=o+1;
    }
  }
  cout<<o<<"\n";
  cout<<e;
  // Type your code here
  return 0;
}