package b11;

import b9.Vector3D;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Vector3D> vectorList = new ArrayList<>();

        int max = 10;
        int min = 1;
        int range = max - min + 1;
        for (int i = 0; i < 5; i++) {
            vectorList.add(new Vector3D(
                    (double) Math.round(((Math.random() * range) + min)),
                    (double) Math.round(((Math.random() * range) + min)),
                    (double) Math.round(((Math.random() * range) + min))));

        }
        System.out.println("Og list");
        System.out.println(vectorList.toString());
        System.out.println("Length list");
        List<Double> lengthList = mapTo(vectorList, Vector3D::length);
        System.out.println(lengthList);


        List<String> stringList = new ArrayList<>();

        for (int i = 0; i < 5; i++)
            stringList.add("Word: " + i);
        System.out.println("Og list");
        System.out.println(stringList.toString());

        List<String> upperList = mapTo(stringList, String::toUpperCase);
        System.out.println("Upper");
        System.out.println(upperList);
    }

    public static <A, R> List<R> mapTo(List<A> data, Converter<A, R> converter) {
        ArrayList<R> converted = new ArrayList<>();

        for (A obj : data) {
            converted.add(converter.convert(obj));
        }

        return converted;
    }
}