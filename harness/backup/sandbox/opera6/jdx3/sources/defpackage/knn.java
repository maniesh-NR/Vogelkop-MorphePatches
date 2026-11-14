package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class knn {
    public final List a;
    public final String b;

    public knn(List list, String str) {
        this.a = list;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof knn)) {
            return false;
        }
        knn knnVar = (knn) obj;
        return Intrinsics.a(this.a, knnVar.a) && Intrinsics.a(this.b, knnVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "";
    }
}
