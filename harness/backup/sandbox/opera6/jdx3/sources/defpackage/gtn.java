package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class gtn extends jtn {
    public final String a;

    public gtn(String str) {
        bxn bxnVar = bxn.a;
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gtn) || !Intrinsics.a(this.a, ((gtn) obj).a)) {
            return false;
        }
        bxn bxnVar = bxn.a;
        return true;
    }

    public final int hashCode() {
        return bxn.a.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "File(fileName=" + this.a + ", readType=" + bxn.a + ")";
    }
}
