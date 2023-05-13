public class Main {
    public static void main(String[] args) {

    Teacher t1=new Teacher("John Nash","55555","MAT");
    Teacher t2 = new Teacher("Enistain","0000","FZK");
    Teacher t3 = new Teacher("Haisenberg","11111","KMY");

    Course mat = new Course("matematik","102","MAT");
    mat.addTeacher(t1);

    Course fizik =new Course("Fizik","102","FZK");
    fizik.addTeacher(t2);

    Course kimya =new Course("Kimya","102","KMY");
    kimya.addTeacher(t3);

    Student s1 =new Student("Muharrem",8,"210706",mat,fizik,kimya);
    s1.addBulkExamNote(190,100,100);
    s1.addBulkVerbalNote(100,100,100);
    s1.isPass();

    Student s2 =new Student("ali",8,"210705",mat,fizik,kimya);
    s2.addBulkExamNote(120,100,100);
    s2.addBulkVerbalNote(100,100,100);
    s2.isPass();

        Student s3 =new Student("Ahmet",8,"210704",mat,fizik,kimya);
        s3.addBulkExamNote(120,100,100);
        s3.addBulkVerbalNote(100,100,100);
        s3.isPass();
    }
}