public class TrazasDeLlamadas_Dueñas {
 static int producto(int a, int b) {
 System.out.println("producto(" + a + ", " + b + ")");
 return a * b;
 }
 static int sumaProductos(int x) {
 return producto(x, 2) + producto(x, 3);
 }
 public static void main(String[] args) {
 int r = sumaProductos(4);
 System.out.println("r = " + r);
 System.out.println(producto(r, sumaProductos(1)));
 }
}
