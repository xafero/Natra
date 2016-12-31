package com.xafero.natra.api;

import java.io.Writer;
import java.net.URI;
import java.util.Map;

import javax.tools.DiagnosticListener;

public interface INativeParams extends DiagnosticListener<URI> {

	Map<URI, String> getSources();

	Writer getOutput();

	int getErrors();

	int getWarnings();

}