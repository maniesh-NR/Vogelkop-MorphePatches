package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes.dex */
public final class jwo implements iv9 {
    public static final jwo a;
    public static final /* synthetic */ PluginGeneratedSerialDescriptor b;

    static {
        jwo jwoVar = new jwo();
        a = jwoVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.opera.ads.internal.data.BidRequestObject.Source", jwoVar, 1);
        pluginGeneratedSerialDescriptor.k("ext", false);
        b = pluginGeneratedSerialDescriptor;
    }

    public final KSerializer[] childSerializers() {
        return new KSerializer[]{owo.a};
    }

    public final Object deserialize(Decoder decoder) {
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
        oh5 oh5VarB = decoder.b(pluginGeneratedSerialDescriptor);
        boolean z = true;
        int i = 0;
        qwo qwoVar = null;
        while (z) {
            int iP = oh5VarB.p(pluginGeneratedSerialDescriptor);
            if (iP == -1) {
                z = false;
            } else {
                if (iP != 0) {
                    t3p.d(iP);
                    return null;
                }
                qwoVar = (qwo) oh5VarB.z(pluginGeneratedSerialDescriptor, 0, owo.a);
                i = 1;
            }
        }
        oh5VarB.c(pluginGeneratedSerialDescriptor);
        return new mwo(i, qwoVar);
    }

    public final SerialDescriptor getDescriptor() {
        return b;
    }

    public final void serialize(Encoder encoder, Object obj) {
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
        ph5 ph5VarB = encoder.b(pluginGeneratedSerialDescriptor);
        ph5VarB.f(pluginGeneratedSerialDescriptor, 0, owo.a, ((mwo) obj).a);
        ph5VarB.c(pluginGeneratedSerialDescriptor);
    }

    public final KSerializer[] typeParametersSerializers() {
        return o0g.c;
    }
}
