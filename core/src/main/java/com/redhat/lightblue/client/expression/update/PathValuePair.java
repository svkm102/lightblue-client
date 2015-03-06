package com.redhat.lightblue.client.expression.update;

import com.redhat.lightblue.client.util.JSON;

/**
 * created by Michael White 10/10/2014
 */

public class PathValuePair {

    public final String path;
    public final RValue value;

    public PathValuePair( String path, RValue value ) {
        this.path = path;
        this.value = value;
    }

    public String toJson() {
        StringBuffer builder = new StringBuffer();

        builder.append(JSON.toJson(path) +":");
        builder.append( value.toJson() );

        return builder.toString();
    }

}