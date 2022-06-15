#include <iostream>
#include <string>
using namespace std;
class Student{
	int studentID;
	public:
	string name;
	string surname;
};
int main(){
	Student student1;
	Student *ptr;
	ptr=&student1;
	student1.name="Nusret";
	ptr->surname="Gon";
	cout<<student1.name<<" "<<student1.surname<<" is our student."<<endl;
}
