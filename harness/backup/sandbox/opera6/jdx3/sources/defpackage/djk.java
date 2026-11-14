package defpackage;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.c;
import org.jetbrains.annotations.NotNull;

@h2j
/* loaded from: classes.dex */
public final class djk {

    @NotNull
    public static final cjk Companion = new cjk();
    public static final l4c[] e = {z4c.a(f7c.b, new thk((byte) 1)), null, null, null};
    public final Map a;
    public final String b;
    public final c c;
    public final c d;

    public /* synthetic */ djk(int i, Map map, String str, c cVar, c cVar2) {
        if (15 != (i & 15)) {
            x7d.I(i, 15, bjk.a.getDescriptor());
            throw null;
        }
        this.a = map;
        this.b = str;
        this.c = cVar;
        this.d = cVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof djk)) {
            return false;
        }
        djk djkVar = (djk) obj;
        return Intrinsics.a(this.a, djkVar.a) && Intrinsics.a(this.b, djkVar.b) && Intrinsics.a(this.c, djkVar.c) && Intrinsics.a(this.d, djkVar.d);
    }

    public final int hashCode() {
        return this.d.a.hashCode() + z1m.h(this.c.a, z1m.f(this.a.hashCode() * 31, 31, this.b), 31);
    }

    public final String toString() {
        return "Message(types=" + this.a + ", primaryType=" + this.b + ", message=" + this.c + ", domain=" + this.d + ")";
    }
}
