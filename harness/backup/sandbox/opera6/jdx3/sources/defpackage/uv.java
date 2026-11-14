package defpackage;

import java.math.BigInteger;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class uv {
    public static wv a(String str) {
        return new wv(new BigInteger(str, 16));
    }

    public static wv b(String str) {
        return new wv(new BigInteger(k1g.N(str), 16));
    }

    @NotNull
    public final KSerializer serializer() {
        return vv.a;
    }
}
