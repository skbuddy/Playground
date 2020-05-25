#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n, f = 11;
  cin>>n;
  while(n)
  {
    cout<<f*f<<" ";
    f += 4;
    n--;
  }
  
}