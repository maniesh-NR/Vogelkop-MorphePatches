package com.leanplum.callbacks;

import com.leanplum.models.MessageArchiveData;

/* loaded from: classes.dex */
public abstract class MessageDisplayedCallback implements Runnable {
    private MessageArchiveData messageArchiveData;

    public abstract void messageDisplayed(MessageArchiveData messageArchiveData);

    @Override // java.lang.Runnable
    public void run() {
        messageDisplayed(this.messageArchiveData);
    }

    public void setMessageArchiveData(MessageArchiveData messageArchiveData) {
        this.messageArchiveData = messageArchiveData;
    }
}
