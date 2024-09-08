public class PR13 {
    public static void main(String[] args) {
        String[] warna = {"Hitam", "Biru", "Putih", "Merah", "Kuning"};
            
        for (String i : warna) {
            if (i.equals("Putih")) {
                continue;
        }
            System.out.println(i);
    }
    }
}
