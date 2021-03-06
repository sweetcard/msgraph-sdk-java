// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;

import com.microsoft.graph.models.extensions.ChatInfo;
import com.microsoft.graph.models.extensions.MeetingParticipants;
import com.microsoft.graph.models.extensions.OnlineMeeting;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.google.gson.JsonObject;
import com.microsoft.graph.serializer.ISerializer;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Online Meeting Create Or Get Body.
 */
public class OnlineMeetingCreateOrGetBody {

    /**
     * The chat Info.
     * 
     */
    @SerializedName("chatInfo")
    @Expose
    public ChatInfo chatInfo;

    /**
     * The end Date Time.
     * 
     */
    @SerializedName("endDateTime")
    @Expose
    public java.util.Calendar endDateTime;

    /**
     * The external Id.
     * 
     */
    @SerializedName("externalId")
    @Expose
    public String externalId;

    /**
     * The participants.
     * 
     */
    @SerializedName("participants")
    @Expose
    public MeetingParticipants participants;

    /**
     * The start Date Time.
     * 
     */
    @SerializedName("startDateTime")
    @Expose
    public java.util.Calendar startDateTime;

    /**
     * The subject.
     * 
     */
    @SerializedName("subject")
    @Expose
    public String subject;


    /**
     * The raw representation of this class
     */
    private JsonObject rawObject;

    /**
     * The serializer
     */
    private ISerializer serializer;

    /**
     * Gets the raw representation of this class
     *
     * @return the raw representation of this class
     */
    public JsonObject getRawObject() {
        return rawObject;
    }

    /**
     * Gets serializer
     *
     * @return the serializer
     */
    protected ISerializer getSerializer() {
        return serializer;
    }

    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(final ISerializer serializer, final JsonObject json) {
        this.serializer = serializer;
        rawObject = json;

    }
}
