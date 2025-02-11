// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securityinsights.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Data type for last data received. */
@Fluent
public class LastDataReceivedDataType {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(LastDataReceivedDataType.class);

    /*
     * Name of the data type to show in the graph. can be use with
     * {{graphQueriesTableName}} placeholder
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * Query for indicate last data received
     */
    @JsonProperty(value = "lastDataReceivedQuery")
    private String lastDataReceivedQuery;

    /**
     * Get the name property: Name of the data type to show in the graph. can be use with {{graphQueriesTableName}}
     * placeholder.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Name of the data type to show in the graph. can be use with {{graphQueriesTableName}}
     * placeholder.
     *
     * @param name the name value to set.
     * @return the LastDataReceivedDataType object itself.
     */
    public LastDataReceivedDataType withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the lastDataReceivedQuery property: Query for indicate last data received.
     *
     * @return the lastDataReceivedQuery value.
     */
    public String lastDataReceivedQuery() {
        return this.lastDataReceivedQuery;
    }

    /**
     * Set the lastDataReceivedQuery property: Query for indicate last data received.
     *
     * @param lastDataReceivedQuery the lastDataReceivedQuery value to set.
     * @return the LastDataReceivedDataType object itself.
     */
    public LastDataReceivedDataType withLastDataReceivedQuery(String lastDataReceivedQuery) {
        this.lastDataReceivedQuery = lastDataReceivedQuery;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
