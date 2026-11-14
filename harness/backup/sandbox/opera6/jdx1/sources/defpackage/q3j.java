package defpackage;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.util.Rational;
import android.util.Size;
import androidx.camera.camera2.compat.quirk.PreviewPixelHDRnetQuirk;
import java.util.ArrayList;
import java.util.HashSet;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class q3j extends p3j {
    public static q3j c(qsm qsmVar, Size size) {
        if (((og4) qsmVar.b(qsm.Jp, null)) == null) {
            j9h.u((String) qsmVar.b(fcl.Cp, qsmVar.toString()), "Implementation is missing option unpacker for ");
            return null;
        }
        q3j q3jVar = new q3j();
        u3j u3jVar = (u3j) qsmVar.b(qsm.Hp, null);
        wrf wrfVar = wrf.c;
        int i = u3j.a().g.c;
        ArrayList arrayList = q3jVar.d;
        ArrayList arrayList2 = q3jVar.c;
        pyl pylVar = q3jVar.b;
        if (u3jVar != null) {
            ai4 ai4Var = u3jVar.g;
            i = ai4Var.c;
            for (CameraDevice.StateCallback stateCallback : u3jVar.c) {
                if (!arrayList2.contains(stateCallback)) {
                    arrayList2.add(stateCallback);
                }
            }
            for (CameraCaptureSession.StateCallback stateCallback2 : u3jVar.d) {
                if (!arrayList.contains(stateCallback2)) {
                    arrayList.add(stateCallback2);
                }
            }
            pylVar.c(ai4Var.d);
            wrfVar = ai4Var.b;
        }
        pylVar.d = fee.l(wrfVar);
        if (qsmVar instanceof twg) {
            Rational rational = uwg.a;
            if (((PreviewPixelHDRnetQuirk) d77.a(PreviewPixelHDRnetQuirk.class)) != null && !Intrinsics.a(uwg.a, new Rational(size.getWidth(), size.getHeight()))) {
                fee feeVarK = fee.k();
                feeVarK.s(gyg.q(CaptureRequest.TONEMAP_MODE), 2);
                pylVar.f(new eb4(wrf.f(feeVarK)));
            }
        }
        pylVar.b = ((Number) qsmVar.b(eb4.e, Integer.valueOf(i))).intValue();
        CameraDevice.StateCallback stateCallback3 = (CameraDevice.StateCallback) qsmVar.b(eb4.f, null);
        if (stateCallback3 != null && !arrayList2.contains(stateCallback3)) {
            arrayList2.add(stateCallback3);
        }
        CameraCaptureSession.StateCallback stateCallback4 = (CameraCaptureSession.StateCallback) qsmVar.b(eb4.g, null);
        if (stateCallback4 != null && !arrayList.contains(stateCallback4)) {
            arrayList.add(stateCallback4);
        }
        CameraCaptureSession.CaptureCallback captureCallback = (CameraCaptureSession.CaptureCallback) qsmVar.b(eb4.h, null);
        if (captureCallback != null) {
            lg4 lg4Var = new lg4(captureCallback);
            pylVar.d(lg4Var);
            ArrayList arrayList3 = q3jVar.e;
            if (!arrayList3.contains(lg4Var)) {
                arrayList3.add(lg4Var);
            }
        }
        int iR = qsmVar.r();
        if (iR != 0 && iR != 0) {
            ((fee) pylVar.d).s(qsm.Tp, Integer.valueOf(iR));
        }
        int iO = qsmVar.o();
        if (iO != 0 && iO != 0) {
            ((fee) pylVar.d).s(qsm.Up, Integer.valueOf(iO));
        }
        fee feeVarK2 = fee.k();
        an2 an2Var = eb4.k;
        String str = (String) qsmVar.b(an2Var, null);
        if (str != null) {
            feeVarK2.s(an2Var, str);
        }
        an2 an2Var2 = eb4.i;
        Long l = (Long) qsmVar.b(an2Var2, null);
        if (l != null) {
            feeVarK2.s(an2Var2, Long.valueOf(l.longValue()));
        }
        pylVar.f(feeVarK2);
        tw2 tw2Var = new tw2((byte) 16);
        qsmVar.c(new xj(tw2Var, qsmVar, (byte) 25));
        pylVar.f(new zy9(wrf.f((fee) tw2Var.b)));
        return q3jVar;
    }

    public final void a(g07 g07Var, ip7 ip7Var, int i) {
        wjh wjhVarA = po2.a(g07Var);
        if (ip7Var == null) {
            t3p.q("Null dynamicRange");
            return;
        }
        wjhVarA.f = ip7Var;
        wjhVarA.d = Integer.valueOf(i);
        this.a.add(wjhVarA.d());
        ((HashSet) this.b.c).add(g07Var);
    }

    public final u3j b() {
        return new u3j(new ArrayList(this.a), new ArrayList(this.c), new ArrayList(this.d), new ArrayList(this.e), this.b.j(), this.f, this.g, this.h, this.i);
    }
}
