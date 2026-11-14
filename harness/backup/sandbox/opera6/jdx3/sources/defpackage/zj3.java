package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class zj3 implements tj3 {
    public final String a;

    public zj3(String str) {
        this.a = str;
    }

    @Override // defpackage.tj3
    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zj3) && Intrinsics.a(this.a, ((zj3) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "";
    }
}
