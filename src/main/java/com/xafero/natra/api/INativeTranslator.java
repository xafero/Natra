package com.xafero.natra.api;

import java.net.URI;

import javax.tools.DiagnosticListener;

public interface INativeTranslator<Compiled, Debug> {

	INativeTranslatorFactory getFactory();

	INativeTask<Compiled, Debug> translate(INativeParams params);

	Object run(Object binary, DiagnosticListener<URI> diag);
}