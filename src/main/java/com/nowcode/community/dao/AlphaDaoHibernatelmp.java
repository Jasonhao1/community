package com.nowcode.community.dao;

import org.springframework.stereotype.Repository;

@Repository("alphaHibernate")
public class AlphaDaoHibernatelmp implements AlphaDao {
    @Override
    public String select() {
        return "Hibernate";
    }
}
