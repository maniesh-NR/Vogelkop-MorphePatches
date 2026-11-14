package defpackage;

import J.N;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.text.TextUtils;
import android.view.Surface;
import com.google.common.util.concurrent.ListenableFuture;
import com.opera.android.settings.SettingsManager;
import com.opera.api.Callback;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import org.chromium.media.MediaDrmBridge;

/* loaded from: classes.dex */
public final /* synthetic */ class z0c implements ee5, m94, fkj, did, fjc, kid, vid, zpd, op5, vqd, mjo, tya {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ z0c(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    public /* synthetic */ z0c(CoroutineContext coroutineContext, Function2 function2) {
        this.a = (byte) 3;
        rx5 rx5Var = rx5.a;
        this.b = coroutineContext;
        this.c = function2;
    }

    @Override // defpackage.op5
    public final void accept(Object obj) {
        byte b = this.a;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (b) {
            case 17:
                xqd xqdVar = (xqd) obj3;
                nyl nylVarB = (nyl) obj2;
                xkg xkgVar = (xkg) obj;
                l1b l1bVar = nylVarB.H;
                if (!l1bVar.isEmpty()) {
                    myl mylVarC = nylVarB.a().c();
                    omm ommVarN = l1bVar.l().n();
                    while (ommVarN.hasNext()) {
                        kyl kylVar = (kyl) ommVarN.next();
                        eyl eylVar = (eyl) xqdVar.d.e.get(kylVar.a.b);
                        if (eylVar == null || kylVar.a.a != eylVar.a) {
                            mylVarC.a(kylVar);
                        } else {
                            mylVarC.a(new kyl(eylVar, kylVar.b));
                        }
                    }
                    nylVarB = mylVarC.b();
                }
                xkgVar.m(nylVarB);
                break;
            case 18:
                nod nodVar = (nod) obj2;
                npd npdVar = (npd) ((xqd) obj3).a.get();
                if (npdVar != null && !npdVar.i()) {
                    npdVar.f(nodVar, false);
                    break;
                }
                break;
            case 19:
                xqd xqdVar2 = (xqd) obj3;
                Surface surface = (Surface) obj2;
                xkg xkgVar2 = (xkg) obj;
                ((npd) xqdVar2.a.get()).getClass();
                if (surface != null) {
                    wqd wqdVar = new wqd(surface);
                    xqdVar2.f = wqdVar;
                    xkgVar2.setVideoSurfaceHolder(wqdVar);
                    break;
                } else {
                    xkgVar2.setVideoSurfaceHolder(null);
                    xqdVar2.f = null;
                    break;
                }
            default:
                ro9 ro9Var = (ro9) obj3;
                ((prd) obj).u(ro9Var.b, (jrd) ro9Var.c, (tjd) obj2);
                break;
        }
    }

    @Override // defpackage.m94
    public final Object attachCompleter(l94 l94Var) {
        byte b = this.a;
        l97 l97Var = l97.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 3:
                CoroutineContext coroutineContext = (CoroutineContext) obj2;
                rx5 rx5Var = rx5.a;
                l94Var.a(new dnb(coroutineContext.get(ulp.h), (byte) 11), l97Var);
                return na2.B(sgb.b(coroutineContext), null, rx5Var, new mz9((Function2) obj, l94Var, null, (byte) 9), 1);
            default:
                AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                l94Var.a(new vic(atomicBoolean, (byte) 0), l97Var);
                ((Executor) obj2).execute(new gl6(atomicBoolean, l94Var, (i51) obj, (byte) 29));
                return "setForegroundAsync";
        }
    }

    @Override // defpackage.zpd
    public final void b(nod nodVar) {
        byte b = this.a;
        Object obj = this.c;
        aqd aqdVar = (aqd) this.b;
        switch (b) {
            case 15:
                String str = ((mid) obj).a;
                if (TextUtils.isEmpty(str)) {
                    w7d.K("onRemoveQueueItem(): Media ID shouldn't be null");
                    break;
                } else {
                    xkg xkgVar = aqdVar.f.t;
                    if (xkgVar.C(17)) {
                        gql currentTimeline = xkgVar.getCurrentTimeline();
                        fql fqlVar = new fql();
                        for (int i = 0; i < currentTimeline.o(); i++) {
                            if (TextUtils.equals(currentTimeline.m(i, fqlVar, 0L).b.a, str)) {
                                xkgVar.o(i);
                                break;
                            }
                        }
                        break;
                    } else {
                        w7d.K("Can't remove item by ID without COMMAND_GET_TIMELINE being available");
                        break;
                    }
                }
            default:
                ((vb5) obj).f(aqdVar.f.t);
                break;
        }
    }

    @Override // defpackage.did
    public final void c(ssa ssaVar, int i) {
        byte b = this.a;
        Object obj = this.c;
        gid gidVar = (gid) this.b;
        switch (b) {
            case 6:
                ssaVar.E0(gidVar.c, i, (Surface) obj);
                break;
            case 7:
                ssaVar.P(gidVar.c, i, ((vjd) obj).c());
                break;
            case 8:
                ssaVar.p(gidVar.c, i, ((nyl) obj).c());
                break;
            default:
                thg thgVar = (thg) obj;
                lid lidVar = gidVar.c;
                thgVar.getClass();
                Bundle bundle = new Bundle();
                bundle.putFloat(thg.e, thgVar.a);
                bundle.putFloat(thg.f, thgVar.b);
                ssaVar.M(lidVar, i, bundle);
                break;
        }
    }

    public final void d(qio qioVar) {
        cie cieVar = (cie) this.b;
        String str = (String) this.c;
        if (qioVar instanceof lio) {
            sjo.f(((bzo) cieVar).a, cieVar.N, str, 3);
        }
    }

    public final void e(gkj gkjVar, hjm hjmVar) {
        lqh lqhVar = (lqh) this.b;
        qyc qycVar = (qyc) this.c;
        if (lqhVar.a) {
            SettingsManager settingsManager = qycVar.i;
            settingsManager.getClass();
            settingsManager.V(Integer.MAX_VALUE, "lock_password_manager");
            ((l6g) qycVar.j.b).run();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void f(gid gidVar) {
        boolean z;
        boolean z2;
        boolean z3;
        byte b = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 11:
                gidVar.A((ijg) obj2, (gjg) obj);
                break;
            default:
                o3j o3jVar = (o3j) obj2;
                cig cigVar = (cig) obj;
                ghd ghdVar = gidVar.a;
                if (gidVar.r()) {
                    boolean zEquals = Objects.equals(gidVar.w, cigVar);
                    boolean zEquals2 = Objects.equals(gidVar.v, o3jVar);
                    if (!zEquals || !zEquals2) {
                        gidVar.v = o3jVar;
                        Object[] objArr = 0;
                        if (zEquals) {
                            z = false;
                        } else {
                            gidVar.w = cigVar;
                            cig cigVar2 = gidVar.y;
                            cig cigVarD = gid.d(cigVar, gidVar.x);
                            gidVar.y = cigVarD;
                            z = !cigVarD.equals(cigVar2);
                        }
                        if (!zEquals2 || z) {
                            csh cshVar = gidVar.t;
                            csh cshVar2 = gidVar.u;
                            csh cshVarH = gid.H(gidVar.s, gidVar.r, o3jVar, gidVar.y, gidVar.I);
                            gidVar.t = cshVarH;
                            gidVar.u = gid.G(cshVarH, gidVar.r, gidVar.I, o3jVar, gidVar.y);
                            z2 = !gidVar.t.equals(cshVar);
                            z3 = !gidVar.u.equals(cshVar2);
                        } else {
                            z2 = false;
                            z3 = false;
                        }
                        if (z) {
                            gidVar.i.i(13, new phd(gidVar, objArr == true ? 1 : 0));
                        }
                        if (!zEquals2) {
                            ghdVar.getClass();
                            z4o.H(Looper.myLooper() == ghdVar.f.getLooper());
                            ghdVar.e.getClass();
                        }
                        if (z3) {
                            ghdVar.getClass();
                            z4o.H(Looper.myLooper() == ghdVar.f.getLooper());
                            ghdVar.e.getClass();
                        }
                        if (z2) {
                            ghdVar.getClass();
                            z4o.H(Looper.myLooper() == ghdVar.f.getLooper());
                            ghdVar.e.getClass();
                            break;
                        }
                    }
                }
                break;
        }
    }

    public final void g(int i) {
        s14 s14Var = (s14) this.b;
        ((abf) this.c).dismiss();
        gjm gjmVar = (gjm) s14Var.c;
        if (i == 1) {
            gjmVar.e(new vfn(), false);
            return;
        }
        if (i == 2) {
            gjmVar.e(new odn(), false);
        } else {
            if (i != 3) {
                return;
            }
            nej nejVarF = a4h.f(((gbf) s14Var.f).i.getContext());
            d8g d8gVar = new d8g();
            nejVarF.getClass();
            nejVarF.b(d8gVar, ijm.b);
        }
    }

    public final void h(Callback callback) {
        c37 c37Var = (c37) this.b;
        String str = (String) this.c;
        Object obj = c37Var.b;
        hu5 hu5Var = new hu5(callback, str, (byte) 25);
        avj avjVar = cak.d;
        avj.g(1, new n32(hu5Var, (byte) 5));
    }

    public final void invoke(Object obj) {
        ((eig) obj).B(((Integer) this.c).intValue(), (qjd) this.b);
    }

    @Override // defpackage.vqd
    public final Object l(npd npdVar, nod nodVar, int i) {
        byte b = this.a;
        Object obj = this.c;
        vqd vqdVar = (vqd) this.b;
        switch (b) {
            case 20:
                return npdVar.i() ? yr9.c(new e4j(-100)) : tym.b0((ListenableFuture) vqdVar.l(npdVar, nodVar, i), new nqd(npdVar, nodVar, (kpd) obj, (byte) 0));
            default:
                return npdVar.i() ? yr9.c(new e4j(-100)) : tym.b0((ListenableFuture) vqdVar.l(npdVar, nodVar, i), new nqd(npdVar, nodVar, (uqd) obj, (byte) 1));
        }
    }

    @Override // defpackage.tya
    public final void o(uya uyaVar) {
        ((tya) this.c).o((s6h) this.b);
    }

    public final Object r(x79 x79Var) {
        return new wn2((String) this.b, ((ybc) this.c).d((Context) x79Var.a(Context.class)));
    }

    public final void run(long j) {
        String str = (String) this.b;
        byte[] bArr = (byte[]) this.c;
        UUID uuid = MediaDrmBridge.n;
        N.MmhSkOYV(j, str, bArr);
    }
}
