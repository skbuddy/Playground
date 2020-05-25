#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,temp=0,sum=0;
  cin>>n;
  temp = n;
  while(n)
  {
    sum += n%10;
    n /= 10;
  }
  if(temp%sum==0)
    cout<<"Harshad Number";
  else
    cout<<"Not Harshad Number";
}