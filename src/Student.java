public class Student {
    protected String studentId;
    protected String studentName;
    protected String facuty;
    protected String major;

    void enrollment() {
        System.out.println("enrollment");
    }

    void payment() {
        System.out.println("payment");
    }

    void addCourse() {
        System.out.println("addCourse");
    }

    void dropCourse() {
        System.out.println("dropCourse");
    }

    public void showData1() {
        System.out.println("ID :"+studentId);
        System.out.println("Name :"+studentName);
        System.out.println("Major :"+major);
        System.out.println("Faculty :"+facuty);
    }

    public static void main(String[] args) {//psvm
        Student nang = new Student();
        System.out.println("Object =" + nang);
        nang.studentId = "024";
        nang.studentName = "Suhana";
        nang.major = "CS";
        nang.facuty = "Science and Technologe";
        nang.showData1();
        nang.enrollment();
        nang.dropCourse();
        
    
        Student nena = new Student();
        nena.studentId = "1002";
        nena.studentName = "Miss Nena";
        nena.major = "IT";
        nena.facuty = "Marketing";
        System.out.println("objet="+nena);
        nena.showData1();
            
    }
}//end class
