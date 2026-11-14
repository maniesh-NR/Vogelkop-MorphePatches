package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public class yag extends uag {
    public final wag e;
    public Object f;
    public boolean g;
    public int h;

    public yag(wag wagVar, v6m[] v6mVarArr) {
        super(wagVar.c, v6mVarArr);
        this.e = wagVar;
        this.h = wagVar.e;
    }

    public final void e(int i, u6m u6mVar, Object obj, int i2) {
        v6m[] v6mVarArr = (v6m[]) ((uag) this).d;
        int i3 = i2 * 5;
        if (i3 <= 30) {
            int iQ = 1 << upj.q(i, i3);
            if (u6mVar.h(iQ)) {
                v6mVarArr[i2].a(u6mVar.d, Integer.bitCount(u6mVar.a) << 1, u6mVar.f(iQ));
                ((uag) this).b = i2;
                return;
            } else {
                int iT = u6mVar.t(iQ);
                u6m u6mVarS = u6mVar.s(iT);
                v6mVarArr[i2].a(u6mVar.d, Integer.bitCount(u6mVar.a) << 1, iT);
                e(i, u6mVarS, obj, i2 + 1);
                return;
            }
        }
        v6m v6mVar = v6mVarArr[i2];
        Object[] objArr = u6mVar.d;
        v6mVar.a(objArr, objArr.length, 0);
        while (true) {
            v6m v6mVar2 = v6mVarArr[i2];
            if (Intrinsics.a(v6mVar2.b[v6mVar2.d], obj)) {
                ((uag) this).b = i2;
                return;
            } else {
                v6mVarArr[i2].d += 2;
            }
        }
    }

    public final Object next() {
        if (this.e.e != this.h) {
            t40.e();
            return null;
        }
        if (!((uag) this).c) {
            t3p.y();
            return null;
        }
        v6m v6mVar = ((v6m[]) ((uag) this).d)[((uag) this).b];
        this.f = v6mVar.b[v6mVar.d];
        this.g = true;
        return super.next();
    }

    public final void remove() {
        if (!this.g) {
            h9o.e();
            return;
        }
        boolean z = ((uag) this).c;
        wag wagVar = this.e;
        if (!z) {
            y9m.r(wagVar).remove(this.f);
        } else {
            if (!z) {
                t3p.y();
                return;
            }
            v6m v6mVar = ((v6m[]) ((uag) this).d)[((uag) this).b];
            Object obj = v6mVar.b[v6mVar.d];
            y9m.r(wagVar).remove(this.f);
            e(obj != null ? obj.hashCode() : 0, wagVar.c, obj, 0);
        }
        this.f = null;
        this.g = false;
        this.h = wagVar.e;
    }
}
