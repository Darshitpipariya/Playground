#include<iostream>
using namespace std;
int main()
{
  int a,b,f=0;
  cin>>a;
  int arr[a];
  for(int i=0;i<a;i++)
  {
    cin>>arr[i];
  }
  cin>>b;
  for(int i=0;i<a;i++)
  {
    if(arr[i]==b)
    {
      f=1;
      break;
    }
  }
  if(f==1)
    cout<<"She passed her exam";
  else
    cout<<"She failed";
  // Type your code here
}