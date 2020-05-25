#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int dollar,cent,sumd=0,sumc=0;
  cin>>dollar>>cent;
  sumd = sumd + dollar;
  sumc = sumc + cent;
  cin>>dollar>>cent;
  sumd = sumd + dollar;
  sumc = sumc + cent;
	if(sumc>100)
    { sumc = sumc-100;
  		sumd++;}
  cout<<sumd<<endl<<sumc;
}