package defpackage;

import java.io.EOFException;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.coroutines.d;
import kotlin.coroutines.e;
import kotlin.coroutines.h;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.text.c;

/* loaded from: classes.dex */
public final class fa7 implements AutoCloseable {
    public static final Regex r = new Regex("[a-z0-9_-]{1,120}");
    public final w6g a;
    public final long b;
    public final w6g c;
    public final w6g d;
    public final w6g e;
    public final LinkedHashMap f;
    public final a64 g;
    public final Object h;
    public long i;
    public int j;
    public slh k;
    public boolean l;
    public boolean m;
    public boolean n;
    public boolean o;
    public boolean p;
    public final da7 q;

    public fa7(long j, g29 g29Var, w6g w6gVar, h hVar) {
        this.a = w6gVar;
        this.b = j;
        if (j <= 0) {
            qp2.o("maxSize <= 0");
            throw null;
        }
        this.c = w6gVar.e("journal");
        this.d = w6gVar.e("journal.tmp");
        this.e = w6gVar.e("journal.bkp");
        this.f = new LinkedHashMap(0, 0.75f, true);
        csk cskVarA = zch.a();
        hVar.getClass();
        ot5 ot5Var = d.Hq;
        cv6 cv6Var = bb7.a;
        this.g = sgb.b(e.a(cskVarA, mr6.b.K(1, (String) null)));
        this.h = new Object();
        this.q = new da7(g29Var);
    }

    public static void t(String str) {
        if (r.j(str)) {
            return;
        }
        bxl.d(sko.k("keys must match regex [a-z0-9_-]{1,120}: \"", str, "\""));
    }

    public final void D() {
        synchronized (this.h) {
            slh slhVar = this.k;
            if (slhVar != null) {
                slhVar.close();
            }
            slh slhVar2 = new slh(this.q.sink(this.d, false));
            try {
                slhVar2.S("libcore.io.DiskLruCache");
                slhVar2.writeByte(10);
                slhVar2.S("1");
                slhVar2.writeByte(10);
                slhVar2.u0(3L);
                slhVar2.writeByte(10);
                slhVar2.u0(2L);
                slhVar2.writeByte(10);
                slhVar2.writeByte(10);
                for (ba7 ba7Var : this.f.values()) {
                    if (ba7Var.g != null) {
                        slhVar2.S("DIRTY");
                        slhVar2.writeByte(32);
                        slhVar2.S(ba7Var.a);
                        slhVar2.writeByte(10);
                    } else {
                        slhVar2.S("CLEAN");
                        slhVar2.writeByte(32);
                        slhVar2.S(ba7Var.a);
                        for (long j : ba7Var.b) {
                            slhVar2.writeByte(32);
                            slhVar2.u0(j);
                        }
                        slhVar2.writeByte(10);
                    }
                }
                try {
                    slhVar2.close();
                    th = null;
                } catch (Throwable th) {
                    th = th;
                }
            } catch (Throwable th2) {
                th = th2;
                try {
                    slhVar2.close();
                } catch (Throwable th3) {
                    wf8.a(th, th3);
                }
            }
            if (th != null) {
                throw th;
            }
            boolean zExists = this.q.exists(this.c);
            da7 da7Var = this.q;
            if (zExists) {
                da7Var.atomicMove(this.c, this.e);
                this.q.atomicMove(this.d, this.c);
                this.q.delete(this.e);
            } else {
                da7Var.atomicMove(this.d, this.c);
            }
            this.k = new slh(new fq8(this.q.appendingSink(this.c), new wg5(this, (byte) 21)));
            this.j = 0;
            this.l = false;
            this.p = false;
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        synchronized (this.h) {
            if (!this.m || this.n) {
                this.n = true;
            } else {
                for (ba7 ba7Var : (ba7[]) this.f.values().toArray(new ba7[0])) {
                    tn tnVar = ba7Var.g;
                    if (tnVar != null) {
                        ba7 ba7Var2 = (ba7) tnVar.b;
                        if (Intrinsics.a(ba7Var2.g, tnVar)) {
                            ba7Var2.f = true;
                        }
                    }
                }
                s();
                sgb.k(this.g, null);
                this.k.close();
                this.k = null;
                this.n = true;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0107 A[Catch: all -> 0x0114, TRY_LEAVE, TryCatch #0 {, blocks: (B:4:0x0003, B:8:0x0013, B:12:0x001a, B:14:0x0022, B:16:0x0032, B:17:0x0037, B:20:0x003d, B:22:0x0057, B:24:0x0066, B:26:0x0074, B:28:0x007b, B:23:0x005b, B:32:0x009b, B:34:0x00a2, B:35:0x00a6, B:37:0x00b4, B:39:0x00b8, B:44:0x00f3, B:46:0x00fe, B:50:0x0107, B:40:0x00d0, B:42:0x00e5, B:43:0x00f0, B:31:0x008b, B:53:0x010c, B:54:0x0113), top: B:58:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h(tn r11, boolean r12) {
        /*
            Method dump skipped, instructions count: 279
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fa7.h(tn, boolean):void");
    }

    public final tn k(String str) {
        synchronized (this.h) {
            if (this.n) {
                throw new IllegalStateException("cache is closed");
            }
            t(str);
            m();
            ba7 ba7Var = (ba7) this.f.get(str);
            if ((ba7Var != null ? ba7Var.g : null) == null && (ba7Var == null || ba7Var.h == 0)) {
                if (this.o || this.p) {
                    n();
                } else {
                    slh slhVar = this.k;
                    slhVar.S("DIRTY");
                    slhVar.writeByte(32);
                    slhVar.S(str);
                    slhVar.writeByte(10);
                    slhVar.flush();
                    if (!this.l) {
                        if (ba7Var == null) {
                            ba7Var = new ba7(this, str);
                            this.f.put(str, ba7Var);
                        }
                        tn tnVar = new tn(this, ba7Var);
                        ba7Var.g = tnVar;
                        return tnVar;
                    }
                }
            }
            return null;
        }
    }

    public final ca7 l(String str) {
        ca7 ca7VarA;
        synchronized (this.h) {
            if (this.n) {
                throw new IllegalStateException("cache is closed");
            }
            t(str);
            m();
            ba7 ba7Var = (ba7) this.f.get(str);
            if (ba7Var == null || (ca7VarA = ba7Var.a()) == null) {
                return null;
            }
            this.j++;
            slh slhVar = this.k;
            slhVar.S("READ");
            slhVar.writeByte(32);
            slhVar.S(str);
            slhVar.writeByte(10);
            slhVar.flush();
            if (this.j >= 2000) {
                n();
            }
            return ca7VarA;
        }
    }

    public final void m() {
        synchronized (this.h) {
            if (!this.m) {
                this.q.delete(this.d);
                if (this.q.exists(this.e)) {
                    boolean zExists = this.q.exists(this.c);
                    da7 da7Var = this.q;
                    w6g w6gVar = this.e;
                    if (zExists) {
                        da7Var.delete(w6gVar);
                    } else {
                        da7Var.atomicMove(w6gVar, this.c);
                    }
                }
                if (this.q.exists(this.c)) {
                    try {
                        p();
                        o();
                        this.m = true;
                    } catch (IOException unused) {
                        try {
                            close();
                            phj.L(this.q, this.a);
                            this.n = false;
                        } catch (Throwable th) {
                            this.n = false;
                            throw th;
                        }
                    }
                } else {
                    D();
                    this.m = true;
                }
            }
        }
    }

    public final void n() {
        na2.B(this.g, null, null, new bz1((byte) 7, (mt5) null, this), 3);
    }

    public final void o() {
        Iterator it = this.f.values().iterator();
        long j = 0;
        while (it.hasNext()) {
            ba7 ba7Var = (ba7) it.next();
            int i = 0;
            if (ba7Var.g == null) {
                while (i < 2) {
                    j += ba7Var.b[i];
                    i++;
                }
            } else {
                ba7Var.g = null;
                while (i < 2) {
                    w6g w6gVar = (w6g) ba7Var.c.get(i);
                    da7 da7Var = this.q;
                    da7Var.delete(w6gVar);
                    da7Var.delete((w6g) ba7Var.d.get(i));
                    i++;
                }
                it.remove();
            }
        }
        this.i = j;
    }

    public final void p() throws Throwable {
        da7 da7Var = this.q;
        w6g w6gVar = this.c;
        tlh tlhVar = new tlh(da7Var.source(w6gVar));
        try {
            String strM = tlhVar.M(Long.MAX_VALUE);
            String strM2 = tlhVar.M(Long.MAX_VALUE);
            String strM3 = tlhVar.M(Long.MAX_VALUE);
            String strM4 = tlhVar.M(Long.MAX_VALUE);
            String strM5 = tlhVar.M(Long.MAX_VALUE);
            if (!"libcore.io.DiskLruCache".equals(strM) || !"1".equals(strM2) || !Intrinsics.a(String.valueOf(3), strM3) || !Intrinsics.a(String.valueOf(2), strM4) || strM5.length() > 0) {
                throw new IOException("unexpected journal header: [" + strM + ", " + strM2 + ", " + strM3 + ", " + strM4 + ", " + strM5 + "]");
            }
            int i = 0;
            while (true) {
                try {
                    q(tlhVar.M(Long.MAX_VALUE));
                    i++;
                } catch (EOFException unused) {
                    this.j = i - this.f.size();
                    if (tlhVar.x()) {
                        this.k = new slh(new fq8(da7Var.appendingSink(w6gVar), new wg5(this, (byte) 21)));
                    } else {
                        D();
                    }
                    try {
                        tlhVar.close();
                        th = null;
                    } catch (Throwable th) {
                        th = th;
                    }
                    if (th != null) {
                        throw th;
                    }
                    return;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            try {
                tlhVar.close();
            } catch (Throwable th3) {
                wf8.a(th, th3);
            }
        }
    }

    public final void q(String str) {
        String strSubstring;
        int iK = StringsKt.K(str, ' ', 0, 6);
        if (iK == -1) {
            s49.m(sko.j("unexpected journal line: ", str));
            return;
        }
        int i = iK + 1;
        int iK2 = StringsKt.K(str, ' ', i, 4);
        LinkedHashMap linkedHashMap = this.f;
        if (iK2 == -1) {
            strSubstring = str.substring(i);
            if (iK == 6 && c.q(str, "REMOVE", false)) {
                linkedHashMap.remove(strSubstring);
                return;
            }
        } else {
            strSubstring = str.substring(i, iK2);
        }
        Object ba7Var = linkedHashMap.get(strSubstring);
        if (ba7Var == null) {
            ba7Var = new ba7(this, strSubstring);
            linkedHashMap.put(strSubstring, ba7Var);
        }
        ba7 ba7Var2 = (ba7) ba7Var;
        if (iK2 == -1 || iK != 5 || !c.q(str, "CLEAN", false)) {
            if (iK2 == -1 && iK == 5 && c.q(str, "DIRTY", false)) {
                ba7Var2.g = new tn(this, ba7Var2);
                return;
            } else {
                if (iK2 == -1 && iK == 4 && c.q(str, "READ", false)) {
                    return;
                }
                s49.m(sko.j("unexpected journal line: ", str));
                return;
            }
        }
        List listX = StringsKt.X(str.substring(iK2 + 1), new char[]{' '});
        ba7Var2.e = true;
        ba7Var2.g = null;
        if (listX.size() != 2) {
            n57.d(listX, "unexpected journal line: ");
            return;
        }
        try {
            int size = listX.size();
            for (int i2 = 0; i2 < size; i2++) {
                ba7Var2.b[i2] = Long.parseLong((String) listX.get(i2));
            }
        } catch (NumberFormatException unused) {
            n57.d(listX, "unexpected journal line: ");
        }
    }

    public final void r(ba7 ba7Var) {
        slh slhVar;
        int i = ba7Var.h;
        String str = ba7Var.a;
        if (i > 0 && (slhVar = this.k) != null) {
            slhVar.S("DIRTY");
            slhVar.writeByte(32);
            slhVar.S(str);
            slhVar.writeByte(10);
            slhVar.flush();
        }
        if (ba7Var.h > 0 || ba7Var.g != null) {
            ba7Var.f = true;
            return;
        }
        for (int i2 = 0; i2 < 2; i2++) {
            this.q.delete((w6g) ba7Var.c.get(i2));
            long j = this.i;
            long[] jArr = ba7Var.b;
            this.i = j - jArr[i2];
            jArr[i2] = 0;
        }
        this.j++;
        slh slhVar2 = this.k;
        if (slhVar2 != null) {
            slhVar2.S("REMOVE");
            slhVar2.writeByte(32);
            slhVar2.S(str);
            slhVar2.writeByte(10);
            slhVar2.flush();
        }
        this.f.remove(str);
        if (this.j >= 2000) {
            n();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0022, code lost:
    
        r(r1);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void s() {
        /*
            r4 = this;
        L0:
            long r0 = r4.i
            long r2 = r4.b
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L27
            java.util.LinkedHashMap r0 = r4.f
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        L12:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L26
            java.lang.Object r1 = r0.next()
            ba7 r1 = (defpackage.ba7) r1
            boolean r2 = r1.f
            if (r2 != 0) goto L12
            r4.r(r1)
            goto L0
        L26:
            return
        L27:
            r0 = 0
            r4.o = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fa7.s():void");
    }
}
