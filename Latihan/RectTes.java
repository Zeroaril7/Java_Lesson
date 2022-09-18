package Latihan;


public class RectTes extends Rect {


    public static void main(String[] args) {
        Rect tes = new Rect();
        tes.union(tes);
        Rect hasilUnion = new Rect(1,1,4,4);
        tes.intersection(tes);
        Rect hasilIntersection = new Rect(1,1,4,4);
        tes.move(2,3);

        Rect pL = new Rect(5,6);

        System.out.println(tes.x1 + " , " + tes.y1);
        System.out.print("is inside the union"+"\n");
        System.out.println("[ " + hasilUnion.x1 +"," + hasilUnion.y1 + " ; " + hasilUnion.x2 + "," + hasilUnion.y2 + " ] union " + "[ " + tes.x1 + "," + tes.y1 + " ; "+ pL.x2 + ","+ pL.y2+ " ]" + " = [" + hasilUnion.x1 + ","+hasilUnion.y1+" ; "+ pL.x2 + ","+pL.y2 + " ]");
        System.out.println("[ " + hasilIntersection.x1 +"," + hasilIntersection.y1 + " ; " + hasilIntersection.x2 + "," + hasilIntersection.y2 + " ] intersect " + "[ " + tes.x1 + "," + tes.y1 + " ; "+ pL.x2 + ","+ pL.y2+ " ]" + " = [ " +tes.x1 + "," + tes.y1+" ; "+ hasilIntersection.x2 + "," + hasilIntersection.y2 + " ]");


    }
}
