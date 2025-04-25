package com.restfullApi.ProductLists.Products.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;


@Entity
@Getter
@Setter
public class Categories {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;

@OneToMany(mappedBy = "categories", cascade=CascadeType.ALL)
//cascade dell all product if delete categories
private List<Product> product;


}
