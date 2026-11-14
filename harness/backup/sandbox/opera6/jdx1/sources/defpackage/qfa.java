package defpackage;

import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes.dex */
public final class qfa implements hyl {
    public static final oj9 f;
    public static final oj9 g;
    public final hyl a;
    public final oj9 b;
    public oj9 c;
    public byte[] d;
    public int e;

    static {
        nj9 nj9Var = new nj9();
        nj9Var.m = dzd.p("application/id3");
        f = new oj9(nj9Var);
        nj9 nj9Var2 = new nj9();
        nj9Var2.m = dzd.p("application/x-emsg");
        g = new oj9(nj9Var2);
    }

    public qfa(hyl hylVar, int i) {
        this.a = hylVar;
        if (i == 1) {
            this.b = f;
        } else {
            if (i != 3) {
                qp2.o(sko.i(i, "Unknown metadataType: "));
                throw null;
            }
            this.b = g;
        }
        this.d = new byte[0];
        this.e = 0;
    }

    @Override // defpackage.hyl
    public final void a(long j, int i, int i2, int i3, gyl gylVar) {
        this.c.getClass();
        int i4 = this.e - i3;
        g1g g1gVar = new g1g(Arrays.copyOfRange(this.d, i4 - i2, i4));
        byte[] bArr = this.d;
        System.arraycopy(bArr, i4, bArr, 0, i3);
        this.e = i3;
        String str = this.c.n;
        oj9 oj9Var = this.b;
        String str2 = oj9Var.n;
        String str3 = oj9Var.n;
        if (!Objects.equals(str, str2)) {
            if (!"application/x-emsg".equals(this.c.n)) {
                w7d.K("Ignoring sample for unsupported format: " + this.c.n);
                return;
            }
            uc8 uc8VarY = rt1.y(g1gVar);
            oj9 oj9VarA = uc8VarY.a();
            if (oj9VarA == null || !Objects.equals(str3, oj9VarA.n)) {
                w7d.K("Ignoring EMSG. Expected it to contain wrapped " + str3 + " but actual wrapped format: " + uc8VarY.a());
                return;
            }
            byte[] bArrC = uc8VarY.c();
            bArrC.getClass();
            g1gVar = new g1g(bArrC);
        }
        int iA = g1gVar.a();
        hyl hylVar = this.a;
        hylVar.f(iA, g1gVar);
        hylVar.a(j, i, iA, 0, gylVar);
    }

    @Override // defpackage.hyl
    public final void b(g1g g1gVar, int i, int i2) {
        int i3 = this.e + i;
        byte[] bArrCopyOf = this.d;
        if (bArrCopyOf.length < i3) {
            bArrCopyOf = Arrays.copyOf(bArrCopyOf, (i3 / 2) + i3);
            this.d = bArrCopyOf;
        }
        g1gVar.k(bArrCopyOf, this.e, i);
        this.e += i;
    }

    @Override // defpackage.hyl
    public final int d(oc6 oc6Var, int i, boolean z) {
        int i2 = this.e + i;
        byte[] bArrCopyOf = this.d;
        if (bArrCopyOf.length < i2) {
            bArrCopyOf = Arrays.copyOf(bArrCopyOf, (i2 / 2) + i2);
            this.d = bArrCopyOf;
        }
        int i3 = oc6Var.read(bArrCopyOf, this.e, i);
        if (i3 != -1) {
            this.e += i3;
            return i3;
        }
        if (z) {
            return -1;
        }
        qp2.c();
        return 0;
    }

    @Override // defpackage.hyl
    public final void g(oj9 oj9Var) {
        this.c = oj9Var;
        this.a.g(this.b);
    }
}
