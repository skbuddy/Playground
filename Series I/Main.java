#include<iostream>
using namespace std;
int main()
{
  int n,inc=1;
  float f =0.5;
  cin>>n;
  while(n)
  {
    cout<<f<<" ";
    f += inc;
    inc *= 3;
    n--;
  }
  return 0;
  
}