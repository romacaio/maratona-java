package javacore.ZZEstreams.dominio;

import java.util.Objects;

public class LigthNovel {
    private String title;
    private double price;

    public LigthNovel(String title, double price) {
        this.title = title;
        this.price = price;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (this == obj) return true;
        if (!this.getClass().equals(obj.getClass())) return false;
        LigthNovel ligthNovel = (LigthNovel) obj;
        return Objects.equals(title, ligthNovel.getTitle());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(title);
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "LigthNovel{" +
                "title='" + title + '\'' +
                ", price=" + price +
                '}';
    }
}

