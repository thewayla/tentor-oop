package b9;

import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Vector3D v1 = new Vector3D(2, 4, 1);
        System.out.println(v1.toString());
        System.out.println(v1.length());
        System.out.println(v1.get(Vector3D.Index.Z));

        double[] vArr = {1, 5, 8};
        Vector3D v2 = new Vector3D(vArr);
        System.out.println(v2.toString());
        System.out.println(v2.length());
        System.out.println(v2.get(Vector3D.Index.Y));

        System.out.println(v1.add(v2));
    }
}