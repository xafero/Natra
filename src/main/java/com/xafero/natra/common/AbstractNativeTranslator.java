package com.xafero.natra.common;

import java.net.URI;
import java.util.Map;
import java.util.Map.Entry;

import com.xafero.natra.api.INativeParams;
import com.xafero.natra.api.INativeTask;
import com.xafero.natra.api.INativeTranslator;
import com.xafero.natra.api.INativeTranslatorFactory;

public abstract class AbstractNativeTranslator<Compiled, Debug> implements INativeTranslator<Compiled, Debug> {

	protected final INativeTranslatorFactory factory;

	protected AbstractNativeTranslator(INativeTranslatorFactory factory) {
		this.factory = factory;
	}

	@Override
	public INativeTranslatorFactory getFactory() {
		return factory;
	}

	@Override
	public INativeTask<Compiled, Debug> translate(final INativeParams params) {
		return new INativeTask<Compiled, Debug>() {
			private Map<URI, Entry<Compiled, Debug>> results;

			public Boolean call() throws Exception {
				results = translateImpl(params);
				return params.getErrors() < 1;
			}

			public Map<URI, Entry<Compiled, Debug>> getResults() {
				return results;
			}
		};
	}

	protected abstract Map<URI, Entry<Compiled, Debug>> translateImpl(INativeParams params);
}