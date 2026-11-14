package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@h2j
/* loaded from: classes.dex */
public final class p3f {

    @NotNull
    public static final o3f Companion = new o3f();
    public static final l4c[] g = {null, null, null, null, null, z4c.a(f7c.b, new vme(13))};
    public final int a;
    public final Integer b;
    public final String c;
    public final String d;
    public final String e;
    public final List f;

    public p3f(int i, int i2, Integer num, String str, String str2, String str3, List list) {
        if (29 != (i & 29)) {
            x7d.I(i, 29, n3f.a.getDescriptor());
            throw null;
        }
        this.a = i2;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = num;
        }
        this.c = str;
        this.d = str2;
        this.e = str3;
        if ((i & 32) == 0) {
            this.f = l08.a;
        } else {
            this.f = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p3f)) {
            return false;
        }
        p3f p3fVar = (p3f) obj;
        return this.a == p3fVar.a && Intrinsics.a(this.b, p3fVar.b) && Intrinsics.a(this.c, p3fVar.c) && Intrinsics.a(this.d, p3fVar.d) && Intrinsics.a(this.e, p3fVar.e) && Intrinsics.a(this.f, p3fVar.f);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.a) * 31;
        Integer num = this.b;
        return this.f.hashCode() + z1m.f(z1m.f(z1m.f((iHashCode + (num == null ? 0 : num.hashCode())) * 31, 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        return "";
    }
}
