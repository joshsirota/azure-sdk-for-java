// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securityinsights.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.securityinsights.fluent.models.RelationInner;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** List of relations. */
@Fluent
public final class RelationList {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(RelationList.class);

    /*
     * URL to fetch the next set of relations.
     */
    @JsonProperty(value = "nextLink", access = JsonProperty.Access.WRITE_ONLY)
    private String nextLink;

    /*
     * Array of relations.
     */
    @JsonProperty(value = "value", required = true)
    private List<RelationInner> value;

    /**
     * Get the nextLink property: URL to fetch the next set of relations.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Get the value property: Array of relations.
     *
     * @return the value value.
     */
    public List<RelationInner> value() {
        return this.value;
    }

    /**
     * Set the value property: Array of relations.
     *
     * @param value the value value to set.
     * @return the RelationList object itself.
     */
    public RelationList withValue(List<RelationInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property value in model RelationList"));
        } else {
            value().forEach(e -> e.validate());
        }
    }
}
