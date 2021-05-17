package uaslp.objetos.exams;


public class Student {
    private String name;
    private int code;
    private int score;
    private double avarage;
    private int c1,c2,c3;
    public Student(String name, int code){
        this.name=name;
        this.code=code;
    }

    public String getName() {
        return name;
    }

    public int getCode() {
        return code;
    }

    public void setScore(int p, int score) {
        if(p==1) c1=score;
        if(p==2) c2=score;
        if(p==3) c3=score;
    }

    public Object getAverage() {
        return (c1+c2+c3)/3;
    }
    public class Score {
        int partial;
        int grade;

        public Score(int partial,int grade){
            this.partial = partial;
            this.grade = grade;
        }

        public int getGrade(){
            return grade;
        }

        public int getPartial(){
            return partial;
        }
}