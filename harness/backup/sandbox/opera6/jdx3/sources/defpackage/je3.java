package defpackage;

import java.math.BigInteger;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* loaded from: classes.dex */
public final class je3 implements KSerializer {
    public static final je3 a = new je3();
    public static final cyg b = xug.a("BigInt", xxg.j);

    public final Object deserialize(Decoder decoder) {
        ie3 ie3Var = ke3.Companion;
        String strB = decoder.B();
        ie3Var.getClass();
        return new ke3(0, new BigInteger(k1g.N(strB), 16));
    }

    public final SerialDescriptor getDescriptor() {
        return b;
    }

    public final void serialize(Encoder encoder, Object obj) {
        encoder.G(((ke3) obj).a());
    }
}
