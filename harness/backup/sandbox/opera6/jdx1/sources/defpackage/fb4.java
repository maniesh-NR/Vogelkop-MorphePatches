package defpackage;

import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraExtensionCharacteristics;
import android.hardware.camera2.CameraManager;
import android.os.Build;
import android.os.SystemClock;
import android.os.Trace;
import android.util.ArrayMap;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class fb4 implements gb4 {
    public final Context a;
    public final hnl b;
    public final mag c;
    public final c37 d;
    public final h0l e;
    public final ArrayMap f = new ArrayMap();
    public final ArrayMap g = new ArrayMap();
    public final ArrayMap h = new ArrayMap();

    public fb4(Context context, hnl hnlVar, mag magVar, c37 c37Var, h0l h0lVar) {
        this.a = context;
        this.b = hnlVar;
        this.c = magVar;
        this.d = c37Var;
        this.e = h0lVar;
    }

    public final ge4 a(String str) {
        ge4 ge4VarC;
        try {
            Trace.beginSection(((Object) sd4.b(str)) + "#awaitMetadata");
            synchronized (this.f) {
                ge4VarC = (ge4) this.f.get(str);
                if (ge4VarC == null) {
                    if (e()) {
                        ge4VarC = c(str, true);
                    } else {
                        ge4VarC = c(str, false);
                        this.f.put(str, ge4VarC);
                    }
                }
            }
            return ge4VarC;
        } finally {
            Trace.endSection();
        }
    }

    public final ja4 b(int i, String str, boolean z) {
        this.e.getClass();
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            Trace.beginSection(((Object) sd4.b(str)) + "#readCameraExtensionMetadata");
            try {
                sd4.b(str);
                ja4 ja4Var = new ja4(str, i, d(str), n08.a);
                long jElapsedRealtimeNanos2 = SystemClock.elapsedRealtimeNanos() - jElapsedRealtimeNanos;
                if (z && !z) {
                    throw new oye();
                }
                sd4.b(str);
                String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf(jElapsedRealtimeNanos2 / 1000000.0d)}, 1));
                return ja4Var;
            } catch (Throwable th) {
                throw new IllegalStateException("Failed to load extension metadata for " + ((Object) sd4.b(str)) + '!', th);
            }
        } finally {
            Trace.endSection();
        }
    }

    public final ma4 c(String str, boolean z) {
        Iterable iterableF;
        c37 c37Var = this.d;
        Map map = (Map) c37Var.b;
        this.e.getClass();
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            Trace.beginSection(((Object) sd4.b(str)) + "#readCameraMetadata");
            try {
                sd4.b(str);
                CameraCharacteristics cameraCharacteristics = ((CameraManager) this.a.getSystemService("camera")).getCameraCharacteristics(str);
                if (cameraCharacteristics == null) {
                    throw new IllegalStateException(("Failed to get CameraCharacteristics for " + ((Object) sd4.b(str)) + '!').toString());
                }
                if (Build.VERSION.SDK_INT < 32 || cameraCharacteristics.get(CameraCharacteristics.INFO_DEVICE_STATE_SENSOR_ORIENTATION_MAP) == null) {
                    iterableF = (Set) map.get(new sd4(str));
                } else {
                    v08 v08Var = (Set) map.get(new sd4(str));
                    if (v08Var == null) {
                        v08Var = v08.a;
                    }
                    iterableF = b5j.f(v08Var, CameraCharacteristics.SENSOR_ORIENTATION);
                }
                Set setE = (Set) c37Var.a;
                if (iterableF != null) {
                    setE = b5j.e(setE, iterableF);
                }
                ma4 ma4Var = new ma4(str, cameraCharacteristics, this, n08.a, setE);
                long jElapsedRealtimeNanos2 = SystemClock.elapsedRealtimeNanos() - jElapsedRealtimeNanos;
                if (z && !z) {
                    throw new oye();
                }
                sd4.b(str);
                String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf(jElapsedRealtimeNanos2 / 1000000.0d)}, 1));
                return ma4Var;
            } catch (Throwable th) {
                throw new IllegalStateException("Failed to load metadata for " + ((Object) sd4.b(str)) + '!', th);
            }
        } finally {
            Trace.endSection();
        }
    }

    public final CameraExtensionCharacteristics d(String str) throws CameraAccessException {
        CameraExtensionCharacteristics cameraExtensionCharacteristics;
        synchronized (this.h) {
            cameraExtensionCharacteristics = (CameraExtensionCharacteristics) this.h.get(str);
        }
        if (cameraExtensionCharacteristics != null) {
            return cameraExtensionCharacteristics;
        }
        sd4.b(str);
        CameraExtensionCharacteristics cameraExtensionCharacteristics2 = ((CameraManager) this.a.getSystemService("camera")).getCameraExtensionCharacteristics(str);
        if (cameraExtensionCharacteristics2 != null) {
            return cameraExtensionCharacteristics2;
        }
        n57.e("Failed to get CameraExtensionCharacteristics for ", sd4.b(str), 33);
        return null;
    }

    public final boolean e() {
        boolean z;
        mag magVar = this.c;
        magVar.getClass();
        if (Intrinsics.a(Build.FINGERPRINT, "robolectric")) {
            z = true;
        } else {
            if (!magVar.b) {
                Trace.beginSection("CXCP#checkCameraPermission");
                if (magVar.a.checkSelfPermission("android.permission.CAMERA") == 0) {
                    magVar.b = true;
                }
                Trace.endSection();
            }
            z = magVar.b;
        }
        return !z;
    }
}
