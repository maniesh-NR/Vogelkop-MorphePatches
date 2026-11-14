package defpackage;

import android.hardware.camera2.CameraDevice;
import android.os.Build;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;

/* loaded from: classes.dex */
public final class ab4 {
    public final hnl a;
    public final hb4 b;

    public ab4(hnl hnlVar, hb4 hb4Var, k1i k1iVar) {
        this.a = hnlVar;
        this.b = hb4Var;
    }

    public final void a(wc4 wc4Var, CameraDevice cameraDevice, z21 z21Var, hh2 hh2Var) {
        CameraDevice cameraDevice2 = wc4Var != null ? (CameraDevice) wc4Var.E(uqh.a(CameraDevice.class)) : null;
        if (cameraDevice2 == null) {
            if (cameraDevice != null) {
                b(cameraDevice, z21Var);
                return;
            }
            return;
        }
        String id = cameraDevice2.getId();
        sd4.a(id);
        if (cameraDevice != null && !id.equals(cameraDevice.getId())) {
            StringBuilder sbS = p3p.s("Unwrapped camera device has camera ID ", id, ", but the wrapped camera device has camera ID ");
            sbS.append(cameraDevice.getId());
            sbS.append('!');
            throw new IllegalStateException(sbS.toString().toString());
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            if (i < 30) {
                hh2Var.getClass();
            } else {
                hh2Var.e.remove(wc4Var);
            }
        }
        Objects.toString(cameraDevice2);
        wc4Var.G();
        Pair pair = new Pair(wc4Var, z21Var);
        wc4 wc4Var2 = (wc4) pair.a;
        z21 z21Var2 = (z21) pair.b;
        Object objE = wc4Var2.E(uqh.a(CameraDevice.class));
        if (objE == null) {
            qp2.n("Required value was null.");
            return;
        }
        wc4Var.n();
        b((CameraDevice) objE, z21Var2);
        wc4Var.V();
    }

    public final void b(CameraDevice cameraDevice, z21 z21Var) {
        cameraDevice.getId();
        lqh lqhVar = new lqh();
        String id = cameraDevice.getId();
        sd4.a(id);
        hb4 hb4Var = this.b;
        hb4Var.b.getClass();
        fe4 fe4Var = ge4.Oo;
        ge4 ge4VarA = ((fb4) hb4Var.a).a(id);
        fe4Var.getClass();
        if (fe4.c(ge4VarA) && lqhVar.a) {
            sd4.b(id);
            if (z21Var.q.await(2000L, TimeUnit.MILLISECONDS)) {
                sd4.b(id);
            } else {
                sd4.b(id);
            }
        }
    }
}
