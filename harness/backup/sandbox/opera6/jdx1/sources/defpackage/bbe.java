package defpackage;

import androidx.core.app.NotificationCompat;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class bbe implements cn8 {
    public long A;
    public en8 B;
    public abe[] C;
    public long[][] D;
    public int E;
    public gae F;
    public final tnk a;
    public final int b;
    public final boolean c;
    public final g1g d;
    public final g1g e;
    public final g1g f;
    public final g1g g;
    public final ArrayDeque h;
    public final zwi i;
    public final ArrayList j;
    public csh k;
    public byte l;
    public int m;
    public long n;
    public int o;
    public g1g p;
    public int q;
    public int r;
    public int s;
    public int t;
    public boolean u;
    public boolean v;
    public boolean w;
    public long x;
    public boolean y;
    public boolean z;

    public bbe(tnk tnkVar, int i) {
        this.a = tnkVar;
        this.b = i;
        this.c = (i & NotificationCompat.FLAG_LOCAL_ONLY) != 0;
        a1b a1bVar = h1b.b;
        this.k = csh.e;
        this.l = (i & 4) != 0 ? (byte) 3 : (byte) 0;
        this.i = new zwi();
        this.j = new ArrayList();
        this.g = new g1g(16);
        this.h = new ArrayDeque();
        this.d = new g1g(qyn.d);
        this.e = new g1g(6);
        this.f = new g1g();
        this.q = -1;
        this.B = en8.Yo;
        this.C = new abe[0];
    }

    @Override // defpackage.cn8
    public final boolean a(dn8 dn8Var) {
        csh cshVarV;
        vuj vujVarW = wyh.W(dn8Var, false, (this.b & 2) != 0);
        if (vujVarW != null) {
            cshVarV = h1b.v(vujVarW);
        } else {
            a1b a1bVar = h1b.b;
            cshVarV = csh.e;
        }
        this.k = cshVarV;
        return vujVarW == null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0548  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0554  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ba  */
    @Override // defpackage.cn8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int b(defpackage.dn8 r43, hp2 r44) throws defpackage.s1g {
        /*
            Method dump skipped, instructions count: 1910
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bbe.b(dn8, hp2):int");
    }

    @Override // defpackage.cn8
    public final List c() {
        return this.k;
    }

    @Override // defpackage.cn8
    public final void d(en8 en8Var) {
        if ((this.b & 16) == 0) {
            en8Var = new h5k(en8Var, this.a);
        }
        this.B = en8Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:154:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x030a  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0325  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x012c A[EDGE_INSN: B:254:0x012c->B:68:0x012c BREAK  A[LOOP:9: B:57:0x00fb->B:66:0x0124], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0124 A[LOOP:9: B:57:0x00fb->B:66:0x0124, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(long r43) {
        /*
            Method dump skipped, instructions count: 1097
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bbe.e(long):void");
    }

    @Override // defpackage.cn8
    public final void release() {
    }

    @Override // defpackage.cn8
    public final void seek(long j, long j2) {
        this.h.clear();
        this.o = 0;
        this.q = -1;
        this.r = 0;
        this.s = 0;
        this.t = 0;
        this.u = false;
        this.z = false;
        if (j == 0) {
            if (this.l != 3) {
                this.l = (byte) 0;
                this.o = 0;
                return;
            } else {
                zwi zwiVar = this.i;
                zwiVar.a.clear();
                zwiVar.b = (byte) 0;
                this.j.clear();
                return;
            }
        }
        for (abe abeVar : this.C) {
            iyl iylVar = abeVar.b;
            int iA = iylVar.a(j2);
            if (iA == -1) {
                iA = iylVar.b(j2);
            }
            abeVar.e = iA;
            k7m k7mVar = abeVar.d;
            if (k7mVar != null) {
                k7mVar.b = false;
                k7mVar.c = 0;
            }
        }
    }
}
