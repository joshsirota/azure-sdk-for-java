// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securityinsights.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.securityinsights.fluent.models.WatchlistInner;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** List all the watchlists. */
@Fluent
public final class WatchlistList {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(WatchlistList.class);

    /*
     * URL to fetch the next set of watchlists.
     */
    @JsonProperty(value = "nextLink", access = JsonProperty.Access.WRITE_ONLY)
    private String nextLink;

    /*
     * Array of watchlist.
     */
    @JsonProperty(value = "value", required = true)
    private List<WatchlistInner> value;

    /**
     * Get the nextLink property: URL to fetch the next set of watchlists.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Get the value property: Array of watchlist.
     *
     * @return the value value.
     */
    public List<WatchlistInner> value() {
        return this.value;
    }

    /**
     * Set the value property: Array of watchlist.
     *
     * @param value the value value to set.
     * @return the WatchlistList object itself.
     */
    public WatchlistList withValue(List<WatchlistInner> value) {
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
                    new IllegalArgumentException("Missing required property value in model WatchlistList"));
        } else {
            value().forEach(e -> e.validate());
        }
    }
}
