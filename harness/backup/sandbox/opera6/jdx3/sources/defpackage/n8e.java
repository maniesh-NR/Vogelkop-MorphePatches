package defpackage;

import java.math.BigInteger;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class n8e {
    public static x8e a(BigInteger bigInteger, i46 i46Var) {
        if (i46Var instanceof g46) {
            return new t8e(bigInteger, (g46) i46Var);
        }
        if (i46Var instanceof h46) {
            return new w8e(bigInteger, (h46) i46Var);
        }
        if (i46Var instanceof f46) {
            return new q8e(bigInteger, (f46) i46Var);
        }
        h9o.p();
        return null;
    }

    @NotNull
    public final KSerializer serializer() {
        return (KSerializer) x8e.b.getValue();
    }
}
