import java.util.ArrayList;

public class CompShop {

    private ArrayList<Comp> compList = new ArrayList<>();

    public void addCompOne() {
        Comp comp1 = new Comp("Dell", 15.5, true, 16);
        this.compList.add(comp1);

        System.out.println(comp1.toString());

    }

    public void addCompFive() {
        compList.add(new Comp("ffff", 15.5, true, 16));

        //for (Comp a : compList) {
            //System.out.println(a.toString());
        //}

    }

    public void print() {
        for (Comp a : compList) {
            System.out.println(a.getManName());
        }
    }

    public void doubleRam(int serNum) {
        for (var a : compList) {
            if(a.getSerNum() == serNum) {
                a.setRam(a.getRam()*2);
            }
        }

    }

    public void priceCheck() {
        for (var a : compList) {

        }
    }
}
