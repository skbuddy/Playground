#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,sumo = 0,sume = 0;
  cin>>n;
  while(n)
  {
    if(n%10%2==0)
      sume += n%10;
    else
      sumo += n%10;
    n /= 10;
  }
  if(sumo == sume)
    cout<<"Yes";
  else
    cout<<"No";
}