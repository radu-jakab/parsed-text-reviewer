package ro.code4.textParserReview.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import ro.code4.textParserReview.entity.ParsedInput;

@Repository
public interface ParsedInputRepository extends CrudRepository<ParsedInput, Serializable> {
	public List<ParsedInput> findByTextTypeAndTextSourceId(String textType, String textSourceId);
}
