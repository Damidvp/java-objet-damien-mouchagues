package com.testspring.dao;

import org.springframework.data.repository.CrudRepository;

import com.testspring.entites.Kanji;

public interface KanjiDAO extends CrudRepository<Kanji, Integer> {

}
