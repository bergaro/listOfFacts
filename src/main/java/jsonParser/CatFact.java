package jsonParser;

import com.fasterxml.jackson.databind.JsonNode;
import java.util.Date;

public class CatFact {
    private String _id;
    private String user;
    private String text;
    private String type;
    private String __v;
    private String source;
    private JsonNode status;
    private Date updatedAt;
    private Date createdAt;
    private boolean used;
    private boolean deleted;
    private boolean verified;
    private boolean sentCount;

    public void set_id(String _id) {
        this._id = _id;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void set__v(String __v) {
        this.__v = __v;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public void setStatus(JsonNode status) {
        this.status = status;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public void setUsed(boolean used) {
        this.used = used;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }

    public void setVerified(boolean verified) {
        this.verified = verified;
    }

    public void setSentCount(boolean sentCount) {
        this.sentCount = sentCount;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "CatFact{" +
                "_id='" + _id + '\'' +
                ", user='" + user + '\'' +
                ", text='" + text + '\'' +
                ", type='" + type + '\'' +
                ", __v='" + __v + '\'' +
                ", source='" + source + '\'' +
                ", status=" + status +
                ", updatedAt='" + updatedAt + '\'' +
                ", createdAt='" + createdAt + '\'' +
                ", used=" + used +
                ", deleted=" + deleted +
                ", verified=" + verified +
                ", sentCount=" + sentCount +
                '}';
    }
}
