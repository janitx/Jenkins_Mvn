package model;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import java.util.List;

@JacksonXmlRootElement(localName = "usercredentials")
public class AllCredentialsModel {

    @JacksonXmlElementWrapper(localName = "credentials")
    @JacksonXmlProperty(localName = "credent")
    protected List<CredentialsModel> collection;

    public AllCredentialsModel() {
    }

    public AllCredentialsModel(List<CredentialsModel> collection) {
        this.collection = collection;
    }

    public List<CredentialsModel> getCollection() {
        return collection;
    }

    @Override
    public String toString() {
        return "AllCredentialsModel{" +
                "collection=" + collection +
                '}';
    }
}
