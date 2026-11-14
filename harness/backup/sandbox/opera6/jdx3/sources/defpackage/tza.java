package defpackage;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import com.leanplum.internal.ResourceQualifiers;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class tza {
    public static final Bitmap.CompressFormat h;
    public final qie a;
    public final nza b;
    public final Uri c;
    public final Bitmap.CompressFormat d;
    public final int e;
    public final Map f;
    public final pjn g;

    static {
        h = Build.VERSION.SDK_INT >= 30 ? Bitmap.CompressFormat.WEBP_LOSSY : Bitmap.CompressFormat.WEBP;
    }

    public tza(qie qieVar, nza nzaVar, Uri uri, Bitmap.CompressFormat compressFormat, int i, Map map) {
        this.a = qieVar;
        this.b = nzaVar;
        this.c = uri;
        this.d = compressFormat;
        this.e = i;
        this.f = map;
        this.g = new pjn(qieVar, (byte) 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.util.Map] */
    public static tza b(tza tzaVar, Uri uri, Bitmap.CompressFormat compressFormat, int i, LinkedHashMap linkedHashMap, int i2) {
        qie qieVar = tzaVar.a;
        nza nzaVar = tzaVar.b;
        if ((i2 & 4) != 0) {
            uri = tzaVar.c;
        }
        Uri uri2 = uri;
        if ((i2 & 32) != 0) {
            compressFormat = tzaVar.d;
        }
        Bitmap.CompressFormat compressFormat2 = compressFormat;
        if ((i2 & 64) != 0) {
            i = tzaVar.e;
        }
        int i3 = i;
        LinkedHashMap linkedHashMap2 = linkedHashMap;
        if ((i2 & ResourceQualifiers.Qualifier.AnonymousClass5.SCREENLAYOUT_LAYOUTDIR_RTL) != 0) {
            linkedHashMap2 = tzaVar.f;
        }
        return new tza(qieVar, nzaVar, uri2, compressFormat2, i3, linkedHashMap2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0098, code lost:
    
        if (r5.o(r4, r11, r6, r1) != r2) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(android.content.Context r11, nt5 r12) {
        /*
            Method dump skipped, instructions count: 292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tza.a(android.content.Context, nt5):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(android.content.Context r11, android.graphics.Bitmap r12, nt5 r13) {
        /*
            r10 = this;
            boolean r0 = r13 instanceof defpackage.rza
            if (r0 == 0) goto L13
            r0 = r13
            rza r0 = (defpackage.rza) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L18
        L13:
            rza r0 = new rza
            r0.<init>(r10, r13)
        L18:
            java.lang.Object r13 = r0.t
            px5 r1 = px5.a
            int r2 = r0.v
            r3 = 1
            if (r2 == 0) goto L2e
            if (r2 != r3) goto L27
            ybh.y(r13)     // Catch: java.io.IOException -> L5c
            goto L55
        L27:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qp2.n(r10)
            r10 = 0
            return r10
        L2e:
            ybh.y(r13)
            android.content.ContentResolver r5 = r11.getContentResolver()     // Catch: java.io.IOException -> L5c
            qie r11 = r10.a     // Catch: java.io.IOException -> L5c
            java.lang.Object r11 = r11.b     // Catch: java.io.IOException -> L5c
            java.util.concurrent.ExecutorService r11 = java.util.concurrent.Executors.newSingleThreadExecutor()     // Catch: java.io.IOException -> L5c
            jg8 r13 = new jg8     // Catch: java.io.IOException -> L5c
            r13.<init>(r11)     // Catch: java.io.IOException -> L5c
            c71 r4 = new c71     // Catch: java.io.IOException -> L5c
            r9 = 8
            r8 = 0
            r6 = r10
            r7 = r12
            r4.<init>(r5, r6, r7, r8, r9)     // Catch: java.io.IOException -> L5c
            r0.v = r3     // Catch: java.io.IOException -> L5c
            java.lang.Object r13 = na2.Z(r13, r4, r0)     // Catch: java.io.IOException -> L5c
            if (r13 != r1) goto L55
            return r1
        L55:
            java.lang.Boolean r13 = (java.lang.Boolean) r13     // Catch: java.io.IOException -> L5c
            boolean r10 = r13.booleanValue()     // Catch: java.io.IOException -> L5c
            goto L5d
        L5c:
            r10 = 0
        L5d:
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r10)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tza.c(android.content.Context, android.graphics.Bitmap, nt5):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(android.content.Context r7, nt5 r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.sza
            if (r0 == 0) goto L13
            r0 = r8
            sza r0 = (defpackage.sza) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L18
        L13:
            sza r0 = new sza
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.t
            px5 r1 = px5.a
            int r2 = r0.v
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L2e
            if (r2 != r3) goto L28
            ybh.y(r8)     // Catch: java.io.IOException -> L65
            goto L5e
        L28:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qp2.n(r6)
            return r4
        L2e:
            ybh.y(r8)
            android.net.Uri r8 = android.net.Uri.EMPTY
            android.net.Uri r2 = r6.c
            boolean r8 = kotlin.jvm.internal.Intrinsics.a(r8, r2)
            if (r8 == 0) goto L3e
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            return r6
        L3e:
            android.content.ContentResolver r7 = r7.getContentResolver()     // Catch: java.io.IOException -> L65
            qie r8 = r6.a     // Catch: java.io.IOException -> L65
            java.lang.Object r8 = r8.b     // Catch: java.io.IOException -> L65
            java.util.concurrent.ExecutorService r8 = java.util.concurrent.Executors.newSingleThreadExecutor()     // Catch: java.io.IOException -> L65
            jg8 r2 = new jg8     // Catch: java.io.IOException -> L65
            r2.<init>(r8)     // Catch: java.io.IOException -> L65
            fb9 r8 = new fb9     // Catch: java.io.IOException -> L65
            r5 = 4
            r8.<init>(r7, r6, r4, r5)     // Catch: java.io.IOException -> L65
            r0.v = r3     // Catch: java.io.IOException -> L65
            java.lang.Object r8 = na2.Z(r2, r8, r0)     // Catch: java.io.IOException -> L65
            if (r8 != r1) goto L5e
            return r1
        L5e:
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.io.IOException -> L65
            boolean r6 = r8.booleanValue()     // Catch: java.io.IOException -> L65
            goto L66
        L65:
            r6 = 0
        L66:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tza.d(android.content.Context, nt5):java.lang.Object");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tza)) {
            return false;
        }
        tza tzaVar = (tza) obj;
        return Intrinsics.a(this.a, tzaVar.a) && this.b.equals(tzaVar.b) && Intrinsics.a(this.c, tzaVar.c) && this.d == tzaVar.d && this.e == tzaVar.e && Intrinsics.a(this.f, tzaVar.f);
    }

    public final int hashCode() {
        int iHashCode = (((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 961) + 1237) * 31;
        Bitmap.CompressFormat compressFormat = this.d;
        return this.f.hashCode() + rfp.c(this.e, (iHashCode + (compressFormat == null ? 0 : compressFormat.hashCode())) * 31, 31);
    }

    public final String toString() {
        return "";
    }
}
