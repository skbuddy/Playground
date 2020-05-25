#include<iostream>
using namespace std;
int scale(int a)
{

  if(a==0)
    return 0;
  else if(a>8)
    return (8*100+(a-8)*115);
  return a*100;
}
int main()
{
  //Type your code here.
  int i=0,arr[7],amt =0,pay=0;
  for(i=0;i<7;i++)
  {
    scanf("%d",&arr[i]);
    if(i==0)
      amt =1.5*scale(arr[i]);
    else if(i==6)
      amt =1.25*scale(arr[i]);
    else
      amt = scale(arr[i]);
    pay =pay+amt;
  }
  cout<<pay;
}