package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class moa extends RuntimeException {
    public final int a;
    public final String b;
    public final String c;

    public moa(int i, String str) {
        this.a = i;
        this.b = str;
        this.c = p3p.j(i, "HTTP ", " ", str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof moa)) {
            return false;
        }
        moa moaVar = (moa) obj;
        return this.a == moaVar.a && Intrinsics.a(this.b, moaVar.b);
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.c;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return "";
    }
}
