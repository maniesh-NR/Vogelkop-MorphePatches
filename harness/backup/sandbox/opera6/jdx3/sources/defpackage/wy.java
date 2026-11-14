package defpackage;

import android.content.Context;
import android.util.SparseArray;
import com.leanplum.messagetemplates.MessageTemplateConstants;
import com.opera.android.Lazy;
import com.opera.android.OperaApplication;
import com.opera.android.settings.SettingsManager;
import com.opera.api.Callback;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class wy extends lim implements f7f {
    public kze A;
    public final Context a;
    public final x5f b;
    public final uwh c;
    public final wjh d;
    public final vzk e;
    public final zy9 f;
    public final ux g;
    public final i3j h;
    public final s9i i;
    public final bi j;
    public boolean k;
    public final yl l;
    public final ks3 m;
    public final b59 n;
    public final jtg o;
    public final gmk p;
    public final w7h q;
    public final ty r;
    public final uy s;
    public final vy t;
    public final vy u;
    public final lhb v;
    public final gy w;
    public final ay x;
    public final ej y;
    public boolean z;

    /* JADX WARN: Type inference failed for: r1v6, types: [uy] */
    public wy(xd5 xd5Var, umi umiVar, SettingsManager settingsManager, Lazy lazy, x5f x5fVar, jtg jtgVar, gmk gmkVar, rr3 rr3Var, zv9 zv9Var, gy gyVar, Lazy lazy2, Lazy lazy3, esk eskVar) {
        zy9 zy9Var = new zy9((byte) 6);
        this.f = zy9Var;
        byte b = 1;
        this.x = new ay(this, b);
        this.y = new ej();
        Context applicationContext = xd5Var.getApplicationContext();
        this.a = applicationContext;
        byte b2 = 0;
        b59 b59VarL = w1h.l(applicationContext, umiVar, "ads", new bg1[0]);
        this.n = b59VarL;
        this.b = x5fVar;
        this.o = jtgVar;
        this.p = gmkVar;
        wjh wjhVar = new wjh(settingsManager, x5fVar, rr3Var, new sy(this, b2));
        this.d = wjhVar;
        tw2 tw2Var = new tw2((Object) this, (byte) 6);
        sy syVar = new sy(this, b);
        sy syVar2 = new sy(this, (byte) 2);
        vzk vzkVar = new vzk();
        vzkVar.c = Collections.newSetFromMap(new WeakHashMap());
        vzkVar.b = new ami(applicationContext, vzkVar, b59VarL, syVar, wjhVar);
        i5o i5oVar = new i5o(applicationContext, umiVar, b59VarL, new vx(vzkVar, b2), eskVar, syVar, syVar2);
        vzkVar.d = i5oVar;
        vzkVar.a = new cy(tw2Var, b59VarL, i5oVar, syVar, new rx(vzkVar, b), wjhVar);
        this.e = vzkVar;
        ux uxVar = new ux(vzkVar);
        this.g = uxVar;
        uxVar.j = true;
        i3j i3jVar = new i3j();
        i3jVar.a = new c4(i3jVar, (byte) 11);
        i3jVar.b = new HashMap();
        i3jVar.c = zy9Var;
        i3jVar.d = uxVar;
        this.h = i3jVar;
        s9i s9iVar = new s9i(new pza((byte) 15), new ni6(umiVar, applicationContext, "ads_premium"), vzkVar);
        this.i = s9iVar;
        nn7 nn7Var = new nn7(applicationContext, umiVar, x5fVar, vzkVar);
        this.w = gyVar;
        this.r = new ty(this, nn7Var, b2);
        s9i s9iVar2 = new s9i(applicationContext, umiVar);
        i5o i5oVar2 = (i5o) vzkVar.d;
        String[] strArr = OperaApplication.K;
        x5f x5fVar2 = ((OperaApplication) applicationContext.getApplicationContext()).L().d;
        ks3 ks3Var = new ks3();
        ks3Var.a = new HashMap(MessageTemplateConstants.Values.CENTER_POPUP_HEIGHT);
        ks3Var.b = nn7Var;
        ks3Var.c = s9iVar2;
        ks3Var.d = i5oVar2;
        ks3Var.e = s9iVar;
        ks3Var.f = wjhVar;
        ks3Var.g = x5fVar;
        ks3Var.h = x5fVar2;
        ks3Var.i = new ua7(x5fVar2);
        this.m = ks3Var;
        yl ylVar = new yl(applicationContext, umiVar, new tx(uxVar, new yl(applicationContext, ks3Var, (i5o) vzkVar.d)));
        this.l = ylVar;
        xnh xnhVarT = xnh.t(applicationContext);
        uwh uwhVar = new uwh(xd5Var.getLifecycle(), xnhVarT);
        this.c = uwhVar;
        w7h w7hVar = new w7h(xd5Var, umiVar, settingsManager, lazy, xnhVarT, uwhVar, nn7Var, zy9Var, (i5o) vzkVar.d, this, wjhVar, zv9Var, x5fVar, gyVar, lazy2, lazy3, eskVar);
        this.q = w7hVar;
        this.s = new ysd() { // from class: uy
            @Override // defpackage.ysd
            public final void l(int i) {
                wy wyVar = this.a;
                w7h w7hVar2 = wyVar.q;
                i3j i3jVar2 = wyVar.h;
                if (j7c.a(i, 3)) {
                    i3jVar2.m();
                }
                if (j7c.a(i, 2)) {
                    w7hVar2.g.clear();
                    w7hVar2.h.clear();
                }
                if (j7c.a(i, 1)) {
                    wyVar.f.I();
                    Iterator it = w7hVar2.g.values().iterator();
                    while (it.hasNext()) {
                        if (((WeakReference) it.next()).get() == null) {
                            it.remove();
                        }
                    }
                    Iterator it2 = w7hVar2.h.values().iterator();
                    while (it2.hasNext()) {
                        if (((WeakReference) it2.next()).get() == null) {
                            it2.remove();
                        }
                    }
                    i3jVar2.q(false);
                }
            }
        };
        byte b3 = 0;
        vy vyVar = new vy(this, b3);
        this.t = vyVar;
        this.u = vyVar;
        byte b4 = 15;
        this.j = new bi(this, b4);
        uxVar.f = i3jVar;
        uxVar.g = w7hVar;
        uxVar.h = uwhVar;
        po7 po7Var = new po7(gyVar);
        nhb nhbVar = new nhb(vzkVar);
        z0b z0bVar = new z0b(4);
        z0bVar.c(new ho(b3));
        z0bVar.c(new j10(ylVar));
        z0bVar.c(new ho((byte) 1));
        qyf qyfVar = (qyf) ep7.a.get();
        if (qyfVar.a0()) {
            jhb jhbVar = (jhb) mzg.k((String) qyfVar.a, "createInterstitialPresenter", new Class[0], new Object[0]);
            Objects.requireNonNull(jhbVar);
            z0bVar.c(jhbVar);
        }
        this.v = new lhb(xd5Var, x5fVar, ylVar, new pza((byte) 14), new pza(b4), new ni6(umiVar, applicationContext, "ads_interstitial"), new i16((Object) w7hVar, (byte) 21), z0bVar.g(), nhbVar, po7Var);
    }

    public final void R() {
        ((i5o) this.e.d).getClass();
        ((jec) this.q.f.f).clear();
        yl ylVar = this.l;
        xl xlVar = (xl) ylVar.e;
        xlVar.i();
        ((jec) ylVar.d).clear();
        xlVar.g(null);
        this.g.l = null;
    }

    public final void S(Context context, Callback callback) {
        su suVar = new su((Object) this, (Object) context, (Object) callback, (byte) 1);
        vzk vzkVar = this.e;
        i5o i5oVar = (i5o) vzkVar.d;
        ((iy) i5oVar.a).d(new k3(i5oVar, context, new wx((Object) vzkVar, (Object) suVar, (byte) 0), (byte) 6));
    }

    public final boolean T() {
        if (((wnh) xnh.t(this.a).i()).a(2)) {
            return true;
        }
        if (this.z) {
            return !((svg) tvg.t(r0).i()).a(8);
        }
        return false;
    }

    public final void U() {
        kze kzeVar = this.A;
        if (kzeVar != null) {
            kzeVar.r(Boolean.valueOf(T()));
        }
        cy cyVar = (cy) this.e.a;
        ay ayVar = (ay) cyVar.b;
        if (ayVar.c() && ((wy) ((tw2) cyVar.c).b).T() && ((ml) ayVar.get()).d("", new ix5((byte) 21))) {
            ((rx) cyVar.g).s((ml) ayVar.get());
        }
    }

    @Override // defpackage.as6
    public final void W(ndc ndcVar) {
        zsd zsdVar = zsd.b;
        zsdVar.a.add(this.s);
        Context context = this.a;
        xnh.t(context).F(this.t);
        tvg.t(context).F(this.u);
        this.w.F(this.r);
        if (this.o.b()) {
            this.p.a.j(ndcVar, this);
        }
    }

    public final void d0(Object obj) {
        uvg uvgVar = (uvg) obj;
        if (uvgVar != uvg.LOADING) {
            boolean z = uvgVar == uvg.ACTIVE;
            if (this.z == z) {
                return;
            }
            this.z = z;
            U();
        }
    }

    @Override // defpackage.lim, defpackage.as6
    public final void onDestroy(ndc ndcVar) {
        ndcVar.getLifecycle().b(this);
        zsd zsdVar = zsd.b;
        zsdVar.a.remove(this.s);
        Context context = this.a;
        xnh.t(context).H(this.t);
        tvg.t(context).H(this.u);
        this.w.H(this.r);
        this.h.m();
        wjh wjhVar = this.d;
        if (((o59) wjhVar.f) == null) {
            return;
        }
        ((SettingsManager) wjhVar.b).H((s9) wjhVar.d);
        wjhVar.f = null;
    }

    @Override // defpackage.as6
    public final void onPause(ndc ndcVar) {
        this.k = false;
        ks3 ks3Var = this.m;
        nn7 nn7Var = (nn7) ks3Var.b;
        if (nn7Var.o != null) {
            nn7Var.q();
        }
        s9i s9iVar = (s9i) ks3Var.c;
        oml omlVar = (oml) s9iVar.e;
        if (omlVar != null) {
            omlVar.cancel(false);
            s9iVar.e = null;
            ((i32) s9iVar.b).g(((SparseArray) s9iVar.d).clone());
        }
        this.g.j = true;
    }

    @Override // defpackage.as6
    public final void onResume(ndc ndcVar) {
        this.k = true;
        ((cy) this.e.a).i();
        this.g.j = false;
        this.h.q(true);
    }

    @Override // defpackage.as6
    public final void onStop(ndc ndcVar) {
        this.f.I();
        this.h.q(false);
        w7h w7hVar = this.q;
        Iterator it = w7hVar.g.values().iterator();
        while (it.hasNext()) {
            if (((WeakReference) it.next()).get() == null) {
                it.remove();
            }
        }
        Iterator it2 = w7hVar.h.values().iterator();
        while (it2.hasNext()) {
            if (((WeakReference) it2.next()).get() == null) {
                it2.remove();
            }
        }
    }
}
