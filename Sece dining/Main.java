#include<iostream>
using namespace std;
int main()
{
  string s1;
  int a;
  cin>>s1>>a;
  if(s1=="front" && a==1)
  {
    cout<<"Left Handed";
  }
  else if(s1=="rear" && a==1)
  {
    cout<<"Right Handed";
  }
  else if(s1=="rear" && a==2)
  {
    cout<<"Right Handed";
  }
 else if(s1=="front" && a==2)
  {
    cout<<"Left Handed";
  }
  else if(s1=="front" && a==0)
  {
    cout<<"Right Handed";
  }
  else
  {
    cout<<"Left Handed";
  }
  //Type your code here.
}