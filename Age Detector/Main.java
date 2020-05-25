#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int a,b;
  cin>>a>>b;
  if(a>b)
  {
    if(b==0)
      	cout<<100-a;
    else
      	cout<<100-a+b;
  }
  else
    	cout<<b-a;
    return 0;
}