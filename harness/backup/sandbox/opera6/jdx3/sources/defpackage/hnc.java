package defpackage;

import android.net.Uri;
import android.util.SparseArray;
import com.leanplum.internal.Constants;
import com.opera.api.Callback;
import java.util.Collections;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.json.JSONException;

/* loaded from: classes.dex */
public final class hnc {
    public static boolean s;
    public final nx5 a;
    public final umi b;
    public final ii c;
    public final ode d;
    public final t1 e;
    public final anc h;
    public final h42 k;
    public final jze l;
    public pr m;
    public ewn n;
    public q65 o;
    public final q65 p;
    public final q65 q;
    public boolean r;
    public final HashMap f = new HashMap();
    public final HashMap g = new HashMap();
    public final ga6 i = new ga6((Object) this, (byte) 24);
    public final gnc j = new gnc(this);

    /* JADX WARN: Type inference failed for: r1v3, types: [anc] */
    public hnc(nx5 nx5Var, umi umiVar, ii iiVar, ode odeVar, nff nffVar, kw3 kw3Var, t1 t1Var) {
        this.a = nx5Var;
        this.b = umiVar;
        this.c = iiVar;
        this.d = odeVar;
        this.e = t1Var;
        final byte b = 0;
        this.h = new Function1(this) { // from class: anc
            public final /* synthetic */ hnc b;

            {
                this.b = this;
            }

            public final Object invoke(Object obj) throws JSONException {
                pr prVar;
                byte b2 = b;
                hnc hncVar = this.b;
                switch (b2) {
                    case 0:
                        tpc tpcVar = (tpc) obj;
                        if (tpcVar != null && (prVar = hncVar.m) != null) {
                            orb orbVar = new orb();
                            orbVar.p(tpcVar.c, "language");
                            String str = tpcVar.b;
                            if (str != null) {
                                orbVar.p(str, Constants.Keys.COUNTRY);
                            }
                            prVar.e("set_user_preferences", Collections.singletonList(orbVar), (v9i) null);
                        }
                        break;
                    case 1:
                        f3j f3jVar = (f3j) obj;
                        hncVar.k.r(f3jVar != null ? f3jVar.c : null);
                        break;
                    default:
                        hncVar.l.r(Boolean.valueOf(((Uri) obj) != null));
                        break;
                }
                return Unit.a;
            }
        };
        ekc h42Var = new h42();
        this.k = h42Var;
        jze jzeVar = new jze(Boolean.TRUE);
        this.l = jzeVar;
        byte b2 = 4;
        this.p = new q65(new bnc(this, b), b2);
        final byte b3 = 1;
        this.q = new q65(new bnc(this, b3), b2);
        h42Var.s(nffVar, new ug(new Function1(this) { // from class: anc
            public final /* synthetic */ hnc b;

            {
                this.b = this;
            }

            public final Object invoke(Object obj) throws JSONException {
                pr prVar;
                byte b22 = b3;
                hnc hncVar = this.b;
                switch (b22) {
                    case 0:
                        tpc tpcVar = (tpc) obj;
                        if (tpcVar != null && (prVar = hncVar.m) != null) {
                            orb orbVar = new orb();
                            orbVar.p(tpcVar.c, "language");
                            String str = tpcVar.b;
                            if (str != null) {
                                orbVar.p(str, Constants.Keys.COUNTRY);
                            }
                            prVar.e("set_user_preferences", Collections.singletonList(orbVar), (v9i) null);
                        }
                        break;
                    case 1:
                        f3j f3jVar = (f3j) obj;
                        hncVar.k.r(f3jVar != null ? f3jVar.c : null);
                        break;
                    default:
                        hncVar.l.r(Boolean.valueOf(((Uri) obj) != null));
                        break;
                }
                return Unit.a;
            }
        }, (byte) 26));
        final byte b4 = 2;
        jzeVar.l.s(h42Var, new ug(new Function1(this) { // from class: anc
            public final /* synthetic */ hnc b;

            {
                this.b = this;
            }

            public final Object invoke(Object obj) throws JSONException {
                pr prVar;
                byte b22 = b4;
                hnc hncVar = this.b;
                switch (b22) {
                    case 0:
                        tpc tpcVar = (tpc) obj;
                        if (tpcVar != null && (prVar = hncVar.m) != null) {
                            orb orbVar = new orb();
                            orbVar.p(tpcVar.c, "language");
                            String str = tpcVar.b;
                            if (str != null) {
                                orbVar.p(str, Constants.Keys.COUNTRY);
                            }
                            prVar.e("set_user_preferences", Collections.singletonList(orbVar), (v9i) null);
                        }
                        break;
                    case 1:
                        f3j f3jVar = (f3j) obj;
                        hncVar.k.r(f3jVar != null ? f3jVar.c : null);
                        break;
                    default:
                        hncVar.l.r(Boolean.valueOf(((Uri) obj) != null));
                        break;
                }
                return Unit.a;
            }
        }, (byte) 26));
    }

    public final void a(boolean z) {
        this.p.S();
        this.q.S();
        this.m = null;
        this.n = null;
        if (z && this.r) {
            q65 q65Var = new q65(new bnc(this, (byte) 2), (byte) 4);
            q65Var.B0(this.b, 1L, TimeUnit.MINUTES);
            this.o = q65Var;
        }
    }

    public final void b() throws JSONException {
        if (this.m == null) {
            HashMap map = this.g;
            if (map.isEmpty() || this.o != null) {
                return;
            }
            ode odeVar = this.d;
            final byte b = 0;
            final byte b2 = 1;
            if (((tpc) odeVar.g()) == null) {
                new r62(odeVar, new Callback(this) { // from class: cnc
                    public final /* synthetic */ hnc b;

                    {
                        this.b = this;
                    }

                    @Override // com.opera.api.Callback
                    public final void run(Object obj) throws JSONException {
                        byte b3 = b;
                        hnc hncVar = this.b;
                        switch (b3) {
                            case 0:
                                hncVar.b();
                                break;
                            default:
                                hncVar.b();
                                break;
                        }
                    }
                }, (byte) 1);
                return;
            }
            h42 h42Var = this.k;
            Uri uri = (Uri) h42Var.g();
            if (uri == null) {
                new r62(h42Var, new Callback(this) { // from class: cnc
                    public final /* synthetic */ hnc b;

                    {
                        this.b = this;
                    }

                    @Override // com.opera.api.Callback
                    public final void run(Object obj) throws JSONException {
                        byte b3 = b2;
                        hnc hncVar = this.b;
                        switch (b3) {
                            case 0:
                                hncVar.b();
                                break;
                            default:
                                hncVar.b();
                                break;
                        }
                    }
                }, (byte) 1);
                return;
            }
            t9f t9fVar = (t9f) this.c.get();
            umi umiVar = this.b;
            ewn ewnVar = new ewn(umiVar, uri, t9fVar);
            this.n = ewnVar;
            pr prVar = new pr();
            prVar.d = new SparseArray(1);
            prVar.a = 1;
            prVar.b = ewnVar;
            prVar.c = this.i;
            ewnVar.h(new t9i(prVar, (byte) 0));
            this.m = prVar;
            this.p.B0(umiVar, 20L, TimeUnit.SECONDS);
            orb orbVar = new orb();
            orb orbVar2 = new orb();
            orb orbVarP = vep.p(Constants.Params.NAME, "ofa");
            orbVarP.p(this.e.get(), "version");
            orbVarP.p("beta", "instance");
            orbVar2.p(orbVarP, "product");
            orb orbVar3 = new orb();
            orbVar3.p(cqp.i0(), "user_agent");
            orbVar2.p(orbVar3, "browser");
            orbVar.p(orbVar2, Constants.Params.CLIENT);
            prVar.e("hello", Collections.singletonList(orbVar), (v9i) null);
            odeVar.k(new ug(this.h, (byte) 26));
            for (dnc dncVar : map.keySet()) {
                orb orbVar4 = new orb();
                orbVar4.p(dncVar.a, "envelope_type");
                orbVar4.o(dncVar.b, "id");
                prVar.e("observe", Collections.singletonList(orbVar4), (v9i) null);
            }
        }
    }
}
