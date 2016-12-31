package com.xafero.natra.util;

import java.net.URI;
import java.util.Locale;

import javax.tools.Diagnostic;

public class ErrorMessage implements Diagnostic<URI> {

	private final Exception error;
	private final Object source;

	public ErrorMessage(Object source, Exception error) {
		this.error = error;
		this.source = source;
	}

	@Override
	public Kind getKind() {
		return Kind.ERROR;
	}

	@Override
	public URI getSource() {
		return URI.create("obj:" + source);
	}

	@Override
	public long getPosition() {
		return -1;
	}

	@Override
	public long getStartPosition() {
		return -1;
	}

	@Override
	public long getEndPosition() {
		return -1;
	}

	@Override
	public long getLineNumber() {
		return -1;
	}

	@Override
	public long getColumnNumber() {
		return -1;
	}

	@Override
	public String getCode() {
		return null;
	}

	@Override
	public String getMessage(Locale locale) {
		return error.getMessage();
	}
}