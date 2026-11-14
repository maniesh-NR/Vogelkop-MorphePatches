package defpackage;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import androidx.fragment.app.r;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes.dex */
public final class x5f implements ubk, orm, skm {
    public final b59 a;
    public final umi b;
    public final Context c;
    public final zpa d = new zpa(20);
    public final qie e = new qie((byte) 19);
    public final mgh f = new mgh((byte) 0);
    public final f11 g;
    public boolean h;

    public x5f(Context context, b59 b59Var, umi umiVar) {
        this.a = b59Var;
        this.b = umiVar;
        this.c = context.getApplicationContext();
        this.g = new f11(context, lkk.ANALYTICS);
    }

    public static void W0(qu0 qu0Var, uu0 uu0Var, String str, String str2, pu0 pu0Var) {
        qu0Var.getClass();
        qu0Var.q(0, 1, uu0Var);
        qu0Var.q(1, 1, str);
        qu0Var.q(2, 1, str2);
        qu0Var.q(3, 1, pu0Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x005f, code lost:
    
        if (r0.equals("") == false) goto L38;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String f(android.net.Uri r2) {
        /*
            java.lang.String r0 = "udm"
            java.lang.String r0 = r2.getQueryParameter(r0)
            if (r0 == 0) goto L62
            int r1 = r0.hashCode()
            if (r1 == 0) goto L59
            r2 = 50
            if (r1 == r2) goto L4e
            r2 = 55
            if (r1 == r2) goto L43
            r2 = 1571(0x623, float:2.201E-42)
            if (r1 == r2) goto L38
            r2 = 1638(0x666, float:2.295E-42)
            if (r1 == r2) goto L2d
            r2 = 1691(0x69b, float:2.37E-42)
            if (r1 != r2) goto L61
            java.lang.String r2 = "50"
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L61
            java.lang.String r2 = "ai_mode"
            return r2
        L2d:
            java.lang.String r2 = "39"
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L61
            java.lang.String r2 = "short_videos"
            return r2
        L38:
            java.lang.String r2 = "14"
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L61
            java.lang.String r2 = "web"
            return r2
        L43:
            java.lang.String r2 = "7"
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L61
            java.lang.String r2 = "videos"
            return r2
        L4e:
            java.lang.String r2 = "2"
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L61
            java.lang.String r2 = "images"
            return r2
        L59:
            java.lang.String r1 = ""
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L62
        L61:
            return r0
        L62:
            java.lang.String r0 = "tbm"
            java.lang.String r2 = r2.getQueryParameter(r0)
            if (r2 == 0) goto L7e
            int r0 = r2.hashCode()
            r1 = 109514(0x1abca, float:1.53462E-40)
            if (r0 != r1) goto L7e
            java.lang.String r0 = "nws"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L7e
            java.lang.String r2 = "news"
            return r2
        L7e:
            java.lang.String r2 = "all"
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x5f.f(android.net.Uri):java.lang.String");
    }

    public final void A(boolean z, boolean z2) {
        if (this.h) {
            x56 x56VarF = zpa.F();
            b66 b66VarF = x56VarF.F(this.d);
            if (z2) {
                e80 e80Var = z ? e80.b : e80.c;
                b66VarF.getClass();
                b66VarF.q(57, 1, e80Var);
            } else {
                b66VarF.getClass();
                b66VarF.q(57, 1, e80.d);
            }
            U0(x56VarF);
        }
    }

    public final void A0(b60 b60Var) {
        if (this.h) {
            x56 x56VarF = zpa.F();
            b66 b66VarF = x56VarF.F(this.d);
            b66VarF.getClass();
            b66VarF.q(76, 1, b60Var);
            U0(x56VarF);
        }
    }

    public final void B(boolean z, boolean z2) {
        if (this.h) {
            x56 x56VarF = zpa.F();
            b66 b66VarF = x56VarF.F(this.d);
            if (z2) {
                e80 e80Var = z ? e80.b : e80.c;
                b66VarF.getClass();
                b66VarF.q(58, 1, e80Var);
            } else {
                b66VarF.getClass();
                b66VarF.q(58, 1, e80.d);
            }
            U0(x56VarF);
        }
    }

    public final void B0(ab0 ab0Var) {
        if (this.h) {
            x56 x56VarF = zpa.F();
            b66 b66VarF = x56VarF.F(this.d);
            b66VarF.getClass();
            b66VarF.q(6, 1, ab0Var);
            U0(x56VarF);
        }
    }

    public final void C(boolean z, boolean z2, boolean z3) {
        if (this.h) {
            x56 x56VarF = zpa.F();
            zpa zpaVar = this.d;
            hm0 hm0VarH = x56VarF.H(zpaVar);
            b66 b66VarF = x56VarF.F(zpaVar);
            if (z2) {
                e80 e80Var = z ? e80.b : e80.c;
                hm0VarH.getClass();
                hm0VarH.q(1, 1, e80Var);
                cp0 cp0Var = z3 ? cp0.b : cp0.c;
                b66VarF.getClass();
                b66VarF.q(31, 1, cp0Var);
            } else {
                hm0VarH.getClass();
                hm0VarH.q(1, 1, e80.d);
                b66VarF.getClass();
                b66VarF.q(31, 1, cp0.d);
            }
            U0(x56VarF);
        }
    }

    public final void C0(yf0 yf0Var) {
        if (this.h) {
            x56 x56VarF = zpa.F();
            b66 b66VarF = x56VarF.F(this.d);
            b66VarF.getClass();
            b66VarF.q(10, 1, yf0Var);
            U0(x56VarF);
        }
    }

    public final void D(fq0 fq0Var) {
        if (this.h) {
            x56 x56VarF = zpa.F();
            zpa zpaVar = this.d;
            xb0 xb0VarX = x56VarF.B(zpaVar).x(zpaVar);
            u80 u80Var = new u80(2443, -1, 1);
            u80Var.q(0, 1, fq0Var);
            List list = (List) xb0VarX.n(40);
            ((list == null || list.isEmpty()) ? new hf0(xb0VarX, 40, am2.q(xb0VarX, 40, 1)) : new hf0(xb0VarX, 40, list)).add(u80Var);
            U0(x56VarF);
        }
    }

    public final void D0(dj0 dj0Var) {
        if (this.h) {
            x56 x56VarF = zpa.F();
            b66 b66VarF = x56VarF.F(this.d);
            b66VarF.getClass();
            b66VarF.q(13, 1, dj0Var);
            U0(x56VarF);
        }
    }

    public final void E(vb0 vb0Var, boolean z) {
        if (this.h) {
            sm0 sm0Var = new sm0(2443, -1, 2);
            sm0Var.q(0, 1, vb0Var);
            sm0Var.r(1, 1, z);
            x56 x56VarF = zpa.F();
            zpa zpaVar = this.d;
            xb0 xb0VarX = x56VarF.B(zpaVar).x(zpaVar);
            List list = (List) xb0VarX.n(43);
            ((list == null || list.isEmpty()) ? new hf0(xb0VarX, 43, am2.q(xb0VarX, 43, 1)) : new hf0(xb0VarX, 43, list)).add(sm0Var);
            U0(x56VarF);
        }
    }

    public final void E0(uk0 uk0Var) {
        if (this.h) {
            x56 x56VarF = zpa.F();
            b66 b66VarF = x56VarF.F(this.d);
            b66VarF.getClass();
            b66VarF.q(52, uk0Var == null ? 0 : 1, uk0Var);
            U0(x56VarF);
        }
    }

    public final void F(String str, y90 y90Var, List list, boolean z) {
        x56 x56VarF = zpa.F();
        x90 x90Var = new x90(2443, -1, 4);
        byte b = 1;
        x90Var.q(0, str == null ? 0 : 1, str);
        x90Var.r(2, 1, z);
        x90Var.q(1, 1, y90Var);
        List list2 = (List) list.stream().map(new m1e(new zbe(this, (byte) 25), b)).collect(Collectors.toList());
        if (!list2.isEmpty()) {
            x90Var.q(3, list2 != null ? 1 : 0, list2);
        }
        qd0 qd0VarB = x56VarF.B(this.d);
        List list3 = (List) qd0VarB.n(47);
        ((list3 == null || list3.isEmpty()) ? new hf0(qd0VarB, 47, vep.t(qd0VarB, 47, 1)) : new hf0(qd0VarB, 47, list3)).add(x90Var);
        U0(x56VarF);
    }

    public final void F0(ko0 ko0Var) {
        if (this.h) {
            x56 x56VarF = zpa.F();
            b66 b66VarF = x56VarF.F(this.d);
            b66VarF.getClass();
            b66VarF.q(19, 1, ko0Var);
            U0(x56VarF);
        }
    }

    public final void G(vb0 vb0Var, aa0 aa0Var, String str) {
        if (this.h) {
            z90 z90Var = new z90(2443, -1, 3);
            z90Var.q(0, 1, vb0Var);
            z90Var.q(1, 1, aa0Var);
            z90Var.q(2, str != null ? 1 : 0, str);
            x56 x56VarF = zpa.F();
            zpa zpaVar = this.d;
            xb0 xb0VarX = x56VarF.B(zpaVar).x(zpaVar);
            List list = (List) xb0VarX.n(38);
            ((list == null || list.isEmpty()) ? new hf0(xb0VarX, 38, am2.q(xb0VarX, 38, 1)) : new hf0(xb0VarX, 38, list)).add(z90Var);
            U0(x56VarF);
        }
    }

    public final void G0(vd0 vd0Var) {
        if (this.h) {
            x56 x56VarF = zpa.F();
            b66 b66VarF = x56VarF.F(this.d);
            b66VarF.getClass();
            b66VarF.q(71, 1, vd0Var);
            U0(x56VarF);
        }
    }

    public final void H(p90 p90Var) {
        if (this.h) {
            ya0 ya0Var = new ya0(2443, -1, 1);
            ya0Var.q(0, 1, p90Var);
            x56 x56VarF = zpa.F();
            zpa zpaVar = this.d;
            xb0 xb0VarX = x56VarF.B(zpaVar).x(zpaVar);
            List list = (List) xb0VarX.n(12);
            ((list == null || list.isEmpty()) ? new hf0(xb0VarX, 12, am2.q(xb0VarX, 12, 1)) : new hf0(xb0VarX, 12, list)).add(ya0Var);
            U0(x56VarF);
        }
    }

    public final void H0(wq0 wq0Var) {
        if (this.h) {
            x56 x56VarF = zpa.F();
            b66 b66VarF = x56VarF.F(this.d);
            b66VarF.getClass();
            b66VarF.q(33, 1, wq0Var);
            U0(x56VarF);
        }
    }

    public final void I(w2b w2bVar, c3b c3bVar, v2b v2bVar, eb0 eb0Var) {
        if (this.h) {
            x56 x56VarF = zpa.F();
            new ck0(this.d, x56VarF).b(new rg((Object) w2bVar, (Object) c3bVar, (Object) v2bVar, (Object) eb0Var, (byte) 10));
            U0(x56VarF);
        }
    }

    public final void I0(js0 js0Var) {
        if (this.h) {
            x56 x56VarF = zpa.F();
            b66 b66VarF = x56VarF.F(this.d);
            b66VarF.getClass();
            b66VarF.q(78, 1, js0Var);
            U0(x56VarF);
        }
    }

    public final void J(long j, long j2, String str) {
        if0 if0Var;
        if (this.h) {
            x56 x56VarF = zpa.F();
            Map map = (Map) x56VarF.n(46);
            if (map == null || map.isEmpty()) {
                HashMap map2 = new HashMap();
                x56VarF.q(46, 1, map2);
                if0Var = new if0(x56VarF, 46, map2);
            } else {
                if0Var = new if0(x56VarF, 46, map);
            }
            fb0 fb0Var = (fb0) if0Var.get(str);
            if (fb0Var == null) {
                fb0Var = new fb0(2443, -1, 2);
                if0Var.put(str, fb0Var);
            } else {
                Long l = (Long) fb0Var.n(1);
                j += l != null ? l.longValue() : 0L;
                Long l2 = (Long) fb0Var.n(0);
                j2 += l2 != null ? l2.longValue() : 0L;
            }
            fb0Var.p(1, 1, j);
            fb0Var.p(0, 1, j2);
            U0(x56VarF);
        }
    }

    public final void J0(it0 it0Var) {
        if (this.h) {
            x56 x56VarF = zpa.F();
            b66 b66VarF = x56VarF.F(this.d);
            b66VarF.getClass();
            b66VarF.q(12, 1, it0Var);
            U0(x56VarF);
        }
    }

    public final void K(String str, ib0 ib0Var, String str2, String str3, String str4, boolean z) {
        if (this.h) {
            x56 x56VarF = zpa.F();
            qd0 qd0VarB = x56VarF.B(this.d);
            hb0 hb0Var = new hb0(2443, -1, 4);
            if (str2 != null || str3 != null || str4 != null) {
                gb0 gb0Var = new gb0(2443, 1, 3);
                gb0Var.x(0, str2);
                gb0Var.x(1, str3);
                gb0Var.x(2, str4);
                hb0Var.q(3, 1, gb0Var);
            }
            hb0Var.q(1, str == null ? 0 : 1, str);
            hb0Var.q(0, 1, ib0Var);
            hb0Var.r(2, 1, z);
            List list = (List) qd0VarB.n(35);
            ((list == null || list.isEmpty()) ? new hf0(qd0VarB, 35, vep.t(qd0VarB, 35, 1)) : new hf0(qd0VarB, 35, list)).add(hb0Var);
            U0(x56VarF);
        }
    }

    public final void K0(final int i, final boolean z) {
        if (this.h) {
            x56 x56VarF = zpa.F();
            new ck0(this.d, x56VarF).j(new Function1() { // from class: m5f
                public final Object invoke(Object obj) {
                    if0 if0Var;
                    hi0 hi0Var = (hi0) obj;
                    String strValueOf = String.valueOf((int) i);
                    hi0Var.a.getClass();
                    br0 br0Var = new br0(2443, -1, 2);
                    fi0 fi0Var = hi0Var.b;
                    Map map = (Map) fi0Var.n(42);
                    if (map == null || map.isEmpty()) {
                        HashMap map2 = new HashMap();
                        fi0Var.q(42, 1, map2);
                        if0Var = new if0(fi0Var, 42, map2);
                    } else {
                        if0Var = new if0(fi0Var, 42, map);
                    }
                    if0Var.put(strValueOf, br0Var);
                    if (z) {
                        br0Var.p(0, 1, 1L);
                    } else {
                        br0Var.p(1, 1, 1L);
                    }
                    return Unit.a;
                }
            });
            U0(x56VarF);
        }
    }

    public final void L(int i, wb0 wb0Var, Integer num) {
        if (this.h) {
            x56 x56VarF = zpa.F();
            new ck0(this.d, x56VarF).b(new j5f(i, wb0Var, num));
            U0(x56VarF);
        }
    }

    public final void L0(kr0 kr0Var) {
        if (this.h) {
            x56 x56VarF = zpa.F();
            lr0 lr0Var = new lr0(2443, -1, 1);
            lr0Var.q(0, 1, kr0Var);
            qd0 qd0VarB = x56VarF.B(this.d);
            List list = (List) qd0VarB.n(48);
            ((list == null || list.isEmpty()) ? new hf0(qd0VarB, 48, vep.t(qd0VarB, 48, 1)) : new hf0(qd0VarB, 48, list)).add(lr0Var);
            U0(x56VarF);
        }
    }

    public final void M(jc0 jc0Var, nc0 nc0Var) {
        if (this.h) {
            ic0 ic0Var = new ic0(2443, -1, 2);
            ic0Var.q(0, 1, jc0Var);
            ic0Var.q(1, 1, nc0Var);
            x56 x56VarF = zpa.F();
            zpa zpaVar = this.d;
            xb0 xb0VarX = x56VarF.B(zpaVar).x(zpaVar);
            List list = (List) xb0VarX.n(7);
            ((list == null || list.isEmpty()) ? new hf0(xb0VarX, 7, am2.q(xb0VarX, 7, 1)) : new hf0(xb0VarX, 7, list)).add(ic0Var);
            U0(x56VarF);
        }
    }

    public final void M0(int i, op0 op0Var, boolean z) {
        if (this.h) {
            x56 x56VarF = zpa.F();
            ds0 ds0Var = new ds0(2443, -1, 2);
            ds0Var.q(0, 1, z ? vd0.b : vd0.c);
            ds0Var.q(1, 1, op0Var);
            x56VarF.U().put(String.valueOf(i), ds0Var);
            U0(x56VarF);
        }
    }

    public final void N(kc0 kc0Var, mc0 mc0Var, boolean z, boolean z2, boolean z3, boolean z4, nc0 nc0Var) {
        if (this.h) {
            x56 x56VarF = zpa.F();
            zpa zpaVar = this.d;
            xb0 xb0VarX = x56VarF.B(zpaVar).x(zpaVar);
            lc0 lc0Var = new lc0(2443, -1, 7);
            lc0Var.q(0, kc0Var == null ? 0 : 1, kc0Var);
            lc0Var.q(2, mc0Var != null ? 1 : 0, mc0Var);
            lc0Var.r(1, 1, z);
            lc0Var.r(3, 1, z2);
            lc0Var.r(4, 1, z3);
            lc0Var.r(5, 1, z4);
            lc0Var.q(6, 1, nc0Var);
            List list = (List) xb0VarX.n(6);
            ((list == null || list.isEmpty()) ? new hf0(xb0VarX, 6, am2.q(xb0VarX, 6, 1)) : new hf0(xb0VarX, 6, list)).add(lc0Var);
            U0(x56VarF);
        }
    }

    public final void N0(int i) {
        if (this.h) {
            x56 x56VarF = zpa.F();
            ds0 ds0Var = new ds0(2443, -1, 2);
            ds0Var.q(0, 1, vd0.d);
            x56VarF.U().put(String.valueOf(i), ds0Var);
            U0(x56VarF);
        }
    }

    public final void O(oc0 oc0Var, nc0 nc0Var) {
        if (this.h) {
            x56 x56VarF = zpa.F();
            pc0 pc0Var = new pc0(2443, -1, 2);
            pc0Var.q(0, oc0Var == null ? 0 : 1, oc0Var);
            pc0Var.q(1, 1, nc0Var);
            qd0 qd0VarB = x56VarF.B(this.d);
            List list = (List) qd0VarB.n(4);
            ((list == null || list.isEmpty()) ? new hf0(qd0VarB, 4, vep.t(qd0VarB, 4, 1)) : new hf0(qd0VarB, 4, list)).add(pc0Var);
            U0(x56VarF);
        }
    }

    public final void O0(vb0 vb0Var, boolean z) {
        if (this.h) {
            x56 x56VarF = zpa.F();
            zpa zpaVar = this.d;
            xb0 xb0VarX = x56VarF.B(zpaVar).x(zpaVar);
            dt0 dt0Var = new dt0(2443, -1, 2);
            dt0Var.q(1, 1, z ? et0.b : et0.c);
            dt0Var.q(0, 1, vb0Var);
            List list = (List) xb0VarX.n(18);
            ((list == null || list.isEmpty()) ? new hf0(xb0VarX, 18, am2.q(xb0VarX, 18, 1)) : new hf0(xb0VarX, 18, list)).add(dt0Var);
            U0(x56VarF);
        }
    }

    public final void P(qc0 qc0Var, nc0 nc0Var) {
        x56 x56VarF = zpa.F();
        rc0 rc0Var = new rc0(2443, -1, 2);
        rc0Var.q(0, 1, qc0Var);
        if (nc0Var != null) {
            rc0Var.q(1, 1, nc0Var);
        }
        qd0 qd0VarB = x56VarF.B(this.d);
        List list = (List) qd0VarB.n(3);
        ((list == null || list.isEmpty()) ? new hf0(qd0VarB, 3, vep.t(qd0VarB, 3, 1)) : new hf0(qd0VarB, 3, list)).add(rc0Var);
        U0(x56VarF);
    }

    public final void P0(vb0 vb0Var) {
        if (this.h) {
            x56 x56VarF = zpa.F();
            st0 st0Var = new st0(2443, -1, 1);
            st0Var.q(0, 1, vb0Var);
            zpa zpaVar = this.d;
            xb0 xb0VarX = x56VarF.B(zpaVar).x(zpaVar);
            List list = (List) xb0VarX.n(30);
            ((list == null || list.isEmpty()) ? new hf0(xb0VarX, 30, am2.q(xb0VarX, 30, 1)) : new hf0(xb0VarX, 30, list)).add(st0Var);
            U0(x56VarF);
        }
    }

    public final void Q(vb0 vb0Var) {
        if (this.h) {
            sc0 sc0Var = new sc0(2443, -1, 1);
            sc0Var.q(0, 1, vb0Var);
            x56 x56VarF = zpa.F();
            zpa zpaVar = this.d;
            xb0 xb0VarX = x56VarF.B(zpaVar).x(zpaVar);
            List list = (List) xb0VarX.n(34);
            ((list == null || list.isEmpty()) ? new hf0(xb0VarX, 34, am2.q(xb0VarX, 34, 1)) : new hf0(xb0VarX, 34, list)).add(sc0Var);
            U0(x56VarF);
        }
    }

    public final void Q0(vt0 vt0Var) {
        if (this.h) {
            x56 x56VarF = zpa.F();
            new ck0(this.d, x56VarF).b(new o5f((Object) vt0Var, (byte) 2));
            U0(x56VarF);
        }
    }

    public final void R(int i, String str) {
        if (this.h) {
            zc0 zc0Var = new zc0(2443, -1, 2);
            zc0Var.p(0, 1, i);
            zc0Var.q(1, str != null ? 1 : 0, str);
            x56 x56VarF = zpa.F();
            x56VarF.z(this.d).B().add(zc0Var);
            U0(x56VarF);
        }
    }

    public final void R0(ou0 ou0Var) {
        if (this.h) {
            x56 x56VarF = zpa.F();
            nu0 nu0Var = new nu0(2443, 1, 3);
            nu0Var.q(0, 1, ou0Var);
            b66 b66VarF = x56VarF.F(this.d);
            b66VarF.getClass();
            b66VarF.q(70, 1, nu0Var);
            U0(x56VarF);
        }
    }

    public final void S(int i) {
        if0 if0Var;
        if (this.h) {
            x56 x56VarF = zpa.F();
            fi0 fi0VarE = x56VarF.E(this.d);
            Map map = (Map) fi0VarE.n(32);
            if (map == null || map.isEmpty()) {
                HashMap map2 = new HashMap();
                fi0VarE.q(32, 1, map2);
                if0Var = new if0(fi0VarE, 32, map2);
            } else {
                if0Var = new if0(fi0VarE, 32, map);
            }
            if0Var.put(String.valueOf(i), 1L);
            U0(x56VarF);
        }
    }

    public final void S0(fv0 fv0Var) {
        if (this.h) {
            x56 x56VarF = zpa.F();
            qd0 qd0VarB = x56VarF.B(this.d);
            List list = (List) qd0VarB.n(28);
            hf0 hf0Var = (list == null || list.isEmpty()) ? new hf0(qd0VarB, 28, vep.t(qd0VarB, 28, 1)) : new hf0(qd0VarB, 28, list);
            ev0 ev0Var = new ev0(2443, -1, 1);
            ev0Var.q(0, 1, fv0Var);
            hf0Var.add(ev0Var);
            U0(x56VarF);
        }
    }

    public final void T(boolean z, String str, le0 le0Var, je0 je0Var) {
        if (this.h) {
            x56 x56VarF = zpa.F();
            qd0 qd0VarB = x56VarF.B(this.d);
            ke0 ke0Var = new ke0(2443, -1, 4);
            ke0Var.q(3, 1, je0Var);
            ke0Var.q(2, le0Var == null ? 0 : 1, le0Var);
            ke0Var.r(0, 1, z);
            if (Intrinsics.a(le0Var, le0.b)) {
                ke0Var.q(1, str != null ? 1 : 0, str);
            }
            List list = (List) qd0VarB.n(34);
            ((list == null || list.isEmpty()) ? new hf0(qd0VarB, 34, vep.t(qd0VarB, 34, 1)) : new hf0(qd0VarB, 34, list)).add(ke0Var);
            U0(x56VarF);
        }
    }

    public final void T0(Function1 function1) {
        x56 x56VarF = zpa.F();
        function1.invoke(new ck0(this.d, x56VarF));
        U0(x56VarF);
    }

    public final void U(fq0 fq0Var) {
        if (this.h) {
            x56 x56VarF = zpa.F();
            zpa zpaVar = this.d;
            xb0 xb0VarX = x56VarF.B(zpaVar).x(zpaVar);
            te0 te0Var = new te0(2443, -1, 1);
            te0Var.q(0, 1, fq0Var);
            List list = (List) xb0VarX.n(39);
            ((list == null || list.isEmpty()) ? new hf0(xb0VarX, 39, am2.q(xb0VarX, 39, 1)) : new hf0(xb0VarX, 39, list)).add(te0Var);
            U0(x56VarF);
        }
    }

    public final void U0(x56 x56Var) {
        if (this.f.c(x56Var)) {
            return;
        }
        new rml(Unit.a, this.b).a(new i5f(this, (byte) 1)).m(this.e);
    }

    public final void V(we0 we0Var, ci0 ci0Var) {
        if (this.h) {
            x56 x56VarF = zpa.F();
            zpa zpaVar = this.d;
            xb0 xb0VarX = x56VarF.B(zpaVar).x(zpaVar);
            cf0 cf0Var = new cf0(2443, -1, 2);
            cf0Var.q(0, 1, we0Var);
            cf0Var.q(1, 1, ci0Var);
            List list = (List) xb0VarX.n(23);
            ((list == null || list.isEmpty()) ? new hf0(xb0VarX, 23, am2.q(xb0VarX, 23, 1)) : new hf0(xb0VarX, 23, list)).add(cf0Var);
            U0(x56VarF);
        }
    }

    public final void V0(wn0 wn0Var) {
        x56 x56VarF = zpa.F();
        qd0 qd0VarB = x56VarF.B(this.d);
        List list = (List) qd0VarB.n(24);
        ((list == null || list.isEmpty()) ? new hf0(qd0VarB, 24, vep.t(qd0VarB, 24, 1)) : new hf0(qd0VarB, 24, list)).add(wn0Var);
        U0(x56VarF);
    }

    public final void W(kf0 kf0Var, mf0 mf0Var) {
        if (this.h) {
            lf0 lf0Var = new lf0(2443, -1, 2);
            lf0Var.q(0, 1, kf0Var);
            lf0Var.q(1, 1, mf0Var);
            x56 x56VarF = zpa.F();
            zpa zpaVar = this.d;
            xb0 xb0VarX = x56VarF.B(zpaVar).x(zpaVar);
            List list = (List) xb0VarX.n(35);
            ((list == null || list.isEmpty()) ? new hf0(xb0VarX, 35, am2.q(xb0VarX, 35, 1)) : new hf0(xb0VarX, 35, list)).add(lf0Var);
            U0(x56VarF);
        }
    }

    public final void X(z80 z80Var) {
        if (this.h) {
            x56 x56VarF = zpa.F();
            y80 y80Var = new y80(2443, -1, 1);
            y80Var.q(0, 1, z80Var);
            qd0 qd0VarB = x56VarF.B(this.d);
            List list = (List) qd0VarB.n(53);
            ((list == null || list.isEmpty()) ? new hf0(qd0VarB, 53, vep.t(qd0VarB, 53, 1)) : new hf0(qd0VarB, 53, list)).add(y80Var);
            U0(x56VarF);
        }
    }

    public final void Y(gg0 gg0Var, vb0 vb0Var, long j, dg0 dg0Var, String str) {
        if (this.h) {
            fg0 fg0Var = new fg0(2443, -1, 5);
            fg0Var.q(3, gg0Var == null ? 0 : 1, gg0Var);
            fg0Var.q(0, vb0Var == null ? 0 : 1, vb0Var);
            fg0Var.p(1, 1, j);
            fg0Var.q(2, dg0Var == null ? 0 : 1, dg0Var);
            fg0Var.q(4, str != null ? 1 : 0, str);
            x56 x56VarF = zpa.F();
            zpa zpaVar = this.d;
            xb0 xb0VarX = x56VarF.B(zpaVar).x(zpaVar);
            List list = (List) xb0VarX.n(17);
            ((list == null || list.isEmpty()) ? new hf0(xb0VarX, 17, am2.q(xb0VarX, 17, 1)) : new hf0(xb0VarX, 17, list)).add(fg0Var);
            U0(x56VarF);
        }
    }

    public final void Z(gt0 gt0Var, boolean z, boolean z2) {
        x56 x56VarF = zpa.F();
        qd0 qd0VarB = x56VarF.B(this.d);
        List list = (List) qd0VarB.n(30);
        hf0 hf0Var = (list == null || list.isEmpty()) ? new hf0(qd0VarB, 30, vep.t(qd0VarB, 30, 1)) : new hf0(qd0VarB, 30, list);
        ft0 ft0Var = new ft0(2443, -1, 3);
        if (gt0Var != null) {
            ft0Var.q(0, 1, gt0Var);
        }
        ft0Var.r(1, 1, z);
        ft0Var.r(2, 1, z2);
        hf0Var.add(ft0Var);
        U0(x56VarF);
    }

    public final void a0(int i, String str) {
        x56 x56VarF = zpa.F();
        qg0 qg0Var = new qg0(2443, -1, 13);
        qg0Var.e(i);
        zpa zpaVar = this.d;
        x56VarF.E(zpaVar).y(zpaVar).x().put(str, qg0Var);
        U0(x56VarF);
    }

    public final wn0 b(qyl qylVar, xn0 xn0Var, boolean z) {
        wn0 wn0Var = new wn0(2443, -1, 13);
        wn0Var.q(1, 1, xn0Var);
        wn0Var.q(7, 1, qylVar.i());
        wn0Var.r(5, 1, z);
        yn0 yn0VarC = qylVar.c();
        wn0Var.q(10, 1, yn0VarC);
        if (yn0VarC == yn0.f) {
            wn0Var.r(9, 1, qylVar.h());
            wn0Var.r(12, 1, qylVar.e());
            wn0Var.r(6, 1, qylVar.g());
            wn0Var.r(4, 1, qylVar.j());
        }
        if (!TextUtils.isEmpty(qylVar.f())) {
            String strF = qylVar.f();
            wn0Var.q(3, strF == null ? 0 : 1, strF);
        }
        return wn0Var;
    }

    public final void b0(jh0 jh0Var) {
        if (this.h) {
            x56 x56VarF = zpa.F();
            b66 b66VarF = x56VarF.F(this.d);
            b66VarF.getClass();
            b66VarF.q(11, jh0Var == null ? 0 : 1, jh0Var);
            U0(x56VarF);
        }
    }

    public final c60 c(x56 x56Var, String str, u50 u50Var, String str2) {
        if0 if0Var;
        t50 t50Var;
        Map map = (Map) x56Var.n(37);
        if (map == null || map.isEmpty()) {
            HashMap map2 = new HashMap();
            x56Var.q(37, 1, map2);
            if0Var = new if0(x56Var, 37, map2);
        } else {
            if0Var = new if0(x56Var, 37, map);
        }
        c60 c60Var = (c60) if0Var.get(str);
        if (c60Var == null) {
            c60Var = new c60(2443, -1, 3);
            t50Var = (t50) c60Var.n(0);
            if (t50Var == null) {
                c60Var.q(0, 1, new t50(2443, 1, 2));
                t50Var = (t50) c60Var.n(0);
            }
            t50Var.getClass();
            t50Var.q(0, u50Var == null ? 0 : 1, u50Var);
            if0Var.put(str, c60Var);
        } else {
            t50 t50Var2 = (t50) c60Var.n(0);
            if (t50Var2 != null) {
                t50Var = t50Var2;
            } else {
                c60Var.q(0, 1, new t50(2443, 1, 2));
                t50Var = (t50) c60Var.n(0);
            }
        }
        if (str2 != null) {
            t50Var.getClass();
            t50Var.q(1, 1, str2);
        }
        return c60Var;
    }

    public final void c0(mh0 mh0Var) {
        if (!this.h || Intrinsics.a(mh0Var, mh0.b) || Intrinsics.a(mh0Var, mh0.x) || Intrinsics.a(mh0Var, mh0.z)) {
            return;
        }
        x56 x56VarF = zpa.F();
        lh0 lh0Var = new lh0(2443, -1, 4);
        lh0Var.q(0, mh0Var == null ? 0 : 1, mh0Var);
        x56VarF.B(this.d).B0().add(lh0Var);
        U0(x56VarF);
    }

    public final void d(if0 if0Var, kq0 kq0Var, int i, Integer num) {
        y56 y56VarX = kq0Var.x(this.d);
        if (num != null) {
            y56VarX.p(0, 1, num.intValue());
        }
        y56VarX.p(1, 1, i);
        if0Var.put("ntp_sdx_" + i, kq0Var);
    }

    public final void d0(kh0 kh0Var) {
        if (this.h) {
            x56 x56VarF = zpa.F();
            lh0 lh0Var = new lh0(2443, -1, 4);
            lh0Var.q(0, 1, mh0.x);
            lh0Var.q(2, 1, kh0Var);
            x56VarF.B(this.d).B0().add(lh0Var);
            U0(x56VarF);
        }
    }

    public final y56 e(if0 if0Var, kq0 kq0Var, int i, Integer num, int i2, int i3) {
        y56 y56VarX = kq0Var.x(this.d);
        y56VarX.p(6, 1, i2);
        if (i3 > 0) {
            y56VarX.p(7, 1, i3);
        }
        if (num != null) {
            y56VarX.p(0, 1, num.intValue());
        }
        y56VarX.p(1, 1, i);
        if0Var.put("sdx_" + i, kq0Var);
        return y56VarX;
    }

    public final void e0(ht0 ht0Var) {
        if (this.h) {
            x56 x56VarF = zpa.F();
            lh0 lh0Var = new lh0(2443, -1, 4);
            lh0Var.q(0, 1, mh0.b);
            lh0Var.q(1, 1, ht0Var);
            x56VarF.B(this.d).B0().add(lh0Var);
            U0(x56VarF);
        }
    }

    public final void f0(ph0 ph0Var) {
        if (this.h) {
            T0(new o5f((Object) ph0Var, (byte) 3));
        }
    }

    public final void g(String str, String str2, boolean z) {
        if (dti.a(str)) {
            Uri uri = Uri.parse(str);
            String strF = (str2 == null || !dti.a(str2)) ? null : f(Uri.parse(str2));
            String strF2 = f(uri);
            if (z || !(strF == null || strF.equals(strF2))) {
                T0(new e5f(strF, strF2, (byte) 3));
            }
        }
    }

    public final void g0(ej0 ej0Var) {
        if (this.h) {
            x56 x56VarF = zpa.F();
            b66 b66VarF = x56VarF.F(this.d);
            b66VarF.getClass();
            b66VarF.q(14, 1, ej0Var);
            U0(x56VarF);
        }
    }

    public final void h(String str, lqm lqmVar, String str2, boolean z) {
        boolean zA = dti.a(str);
        zpa zpaVar = this.d;
        if (zA) {
            Uri uri = Uri.parse(str);
            String strF = (str2 == null || !dti.a(str2)) ? null : f(Uri.parse(str2));
            String strF2 = f(uri);
            if (z || !(strF == null || strF.equals(strF2))) {
                x56 x56VarF = zpa.F();
                new jkc(uri, lqmVar, (byte) 21).invoke((ve0) new ck0(zpaVar, x56VarF).f().c.getValue());
                U0(x56VarF);
                return;
            }
            return;
        }
        Pattern pattern = dti.b;
        String[] strArr = aik.a;
        if (pattern.matcher(aik.s(str, strArr)).matches()) {
            if (z) {
                x56 x56VarF2 = zpa.F();
                hp0 hp0VarF = new ck0(zpaVar, x56VarF2).f();
                hp0VarF.b.o(7, 1, 1);
                boolean zG = StringsKt.G(str, "clid=");
                z56 z56Var = hp0VarF.b;
                if (zG) {
                    z56Var.o(1, 1, 1);
                } else {
                    z56Var.o(2, 1, 1);
                }
                U0(x56VarF2);
                return;
            }
            return;
        }
        if (dti.c.matcher(aik.s(str, strArr)).matches()) {
            if (z) {
                x56 x56VarF3 = zpa.F();
                hp0 hp0VarF2 = new ck0(zpaVar, x56VarF3).f();
                hp0VarF2.b.o(8, 1, 1);
                boolean zG2 = StringsKt.G(str, "Opera_14mobile");
                z56 z56Var2 = hp0VarF2.b;
                if (zG2) {
                    z56Var2.o(3, 1, 1);
                } else {
                    z56Var2.o(4, 1, 1);
                }
                U0(x56VarF3);
                return;
            }
            return;
        }
        if (dti.d.matcher(str).matches()) {
            if (z) {
                x56 x56VarF4 = zpa.F();
                hp0 hp0VarF3 = new ck0(zpaVar, x56VarF4).f();
                if ("ofa".equals(Uri.parse(str).getQueryParameter("t"))) {
                    hp0VarF3.b.p(18, 1, 1L);
                } else {
                    hp0VarF3.b.p(19, 1, 1L);
                }
                U0(x56VarF4);
                return;
            }
            return;
        }
        if (dti.e.matcher(aik.s(str, strArr)).matches() && z) {
            x56 x56VarF5 = zpa.F();
            hp0 hp0VarF4 = new ck0(zpaVar, x56VarF5).f();
            if ("startpage.opera.android".equals(Uri.parse(str).getQueryParameter("segment"))) {
                hp0VarF4.b.p(5, 1, 1L);
            } else {
                hp0VarF4.b.p(6, 1, 1L);
            }
            U0(x56VarF5);
        }
    }

    public final void h0(fc0 fc0Var) {
        x56 x56VarF = zpa.F();
        ec0 ec0Var = new ec0(2443, -1, 1);
        ec0Var.q(0, 1, fc0Var);
        qd0 qd0VarB = x56VarF.B(this.d);
        List list = (List) qd0VarB.n(43);
        ((list == null || list.isEmpty()) ? new hf0(qd0VarB, 43, vep.t(qd0VarB, 43, 1)) : new hf0(qd0VarB, 43, list)).add(ec0Var);
        U0(x56VarF);
    }

    @Override // defpackage.ubk
    public final void i(r rVar) {
        this.g.N(rVar);
    }

    public final void i0(hl0 hl0Var) {
        if (this.h) {
            x56 x56VarF = zpa.F();
            oj0 oj0Var = new oj0(2443, -1, 1);
            oj0Var.q(0, 1, hl0Var);
            qd0 qd0VarB = x56VarF.B(this.d);
            List list = (List) qd0VarB.n(32);
            ((list == null || list.isEmpty()) ? new hf0(qd0VarB, 32, vep.t(qd0VarB, 32, 1)) : new hf0(qd0VarB, 32, list)).add(oj0Var);
            U0(x56VarF);
        }
    }

    public final void j(int i, String str, boolean z) {
        if0 if0Var;
        if0 if0Var2;
        x56 x56VarF = zpa.F();
        zpa zpaVar = this.d;
        iq0 iq0VarY = x56VarF.B(zpaVar).y(zpaVar);
        if (z) {
            Map map = (Map) iq0VarY.n(1);
            if (map == null || map.isEmpty()) {
                HashMap map2 = new HashMap();
                iq0VarY.q(1, 1, map2);
                if0Var2 = new if0(iq0VarY, 1, map2);
            } else {
                if0Var2 = new if0(iq0VarY, 1, map);
            }
        } else {
            Map map3 = (Map) iq0VarY.n(0);
            if (map3 == null || map3.isEmpty()) {
                HashMap map4 = new HashMap();
                iq0VarY.q(0, 1, map4);
                if0Var = new if0(iq0VarY, 0, map4);
            } else {
                if0Var = new if0(iq0VarY, 0, map3);
            }
            if0Var2 = if0Var;
        }
        a60 a60Var = (a60) if0Var2.get(str);
        if (a60Var == null) {
            a60Var = new a60(2443, -1, 5);
            if0Var2.put(str, a60Var);
        }
        a60Var.e(i);
        U0(x56VarF);
    }

    public final void j0(pl0 pl0Var) {
        x56 x56VarF = zpa.F();
        e66 e66VarO = x56VarF.O(this.d);
        e66VarO.getClass();
        e66VarO.q(10, 1, pl0Var);
        U0(x56VarF);
    }

    public final void k(int i) {
        x56 x56VarF = zpa.F();
        fi0 fi0VarE = x56VarF.E(this.d);
        ua0 ua0Var = (ua0) fi0VarE.n(22);
        if (ua0Var == null) {
            fi0VarE.q(22, 1, new ua0(2443, 1, 6));
            ua0Var = (ua0) fi0VarE.n(22);
        }
        ua0Var.e(i);
        U0(x56VarF);
    }

    public final void k0(xl0 xl0Var) {
        if (this.h) {
            T0(new rkc((Object) xl0Var, (byte) 27));
        }
    }

    public final void l(int i) {
        x56 x56VarF = zpa.F();
        fi0 fi0VarE = x56VarF.E(this.d);
        nf0 nf0Var = (nf0) fi0VarE.n(20);
        if (nf0Var == null) {
            fi0VarE.q(20, 1, new nf0(2443, 1, 5));
            nf0Var = (nf0) fi0VarE.n(20);
        }
        nf0Var.e(i);
        U0(x56VarF);
    }

    public final void l0(gm0 gm0Var) {
        if (this.h) {
            x56 x56VarF = zpa.F();
            jm0 jm0Var = new jm0(2443, -1, 1);
            jm0Var.q(0, gm0Var == null ? 0 : 1, gm0Var);
            qd0 qd0VarB = x56VarF.B(this.d);
            List list = (List) qd0VarB.n(55);
            ((list == null || list.isEmpty()) ? new hf0(qd0VarB, 55, vep.t(qd0VarB, 55, 1)) : new hf0(qd0VarB, 55, list)).add(jm0Var);
            U0(x56VarF);
        }
    }

    @Override // defpackage.ubk
    public final void m(r rVar) {
        this.g.f(rVar);
    }

    public final void m0(boolean z) {
        x56 x56VarF = zpa.F();
        x56VarF.N(this.d).r(8, 1, z);
        U0(x56VarF);
    }

    @Override // defpackage.ubk
    public final void n(long j, boolean z) {
        new rml(Unit.a, this.b).a(new h5f(this, j, z)).m(this.e);
    }

    public final void n0(en0 en0Var) {
        if (this.h) {
            x56 x56VarF = zpa.F();
            dn0 dn0Var = new dn0(2443, -1, 1);
            dn0Var.q(0, en0Var == null ? 0 : 1, en0Var);
            qd0 qd0VarB = x56VarF.B(this.d);
            List list = (List) qd0VarB.n(7);
            ((list == null || list.isEmpty()) ? new hf0(qd0VarB, 7, vep.t(qd0VarB, 7, 1)) : new hf0(qd0VarB, 7, list)).add(dn0Var);
            U0(x56VarF);
        }
    }

    public final void o(int i) {
        x56 x56VarF = zpa.F();
        z56 z56Var = (z56) x56VarF.n(19);
        if (z56Var == null) {
            x56VarF.q(19, 1, new z56(2443, 1, 21));
            z56Var = (z56) x56VarF.n(19);
        }
        z56Var.e(i);
        U0(x56VarF);
    }

    public final void o0(String str, Uri uri, sj0 sj0Var, xn0 xn0Var) {
        T0(new pr3(sj0Var, xn0Var, str, uri.getQueryParameter("utm_source"), uri.getQueryParameter("utm_medium"), uri.getQueryParameter("utm_campaign"), (byte) 2));
    }

    public final void p(String str, u50 u50Var, q50 q50Var, String str2, long j, boolean z, v50 v50Var, Long l) {
        if (this.h) {
            t(z ? g60.c : g60.d, str, u50Var, q50Var, str2, j, v50Var, 0L, l);
        }
    }

    public final void p0(String str, eg0 eg0Var, String str2) {
        if (this.h) {
            gc0 gc0Var = new gc0(2443, -1, 3);
            gc0Var.q(1, str == null ? 0 : 1, str);
            gc0Var.q(0, eg0Var == null ? 0 : 1, eg0Var);
            gc0Var.q(2, str2 != null ? 1 : 0, str2);
            x56 x56VarF = zpa.F();
            qd0 qd0VarB = x56VarF.B(this.d);
            List list = (List) qd0VarB.n(23);
            ((list == null || list.isEmpty()) ? new hf0(qd0VarB, 23, vep.t(qd0VarB, 23, 1)) : new hf0(qd0VarB, 23, list)).add(gc0Var);
            U0(x56VarF);
        }
    }

    public final void q(d60 d60Var, String str, u50 u50Var, String str2, q50 q50Var, String str3, q50 q50Var2, String str4, int i, boolean z, float f, long j, long j2, v50 v50Var, String str5) {
        hf0 hf0Var;
        x56 x56VarF = zpa.F();
        e60 e60Var = new e60(2443, -1, 12);
        e60Var.q(0, d60Var == null ? 0 : 1, d60Var);
        e60Var.q(1, q50Var == null ? 0 : 1, q50Var);
        e60Var.q(3, q50Var2 != null ? 1 : 0, q50Var2);
        e60Var.x(2, str3);
        e60Var.x(4, str4);
        e60Var.p(5, 1, i & 4294967295L);
        e60Var.r(6, 1, z);
        if (Intrinsics.a(d60Var, d60.c) || Intrinsics.a(d60Var, d60.d)) {
            e60Var.p(8, 1, j);
        }
        e60Var.d[7] = new df0(1, Float.valueOf(f), (byte) 4);
        if (Intrinsics.a(d60Var, d60.j)) {
            e60Var.p(9, 1, j2);
        }
        if (v50Var != null) {
            e60Var.q(10, 1, v50Var);
        }
        e60Var.x(11, str5);
        c60 c60VarC = c(x56VarF, str, u50Var, str2);
        List list = (List) c60VarC.n(1);
        if (list == null || list.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            c60VarC.q(1, 1, arrayList);
            hf0Var = new hf0(c60VarC, 1, arrayList);
        } else {
            hf0Var = new hf0(c60VarC, 1, list);
        }
        hf0Var.add(e60Var);
        U0(x56VarF);
    }

    public final void q0(qyl qylVar, boolean z, long j) {
        if (this.h) {
            wn0 wn0VarB = b(qylVar, xn0.b, z);
            Boolean boolB = qylVar.b();
            if (boolB != null) {
                wn0VarB.r(2, 1, boolB.booleanValue());
            }
            wn0VarB.p(11, 1, j);
            V0(wn0VarB);
        }
    }

    public final void r(q50 q50Var, String str, int i, boolean z, boolean z2) {
        if (this.h) {
            x56 x56VarF = zpa.F();
            r50 r50Var = new r50(2443, -1, 6);
            r50Var.q(0, 1, q50Var);
            r50Var.r(1, 1, true);
            r50Var.q(2, 1, str);
            r50Var.p(4, 1, i);
            if (z) {
                r50Var.r(5, 1, z2);
            }
            x56VarF.B(this.d).A0().add(r50Var);
            U0(x56VarF);
        }
    }

    public final void r0(qyl qylVar, vn0 vn0Var) {
        if (this.h) {
            wn0 wn0VarB = b(qylVar, xn0.c, true);
            wn0VarB.q(0, 1, vn0Var);
            V0(wn0VarB);
        }
    }

    public final void s(q50 q50Var, String str, int i, boolean z, boolean z2, s50 s50Var) {
        if (this.h) {
            x56 x56VarF = zpa.F();
            r50 r50Var = new r50(2443, -1, 6);
            r50Var.q(0, 1, q50Var);
            r50Var.r(1, 1, false);
            r50Var.q(3, s50Var != null ? 1 : 0, s50Var);
            r50Var.q(2, 1, str);
            r50Var.p(4, 1, i);
            if (z) {
                r50Var.r(5, 1, z2);
            }
            x56VarF.B(this.d).A0().add(r50Var);
            U0(x56VarF);
        }
    }

    public final void s0(qyl qylVar, boolean z) {
        if (this.h) {
            wn0 wn0VarB = b(qylVar, xn0.f, z);
            Boolean boolB = qylVar.b();
            if (boolB != null) {
                wn0VarB.r(2, 1, boolB.booleanValue());
            }
            V0(wn0VarB);
        }
    }

    @Override // defpackage.ubk
    public final void setEnabled(boolean z) {
        this.h = z;
    }

    public final void t(g60 g60Var, String str, u50 u50Var, q50 q50Var, String str2, long j, v50 v50Var, long j2, Long l) {
        hf0 hf0Var;
        x56 x56VarF = zpa.F();
        f60 f60Var = new f60(2443, -1, 8);
        f60Var.q(0, 1, g60Var);
        f60Var.p(1, 1, j);
        f60Var.q(2, 1, q50Var);
        f60Var.q(3, str2 != null ? 1 : 0, str2);
        if (v50Var != null) {
            f60Var.q(5, 1, v50Var);
        }
        f60Var.p(6, 1, j2);
        if (l != null) {
            f60Var.p(7, 1, l.longValue());
        }
        c60 c60VarC = c(x56VarF, str, u50Var, null);
        List list = (List) c60VarC.n(2);
        if (list == null || list.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            c60VarC.q(2, 1, arrayList);
            hf0Var = new hf0(c60VarC, 2, arrayList);
        } else {
            hf0Var = new hf0(c60VarC, 2, list);
        }
        hf0Var.add(f60Var);
        U0(x56VarF);
    }

    public final void t0(String str) {
        hf0 hf0Var;
        x56 x56VarF = zpa.F();
        go0 go0Var = new go0(2443, -1, 1);
        go0Var.q(0, str == null ? 0 : 1, str);
        de0 de0VarC = x56VarF.C(this.d);
        List list = (List) de0VarC.n(2);
        if (list == null || list.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            de0VarC.q(2, 1, arrayList);
            hf0Var = new hf0(de0VarC, 2, arrayList);
        } else {
            hf0Var = new hf0(de0VarC, 2, list);
        }
        hf0Var.add(go0Var);
        U0(x56VarF);
    }

    public final void u(ip0 ip0Var) {
        hf0 hf0Var;
        if (this.h) {
            x56 x56VarF = zpa.F();
            hq0 hq0Var = new hq0(2443, -1, 1);
            hq0Var.q(0, 1, ip0Var);
            zpa zpaVar = this.d;
            iq0 iq0VarY = x56VarF.B(zpaVar).y(zpaVar);
            List list = (List) iq0VarY.n(2);
            if (list == null || list.isEmpty()) {
                ArrayList arrayList = new ArrayList();
                iq0VarY.q(2, 1, arrayList);
                hf0Var = new hf0(iq0VarY, 2, arrayList);
            } else {
                hf0Var = new hf0(iq0VarY, 2, list);
            }
            hf0Var.add(hq0Var);
            U0(x56VarF);
        }
    }

    public final void u0(eo0 eo0Var, ee0 ee0Var, long j, long j2, boolean z, Long l, Long l2, ho0 ho0Var) {
        if (this.h) {
            fo0 fo0Var = new fo0(2443, -1, 9);
            fo0Var.q(0, 1, eo0Var);
            fo0Var.q(2, ee0Var != null ? 1 : 0, ee0Var);
            fo0Var.q(8, 1, ho0Var);
            fo0Var.p(1, 1, j);
            fo0Var.p(4, 1, j2);
            if (l2 != null) {
                fo0Var.p(7, 1, l2.longValue());
            }
            if (eo0Var == eo0.d) {
                fo0Var.r(5, 1, z);
            }
            if (l != null) {
                fo0Var.p(6, 1, l.longValue());
            }
            x56 x56VarF = zpa.F();
            zpa zpaVar = this.d;
            xb0 xb0VarX = x56VarF.B(zpaVar).x(zpaVar);
            List list = (List) xb0VarX.n(5);
            ((list == null || list.isEmpty()) ? new hf0(xb0VarX, 5, am2.q(xb0VarX, 5, 1)) : new hf0(xb0VarX, 5, list)).add(fo0Var);
            U0(x56VarF);
        }
    }

    public final void v(String str, n60 n60Var) {
        if0 if0Var;
        x56 x56VarF = zpa.F();
        ws0 ws0Var = (ws0) x56VarF.n(45);
        if (ws0Var == null) {
            x56VarF.q(45, 1, new ws0(2443, 1, 8));
            ws0Var = (ws0) x56VarF.n(45);
        }
        m60 m60Var = (m60) ws0Var.n(2);
        if (m60Var == null) {
            ws0Var.q(2, 1, new m60(2443, 1, 3));
            m60Var = (m60) ws0Var.n(2);
        }
        Map map = (Map) m60Var.n(0);
        if (map == null || map.isEmpty()) {
            HashMap map2 = new HashMap();
            m60Var.q(0, 1, map2);
            if0Var = new if0(m60Var, 0, map2);
        } else {
            if0Var = new if0(m60Var, 0, map);
        }
        if0Var.put(str, n60Var);
        U0(x56VarF);
    }

    public final void v0(String str) {
        hf0 hf0Var;
        if (this.h) {
            x56 x56VarF = zpa.F();
            q56 q56VarZ = x56VarF.z(this.d);
            List list = (List) q56VarZ.n(22);
            if (list == null || list.isEmpty()) {
                ArrayList arrayList = new ArrayList();
                q56VarZ.q(22, 1, arrayList);
                hf0Var = new hf0(q56VarZ, 22, arrayList);
            } else {
                hf0Var = new hf0(q56VarZ, 22, list);
            }
            hf0Var.add(str);
            U0(x56VarF);
        }
    }

    public final void w(f90 f90Var, int i) {
        if0 if0Var;
        String str = f90Var != f90.b ? f90Var != f90.c ? f90Var != f90.d ? f90Var != f90.e ? f90Var != f90.f ? null : "ARTICLE_READER_MODE" : "ARTICLE_PREVIEW" : "HIGHLIGHTS_CAROUSEL" : "ROUNDUP_CAROUSEL" : "ROUNDUP_BANNER";
        if (str == null) {
            return;
        }
        x56 x56VarF = zpa.F();
        zpa zpaVar = this.d;
        lj0 lj0VarZ = x56VarF.E(zpaVar).z(zpaVar);
        Map map = (Map) lj0VarZ.n(13);
        if (map == null || map.isEmpty()) {
            HashMap map2 = new HashMap();
            lj0VarZ.q(13, 1, map2);
            if0Var = new if0(lj0VarZ, 13, map2);
        } else {
            if0Var = new if0(lj0VarZ, 13, map);
        }
        v60 v60Var = (v60) if0Var.get(str);
        if (v60Var == null) {
            v60Var = new v60(2443, -1, 3);
            if0Var.put(str, v60Var);
        }
        v60Var.e(i);
        U0(x56VarF);
    }

    public final void w0(vb0 vb0Var) {
        if (this.h) {
            zo0 zo0Var = new zo0(2443, -1, 1);
            zo0Var.q(0, 1, vb0Var);
            x56 x56VarF = zpa.F();
            zpa zpaVar = this.d;
            xb0 xb0VarX = x56VarF.B(zpaVar).x(zpaVar);
            List list = (List) xb0VarX.n(15);
            ((list == null || list.isEmpty()) ? new hf0(xb0VarX, 15, am2.q(xb0VarX, 15, 1)) : new hf0(xb0VarX, 15, list)).add(zo0Var);
            U0(x56VarF);
        }
    }

    public final void x(b70 b70Var) {
        x56 x56VarF = zpa.F();
        e66 e66VarO = x56VarF.O(this.d);
        e66VarO.getClass();
        e66VarO.q(17, 1, b70Var);
        U0(x56VarF);
    }

    public final void x0(vb0 vb0Var) {
        if (this.h) {
            ap0 ap0Var = new ap0(2443, -1, 1);
            ap0Var.q(0, 1, vb0Var);
            x56 x56VarF = zpa.F();
            zpa zpaVar = this.d;
            xb0 xb0VarX = x56VarF.B(zpaVar).x(zpaVar);
            List list = (List) xb0VarX.n(14);
            ((list == null || list.isEmpty()) ? new hf0(xb0VarX, 14, am2.q(xb0VarX, 14, 1)) : new hf0(xb0VarX, 14, list)).add(ap0Var);
            U0(x56VarF);
        }
    }

    public final void y(g80 g80Var) {
        if (this.h) {
            x56 x56VarF = zpa.F();
            qd0 qd0VarB = x56VarF.B(this.d);
            h80 h80Var = new h80(2443, -1, 1);
            h80Var.q(0, 1, g80Var);
            List list = (List) qd0VarB.n(37);
            ((list == null || list.isEmpty()) ? new hf0(qd0VarB, 37, vep.t(qd0VarB, 37, 1)) : new hf0(qd0VarB, 37, list)).add(h80Var);
            U0(x56VarF);
        }
    }

    public final void y0(jp0 jp0Var) {
        if (this.h) {
            x56 x56VarF = zpa.F();
            b66 b66VarF = x56VarF.F(this.d);
            b66VarF.getClass();
            b66VarF.q(79, 1, jp0Var);
            U0(x56VarF);
        }
    }

    public final void z(boolean z, boolean z2) {
        if (this.h) {
            x56 x56VarF = zpa.F();
            b66 b66VarF = x56VarF.F(this.d);
            if (z2) {
                e80 e80Var = z ? e80.b : e80.c;
                b66VarF.getClass();
                b66VarF.q(56, 1, e80Var);
            } else {
                b66VarF.getClass();
                b66VarF.q(56, 1, e80.d);
            }
            U0(x56VarF);
        }
    }

    public final void z0(long j) {
        hf0 hf0Var;
        if (this.h) {
            x56 x56VarF = zpa.F();
            uc0 uc0VarA = x56VarF.A(this.d);
            List list = (List) uc0VarA.n(9);
            if (list == null || list.isEmpty()) {
                ArrayList arrayList = new ArrayList();
                uc0VarA.q(9, 1, arrayList);
                hf0Var = new hf0(uc0VarA, 9, arrayList);
            } else {
                hf0Var = new hf0(uc0VarA, 9, list);
            }
            hf0Var.add(Long.valueOf(j));
            U0(x56VarF);
        }
    }
}
