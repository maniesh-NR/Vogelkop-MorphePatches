package defpackage;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class ya4 extends kuk implements Function2 {
    public final /* synthetic */ String t;
    public final /* synthetic */ za4 u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ya4(String str, za4 za4Var, mt5 mt5Var) {
        super(2, mt5Var);
        this.t = str;
        this.u = za4Var;
    }

    public final mt5 create(Object obj, mt5 mt5Var) {
        return new ya4(this.t, this.u, mt5Var);
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
    }

    public final Object invokeSuspend(Object obj) throws Exception {
        Boolean boolValueOf;
        int i;
        CameraDevice.CameraDeviceSetup cameraDeviceSetup;
        px5 px5Var = px5.a;
        ybh.y(obj);
        String str = this.t;
        za4 za4Var = this.u;
        n7h n7hVar = za4Var.a;
        db4 db4Var = za4Var.d;
        int i2 = 6;
        try {
            boolValueOf = Boolean.valueOf(((CameraManager) n7hVar.get()).isCameraDeviceSetupSupported(str));
        } catch (Exception e) {
            if (e instanceof CameraAccessException) {
                e.getMessage();
                CameraAccessException cameraAccessException = (CameraAccessException) e;
                int reason = cameraAccessException.getReason();
                if (reason == 1) {
                    i = 3;
                } else if (reason == 2) {
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
                db4Var.a(i, str, true);
            } else if ((e instanceof IllegalArgumentException) || (e instanceof SecurityException) || (e instanceof UnsupportedOperationException) || (e instanceof NullPointerException)) {
                e.getMessage();
                db4Var.a(9, str, false);
            } else if (!(e instanceof IllegalStateException)) {
                throw e;
            }
            boolValueOf = null;
        }
        if (!Intrinsics.a(boolValueOf, Boolean.TRUE)) {
            return null;
        }
        sd4.b(str);
        try {
            cameraDeviceSetup = ((CameraManager) n7hVar.get()).getCameraDeviceSetup(str);
        } catch (Exception e2) {
            if (e2 instanceof CameraAccessException) {
                e2.getMessage();
                CameraAccessException cameraAccessException2 = (CameraAccessException) e2;
                int reason2 = cameraAccessException2.getReason();
                if (reason2 == 1) {
                    i2 = 3;
                } else if (reason2 != 2) {
                    if (reason2 == 3) {
                        i2 = 0;
                    } else if (reason2 == 4) {
                        i2 = 1;
                    } else if (reason2 != 5) {
                        cameraAccessException2.toString();
                        i2 = 11;
                    } else {
                        i2 = 2;
                    }
                }
                db4Var.a(i2, str, true);
            } else if ((e2 instanceof IllegalArgumentException) || (e2 instanceof SecurityException) || (e2 instanceof UnsupportedOperationException) || (e2 instanceof NullPointerException)) {
                e2.getMessage();
                db4Var.a(9, str, false);
            } else if (!(e2 instanceof IllegalStateException)) {
                throw e2;
            }
            cameraDeviceSetup = null;
        }
        if (cameraDeviceSetup != null) {
            return new bb4(cameraDeviceSetup, str, db4Var);
        }
        return null;
    }
}
