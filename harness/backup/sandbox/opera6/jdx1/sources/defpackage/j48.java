package defpackage;

import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class j48 extends ozb implements Function1 {
    public final /* synthetic */ byte i;
    public final /* synthetic */ x48 j;
    public final /* synthetic */ vh8 k;
    public final /* synthetic */ ndj l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j48(x48 x48Var, vh8 vh8Var, ndj ndjVar, byte b) {
        super(1);
        this.i = b;
        this.j = x48Var;
        this.k = vh8Var;
        this.l = ndjVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.i;
        x48 x48Var = this.j;
        ndj ndjVar = this.l;
        vh8 vh8Var = this.k;
        float f = 1.0f;
        switch (b) {
            case 0:
                int iOrdinal = ((e48) obj).ordinal();
                if (iOrdinal == 0) {
                    co8 co8Var = x48Var.a.a;
                    if (co8Var != null) {
                        f = co8Var.a;
                    }
                } else if (iOrdinal != 1) {
                    if (iOrdinal != 2) {
                        h9o.p();
                        return null;
                    }
                    co8 co8Var2 = vh8Var.a.a;
                    f = co8Var2 != null ? co8Var2.a : ndjVar.f;
                }
                return Float.valueOf(f);
            default:
                int iOrdinal2 = ((e48) obj).ordinal();
                if (iOrdinal2 == 0) {
                    mli mliVar = x48Var.a.d;
                    if (mliVar != null) {
                        f = mliVar.a;
                    }
                } else if (iOrdinal2 != 1) {
                    if (iOrdinal2 != 2) {
                        h9o.p();
                        return null;
                    }
                    mli mliVar2 = vh8Var.a.d;
                    f = mliVar2 != null ? mliVar2.a : ndjVar.g;
                }
                return Float.valueOf(f);
        }
    }
}
