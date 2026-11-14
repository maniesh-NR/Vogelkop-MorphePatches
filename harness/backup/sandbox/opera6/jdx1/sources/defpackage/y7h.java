package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.Range;
import android.view.View;
import android.view.ViewParent;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public abstract class y7h {
    public static i3j c;

    public static final void b(c8e c8eVar, ue5 ue5Var, ih5 ih5Var, int i) {
        vt9 vt9Var = (vt9) ih5Var;
        vt9Var.Y(-1854833411);
        byte b = 2;
        int i2 = (vt9Var.f(c8eVar) ? 4 : 2) | i;
        if (vt9Var.N(i2 & 1, (i2 & 19) != 18)) {
            Object objK = vt9Var.K();
            if (objK == hh5.a) {
                objK = m51.i;
                vt9Var.g0(objK);
            }
            tfd tfdVar = (tfd) objK;
            int iHashCode = Long.hashCode(vt9Var.T);
            oag oagVarL = vt9Var.l();
            c8e c8eVarP = qyn.P(vt9Var, c8eVar);
            bh5.To.getClass();
            vt9Var.a0();
            if (vt9Var.S) {
                vt9Var.k(m3c.S);
            } else {
                vt9Var.j0();
            }
            y4h.o(vt9Var, tfdVar, ujp.f);
            y4h.o(vt9Var, oagVarL, ujp.e);
            y4h.o(vt9Var, Integer.valueOf(iHashCode), ujp.g);
            y4h.m(vt9Var);
            y4h.o(vt9Var, c8eVarP, ujp.d);
            o18.r(6, ue5Var, vt9Var, true);
        } else {
            vt9Var.Q();
        }
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new d8c(c8eVar, ue5Var, i, b);
        }
    }

    public static flp c(flp flpVar) {
        return flpVar.a(flpVar.size() << 1);
    }

    public static final int d(float f) {
        return Math.round((float) Math.ceil(f));
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00b7, code lost:
    
        if (r7 == 0) goto L48;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static xlk e(nsh r13, int r14, boolean r15) {
        /*
            Method dump skipped, instructions count: 265
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y7h.e(nsh, int, boolean):xlk");
    }

    public static final Object f(tng tngVar, String str, nt5 nt5Var) {
        Object objA = tngVar.a(str, new qjl((byte) 6), nt5Var);
        return objA == px5.a ? objA : Unit.a;
    }

    public static final w4o g(h5o h5oVar) {
        return new w4o(h5oVar.a, h5oVar.t);
    }

    public static final ViewParent h(View view) {
        ViewParent parent = view.getParent();
        if (parent != null) {
            return parent;
        }
        Object tag = view.getTag(2131365016);
        if (tag instanceof ViewParent) {
            return (ViewParent) tag;
        }
        return null;
    }

    public static void i(Context context) {
        Context applicationContext;
        PackageManager packageManager;
        ApplicationInfo applicationInfo;
        Bundle bundle;
        if (z7h.m(context).getBoolean("proxy_notification_initialized", false)) {
            return;
        }
        try {
            applicationContext = context.getApplicationContext();
            packageManager = applicationContext.getPackageManager();
        } catch (PackageManager.NameNotFoundException unused) {
        }
        boolean z = (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(applicationContext.getPackageName(), NotificationCompat.FLAG_HIGH_PRIORITY)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_messaging_notification_delegation_enabled")) ? true : applicationInfo.metaData.getBoolean("firebase_messaging_notification_delegation_enabled");
        if (!PlatformVersion.isAtLeastQ()) {
            Tasks.forResult((Object) null);
            return;
        }
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        new bu3(context, z, taskCompletionSource).run();
        taskCompletionSource.getTask();
    }

    public static final void j(xd4 xd4Var, bp3 bp3Var, wth wthVar) {
        i3j i3jVar = c;
        if (i3jVar == null) {
            qp2.n("mCameraUseCaseAdapterProvider must be initialized first!");
            return;
        }
        zd4 zd4VarB = ((hf4) i3jVar.a).b(xd4Var.e());
        qg4 qg4Var = new qg4(zd4VarB, null, new mr(zd4VarB.g(), fc4.a), null, (tc4) i3jVar.b, (ivg) i3jVar.d, (rg4) i3jVar.c);
        k8n k8nVar = (k8n) bp3Var.c;
        synchronized (qg4Var.m) {
            qg4Var.h = k8nVar;
        }
        List list = (List) bp3Var.d;
        synchronized (qg4Var.m) {
            qg4Var.i = list;
        }
        int iB = bp3Var.b();
        synchronized (qg4Var.m) {
            qg4Var.j = iB;
        }
        Range range = (Range) bp3Var.e;
        synchronized (qg4Var.m) {
            qg4Var.k = range;
        }
        List list2 = (List) bp3Var.h;
        Objects.toString(list2);
        Objects.toString(wthVar);
        synchronized (qg4Var.m) {
            nr nrVar = qg4Var.a;
            ec4 ec4Var = qg4Var.l;
            nrVar.i(ec4Var);
            nr nrVar2 = qg4Var.b;
            if (nrVar2 != null) {
                nrVar2.i(ec4Var);
            }
            LinkedHashSet linkedHashSet = new LinkedHashSet(qg4Var.e);
            linkedHashSet.addAll(list2);
            HashMap mapK = qg4.k(linkedHashSet, wthVar);
            try {
                try {
                    qg4Var.s(linkedHashSet, qg4Var.b != null);
                    qg4.B(mapK);
                } catch (IllegalArgumentException e) {
                    throw new kg4(e);
                }
            } catch (Throwable th) {
                qg4.B(mapK);
                throw th;
            }
        }
    }

    public static final c8e m(final voi voiVar, vt9 vt9Var) {
        unf unfVar = pof.a;
        final long jP = pof.a(vt9Var).a.P();
        boolean zF = vt9Var.f(voiVar) | vt9Var.c(1.0f) | vt9Var.e(jP);
        Object objK = vt9Var.K();
        zpa zpaVar = hh5.a;
        if (zF || objK == zpaVar) {
            final byte b = 0;
            objK = new Function1() { // from class: loi
                public final Object invoke(Object obj) {
                    byte b2 = b;
                    voi voiVar2 = voiVar;
                    switch (b2) {
                        case 0:
                            o3c o3cVar = (o3c) obj;
                            o3cVar.a();
                            if (voiVar2.c()) {
                                float fO0 = o3cVar.o0(1.0f);
                                float f = fO0 / 2.0f;
                                mk7.p0(o3cVar, jP, Float.floatToRawIntBits(f) & 4294967295L, (Float.floatToRawIntBits(Float.intBitsToFloat((int) (o3cVar.a.e() >> 32))) << 32) | (Float.floatToRawIntBits(f) & 4294967295L), fO0, 496);
                            }
                            break;
                        default:
                            o3c o3cVar2 = (o3c) obj;
                            o3cVar2.a();
                            uh4 uh4Var = o3cVar2.a;
                            if (voiVar2.d()) {
                                float fO02 = o3cVar2.o0(1.0f);
                                float fIntBitsToFloat = Float.intBitsToFloat((int) (uh4Var.e() & 4294967295L)) - (fO02 / 2.0f);
                                mk7.p0(o3cVar2, jP, Float.floatToRawIntBits(fIntBitsToFloat) & 4294967295L, (Float.floatToRawIntBits(Float.intBitsToFloat((int) (uh4Var.e() >> 32))) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat) & 4294967295L), fO02, 496);
                            }
                            break;
                    }
                    return Unit.a;
                }
            };
            vt9Var.g0(objK);
        }
        c8e c8eVarF = fr3.F(z7e.b, (Function1) objK);
        boolean zF2 = vt9Var.f(voiVar) | vt9Var.c(1.0f) | vt9Var.e(jP);
        Object objK2 = vt9Var.K();
        if (zF2 || objK2 == zpaVar) {
            final byte b2 = 1;
            objK2 = new Function1() { // from class: loi
                public final Object invoke(Object obj) {
                    byte b22 = b2;
                    voi voiVar2 = voiVar;
                    switch (b22) {
                        case 0:
                            o3c o3cVar = (o3c) obj;
                            o3cVar.a();
                            if (voiVar2.c()) {
                                float fO0 = o3cVar.o0(1.0f);
                                float f = fO0 / 2.0f;
                                mk7.p0(o3cVar, jP, Float.floatToRawIntBits(f) & 4294967295L, (Float.floatToRawIntBits(Float.intBitsToFloat((int) (o3cVar.a.e() >> 32))) << 32) | (Float.floatToRawIntBits(f) & 4294967295L), fO0, 496);
                            }
                            break;
                        default:
                            o3c o3cVar2 = (o3c) obj;
                            o3cVar2.a();
                            uh4 uh4Var = o3cVar2.a;
                            if (voiVar2.d()) {
                                float fO02 = o3cVar2.o0(1.0f);
                                float fIntBitsToFloat = Float.intBitsToFloat((int) (uh4Var.e() & 4294967295L)) - (fO02 / 2.0f);
                                mk7.p0(o3cVar2, jP, Float.floatToRawIntBits(fIntBitsToFloat) & 4294967295L, (Float.floatToRawIntBits(Float.intBitsToFloat((int) (uh4Var.e() >> 32))) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat) & 4294967295L), fO02, 496);
                            }
                            break;
                    }
                    return Unit.a;
                }
            };
            vt9Var.g0(objK2);
        }
        return fr3.F(c8eVarF, (Function1) objK2);
    }

    public abstract Object a(rnp rnpVar, kuk kukVar);

    public void a() {
    }

    public abstract void a(yrc yrcVar);

    public final int k(Context context) {
        if (this instanceof kxh) {
            return ((kxh) this).d;
        }
        if (this instanceof ixh) {
            return z7h.h(context, ((ixh) this).d);
        }
        if (this instanceof jxh) {
            return context.getResources().getDimensionPixelOffset(((jxh) this).d);
        }
        if (!(this instanceof hxh)) {
            h9o.p();
            return 0;
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(new int[]{((hxh) this).d});
        int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        return dimensionPixelOffset;
    }

    public final float l(Context context) {
        if (this instanceof kxh) {
            return ((kxh) this).d;
        }
        if (this instanceof ixh) {
            return z7h.i(context, ((ixh) this).d);
        }
        if (this instanceof jxh) {
            return context.getResources().getDimension(((jxh) this).d);
        }
        if (!(this instanceof hxh)) {
            h9o.p();
            return 0.0f;
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(new int[]{((hxh) this).d});
        float dimension = typedArrayObtainStyledAttributes.getDimension(0, 0.0f);
        typedArrayObtainStyledAttributes.recycle();
        return dimension;
    }
}
