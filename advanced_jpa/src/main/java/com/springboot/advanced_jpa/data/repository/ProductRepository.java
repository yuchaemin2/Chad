
List<Product> findByNameOrderByNumberAsc(String name);
List<Product> findByNameOrderByNumberDesc(String name);
Page<Product> findByName(S trin g name, Pageable pageable);
Page<Product> productPage = productRepository.findByName("펜", PageRequest.of(0Z 2));

Hibernate:
        select
            product0_,number as number1_0_,
            product0_.created_at as created_2_0_,
            product0_.name as name3_0_,
            product0_.price as price4_0_,
            product0_.stock as stock5_0_,
            product0_.updated_at as updated_6_0_
        from
            product product0_
        where
            product0_.name=?
        order by
            product0_.number asc

        Hibernate:
        select
            product0_,number as number1_0_,
            product0_.created_at as created_2_0_,
            product0_.name as name3_0_,
            product0_.price as price4_0_,
            product0_.stock as stock5_0_,
            product0_.updated_at as updated_6_0_
        from
            product product0_
        where
            product0_.name=?
        order by
            product0_.price asc
            product0_.stock desc

        Hibernate:
        select
        product0_,number as number1_0_,
        product0_.created_at as created_2_0_,
        product0_.name as name3_0_,
        product0_.price as price4_0_,
        product0_.stock as stock5_0_,
        product0_.updated_at as updated_6_0_
        from
        product product0_
        where
        product0_.name=? limit?
