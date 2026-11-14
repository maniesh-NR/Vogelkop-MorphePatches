package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.support.v4.media.session.MediaSessionCompat$Token;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Objects;

/* loaded from: classes.dex */
public final class dod {
    public static ez9 c;
    public final Context a;
    public final ArrayList b = new ArrayList();

    public dod(Context context) {
        this.a = context;
    }

    public static void b() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return;
        }
        qp2.n("The media router service must only be accessed on the application's main thread.");
    }

    public static ez9 c() {
        ez9 ez9Var = c;
        if (ez9Var != null) {
            return ez9Var;
        }
        qp2.n("getGlobalRouter cannot be called when sGlobal is null");
        return null;
    }

    public static dod d(Context context) {
        if (context == null) {
            qp2.o("context must not be null");
            return null;
        }
        b();
        ez9 ez9Var = c;
        if (ez9Var == null) {
            ez9Var = new ez9(context.getApplicationContext());
            c = ez9Var;
        }
        ArrayList arrayList = ez9Var.i;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                dod dodVar = new dod(context);
                arrayList.add(new WeakReference(dodVar));
                return dodVar;
            }
            dod dodVar2 = (dod) ((WeakReference) arrayList.get(size)).get();
            if (dodVar2 == null) {
                arrayList.remove(size);
            } else if (dodVar2.a == context) {
                return dodVar2;
            }
        }
    }

    public static MediaSessionCompat$Token e() {
        ez9 ez9Var = c;
        if (ez9Var == null) {
            return null;
        }
        g77 g77Var = ez9Var.E;
        if (g77Var != null) {
            cpd cpdVar = (cpd) g77Var.a;
            if (cpdVar != null) {
                return cpdVar.a.c;
            }
            return null;
        }
        cpd cpdVar2 = ez9Var.F;
        if (cpdVar2 != null) {
            return cpdVar2.a.c;
        }
        return null;
    }

    public static ArrayList f() {
        b();
        return c().j;
    }

    public static cod g() {
        b();
        return c().h();
    }

    public static boolean h() {
        Bundle bundle;
        if (c == null) {
            return false;
        }
        god godVar = c().v;
        return godVar == null || (bundle = godVar.f) == null || bundle.getBoolean("androidx.mediarouter.media.MediaRouterParams.ENABLE_GROUP_VOLUME_UX", true);
    }

    public static boolean i(vnd vndVar, int i) {
        if (vndVar == null) {
            qp2.o("selector must not be null");
            return false;
        }
        b();
        ez9 ez9VarC = c();
        ArrayList arrayList = ez9VarC.j;
        if (!vndVar.d()) {
            if ((i & 2) != 0 || !ez9VarC.q) {
                god godVar = ez9VarC.v;
                boolean z = godVar != null && godVar.c && ez9VarC.i();
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    cod codVar = (cod) arrayList.get(i2);
                    if (((i & 1) != 0 && codVar.d()) || ((z && !codVar.d() && codVar.c() != ez9VarC.s) || !codVar.h(vndVar))) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    public static void k(cpd cpdVar) {
        b();
        ez9 ez9VarC = c();
        ez9VarC.F = cpdVar;
        g77 g77Var = cpdVar != null ? new g77(ez9VarC, cpdVar) : null;
        g77 g77Var2 = ez9VarC.E;
        if (g77Var2 != null) {
            g77Var2.g();
        }
        ez9VarC.E = g77Var;
        if (g77Var != null) {
            ez9VarC.o();
        }
    }

    public static void l(h9i h9iVar) {
        b();
        jmd jmdVar = c().s;
        if (jmdVar == null || Build.VERSION.SDK_INT < 34) {
            return;
        }
        g8.S(jmdVar.i, h9iVar != null ? g8.a0(h9iVar) : null);
    }

    public static void m(god godVar) {
        b();
        ez9 ez9VarC = c();
        Context context = ez9VarC.h;
        az9 az9Var = ez9VarC.a;
        context.getPackageName();
        Objects.toString(godVar.f);
        god godVar2 = ez9VarC.v;
        ez9VarC.v = godVar;
        boolean zI = ez9VarC.i();
        jmd jmdVar = ez9VarC.s;
        if (zI) {
            if (jmdVar == null) {
                jmd jmdVar2 = new jmd(context, new qq6(ez9VarC, (byte) 16));
                ez9VarC.s = jmdVar2;
                ez9VarC.a(jmdVar2, true);
                ez9VarC.n();
            }
            boolean z = godVar.e;
            jmd jmdVar3 = ez9VarC.s;
            jmdVar3.p = z;
            jmdVar3.k();
            ijc ijcVar = ez9VarC.c;
            ijcVar.a = z;
            ((Handler) ijcVar.e).post((pjg) ijcVar.i);
            if ((godVar2 != null && godVar2.d) != godVar.d) {
                jmd jmdVar4 = ez9VarC.s;
                jmdVar4.e = ez9VarC.C;
                if (!jmdVar4.f) {
                    jmdVar4.f = true;
                    jmdVar4.c.sendEmptyMessage(2);
                }
            }
        } else if (jmdVar != null) {
            bod bodVarD = ez9VarC.d(jmdVar);
            if (bodVarD != null) {
                b();
                jmdVar.d = null;
                jmdVar.g(null);
                ez9VarC.p(bodVarD, null);
                az9Var.b(514, bodVarD);
                ez9VarC.m.remove(bodVarD);
            }
            ez9VarC.s = null;
            ez9VarC.C = null;
            ijc ijcVar2 = ez9VarC.c;
            ((Handler) ijcVar2.e).post((pjg) ijcVar2.i);
        }
        az9Var.b(769, godVar);
    }

    public static void n(int i) {
        if (i < 0 || i > 3) {
            qp2.o("Unsupported reason to unselect route");
            return;
        }
        b();
        ez9 ez9VarC = c();
        cod codVarC = ez9VarC.c();
        if (ez9VarC.h() != codVarC) {
            ez9VarC.l(codVarC, i, 1, true);
        }
    }

    public final void a(vnd vndVar, wnd wndVar, int i) {
        xnd xndVar;
        if (vndVar == null) {
            qp2.o("selector must not be null");
            return;
        }
        if (wndVar == null) {
            qp2.o("callback must not be null");
            return;
        }
        b();
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        boolean z = false;
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                i2 = -1;
                break;
            } else if (((xnd) arrayList.get(i2)).b == wndVar) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 < 0) {
            xndVar = new xnd(this, wndVar);
            arrayList.add(xndVar);
        } else {
            xndVar = (xnd) arrayList.get(i2);
        }
        boolean z2 = true;
        if (i != xndVar.d) {
            xndVar.d = i;
            z = true;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if ((i & 1) != 0) {
            z = true;
        }
        xndVar.e = jElapsedRealtime;
        vnd vndVar2 = xndVar.c;
        vndVar2.a();
        vndVar.a();
        if (vndVar2.b.containsAll(vndVar.b)) {
            z2 = z;
        } else {
            vnd vndVar3 = xndVar.c;
            fv1 fv1Var = new fv1();
            if (vndVar3 == null) {
                qp2.o("selector must not be null");
                return;
            }
            vndVar3.a();
            if (!vndVar3.b.isEmpty()) {
                fv1Var.a = new ArrayList(vndVar3.b);
            }
            fv1Var.c(vndVar.c());
            xndVar.c = fv1Var.d();
        }
        if (z2) {
            c().n();
        }
    }

    public final void j(wnd wndVar) {
        if (wndVar == null) {
            qp2.o("callback must not be null");
            return;
        }
        b();
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (((xnd) arrayList.get(i)).b == wndVar) {
                break;
            } else {
                i++;
            }
        }
        if (i >= 0) {
            arrayList.remove(i);
            c().n();
        }
    }
}
