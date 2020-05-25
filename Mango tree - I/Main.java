#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int a,b,c;
  cin>>a>>b>>c;
  if(a>c || a*(b-1)<c || (c-1)%a==0)
    cout<<"Yes";
  else 
    cout<<"No";
}