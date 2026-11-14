package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class gjk implements hjk {
    public final String a;
    public final List b;

    public gjk(String str, List list) {
        this.a = str;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gjk)) {
            return false;
        }
        gjk gjkVar = (gjk) obj;
        return Intrinsics.a(this.a, gjkVar.a) && this.b.equals(gjkVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "UserDefined(name=" + this.a + ", fields=" + this.b + ")";
    }
}
