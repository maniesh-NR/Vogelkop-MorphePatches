package defpackage;

import java.util.Objects;

/* loaded from: classes.dex */
public final class apb implements cn8 {
    public en8 b;
    public byte c;
    public int d;
    public int e;
    public gae g;
    public lp6 h;
    public yv4 i;
    public bbe j;
    public final g1g a = new g1g(2);
    public long f = -1;

    @Override // defpackage.cn8
    public final boolean a(dn8 dn8Var) {
        String strV;
        lp6 lp6Var = (lp6) dn8Var;
        g1g g1gVar = this.a;
        g1gVar.K(2);
        lp6Var.peekFully(g1gVar.a, 0, 2, false);
        if (g1gVar.H() == 65496) {
            while (true) {
                g1gVar.K(2);
                lp6Var.peekFully(g1gVar.a, 0, 2, false);
                int iH = g1gVar.H();
                this.d = iH;
                if (iH == 65498) {
                    break;
                }
                g1gVar.K(2);
                lp6Var.peekFully(g1gVar.a, 0, 2, false);
                int iH2 = g1gVar.H() - 2;
                if (iH2 < 0) {
                    break;
                }
                if (this.d != 65505) {
                    lp6Var.a(iH2, false);
                } else {
                    g1gVar.K(iH2);
                    lp6Var.peekFully(g1gVar.a, 0, iH2, false);
                    if (Objects.equals(g1gVar.v(), "http://ns.adobe.com/xap/1.0/") && (strV = g1gVar.v()) != null) {
                        String[] strArr = mkh.g;
                        for (int i = 0; i < 4; i++) {
                            if (strV.contains(strArr[i] + "=\"1\"")) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:86:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0188  */
    @Override // defpackage.cn8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int b(defpackage.dn8 r26, hp2 r27) throws defpackage.s1g, java.io.InterruptedIOException {
        /*
            Method dump skipped, instructions count: 487
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.apb.b(dn8, hp2):int");
    }

    @Override // defpackage.cn8
    public final void d(en8 en8Var) {
        this.b = en8Var;
    }

    public final void e() {
        en8 en8Var = this.b;
        en8Var.getClass();
        en8Var.endTracks();
        this.b.h(new rv2(-9223372036854775807L));
        this.c = (byte) 6;
    }

    @Override // defpackage.cn8
    public final void release() {
        bbe bbeVar = this.j;
        if (bbeVar != null) {
            bbeVar.getClass();
        }
    }

    @Override // defpackage.cn8
    public final void seek(long j, long j2) {
        if (j == 0) {
            this.c = (byte) 0;
            this.j = null;
        } else if (this.c == 5) {
            bbe bbeVar = this.j;
            bbeVar.getClass();
            bbeVar.seek(j, j2);
        }
    }
}
