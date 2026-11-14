package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes.dex */
public final class m0p implements iv9 {
    public static final m0p a;
    public static final /* synthetic */ PluginGeneratedSerialDescriptor b;

    static {
        m0p m0pVar = new m0p();
        a = m0pVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.opera.ads.internal.data.ImpObject.BannerFormat", m0pVar, 2);
        pluginGeneratedSerialDescriptor.k("w", false);
        pluginGeneratedSerialDescriptor.k("h", false);
        b = pluginGeneratedSerialDescriptor;
    }

    public final KSerializer[] childSerializers() {
        ecb ecbVar = ecb.a;
        return new KSerializer[]{ecbVar, ecbVar};
    }

    public final Object deserialize(Decoder decoder) {
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
        oh5 oh5VarB = decoder.b(pluginGeneratedSerialDescriptor);
        boolean z = true;
        int i = 0;
        int iL = 0;
        int iL2 = 0;
        while (z) {
            int iP = oh5VarB.p(pluginGeneratedSerialDescriptor);
            if (iP == -1) {
                z = false;
            } else if (iP == 0) {
                iL = oh5VarB.l(pluginGeneratedSerialDescriptor, 0);
                i |= 1;
            } else {
                if (iP != 1) {
                    t3p.d(iP);
                    return null;
                }
                iL2 = oh5VarB.l(pluginGeneratedSerialDescriptor, 1);
                i |= 2;
            }
        }
        oh5VarB.c(pluginGeneratedSerialDescriptor);
        return new o0p(i, iL, iL2);
    }

    public final SerialDescriptor getDescriptor() {
        return b;
    }

    public final void serialize(Encoder encoder, Object obj) {
        o0p o0pVar = (o0p) obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
        ph5 ph5VarB = encoder.b(pluginGeneratedSerialDescriptor);
        ph5VarB.v(0, o0pVar.a, pluginGeneratedSerialDescriptor);
        ph5VarB.v(1, o0pVar.b, pluginGeneratedSerialDescriptor);
        ph5VarB.c(pluginGeneratedSerialDescriptor);
    }

    public final KSerializer[] typeParametersSerializers() {
        return o0g.c;
    }
}
