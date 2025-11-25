class Student
{
    public String name;
    private int marks;

    public Student(String name,int marks)
    {
        this.name=name;
        this.marks=marks;
    }
    public void setMarks(int stmarks)
    {
        marks=stmarks;
    }
    public void getMarks()
    {
        System.out.println("The marks is "+marks);
    }
    public void check_result()
    {
        if (marks<35)
        {
            System.out.println("Fail");
        }
        else{
            System.out.println("Pass");
        }
    }
}

class Main {
    public static void main(String[] args) {

       String name="Khushi";
       int marks=90;
       Student s=new Student(name,marks);
       //System.out.println(""+s.marks);     will not work as marks is private
       //System.out.println(""+s.name);
       s.getMarks();
       s.check_result();
       s.setMarks(20);
       s.getMarks();
       s.check_result();
    }
}
