#include <iostream>
using namespace std;
/* run this program using the console pauser or add your own getch, system("pause") or input loop */
class myclass{
	public:
		int a;
		myclass(){
			a=0;
		}
		myclass(int num){
			a=num;
		}
};
int main(int argc, char** argv) {
	myclass obj1;
	myclass obj2(10);
	cout<<obj1.a<<endl;
	cout<<obj2.a<<endl;
	return 0;
}