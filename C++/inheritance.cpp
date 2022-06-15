#include <iostream>
using namespace std;
/* run this program using the console pauser or add your own getch, system("pause") or input loop */
class B{
	int a;
public:
	int get_a();
	void set_a(int num);
};
class D:public B{
	int j;
	public:
		void set_j(int a);
		int multiply();
};
void B::set_a(int num){
	a=num;
};
int B:: get_a(){
	return a;
};
void D:: set_j(int a){
	j=a;
};
int D:: multiply(){
	return j*get_a();
};
int main(){
	D dObj;
	dObj.set_a(10);
	dObj.set_j(2);
	cout<<dObj.multiply()<<endl;
}
