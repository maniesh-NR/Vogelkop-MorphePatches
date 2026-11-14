package defpackage;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraExtensionSession;
import android.hardware.camera2.CameraExtensionSession$StateCallback;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class b61 extends CameraExtensionSession$StateCallback {
    public final v21 a;
    public final kl8 b;
    public final db4 c;
    public final f1p d;
    public final wd2 e;
    public final ef2 f;
    public final ef2 g = c26.k(null);

    public b61(v21 v21Var, kl8 kl8Var, h4j h4jVar, db4 db4Var, f1p f1pVar, wd2 wd2Var) {
        this.a = v21Var;
        this.b = kl8Var;
        this.c = db4Var;
        this.d = f1pVar;
        this.e = wd2Var;
        this.f = c26.k(h4jVar);
    }

    public final dd4 a(CameraExtensionSession cameraExtensionSession, db4 db4Var) {
        dd4 dd4Var = (dd4) this.g.a;
        if (dd4Var != null) {
            return dd4Var;
        }
        x21 x21Var = new x21(this.a, cameraExtensionSession, db4Var, this.e);
        return this.g.a((Object) null, x21Var) ? x21Var : (dd4) this.g.a;
    }

    public final void onClosed(CameraExtensionSession cameraExtensionSession) throws Exception {
        dd4 dd4VarA = a(cameraExtensionSession, this.c);
        kl8 kl8Var = this.b;
        a(cameraExtensionSession, this.c);
        kl8Var.a.h();
        h4j h4jVar = (h4j) this.f.b((Object) null);
        if (h4jVar != null) {
            h4jVar.a();
        }
        this.b.a();
        f1p f1pVar = this.d;
        if (f1pVar != null) {
            this.a.getClass();
            int i = ((x21) dd4VarA).e;
            Iterator it = ((List) ((ef2) f1pVar.b).a).iterator();
            while (it.hasNext()) {
                ((CameraCaptureSession.StateCallback) it.next()).onClosed((osh) f1pVar.a);
            }
        }
    }

    public final void onConfigureFailed(CameraExtensionSession cameraExtensionSession) throws Exception {
        dd4 dd4VarA = a(cameraExtensionSession, this.c);
        this.b.a.i();
        h4j h4jVar = (h4j) this.f.b((Object) null);
        if (h4jVar != null) {
            h4jVar.a();
        }
        this.b.a();
        f1p f1pVar = this.d;
        if (f1pVar != null) {
            this.a.getClass();
            int i = ((x21) dd4VarA).e;
            Iterator it = ((List) ((ef2) f1pVar.b).a).iterator();
            while (it.hasNext()) {
                ((CameraCaptureSession.StateCallback) it.next()).onConfigureFailed((osh) f1pVar.a);
            }
        }
    }

    public final void onConfigured(CameraExtensionSession cameraExtensionSession) {
        dd4 dd4VarA = a(cameraExtensionSession, this.c);
        this.b.a.j(dd4VarA);
        h4j h4jVar = (h4j) this.f.b((Object) null);
        if (h4jVar != null) {
            h4jVar.a();
        }
        f1p f1pVar = this.d;
        if (f1pVar != null) {
            this.a.getClass();
            int i = ((x21) dd4VarA).e;
            Iterator it = ((List) ((ef2) f1pVar.b).a).iterator();
            while (it.hasNext()) {
                ((CameraCaptureSession.StateCallback) it.next()).onConfigured((osh) f1pVar.a);
            }
        }
    }
}
