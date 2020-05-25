#include<iostream>
using namespace std;
int main()
{
  int n,f=6,diff =5;
  cin>>n;
  while(n)
  {
    cout<<f<<" ";
    f += diff;
    diff += 5;
    n--;
  }
  
  return 0;
  
}