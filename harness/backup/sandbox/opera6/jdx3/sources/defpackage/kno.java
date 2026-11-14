package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.c;

/* loaded from: classes.dex */
public final class kno implements KSerializer {
    public static final kno a = new kno();
    public static final cyg b = xug.a("com.opera.ads.internal.util.JsonObjectAsString", xxg.j);

    public final Object deserialize(Decoder decoder) {
        rpb rpbVarD;
        mng mngVar = decoder instanceof mng ? (mng) decoder : null;
        if (mngVar == null || (rpbVarD = mngVar.d()) == null) {
            rpbVarD = rpb.d;
        }
        return (c) rpbVarD.a(decoder.B(), c.Companion.serializer());
    }

    public final SerialDescriptor getDescriptor() {
        return b;
    }

    public final void serialize(Encoder encoder, Object obj) {
        rpb rpbVarD;
        c cVar = (c) obj;
        wqb wqbVar = encoder instanceof wqb ? (wqb) encoder : null;
        if (wqbVar == null || (rpbVarD = wqbVar.d()) == null) {
            rpbVarD = rpb.d;
        }
        encoder.G(rpbVarD.b(cVar, c.Companion.serializer()));
    }
}
