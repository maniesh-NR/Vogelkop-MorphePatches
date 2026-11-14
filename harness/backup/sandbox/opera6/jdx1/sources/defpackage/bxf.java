package defpackage;

import android.os.Trace;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class bxf {
    public final i4d a;
    public final jde b;
    public final kde c;
    public final hde d;
    public final jde e;
    public float f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public boolean l;
    public int m;
    public final u5c n;
    public final p8f o;

    public bxf(i4d i4dVar, u5c u5cVar, d8e d8eVar) {
        this.a = i4dVar;
        jde jdeVar = xbb.a;
        this.b = new jde();
        this.c = new kde();
        int i = sbb.a;
        this.d = new hde();
        this.e = new jde();
        this.g = -1;
        this.h = Integer.MAX_VALUE;
        this.i = LinearLayoutManager.INVALID_OFFSET;
        this.n = u5cVar;
        this.o = new p8f(d8eVar);
    }

    public final int a(p8f p8fVar, int i, boolean z) {
        List list;
        List list2;
        jde jdeVar = this.e;
        if (jdeVar.b(i)) {
            return ((w74) jdeVar.e(i)).b;
        }
        jde jdeVar2 = this.b;
        int i2 = 0;
        if (jdeVar2.b(i)) {
            if (!z || (list2 = (List) jdeVar2.e(i)) == null) {
                return -1;
            }
            int size = list2.size();
            while (i2 < size) {
                ((t5c) list2.get(i2)).a();
                i2++;
            }
            return -1;
        }
        n74 n74Var = new n74(this, p8fVar, (byte) 0);
        jxf jxfVar = (jxf) p8fVar.c;
        if (jxfVar == null) {
            jxfVar = null;
        }
        long j = jxfVar.u;
        u5c u5cVar = (u5c) p8fVar.d;
        jdeVar2.i(i, Collections.singletonList((u5cVar != null ? u5cVar : null).a(i, j, true, new vvf(n74Var, p8fVar, (byte) 1))));
        if (!z || (list = (List) jdeVar2.e(i)) == null) {
            return -1;
        }
        int size2 = list.size();
        while (i2 < size2) {
            ((t5c) list.get(i2)).a();
            i2++;
        }
        return -1;
    }

    public final void b(p8f p8fVar, int i, int i2) {
        int i3;
        int i4;
        jde jdeVar = this.e;
        w74 w74Var = (w74) jdeVar.e(i);
        qii qiiVar = w74.c;
        if (w74Var != null) {
            w74Var.b = i2;
            w74Var.a = qiiVar;
        } else {
            w74Var = new w74();
            w74Var.a = qiiVar;
            w74Var.b = i2;
        }
        jdeVar.i(i, w74Var);
        if (i > this.i) {
            this.i = i;
            this.k -= i2;
        } else if (i < this.h) {
            this.h = i;
            this.j -= i2;
        }
        if (Math.signum(this.f) <= 0.0f) {
            if (this.k > 0) {
                i3 = this.i + 1;
                i4 = i3;
            }
            i4 = -1;
        } else {
            if (Math.signum(this.f) > 0.0f && this.j > 0) {
                i3 = this.h - 1;
                i4 = i3;
            }
            i4 = -1;
        }
        if (i4 > 0 && i4 != -1 && i4 < this.m) {
            n74 n74Var = new n74(this, p8fVar, (byte) 1);
            jxf jxfVar = (jxf) p8fVar.c;
            if (jxfVar == null) {
                jxfVar = null;
            }
            long j = jxfVar.u;
            u5c u5cVar = (u5c) p8fVar.d;
            this.b.i(i4, Collections.singletonList((u5cVar != null ? u5cVar : null).a(i4, j, true, new vvf(n74Var, p8fVar, (byte) 1))));
        }
        g();
    }

    public final void c(p8f p8fVar, int i, int i2, int i3, int i4, int i5, float f, boolean z) {
        int i6;
        int i7;
        boolean z2 = Math.signum(f) == Math.signum(this.f);
        if (!z) {
            if (!z2 || this.l) {
                this.j = i3 - i5;
                this.h = i;
            } else {
                int iB = zed.b(Math.abs(f)) + this.j;
                int i8 = i3 - i5;
                if (iB > i8) {
                    iB = i8;
                }
                this.j = iB;
            }
            while (this.j > 0 && (i6 = this.h) > 0) {
                int iA = a(p8fVar, this.h - 1, i6 + (-1) == i + (-1) && f != 0.0f && Math.abs(f) >= ((float) i5));
                if (iA == -1) {
                    return;
                }
                this.h--;
                this.j -= iA;
            }
            return;
        }
        if (!z2 || this.l) {
            this.k = i3 - i4;
            this.i = i2;
        } else {
            int iB2 = zed.b(Math.abs(f)) + this.k;
            int i9 = i3 - i4;
            if (iB2 > i9) {
                iB2 = i9;
            }
            this.k = iB2;
        }
        while (this.k > 0 && (i7 = this.i) != -1 && i7 < this.m - 1) {
            int iA2 = a(p8fVar, this.i + 1, i7 + 1 == i2 + 1 && f != 0.0f && Math.abs(f) >= ((float) i4));
            if (iA2 == -1) {
                return;
            }
            this.i++;
            this.k -= iA2;
        }
    }

    public final void d(float f, jxf jxfVar) {
        bxf bxfVar;
        int i;
        int i2;
        p8f p8fVar = this.o;
        p8fVar.c = jxfVar;
        p8fVar.d = this.n;
        float f2 = -f;
        g();
        if (p8fVar.p()) {
            jxf jxfVar2 = (jxf) p8fVar.c;
            if (jxfVar2 == null) {
                jxfVar2 = null;
            }
            k1g.B(jxfVar2);
            jxf jxfVar3 = (jxf) p8fVar.c;
            if (jxfVar3 == null) {
                jxfVar3 = null;
            }
            n27 n27Var = jxfVar3.t;
            this.m = p8fVar.u();
            int iO = p8fVar.o();
            int iQ = p8fVar.q();
            int iU = p8fVar.u();
            int iS = p8fVar.s();
            int iR = p8fVar.r();
            jde jdeVar = this.e;
            if (f2 <= 0.0f) {
                this.j = 0 - iS;
                this.h = iO;
                while (this.j > 0 && (i2 = this.h) > 0 && jdeVar.b(i2 - 1)) {
                    this.h--;
                    this.j -= ((w74) jdeVar.e(this.h - 1)).b;
                }
                e(0, this.h - 1);
            } else {
                this.k = 0 - iR;
                this.i = iQ;
                while (this.k > 0 && (i = this.i) < iU - 1 && jdeVar.b(i + 1)) {
                    int i3 = ((w74) jdeVar.e(this.i + 1)).b;
                    this.i++;
                    this.k -= i3;
                }
                e(this.i + 1, iU - 1);
            }
        }
        if (p8fVar.p()) {
            jxf jxfVar4 = (jxf) p8fVar.c;
            if (jxfVar4 == null) {
                jxfVar4 = null;
            }
            k1g.B(jxfVar4);
            jxf jxfVar5 = (jxf) p8fVar.c;
            bxfVar = this;
            bxfVar.c(p8fVar, p8fVar.o(), p8fVar.q(), (jxfVar5 != null ? jxfVar5 : null).t != null ? ((sxf) this.a.b).o : 0, p8fVar.r(), p8fVar.s(), f2, f2 <= 0.0f);
        } else {
            bxfVar = this;
        }
        bxfVar.f = f2;
        bxfVar.g();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00f0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(int r29, int r30) {
        /*
            Method dump skipped, instructions count: 415
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bxf.e(int, int):void");
    }

    public final void f() {
        this.h = Integer.MAX_VALUE;
        this.i = LinearLayoutManager.INVALID_OFFSET;
        this.j = 0;
        this.k = 0;
        this.l = false;
        this.d.a();
        this.e.a();
        jde jdeVar = this.b;
        long[] jArr = jdeVar.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        int i5 = jdeVar.b[i4];
                        List list = (List) jdeVar.c[i4];
                        int size = list.size();
                        for (int i6 = 0; i6 < size; i6++) {
                            ((t5c) list.get(i6)).cancel();
                        }
                        jdeVar.h(i4);
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    public final void g() {
        Trace.setCounter("prefetchWindowStartExtraSpace", this.j);
        Trace.setCounter("prefetchWindowEndExtraSpace", this.k);
        Trace.setCounter("prefetchWindowStartIndex", this.h);
        Trace.setCounter("prefetchWindowEndIndex", this.i);
    }
}
