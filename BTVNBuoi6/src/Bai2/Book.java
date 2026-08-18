package Bai2;

public class Book extends Product{
    private String author;
    private int pages;

    Book(String id, String name, double price, String author, int pages){
        super(id,name,price);
        this.author = author;
        this.pages = pages;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public double getDiscountedPrice(){
        return price * 0.9;
    }

    @Override
    public void showInfo(){
        super.showInfo();
        System.out.println("Tac gia: " + getAuthor() + " So trang: " + getPages());
    }

    @Override
    public String toString() {
        return "Book{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", author='" + author + '\'' +
                ", pages=" + pages +
                '}';
    }


}
