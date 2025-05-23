public class Lingkaran {
    static final double PI = 3.141592;

    void hitungLuas(double r) {
        double luas = PI * r * r;

        // hasil sebagai bilangan pecahan (double)
        System.out.println("Luas (pecahan): " + luas);

        // hasil sebagai bilangan bulat (type-casting)
        int luasBulat = (int) luas;
        System.out.println("Luas (bilangan bulat): " + luasBulat);

        // hasil pembulatan
        long luasPembulatan = Math.round(luas);
        System.out.println("Luas (pembulatan): " + luasPembulatan);
    }
}
