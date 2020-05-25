#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int a;
  string s;
  cin>>s;
  cin>>a;
  if(s=="front"&& a==1)
    cout<<"Left Handed";
  else if(s=="front")
    cout<<"Right Handed";
  else if(s=="rear"&&a==1)
    cout<<"Right Handed";
  else
    cout<<"Left Handed";
}