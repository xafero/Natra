package com.xafero.natra.api;

import java.net.URI;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.Callable;

public interface INativeTask<Compiled, Debug> extends Callable<Boolean> {

	Map<URI, Entry<Compiled, Debug>> getResults();

}