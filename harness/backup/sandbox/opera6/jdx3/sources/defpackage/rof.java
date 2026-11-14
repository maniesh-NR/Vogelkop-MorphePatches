package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class rof {
    public static final hp7 a = new hp7(new kof((byte) 2), (byte) 1);
    public static final hp7 b = new hp7(new kof((byte) 3), (byte) 1);
    public static final hp7 c = new hp7(new kof((byte) 3), (byte) 1);
    public static final k5i d = new k5i(u95.b, new j5i(0.122f, 0.122f, 0.122f, 0.122f));
    public static final k5i e = new k5i(u95.c, new j5i(0.2f, 0.2f, 0.2f, 0.2f));

    public static final void a(ue5 ue5Var, ih5 ih5Var, int i) {
        ue5 ue5Var2;
        vt9 vt9Var = (vt9) ih5Var;
        vt9Var.Y(261727435);
        if (vt9Var.N(i & 1, (i & 3) != 2)) {
            boolean zBooleanValue = ((Boolean) vt9Var.j(cab.a)).booleanValue();
            hp7 hp7Var = a;
            if (zBooleanValue) {
                vt9Var.W(1756473574);
                c((nof) vt9Var.j(hp7Var), false, ue5Var, vt9Var, 384, 2);
                vt9Var.p(false);
                znh znhVarR = vt9Var.r();
                if (znhVarR != null) {
                    znhVarR.d = new bg5(ue5Var, i, (byte) 10);
                    return;
                }
                return;
            }
            ue5Var2 = ue5Var;
            vt9Var.W(1756674423);
            vt9Var.p(false);
            Object obj = (Context) vt9Var.j(j41.b);
            boolean zF = vt9Var.f(obj);
            Object objK = vt9Var.K();
            if (zF || objK == hh5.a) {
                for (Object baseContext = obj; baseContext instanceof ContextWrapper; baseContext = ((ContextWrapper) baseContext).getBaseContext()) {
                    if (baseContext instanceof hjf) {
                        objK = ((hjf) baseContext).b;
                        vt9Var.g0(objK);
                    }
                }
                Objects.toString(obj);
                qp2.o("");
                return;
            }
            afe afeVarH = dyg.h(((sof) objK).e, vt9Var);
            kfo.d(new k7h[]{hp7Var.a(((oof) afeVarH.getValue()).a), b.a(Boolean.valueOf(((oof) afeVarH.getValue()).b)), c.a(Boolean.valueOf(((oof) afeVarH.getValue()).c)), bpf.a.a(Boolean.valueOf(((oof) afeVarH.getValue()).d))}, gyg.P(-101537397, new hda(ue5Var2, afeVarH, (byte) 21), vt9Var), vt9Var, 48);
        } else {
            ue5Var2 = ue5Var;
            vt9Var.Q();
        }
        znh znhVarR2 = vt9Var.r();
        if (znhVarR2 != null) {
            znhVarR2.d = new bg5(ue5Var2, i, (byte) 11);
        }
    }

    public static final void b(nof nofVar, boolean z, ue5 ue5Var, ih5 ih5Var, int i) {
        kk3 kk3Var;
        hp2 hp2Var;
        bt8 bt8Var;
        boolean z2;
        vt9 vt9Var = (vt9) ih5Var;
        vt9Var.Y(-1390158195);
        int i2 = (vt9Var.d(nofVar == null ? -1 : nofVar.ordinal()) ? 4 : 2) | i | (vt9Var.g(z) ? 32 : 16) | (vt9Var.h(ue5Var) ? 2048 : 1024);
        if (vt9Var.N(i2 & 1, (i2 & 1171) != 1170)) {
            vt9Var.S();
            if ((i & 1) != 0 && !vt9Var.x()) {
                vt9Var.Q();
            }
            vt9Var.q();
            if (z) {
                switch (nofVar.ordinal()) {
                    case 0:
                        kk3Var = iff.a;
                        break;
                    case 1:
                        kk3Var = asf.a;
                        break;
                    case 2:
                        kk3Var = gbh.a;
                        break;
                    case 3:
                        kk3Var = fdl.a;
                        break;
                    case 4:
                        kk3Var = vwb.a;
                        break;
                    case 5:
                        kk3Var = lk3.a;
                        break;
                    case 6:
                        kk3Var = fqh.a;
                        break;
                    case 7:
                        kk3Var = a4a.a;
                        break;
                    case 8:
                        kk3Var = b4a.a;
                        break;
                    case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                        kk3Var = jen.a;
                        break;
                    default:
                        h9o.p();
                        return;
                }
            } else {
                switch (nofVar.ordinal()) {
                    case 0:
                        kk3Var = iff.b;
                        break;
                    case 1:
                        kk3Var = asf.b;
                        break;
                    case 2:
                        kk3Var = gbh.b;
                        break;
                    case 3:
                        kk3Var = fdl.b;
                        break;
                    case 4:
                        kk3Var = vwb.b;
                        break;
                    case 5:
                        kk3Var = lk3.b;
                        break;
                    case 6:
                        kk3Var = fqh.b;
                        break;
                    case 7:
                        kk3Var = a4a.b;
                        break;
                    case 8:
                        kk3Var = b4a.b;
                        break;
                    case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                        kk3Var = jen.b;
                        break;
                    default:
                        h9o.p();
                        return;
                }
            }
            if (z) {
                hp2Var = v5b.a;
                bt8Var = ct8.a;
                int i3 = ds3.a;
            } else {
                hp2Var = v5b.b;
                bt8Var = ct8.b;
                int i4 = ds3.a;
            }
            akf akfVar = new akf(kk3Var, hp2Var, bt8Var);
            hp7 hp7Var = tpf.a;
            a4o a4oVar = w0h.g(vt9Var).a;
            int i5 = a4oVar.a;
            int i6 = a4oVar.b;
            boolean z3 = i6 < i5;
            boolean zF = vt9Var.f(a4oVar);
            Object objK = vt9Var.K();
            zpa zpaVar = hh5.a;
            if (zF || objK == zpaVar) {
                objK = new spf(i5 >= 840 ? uga.c : i5 >= 600 ? uga.b : uga.a, i6 >= 900 ? l2n.c : i6 >= 480 ? l2n.b : l2n.a, z3);
                vt9Var.g0(objK);
            }
            spf spfVar = (spf) objK;
            boolean z4 = (((i2 & 112) ^ 48) > 32 && vt9Var.g(z)) || (i2 & 48) == 32;
            Object objK2 = vt9Var.K();
            if (z4 || objK2 == zpaVar) {
                objK2 = !z ? d : e;
                vt9Var.g0(objK2);
            }
            k5i k5iVar = (k5i) objK2;
            hp7 hp7Var2 = nlf.a;
            switch (nofVar.ordinal()) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 5:
                case 6:
                case 7:
                case 8:
                case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                    z2 = false;
                    break;
                case 4:
                    z2 = true;
                    break;
                default:
                    h9o.p();
                    return;
            }
            kfo.d(new k7h[]{bkf.a.a(akfVar), tpf.a.a(spfVar), n5i.a.a(k5iVar), nlf.a.a(new rwj(kk3Var.j(), 0L, (ki9) null, (gi9) null, (hi9) null, (lh9) null, (String) null, 0L, (ua3) null, (vil) null, (awc) null, 0L, z2 ? bgl.c : null, (jaj) null, 61438)), bpf.d.a(((Boolean) vt9Var.j(bpf.a)).booleanValue() ? bpf.c : bpf.b)}, gyg.P(907117005, new bg5(ue5Var, (byte) 9), vt9Var), vt9Var, 48);
        } else {
            vt9Var.Q();
        }
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new qof(nofVar, z, ue5Var, i);
        }
    }

    public static final void c(nof nofVar, boolean z, ue5 ue5Var, ih5 ih5Var, int i, int i2) {
        int i3;
        vt9 vt9Var = (vt9) ih5Var;
        vt9Var.Y(-1788478103);
        if ((i & 6) == 0) {
            i3 = (vt9Var.d(nofVar == null ? -1 : nofVar.ordinal()) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= ((i2 & 2) == 0 && vt9Var.g(z)) ? 32 : 16;
        }
        if (vt9Var.N(i3 & 1, (i3 & 147) != 146)) {
            vt9Var.S();
            int i4 = i & 1;
            hp7 hp7Var = b;
            if (i4 != 0 && !vt9Var.x()) {
                vt9Var.Q();
            } else if ((i2 & 2) != 0) {
                z = ((Boolean) vt9Var.j(hp7Var)).booleanValue();
            }
            vt9Var.q();
            kfo.d(new k7h[]{a.a(nofVar), hp7Var.a(Boolean.valueOf(z))}, gyg.P(46850217, new qof(nofVar, z, ue5Var), vt9Var), vt9Var, 48);
        } else {
            vt9Var.Q();
        }
        boolean z2 = z;
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new py5(nofVar, z2, ue5Var, i, i2);
        }
    }
}
