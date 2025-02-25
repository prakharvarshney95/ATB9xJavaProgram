package Nov_2024.ex_11112024_Encapsulation_part2.Police;

public class Cop {

    private int gun;
    public String iCard;

    public Cop(int gun){
        this.gun = gun;
    }

    protected void canIShoot(){
        System.out.println("Yes, You can!!");
    }
}
