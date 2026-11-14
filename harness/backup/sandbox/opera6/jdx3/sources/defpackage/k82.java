package defpackage;

import android.text.TextUtils;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Objects;

/* loaded from: classes.dex */
public final class k82 extends z4o {
    public final /* synthetic */ byte r;
    public final Object s;
    public final Object t;

    public /* synthetic */ k82(Object obj, Object obj2, byte b) {
        this.r = b;
        this.s = obj2;
        this.t = obj;
    }

    public k82(s14 s14Var, so4 so4Var) {
        this.r = (byte) 1;
        this.s = so4Var;
        Objects.requireNonNull(s14Var);
        this.t = s14Var;
    }

    public k82(z4o z4oVar, vr9 vr9Var) {
        this.r = (byte) 2;
        this.s = z4oVar;
        this.t = vr9Var;
    }

    public final void Y(String str, boolean z) {
        byte b = this.r;
        Object obj = this.t;
        Object obj2 = this.s;
        switch (b) {
            case 0:
                ((m82) obj2).w((n82) obj);
                break;
            case 1:
                ((so4) obj2).a(null);
                break;
            case 2:
                ((z4o) obj2).Y(str, z);
                ((vr9) obj).run();
                break;
            case 3:
                ((b15) obj2).f(null, null, false);
                break;
            default:
                ((xla) obj2).f(null);
                break;
        }
    }

    public final boolean Z(pzh pzhVar, byte[] bArr) {
        switch (this.r) {
            case 2:
                if (!((z4o) this.s).Z(pzhVar, bArr)) {
                    return false;
                }
                ((vr9) this.t).run();
                return true;
            default:
                return super.Z(pzhVar, bArr);
        }
    }

    public final boolean b0(pzh pzhVar, byte[] bArr) {
        switch (this.r) {
            case 2:
                if (!((z4o) this.s).b0(pzhVar, bArr)) {
                    return false;
                }
                ((vr9) this.t).run();
                return true;
            default:
                return super.b0(pzhVar, bArr);
        }
    }

    public final void c0(pzh pzhVar, orb orbVar) {
        byte b = this.r;
        Object obj = this.t;
        Object obj2 = this.s;
        switch (b) {
            case 0:
                n82 n82Var = (n82) obj;
                ((m82) obj2).k(n82Var, n82Var.T(n82Var.R(orbVar), (String) n82Var.d));
                break;
            case 1:
                s14 s14Var = (s14) obj;
                so4 so4Var = (so4) obj2;
                s14Var.getClass();
                vpb vpbVarH = orbVar.h("cities");
                so4Var.a(vpbVarH != null ? nb6.J(sfe.M0(e15.a(vpbVarH, s14Var.b), new b10((byte) 4))) : null);
                break;
            case 2:
                ((z4o) obj2).c0(pzhVar, orbVar);
                ((vr9) obj).run();
                break;
            case 3:
                vw9 vw9Var = (vw9) obj;
                pzh pzhVar2 = pzhVar.j;
                final int i = 1;
                boolean z = pzhVar2 != null;
                b15 b15Var = (b15) obj2;
                boolean z2 = vw9Var.f;
                vpb vpbVarH2 = orbVar.h("ip_cities");
                ArrayList arrayListJ = vpbVarH2 != null ? nb6.J(sfe.M0(e15.a(vpbVarH2, z2), new xq9() { // from class: uw9
                    public final Object apply(Object obj3) {
                        e15 e15Var = (e15) obj3;
                        return new bre(i, e15Var.a, e15Var.b, e15Var.c, e15Var.d);
                    }
                })) : null;
                vpb vpbVarH3 = orbVar.h("top_cities");
                if (vpbVarH3 != null) {
                    final int i2 = 2;
                    arrayListJ = nb6.J(sfe.M0(e15.a(vpbVarH3, z2), new xq9() { // from class: uw9
                        public final Object apply(Object obj3) {
                            e15 e15Var = (e15) obj3;
                            return new bre(i2, e15Var.a, e15Var.b, e15Var.c, e15Var.d);
                        }
                    }));
                }
                b15Var.f(arrayListJ, arrayListJ, z);
                break;
            default:
                xla xlaVar = (xla) obj2;
                x79 x79Var = (x79) obj;
                try {
                    String strM = orbVar.m("news_feed_host", "");
                    if (strM.isEmpty()) {
                        strM = null;
                    }
                    String strM2 = orbVar.m("article_detail_host", "");
                    if (strM2.isEmpty()) {
                        strM2 = null;
                    }
                    orbVar.m("account_host", "").getClass();
                    if (TextUtils.isEmpty(strM) || TextUtils.isEmpty(strM2)) {
                        Y("Invalid configuration", false);
                    } else {
                        xlaVar.f(new yla(new URL(strM), new URL(strM2), 1, (l0c) x79Var.a, false));
                    }
                    break;
                } catch (MalformedURLException unused) {
                    xlaVar.f(null);
                    return;
                }
        }
    }
}
