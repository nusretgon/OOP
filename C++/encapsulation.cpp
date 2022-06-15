#include <iostream>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */
class myclass{
	int a;
	public:
		int get_a(){
			return a;
		}
		void set_a(int x){
			a=x;
		}
};
int main(int argc, char** argv) {
	myclass obj1;
	obj1.set_a(10);
	printf("%d",obj1.get_a());
	return 0;
}
