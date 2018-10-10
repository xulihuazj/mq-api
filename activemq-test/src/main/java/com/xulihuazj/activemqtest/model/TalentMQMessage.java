package com.xulihuazj.activemqtest.model;

import java.io.Serializable;

public class TalentMQMessage implements Serializable {

    private String talentId;

    private String callbackData;

    private String callbackQueue;

    public String getTalentId() {
        return talentId;
    }

    public void setTalentId(String talentId) {
        this.talentId = talentId;
    }

    public String getCallbackData() {
        return callbackData;
    }

    public void setCallbackData(String callbackData) {
        this.callbackData = callbackData;
    }

    public String getCallbackQueue() {
        return callbackQueue;
    }

    public void setCallbackQueue(String callbackQueue) {
        this.callbackQueue = callbackQueue;
    }

    @Override
    public String toString() {
        return "TalentMQMessage{" +
                "talentId='" + talentId + '\'' +
                ", callbackData='" + callbackData + '\'' +
                ", callbackQueue='" + callbackQueue + '\'' +
                '}';
    }
}
