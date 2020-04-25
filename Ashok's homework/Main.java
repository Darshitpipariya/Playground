#include<iostream>
using namespace std;
int main()
{
  int a,b;
  cin>>a>>b;
  int m1[a][b],m2[a][b],m3[a][b];
  for(int i=0;i<a;i++)
    for(int j=0;j<b;j++)
      cin>>m1[i][j];
  for(int i=0;i<a;i++)
    for(int j=0;j<b;j++)
      cin>>m2[i][j];
  for(int i=0;i<a;i++)
  {
    for(int j=0;j<b;j++)
    {
      m3[i][j]=m1[i][j]+m2[i][j];
      cout<<m3[i][j]<<" ";
    }
    cout<<"\n";
  }
    // Type your code here
}