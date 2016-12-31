package com.xafero.natra.common;

import java.util.Arrays;
import java.util.List;

import com.xafero.natra.api.INativeTranslatorFactory;

public abstract class AbstractNativeFactory implements INativeTranslatorFactory {

	protected String[] extensions;
	protected String[] mimeTypes;

	@Override
	public List<String> getExtensions() {
		return Arrays.asList(extensions);
	}

	@Override
	public List<String> getMimeTypes() {
		return Arrays.asList(mimeTypes);
	}
}