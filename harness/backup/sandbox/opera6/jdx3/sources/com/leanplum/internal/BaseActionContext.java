package com.leanplum.internal;

import java.util.Map;

/* loaded from: classes.dex */
public abstract class BaseActionContext {
    protected Map<String, Object> args;
    protected String messageId;
    protected String originalMessageId;
    protected int priority;
    protected boolean isRooted = true;
    private boolean isPreview = false;

    public BaseActionContext(String str, String str2) {
        this.messageId = str;
        this.originalMessageId = str2;
    }

    public Map<String, Object> getArgs() {
        return this.args;
    }

    public String getMessageId() {
        return this.messageId;
    }

    public String getOriginalMessageId() {
        return this.originalMessageId;
    }

    public int getPriority() {
        return this.priority;
    }

    public boolean isPreview() {
        return this.isPreview;
    }

    public void setIsPreview(boolean z) {
        this.isPreview = z;
    }

    public void setIsRooted(boolean z) {
        this.isRooted = z;
    }
}
