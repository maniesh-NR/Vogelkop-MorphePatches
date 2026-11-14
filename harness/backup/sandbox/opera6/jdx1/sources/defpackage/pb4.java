package defpackage;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;

/* loaded from: classes.dex */
public final /* synthetic */ class pb4 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ lg4 b;
    public final /* synthetic */ CameraCaptureSession c;
    public final /* synthetic */ CaptureRequest d;
    public final /* synthetic */ CaptureResult e;

    public /* synthetic */ pb4(lg4 lg4Var, CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureResult captureResult, byte b) {
        this.a = b;
        this.b = lg4Var;
        this.c = cameraCaptureSession;
        this.d = captureRequest;
        this.e = captureResult;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        CaptureResult captureResult = this.e;
        CaptureRequest captureRequest = this.d;
        CameraCaptureSession cameraCaptureSession = this.c;
        lg4 lg4Var = this.b;
        switch (b) {
            case 0:
                lg4Var.a.onCaptureProgressed(cameraCaptureSession, captureRequest, captureResult);
                break;
            default:
                lg4Var.a.onCaptureProgressed(cameraCaptureSession, captureRequest, captureResult);
                break;
        }
    }
}
