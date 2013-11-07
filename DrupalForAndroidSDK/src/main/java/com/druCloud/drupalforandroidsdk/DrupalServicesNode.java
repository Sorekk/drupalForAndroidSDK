package com.druCloud.drupalforandroidsdk;

import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;

/**
 * Created by jimmyko on 10/13/13.
 */
public class DrupalServicesNode extends DrupalOAuth implements DrupalServicesResource {


    public DrupalServicesNode(String baseURI, String endpoint, String tokenKey, String tokenSecret) {
        super(baseURI, endpoint, tokenKey, tokenSecret);
        this.setResource("node");
    }

    @Override
    public String create(BasicNameValuePair[] params) {
        return this.httpPostRequest(this.getURI(), params);
    }

    @Override
    public String retrieve(int id) {
        return this.httpGetRequest(this.getURI() + "/" + id);
    }

    @Override
    public String update(int id, BasicNameValuePair[] params) {
        return this.httpPutRequest(this.getURI() + "/" + id, params);
    }

    @Override
    public String delete(int id) {
        return this.httpDeleteRequest(this.getURI() + "/" + id);
    }

    @Override
    public String index() {
        return this.httpGetRequest(this.getURI());
    }
}
