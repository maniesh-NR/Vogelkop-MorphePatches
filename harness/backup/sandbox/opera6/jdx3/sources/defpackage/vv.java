package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* loaded from: classes.dex */
public final class vv implements KSerializer {
    public static final vv a = new vv();
    public static final cyg b = xug.a("Address", xxg.j);

    public final Object deserialize(Decoder decoder) {
        uv uvVar = wv.Companion;
        String strB = decoder.B();
        uvVar.getClass();
        return uv.b(strB);
    }

    public final SerialDescriptor getDescriptor() {
        return b;
    }

    public final void serialize(Encoder encoder, Object obj) {
        encoder.G(((wv) obj).a());
    }
}
