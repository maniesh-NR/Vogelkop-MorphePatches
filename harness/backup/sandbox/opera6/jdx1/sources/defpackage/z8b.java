package defpackage;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.ContextWrapper;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.RemoteException;
import android.os.SystemClock;
import android.print.PrintDocumentAdapter;
import android.print.PrintJob;
import android.print.PrintManager;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.support.v4.media.session.a;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.r;
import androidx.fragment.app.w;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.text.StringsKt;

/* loaded from: classes.dex */
public final class z8b implements hpf, re, rr9, y7, v1g, f94, rtj, iyg {
    public static final ixh c = new ixh(8.0f);
    public static final ixh d = new ixh(4.0f);
    public Object a;
    public Object b;

    public z8b(byte b) {
        switch (b) {
            case 22:
                this.a = new c9((byte) 23);
                this.b = new jk(this, (byte) 4);
                break;
            case 25:
                v8k v8kVar = v8k.a;
                q8l q8lVar = q8l.c;
                w6k w6kVar = w6k.a;
                this.a = new pde(new f8k(false, false, w6kVar, w6kVar, w6kVar, v8kVar, (rmn) null, (eyh) null, 0, q8lVar));
                this.b = new pde(new f8k(false, false, w6kVar, w6kVar, w6kVar, v8kVar, (rmn) null, (eyh) null, 0, q8lVar));
                break;
            case 27:
                this.a = new Object();
                break;
            default:
                this.a = new HashMap();
                this.b = h75.b;
                break;
        }
    }

    public z8b(Activity activity) {
        this.a = activity;
        this.b = (PrintManager) activity.getSystemService("print");
    }

    public z8b(Context context, MediaSessionCompat$Token mediaSessionCompat$Token) {
        if (mediaSessionCompat$Token == null) {
            qp2.o("sessionToken must not be null");
            throw null;
        }
        this.b = Collections.synchronizedSet(new HashSet());
        this.a = new a(context, mediaSessionCompat$Token);
    }

    public z8b(View view) {
        this.a = view;
        this.b = z4c.a(f7c.c, new q4b(this, (byte) 3));
    }

    public z8b(cl6 cl6Var) {
        this.a = cl6Var;
        this.b = new AtomicBoolean(false);
    }

    public /* synthetic */ z8b(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public /* synthetic */ z8b(Object obj, Object obj2, boolean z) {
        this.b = obj;
        this.a = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003a A[Catch: IOException -> 0x006d, TryCatch #0 {IOException -> 0x006d, blocks: (B:2:0x0000, B:3:0x000a, B:5:0x000d, B:7:0x001e, B:9:0x0026, B:21:0x0042, B:19:0x003a, B:20:0x003d, B:23:0x0047, B:24:0x004a, B:25:0x005b), top: B:30:0x0000 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.z8b G(java.lang.String... r12) {
        /*
            int r0 = r12.length     // Catch: java.io.IOException -> L6d
            g54[] r0 = new g54[r0]     // Catch: java.io.IOException -> L6d
            d04 r1 = new d04     // Catch: java.io.IOException -> L6d
            r1.<init>()     // Catch: java.io.IOException -> L6d
            r2 = 0
            r3 = r2
        La:
            int r4 = r12.length     // Catch: java.io.IOException -> L6d
            if (r3 >= r4) goto L5b
            r4 = r12[r3]     // Catch: java.io.IOException -> L6d
            java.lang.String[] r5 = defpackage.esb.e     // Catch: java.io.IOException -> L6d
            r6 = 34
            r1.P(r6)     // Catch: java.io.IOException -> L6d
            int r7 = r4.length()     // Catch: java.io.IOException -> L6d
            r8 = r2
            r9 = r8
        L1c:
            if (r8 >= r7) goto L45
            char r10 = r4.charAt(r8)     // Catch: java.io.IOException -> L6d
            r11 = 128(0x80, float:1.8E-43)
            if (r10 >= r11) goto L2b
            r10 = r5[r10]     // Catch: java.io.IOException -> L6d
            if (r10 != 0) goto L38
            goto L42
        L2b:
            r11 = 8232(0x2028, float:1.1535E-41)
            if (r10 != r11) goto L32
            java.lang.String r10 = "\\u2028"
            goto L38
        L32:
            r11 = 8233(0x2029, float:1.1537E-41)
            if (r10 != r11) goto L42
            java.lang.String r10 = "\\u2029"
        L38:
            if (r9 >= r8) goto L3d
            r1.b0(r9, r8, r4)     // Catch: java.io.IOException -> L6d
        L3d:
            r1.d0(r10)     // Catch: java.io.IOException -> L6d
            int r9 = r8 + 1
        L42:
            int r8 = r8 + 1
            goto L1c
        L45:
            if (r9 >= r7) goto L4a
            r1.b0(r9, r7, r4)     // Catch: java.io.IOException -> L6d
        L4a:
            r1.P(r6)     // Catch: java.io.IOException -> L6d
            r1.readByte()     // Catch: java.io.IOException -> L6d
            long r4 = r1.b     // Catch: java.io.IOException -> L6d
            g54 r4 = r1.D0(r4)     // Catch: java.io.IOException -> L6d
            r0[r3] = r4     // Catch: java.io.IOException -> L6d
            int r3 = r3 + 1
            goto La
        L5b:
            z8b r1 = new z8b     // Catch: java.io.IOException -> L6d
            java.lang.Object r12 = r12.clone()     // Catch: java.io.IOException -> L6d
            java.lang.String[] r12 = (java.lang.String[]) r12     // Catch: java.io.IOException -> L6d
            int r2 = urf.d     // Catch: java.io.IOException -> L6d
            urf r0 = c09.w(r0)     // Catch: java.io.IOException -> L6d
            r1.<init>(r12, r0)     // Catch: java.io.IOException -> L6d
            return r1
        L6d:
            r12 = move-exception
            qp2.g(r12)
            r12 = 0
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z8b.G(java.lang.String[]):z8b");
    }

    public static h75 c(h75 h75Var, List list) {
        h75Var.getClass();
        Map map = h75Var.a;
        HashMap map2 = new HashMap(map);
        HashSet hashSet = new HashSet(list);
        for (String str : map.keySet()) {
            if (!hashSet.contains(str)) {
                map2.remove(str);
            }
        }
        return new h75(map2);
    }

    public final void A(Fragment fragment, View view, Bundle bundle, boolean z) {
        Fragment fragment2 = ((w) this.a).z;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().p.A(fragment, view, bundle, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.b).iterator();
        while (it.hasNext()) {
            rl9 rl9Var = (rl9) it.next();
            if (!z || rl9Var.b) {
                rl9Var.a.P(fragment);
            }
        }
    }

    public final void B(Fragment fragment, boolean z) {
        Fragment fragment2 = ((w) this.a).z;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().p.B(fragment, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.b).iterator();
        while (it.hasNext()) {
            rl9 rl9Var = (rl9) it.next();
            if (!z || rl9Var.b) {
                rl9Var.a.Q();
            }
        }
    }

    public final cn8 C(Object... objArr) {
        Constructor constructorA;
        synchronized (((AtomicBoolean) this.b)) {
            if (!((AtomicBoolean) this.b).get()) {
                try {
                    try {
                        constructorA = ((cl6) this.a).a();
                    } catch (Exception e) {
                        throw new RuntimeException("Error instantiating extension", e);
                    }
                } catch (ClassNotFoundException unused) {
                    ((AtomicBoolean) this.b).set(true);
                }
            }
            constructorA = null;
        }
        if (constructorA == null) {
            return null;
        }
        try {
            return (cn8) constructorA.newInstance(objArr);
        } catch (Exception e2) {
            h9o.m("Unexpected error creating extractor", e2);
            return null;
        }
    }

    public final InputMethodManager D() {
        return (InputMethodManager) ((l4c) this.b).getValue();
    }

    public final cp7 E(ContextWrapper contextWrapper) {
        cp7 cp7Var = (cp7) this.b;
        if (cp7Var != null) {
            return cp7Var;
        }
        qsh qshVarQ = w8h.q(contextWrapper, contextWrapper.getString(2132019796), "com.opera.android.live_score.LivescoreDynamicFeatureInstanceImpl", new Object[0]);
        cp7 cp7Var2 = qshVarQ != null ? (cp7) qshVarQ.c : null;
        if (cp7Var2 != null) {
            this.b = cp7Var2;
            return cp7Var2;
        }
        ua7 ua7Var = (ua7) this.a;
        if (ua7Var == null) {
            ua7Var = new ua7(contextWrapper);
            this.a = ua7Var;
        }
        zo7 zo7Var = (zo7) ua7Var.d;
        this.b = zo7Var;
        return zo7Var;
    }

    public final void F() {
        hf0 hf0Var;
        hf0 hf0Var2;
        qb7 qb7Var = (qb7) this.b;
        if (qb7Var != null) {
            x5f x5fVar = (orm) this.a;
            f90 f90Var = (f90) qb7Var.b;
            d90[] d90VarArr = (d90[]) ((ArrayList) qb7Var.a).toArray(new d90[0]);
            li0[] li0VarArr = (li0[]) ((ArrayList) qb7Var.c).toArray(new li0[0]);
            x5f x5fVar2 = x5fVar;
            if (x5fVar2.h) {
                zpa zpaVar = x5fVar2.d;
                x56 x56VarF = zpa.F();
                qd0 qd0VarB = x56VarF.B(zpaVar);
                int i = 2443;
                g90 g90Var = new g90(2443, -1, 3);
                g90Var.q(0, 1, f90Var);
                List list = (List) g90Var.n(1);
                if (list == null || list.isEmpty()) {
                    ArrayList arrayList = new ArrayList();
                    g90Var.q(1, 1, arrayList);
                    hf0Var = new hf0(g90Var, 1, arrayList);
                } else {
                    hf0Var = new hf0(g90Var, 1, list);
                }
                int length = d90VarArr.length;
                int i2 = 0;
                while (i2 < length) {
                    d90 d90Var = d90VarArr[i2];
                    e90 e90Var = new e90(i, -1, 1);
                    e90Var.q(0, d90Var == null ? 0 : 1, d90Var);
                    hf0Var.add(e90Var);
                    i2++;
                    i = 2443;
                }
                List list2 = (List) g90Var.n(2);
                if (list2 == null || list2.isEmpty()) {
                    ArrayList arrayList2 = new ArrayList();
                    g90Var.q(2, 1, arrayList2);
                    hf0Var2 = new hf0(g90Var, 2, arrayList2);
                } else {
                    hf0Var2 = new hf0(g90Var, 2, list2);
                }
                int length2 = li0VarArr.length;
                for (int i3 = 0; i3 < length2; i3++) {
                    li0 li0Var = li0VarArr[i3];
                    mi0 mi0Var = new mi0(2443, -1, 1);
                    mi0Var.q(0, li0Var == null ? 0 : 1, li0Var);
                    hf0Var2.add(mi0Var);
                }
                List list3 = (List) qd0VarB.n(54);
                ((list3 == null || list3.isEmpty()) ? new hf0(qd0VarB, 54, vep.t(qd0VarB, 54, 1)) : new hf0(qd0VarB, 54, list3)).add(g90Var);
                x5fVar2.U0(x56VarF);
            }
        }
        this.b = null;
    }

    public final void H(h75 h75Var) {
        for (Map.Entry entry : new HashMap((HashMap) this.a).entrySet()) {
            if (entry.getKey() != null) {
                h9o.t();
                return;
            } else {
                List list = (List) entry.getValue();
                if (!c(h75Var, list).equals(c((h75) this.b, list))) {
                    throw null;
                }
            }
        }
        this.b = h75Var;
    }

    public final void I(fpf fpfVar) {
        db dbVar = (db) this.b;
        byte b = fpfVar.f;
        r rVar = (r) this.a;
        if (b == 1) {
            xih.w(rVar.getSupportFragmentManager(), dbVar, (fv2) null, true);
        } else {
            xih.v(rVar.getSupportFragmentManager(), dbVar, (String) null, (mni) null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object J(android.net.Uri r6, nt5 r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.mza
            if (r0 == 0) goto L13
            r0 = r7
            mza r0 = (defpackage.mza) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L18
        L13:
            mza r0 = new mza
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.t
            px5 r1 = px5.a
            int r2 = r0.v
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L2e
            if (r2 != r3) goto L28
            defpackage.ybh.y(r7)
            goto L49
        L28:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r5)
            return r4
        L2e:
            defpackage.ybh.y(r7)
            java.lang.Object r5 = r5.b
            qie r5 = (qie) r5
            r5.getClass()
            deg r5 = yne.b
            java.util.ArrayList r7 = quk.a
            dwh r6 = r5.g(r6)
            r0.v = r3
            java.lang.Object r7 = quk.a(r6, r5, r0)
            if (r7 != r1) goto L49
            return r1
        L49:
            android.graphics.Bitmap r7 = (android.graphics.Bitmap) r7
            if (r7 != 0) goto L4e
            return r4
        L4e:
            android.graphics.Point r5 = new android.graphics.Point
            int r6 = r7.getWidth()
            int r7 = r7.getHeight()
            r5.<init>(r6, r7)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z8b.J(android.net.Uri, nt5):java.lang.Object");
    }

    public final long K() {
        uk6 uk6Var = (uk6) this.a;
        return ((f28) uk6Var.b).j(SystemClock.elapsedRealtimeNanos() / 1000);
    }

    public final void L(wmd wmdVar) {
        if (wmdVar == null) {
            qp2.o("callback must not be null");
            return;
        }
        if (((Set) this.b).add(wmdVar)) {
            Handler handler = new Handler();
            wmdVar.f(handler);
            a aVar = (a) this.a;
            aVar.a.registerCallback(wmdVar.a, handler);
            synchronized (aVar.b) {
                if (aVar.e.a() != null) {
                    jhd jhdVar = new jhd(wmdVar);
                    aVar.d.put(wmdVar, jhdVar);
                    wmdVar.c = jhdVar;
                    try {
                        aVar.e.a().D0(jhdVar);
                        wmdVar.e(13, null, null);
                    } catch (RemoteException unused) {
                    }
                } else {
                    wmdVar.c = null;
                    aVar.c.add(wmdVar);
                }
            }
        }
    }

    public final void M(li0 li0Var) {
        qb7 qb7Var = (qb7) this.b;
        if (qb7Var != null) {
            ((ArrayList) qb7Var.c).add(li0Var);
        }
    }

    public final void N(wmd wmdVar) {
        if (wmdVar == null) {
            qp2.o("callback must not be null");
        } else if (((Set) this.b).remove(wmdVar)) {
            try {
                ((a) this.a).b(wmdVar);
            } finally {
                wmdVar.f(null);
            }
        }
    }

    public final long O() {
        uk6 uk6Var = (uk6) this.a;
        return ((f28) uk6Var.b).j(System.nanoTime() / 1000);
    }

    @Override // defpackage.rtj
    public final float a(float f) {
        gu6 gu6Var = (gu6) this.a;
        n9a n9aVar = gu6Var.m().n;
        List list = gu6Var.m().a;
        int size = list.size();
        float f2 = Float.NEGATIVE_INFINITY;
        float f3 = Float.POSITIVE_INFINITY;
        for (int i = 0; i < size; i++) {
            wfd wfdVar = (wfd) list.get(i);
            k1g.B(gu6Var.m());
            int i2 = gu6Var.m().f;
            int i3 = gu6Var.m().d;
            int i4 = gu6Var.m().b;
            int i5 = wfdVar.j;
            gu6Var.n();
            n9aVar.getClass();
            float f4 = i5 - 0.0f;
            if (f4 <= 0.0f && f4 > f2) {
                f2 = f4;
            }
            if (f4 >= 0.0f && f4 < f3) {
                f3 = f4;
            }
        }
        if (f2 == Float.NEGATIVE_INFINITY) {
            f2 = f3;
        }
        if (f3 == Float.POSITIVE_INFINITY) {
            f3 = f2;
        }
        if (!gu6Var.d()) {
            if (wyh.H(gu6Var, f)) {
                f2 = 0.0f;
                f3 = 0.0f;
            } else {
                f3 = 0.0f;
            }
        }
        if (!gu6Var.c()) {
            f2 = 0.0f;
            if (!wyh.H(gu6Var, f)) {
                f3 = 0.0f;
            }
        }
        Float fValueOf = Float.valueOf(f2);
        Float fValueOf2 = Float.valueOf(f3);
        float fFloatValue = fValueOf.floatValue();
        float fFloatValue2 = fValueOf2.floatValue();
        float fFloatValue3 = ((Number) ((b57) this.b).invoke(Float.valueOf(f), Float.valueOf(fFloatValue), Float.valueOf(fFloatValue2))).floatValue();
        if (fFloatValue3 != fFloatValue && fFloatValue3 != fFloatValue2 && fFloatValue3 != 0.0f) {
            d8b.c("Final Snapping Offset Should Be one of " + fFloatValue + ", " + fFloatValue2 + " or 0.0");
        }
        if (fFloatValue3 == Float.POSITIVE_INFINITY || fFloatValue3 == Float.NEGATIVE_INFINITY) {
            return 0.0f;
        }
        return fFloatValue3;
    }

    @Override // defpackage.rtj
    public final float b(float f, float f2) {
        gu6 gu6Var = (gu6) this.a;
        int iO = gu6Var.o();
        t0g t0gVar = gu6Var.m;
        int i = ((jxf) t0gVar.getValue()).c + iO;
        if (i == 0) {
            return 0.0f;
        }
        int i2 = gu6Var.e;
        if (f < 0.0f) {
            i2++;
        }
        int iC = djh.c(((int) (f2 / i)) + i2, 0, gu6Var.n());
        gu6Var.o();
        int i3 = ((jxf) t0gVar.getValue()).c;
        long j = i2;
        long j2 = j - 1;
        if (j2 < 0) {
            j2 = 0;
        }
        int i4 = (int) j2;
        long j3 = j + 1;
        if (j3 > 2147483647L) {
            j3 = 2147483647L;
        }
        int iAbs = Math.abs((djh.c(djh.c(iC, i4, (int) j3), 0, gu6Var.n()) - i2) * i) - i;
        int i5 = iAbs >= 0 ? iAbs : 0;
        float f3 = i5;
        return i5 == 0 ? f3 : Math.signum(f) * f3;
    }

    public final void d(boolean z) {
        Fragment fragment = ((w) this.a).z;
        if (fragment != null) {
            fragment.getParentFragmentManager().p.d(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.b).iterator();
        while (it.hasNext()) {
            rl9 rl9Var = (rl9) it.next();
            if (!z || rl9Var.b) {
                x1p x1pVar = rl9Var.a;
            }
        }
    }

    @Override // defpackage.v1g
    public final Object e(Uri uri, ld6 ld6Var) {
        t39 t39Var = (t39) ((v1g) this.a).e(uri, ld6Var);
        List list = (List) this.b;
        return (list == null || list.isEmpty()) ? t39Var : (t39) t39Var.copy(list);
    }

    public final boolean f(String str, PrintDocumentAdapter printDocumentAdapter) {
        String str2;
        PrintManager printManager = (PrintManager) this.b;
        Activity activity = (Activity) this.a;
        if (!activity.isFinishing() && !activity.isDestroyed()) {
            List<PrintJob> printJobs = printManager.getPrintJobs();
            String[] strArr = new String[printJobs.size()];
            for (int i = 0; i < printJobs.size(); i++) {
                switch (printJobs.get(i).getInfo().getState()) {
                    case 1:
                        str2 = "STATE_CREATED";
                        break;
                    case 2:
                        str2 = "STATE_QUEUED";
                        break;
                    case 3:
                        str2 = "STATE_STARTED";
                        break;
                    case 4:
                        str2 = "STATE_BLOCKED";
                        break;
                    case 5:
                        str2 = "STATE_COMPLETED";
                        break;
                    case 6:
                        str2 = "STATE_FAILED";
                        break;
                    case 7:
                        str2 = "STATE_CANCELED";
                        break;
                    default:
                        str2 = "STATE_UNKNOWN";
                        break;
                }
                strArr[i] = str2;
            }
            wxe.d0("Initiating new print with states in queue: {%s}", TextUtils.join(", ", strArr));
            try {
                printManager.print(str, printDocumentAdapter, null);
                return true;
            } catch (ActivityNotFoundException | IllegalStateException unused) {
            }
        }
        return false;
    }

    public final void g(Fragment fragment, boolean z) {
        w wVar = (w) this.a;
        r rVar = wVar.x.b;
        Fragment fragment2 = wVar.z;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().p.g(fragment, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.b).iterator();
        while (it.hasNext()) {
            rl9 rl9Var = (rl9) it.next();
            if (!z || rl9Var.b) {
                rl9Var.a.J(fragment);
            }
        }
    }

    public final void h(cpf cpfVar) {
        new zhj(new wzg((Object) null, c49.class, (byte) 4), (Bundle) null, 2, 4099, (String) null, false, Arrays.asList(new n6h[0])).c((r) this.a);
    }

    public final void i(boolean z) {
        Fragment fragment = ((w) this.a).z;
        if (fragment != null) {
            fragment.getParentFragmentManager().p.i(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.b).iterator();
        while (it.hasNext()) {
            rl9 rl9Var = (rl9) it.next();
            if (!z || rl9Var.b) {
                x1p x1pVar = rl9Var.a;
            }
        }
    }

    public final void j(Fragment fragment, boolean z) {
        Fragment fragment2 = ((w) this.a).z;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().p.j(fragment, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.b).iterator();
        while (it.hasNext()) {
            rl9 rl9Var = (rl9) it.next();
            if (!z || rl9Var.b) {
                rl9Var.a.K(fragment);
            }
        }
    }

    @Override // defpackage.re
    public final boolean k(se seVar, MenuItem menuItem) {
        return ((re) this.a).k(seVar, menuItem);
    }

    public final void l() {
        ((y7) this.a).l();
        ((vr9) this.b).run();
    }

    public final void m(Fragment fragment, boolean z) {
        Fragment fragment2 = ((w) this.a).z;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().p.m(fragment, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.b).iterator();
        while (it.hasNext()) {
            rl9 rl9Var = (rl9) it.next();
            if (!z || rl9Var.b) {
                rl9Var.a.M();
            }
        }
    }

    public final void n(epf epfVar) {
    }

    public final void o(boolean z) {
        Fragment fragment = ((w) this.a).z;
        if (fragment != null) {
            fragment.getParentFragmentManager().p.o(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.b).iterator();
        while (it.hasNext()) {
            rl9 rl9Var = (rl9) it.next();
            if (!z || rl9Var.b) {
                x1p x1pVar = rl9Var.a;
            }
        }
    }

    public final void onFailure(Throwable th) {
        xug.i();
        s1h s1hVar = (s1h) this.a;
        igi igiVar = (igi) this.b;
        s1h s1hVar2 = (s1h) igiVar.b;
        if (s1hVar == s1hVar2) {
            int i = s1hVar2.a;
            s6h s6hVar = (s6h) igiVar.g;
            if (s6hVar != null) {
                s6hVar.b = null;
            }
            igiVar.b = null;
        }
    }

    public final void onFailure(v84 v84Var, IOException iOException) {
        Object obj;
        nh4 nh4Var = (nh4) this.b;
        if (nh4Var.r() instanceof qh4) {
            return;
        }
        p0i p0iVar = t0i.b;
        ami amiVar = (ami) this.a;
        if (iOException instanceof ofk) {
            Throwable cause = iOException.getCause();
            if (cause != null) {
                iOException = cause;
            }
        } else if (iOException instanceof SocketTimeoutException) {
            String message = iOException.getMessage();
            if (message == null || !StringsKt.E(message, "connect", true)) {
                iOException = dra.a(amiVar, iOException);
            } else {
                int i = dra.a;
                StringBuilder sb = new StringBuilder("Connect timeout has expired [url=");
                sb.append((gpm) amiVar.b);
                sb.append(", connect_timeout=");
                Map map = (Map) ((pj5) amiVar.g).e(boa.a);
                bra braVar = (bra) (map != null ? map.get(ara.a) : null);
                if (braVar == null || (obj = braVar.b) == null) {
                    obj = "unknown";
                }
                iOException = new sl5(am2.o(sb, obj, " ms]"), iOException);
            }
        }
        nh4Var.resumeWith(new q0i(iOException));
    }

    public final void onResponse(v84 v84Var, pzh pzhVar) {
        if (v84Var.isCanceled()) {
            return;
        }
        nh4 nh4Var = (nh4) this.b;
        p0i p0iVar = t0i.b;
        nh4Var.resumeWith(pzhVar);
    }

    public final void onSuccess(Object obj) {
    }

    @Override // defpackage.re
    public final void p(se seVar) {
        ((re) this.a).p(seVar);
        xp1 xp1Var = (xp1) this.b;
        if (xp1Var.w != null) {
            xp1Var.l.getDecorView().removeCallbacks(xp1Var.x);
        }
        if (xp1Var.v != null) {
            l8n l8nVar = xp1Var.y;
            if (l8nVar != null) {
                l8nVar.b();
            }
            l8n l8nVarB = r5n.b(xp1Var.v);
            l8nVarB.a(0.0f);
            xp1Var.y = l8nVarB;
            l8nVarB.d(new rp1(this, (byte) 2));
        }
        xp1Var.n.onSupportActionModeFinished(xp1Var.u);
        xp1Var.u = null;
        ViewGroup viewGroup = xp1Var.A;
        WeakHashMap weakHashMap = r5n.a;
        viewGroup.requestApplyInsets();
        xp1Var.J();
    }

    @Override // defpackage.re
    public final boolean q(se seVar, itd itdVar) {
        return ((re) this.a).q(seVar, itdVar);
    }

    public final void r(gpf gpfVar) {
        xih.u(((r) this.a).getSupportFragmentManager());
    }

    public final void s(Fragment fragment, boolean z) {
        w wVar = (w) this.a;
        r rVar = wVar.x.b;
        Fragment fragment2 = wVar.z;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().p.s(fragment, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.b).iterator();
        while (it.hasNext()) {
            rl9 rl9Var = (rl9) it.next();
            if (!z || rl9Var.b) {
                rl9Var.a.N(fragment);
            }
        }
    }

    public final void t(boolean z) {
        Fragment fragment = ((w) this.a).z;
        if (fragment != null) {
            fragment.getParentFragmentManager().p.t(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.b).iterator();
        while (it.hasNext()) {
            rl9 rl9Var = (rl9) it.next();
            if (!z || rl9Var.b) {
                x1p x1pVar = rl9Var.a;
            }
        }
    }

    public final void u(Fragment fragment, boolean z) {
        Fragment fragment2 = ((w) this.a).z;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().p.u(fragment, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.b).iterator();
        while (it.hasNext()) {
            rl9 rl9Var = (rl9) it.next();
            if (!z || rl9Var.b) {
                rl9Var.a.O();
            }
        }
    }

    @Override // defpackage.re
    public final boolean v(se seVar, itd itdVar) {
        ViewGroup viewGroup = ((xp1) this.b).A;
        WeakHashMap weakHashMap = r5n.a;
        viewGroup.requestApplyInsets();
        return ((re) this.a).v(seVar, itdVar);
    }

    public final void w(boolean z) {
        Fragment fragment = ((w) this.a).z;
        if (fragment != null) {
            fragment.getParentFragmentManager().p.w(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.b).iterator();
        while (it.hasNext()) {
            rl9 rl9Var = (rl9) it.next();
            if (!z || rl9Var.b) {
                x1p x1pVar = rl9Var.a;
            }
        }
    }

    public final void x(boolean z) {
        Fragment fragment = ((w) this.a).z;
        if (fragment != null) {
            fragment.getParentFragmentManager().p.x(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.b).iterator();
        while (it.hasNext()) {
            rl9 rl9Var = (rl9) it.next();
            if (!z || rl9Var.b) {
                x1p x1pVar = rl9Var.a;
            }
        }
    }

    public final void y(boolean z) {
        Fragment fragment = ((w) this.a).z;
        if (fragment != null) {
            fragment.getParentFragmentManager().p.y(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.b).iterator();
        while (it.hasNext()) {
            rl9 rl9Var = (rl9) it.next();
            if (!z || rl9Var.b) {
                x1p x1pVar = rl9Var.a;
            }
        }
    }

    public final void z(String str, boolean z) {
        ((y7) this.a).z(str, z);
        ((vr9) this.b).run();
    }
}
