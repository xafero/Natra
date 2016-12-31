package com.xafero.natra.api;

import java.util.List;

public interface INativeTranslatorFactory {

	INativeTranslator<?, ?> getTranslator();

	List<String> getMimeTypes();

	List<String> getExtensions();
}