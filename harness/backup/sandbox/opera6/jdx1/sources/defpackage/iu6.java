package defpackage;

/* loaded from: classes.dex */
public final class iu6 {
    public final String a;
    public int b;
    public long c;
    public final jrd d;
    public boolean e;
    public boolean f;
    public final /* synthetic */ ju6 g;

    public iu6(ju6 ju6Var, String str, int i, jrd jrdVar) {
        this.g = ju6Var;
        this.a = str;
        this.b = i;
        this.c = jrdVar == null ? -1L : jrdVar.d;
        if (jrdVar == null || !jrdVar.b()) {
            return;
        }
        this.d = jrdVar;
    }

    public final boolean a(d11 d11Var) {
        jrd jrdVar = d11Var.d;
        gql gqlVar = d11Var.b;
        if (jrdVar == null) {
            return this.b != d11Var.c;
        }
        long j = this.c;
        if (j == -1) {
            return false;
        }
        if (jrdVar.d > j) {
            return true;
        }
        jrd jrdVar2 = this.d;
        if (jrdVar2 == null) {
            return false;
        }
        int i = jrdVar2.b;
        int iB = gqlVar.b(jrdVar.a);
        int iB2 = gqlVar.b(jrdVar2.a);
        if (jrdVar.d < jrdVar2.d || iB < iB2) {
            return false;
        }
        if (iB > iB2) {
            return true;
        }
        if (!jrdVar.b()) {
            int i2 = jrdVar.e;
            return i2 == -1 || i2 > i;
        }
        int i3 = jrdVar.b;
        int i4 = jrdVar.c;
        if (i3 <= i) {
            return i3 == i && i4 > jrdVar2.c;
        }
        return true;
    }

    public final boolean b(gql gqlVar, gql gqlVar2) {
        jrd jrdVar;
        int i = this.b;
        if (i < gqlVar.o()) {
            ju6 ju6Var = this.g;
            fql fqlVar = ju6Var.a;
            gqlVar.n(i, fqlVar);
            for (int i2 = fqlVar.m; i2 <= fqlVar.n; i2++) {
                int iB = gqlVar2.b(gqlVar.l(i2));
                if (iB != -1) {
                    i = gqlVar2.f(iB, ju6Var.b, false).c;
                    break;
                }
            }
            i = -1;
        } else if (i >= gqlVar2.o()) {
            i = -1;
        }
        this.b = i;
        return i != -1 && ((jrdVar = this.d) == null || gqlVar2.b(jrdVar.a) != -1);
    }
}
