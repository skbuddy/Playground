#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,temp=0,len,sumr=1;
  cin>>n;
  temp = n;
  while(temp)
  {
    temp /= 10;
    len++;
  }
  temp = n*n;
  while(len)
  {
    sumr *= 10;
    len--;
  }
  if(n==temp%sumr + temp/sumr)
    cout<<"Kaprekar Number";
  else
    cout<<"Not a Kaprekar Number";
  
}