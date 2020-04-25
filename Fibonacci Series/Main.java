#include<iostream>
using namespace std;
int fibo(int a)
{
  if(a==1)
    return 1;
  if(a==0)
    return 0;
  return fibo(a-1)+fibo(a-2);
}
int main()
{
  int a,b;
  cin>>a;
  b=fibo(a-1);
  cout<<"The term "<<a<<" in the fibonacci series is "<<b;
  //Type your code here.
}