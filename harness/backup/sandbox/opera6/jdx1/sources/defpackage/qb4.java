package defpackage;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraExtensionSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.os.Build;
import android.view.Surface;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class qb4 implements ivh {
    public final LinkedHashMap a = new LinkedHashMap();
    public final zyk b = z4c.b(new nd3((byte) 4));
    public volatile Map c = n08.a;

    public static int c(owh owhVar) {
        hbl hblVar = (hbl) owhVar.a(kbl.a);
        Object obj = hblVar != null ? hblVar.a.get("CAPTURE_CONFIG_ID_KEY") : null;
        Integer num = obj instanceof Integer ? (Integer) obj : null;
        if (num != null) {
            return num.intValue();
        }
        return -1;
    }

    @Override // defpackage.ivh
    public final void D(owh owhVar, long j, w61 w61Var) {
        for (Map.Entry entry : this.c.entrySet()) {
            rb4 rb4Var = (rb4) entry.getKey();
            Executor executor = (Executor) entry.getValue();
            if (rb4Var instanceof lg4) {
                CameraCaptureSession cameraCaptureSessionB = b(owhVar);
                CaptureRequest captureRequest = (CaptureRequest) owhVar.E(uqh.a(CaptureRequest.class));
                TotalCaptureResult totalCaptureResult = (TotalCaptureResult) w61Var.E(uqh.a(TotalCaptureResult.class));
                if (cameraCaptureSessionB != null && captureRequest != null && totalCaptureResult != null) {
                    executor.execute(new qn((lg4) rb4Var, cameraCaptureSessionB, captureRequest, totalCaptureResult, (byte) 4));
                }
            } else {
                executor.execute(new k3(rb4Var, this, owhVar, new uj4(owhVar, w61Var), (byte) 19));
            }
        }
    }

    @Override // defpackage.ivh
    public final void E(lvh lvhVar) {
        for (Map.Entry entry : this.c.entrySet()) {
            rb4 rb4Var = (rb4) entry.getKey();
            Executor executor = (Executor) entry.getValue();
            Object obj = lvhVar.c.get(kbl.a);
            hbl hblVar = obj instanceof hbl ? (hbl) obj : null;
            Object obj2 = hblVar != null ? hblVar.a.get("CAPTURE_CONFIG_ID_KEY") : null;
            Integer num = obj2 instanceof Integer ? (Integer) obj2 : null;
            executor.execute(new br(rb4Var, num != null ? num.intValue() : -1, (byte) 6));
        }
    }

    public final void a(rb4 rb4Var, Executor executor) {
        if (this.c.containsKey(rb4Var)) {
            throw new IllegalStateException((rb4Var + " was already registered!").toString());
        }
        synchronized (this.a) {
            this.a.put(rb4Var, executor);
            this.c = rbd.i(this.a);
        }
    }

    public final CameraCaptureSession b(owh owhVar) {
        CameraCaptureSession cameraCaptureSession = (CameraCaptureSession) owhVar.E(uqh.a(CameraCaptureSession.class));
        if (cameraCaptureSession != null) {
            return cameraCaptureSession;
        }
        if (Build.VERSION.SDK_INT < 31 || ((CameraExtensionSession) owhVar.E(uqh.a(CameraExtensionSession.class))) == null) {
            return null;
        }
        return (CameraCaptureSession) this.b.getValue();
    }

    @Override // defpackage.ivh
    public final void h(owh owhVar, long j, int i, int i2) {
        for (Map.Entry entry : this.c.entrySet()) {
            rb4 rb4Var = (rb4) entry.getKey();
            Executor executor = (Executor) entry.getValue();
            if (rb4Var instanceof lg4) {
                CameraCaptureSession cameraCaptureSession = (CameraCaptureSession) owhVar.E(uqh.a(CameraCaptureSession.class));
                CaptureRequest captureRequest = (CaptureRequest) owhVar.E(uqh.a(CaptureRequest.class));
                Surface surface = (Surface) owhVar.K().get(new yfk(i));
                if (cameraCaptureSession != null && captureRequest != null && surface != null) {
                    executor.execute(new bf1((lg4) rb4Var, cameraCaptureSession, captureRequest, surface, j));
                }
            }
        }
    }

    @Override // defpackage.ivh
    public final void k(owh owhVar, long j, long j2) {
        if (Build.VERSION.SDK_INT >= 34) {
            for (Map.Entry entry : this.c.entrySet()) {
                rb4 rb4Var = (rb4) entry.getKey();
                Executor executor = (Executor) entry.getValue();
                if (rb4Var instanceof lg4) {
                    CameraCaptureSession cameraCaptureSession = (CameraCaptureSession) owhVar.E(uqh.a(CameraCaptureSession.class));
                    CaptureRequest captureRequest = (CaptureRequest) owhVar.E(uqh.a(CaptureRequest.class));
                    if (cameraCaptureSession != null && captureRequest != null) {
                        executor.execute(new nb4((lg4) rb4Var, cameraCaptureSession, captureRequest, j2, j, (byte) 1));
                    }
                }
            }
        }
    }

    @Override // defpackage.ivh
    public final void l(owh owhVar, int i) {
        for (Map.Entry entry : this.c.entrySet()) {
            rb4 rb4Var = (rb4) entry.getKey();
            Executor executor = (Executor) entry.getValue();
            if (rb4Var instanceof lg4) {
                CameraCaptureSession cameraCaptureSession = (CameraCaptureSession) owhVar.E(uqh.a(CameraCaptureSession.class));
                CaptureRequest captureRequest = (CaptureRequest) owhVar.E(uqh.a(CaptureRequest.class));
                CaptureResult captureResult = (CaptureResult) owhVar.E(uqh.a(CaptureResult.class));
                if (cameraCaptureSession != null && captureRequest != null && captureResult != null) {
                    executor.execute(new pb4((lg4) rb4Var, cameraCaptureSession, captureRequest, captureResult, (byte) 0));
                }
            } else {
                executor.execute(new d50(rb4Var, this, owhVar, i));
            }
        }
    }

    @Override // defpackage.ivh
    public final void n(owh owhVar, long j, x61 x61Var) {
        for (Map.Entry entry : this.c.entrySet()) {
            rb4 rb4Var = (rb4) entry.getKey();
            Executor executor = (Executor) entry.getValue();
            if (rb4Var instanceof lg4) {
                CameraCaptureSession cameraCaptureSession = (CameraCaptureSession) owhVar.E(uqh.a(CameraCaptureSession.class));
                CaptureRequest captureRequest = (CaptureRequest) owhVar.E(uqh.a(CaptureRequest.class));
                CaptureResult captureResult = (CaptureResult) x61Var.E(uqh.a(CaptureResult.class));
                if (cameraCaptureSession != null && captureRequest != null && captureResult != null) {
                    executor.execute(new pb4((lg4) rb4Var, cameraCaptureSession, captureRequest, captureResult, (byte) 1));
                }
            }
        }
    }

    @Override // defpackage.ivh
    public final void p(owh owhVar, long j) {
        for (Map.Entry entry : this.c.entrySet()) {
            rb4 rb4Var = (rb4) entry.getKey();
            Executor executor = (Executor) entry.getValue();
            if (rb4Var instanceof lg4) {
                CameraCaptureSession cameraCaptureSessionB = b(owhVar);
                CaptureRequest captureRequest = (CaptureRequest) owhVar.E(uqh.a(CaptureRequest.class));
                if (cameraCaptureSessionB != null && captureRequest != null) {
                    executor.execute(new ni2((lg4) rb4Var, cameraCaptureSessionB, j, (byte) 1));
                }
            }
        }
    }

    @Override // defpackage.ivh
    public final void q(owh owhVar) {
        for (Map.Entry entry : this.c.entrySet()) {
            rb4 rb4Var = (rb4) entry.getKey();
            Executor executor = (Executor) entry.getValue();
            if (rb4Var instanceof lg4) {
                CameraCaptureSession cameraCaptureSession = (CameraCaptureSession) owhVar.E(uqh.a(CameraCaptureSession.class));
                CaptureRequest captureRequest = (CaptureRequest) owhVar.E(uqh.a(CaptureRequest.class));
                if (cameraCaptureSession != null && captureRequest != null) {
                    executor.execute(new bi2((lg4) rb4Var, cameraCaptureSession, (byte) 23));
                }
            } else {
                executor.execute(new ob4(rb4Var, this, owhVar, (byte) 1));
            }
        }
    }

    @Override // defpackage.ivh
    public final void r(owh owhVar, long j, long j2) {
        for (Map.Entry entry : this.c.entrySet()) {
            rb4 rb4Var = (rb4) entry.getKey();
            Executor executor = (Executor) entry.getValue();
            if (rb4Var instanceof lg4) {
                CameraCaptureSession cameraCaptureSessionB = b(owhVar);
                CaptureRequest captureRequest = (CaptureRequest) owhVar.E(uqh.a(CaptureRequest.class));
                if (cameraCaptureSessionB != null && captureRequest != null) {
                    executor.execute(new nb4((lg4) rb4Var, cameraCaptureSessionB, captureRequest, j2, j, (byte) 0));
                }
            } else {
                executor.execute(new ob4(rb4Var, this, owhVar, (byte) 0));
            }
        }
    }

    @Override // defpackage.ivh
    public final void t(owh owhVar, long j, hwh hwhVar) {
        for (Map.Entry entry : this.c.entrySet()) {
            rb4 rb4Var = (rb4) entry.getKey();
            Executor executor = (Executor) entry.getValue();
            if (rb4Var instanceof lg4) {
                CameraCaptureSession cameraCaptureSessionB = b(owhVar);
                CaptureRequest captureRequest = (CaptureRequest) owhVar.E(uqh.a(CaptureRequest.class));
                CaptureFailure captureFailure = (CaptureFailure) hwhVar.E(uqh.a(CaptureFailure.class));
                if (cameraCaptureSessionB != null && captureRequest != null && captureFailure != null) {
                    executor.execute(new qn((lg4) rb4Var, cameraCaptureSessionB, captureRequest, captureFailure, (byte) 5));
                }
            } else {
                executor.execute(new k3(rb4Var, this, owhVar, new ujp((byte) 27), (byte) 20));
            }
        }
    }
}
