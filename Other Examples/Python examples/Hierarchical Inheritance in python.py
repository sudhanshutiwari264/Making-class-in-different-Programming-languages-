#defining the parent class named Institute
class Institute:
  def institute_name(self):
    print("This is python Institute")

#defining the child class named Student. We passed the name of parent class (Institute) to another class named Student.
# Now Student class became the child of the Institute class.
# This is how you make a child class for the parent class.
class Student(Institute):
  def student_details(self, name,roll):
    self.name=name
    self.roll=roll
    Teacher.institute_name()
    print("I am a student of this institute")
    print("My name is "+ self.name, " and my roll number is "+ str(self.roll))

#defining the child class named Teacher.
class Teacher(Institute):
  def teacher_details(self, name,id):
    self.name=name
    self.id=id
    Teacher.institute_name()
    print("I am a teacher of this institute")
    print("My name is "+ self.name, " and my id is "+ str(self.id))

Teacher=Teacher()
Teacher.teacher_details("Satyajeet", 67)

student=Student()
student.student_details("John", 12)
