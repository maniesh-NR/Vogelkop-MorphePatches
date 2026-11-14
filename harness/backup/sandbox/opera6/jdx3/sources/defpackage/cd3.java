package defpackage;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@h2j
/* loaded from: classes.dex */
public final class cd3 {

    @NotNull
    public static final bd3 Companion = new bd3();
    public static final l4c[] c = {null, z4c.a(f7c.b, new vk1((byte) 26))};
    public final String a;
    public final Map b;

    public cd3(int i, String str, Map map) {
        if (1 != (i & 1)) {
            x7d.I(i, 1, ad3.a.getDescriptor());
            throw null;
        }
        this.a = str;
        if ((i & 2) == 0) {
            this.b = n08.a;
        } else {
            this.b = map;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cd3)) {
            return false;
        }
        cd3 cd3Var = (cd3) obj;
        return Intrinsics.a(this.a, cd3Var.a) && Intrinsics.a(this.b, cd3Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "";
    }
}
