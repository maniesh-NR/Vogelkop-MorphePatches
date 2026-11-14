package defpackage;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.view.Surface;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public interface ac4 extends inm, AutoCloseable {
    Integer M0(CaptureRequest captureRequest, CameraCaptureSession.CaptureCallback captureCallback);

    boolean O();

    wc4 U();

    boolean g0(List list);

    Surface getInputSurface();

    boolean l1();

    Integer s0(CaptureRequest captureRequest, CameraCaptureSession.CaptureCallback captureCallback);

    Integer t0(ArrayList arrayList, CameraCaptureSession.CaptureCallback captureCallback);

    Integer u1(ArrayList arrayList, CameraCaptureSession.CaptureCallback captureCallback);
}
