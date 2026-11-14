package org.chromium.media;

import J.N;
import android.hardware.camera2.CameraManager;
import android.os.Handler;
import android.os.HandlerThread;
import defpackage.t8;

/* loaded from: classes.dex */
public final class CameraAvailabilityObserver extends CameraManager.AvailabilityCallback {
    public final Object a;
    public long b;
    public final CameraManager c;
    public final Handler d;

    public CameraAvailabilityObserver(long j) {
        Object obj = new Object();
        this.a = obj;
        synchronized (obj) {
            this.b = j;
        }
        this.c = (CameraManager) t8.a.getSystemService("camera");
        HandlerThread handlerThread = new HandlerThread("CameraAvailabilityObserver_ObservationThread");
        handlerThread.start();
        this.d = new Handler(handlerThread.getLooper());
    }

    public static CameraAvailabilityObserver createCameraAvailabilityObserver(long j) {
        return new CameraAvailabilityObserver(j);
    }

    @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
    public final void onCameraAvailable(String str) {
        synchronized (this.a) {
            long j = this.b;
            if (j == 0) {
                return;
            }
            N.MwARfSqs(j);
        }
    }

    @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
    public final void onCameraUnavailable(String str) {
        synchronized (this.a) {
            long j = this.b;
            if (j == 0) {
                return;
            }
            N.MwARfSqs(j);
        }
    }

    public final void startObservation() {
        this.c.registerAvailabilityCallback(this, this.d);
    }

    public final void stopObservation() {
        synchronized (this.a) {
            this.b = 0L;
        }
        this.c.unregisterAvailabilityCallback(this);
    }
}
