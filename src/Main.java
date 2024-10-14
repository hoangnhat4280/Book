public class Main {
    public static void main(String[] args) {
                Book[] books = new Book[6];
                books[0] = new Book("2408", "Naruto", 2003, "Nhat");
                books[1] = new Book("2003", "Bleach", 1500, "Thanh");
                books[2] = new Book("4280", "Dragonball", 800, "Hung");
                books[3] = new Book("3002", "Lookism", 950, "Thang");
                books[4] = new Book("2480", "Haikyuu", 1600, "Tri");
                books[5] = new Book("2820", "Doraemon", 600, "Dung");

                double sum = 0;
                for (Book book : books) {
                    sum += book.getPrice();
                }
                System.out.println("Tổng tiền của 6 cuốn sách là: " + sum);

                System.out.println("Các cuốn sách có giá trên 1000 là:");
                for (Book book : books) {
                    if (book.getPrice() > 1000) {
                        System.out.print(book.getBookName() + ",");

                    }
                }
            }
        }


