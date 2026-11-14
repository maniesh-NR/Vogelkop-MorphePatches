package defpackage;

import java.math.BigInteger;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* loaded from: classes.dex */
public final class p7a implements KSerializer {
    public static final p7a a = new p7a();
    public static final cyg b = xug.a("Hash", xxg.j);

    public final Object deserialize(Decoder decoder) {
        o7a o7aVar = r7a.Companion;
        String strB = decoder.B();
        o7aVar.getClass();
        return new r7a(new BigInteger(k1g.N(strB), 16));
    }

    public final SerialDescriptor getDescriptor() {
        return b;
    }

    public final void serialize(Encoder encoder, Object obj) {
        encoder.G(((r7a) obj).a());
    }
}
