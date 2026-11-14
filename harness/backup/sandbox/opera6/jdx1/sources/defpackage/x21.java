package defpackage;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraExtensionSession;
import android.hardware.camera2.CaptureRequest;
import android.os.Build;
import android.view.Surface;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;

/* loaded from: classes.dex */
public final class x21 implements dd4 {
    public final v21 a;
    public final CameraExtensionSession b;
    public final db4 c;
    public final wd2 d;
    public final int e;
    public final df2 f;
    public final HashMap g;

    public x21(v21 v21Var, CameraExtensionSession cameraExtensionSession, db4 db4Var, wd2 wd2Var) {
        this.a = v21Var;
        this.b = cameraExtensionSession;
        this.c = db4Var;
        this.d = wd2Var;
        bf2 bf2Var = de4.a;
        bf2Var.getClass();
        this.e = bf2.b.incrementAndGet(bf2Var);
        df2 df2Var = new df2();
        df2Var.a = 0L;
        this.f = df2Var;
        this.g = new HashMap();
    }

    @Override // defpackage.inm
    public final Object E(s15 s15Var) {
        if (s15Var.equals(uqh.a(CameraExtensionSession.class))) {
            return this.b;
        }
        return null;
    }

    @Override // defpackage.ac4
    public final Integer M0(CaptureRequest captureRequest, CameraCaptureSession.CaptureCallback captureCallback) throws Exception {
        String str = this.a.c;
        try {
            int i = Build.VERSION.SDK_INT;
            CameraExtensionSession cameraExtensionSession = this.b;
            wd2 wd2Var = this.d;
            return Integer.valueOf(i >= 33 ? cameraExtensionSession.capture(captureRequest, wd2Var, new w21(this, (ra4) captureCallback)) : cameraExtensionSession.capture(captureRequest, wd2Var, new w21(this, (ra4) captureCallback, new LinkedHashMap())));
        } catch (Exception e) {
            boolean z = e instanceof CameraAccessException;
            int i2 = 0;
            db4 db4Var = this.c;
            if (!z) {
                if ((e instanceof IllegalArgumentException) || (e instanceof SecurityException) || (e instanceof UnsupportedOperationException) || (e instanceof NullPointerException)) {
                    e.getMessage();
                    db4Var.a(9, str, false);
                    return null;
                }
                if (e instanceof IllegalStateException) {
                    return null;
                }
                throw e;
            }
            e.getMessage();
            CameraAccessException cameraAccessException = (CameraAccessException) e;
            int reason = cameraAccessException.getReason();
            if (reason == 1) {
                i2 = 3;
            } else if (reason == 2) {
                i2 = 6;
            } else if (reason != 3) {
                if (reason == 4) {
                    i2 = 1;
                } else if (reason != 5) {
                    cameraAccessException.toString();
                    i2 = 11;
                } else {
                    i2 = 2;
                }
            }
            db4Var.a(i2, str, true);
            return null;
        }
    }

    @Override // defpackage.ac4
    public final boolean O() {
        return false;
    }

    @Override // defpackage.ac4
    public final wc4 U() {
        return this.a;
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws CameraAccessException {
        this.b.close();
    }

    @Override // defpackage.ac4
    public final boolean g0(List list) {
        return false;
    }

    @Override // defpackage.ac4
    public final Surface getInputSurface() {
        return null;
    }

    @Override // defpackage.ac4
    public final boolean l1() throws Exception {
        Unit unit;
        String str = this.a.c;
        try {
            this.b.stopRepeating();
            unit = Unit.a;
        } catch (Exception e) {
            boolean z = e instanceof CameraAccessException;
            db4 db4Var = this.c;
            if (z) {
                e.getMessage();
                CameraAccessException cameraAccessException = (CameraAccessException) e;
                int reason = cameraAccessException.getReason();
                int i = 3;
                if (reason != 1) {
                    if (reason == 2) {
                        i = 6;
                    } else if (reason == 3) {
                        i = 0;
                    } else if (reason == 4) {
                        i = 1;
                    } else if (reason != 5) {
                        cameraAccessException.toString();
                        i = 11;
                    } else {
                        i = 2;
                    }
                }
                db4Var.a(i, str, true);
            } else if ((e instanceof IllegalArgumentException) || (e instanceof SecurityException) || (e instanceof UnsupportedOperationException) || (e instanceof NullPointerException)) {
                e.getMessage();
                db4Var.a(9, str, false);
            } else if (!(e instanceof IllegalStateException)) {
                throw e;
            }
            unit = null;
        }
        return unit != null;
    }

    @Override // defpackage.ac4
    public final Integer s0(CaptureRequest captureRequest, CameraCaptureSession.CaptureCallback captureCallback) throws Exception {
        String str = this.a.c;
        try {
            int i = Build.VERSION.SDK_INT;
            CameraExtensionSession cameraExtensionSession = this.b;
            wd2 wd2Var = this.d;
            return Integer.valueOf(i >= 33 ? cameraExtensionSession.setRepeatingRequest(captureRequest, wd2Var, new w21(this, (ra4) captureCallback)) : cameraExtensionSession.setRepeatingRequest(captureRequest, wd2Var, new w21(this, (ra4) captureCallback, new LinkedHashMap())));
        } catch (Exception e) {
            boolean z = e instanceof CameraAccessException;
            int i2 = 0;
            db4 db4Var = this.c;
            if (!z) {
                if ((e instanceof IllegalArgumentException) || (e instanceof SecurityException) || (e instanceof UnsupportedOperationException) || (e instanceof NullPointerException)) {
                    e.getMessage();
                    db4Var.a(9, str, false);
                    return null;
                }
                if (e instanceof IllegalStateException) {
                    return null;
                }
                throw e;
            }
            e.getMessage();
            CameraAccessException cameraAccessException = (CameraAccessException) e;
            int reason = cameraAccessException.getReason();
            if (reason == 1) {
                i2 = 3;
            } else if (reason == 2) {
                i2 = 6;
            } else if (reason != 3) {
                if (reason == 4) {
                    i2 = 1;
                } else if (reason != 5) {
                    cameraAccessException.toString();
                    i2 = 11;
                } else {
                    i2 = 2;
                }
            }
            db4Var.a(i2, str, true);
            return null;
        }
    }

    @Override // defpackage.ac4
    public final Integer t0(ArrayList arrayList, CameraCaptureSession.CaptureCallback captureCallback) throws Exception {
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            M0((CaptureRequest) obj, captureCallback);
        }
        return null;
    }

    @Override // defpackage.ac4
    public final Integer u1(ArrayList arrayList, CameraCaptureSession.CaptureCallback captureCallback) {
        if (arrayList.size() == 1) {
            return s0((CaptureRequest) CollectionsKt.Z(arrayList), captureCallback);
        }
        qp2.n("CameraExtensionSession does not support setRepeatingBurst for more than oneCaptureRequest");
        return null;
    }
}
