package question3;

public class Undergraduate extends Student {
    public int currentSemester;
    public String UGStream;

    public Undergraduate(){
        super();
        System.out.print("enter current semester: ");
        this.currentSemester = input.nextInt();
        System.out.print("enter the stream they are in: ");
        this.UGStream = input.next();
    }
    @Override
    public void showDetails(){
        super.showDetails();
        System.out.println("current semester: "+this.currentSemester);
        System.out.println("ug stream: "+this.UGStream);
    }
}