package Enkapsulasi;

public class TestSiswa {
    public static void main(String[] args) {

    EncapSiswa siswa = new EncapSiswa();
    siswa.setName("agus");
    siswa.setAge(20);
    siswa.setAddress("Malang");

        System.out.println("nama: "+siswa.getName() + " \nalamat "+siswa.getAddress()+ " \nberumur "+siswa.getAge() + " tahun");
    }

}
