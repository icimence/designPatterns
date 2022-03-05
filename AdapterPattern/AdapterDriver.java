package AdapterPattern;

public class AdapterDriver {
    public static void  main(String[] args){
        RoundHole roundHole = new RoundHole(5.0);
        RoundPeg roundPeg = new RoundPeg(5.0);
        String temp = roundHole.fits(roundPeg)?"fits":"do not fits";
        System.out.println("The round peg "+ temp + " the round hole");
        SquarePeg squarePeg = new SquarePeg(3);
        //下面这一行代码是不被允许的，因为原有的圆孔并不能适配新的方钉，这时候就需要适配器
        //System.out.println(roundHole.fits(squarePeg));
        //使用适配器类之后可以将适配器对象作为圆钉使用
        SquarePegAdapter squarePegAdapter = new SquarePegAdapter(squarePeg);
        temp = roundHole.fits(squarePegAdapter)?"fits":"do not fits";
        System.out.println("The square peg "+ temp + " the round hole");
    }
}
