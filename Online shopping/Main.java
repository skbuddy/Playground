#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int i=0,amt[3];
  while(i<3)
  {  
    int price=0,disc=0,ship=0;
    cin>>price>>disc>>ship;
    amt[i] = price-(price*disc/100)+ship;
 	switch(i)
    {
      case 0: cout<<"In Flipkart Rs."<<amt[i];
        		break;
      case 1: cout<<"\nIn Snapdeal Rs."<<amt[i];
        		break;
      case 2: cout<<"\nIn Amazon Rs."<<amt[i];
        		break;
     }
    i++;
  }
  if(amt[0]<=amt[1] && amt[0]<=amt[2])
        cout<<"\nHe will prefer Flipkart";
  else if(amt[1]<=amt[0] && amt[1]<=amt[2])      		
      	cout<<"\nHe will prefer Snapdeal";
  else	
      	cout<<"\nHe will prefer Amazon";
        

}