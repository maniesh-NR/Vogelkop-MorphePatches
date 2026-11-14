package defpackage;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.net.Uri;
import android.view.Surface;
import android.widget.FrameLayout;

/* loaded from: classes.dex */
public final /* synthetic */ class bf1 implements Runnable {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ bf1(eek eekVar, FrameLayout frameLayout, long j, c9l c9lVar, df1 df1Var) {
        this.c = eekVar;
        this.d = frameLayout;
        this.b = j;
        this.e = c9lVar;
        this.f = df1Var;
    }

    public /* synthetic */ bf1(lg4 lg4Var, CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, Surface surface, long j) {
        this.c = lg4Var;
        this.d = cameraCaptureSession;
        this.e = captureRequest;
        this.f = surface;
        this.b = j;
    }

    public /* synthetic */ bf1(wyd wydVar, long j, Uri uri, rn9 rn9Var, String str) {
        this.c = wydVar;
        this.b = j;
        this.d = uri;
        this.e = rn9Var;
        this.f = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x011e  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() throws java.io.FileNotFoundException {
        /*
            Method dump skipped, instructions count: 396
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bf1.run():void");
    }
}
