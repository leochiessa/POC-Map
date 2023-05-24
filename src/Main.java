import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        //region
        System.out.println("HashSet:");
        HashSet<String> hashSet = new HashSet<>();
        var a = hashSet.add("aaa");
        var b = hashSet.add("bbb");
        var c = hashSet.add("bbb");
        System.out.println("a: " + a + ", b: " + b + ", c: " + c);
        hashSet.forEach(e -> {
            System.out.println(e);
        });
        //endregion
        System.out.println("\n");
        //region
        System.out.println("TreeMap:");
        TreeMap<String, Integer> treeMap1 = new TreeMap<>();
        var d = treeMap1.put("uno", 1);
        var e = treeMap1.put("uno", 2);
        System.out.println("d: " + d + ", e:" + e);
        treeMap1.forEach((k, v) -> {
            System.out.println("key: " + k + ", value: " + v);
        });
        System.out.println("\n");
        TreeMap<Integer, Persona> treeMap2 = new TreeMap<>();
        var f = treeMap2.put(2, new Persona("dos"));
        var g = treeMap2.put(1, new Persona("uno"));
        var h = treeMap2.put(1, new Persona("tres"));
        System.out.println("f: " + f + ", g: " + g + ", h: " + h);
        treeMap2.forEach((k, v) -> {
            System.out.println("key: " + k + ", value: " + v.toString());
        });
        //endregion
        System.out.println("\n");
        //region
        System.out.println("LinkedHashMap:");
        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();
        var i = linkedHashMap.put("dos", 2);
        var j = linkedHashMap.put("uno", 1);
        var k = linkedHashMap.put("dos", 3);
        System.out.println("i: " + i + ", j: " + j + ", k: " + k);
        linkedHashMap.forEach((key, v) -> {
            System.out.println("key: " + key + ", value: " + v);
        });
        //endregion
        System.out.println("\n");
        //region
        System.out.println("HashMap:");
        HashMap<Persona, Integer> hashMap = new HashMap<>();
        var l = hashMap.put(new Persona("dos"), 2);
        var m = hashMap.put(new Persona("uno"), 1);
        var o = hashMap.put(new Persona("cuatro"), 4);
        var n = hashMap.put(new Persona("dos"), 3);
        System.out.println("l: " + l + ", m: " + m + ", n: " + n + ", o: " + o);
        hashMap.forEach((clave, v) -> {
            System.out.println("clave: " + clave + ", value: " + v);
        });
        //endregion
    }
}