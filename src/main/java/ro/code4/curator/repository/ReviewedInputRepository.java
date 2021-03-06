package ro.code4.curator.repository;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;

import org.springframework.stereotype.Repository;
import ro.code4.curator.entity.ReviewedInput;

@Repository
public interface ReviewedInputRepository extends CrudRepository<ReviewedInput, Serializable> {
	public ReviewedInput findByTextTypeAndTextSourceId(String textType, String textSourceId);
}
