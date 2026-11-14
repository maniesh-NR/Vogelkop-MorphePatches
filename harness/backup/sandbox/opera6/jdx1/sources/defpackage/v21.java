package defpackage;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.ExtensionSessionConfiguration;
import android.hardware.camera2.params.OutputConfiguration;
import android.os.Build;
import android.os.SystemClock;
import android.os.Trace;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import kotlin.Pair;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class v21 implements wc4 {
    public final ge4 a;
    public final CameraDevice b;
    public final String c;
    public final db4 d;
    public final f1p e;
    public final hnl f;
    public final af2 g = c26.i(false);
    public final ef2 h = c26.k(null);

    public v21(ge4 ge4Var, CameraDevice cameraDevice, String str, db4 db4Var, f1p f1pVar, hnl hnlVar) {
        this.a = ge4Var;
        this.b = cameraDevice;
        this.c = str;
        this.d = db4Var;
        this.e = f1pVar;
        this.f = hnlVar;
    }

    @Override // defpackage.wc4
    public final boolean D(jl8 jl8Var) {
        boolean z;
        Unit unit;
        int i;
        wd2 wd2Var = jl8Var.b;
        CameraDevice cameraDevice = this.b;
        kl8 kl8Var = jl8Var.g;
        Integer num = jl8Var.f;
        Pair pairA = a(kl8Var);
        boolean zBooleanValue = ((Boolean) pairA.a).booleanValue();
        h4j h4jVar = (h4j) pairA.b;
        if (!zBooleanValue) {
            return false;
        }
        if (h4jVar != null) {
            b(h4jVar);
        }
        String str = this.c;
        String strJ = sko.j("CXCP#createExtensionSession-", str);
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            Trace.beginSection(strJ);
            db4 db4Var = this.d;
            try {
                int iIntValue = num.intValue();
                ArrayList arrayList = jl8Var.a;
                ArrayList arrayList2 = new ArrayList(k95.o(arrayList, 10));
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    int i3 = iIntValue;
                    arrayList2.add((OutputConfiguration) ((h81) obj).E(uqh.a(OutputConfiguration.class)));
                    kl8Var = kl8Var;
                    iIntValue = i3;
                }
                ExtensionSessionConfiguration extensionSessionConfiguration = new ExtensionSessionConfiguration(iIntValue, arrayList2, wd2Var, new b61(this, kl8Var, h4jVar, this.d, this.e, wd2Var));
                h81 h81Var = jl8Var.h;
                if (h81Var != null && Build.VERSION.SDK_INT >= 34) {
                    OutputConfiguration outputConfiguration = (OutputConfiguration) h81Var.E(uqh.a(OutputConfiguration.class));
                    if (outputConfiguration == null) {
                        throw new IllegalStateException("Failed to unwrap Postview OutputConfiguration");
                    }
                    g8.T(extensionSessionConfiguration, outputConfiguration);
                }
                cameraDevice.createExtensionSession(extensionSessionConfiguration);
                unit = Unit.a;
                z = false;
            } catch (Exception e) {
                if (e instanceof CameraAccessException) {
                    e.getMessage();
                    CameraAccessException cameraAccessException = (CameraAccessException) e;
                    int reason = cameraAccessException.getReason();
                    boolean z2 = true;
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
                        z2 = true;
                    } else {
                        i = 3;
                    }
                    db4Var.a(i, str, z2);
                } else if ((e instanceof IllegalArgumentException) || (e instanceof SecurityException) || (e instanceof UnsupportedOperationException) || (e instanceof NullPointerException)) {
                    e.getMessage();
                    z = false;
                    db4Var.a(9, str, false);
                    unit = null;
                } else if (!(e instanceof IllegalStateException)) {
                    throw e;
                }
                z = false;
                unit = null;
            }
            if (unit == null) {
                Objects.toString(cameraDevice);
                if (h4jVar != null) {
                    c(h4jVar);
                }
            }
            if (unit != null) {
                return true;
            }
            return z;
        } finally {
            String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf(vep.o(jElapsedRealtimeNanos) / 1000000.0d)}, 1));
        }
    }

    @Override // defpackage.inm
    public final Object E(s15 s15Var) {
        if (s15Var.equals(uqh.a(CameraDevice.class))) {
            return this.b;
        }
        return null;
    }

    @Override // defpackage.wc4
    public final String G() {
        return this.c;
    }

    @Override // defpackage.wc4
    public final CaptureRequest.Builder H(TotalCaptureResult totalCaptureResult) {
        CaptureRequest.Builder builderCreateReprocessCaptureRequest;
        StringBuilder sb = new StringBuilder("CXCP#createReprocessCaptureRequest-");
        String str = this.c;
        sb.append(str);
        String string = sb.toString();
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            Trace.beginSection(string);
            db4 db4Var = this.d;
            try {
                builderCreateReprocessCaptureRequest = this.b.createReprocessCaptureRequest(totalCaptureResult);
            } catch (Exception e) {
                int i = 0;
                if (e instanceof CameraAccessException) {
                    e.getMessage();
                    CameraAccessException cameraAccessException = (CameraAccessException) e;
                    int reason = cameraAccessException.getReason();
                    if (reason == 1) {
                        i = 3;
                    } else if (reason == 2) {
                        i = 6;
                    } else if (reason != 3) {
                        if (reason == 4) {
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
                builderCreateReprocessCaptureRequest = null;
            }
            return builderCreateReprocessCaptureRequest;
        } finally {
            String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf(vep.o(jElapsedRealtimeNanos) / 1000000.0d)}, 1));
        }
    }

    @Override // defpackage.wc4
    public final void I(int i) {
        try {
            Trace.beginSection("setCameraAudioRestriction");
            String str = this.c;
            db4 db4Var = this.d;
            try {
                r9n.N(this.b, i);
            } catch (Exception e) {
                int i2 = 0;
                if (e instanceof CameraAccessException) {
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
                } else if ((e instanceof IllegalArgumentException) || (e instanceof SecurityException) || (e instanceof UnsupportedOperationException) || (e instanceof NullPointerException)) {
                    e.getMessage();
                    db4Var.a(9, str, false);
                } else if (!(e instanceof IllegalStateException)) {
                    throw e;
                }
            }
        } finally {
            Trace.endSection();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0183 A[Catch: all -> 0x01f7, TryCatch #1 {all -> 0x01f7, blocks: (B:18:0x008d, B:20:0x0097, B:22:0x009d, B:23:0x00a5, B:26:0x00d0, B:27:0x00f0, B:29:0x00f6, B:30:0x0104, B:31:0x010e, B:33:0x0114, B:35:0x0126, B:37:0x0133, B:39:0x013a, B:40:0x0143, B:42:0x0152, B:45:0x015c, B:46:0x015f, B:48:0x0161, B:49:0x0164, B:61:0x017f, B:63:0x0183, B:72:0x019b, B:78:0x01aa, B:79:0x01ae, B:81:0x01b2, B:83:0x01b6, B:85:0x01ba, B:87:0x01be, B:90:0x01c4, B:91:0x01c5), top: B:110:0x0032 }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01ae A[Catch: all -> 0x01f7, TryCatch #1 {all -> 0x01f7, blocks: (B:18:0x008d, B:20:0x0097, B:22:0x009d, B:23:0x00a5, B:26:0x00d0, B:27:0x00f0, B:29:0x00f6, B:30:0x0104, B:31:0x010e, B:33:0x0114, B:35:0x0126, B:37:0x0133, B:39:0x013a, B:40:0x0143, B:42:0x0152, B:45:0x015c, B:46:0x015f, B:48:0x0161, B:49:0x0164, B:61:0x017f, B:63:0x0183, B:72:0x019b, B:78:0x01aa, B:79:0x01ae, B:81:0x01b2, B:83:0x01b6, B:85:0x01ba, B:87:0x01be, B:90:0x01c4, B:91:0x01c5), top: B:110:0x0032 }] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01f3 A[RETURN, SYNTHETIC] */
    @Override // defpackage.wc4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean P(defpackage.x3j r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 538
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v21.P(x3j):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0085 A[Catch: all -> 0x00f0, TryCatch #0 {all -> 0x00f0, blocks: (B:17:0x004e, B:33:0x0081, B:35:0x0085, B:44:0x009c, B:49:0x00a9, B:50:0x00ad, B:52:0x00b1, B:54:0x00b5, B:56:0x00b9, B:58:0x00bd, B:60:0x00c1, B:61:0x00c2), top: B:77:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ad A[Catch: all -> 0x00f0, TryCatch #0 {all -> 0x00f0, blocks: (B:17:0x004e, B:33:0x0081, B:35:0x0085, B:44:0x009c, B:49:0x00a9, B:50:0x00ad, B:52:0x00b1, B:54:0x00b5, B:56:0x00b9, B:58:0x00bd, B:60:0x00c1, B:61:0x00c2), top: B:77:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:88:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r15v12 */
    /* JADX WARN: Type inference failed for: r15v13 */
    /* JADX WARN: Type inference failed for: r15v6, types: [int] */
    @Override // defpackage.wc4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean T(java.util.List r22, defpackage.dk4 r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v21.T(java.util.List, dk4):boolean");
    }

    @Override // defpackage.wc4
    public final void V() {
        if (!this.g.b()) {
            qp2.n("Check failed.");
            return;
        }
        h4j h4jVar = (h4j) this.h.b((Object) null);
        if (h4jVar != null) {
            c(h4jVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0085 A[Catch: all -> 0x00f0, TryCatch #0 {all -> 0x00f0, blocks: (B:17:0x004e, B:33:0x0081, B:35:0x0085, B:44:0x009c, B:49:0x00a9, B:50:0x00ad, B:52:0x00b1, B:54:0x00b5, B:56:0x00b9, B:58:0x00bd, B:60:0x00c1, B:61:0x00c2), top: B:77:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ad A[Catch: all -> 0x00f0, TryCatch #0 {all -> 0x00f0, blocks: (B:17:0x004e, B:33:0x0081, B:35:0x0085, B:44:0x009c, B:49:0x00a9, B:50:0x00ad, B:52:0x00b1, B:54:0x00b5, B:56:0x00b9, B:58:0x00bd, B:60:0x00c1, B:61:0x00c2), top: B:77:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:88:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r15v12 */
    /* JADX WARN: Type inference failed for: r15v13 */
    /* JADX WARN: Type inference failed for: r15v6, types: [int] */
    @Override // defpackage.wc4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean W(java.util.ArrayList r22, defpackage.dk4 r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v21.W(java.util.ArrayList, dk4):boolean");
    }

    public final Pair a(h4j h4jVar) {
        if (!this.g.b()) {
            return new Pair(Boolean.TRUE, this.h.b(h4jVar));
        }
        c(h4jVar);
        return new Pair(Boolean.FALSE, (Object) null);
    }

    public final void b(h4j h4jVar) {
        try {
            Trace.beginSection(this + "#onSessionDisconnected");
            h4jVar.b();
        } finally {
            Trace.endSection();
        }
    }

    public final void c(h4j h4jVar) {
        try {
            Trace.beginSection(this + "#onSessionFinalized");
            h4jVar.a();
        } finally {
            Trace.endSection();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x010f A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0111  */
    @Override // defpackage.wc4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean h(defpackage.m8b r20, java.util.ArrayList r21, defpackage.dk4 r22) {
        /*
            Method dump skipped, instructions count: 301
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v21.h(m8b, java.util.ArrayList, dk4):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:37:0x009a A[Catch: all -> 0x010b, TryCatch #3 {all -> 0x010b, blocks: (B:21:0x0075, B:35:0x0096, B:37:0x009a, B:46:0x00b1, B:51:0x00be, B:52:0x00c2, B:54:0x00c6, B:56:0x00ca, B:58:0x00ce, B:60:0x00d2, B:64:0x00d9, B:65:0x00da), top: B:88:0x003b }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00c2 A[Catch: all -> 0x010b, TryCatch #3 {all -> 0x010b, blocks: (B:21:0x0075, B:35:0x0096, B:37:0x009a, B:46:0x00b1, B:51:0x00be, B:52:0x00c2, B:54:0x00c6, B:56:0x00ca, B:58:0x00ce, B:60:0x00d2, B:64:0x00d9, B:65:0x00da), top: B:88:0x003b }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0109  */
    /* JADX WARN: Type inference failed for: r15v10 */
    /* JADX WARN: Type inference failed for: r15v12 */
    /* JADX WARN: Type inference failed for: r15v5, types: [int] */
    @Override // defpackage.wc4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean k(java.util.ArrayList r20, defpackage.dk4 r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 300
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v21.k(java.util.ArrayList, dk4):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0087 A[Catch: all -> 0x00f2, TryCatch #2 {all -> 0x00f2, blocks: (B:17:0x004e, B:33:0x0083, B:35:0x0087, B:44:0x009e, B:49:0x00ab, B:50:0x00af, B:52:0x00b3, B:54:0x00b7, B:56:0x00bb, B:58:0x00bf, B:60:0x00c3, B:61:0x00c4), top: B:77:0x004e }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00af A[Catch: all -> 0x00f2, TryCatch #2 {all -> 0x00f2, blocks: (B:17:0x004e, B:33:0x0083, B:35:0x0087, B:44:0x009e, B:49:0x00ab, B:50:0x00af, B:52:0x00b3, B:54:0x00b7, B:56:0x00bb, B:58:0x00bf, B:60:0x00c3, B:61:0x00c4), top: B:77:0x004e }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:88:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r10v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v2, types: [db4] */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v10 */
    /* JADX WARN: Type inference failed for: r15v2, types: [int] */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r15v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r15v7 */
    /* JADX WARN: Type inference failed for: r15v8 */
    /* JADX WARN: Type inference failed for: r15v9 */
    @Override // defpackage.wc4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean l(android.hardware.camera2.params.InputConfiguration r22, java.util.ArrayList r23, defpackage.dk4 r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v21.l(android.hardware.camera2.params.InputConfiguration, java.util.ArrayList, dk4):boolean");
    }

    @Override // defpackage.wc4
    public final void n() {
        h4j h4jVar;
        if (!this.g.a() || (h4jVar = (h4j) this.h.a) == null) {
            return;
        }
        b(h4jVar);
    }

    @Override // defpackage.wc4
    public final CaptureRequest.Builder o(int i) {
        CaptureRequest.Builder builderCreateCaptureRequest;
        StringBuilder sb = new StringBuilder("CXCP#createCaptureRequest-");
        String str = this.c;
        sb.append(str);
        String string = sb.toString();
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            Trace.beginSection(string);
            db4 db4Var = this.d;
            try {
                builderCreateCaptureRequest = this.b.createCaptureRequest(i);
            } catch (Exception e) {
                int i2 = 0;
                if (e instanceof CameraAccessException) {
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
                } else if ((e instanceof IllegalArgumentException) || (e instanceof SecurityException) || (e instanceof UnsupportedOperationException) || (e instanceof NullPointerException)) {
                    e.getMessage();
                    db4Var.a(9, str, false);
                } else if (!(e instanceof IllegalStateException)) {
                    throw e;
                }
                builderCreateCaptureRequest = null;
            }
            return builderCreateCaptureRequest;
        } finally {
            String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf(vep.o(jElapsedRealtimeNanos) / 1000000.0d)}, 1));
        }
    }

    public final String toString() {
        return "AndroidCameraDevice(camera=" + ((Object) sd4.b(this.c)) + ')';
    }
}
