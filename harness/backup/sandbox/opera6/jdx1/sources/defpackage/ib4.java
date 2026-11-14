package defpackage;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraExtensionSession;
import android.hardware.camera2.CaptureRequest;
import android.os.Build;
import android.util.ArrayMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class ib4 implements owh {
    public final ac4 a;
    public final CaptureRequest b;
    public final u9d c;
    public final Map d;
    public final Map e;
    public final ArrayMap f;
    public final boolean g;
    public final lvh h;
    public final long i;

    public ib4(ac4 ac4Var, CaptureRequest captureRequest, u9d u9dVar, Map map, Map map2, ArrayMap arrayMap, boolean z, lvh lvhVar, long j) {
        this.a = ac4Var;
        this.b = captureRequest;
        this.c = u9dVar;
        this.d = map;
        this.e = map2;
        this.f = arrayMap;
        this.g = z;
        this.h = lvhVar;
        this.i = j;
    }

    @Override // defpackage.inm
    public final Object E(s15 s15Var) {
        if (s15Var.equals(uqh.a(CaptureRequest.class))) {
            return this.b;
        }
        boolean zEquals = s15Var.equals(uqh.a(CameraCaptureSession.class));
        ac4 ac4Var = this.a;
        if (zEquals) {
            Object objE = ac4Var.E(uqh.a(CameraCaptureSession.class));
            if (objE != null) {
                return objE;
            }
        } else if (s15Var.equals(uqh.a(CameraExtensionSession.class))) {
            if (Build.VERSION.SDK_INT >= 31) {
                Object objE2 = ac4Var.E(uqh.a(CameraExtensionSession.class));
                if (objE2 != null) {
                    return objE2;
                }
            } else {
                qp2.n("Check failed.");
            }
        }
        return null;
    }

    @Override // defpackage.owh
    public final Map K() {
        return this.f;
    }

    @Override // defpackage.owh
    public final boolean Q() {
        return this.g;
    }

    @Override // defpackage.oxd
    public final Object a(kxd kxdVar) {
        Map map = this.h.c;
        Map map2 = this.e;
        if (map2.containsKey(kxdVar)) {
            return map2.get(kxdVar);
        }
        if (map.containsKey(kxdVar)) {
            return map.get(kxdVar);
        }
        Map map3 = this.d;
        return map3.containsKey(kxdVar) ? map3.get(kxdVar) : this.c.get(kxdVar);
    }

    @Override // defpackage.oxd
    public final Object b(kxd kxdVar, hbl hblVar) {
        Object objA = a(kxdVar);
        return objA == null ? hblVar : objA;
    }

    @Override // defpackage.owh
    public final lvh getRequest() {
        return this.h;
    }

    @Override // defpackage.owh
    public final long r() {
        return this.i;
    }
}
