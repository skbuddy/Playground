#include<iostream>
using namespace std;
int main()
{
	//Type your code here.
	int arr[3],i=0,lar = 0,sla = 0,sml =0;
	while(i<3)
	{
		cin>>arr[i];
		if(lar<arr[i])
		{ 
			sml = sla;
			sla = lar;
			lar = arr[i];
		}
		else if(sla < arr[i])
		{
			sml = sla;
			sla= arr[i];
		}
		i++;
	} 
	i=sml;
	while(i)
	{	 
		if(arr[0]%i == 0 && arr[1]%i == 0 && arr[2]%i == 0)
		{ 
			sml = i;
			break;
		}
      	i--;
	}
	if(i==0)
		sml =1;
cout<<"The treasure is in box which has number "<<sla<<endl;
cout<<"The code to open the box is "<<sml;  
}