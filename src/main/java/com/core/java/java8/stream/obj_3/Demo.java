package com.core.java.java8.stream.obj_3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo {
    public static void main(String[] args) {
        List<Transaction> tx = Arrays.asList(
                new Transaction("200", 1, "txn-1"),
                new Transaction("500", 2, "txn-2"),
                new Transaction("400", 3, "txn-3"),
                new Transaction("201", 4, "txn-4"),
                new Transaction("203", 5, "txn-5"),
                new Transaction("401", 6, "txn-6")
        );

        List<Transaction> dd = tx
                .stream()
                .filter(txn -> !txn.getStatus().equals("500"))
                .sorted((x, y) -> x.id.compareTo(y.id))
                .collect(Collectors.toList());


        dd.forEach(x -> {
            System.out.println(x.id);
            System.out.println(x.status);
            System.out.println(x.txName);
            System.out.println("==============");
        });
    }
}
