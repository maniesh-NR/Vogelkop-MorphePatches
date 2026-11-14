package defpackage;

import J.N;
import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Process;
import android.provider.Settings;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.opera.android.custom_views.CheckBox;
import com.opera.android.webapps.AddToHomescreenDataFetcherNative;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public class zy9 implements htd, bnj, zqb, w7e, ec2, rj2, oq2, skh, ax4, av4, bcf, lw1 {
    public static volatile zy9 b;
    public static final Object c = new Object();
    public static volatile zy9 d;
    public Object a;

    public zy9(byte b2) {
        switch (b2) {
            case 6:
                this.a = new WeakHashMap();
                break;
            case 15:
                this.a = new CopyOnWriteArrayList();
                break;
            default:
                this.a = new HashSet();
                break;
        }
    }

    public /* synthetic */ zy9(Object obj) {
        this.a = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002d A[PHI: r9
      0x002d: PHI (r9v1 int) = (r9v0 int), (r9v3 int), (r9v4 int) binds: [B:5:0x0014, B:10:0x001d, B:12:0x0020] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public zy9(int[] r23, float[] r24, float[][] r25) {
        /*
            r22 = this;
            r0 = r24
            r22.<init>()
            int r1 = r0.length
            r2 = 1
            int r1 = r1 - r2
            ax1[][] r3 = new defpackage.ax1[r1][]
            r4 = 0
            r6 = r2
            r7 = r6
            r5 = r4
        Le:
            if (r5 >= r1) goto L72
            r8 = r23[r5]
            r9 = 3
            r10 = 2
            if (r8 == 0) goto L2d
            if (r8 == r2) goto L2b
            if (r8 == r10) goto L29
            if (r8 == r9) goto L24
            r9 = 4
            if (r8 == r9) goto L2d
            r9 = 5
            if (r8 == r9) goto L2d
            r12 = r7
            goto L2e
        L24:
            if (r6 != r2) goto L2b
            goto L29
        L27:
            r12 = r6
            goto L2e
        L29:
            r6 = r10
            goto L27
        L2b:
            r6 = r2
            goto L27
        L2d:
            r12 = r9
        L2e:
            r7 = r25[r5]
            int r8 = r5 + 1
            r9 = r25[r8]
            r13 = r0[r5]
            r14 = r0[r8]
            int r11 = r7.length
            int r11 = r11 / r10
            int r15 = r7.length
            int r15 = r15 % r10
            int r10 = r15 + r11
            ax1[] r11 = new defpackage.ax1[r10]
            r15 = r4
        L41:
            if (r15 >= r10) goto L6b
            int r16 = r15 << 1
            r17 = r11
            ax1 r11 = new ax1
            r18 = r15
            r15 = r7[r16]
            int r19 = r16 + 1
            r20 = r16
            r16 = r7[r19]
            r20 = r9[r20]
            r19 = r9[r19]
            r21 = r19
            r19 = r17
            r17 = r20
            r20 = r18
            r18 = r21
            r11.<init>(r12, r13, r14, r15, r16, r17, r18)
            r19[r20] = r11
            int r15 = r20 + 1
            r11 = r19
            goto L41
        L6b:
            r19 = r11
            r3[r5] = r19
            r5 = r8
            r7 = r12
            goto Le
        L72:
            r5 = r22
            r5.a = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zy9.<init>(int[], float[], float[][]):void");
    }

    public static zy9 J(uio uioVar) {
        zch.d(uioVar, "AdSession is null");
        if (uioVar.e.c != null) {
            qp2.n("AdEvents already exists for AdSession");
            return null;
        }
        zch.g(uioVar);
        zy9 zy9Var = new zy9(uioVar);
        uioVar.e.c = zy9Var;
        return zy9Var;
    }

    public static zy9 K(Context context) {
        zy9 zy9Var;
        synchronized (c) {
            if (d == null) {
                Context applicationContext = context.getApplicationContext();
                zy9 zy9Var2 = new zy9();
                k5o k5oVar = new k5o((byte) 22, false);
                k5oVar.b = applicationContext;
                k5oVar.c = applicationContext.getContentResolver();
                zy9Var2.a = k5oVar;
                d = zy9Var2;
            }
            zy9Var = d;
        }
        return zy9Var;
    }

    public final void E(CheckBox checkBox) {
        ((ly4) this.a).G0();
    }

    public final void F(Bitmap bitmap) {
        ((AddToHomescreenDataFetcherNative) this.a).d(bitmap);
    }

    @Override // defpackage.ec2
    public final yb6 G(AssetManager assetManager, String str) {
        return new e19(assetManager, str, (byte) 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean H(dl r4, mq r5, yz r6, boolean r7) {
        /*
            r3 = this;
            boolean r0 = r5.j()
            yz r1 = r5.d
            if (r0 != 0) goto L8d
            r0 = 1
            boolean r7 = r5.g(r0, r7)
            if (r7 != 0) goto L8c
            lq r7 = lq.b
            lq r2 = lq.c
            lq[] r7 = new lq[]{r7, r2}
            boolean r5 = r5.i(r7)
            if (r5 != 0) goto L8d
            if (r1 == 0) goto L8c
            java.lang.String r4 = r4.c
            boolean r5 = r1.r(r4)
            if (r5 == 0) goto L2d
            boolean r5 = r6.r(r4)
            if (r5 == 0) goto L8d
        L2d:
            boolean r5 = r1.r(r4)
            if (r5 != 0) goto L39
            boolean r4 = r6.r(r4)
            if (r4 != 0) goto L8c
        L39:
            java.lang.Object r3 = r3.a
            java.util.WeakHashMap r3 = (java.util.WeakHashMap) r3
            boolean r4 = r3.containsKey(r6)
            if (r4 == 0) goto L81
            java.lang.Object r4 = r3.get(r6)
            lyf r4 = (defpackage.lyf) r4
            java.lang.Object r3 = r3.get(r1)
            lyf r3 = (defpackage.lyf) r3
            if (r4 == 0) goto L81
            if (r3 == 0) goto L81
            java.lang.Object r5 = r4.a
            java.lang.ref.WeakReference r5 = (java.lang.ref.WeakReference) r5
            java.lang.Object r5 = r5.get()
            if (r5 == 0) goto L81
            java.lang.Object r5 = r4.a
            java.lang.ref.WeakReference r5 = (java.lang.ref.WeakReference) r5
            java.lang.Object r5 = r5.get()
            java.lang.Object r7 = r3.a
            java.lang.ref.WeakReference r7 = (java.lang.ref.WeakReference) r7
            java.lang.Object r7 = r7.get()
            if (r5 != r7) goto L81
            java.lang.Object r3 = r3.b
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            java.lang.Object r4 = r4.b
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
        L7f:
            int r3 = r3 - r4
            goto L8a
        L81:
            ap r3 = r6.r
            int r3 = r3.a
            ap r4 = r1.r
            int r4 = r4.a
            goto L7f
        L8a:
            if (r3 <= 0) goto L8d
        L8c:
            return r0
        L8d:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zy9.H(dl, mq, yz, boolean):boolean");
    }

    public final void I() {
        Iterator it = ((WeakHashMap) this.a).entrySet().iterator();
        while (it.hasNext()) {
            if (((WeakReference) ((lyf) ((Map.Entry) it.next()).getValue()).a).get() == null) {
                it.remove();
            }
        }
    }

    public final void L() {
        uio uioVar = (uio) this.a;
        zch.g(uioVar);
        zch.j(uioVar);
        if (!uioVar.f || uioVar.g) {
            try {
                uioVar.e();
            } catch (Exception unused) {
            }
        }
        if (!uioVar.f || uioVar.g) {
            return;
        }
        if (uioVar.i) {
            qp2.n("Impression event can only be sent once");
            return;
        }
        yp ypVar = uioVar.e;
        qii.p.m(ypVar.g(), "publishImpressionEvent", ypVar.a);
        uioVar.i = true;
    }

    public final boolean M(bqd bqdVar) {
        int i;
        k5o k5oVar = (k5o) this.a;
        dqd dqdVar = bqdVar.a;
        Context context = (Context) k5oVar.b;
        int i2 = dqdVar.b;
        String str = dqdVar.a;
        if (context.checkPermission("android.permission.MEDIA_CONTENT_CONTROL", i2, dqdVar.c) == 0) {
            return true;
        }
        try {
            if (context.getPackageManager().getApplicationInfo(str, 0) != null) {
                if (k5oVar.n(dqdVar, "android.permission.STATUS_BAR_SERVICE") || k5oVar.n(dqdVar, "android.permission.MEDIA_CONTENT_CONTROL") || (i = dqdVar.c) == 1000 || i == Process.myUid()) {
                    return true;
                }
                String string = Settings.Secure.getString((ContentResolver) k5oVar.c, "enabled_notification_listeners");
                if (string != null) {
                    for (String str2 : string.split(":")) {
                        ComponentName componentNameUnflattenFromString = ComponentName.unflattenFromString(str2);
                        if (componentNameUnflattenFromString != null && componentNameUnflattenFromString.getPackageName().equals(str)) {
                            return true;
                        }
                    }
                }
            }
            return false;
        } catch (PackageManager.NameNotFoundException unused) {
            w7d.m("Package " + str + " doesn't exist");
            return false;
        }
    }

    public final void N() {
        long j;
        fb6 fb6Var = (fb6) this.a;
        synchronized (z5i.t) {
            j = z5i.u ? z5i.v : -9223372036854775807L;
        }
        fb6Var.K = j;
        fb6Var.y(true);
    }

    public final void Y() {
        lj2 lj2Var = (lj2) this.a;
        lj2Var.d(1);
        lj2Var.a();
    }

    @Override // defpackage.skh
    public final tj5 a() {
        return (tj5) this.a;
    }

    public final void c0() {
        lj2 lj2Var = (lj2) this.a;
        lj2Var.d(3);
        lj2Var.h = lj2Var.g > 0;
    }

    public final void f(boolean z) {
        ((AddToHomescreenDataFetcherNative) this.a).d((Bitmap) null);
    }

    public final void k() {
        iw4 iw4Var = (iw4) this.a;
        Handler handler = iw4Var.b;
        if (handler.getLooper() == Looper.myLooper()) {
            iw4Var.f();
        } else {
            handler.post(new lb4(this, (byte) 9));
        }
    }

    public final void l(ru2 ru2Var) {
        g7f g7fVar = new g7f(((rq2) this.a).f);
        while (g7fVar.hasNext()) {
            pu2 pu2Var = (pu2) g7fVar.next();
            int i = ru2Var.a;
            long j = pu2Var.a.a;
            if (j != 0) {
                N.MzF9Ta1m(j, i);
            }
        }
    }

    @Override // defpackage.bcf
    public final g3o l0(View view, g3o g3oVar) {
        d3o d3oVar = g3oVar.a;
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.a;
        if (!Objects.equals(coordinatorLayout.n, g3oVar)) {
            coordinatorLayout.n = g3oVar;
            boolean z = g3oVar.d() > 0;
            coordinatorLayout.o = z;
            coordinatorLayout.setWillNotDraw(!z && coordinatorLayout.getBackground() == null);
            if (!d3oVar.s()) {
                int childCount = coordinatorLayout.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = coordinatorLayout.getChildAt(i);
                    WeakHashMap weakHashMap = r5n.a;
                    if (childAt.getFitsSystemWindows() && ((qv5) childAt.getLayoutParams()).a != null && d3oVar.s()) {
                        break;
                    }
                }
            }
            coordinatorLayout.requestLayout();
        }
        return g3oVar;
    }

    public final void q(IBinder iBinder) {
        iw4 iw4Var = (iw4) this.a;
        Handler handler = iw4Var.b;
        if (handler.getLooper() == Looper.myLooper()) {
            iw4Var.e(iBinder);
        } else {
            handler.post(new fh4((Object) this, (Object) iBinder, (byte) 5));
        }
    }

    @Override // defpackage.htd
    public final void s(itd itdVar) {
        htd htdVar = ((qe) this.a).v;
        if (htdVar != null) {
            htdVar.s(itdVar);
        }
    }

    @Override // defpackage.w7e
    public final v7e w(d5o d5oVar) {
        return new fc2((AssetManager) this.a, this, (byte) 0);
    }

    @Override // defpackage.htd
    public final boolean x(itd itdVar, MenuItem menuItem) {
        boolean zOnMenuItemClick;
        rii riiVar = ((qe) this.a).A;
        if (riiVar != null) {
            Toolbar toolbar = (Toolbar) riiVar.b;
            Iterator it = toolbar.F.b.iterator();
            while (true) {
                if (!it.hasNext()) {
                    ssl sslVar = toolbar.H;
                    zOnMenuItemClick = sslVar != null ? sslVar.onMenuItemClick(menuItem) : false;
                } else if (((mud) it.next()).c(menuItem)) {
                    zOnMenuItemClick = true;
                    break;
                }
            }
            if (zOnMenuItemClick) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.lw1
    public final Object y(opi opiVar, Float f, Float f2, itj itjVar, ltj ltjVar) {
        Object objH = xvg.h(opiVar, f.floatValue(), cs5.a(28, 0.0f, f2.floatValue()), (wi6) this.a, itjVar, ltjVar);
        return objH == px5.a ? objH : (te1) objH;
    }

    @Override // defpackage.zqb
    public final void z(orb orbVar) {
        ((ilm) this.a).run(orbVar.a.toString());
    }
}
