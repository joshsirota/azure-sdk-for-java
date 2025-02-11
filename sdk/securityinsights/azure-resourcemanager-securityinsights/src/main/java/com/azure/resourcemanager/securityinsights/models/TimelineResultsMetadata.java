// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securityinsights.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Expansion result metadata. */
@Fluent
public final class TimelineResultsMetadata {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(TimelineResultsMetadata.class);

    /*
     * the total items found for the timeline request
     */
    @JsonProperty(value = "totalCount", required = true)
    private int totalCount;

    /*
     * timeline aggregation per kind
     */
    @JsonProperty(value = "aggregations", required = true)
    private List<TimelineAggregation> aggregations;

    /*
     * information about the failure queries
     */
    @JsonProperty(value = "errors")
    private List<TimelineError> errors;

    /**
     * Get the totalCount property: the total items found for the timeline request.
     *
     * @return the totalCount value.
     */
    public int totalCount() {
        return this.totalCount;
    }

    /**
     * Set the totalCount property: the total items found for the timeline request.
     *
     * @param totalCount the totalCount value to set.
     * @return the TimelineResultsMetadata object itself.
     */
    public TimelineResultsMetadata withTotalCount(int totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * Get the aggregations property: timeline aggregation per kind.
     *
     * @return the aggregations value.
     */
    public List<TimelineAggregation> aggregations() {
        return this.aggregations;
    }

    /**
     * Set the aggregations property: timeline aggregation per kind.
     *
     * @param aggregations the aggregations value to set.
     * @return the TimelineResultsMetadata object itself.
     */
    public TimelineResultsMetadata withAggregations(List<TimelineAggregation> aggregations) {
        this.aggregations = aggregations;
        return this;
    }

    /**
     * Get the errors property: information about the failure queries.
     *
     * @return the errors value.
     */
    public List<TimelineError> errors() {
        return this.errors;
    }

    /**
     * Set the errors property: information about the failure queries.
     *
     * @param errors the errors value to set.
     * @return the TimelineResultsMetadata object itself.
     */
    public TimelineResultsMetadata withErrors(List<TimelineError> errors) {
        this.errors = errors;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (aggregations() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property aggregations in model TimelineResultsMetadata"));
        } else {
            aggregations().forEach(e -> e.validate());
        }
        if (errors() != null) {
            errors().forEach(e -> e.validate());
        }
    }
}
