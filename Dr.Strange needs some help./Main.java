#include<iostream>
#include<math.h>
using namespace std;
int main()
{
  int a,b,c;
  cin>>a>>b>>c;
  if(c<=pow(a,b))
    cout<<"Doctor, you can proceed with your experiment.";
  else
    cout<<"Sorry Doctor! You need more bacteria.";
}