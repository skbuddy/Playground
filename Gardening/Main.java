#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int a,b,c;
  cin>>a>>b>>c;
  if((a<c && c<=(2*a)) || ((a*(b-2))<c && c<=(a*(b-1))))
    cout<<"It is a mango tree";
  else
    cout<<"It is not a mango tree";
}