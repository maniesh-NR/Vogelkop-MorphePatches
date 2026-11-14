package defpackage;

import android.hardware.camera2.CameraExtensionSession;
import android.hardware.camera2.CameraExtensionSession$ExtensionCaptureCallback;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ConcurrentLinkedQueue;

/* loaded from: classes.dex */
public final class w21 extends CameraExtensionSession$ExtensionCaptureCallback {
    public final /* synthetic */ byte a;
    public final ra4 b;
    public final /* synthetic */ x21 c;
    public final Serializable d;

    public w21(x21 x21Var, ra4 ra4Var) {
        this.a = (byte) 0;
        this.c = x21Var;
        this.b = ra4Var;
        this.d = new ConcurrentLinkedQueue();
    }

    public w21(x21 x21Var, ra4 ra4Var, LinkedHashMap linkedHashMap) {
        this.a = (byte) 1;
        this.c = x21Var;
        this.b = ra4Var;
        this.d = linkedHashMap;
    }

    private final void a(CameraExtensionSession cameraExtensionSession, CaptureRequest captureRequest) {
    }

    private final void b(CameraExtensionSession cameraExtensionSession, CaptureRequest captureRequest) {
    }

    public final void onCaptureFailed(CameraExtensionSession cameraExtensionSession, CaptureRequest captureRequest) {
        byte b = this.a;
        ra4 ra4Var = this.b;
        Serializable serializable = this.d;
        switch (b) {
            case 0:
                if (((ConcurrentLinkedQueue) serializable).isEmpty()) {
                    x21 x21Var = this.c;
                    long jIncrementAndGet = df2.b.incrementAndGet(x21Var.f);
                    x21Var.g.put(cameraExtensionSession, Long.valueOf(jIncrementAndGet));
                    ((ConcurrentLinkedQueue) serializable).add(Long.valueOf(jIncrementAndGet));
                }
                ra4Var.d(captureRequest, ((Number) ((ConcurrentLinkedQueue) serializable).remove()).longValue());
                break;
            default:
                int size = ((List) ((LinkedHashMap) serializable).get(captureRequest)).size();
                LinkedHashMap linkedHashMap = (LinkedHashMap) serializable;
                if (size != 1) {
                    Objects.toString(((List) linkedHashMap.get(captureRequest)).stream());
                    break;
                } else {
                    ra4Var.d(captureRequest, ((Number) ((List) linkedHashMap.get(captureRequest)).get(0)).longValue());
                    break;
                }
        }
    }

    public final void onCaptureProcessProgressed(CameraExtensionSession cameraExtensionSession, CaptureRequest captureRequest, int i) {
        switch (this.a) {
            case 0:
                this.b.e(captureRequest, i);
                break;
            default:
                this.b.e(captureRequest, i);
                break;
        }
    }

    public final void onCaptureProcessStarted(CameraExtensionSession cameraExtensionSession, CaptureRequest captureRequest) {
        byte b = this.a;
    }

    public final void onCaptureResultAvailable(CameraExtensionSession cameraExtensionSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        switch (this.a) {
            case 0:
                Serializable serializable = this.d;
                if (((ConcurrentLinkedQueue) serializable).isEmpty()) {
                    x21 x21Var = this.c;
                    long jIncrementAndGet = df2.b.incrementAndGet(x21Var.f);
                    x21Var.g.put(cameraExtensionSession, Long.valueOf(jIncrementAndGet));
                    ((ConcurrentLinkedQueue) serializable).add(Long.valueOf(jIncrementAndGet));
                }
                this.b.c(captureRequest, totalCaptureResult, ((Number) ((ConcurrentLinkedQueue) serializable).remove()).longValue());
                break;
            default:
                super.onCaptureResultAvailable(cameraExtensionSession, captureRequest, totalCaptureResult);
                break;
        }
    }

    public final void onCaptureSequenceAborted(CameraExtensionSession cameraExtensionSession, int i) {
        switch (this.a) {
            case 0:
                this.b.f(i);
                break;
            default:
                this.b.f(i);
                break;
        }
    }

    public final void onCaptureSequenceCompleted(CameraExtensionSession cameraExtensionSession, int i) {
        byte b = this.a;
        ra4 ra4Var = this.b;
        x21 x21Var = this.c;
        switch (b) {
            case 0:
                ra4Var.g(i, ((Long) x21Var.g.get(cameraExtensionSession)).longValue());
                break;
            default:
                ra4Var.g(i, ((Long) x21Var.g.get(cameraExtensionSession)).longValue());
                break;
        }
    }

    public final void onCaptureStarted(CameraExtensionSession cameraExtensionSession, CaptureRequest captureRequest, long j) {
        byte b = this.a;
        Serializable serializable = this.d;
        x21 x21Var = this.c;
        switch (b) {
            case 0:
                long jIncrementAndGet = df2.b.incrementAndGet(x21Var.f);
                x21Var.g.put(cameraExtensionSession, Long.valueOf(jIncrementAndGet));
                ((ConcurrentLinkedQueue) serializable).add(Long.valueOf(jIncrementAndGet));
                this.b.h(captureRequest, jIncrementAndGet, j);
                break;
            default:
                long jIncrementAndGet2 = df2.b.incrementAndGet(x21Var.f);
                x21Var.g.put(cameraExtensionSession, Long.valueOf(jIncrementAndGet2));
                LinkedHashMap linkedHashMap = (LinkedHashMap) serializable;
                Object arrayList = linkedHashMap.get(captureRequest);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    linkedHashMap.put(captureRequest, arrayList);
                }
                ((List) arrayList).add(Long.valueOf(jIncrementAndGet2));
                this.b.h(captureRequest, jIncrementAndGet2, j);
                break;
        }
    }
}
