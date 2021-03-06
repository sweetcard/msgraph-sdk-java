// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.Recipient;
import com.microsoft.graph.models.extensions.Post;
import com.microsoft.graph.models.extensions.Entity;
import com.microsoft.graph.requests.extensions.PostCollectionResponse;
import com.microsoft.graph.requests.extensions.PostCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
import java.util.Map;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Conversation Thread.
 */
public class ConversationThread extends Entity implements IJsonBackedObject {


    /**
     * The Cc Recipients.
     * The Cc: recipients for the thread.
     */
    @SerializedName("ccRecipients")
    @Expose
    public java.util.List<Recipient> ccRecipients;

    /**
     * The Has Attachments.
     * Indicates whether any of the posts within this thread has at least one attachment.
     */
    @SerializedName("hasAttachments")
    @Expose
    public Boolean hasAttachments;

    /**
     * The Is Locked.
     * Indicates if the thread is locked.
     */
    @SerializedName("isLocked")
    @Expose
    public Boolean isLocked;

    /**
     * The Last Delivered Date Time.
     * The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'
     */
    @SerializedName("lastDeliveredDateTime")
    @Expose
    public java.util.Calendar lastDeliveredDateTime;

    /**
     * The Preview.
     * A short summary from the body of the latest post in this conversation.
     */
    @SerializedName("preview")
    @Expose
    public String preview;

    /**
     * The Topic.
     * The topic of the conversation. This property can be set when the conversation is created, but it cannot be updated.
     */
    @SerializedName("topic")
    @Expose
    public String topic;

    /**
     * The To Recipients.
     * The To: recipients for the thread.
     */
    @SerializedName("toRecipients")
    @Expose
    public java.util.List<Recipient> toRecipients;

    /**
     * The Unique Senders.
     * All the users that sent a message to this thread.
     */
    @SerializedName("uniqueSenders")
    @Expose
    public java.util.List<String> uniqueSenders;

    /**
     * The Posts.
     * Read-only. Nullable.
     */
    @SerializedName("posts")
    @Expose
    public PostCollectionPage posts;


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


        if (json.has("posts")) {
            final PostCollectionResponse response = new PostCollectionResponse();
            if (json.has("posts@odata.nextLink")) {
                response.nextLink = json.get("posts@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("posts").toString(), JsonObject[].class);
            final Post[] array = new Post[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), Post.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            posts = new PostCollectionPage(response, null);
        }
    }
}
