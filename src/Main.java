public class Main {
    public static void main(String[] args) {
        Author lTolstoy = new Author("Лев Толстой");
        Book warAndPeace = new Book("Война и мир", 1865, lTolstoy);
        System.out.println(lTolstoy);
        System.out.println(warAndPeace);
        warAndPeace.setPublishingYear(1867);
        System.out.println("Год публикации = " + warAndPeace.getPublishingYear());
        printSeparator();
        Author fDostoevsky = new Author("Федор Достоевский");
        Book crimeAndCrime = new Book("Преступление и наказание", 1866, fDostoevsky);
        System.out.println(fDostoevsky);
        System.out.println(crimeAndCrime);
        crimeAndCrime.setPublishingYear(1867);
        System.out.println("Год публикации = " + crimeAndCrime.getPublishingYear());
    }
    public static void printSeparator() {
        System.out.println("====================");
    }
}