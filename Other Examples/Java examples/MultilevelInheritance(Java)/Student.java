    package question3;

    public class Student extends Person {
        public String studentID;
        public String hostelName;

        public Student() {
            super();
            System.out.print("enter hostel name: ");
            this.hostelName = input.nextLine();
            System.out.print("enter student ID name: ");
            this.studentID = input.nextLine();
        }

        @Override
        public void showDetails(){
            super.showDetails();
            System.out.println("studentID: "+this.studentID);
            System.out.println("hostelName: "+this.hostelName);
        }
    }
