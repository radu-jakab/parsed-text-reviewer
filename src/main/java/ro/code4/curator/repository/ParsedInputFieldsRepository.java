package ro.code4.curator.repository;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import ro.code4.curator.entity.ParsedInputField;

@Repository
public interface ParsedInputFieldsRepository extends CrudRepository<ParsedInputField, Serializable> {

}
