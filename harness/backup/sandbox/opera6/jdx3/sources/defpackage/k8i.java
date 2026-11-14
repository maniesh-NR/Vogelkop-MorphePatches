package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class k8i {
    public final int a;
    public final String b;

    public k8i(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k8i)) {
            return false;
        }
        k8i k8iVar = (k8i) obj;
        return this.a == k8iVar.a && Intrinsics.a(this.b, k8iVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "";
    }
}
