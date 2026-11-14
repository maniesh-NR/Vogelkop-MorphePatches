package com.leanplum.internal;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* loaded from: classes.dex */
public class OperationQueue {
    private static final String OPERATION_QUEUE_NAME = "com.leanplum.operation_queue";
    private static final int OPERATION_QUEUE_PRIORITY = 0;
    private static OperationQueue instance;
    private Handler handler;
    private HandlerThread handlerThread;
    private Handler uiHandler = new Handler(Looper.getMainLooper());
    private Executor executor = Executors.newCachedThreadPool();

    public OperationQueue() {
        start();
    }

    public static OperationQueue sharedInstance() {
        OperationQueue operationQueue = instance;
        if (operationQueue != null) {
            return operationQueue;
        }
        OperationQueue operationQueue2 = new OperationQueue();
        instance = operationQueue2;
        return operationQueue2;
    }

    private void start() {
        if (this.handlerThread == null) {
            HandlerThread handlerThread = new HandlerThread(OPERATION_QUEUE_NAME, 0);
            this.handlerThread = handlerThread;
            handlerThread.start();
        }
        this.handler = new Handler(this.handlerThread.getLooper());
    }

    private void stop() {
        removeAllOperations();
        this.handlerThread.quit();
        this.handlerThread = null;
    }

    public boolean addOperation(Runnable runnable) {
        Handler handler;
        if (runnable == null || (handler = this.handler) == null) {
            return false;
        }
        return handler.post(runnable);
    }

    public boolean addOperationAfterDelay(Runnable runnable, long j) {
        Handler handler;
        if (runnable == null || (handler = this.handler) == null) {
            return false;
        }
        return handler.postDelayed(runnable, j);
    }

    public boolean addOperationAtFront(Runnable runnable) {
        Handler handler;
        if (runnable == null || (handler = this.handler) == null) {
            return false;
        }
        return handler.postAtFrontOfQueue(runnable);
    }

    public boolean addOperationAtTime(Runnable runnable, long j) {
        Handler handler;
        if (runnable == null || (handler = this.handler) == null) {
            return false;
        }
        return handler.postAtTime(runnable, j);
    }

    public void addParallelOperation(Runnable runnable) {
        Executor executor;
        if (runnable == null || (executor = this.executor) == null) {
            return;
        }
        executor.execute(runnable);
    }

    public void addUiOperation(Runnable runnable) {
        Handler handler;
        if (runnable == null || (handler = this.uiHandler) == null) {
            return;
        }
        handler.post(runnable);
    }

    public void removeAllOperations() {
        Handler handler = this.handler;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    public void removeOperation(Runnable runnable) {
        Handler handler;
        if (runnable == null || (handler = this.handler) == null) {
            return;
        }
        handler.removeCallbacks(runnable);
    }
}
