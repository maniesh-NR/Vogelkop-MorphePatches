package ads_mobile_sdk;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class n13 {
    public final f13 a;
    public final j13 b;
    public final boolean c;
    public final fe2 d;

    public /* synthetic */ n13(f13 f13Var, j13 j13Var) {
        this(f13Var, j13Var, false, null);
    }

    public n13(f13 f13Var, j13 j13Var, boolean z, fe2 fe2Var) {
        this.a = f13Var;
        this.b = j13Var;
        this.c = z;
        this.d = fe2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n13)) {
            return false;
        }
        n13 n13Var = (n13) obj;
        return Intrinsics.a(this.a, n13Var.a) && Intrinsics.a(this.b, n13Var.b) && this.c == n13Var.c && Intrinsics.a(this.d, n13Var.d);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.a.hashCode() * 31)) * 31;
        boolean z = this.c;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (iHashCode + i) * 31;
        fe2 fe2Var = this.d;
        return i2 + (fe2Var == null ? 0 : fe2Var.hashCode());
    }

    public final String toString() {
        return "ServerTransaction(serverRequest=" + this.a + ", serverResponse=" + this.b + ", isFromPersistentCache=" + this.c + ", persistentCacheToken=" + this.d + ")";
    }
}
