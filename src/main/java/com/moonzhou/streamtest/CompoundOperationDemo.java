package com.moonzhou.streamtest;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 复合使用demo<br>
 * 〈功能详细描述〉filter collect
 *
 * @author moon-zhou
 * @date: 2020/4/16 19:29
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class CompoundOperationDemo {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        Book book1 = new Book("book1", 10);
        Book book2 = new Book("book2", 20);
        Book book3 = new Book("book3", 30);
        Book book4 = new Book("book4", 5);

        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);

        books.forEach(System.out::println);

        System.out.println("价格过滤之后");
        List<Book> highPriceBooks = books.stream().filter(book -> book.getPrice()>20).collect(Collectors.toList());
        highPriceBooks.forEach(System.out::println);

        System.out.println("价格升序排序");
        List<Book> aesSortBooks = books.stream().sorted(Comparator.comparing(Book::getPrice)).collect(Collectors.toList());
        aesSortBooks.forEach(System.out::println);

        System.out.println("价格降序排序");
        List<Book> descSortBooks = books.stream().sorted(Comparator.comparing(Book::getPrice).reversed()).collect(Collectors.toList());
        descSortBooks.forEach(System.out::println);

        System.out.println("获取书名");
        List<String> bookNames = books.stream().map(Book::getName).collect(Collectors.toList());
        bookNames.forEach(System.out::println);

        System.out.println("全部价格");
        int totalNum = books.stream().map(Book::getPrice).reduce(0,(a,b)->a+b);
        System.out.println(totalNum);

        System.out.println("价格+数目过滤");
        List<Book> priceNumBooks = books.stream().filter(book -> book.getPrice()> 5).limit(2).collect(Collectors.toList());
        priceNumBooks.forEach(System.out::println);

        System.out.println("并行处理");
        books.parallelStream().forEach(book -> book.setPrice(book.getPrice() + 3));
        books.forEach(System.out::println);
    }

    static class Book {
        private String name;

        private int price;

        public Book(String name, int price) {
            this.name = name;
            this.price = price;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getPrice() {
            return price;
        }

        public void setPrice(int price) {
            this.price = price;
        }

        @Override
        public String toString() {
            return "Book{" +
                    "name='" + name + '\'' +
                    ", price=" + price +
                    '}';
        }
    }
}
