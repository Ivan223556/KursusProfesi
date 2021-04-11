/**
*
*/

package test;

import pendaftaran.Peserta;

public class TestRunner {
    public static void main(String[] args) {
        
        Peserta pendaftaran = new Peserta();
        
        //test case 1
        System.out.println(pendaftaran.cekKelayakan(80, 60, 55));
        
        //test case 2
        System.out.println(pendaftaran.cekKelayakan(65, 55, 60));
        
        //test case 3
        System.out.println(pendaftaran.cekKelayakan(100, 30, 60));
        
        //test case 4
        System.out.println(pendaftaran.cekKelayakan(30, 100, 60));
        
        //test case 5
        System.out.println(pendaftaran.cekKelayakan(60, 30, 100));
        
        //test case 6
        System.out.println(pendaftaran.cekKelayakan(80, 60, 30));
        
        //test case 7
        System.out.println(pendaftaran.cekKelayakan(60, 80, 30));
        
        //test case 8
        System.out.println(pendaftaran.cekKelayakan(60, 60, 50));
        
        //test case 9
        System.out.println(pendaftaran.cekKelayakan(100, 30, 0));
        
    }
    
}
