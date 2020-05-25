#include<iostream>
#include<iomanip>
using namespace std;
float overs(int a)
{
  int b = a%6;
  float c;
  switch(b)
  {
    case 1: c = a/6+0.1;
      		break;
    case 2: c = a/6+0.2;
      		break;
    case 3: c = a/6+0.3;
       		break;
    case 4: c = a/6+0.4;
      		break;
    case 5: c = a/6+0.5;
      		break;
    default: c = a/6;
  }
  return c;
}
int main()
{
  //Type your code here.
  int a,b,c,d,ov;
  float rr,cr,co;
  cin>>a>>b>>c>>d;
  ov = a/6;
  rr = (float)b/ov;
  co = overs(d);
  cr = c/co;
  cout<<ov<<"\n"<<co<<"\n"<<fixed<<setprecision(1)<<cr<<"\n"<<rr;
  if(cr>rr)
    	cout<<"\nEligible to Win";
  else
    	cout<<"\nNot Eligible to Win";
  return 0;
}