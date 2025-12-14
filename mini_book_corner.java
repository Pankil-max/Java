
public class mini_book_corner {
    public static void main(String[] args) {
        String[] categories = { "Fiction", "Nepali" };
        String[][] titles = new String[2][1];
        double[][] prices = new double[2][1];
        titles[0][0] = "Asahamati-5";
        titles[1][0] = "Yo Jindagi Khai K Jindagi";
        prices[0][0] = 750.0;
        prices[1][0] = 990.9999;

        for (int i = 0; i < categories.length; i++) {
            if (categories[i] != null) {
                System.out.println("Category: " + categories[i]);
            } else {
                System.out.println("You should enter category..");
            }

            for (int j = 0; j < titles[i].length; j++) {
                String bt = titles[i][j];
                double price = prices[i][j];
                if (bt != null) {

                    System.out.println("Title:" + bt);
                } else {
                    System.out.println("Please Enter a book title..");
                }
                System.out.printf("Price: %.2f ", price);

            }
        }

    }

}