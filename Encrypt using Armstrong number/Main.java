#include<iostream>
int power(int m,int n)
{
    int j,i;
    for(i=1,j=1;i<=n;i++)
        j=j*m;
    return j;
}
int arm(int n)
{
  int a,c,b=0,d,sum;
  a=n;
  c=n;
  while(a>0)
  {
    a=a/10;
    b=b+1;
  }
  while(c>0)
  {
   d=c%10;
   sum=sum+power(d,b);
   c=c/10;
  }
  if(sum==n)
    return 1;
  else
    return 0;
    
    //Your code goes here
}
int main()
{
    int n;
    std::cin>>n;
    if(arm(n)==1)
        std::cout<<"Kindly proceed with encrypting";
    else
        std::cout<<"It is not an Armstrong number";
    
}