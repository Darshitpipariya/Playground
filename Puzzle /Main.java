#include<iostream>
using namespace std;
int main()
{
  int a,b;
  cin>>a>>b;
  int m1[a][b],m2[a][b];
  for(int i=0;i<a;i++)
    for(int j=0;j<b;j++)
      cin>>m1[i][j];
  /*for(int i=0;i<a;i++)
  {
    for(int j=0;j<b;j++)
    {
      m2[j][i]=m1[i][j];
    }
  }*/
  for(int i=0;i<b;i++)
  {
    for(int j=0;j<a;j++)
    {
      cout<<m1[j][i]<<" ";
    }
    cout<<"\n";
  }
    // Type your code here
}