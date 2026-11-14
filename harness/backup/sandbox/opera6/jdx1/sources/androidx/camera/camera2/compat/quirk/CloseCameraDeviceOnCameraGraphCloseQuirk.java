package androidx.camera.camera2.compat.quirk;

import android.annotation.SuppressLint;
import defpackage.tgh;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/camera/camera2/compat/quirk/CloseCameraDeviceOnCameraGraphCloseQuirk;", "Ltgh;", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SuppressLint({"CameraXQuirksClassDetector"})
/* loaded from: classes.dex */
public final class CloseCameraDeviceOnCameraGraphCloseQuirk implements tgh {
    public static final boolean a;
    public static final boolean b;
    public static final boolean c;
    public static final boolean d;
    public static final boolean e;

    /* JADX WARN: Removed duplicated region for block: B:24:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003e  */
    static {
        /*
            java.lang.String r0 = android.os.Build.HARDWARE
            java.lang.String r1 = "samsungexynos7570"
            boolean r1 = kotlin.jvm.internal.Intrinsics.a(r0, r1)
            androidx.camera.camera2.compat.quirk.CloseCameraDeviceOnCameraGraphCloseQuirk.a = r1
            java.lang.String r1 = "samsungexynos7870"
            boolean r0 = kotlin.jvm.internal.Intrinsics.a(r0, r1)
            androidx.camera.camera2.compat.quirk.CloseCameraDeviceOnCameraGraphCloseQuirk.b = r0
            java.lang.String r0 = android.os.Build.MANUFACTURER
            java.lang.String r1 = "Xiaomi"
            r2 = 1
            boolean r3 = kotlin.text.c.m(r0, r1, r2)
            r4 = 0
            if (r3 != 0) goto L26
            java.lang.String r3 = android.os.Build.BRAND
            boolean r1 = kotlin.text.c.m(r3, r1, r2)
            if (r1 == 0) goto L3e
        L26:
            java.lang.String r1 = "aurora"
            java.lang.String r3 = "houji"
            java.lang.String[] r1 = new java.lang.String[]{r1, r3}
            java.lang.String r3 = android.os.Build.DEVICE
            java.util.Locale r5 = java.util.Locale.ROOT
            java.lang.String r3 = r3.toLowerCase(r5)
            int r1 = e82.u(r3, r1)
            if (r1 < 0) goto L3e
            r1 = r2
            goto L3f
        L3e:
            r1 = r4
        L3f:
            androidx.camera.camera2.compat.quirk.CloseCameraDeviceOnCameraGraphCloseQuirk.c = r1
            java.lang.String r1 = "Sony"
            boolean r0 = kotlin.text.c.m(r0, r1, r2)
            if (r0 != 0) goto L51
            java.lang.String r0 = android.os.Build.BRAND
            boolean r0 = kotlin.text.c.m(r0, r1, r2)
            if (r0 == 0) goto L88
        L51:
            java.lang.String r0 = "SO"
            java.lang.String r1 = "A301SO"
            java.lang.String r3 = "XQ-DQ"
            java.lang.String[] r0 = new java.lang.String[]{r3, r0, r1}
            java.util.List r0 = java.util.Arrays.asList(r0)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            boolean r1 = r0 instanceof java.util.Collection
            if (r1 == 0) goto L6e
            r1 = r0
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L88
        L6e:
            java.util.Iterator r0 = r0.iterator()
        L72:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L88
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r3 = android.os.Build.DEVICE
            boolean r1 = kotlin.text.c.q(r3, r1, r2)
            if (r1 == 0) goto L72
            r0 = r2
            goto L89
        L88:
            r0 = r4
        L89:
            androidx.camera.camera2.compat.quirk.CloseCameraDeviceOnCameraGraphCloseQuirk.d = r0
            java.lang.String r0 = android.os.Build.MANUFACTURER
            java.lang.String r1 = "Samsung"
            boolean r0 = kotlin.text.c.m(r0, r1, r2)
            if (r0 != 0) goto L9d
            java.lang.String r0 = android.os.Build.BRAND
            boolean r0 = kotlin.text.c.m(r0, r1, r2)
            if (r0 == 0) goto La7
        L9d:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 31
            if (r0 < r1) goto La7
            r1 = 34
            if (r0 <= r1) goto La8
        La7:
            r2 = r4
        La8:
            androidx.camera.camera2.compat.quirk.CloseCameraDeviceOnCameraGraphCloseQuirk.e = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.compat.quirk.CloseCameraDeviceOnCameraGraphCloseQuirk.<clinit>():void");
    }
}
