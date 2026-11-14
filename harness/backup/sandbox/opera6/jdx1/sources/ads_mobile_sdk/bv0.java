package ads_mobile_sdk;

import defpackage.z1m;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class bv0 extends av0 {
    public final Throwable c;
    public final ae1 d;
    public final String e;

    public bv0(Throwable th, ae1 ae1Var, String str) {
        super(ae1Var);
        this.c = th;
        this.d = ae1Var;
        this.e = str;
    }

    public /* synthetic */ bv0(Throwable th, ae1 ae1Var, String str, int i) {
        this(th, (i & 2) != 0 ? ae1.a : ae1Var, (i & 4) != 0 ? null : str);
    }

    @Override // ads_mobile_sdk.av0
    public final ae1 a() {
        return this.d;
    }

    @Override // ads_mobile_sdk.av0
    public final Throwable b() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bv0)) {
            return false;
        }
        bv0 bv0Var = (bv0) obj;
        return Intrinsics.a(this.c, bv0Var.c) && this.d == bv0Var.d && Intrinsics.a(this.e, bv0Var.e);
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + (this.c.hashCode() * 31)) * 31;
        String str = this.e;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ExceptionError(exception=");
        sb.append(this.c);
        sb.append(", internalErrorCode=");
        sb.append(this.d);
        sb.append(", message=");
        return z1m.l(sb, this.e, ")");
    }
}
