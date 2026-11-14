package defpackage;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;

/* loaded from: classes.dex */
public final /* synthetic */ class nb4 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ lg4 b;
    public final /* synthetic */ CameraCaptureSession c;
    public final /* synthetic */ CaptureRequest d;
    public final /* synthetic */ long e;
    public final /* synthetic */ long f;

    public /* synthetic */ nb4(lg4 lg4Var, CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j, long j2, byte b) {
        this.a = b;
        this.b = lg4Var;
        this.c = cameraCaptureSession;
        this.d = captureRequest;
        this.e = j;
        this.f = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        lg4 lg4Var = this.b;
        switch (b) {
            case 0:
                lg4Var.a.onCaptureStarted(this.c, this.d, this.e, this.f);
                break;
            default:
                g8.G(lg4Var.a, this.c, this.d, this.e, this.f);
                break;
        }
    }
}
