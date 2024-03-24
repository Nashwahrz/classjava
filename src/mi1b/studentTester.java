/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mi1b;

/**
 *
 * @author DELL
 */
public class studentTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        student s1 = new student(1005, "desfanni zulya","999-99-999", 3.5);
        
        System.out.println("No bp : "+s1.getNoBp());
        System.out.println("Nama : "+s1.getNama());
        System.out.println("No bpjs : "+s1.getNobpjs());
        System.out.println("ipk : "+s1.getIndeksprestasi());
        
        student2 s2= new student2();
        s2.setNoBp(1091006);
        s2.setNama("Fadil");
        s2.setNobpjs("999-99-999");
        s2.setIndeksprestasi(3.83);
        System.out.println("------------------------");
        System.out.println("No bp : "+s2.getNoBp());
        System.out.println("Nama : "+s2.getNama());
        System.out.println("No bpjs : "+s2.getNobpjs());
        System.out.println("ipk : "+s2.getIndeksprestasi());
        
        student2 s3= new student2();
        s3.setNoBp(1091006);
        s3.setNama("Fani");
        s3.setNobpjs("999-99-999");
        s3.setIndeksprestasi(3.65);
        System.out.println("------------------------");
        System.out.println("No bp : "+s3.getNoBp());
        System.out.println("Nama : "+s3.getNama());
        System.out.println("No bpjs : "+s3.getNobpjs());
        System.out.println("ipk : "+s3.getIndeksprestasi());
        
        
    }
    
}
