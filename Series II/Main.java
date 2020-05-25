#include<iostream>
using namespace std;
int main()
{
  int n,f=11,diff=4;
  cin>>n;
  while(n)
  {
	cout<<f*f <<" ";
    f +=diff;
    n--;
  }
  return 0;
  
}