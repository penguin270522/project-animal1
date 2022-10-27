package Animal;

public class main {
	public static void main(String[] args) {
		Meo cat = new Meo(" tom ", " 1 year " , " An cut " , " red and black");
		System.out.println(cat.name + cat.tuoi + cat.soThich + cat.mauMat);
		Chim bird = new Chim(" red " , " an cut " , " 3 m");
		System.out.println("chim co mau long " + bird.mauLong  + " va " + bird.thucAn + "co chieu dai khi sai canh " + bird.saiCanh);
		Ca fish = new Ca(" 7 mau " , " thuc an cut ");
		System.out.println("ca co mau sac " + fish.mauSac + " chu yeu " + fish.thucAn);
	}
}
