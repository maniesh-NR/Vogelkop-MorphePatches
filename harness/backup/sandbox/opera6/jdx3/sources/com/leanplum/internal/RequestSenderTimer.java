package com.leanplum.internal;

import androidx.annotation.NonNull;
import com.leanplum.EventsUploadInterval;
import com.leanplum.internal.Request;

/* loaded from: classes.dex */
public class RequestSenderTimer {
    private static final RequestSenderTimer INSTANCE = new RequestSenderTimer();
    private EventsUploadInterval timerInterval = EventsUploadInterval.AT_MOST_15_MINUTES;
    private Runnable timerOperation;

    public static RequestSenderTimer get() {
        return INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendAllRequestsWithHeartbeat() {
        RequestSender.getInstance().send(RequestBuilder.withHeartbeatAction().andType(Request.RequestType.IMMEDIATE).create());
    }

    public Runnable createTimerOperation() {
        return new Runnable() { // from class: com.leanplum.internal.RequestSenderTimer.1
            @Override // java.lang.Runnable
            public void run() {
                RequestSenderTimer.this.sendAllRequestsWithHeartbeat();
                OperationQueue.sharedInstance().addOperationAfterDelay(RequestSenderTimer.this.timerOperation, RequestSenderTimer.this.getIntervalMillis());
            }
        };
    }

    public long getIntervalMillis() {
        return this.timerInterval.getMinutes() * 60000;
    }

    public void setTimerInterval(@NonNull EventsUploadInterval eventsUploadInterval) {
        this.timerInterval = eventsUploadInterval;
    }

    public synchronized void start() {
        if (this.timerOperation != null) {
            return;
        }
        this.timerOperation = createTimerOperation();
        OperationQueue.sharedInstance().addOperationAfterDelay(this.timerOperation, getIntervalMillis());
    }

    public synchronized void stop() {
        if (this.timerOperation == null) {
            return;
        }
        OperationQueue.sharedInstance().removeOperation(this.timerOperation);
        this.timerOperation = null;
    }
}
