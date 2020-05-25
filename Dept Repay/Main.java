#include<iostream>
#include<iomanip>
using namespace std;
int main()
{
 	int p,r,y;
	cin>>p>>r>>y;
  	float i,disc,tamt,amt;
  	i = p*r*y/100; 
  	amt = p+i;
  	disc = i*0.02;
  	tamt = amt-disc;
  	cout<<i<<"\n"<<amt<<"\n"<<disc<<"\n"<<tamt;
  return 0;
}