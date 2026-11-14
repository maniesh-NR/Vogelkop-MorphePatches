package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@h2j
/* loaded from: classes.dex */
public final class j3f {

    @NotNull
    public static final i3f Companion = new i3f();
    public static final l4c[] b = {z4c.a(f7c.b, new vme(12))};
    public final List a;

    public /* synthetic */ j3f(int i, List list) {
        if (1 == (i & 1)) {
            this.a = list;
        } else {
            x7d.I(i, 1, h3f.a.getDescriptor());
            throw null;
        }
    }

    public j3f(l08 l08Var) {
        this.a = l08Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j3f) && Intrinsics.a(this.a, ((j3f) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "";
    }
}
