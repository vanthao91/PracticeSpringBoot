package com.example.demo.repositoryImpl;

import com.example.demo.repository.DictionarySearchCustom;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

public class DictionarySearchCustomImpl implements DictionarySearchCustom {
    @PersistenceContext
    private EntityManager em;
    @Override
    public List<Object> search(String tableName) {
        String queryStr = String.format("select t from %s t",tableName);
        Query query = em.createQuery(queryStr);
        List<Object> rs = query.getResultList();
        return rs;
    }
}
