package defpackage;

import java.math.BigInteger;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* loaded from: classes.dex */
public final class ne3 implements KSerializer {
    public static final ne3 a = new ne3();
    public static final cyg b = xug.a("BigInt", xxg.j);

    public final Object deserialize(Decoder decoder) {
        return new BigInteger(decoder.B(), 16);
    }

    public final SerialDescriptor getDescriptor() {
        return b;
    }

    public final void serialize(Encoder encoder, Object obj) {
        encoder.G(((BigInteger) obj).toString(16));
    }
}
