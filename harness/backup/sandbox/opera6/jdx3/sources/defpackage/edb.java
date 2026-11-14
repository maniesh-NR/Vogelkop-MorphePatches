package defpackage;

import android.content.SharedPreferences;
import com.opera.android.browser.obml.Platform;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;

/* loaded from: classes.dex */
public final class edb implements f7f {
    public final /* synthetic */ byte a = 1;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;

    public edb(Object obj, ekc ekcVar, f7f f7fVar, ode odeVar) {
        this.b = obj;
        this.c = ekcVar;
        this.d = f7fVar;
        this.e = odeVar;
    }

    public edb(ndc ndcVar, yug yugVar, slk slkVar, ltg ltgVar) {
        final byte b = 0;
        h42 h42Var = new h42();
        this.e = h42Var;
        this.b = yugVar;
        this.c = slkVar;
        this.d = ltgVar;
        h42Var.s(slkVar.i, new f7f(this) { // from class: ddb
            public final /* synthetic */ edb b;

            {
                this.b = this;
            }

            public final void d0(Object obj) {
                byte b2 = b;
                edb edbVar = this.b;
                switch (b2) {
                    case 0:
                        edbVar.a();
                        break;
                    default:
                        edbVar.a();
                        break;
                }
            }
        });
        final byte b2 = 1;
        h42Var.s(slkVar.c.g, new f7f(this) { // from class: ddb
            public final /* synthetic */ edb b;

            {
                this.b = this;
            }

            public final void d0(Object obj) {
                byte b22 = b2;
                edb edbVar = this.b;
                switch (b22) {
                    case 0:
                        edbVar.a();
                        break;
                    default:
                        edbVar.a();
                        break;
                }
            }
        });
        h42Var.j(ndcVar, this);
    }

    public edb(slk slkVar, fqe fqeVar, m9c m9cVar, x5f x5fVar, vvg vvgVar) {
        this.b = fqeVar;
        this.c = m9cVar;
        this.d = x5fVar;
        this.e = vvgVar;
        slkVar.i.k(this);
    }

    public final void a() {
        h42 h42Var = (h42) this.e;
        slk slkVar = (slk) this.c;
        wvg wvgVar = (wvg) slkVar.i.g();
        int iOrdinal = uvg.d(wvgVar).ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 1 && iOrdinal != 2) {
                if (iOrdinal != 3) {
                    if (iOrdinal != 4) {
                        return;
                    }
                }
            }
            h42Var.r(Boolean.valueOf(wvgVar.b()));
            return;
        }
        int i = ((qtg) slkVar.c.g.g()).a;
        if (i == -1) {
            return;
        }
        h42Var.r(Boolean.valueOf(i != 1));
    }

    public final void d0(Object obj) throws JSONException {
        byte b = this.a;
        Object obj2 = this.c;
        Object obj3 = this.e;
        Object obj4 = this.b;
        Object obj5 = this.d;
        switch (b) {
            case 0:
                ((h42) obj3).p(this);
                if (((Boolean) obj).booleanValue()) {
                    yug yugVar = (yug) obj4;
                    yugVar.getClass();
                    yug.c(yugVar, 5, (ltg) obj5, 4);
                    break;
                }
                break;
            case 1:
                if (!Intrinsics.a(obj, obj4)) {
                    ((ekc) obj2).p((f7f) obj5);
                    ((ode) obj3).p(this);
                    break;
                }
                break;
            default:
                wvg wvgVar = (wvg) obj;
                uvg uvgVarD = uvg.d(wvgVar);
                if (uvgVarD != uvg.LOADING) {
                    jmk jmkVar = wvgVar.h;
                    String str = "";
                    String str2 = jmkVar == null ? "" : jmkVar.a;
                    boolean z = uvgVarD == uvg.ACTIVE;
                    int iOrdinal = uvgVarD.ordinal();
                    boolean z2 = iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 4;
                    x5f x5fVar = (x5f) obj5;
                    zpa zpaVar = x5fVar.d;
                    x56 x56VarF = zpa.F();
                    x56VarF.O(zpaVar).r(2, 1, z);
                    x5fVar.U0(x56VarF);
                    Platform.e(z);
                    fqe fqeVar = (fqe) obj4;
                    fqeVar.k = z;
                    uqe uqeVar = fqeVar.c;
                    if (uqeVar != null) {
                        g93 g93Var = uqeVar.i;
                        if (z != g93Var.s) {
                            g93Var.s = z;
                            fue fueVar = g93Var.n;
                            fueVar.d();
                            if (fueVar.a == cue.NewsFeed) {
                                g93Var.c();
                            }
                        }
                    }
                    m9c m9cVar = (m9c) obj2;
                    if (((SharedPreferences) m9cVar.b.get()).getBoolean("premium", false) != z) {
                        ((SharedPreferences) m9cVar.b.get()).edit().putBoolean("premium", z).putBoolean("has_premium_subscription", z2).putString("premium_subscription_source", str2).apply();
                    }
                    vvg vvgVar = (vvg) obj3;
                    byte b2 = vvgVar.a;
                    if (b2 != 1 || z) {
                        byte b3 = z ? (byte) 2 : (byte) 0;
                        if (b3 != b2) {
                            vvgVar.a = b3;
                            if (b3 == 1) {
                                str = "candidate";
                            } else if (b3 == 2) {
                                str = "premium";
                            }
                            ks3.I(42, str);
                            break;
                        }
                    }
                }
                break;
        }
    }
}
