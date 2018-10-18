public class KaryawanTest{
	public static void main(String[] args) {
	System.out.println("  ");
	System.out.println("Jabatan Project Manager");
	Pm p = new Pm();
	p.setNama("Rana");
	p.setAlamat("Bandung");
	p.setGaji(60);
	System.out.println(" ");

	System.out.println("Jabatan Programer");
	Program pr = new Program();
	pr.setNama("Eka");
	p.setAlamat("Tugu");
	p.setGaji(85);
	System.out.println(" ");

	System.out.println("Jabatan Desainer");
	Desain d = new Desain();
	d.setNama("Millenio");
	d.setAlamat("Purworejo");
	d.setGaji(50);
	}
}