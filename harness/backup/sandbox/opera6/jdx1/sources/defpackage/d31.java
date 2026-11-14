package defpackage;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraConstrainedHighSpeedCaptureSession;
import android.os.Handler;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class d31 extends CameraCaptureSession.StateCallback {
    public final v21 a;
    public final dk4 b;
    public final db4 c;
    public final f1p d;
    public final Handler e;
    public final ef2 f;
    public final ef2 g = c26.k(null);

    public d31(v21 v21Var, dk4 dk4Var, h4j h4jVar, db4 db4Var, f1p f1pVar, Handler handler) {
        this.a = v21Var;
        this.b = dk4Var;
        this.c = db4Var;
        this.d = f1pVar;
        this.e = handler;
        this.f = c26.k(h4jVar);
    }

    public final ac4 a(CameraCaptureSession cameraCaptureSession, db4 db4Var) {
        ac4 ac4Var = (ac4) this.g.a;
        if (ac4Var != null) {
            return ac4Var;
        }
        Handler handler = this.e;
        boolean z = cameraCaptureSession instanceof CameraConstrainedHighSpeedCaptureSession;
        v21 v21Var = this.a;
        ac4 u21Var = z ? new u21(v21Var, (CameraConstrainedHighSpeedCaptureSession) cameraCaptureSession, db4Var, handler) : new t21(v21Var, cameraCaptureSession, db4Var, handler);
        return this.g.a((Object) null, u21Var) ? u21Var : (ac4) this.g.a;
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onActive(CameraCaptureSession cameraCaptureSession) {
        ac4 ac4VarA = a(cameraCaptureSession, this.c);
        dk4 dk4Var = this.b;
        a(cameraCaptureSession, this.c);
        dk4Var.toString();
        f1p f1pVar = this.d;
        if (f1pVar != null) {
            this.a.getClass();
            ac4VarA.getClass();
            Iterator it = ((List) ((ef2) f1pVar.b).a).iterator();
            while (it.hasNext()) {
                ((CameraCaptureSession.StateCallback) it.next()).onActive((osh) f1pVar.a);
            }
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onCaptureQueueEmpty(CameraCaptureSession cameraCaptureSession) {
        ac4 ac4VarA = a(cameraCaptureSession, this.c);
        dk4 dk4Var = this.b;
        a(cameraCaptureSession, this.c);
        dk4Var.toString();
        f1p f1pVar = this.d;
        if (f1pVar != null) {
            this.a.getClass();
            ac4VarA.getClass();
            osh oshVar = (osh) f1pVar.a;
            Iterator it = ((List) ((ef2) f1pVar.b).a).iterator();
            while (it.hasNext()) {
                ((CameraCaptureSession.StateCallback) it.next()).onCaptureQueueEmpty(oshVar);
            }
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onClosed(CameraCaptureSession cameraCaptureSession) throws Exception {
        db4 db4Var = this.c;
        ac4 ac4VarA = a(cameraCaptureSession, db4Var);
        dk4 dk4Var = this.b;
        a(cameraCaptureSession, db4Var);
        dk4Var.h();
        h4j h4jVar = (h4j) this.f.b((Object) null);
        if (h4jVar != null) {
            h4jVar.a();
        }
        this.b.a();
        f1p f1pVar = this.d;
        if (f1pVar != null) {
            this.a.getClass();
            ac4VarA.getClass();
            Iterator it = ((List) ((ef2) f1pVar.b).a).iterator();
            while (it.hasNext()) {
                ((CameraCaptureSession.StateCallback) it.next()).onClosed((osh) f1pVar.a);
            }
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onConfigureFailed(CameraCaptureSession cameraCaptureSession) throws Exception {
        ac4 ac4VarA = a(cameraCaptureSession, this.c);
        this.b.i();
        h4j h4jVar = (h4j) this.f.b((Object) null);
        if (h4jVar != null) {
            h4jVar.a();
        }
        this.b.a();
        f1p f1pVar = this.d;
        if (f1pVar != null) {
            this.a.getClass();
            ac4VarA.getClass();
            Iterator it = ((List) ((ef2) f1pVar.b).a).iterator();
            while (it.hasNext()) {
                ((CameraCaptureSession.StateCallback) it.next()).onConfigureFailed((osh) f1pVar.a);
            }
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onConfigured(CameraCaptureSession cameraCaptureSession) {
        ac4 ac4VarA = a(cameraCaptureSession, this.c);
        this.b.j(ac4VarA);
        h4j h4jVar = (h4j) this.f.b((Object) null);
        if (h4jVar != null) {
            h4jVar.a();
        }
        f1p f1pVar = this.d;
        if (f1pVar != null) {
            this.a.getClass();
            ac4VarA.getClass();
            Iterator it = ((List) ((ef2) f1pVar.b).a).iterator();
            while (it.hasNext()) {
                ((CameraCaptureSession.StateCallback) it.next()).onConfigured((osh) f1pVar.a);
            }
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onReady(CameraCaptureSession cameraCaptureSession) {
        ac4 ac4VarA = a(cameraCaptureSession, this.c);
        dk4 dk4Var = this.b;
        a(cameraCaptureSession, this.c);
        dk4Var.toString();
        f1p f1pVar = this.d;
        if (f1pVar != null) {
            this.a.getClass();
            ac4VarA.getClass();
            Iterator it = ((List) ((ef2) f1pVar.b).a).iterator();
            while (it.hasNext()) {
                ((CameraCaptureSession.StateCallback) it.next()).onReady((osh) f1pVar.a);
            }
        }
    }
}
