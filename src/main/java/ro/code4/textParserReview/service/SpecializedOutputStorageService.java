package ro.code4.textParserReview.service;

import org.springframework.stereotype.Service;

import ro.code4.textParserReview.specializedStorage.SpecializedStorageHandlerIntf;

@Service
public class SpecializedOutputStorageService {

	public void addToSpecializedOutput(Object input) {
		// TODO search config for this input class

		// TODO if found, instantiate its storage handler
		SpecializedStorageHandlerIntf storageHandler;

		// TODO store the object
		// storageHandler.store(input);
	}
}
