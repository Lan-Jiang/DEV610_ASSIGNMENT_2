public class ch4ex3_season {

    public static void main(String[] args) {
        System.out.println(season(3, 17));
    }
    // https://www.baeldung.com/java-string-of-repeated-characters
    public static String season(int monthn, int dayn) {
        if (monthn < 3 || (monthn ==  3 && dayn < 15) || (monthn == 12 && dayn >=16)) {
            return "Winter";
        } else if ( 3 < monthn && monthn <6 || (monthn ==3 && dayn >=16) || (monthn ==6 && dayn <=15)) {
            return "Spring";
        } else if ( 6 < monthn && monthn <9 || (monthn ==6 && dayn >=16) || (monthn ==9 && dayn <=15)) {
            return "Summer";
        } else {
            return "Fall";
        }

    }

}
