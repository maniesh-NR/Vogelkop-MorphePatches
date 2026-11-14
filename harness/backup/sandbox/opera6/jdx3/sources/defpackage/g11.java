package defpackage;

import android.content.Context;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class g11 implements rsf {
    public final s9i a;
    public final x56 b;

    public g11(s9i s9iVar, x56 x56Var) {
        this.a = s9iVar;
        this.b = x56Var;
    }

    @Override // defpackage.rsf
    public final int a() {
        n56 n56Var;
        q56 q56Var = (q56) this.b.n(35);
        if (q56Var == null || (n56Var = (n56) q56Var.n(1)) == null) {
            return 0;
        }
        List list = (List) n56Var.n(4);
        List listUnmodifiableList = list != null ? Collections.unmodifiableList(list) : null;
        if (listUnmodifiableList == null || listUnmodifiableList.size() == 0) {
            return 0;
        }
        return ((ul0) ((ql0) am2.l(1, listUnmodifiableList)).n(2)) == ul0.c ? 2 : 1;
    }

    @Override // defpackage.rsf
    public final void b(long j, boolean z) {
        zpa zpaVar = (zpa) this.a.c;
        boolean z2 = (j & 1) != 0;
        x56 x56Var = this.b;
        x56Var.r(12, 1, z2);
        x56Var.p(3, -1, System.currentTimeMillis());
        x56Var.x(zpaVar).r(0, 1, z2);
        x56Var.q(36, 1, z ? sl0.b : sl0.c);
        zs0 zs0VarN = x56Var.N(zpaVar);
        if (zs0VarN.d[2] != null) {
            return;
        }
        zs0VarN.r(2, 1, false);
    }

    @Override // defpackage.rsf
    public final void c() {
        this.b.p(9, 1, 969L);
    }

    @Override // defpackage.rsf
    public final void d(rsf rsfVar) {
        int i;
        int i2;
        x56 x56Var = ((g11) rsfVar).b;
        zpa zpaVar = (zpa) this.a.c;
        x56 x56Var2 = this.b;
        if (x56Var2.n(4) != null) {
            x56Var.q(4, -1, (Integer) x56Var2.n(4));
        }
        if (x56Var2.n(5) != null) {
            ra0 ra0Var = (ra0) x56Var2.n(5);
            ra0 ra0Var2 = new ra0(2443, 1, 15);
            if (ra0Var.n(0) != null) {
                ra0Var2.q(0, -1, (Boolean) ra0Var.n(0));
            }
            if (ra0Var.n(1) != null) {
                o70 o70Var = (o70) ra0Var.n(1);
                o70 o70Var2 = new o70(2443, 1, 3);
                if (o70Var.n(0) != null) {
                    o70Var2.q(0, 1, (String) o70Var.n(0));
                }
                if (o70Var.n(1) != null) {
                    o70Var2.q(1, 1, (String) o70Var.n(1));
                }
                if (o70Var.n(2) != null) {
                    o70Var2.q(2, 1, (String) o70Var.n(2));
                }
                ra0Var2.q(1, 1, o70Var2);
            }
            if (ra0Var.n(2) != null) {
                i90 i90Var = (i90) ra0Var.n(2);
                i90 i90Var2 = new i90(2443, 1, 5);
                if (i90Var.n(0) != null) {
                    i90Var2.q(0, 1, (String) i90Var.n(0));
                }
                if (i90Var.n(1) != null) {
                    i90Var2.q(1, 1, (String) i90Var.n(1));
                }
                if (i90Var.n(2) != null) {
                    i90Var2.q(2, 1, (String) i90Var.n(2));
                }
                if (i90Var.n(3) != null) {
                    i90Var2.q(3, 1, (String) i90Var.n(3));
                }
                if (i90Var.n(4) != null) {
                    i90Var2.q(4, 1, (String) i90Var.n(4));
                }
                ra0Var2.q(2, 1, i90Var2);
            }
            if (ra0Var.n(3) != null) {
                ra0Var2.q(3, 1, new HashMap((Map) ra0Var.n(3)));
            }
            if (ra0Var.n(4) != null) {
                ra0Var2.q(4, 1, (String) ra0Var.n(4));
            }
            if (ra0Var.n(5) != null) {
                ra0Var2.q(5, 1, (String) ra0Var.n(5));
            }
            if (ra0Var.n(6) != null) {
                gh0 gh0Var = (gh0) ra0Var.n(6);
                gh0 gh0Var2 = new gh0(2443, 1, 5);
                if (gh0Var.n(0) != null) {
                    gh0Var2.q(0, 1, (String) gh0Var.n(0));
                }
                if (gh0Var.n(1) != null) {
                    gh0Var2.q(1, 1, (String) gh0Var.n(1));
                }
                if (gh0Var.n(2) != null) {
                    gh0Var2.q(2, 1, (String) gh0Var.n(2));
                }
                if (gh0Var.n(3) != null) {
                    gh0Var2.q(3, 1, (String) gh0Var.n(3));
                }
                if (gh0Var.n(4) != null) {
                    gh0Var2.q(4, 1, (String) gh0Var.n(4));
                }
                ra0Var2.q(6, 1, gh0Var2);
            }
            if (ra0Var.n(7) != null) {
                ra0Var2.q(7, 1, (ca0) ra0Var.n(7));
            }
            if (ra0Var.n(8) != null) {
                ra0Var2.q(8, 1, (String) ra0Var.n(8));
            }
            if (ra0Var.n(9) != null) {
                ra0Var2.q(9, 1, (String) ra0Var.n(9));
            }
            if (ra0Var.n(10) != null) {
                ra0Var2.q(10, 1, (String) ra0Var.n(10));
            }
            if (ra0Var.n(11) != null) {
                po0 po0Var = (po0) ra0Var.n(11);
                po0 po0Var2 = new po0(2443, 1, 4);
                if (po0Var.n(0) != null) {
                    po0Var2.q(0, 1, (String) po0Var.n(0));
                }
                if (po0Var.n(1) != null) {
                    po0Var2.q(1, 1, (String) po0Var.n(1));
                }
                if (po0Var.n(2) != null) {
                    po0Var2.q(2, 1, (String) po0Var.n(2));
                }
                if (po0Var.n(3) != null) {
                    po0Var2.q(3, 1, (String) po0Var.n(3));
                }
                ra0Var2.q(11, 1, po0Var2);
            }
            if (ra0Var.n(12) != null) {
                gp0 gp0Var = (gp0) ra0Var.n(12);
                gp0 gp0Var2 = new gp0(2443, 1, 4);
                if (gp0Var.n(0) != null) {
                    i2 = -1;
                    gp0Var2.q(0, -1, (Float) gp0Var.n(0));
                } else {
                    i2 = -1;
                }
                if (gp0Var.n(1) != null) {
                    gp0Var2.q(1, i2, (Integer) gp0Var.n(1));
                }
                if (gp0Var.n(2) != null) {
                    gp0Var2.q(2, i2, (Integer) gp0Var.n(2));
                }
                if (gp0Var.n(3) != null) {
                    gp0Var2.q(3, 1, (oe0) gp0Var.n(3));
                }
                ra0Var2.q(12, 1, gp0Var2);
            }
            if (ra0Var.n(13) != null) {
                ra0Var2.q(13, 1, (String) ra0Var.n(13));
            }
            if (ra0Var.n(14) != null) {
                qb0 qb0Var = (qb0) ra0Var.n(14);
                qb0 qb0Var2 = new qb0(2443, 1, 7);
                if (qb0Var.n(0) != null) {
                    qb0Var2.q(0, 1, (Long) qb0Var.n(0));
                }
                if (qb0Var.n(1) != null) {
                    qb0Var2.q(1, 1, (String) qb0Var.n(1));
                }
                if (qb0Var.n(2) != null) {
                    qb0Var2.q(2, 1, new ArrayList((List) qb0Var.n(2)));
                }
                if (qb0Var.n(3) != null) {
                    qb0Var2.q(3, 1, (Boolean) qb0Var.n(3));
                }
                if (qb0Var.n(4) != null) {
                    qb0Var2.q(4, 1, (Long) qb0Var.n(4));
                }
                if (qb0Var.n(5) != null) {
                    qb0Var2.q(5, 1, (Long) qb0Var.n(5));
                }
                i = 6;
                if (qb0Var.n(6) != null) {
                    qb0Var2.q(6, 1, (String) qb0Var.n(6));
                }
                ra0Var2.q(14, 1, qb0Var2);
            } else {
                i = 6;
            }
            x56Var.q(5, 1, ra0Var2);
        } else {
            i = 6;
        }
        if (x56Var2.n(i) != null) {
            tf0 tf0Var = (tf0) x56Var2.n(i);
            tf0 tf0Var2 = new tf0(2443, 1, 12);
            if (tf0Var.n(0) != null) {
                tf0Var2.q(0, 1, (String) tf0Var.n(0));
            }
            if (tf0Var.n(1) != null) {
                tf0Var2.q(1, 1, (String) tf0Var.n(1));
            }
            if (tf0Var.n(2) != null) {
                tf0Var2.q(2, 1, (String) tf0Var.n(2));
            }
            if (tf0Var.n(3) != null) {
                tf0Var2.q(3, 1, (String) tf0Var.n(3));
            }
            if (tf0Var.n(4) != null) {
                tf0Var2.q(4, 1, (String) tf0Var.n(4));
            }
            if (tf0Var.n(5) != null) {
                tf0Var2.q(5, 1, (String) tf0Var.n(5));
            }
            if (tf0Var.n(6) != null) {
                tf0Var2.q(6, 1, (String) tf0Var.n(6));
            }
            if (tf0Var.n(7) != null) {
                tf0Var2.q(7, 1, (String) tf0Var.n(7));
            }
            if (tf0Var.n(8) != null) {
                tf0Var2.q(8, 1, (String) tf0Var.n(8));
            }
            if (tf0Var.n(9) != null) {
                tf0Var2.q(9, 1, (String) tf0Var.n(9));
            }
            if (tf0Var.n(10) != null) {
                tf0Var2.q(10, 1, (String) tf0Var.n(10));
            }
            if (tf0Var.n(11) != null) {
                tf0Var2.q(11, 1, (String) tf0Var.n(11));
            }
            x56Var.q(6, 1, tf0Var2);
        }
        if (x56Var2.n(7) != null) {
            x56Var.q(7, 1, (String) x56Var2.n(7));
        }
        if (x56Var2.n(8) != null) {
            x56Var.q(8, -1, (Long) x56Var2.n(8));
        }
        if (x56Var2.n(10) != null) {
            x56Var.q(10, 1, (Long) x56Var2.n(10));
        }
        if (x56Var2.n(11) != null) {
            x56Var.q(11, 1, (Long) x56Var2.n(11));
        }
        if (x56Var2.n(12) != null) {
            x56Var.q(12, 1, (Boolean) x56Var2.n(12));
        }
        if (x56Var2.n(13) != null) {
            in0 in0Var = (in0) x56Var2.n(13);
            in0 in0Var2 = new in0(2443, 1, 55);
            if (in0Var.n(0) != null) {
                in0Var2.q(0, 1, (String) in0Var.n(0));
            }
            if (in0Var.n(1) != null) {
                in0Var2.q(1, 1, (String) in0Var.n(1));
            }
            if (in0Var.n(2) != null) {
                in0Var2.q(2, 1, (String) in0Var.n(2));
            }
            if (in0Var.n(3) != null) {
                in0Var2.q(3, 1, (String) in0Var.n(3));
            }
            if (in0Var.n(4) != null) {
                in0Var2.q(4, 1, (String) in0Var.n(4));
            }
            if (in0Var.n(5) != null) {
                in0Var2.q(5, 1, (String) in0Var.n(5));
            }
            if (in0Var.n(6) != null) {
                in0Var2.q(6, 1, (String) in0Var.n(6));
            }
            if (in0Var.n(7) != null) {
                in0Var2.q(7, 1, (String) in0Var.n(7));
            }
            if (in0Var.n(8) != null) {
                in0Var2.q(8, 1, (String) in0Var.n(8));
            }
            if (in0Var.n(9) != null) {
                in0Var2.q(9, 1, (String) in0Var.n(9));
            }
            if (in0Var.n(10) != null) {
                in0Var2.q(10, 1, (String) in0Var.n(10));
            }
            if (in0Var.n(11) != null) {
                in0Var2.q(11, 1, (String) in0Var.n(11));
            }
            if (in0Var.n(12) != null) {
                in0Var2.q(12, 1, (String) in0Var.n(12));
            }
            if (in0Var.n(13) != null) {
                in0Var2.q(13, 1, (String) in0Var.n(13));
            }
            if (in0Var.n(14) != null) {
                in0Var2.q(14, 1, (String) in0Var.n(14));
            }
            if (in0Var.n(15) != null) {
                in0Var2.q(15, 1, (hg0) in0Var.n(15));
            }
            if (in0Var.n(16) != null) {
                in0Var2.q(16, 1, (Boolean) in0Var.n(16));
            }
            if (in0Var.n(17) != null) {
                in0Var2.q(17, 1, (String) in0Var.n(17));
            }
            if (in0Var.n(18) != null) {
                in0Var2.q(18, 1, (String) in0Var.n(18));
            }
            if (in0Var.n(19) != null) {
                in0Var2.q(19, 1, (String) in0Var.n(19));
            }
            if (in0Var.n(20) != null) {
                in0Var2.q(20, 1, (String) in0Var.n(20));
            }
            if (in0Var.n(21) != null) {
                in0Var2.q(21, 1, (String) in0Var.n(21));
            }
            if (in0Var.n(22) != null) {
                in0Var2.q(22, 1, (String) in0Var.n(22));
            }
            if (in0Var.n(23) != null) {
                in0Var2.q(23, 1, (String) in0Var.n(23));
            }
            if (in0Var.n(24) != null) {
                in0Var2.q(24, 1, (String) in0Var.n(24));
            }
            if (in0Var.n(25) != null) {
                in0Var2.q(25, 1, (String) in0Var.n(25));
            }
            if (in0Var.n(26) != null) {
                in0Var2.q(26, 1, (String) in0Var.n(26));
            }
            if (in0Var.n(27) != null) {
                in0Var2.q(27, 1, (String) in0Var.n(27));
            }
            if (in0Var.n(28) != null) {
                in0Var2.q(28, 1, (String) in0Var.n(28));
            }
            if (in0Var.n(29) != null) {
                in0Var2.q(29, 1, (String) in0Var.n(29));
            }
            if (in0Var.n(30) != null) {
                in0Var2.q(30, 1, (String) in0Var.n(30));
            }
            if (in0Var.n(31) != null) {
                ri0 ri0Var = (ri0) in0Var.n(31);
                ri0 ri0Var2 = new ri0(2443, 1, 4);
                if (ri0Var.n(0) != null) {
                    ri0Var2.q(0, 1, (String) ri0Var.n(0));
                }
                if (ri0Var.n(1) != null) {
                    ri0Var2.q(1, 1, (String) ri0Var.n(1));
                }
                if (ri0Var.n(2) != null) {
                    ri0Var2.q(2, 1, (String) ri0Var.n(2));
                }
                if (ri0Var.n(3) != null) {
                    ri0Var2.q(3, 1, (String) ri0Var.n(3));
                }
                in0Var2.q(31, 1, ri0Var2);
            }
            if (in0Var.n(32) != null) {
                in0Var2.q(32, 1, (Long) in0Var.n(32));
            }
            if (in0Var.n(33) != null) {
                in0Var2.q(33, 1, (String) in0Var.n(33));
            }
            if (in0Var.n(34) != null) {
                in0Var2.q(34, 1, (Long) in0Var.n(34));
            }
            if (in0Var.n(35) != null) {
                in0Var2.q(35, 1, (Long) in0Var.n(35));
            }
            if (in0Var.n(36) != null) {
                in0Var2.q(36, 1, (Long) in0Var.n(36));
            }
            if (in0Var.n(37) != null) {
                in0Var2.q(37, 1, (Long) in0Var.n(37));
            }
            if (in0Var.n(38) != null) {
                in0Var2.q(38, 1, (Long) in0Var.n(38));
            }
            if (in0Var.n(39) != null) {
                in0Var2.q(39, 1, (String) in0Var.n(39));
            }
            if (in0Var.n(40) != null) {
                in0Var2.q(40, 1, (String) in0Var.n(40));
            }
            if (in0Var.n(41) != null) {
                in0Var2.q(41, 1, (Long) in0Var.n(41));
            }
            if (in0Var.n(42) != null) {
                in0Var2.q(42, 1, (Boolean) in0Var.n(42));
            }
            if (in0Var.n(43) != null) {
                in0Var2.q(43, 1, (Boolean) in0Var.n(43));
            }
            if (in0Var.n(44) != null) {
                in0Var2.q(44, 1, (String) in0Var.n(44));
            }
            if (in0Var.n(45) != null) {
                in0Var2.q(45, 1, (String) in0Var.n(45));
            }
            if (in0Var.n(46) != null) {
                in0Var2.q(46, 1, (Boolean) in0Var.n(46));
            }
            if (in0Var.n(47) != null) {
                in0Var2.q(47, 1, (Long) in0Var.n(47));
            }
            if (in0Var.n(49) != null) {
                in0Var2.q(49, 1, (String) in0Var.n(49));
            }
            if (in0Var.n(50) != null) {
                in0Var2.q(50, 1, (String) in0Var.n(50));
            }
            if (in0Var.n(51) != null) {
                in0Var2.q(51, 1, (String) in0Var.n(51));
            }
            if (in0Var.n(52) != null) {
                in0Var2.q(52, 1, (String) in0Var.n(52));
            }
            if (in0Var.n(53) != null) {
                in0Var2.q(53, 1, (Boolean) in0Var.n(53));
            }
            if (in0Var.n(54) != null) {
                in0Var2.q(54, 1, (ig0) in0Var.n(54));
            }
            x56Var.q(13, 1, in0Var2);
        }
        if (x56Var2.n(14) != null) {
            rr0 rr0Var = (rr0) x56Var2.n(14);
            rr0 rr0Var2 = new rr0(2443, 1, 25);
            rr0Var.x(rr0Var2);
            x56Var.q(14, 1, rr0Var2);
        }
        if (x56Var2.n(15) != null) {
            sn0 sn0Var = (sn0) x56Var2.n(15);
            sn0 sn0Var2 = new sn0(2443, 1, 14);
            if (sn0Var.n(0) != null) {
                sn0Var2.q(0, 1, (Boolean) sn0Var.n(0));
            }
            if (sn0Var.n(1) != null) {
                sn0Var2.q(1, 1, (lb0) sn0Var.n(1));
            }
            if (sn0Var.n(2) != null) {
                sn0Var2.q(2, 1, (Boolean) sn0Var.n(2));
            }
            if (sn0Var.n(3) != null) {
                sn0Var2.q(3, 1, (Boolean) sn0Var.n(3));
            }
            if (sn0Var.n(4) != null) {
                sn0Var2.q(4, 1, (Boolean) sn0Var.n(4));
            }
            if (sn0Var.n(5) != null) {
                sn0Var2.q(5, 1, (Boolean) sn0Var.n(5));
            }
            if (sn0Var.n(6) != null) {
                sn0Var2.q(6, 1, (Boolean) sn0Var.n(6));
            }
            if (sn0Var.n(7) != null) {
                sn0Var2.q(7, 1, (Long) sn0Var.n(7));
            }
            if (sn0Var.n(8) != null) {
                sn0Var2.q(8, 1, (Boolean) sn0Var.n(8));
            }
            if (sn0Var.n(9) != null) {
                sn0Var2.q(9, 1, (Long) sn0Var.n(9));
            }
            if (sn0Var.n(10) != null) {
                sn0Var2.q(10, 1, (Boolean) sn0Var.n(10));
            }
            if (sn0Var.n(11) != null) {
                sn0Var2.q(11, 1, (Long) sn0Var.n(11));
            }
            if (sn0Var.n(12) != null) {
                HashMap map = (HashMap) sn0Var.n(12);
                HashMap map2 = new HashMap(map.size());
                for (Map.Entry entry : map.entrySet()) {
                    qj0 qj0Var = new qj0(2443, -1, 1);
                    String str = (String) entry.getKey();
                    qj0 qj0Var2 = (qj0) ((jf0) entry.getValue());
                    if (qj0Var2.n(0) != null) {
                        qj0Var.q(0, 1, (vd0) qj0Var2.n(0));
                    }
                    map2.put(str, qj0Var);
                }
                sn0Var2.q(12, 1, map2);
            }
            if (sn0Var.n(13) != null) {
                sn0Var2.q(13, 1, (Long) sn0Var.n(13));
            }
            x56Var.q(15, 1, sn0Var2);
        }
        if (x56Var2.n(17) != null) {
            ls0 ls0Var = (ls0) x56Var2.n(17);
            ls0 ls0Var2 = new ls0(2443, 1, 9);
            if (ls0Var.n(0) != null) {
                ls0Var2.q(0, 1, (String) ls0Var.n(0));
            }
            if (ls0Var.n(1) != null) {
                ls0Var2.q(1, 1, (String) ls0Var.n(1));
            }
            if (ls0Var.n(2) != null) {
                ls0Var2.q(2, 1, (String) ls0Var.n(2));
            }
            if (ls0Var.n(3) != null) {
                ls0Var2.q(3, 1, (String) ls0Var.n(3));
            }
            if (ls0Var.n(4) != null) {
                ls0Var2.q(4, 1, (String) ls0Var.n(4));
            }
            if (ls0Var.n(5) != null) {
                ls0Var2.q(5, 1, (String) ls0Var.n(5));
            }
            if (ls0Var.n(6) != null) {
                ao0 ao0Var = (ao0) ls0Var.n(6);
                ao0 ao0Var2 = new ao0(2443, 1, 3);
                if (ao0Var.n(0) != null) {
                    ao0Var2.q(0, 1, (Boolean) ao0Var.n(0));
                }
                if (ao0Var.n(1) != null) {
                    ao0Var2.q(1, 1, (Boolean) ao0Var.n(1));
                }
                if (ao0Var.n(2) != null) {
                    ao0Var2.q(2, 1, (f80) ao0Var.n(2));
                }
                ls0Var2.q(6, 1, ao0Var2);
            }
            if (ls0Var.n(7) != null) {
                ls0Var2.q(7, 1, (Long) ls0Var.n(7));
            }
            if (ls0Var.n(8) != null) {
                ls0Var2.q(8, 1, (Integer) ls0Var.n(8));
            }
            x56Var.q(17, 1, ls0Var2);
        }
        if (x56Var2.n(18) != null) {
            zu0 zu0Var = (zu0) x56Var2.n(18);
            zu0 zu0Var2 = new zu0(2443, 1, 4);
            if (zu0Var.n(0) != null) {
                zu0Var2.q(0, 1, (String) zu0Var.n(0));
            }
            if (zu0Var.n(1) != null) {
                zu0Var2.q(1, 1, (String) zu0Var.n(1));
            }
            if (zu0Var.n(2) != null) {
                zu0Var2.q(2, 1, (String) zu0Var.n(2));
            }
            if (zu0Var.n(3) != null) {
                zu0Var2.q(3, 1, (String) zu0Var.n(3));
            }
            x56Var.q(18, 1, zu0Var2);
        }
        if (x56Var2.n(22) != null) {
            c66 c66Var = (c66) x56Var2.n(22);
            c66 c66Var2 = new c66(2443, 1, 7);
            if (c66Var.n(6) != null) {
                c66Var2.q(6, 1, (wr0) c66Var.n(6));
            }
            x56Var.q(22, 1, c66Var2);
        }
        if (x56Var2.n(26) != null) {
            hm0 hm0Var = (hm0) x56Var2.n(26);
            hm0 hm0Var2 = new hm0(2443, 1, 2);
            if (hm0Var.n(1) != null) {
                hm0Var2.q(1, 1, (e80) hm0Var.n(1));
            }
            x56Var.q(26, 1, hm0Var2);
        }
        if (x56Var2.n(27) != null) {
            b66 b66Var = (b66) x56Var2.n(27);
            b66 b66Var2 = new b66(2443, 1, 89);
            b66Var.x(b66Var2, zpaVar);
            x56Var.q(27, 1, b66Var2);
        }
        if (x56Var2.n(28) != null) {
            HashMap map3 = (HashMap) x56Var2.n(28);
            HashMap map4 = new HashMap(map3.size());
            for (Map.Entry entry2 : map3.entrySet()) {
                ds0 ds0Var = new ds0(2443, -1, 2);
                String str2 = (String) entry2.getKey();
                ds0 ds0Var2 = (ds0) ((jf0) entry2.getValue());
                if (ds0Var2.n(0) != null) {
                    ds0Var.q(0, 1, (vd0) ds0Var2.n(0));
                }
                if (ds0Var2.n(1) != null) {
                    ds0Var.q(1, 1, (op0) ds0Var2.n(1));
                }
                map4.put(str2, ds0Var);
            }
            x56Var.q(28, 1, map4);
        }
        if (x56Var2.n(29) != null) {
            HashMap map5 = (HashMap) x56Var2.n(29);
            HashMap map6 = new HashMap(map5.size());
            for (Map.Entry entry3 : map5.entrySet()) {
                ct0 ct0Var = new ct0(2443, -1, 2);
                String str3 = (String) entry3.getKey();
                ct0 ct0Var2 = (ct0) ((jf0) entry3.getValue());
                if (ct0Var2.n(0) != null) {
                    ct0Var.q(0, 1, (vd0) ct0Var2.n(0));
                }
                if (ct0Var2.n(1) != null) {
                    ct0Var.q(1, 1, (op0) ct0Var2.n(1));
                }
                map6.put(str3, ct0Var);
            }
            x56Var.q(29, 1, map6);
        }
        if (x56Var2.n(30) != null) {
            s70 s70Var = (s70) x56Var2.n(30);
            s70 s70Var2 = new s70(2443, 1, 16);
            s70Var.x(s70Var2);
            x56Var.q(30, 1, s70Var2);
        }
        if (x56Var2.n(34) != null) {
            x56Var.q(34, 1, (String) x56Var2.n(34));
        }
        if (x56Var2.n(35) != null) {
            q56 q56Var = (q56) x56Var2.n(35);
            q56 q56Var2 = new q56(2443, 1, 34);
            q56Var.x(q56Var2);
            x56Var.q(35, 1, q56Var2);
        }
        if (x56Var2.n(39) != null) {
            x56Var.q(39, 1, (Long) x56Var2.n(39));
        }
        if (x56Var2.n(40) != null) {
            ea0 ea0Var = (ea0) x56Var2.n(40);
            ea0 ea0Var2 = new ea0(2443, 1, 12);
            ea0Var.x(ea0Var2);
            x56Var.q(40, 1, ea0Var2);
        }
        if (x56Var2.n(41) != null) {
            xt0 xt0Var = (xt0) x56Var2.n(41);
            xt0 xt0Var2 = new xt0(2443, 1, 5);
            xt0Var.x(xt0Var2, zpaVar);
            x56Var.q(41, 1, xt0Var2);
        }
        if (x56Var2.n(43) != null) {
            e66 e66Var = (e66) x56Var2.n(43);
            e66 e66Var2 = new e66(2443, 1, 31);
            e66Var.x(e66Var2);
            x56Var.q(43, 1, e66Var2);
        }
        if (x56Var2.n(44) != null) {
            zs0 zs0Var = (zs0) x56Var2.n(44);
            zs0 zs0Var2 = new zs0(2443, 1, 15);
            zs0Var.x(zs0Var2);
            x56Var.q(44, 1, zs0Var2);
        }
        if (x56Var2.n(48) != null) {
            md0 md0Var = (md0) x56Var2.n(48);
            md0 md0Var2 = new md0(2443, 1, 3);
            md0Var.x(md0Var2, zpaVar);
            x56Var.q(48, 1, md0Var2);
        }
        if (x56Var2.n(49) != null) {
            s56 s56Var = (s56) x56Var2.n(49);
            s56 s56Var2 = new s56(2443, 1, 2);
            if (s56Var.n(0) != null) {
                s56Var2.q(0, 1, new ArrayList((List) s56Var.n(0)));
            }
            if (s56Var.n(1) != null) {
                s56Var2.q(1, 1, new HashMap((Map) s56Var.n(1)));
            }
            x56Var.q(49, 1, s56Var2);
        }
    }

    @Override // defpackage.rsf
    public final rsf e(rsf rsfVar) {
        x56 x56Var = ((g11) rsfVar).b;
        x56 x56Var2 = this.b;
        x56Var2.m(x56Var);
        return new g11(this.a, x56Var2);
    }

    @Override // defpackage.rsf
    public final String f() {
        return (String) this.b.n(0);
    }

    @Override // defpackage.rsf
    public final void g(int i, int i2, int i3) {
        hf0 hf0Var;
        s9i s9iVar = this.a;
        zpa zpaVar = (zpa) s9iVar.c;
        rl0 rl0Var = new rl0(2443, -1, 5);
        rl0Var.p(0, 1, System.currentTimeMillis());
        int iA = vep.A(i2);
        rl0Var.q(1, 1, (iA == 0 || iA != 1) ? ul0.b : ul0.c);
        Context context = (Context) s9iVar.b;
        bj0 bj0VarD = zpa.D();
        ui6.u(context, bj0VarD);
        rl0Var.q(2, 1, bj0VarD);
        int iA2 = vep.A(i);
        rl0Var.q(3, 1, iA2 != 2 ? iA2 != 3 ? iA2 != 4 ? iA2 != 5 ? iA2 != 6 ? tl0.b : tl0.f : tl0.g : tl0.e : tl0.d : tl0.c);
        if (i == 3) {
            rl0Var.o(4, 1, i3);
        }
        n56 n56VarY = this.b.z(zpaVar).y(zpaVar);
        List list = (List) n56VarY.n(5);
        if (list == null || list.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            n56VarY.q(5, 1, arrayList);
            hf0Var = new hf0(n56VarY, 5, arrayList);
        } else {
            hf0Var = new hf0(n56VarY, 5, list);
        }
        hf0Var.add(rl0Var);
    }

    @Override // defpackage.rsf
    public final void h(ByteArrayOutputStream byteArrayOutputStream, long j) throws IOException {
        this.b.t(byteArrayOutputStream, j);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:166:0x053a  */
    @Override // defpackage.rsf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(int r23, boolean r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1440
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g11.i(int, boolean):void");
    }

    @Override // defpackage.rsf
    public final boolean isEmpty() {
        return false;
    }

    @Override // defpackage.rsf
    public final void j(String str) {
        this.b.V(0, str);
    }
}
