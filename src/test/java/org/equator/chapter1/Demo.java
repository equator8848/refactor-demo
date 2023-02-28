package org.equator.chapter1;

import org.equator.chapter1.base.Customer;
import org.equator.chapter1.base.Movie;
import org.equator.chapter1.base.Rental;
import org.junit.Test;

/**
 * 一个影片出租店用的程序，计算每一位顾客的消费金额并打印报表（statement）。
 * 操作者告诉程序：顾客租了哪些影片、租期多长，程序便根据租赁时间和影片类型算出费用。
 * 影片分为三类：普通片、儿童片和新片。除了计算费用，还要为常客计算点数；点数会随着「租片种类是否为新片」而有不同。
 */
public class Demo {
    @Test
    public void test() {
        Movie movie1 = new Movie("movie1", 0);
        Movie movie2 = new Movie("movie2", 1);
        Movie movie3 = new Movie("movie3", 2);
        Customer customer = new Customer("equator");
        customer.addRental(new Rental(movie1, 3));
        customer.addRental(new Rental(movie2, 2));
        customer.addRental(new Rental(movie3, 1));
        String statement = customer.statement();
        System.out.println(statement);
    }
}
