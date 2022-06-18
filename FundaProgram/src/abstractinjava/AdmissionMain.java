package abstractinjava;

public class AdmissionMain {

	public static void main(String[] args) {

    System.out.println(Admission.name);
    Student s1 = new Student();
    s1.markSheet10();
    s1.markSheet12();
    s1.nationality();
    s1.leavingCertificate();
    s1.incomeCertificate();
    s1.adharCard();
    
    s1.uniform();
    s1.idCard();
    s1.transport();
    
    s1.canteen();
    s1.library();
    s1.labotary();
    

	}

}
