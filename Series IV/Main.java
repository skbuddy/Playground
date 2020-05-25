#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int i=0,n,f=0,diff=2;
  cin>>n;
  while(i<n)
  {
    cout<<f<<" ";
    f +=diff;
    if(i%2==0)
      diff += 4;
    i++;
  }
}