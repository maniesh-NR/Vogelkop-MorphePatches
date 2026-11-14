package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraManager;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Objects;
import kotlin.coroutines.e;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class za4 {
    public final n7h a;
    public final hnl b;
    public final Context c;
    public final db4 d;
    public final n7h e;
    public final a64 f;
    public final Object g;
    public ArrayList h;
    public final LinkedHashMap i;
    public final LinkedHashMap j;
    public final int k;
    public final plh l;
    public final zyk m;

    /* JADX WARN: Type inference failed for: r2v7, types: [boolean, int] */
    public za4(n7h n7hVar, hnl hnlVar, Context context, PackageManager packageManager, db4 db4Var, n7h n7hVar2, ve4 ve4Var, unb unbVar) {
        this.a = n7hVar;
        this.b = hnlVar;
        this.c = context;
        this.d = db4Var;
        this.e = n7hVar2;
        a64 a64VarB = sgb.b(e.a(new csk(unbVar), hnlVar.h).plus(new jx5("Camera2DeviceCache")));
        this.f = a64VarB;
        this.g = new Object();
        this.i = new LinkedHashMap();
        this.j = new LinkedHashMap();
        int iHasSystemFeature = packageManager.hasSystemFeature("android.hardware.camera");
        this.k = packageManager.hasSystemFeature("android.hardware.camera.front") ? iHasSystemFeature + 1 : iHasSystemFeature;
        ve4Var.a(te4.b, new fv2(this, (byte) 29));
        this.l = a26.l0(qbe.t(f03.g(new r3((byte) 13, (mt5) null, (Object) this))), a64VarB, new f9k(0L), 1);
        this.m = z4c.b(new r94(this, (byte) 1));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r11, nt5 r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof defpackage.wa4
            if (r0 == 0) goto L13
            r0 = r12
            wa4 r0 = (defpackage.wa4) r0
            int r1 = r0.x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.x = r1
            goto L18
        L13:
            wa4 r0 = new wa4
            r0.<init>(r10, r12)
        L18:
            java.lang.Object r12 = r0.v
            px5 r1 = px5.a
            int r2 = r0.x
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 != r4) goto L30
            h07 r11 = r0.u
            h07 r11 = (h07) r11
            java.lang.String r0 = r0.t
            defpackage.ybh.y(r12)
            r2 = r11
            r11 = r0
            goto L78
        L30:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r10)
            return r3
        L36:
            defpackage.ybh.y(r12)
            int r12 = android.os.Build.VERSION.SDK_INT
            r2 = 35
            if (r12 >= r2) goto L40
            return r3
        L40:
            java.lang.Object r12 = r10.g
            monitor-enter(r12)
            java.util.LinkedHashMap r2 = r10.i     // Catch: java.lang.Throwable -> L92
            sd4 r5 = new sd4     // Catch: java.lang.Throwable -> L92
            r5.<init>(r11)     // Catch: java.lang.Throwable -> L92
            java.lang.Object r6 = r2.get(r5)     // Catch: java.lang.Throwable -> L92
            if (r6 != 0) goto L64
            a64 r6 = r10.f     // Catch: java.lang.Throwable -> L92
            hnl r7 = r10.b     // Catch: java.lang.Throwable -> L92
            dx5 r7 = r7.f     // Catch: java.lang.Throwable -> L92
            vr r8 = new vr     // Catch: java.lang.Throwable -> L92
            r9 = 7
            r8.<init>(r11, r10, r3, r9)     // Catch: java.lang.Throwable -> L92
            r9 = 2
            i07 r6 = defpackage.na2.g(r6, r7, r3, r8, r9)     // Catch: java.lang.Throwable -> L92
            r2.put(r5, r6)     // Catch: java.lang.Throwable -> L92
        L64:
            r2 = r6
            h07 r2 = (h07) r2     // Catch: java.lang.Throwable -> L92
            monitor-exit(r12)
            r0.t = r11
            r12 = r2
            h07 r12 = (h07) r12
            r0.u = r12
            r0.x = r4
            java.lang.Object r12 = r2.X(r0)
            if (r12 != r1) goto L78
            return r1
        L78:
            uc4 r12 = (defpackage.uc4) r12
            if (r12 != 0) goto L91
            defpackage.sd4.b(r11)
            java.lang.Object r0 = r10.g
            monitor-enter(r0)
            java.util.LinkedHashMap r10 = r10.i     // Catch: java.lang.Throwable -> L8e
            sd4 r1 = new sd4     // Catch: java.lang.Throwable -> L8e
            r1.<init>(r11)     // Catch: java.lang.Throwable -> L8e
            r10.remove(r1, r2)     // Catch: java.lang.Throwable -> L8e
            monitor-exit(r0)
            return r12
        L8e:
            r10 = move-exception
            monitor-exit(r0)
            throw r10
        L91:
            return r12
        L92:
            r10 = move-exception
            monitor-exit(r12)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.za4.a(java.lang.String, nt5):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.String r11, nt5 r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof defpackage.xa4
            if (r0 == 0) goto L13
            r0 = r12
            xa4 r0 = (defpackage.xa4) r0
            int r1 = r0.x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.x = r1
            goto L18
        L13:
            xa4 r0 = new xa4
            r0.<init>(r10, r12)
        L18:
            java.lang.Object r12 = r0.v
            px5 r1 = px5.a
            int r2 = r0.x
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 != r4) goto L30
            h07 r11 = r0.u
            h07 r11 = (h07) r11
            java.lang.String r0 = r0.t
            defpackage.ybh.y(r12)
            r2 = r11
            r11 = r0
            goto L70
        L30:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r10)
            return r3
        L36:
            defpackage.ybh.y(r12)
            java.lang.Object r12 = r10.g
            monitor-enter(r12)
            java.util.LinkedHashMap r2 = r10.j     // Catch: java.lang.Throwable -> L8a
            sd4 r5 = new sd4     // Catch: java.lang.Throwable -> L8a
            r5.<init>(r11)     // Catch: java.lang.Throwable -> L8a
            java.lang.Object r6 = r2.get(r5)     // Catch: java.lang.Throwable -> L8a
            if (r6 != 0) goto L5c
            a64 r6 = r10.f     // Catch: java.lang.Throwable -> L8a
            hnl r7 = r10.b     // Catch: java.lang.Throwable -> L8a
            dx5 r7 = r7.f     // Catch: java.lang.Throwable -> L8a
            ya4 r8 = new ya4     // Catch: java.lang.Throwable -> L8a
            r8.<init>(r11, r10, r3)     // Catch: java.lang.Throwable -> L8a
            r9 = 2
            i07 r6 = defpackage.na2.g(r6, r7, r3, r8, r9)     // Catch: java.lang.Throwable -> L8a
            r2.put(r5, r6)     // Catch: java.lang.Throwable -> L8a
        L5c:
            r2 = r6
            h07 r2 = (h07) r2     // Catch: java.lang.Throwable -> L8a
            monitor-exit(r12)
            r0.t = r11
            r12 = r2
            h07 r12 = (h07) r12
            r0.u = r12
            r0.x = r4
            java.lang.Object r12 = r2.X(r0)
            if (r12 != r1) goto L70
            return r1
        L70:
            cb4 r12 = (defpackage.cb4) r12
            if (r12 != 0) goto L89
            defpackage.sd4.b(r11)
            java.lang.Object r0 = r10.g
            monitor-enter(r0)
            java.util.LinkedHashMap r10 = r10.j     // Catch: java.lang.Throwable -> L86
            sd4 r1 = new sd4     // Catch: java.lang.Throwable -> L86
            r1.<init>(r11)     // Catch: java.lang.Throwable -> L86
            r10.remove(r1, r2)     // Catch: java.lang.Throwable -> L86
            monitor-exit(r0)
            return r12
        L86:
            r10 = move-exception
            monitor-exit(r0)
            throw r10
        L89:
            return r12
        L8a:
            r10 = move-exception
            monitor-exit(r12)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.za4.b(java.lang.String, nt5):java.lang.Object");
    }

    public final void c(z1h z1hVar, String str, boolean z) {
        ArrayList arrayList;
        synchronized (this.g) {
            arrayList = this.h;
        }
        int i = 0;
        ArrayList arrayListD = null;
        if (z) {
            if (arrayList == null || arrayList.isEmpty()) {
                arrayListD = d();
            } else {
                int size = arrayList.size();
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    if (Intrinsics.a(((sd4) obj).a, str)) {
                        break;
                    }
                }
                arrayListD = d();
            }
        } else {
            if (z) {
                h9o.p();
                return;
            }
            if (arrayList == null) {
                arrayListD = d();
                break;
            }
            if (!arrayList.isEmpty()) {
                int size2 = arrayList.size();
                while (i < size2) {
                    Object obj2 = arrayList.get(i);
                    i++;
                    if (Intrinsics.a(((sd4) obj2).a, str)) {
                        arrayListD = d();
                        break;
                    }
                }
            }
        }
        if (arrayListD != null && (arrayListD.size() >= this.k || arrayList == null)) {
            arrayList = arrayListD;
        }
        if (arrayList != null) {
            Objects.toString(arrayList);
            if (sgb.g0(z1hVar, arrayList) instanceof ns4) {
                Objects.toString(arrayList);
            }
        }
    }

    public final ArrayList d() {
        ArrayList arrayList = null;
        try {
            String[] cameraIdList = ((CameraManager) this.a.get()).getCameraIdList();
            arrayList = new ArrayList();
            for (String str : cameraIdList) {
                sd4.a(str);
                arrayList.add(new sd4(str));
            }
        } catch (CameraAccessException | ArrayIndexOutOfBoundsException | NullPointerException unused) {
        }
        if (arrayList.size() < this.k) {
            arrayList.toString();
            return arrayList;
        }
        synchronized (this.g) {
            this.h = arrayList;
        }
        arrayList.toString();
        return arrayList;
    }
}
