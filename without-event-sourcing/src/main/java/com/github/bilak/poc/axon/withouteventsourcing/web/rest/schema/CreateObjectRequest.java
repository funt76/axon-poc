package com.github.bilak.poc.axon.withouteventsourcing.web.rest.schema;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * @author lvasek.
 */
public class CreateObjectRequest {

	@NotNull
	@Size(min = 1, max = 255)
	private String objectName;

	public String getObjectName() {
		return objectName;
	}

	public void setObjectName(String objectName) {
		this.objectName = objectName;
	}
}
