package defpackage;

import android.util.Pair;

/* loaded from: classes.dex */
public abstract class e4 extends gql {
    public static final /* synthetic */ int g = 0;
    public final int e;
    public final jij f;

    public e4(jij jijVar) {
        this.f = jijVar;
        this.e = jijVar.getLength();
    }

    @Override // defpackage.gql
    public final int a(boolean z) {
        if (this.e != 0) {
            int firstIndex = z ? this.f.getFirstIndex() : 0;
            while (x(firstIndex).p()) {
                firstIndex = w(firstIndex, z);
                if (firstIndex == -1) {
                }
            }
            return x(firstIndex).a(z) + v(firstIndex);
        }
        return -1;
    }

    @Override // defpackage.gql
    public final int b(Object obj) {
        int iB;
        if (!(obj instanceof Pair)) {
            return -1;
        }
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        int iQ = q(obj2);
        if (iQ == -1 || (iB = x(iQ).b(obj3)) == -1) {
            return -1;
        }
        return u(iQ) + iB;
    }

    @Override // defpackage.gql
    public final int c(boolean z) {
        int i = this.e;
        if (i != 0) {
            jij jijVar = this.f;
            int lastIndex = z ? jijVar.getLastIndex() : i - 1;
            while (x(lastIndex).p()) {
                lastIndex = z ? jijVar.getPreviousIndex(lastIndex) : lastIndex > 0 ? lastIndex - 1 : -1;
                if (lastIndex == -1) {
                }
            }
            return x(lastIndex).c(z) + v(lastIndex);
        }
        return -1;
    }

    @Override // defpackage.gql
    public final int e(int i, int i2, boolean z) {
        int iS = s(i);
        int iV = v(iS);
        int iE = x(iS).e(i - iV, i2 == 2 ? 0 : i2, z);
        if (iE != -1) {
            return iV + iE;
        }
        int iW = w(iS, z);
        while (iW != -1) {
            if (!x(iW).p()) {
                return x(iW).a(z) + v(iW);
            }
            iW = w(iW, z);
        }
        if (i2 == 2) {
            return a(z);
        }
        return -1;
    }

    @Override // defpackage.gql
    public final dql f(int i, dql dqlVar, boolean z) {
        int iR = r(i);
        int iV = v(iR);
        x(iR).f(i - u(iR), dqlVar, z);
        dqlVar.c += iV;
        if (z) {
            Object objT = t(iR);
            Object obj = dqlVar.b;
            obj.getClass();
            dqlVar.b = Pair.create(objT, obj);
        }
        return dqlVar;
    }

    @Override // defpackage.gql
    public final dql g(Object obj, dql dqlVar) {
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        int iQ = q(obj2);
        int iV = v(iQ);
        x(iQ).g(obj3, dqlVar);
        dqlVar.c += iV;
        dqlVar.b = obj;
        return dqlVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0028, code lost:
    
        r0 = r0 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0028, code lost:
    
        r0 = -1;
     */
    @Override // defpackage.gql
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int k(int r6, int r7, boolean r8) {
        /*
            r5 = this;
            int r0 = r5.s(r6)
            int r1 = r5.v(r0)
            gql r2 = r5.x(r0)
            int r6 = r6 - r1
            r3 = 2
            if (r7 != r3) goto L12
            r4 = 0
            goto L13
        L12:
            r4 = r7
        L13:
            int r6 = r2.k(r6, r4, r8)
            r2 = -1
            if (r6 == r2) goto L1c
            int r1 = r1 + r6
            return r1
        L1c:
            jij r6 = r5.f
            if (r8 == 0) goto L25
            int r0 = r6.getPreviousIndex(r0)
            goto L28
        L25:
            if (r0 <= 0) goto L40
            goto L3d
        L28:
            if (r0 == r2) goto L50
            gql r1 = r5.x(r0)
            boolean r1 = r1.p()
            if (r1 == 0) goto L42
            if (r8 == 0) goto L3b
            int r0 = r6.getPreviousIndex(r0)
            goto L28
        L3b:
            if (r0 <= 0) goto L40
        L3d:
            int r0 = r0 + (-1)
            goto L28
        L40:
            r0 = r2
            goto L28
        L42:
            int r6 = r5.v(r0)
            gql r5 = r5.x(r0)
            int r5 = r5.c(r8)
            int r5 = r5 + r6
            return r5
        L50:
            if (r7 != r3) goto L57
            int r5 = r5.c(r8)
            return r5
        L57:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e4.k(int, int, boolean):int");
    }

    @Override // defpackage.gql
    public final Object l(int i) {
        int iR = r(i);
        return Pair.create(t(iR), x(iR).l(i - u(iR)));
    }

    @Override // defpackage.gql
    public final fql m(int i, fql fqlVar, long j) {
        int iS = s(i);
        int iV = v(iS);
        int iU = u(iS);
        x(iS).m(i - iV, fqlVar, j);
        Object objT = t(iS);
        Object obj = fql.p;
        Object obj2 = fqlVar.a;
        if (obj != obj2) {
            objT = Pair.create(objT, obj2);
        }
        fqlVar.a = objT;
        fqlVar.m += iU;
        fqlVar.n += iU;
        return fqlVar;
    }

    public abstract int q(Object obj);

    public abstract int r(int i);

    public abstract int s(int i);

    public abstract Object t(int i);

    public abstract int u(int i);

    public abstract int v(int i);

    public final int w(int i, boolean z) {
        if (z) {
            return this.f.getNextIndex(i);
        }
        if (i < this.e - 1) {
            return i + 1;
        }
        return -1;
    }

    public abstract gql x(int i);
}
