public class TestStudent {
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
         
        //instanciate Object
        GraduateStudent too = new GraduateStudent();
        too.studyLevel = "Year2";
        too.thrsisAdviser = "Dr.Bean";
        too.thesisExamination();
        too.oralExamination();
        //call super clss attr&methot
        too.studentId="1002";
        too.studentName="Suhana";
        too.facuty = "Science";
        too.major="IT";
        too.addCourse();
        too.dropCourse();
        too.enrollment();
        too.payment();
    }
}
    

