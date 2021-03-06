package com.redhat.lightblue.client.request;

import com.redhat.lightblue.client.enums.MetadataStatus;

public class AbstractLightblueRequestTest {

    protected static final String entityName = "lightblueEntity";
    protected static final String entityVersion = "1.2.3";
    protected static final String body = "{\"name\":\"value\"}";
    protected static final String baseURI = "http://lightblue.io/rest/";
    protected static final String dataOperation = "dosomethingwithdata";
    protected static final String metadataOperation = "dosomethingwithmetadata";
    protected static final String metadataComment = "use some change comment";
    protected static final String finalDataURI = baseURI + dataOperation + "/" + entityName + "/" + entityVersion;
    protected static final String finalMetadataURI = baseURI + entityName + "/" + entityVersion + "/" + metadataOperation;
    protected static final String finalMetadataURIWithComment = baseURI + entityName + "/" + entityVersion + "/" + MetadataStatus.ACTIVE.toString() + "?comment=" + metadataComment;
    protected static final String finalDiagnosticsURI = baseURI + "diagnostics";

}
