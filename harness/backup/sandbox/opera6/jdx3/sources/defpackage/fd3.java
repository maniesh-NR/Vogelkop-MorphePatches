package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@h2j
/* loaded from: classes.dex */
public final class fd3 {

    @NotNull
    public static final ed3 Companion = new ed3();
    public static final l4c[] d = {null, null, z4c.a(f7c.b, new vk1((byte) 27))};
    public final String a;
    public final String b;
    public final List c;

    public /* synthetic */ fd3(int i, String str, String str2, List list) {
        if (7 != (i & 7)) {
            x7d.I(i, 7, dd3.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fd3)) {
            return false;
        }
        fd3 fd3Var = (fd3) obj;
        return Intrinsics.a(this.a, fd3Var.a) && Intrinsics.a(this.b, fd3Var.b) && Intrinsics.a(this.c, fd3Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + z1m.f(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "";
    }
}
