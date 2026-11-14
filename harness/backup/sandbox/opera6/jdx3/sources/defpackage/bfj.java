package defpackage;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@h2j
/* loaded from: classes.dex */
public final class bfj {

    @NotNull
    public static final afj Companion = new afj();
    public static final l4c[] d = {null, null, z4c.a(f7c.b, new gzh(23))};
    public final String a;
    public final String b;
    public final Map c;

    public /* synthetic */ bfj(Map map, int i, String str, String str2) {
        if (7 != (i & 7)) {
            x7d.I(i, 7, zej.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bfj)) {
            return false;
        }
        bfj bfjVar = (bfj) obj;
        return Intrinsics.a(this.a, bfjVar.a) && Intrinsics.a(this.b, bfjVar.b) && Intrinsics.a(this.c, bfjVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + z1m.f(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "";
    }
}
