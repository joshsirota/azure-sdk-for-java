package com.azure.spring.cloud.feature.manager.entities;

/**
 * Interface to react to impression events
 */
public interface ImpressionListener {
    /**
     * Name of the bean
     */
    public static String BEAN_NAME = "AZURE_FM_IMPRESSION_LISTENER";

    /**
     * Handle an impression
     *
     * @param feature The name of the feature flag
     * @param result The result given to the client
     */
    public void handleImpression(String feature, boolean result);
}
