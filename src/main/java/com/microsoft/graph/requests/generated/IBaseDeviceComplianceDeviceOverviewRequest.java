// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.concurrency.*;
import com.microsoft.graph.core.*;
import com.microsoft.graph.models.extensions.*;
import com.microsoft.graph.models.generated.*;
import com.microsoft.graph.http.*;
import com.microsoft.graph.requests.extensions.*;
import com.microsoft.graph.requests.generated.*;
import com.microsoft.graph.options.*;
import com.microsoft.graph.serializer.*;

import java.util.Arrays;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Base Device Compliance Device Overview Request.
 */
public interface IBaseDeviceComplianceDeviceOverviewRequest extends IHttpRequest {

    /**
     * Gets the DeviceComplianceDeviceOverview from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<DeviceComplianceDeviceOverview> callback);

    /**
     * Gets the DeviceComplianceDeviceOverview from the service
     *
     * @return the DeviceComplianceDeviceOverview from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    DeviceComplianceDeviceOverview get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<Void> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this DeviceComplianceDeviceOverview with a source
     *
     * @param sourceDeviceComplianceDeviceOverview the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final DeviceComplianceDeviceOverview sourceDeviceComplianceDeviceOverview, final ICallback<DeviceComplianceDeviceOverview> callback);

    /**
     * Patches this DeviceComplianceDeviceOverview with a source
     *
     * @param sourceDeviceComplianceDeviceOverview the source object with updates
     * @return the updated DeviceComplianceDeviceOverview
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    DeviceComplianceDeviceOverview patch(final DeviceComplianceDeviceOverview sourceDeviceComplianceDeviceOverview) throws ClientException;

    /**
     * Posts a DeviceComplianceDeviceOverview with a new object
     *
     * @param newDeviceComplianceDeviceOverview the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final DeviceComplianceDeviceOverview newDeviceComplianceDeviceOverview, final ICallback<DeviceComplianceDeviceOverview> callback);

    /**
     * Posts a DeviceComplianceDeviceOverview with a new object
     *
     * @param newDeviceComplianceDeviceOverview the new object to create
     * @return the created DeviceComplianceDeviceOverview
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    DeviceComplianceDeviceOverview post(final DeviceComplianceDeviceOverview newDeviceComplianceDeviceOverview) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IBaseDeviceComplianceDeviceOverviewRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IBaseDeviceComplianceDeviceOverviewRequest expand(final String value);

}
