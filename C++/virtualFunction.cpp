#include <iostream>
using namespace std;
class Shape{
	public: 
	virtual int area(int x,int y){
		return 1;
	}
};
class rectangle: public Shape{
	public:
	virtual int area(int x,int y){
		return x*y;
	}
};
class triangle:public Shape{
	public:
	int area(int x,int y){
		return (x*y)/2;
	}
};
int main(){
	rectangle rec;
	triangle tri;
	cout<<rec.area(10,20)<<endl;
	cout<<tri.area(10,20);
}
