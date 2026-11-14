package defpackage;

import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

@h2j
/* loaded from: classes.dex */
public final class d7i extends i7i {

    @NotNull
    public static final d7i INSTANCE = new d7i();
    public static final /* synthetic */ l4c b = z4c.a(f7c.b, new gzh((byte) 10));

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof d7i);
    }

    public final int hashCode() {
        return -1626809602;
    }

    @NotNull
    public final KSerializer serializer() {
        return (KSerializer) b.getValue();
    }

    public final String toString() {
        return "Rewards";
    }
}
