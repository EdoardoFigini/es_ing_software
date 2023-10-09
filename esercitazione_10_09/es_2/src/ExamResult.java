public class ExamResult implements Cloneable {
    private final String course;
    private final int credits;
    private final int grade;

    public ExamResult(String course, int cred, int grade){
        this.course = course;
        this.credits = cred;
        this.grade = grade;
    }

    protected ExamResult clone(){
        return new ExamResult(this.course, this.credits, this.grade);
    }
}
