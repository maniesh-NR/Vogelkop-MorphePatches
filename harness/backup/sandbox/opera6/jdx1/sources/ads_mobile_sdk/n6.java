package ads_mobile_sdk;

/* loaded from: classes.dex */
public final class n6 {
    public final z92 a;
    public final z92 b;
    public final boolean c;
    public final t00 d;
    public final z31 e;

    public n6(t00 t00Var, z31 z31Var, z92 z92Var, z92 z92Var2, boolean z) {
        this.d = t00Var;
        this.e = z31Var;
        this.a = z92Var;
        if (z92Var2 == null) {
            this.b = z92.d;
        } else {
            this.b = z92Var2;
        }
        this.c = z;
    }

    public static n6 a(t00 t00Var, z31 z31Var, z92 z92Var, z92 z92Var2, boolean z) {
        if (t00Var == null) {
            qp2.o("CreativeType is null");
            return null;
        }
        if (z31Var == null) {
            qp2.o("ImpressionType is null");
            return null;
        }
        if (z92Var == null) {
            qp2.o("Impression owner is null");
            return null;
        }
        if (z92Var == z92.d) {
            qp2.o("Impression owner is none");
            return null;
        }
        t00 t00Var2 = t00.b;
        z92 z92Var3 = z92.b;
        if (t00Var == t00Var2 && z92Var == z92Var3) {
            qp2.o("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
            return null;
        }
        if (z31Var != z31.b || z92Var != z92Var3) {
            return new n6(t00Var, z31Var, z92Var, z92Var2, z);
        }
        qp2.o("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
        return null;
    }
}
