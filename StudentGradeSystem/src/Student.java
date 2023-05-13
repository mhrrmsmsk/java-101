public class Student {
    String name,stuNo;
    int classes;
    Course mat;
    Course fizik;
    Course kimya;
    double avarage;
    boolean isPass;


    Student(String name, int classes, String stuNo, Course mat,Course fizik,Course kimya) {
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.mat = mat;
        this.fizik = fizik;
        this.kimya = kimya;
       this.avarage=0.0;
        this.isPass = false;
    }
   void addBulkExamNote(int matNot,int fizikNot,int kimyaNot){
        if (fizikNot>=0 &&fizikNot<=100){
            fizik.note=fizikNot;
        }else fizik.note=0;
       if (matNot>=0 && matNot<=100){
           mat.note=matNot;
       }else mat.note=0;
       if (kimyaNot>=0 &&kimyaNot<=100){
           kimya.note=kimyaNot;
       }else kimya.note=0;

    }
    void addBulkVerbalNote(int matVerbalNote,int fizikVerbalNote,int kimyaVerbalNote){
        if (fizikVerbalNote>=0 && fizikVerbalNote<=100){
            fizik.verbalNote=fizikVerbalNote;
        }else fizik.verbalNote=0;
        if (kimyaVerbalNote>=0 && kimyaVerbalNote<=100){
            kimya.verbalNote=kimyaVerbalNote;
        }else kimya.verbalNote=0;
        if (matVerbalNote>=0 && matVerbalNote<=100){
            mat.verbalNote=matVerbalNote;
        }else  mat.verbalNote=0;
    }
    void isPass(){
        System.out.println("****************");
       calcAvarage();
        if (this.avarage>=55){
            System.out.println("ÖĞRENCİ BAŞARILI...");
            this.isPass=true;

        }else {
            System.out.println("ÖĞRENCİ BAŞARISIZ...");
            this.isPass=false;
        }
        printNote();
    }
   void calcAvarage(){
double matAvg=(this.mat.note*80)/100+(this.mat.verbalNote*20)/100;
double fizAvg=(this.fizik.note*80)/100+(this.fizik.verbalNote*20)/100;
double kimAvg=(this.kimya.note*80)/100+(this.kimya.verbalNote*20)/100;
this.avarage=(matAvg+kimAvg+fizAvg)/3.0;

   }
    void printNote(){
        System.out.println("=====================");
        System.out.println(this.fizik.name+"Notu:\t"+this.fizik.note);
        System.out.println(this.fizik.name+"Sözlü Notu:\t"+this.fizik.verbalNote);
        System.out.println(this.mat.name+"Notu:\t"+this.mat.note);
        System.out.println(this.mat.name+"Sözlü Notu:\t"+this.mat.verbalNote);
        System.out.println(this.kimya.name+"Notu:\t"+this.kimya.note);
        System.out.println(this.kimya.name+"Sözlü Notu:\t"+this.kimya.verbalNote);
        System.out.println("Ortalama:"+this.avarage);
        System.out.println("=====================");
    }
}
