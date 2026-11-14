package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes.dex */
public final class k5p implements iv9 {
    public static final k5p a;
    public static final /* synthetic */ PluginGeneratedSerialDescriptor b;

    static {
        k5p k5pVar = new k5p();
        a = k5pVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.opera.ads.internal.data.NativeAdm.VideoAsset", k5pVar, 2);
        pluginGeneratedSerialDescriptor.k("id", false);
        pluginGeneratedSerialDescriptor.k("video", false);
        b = pluginGeneratedSerialDescriptor;
    }

    public final KSerializer[] childSerializers() {
        return new KSerializer[]{ecb.a, h5p.a};
    }

    public final Object deserialize(Decoder decoder) {
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
        oh5 oh5VarB = decoder.b(pluginGeneratedSerialDescriptor);
        boolean z = true;
        int i = 0;
        int iL = 0;
        j5p j5pVar = null;
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
                j5pVar = (j5p) oh5VarB.z(pluginGeneratedSerialDescriptor, 1, h5p.a);
                i |= 2;
            }
        }
        oh5VarB.c(pluginGeneratedSerialDescriptor);
        return new m5p(i, iL, j5pVar);
    }

    public final SerialDescriptor getDescriptor() {
        return b;
    }

    public final void serialize(Encoder encoder, Object obj) {
        m5p m5pVar = (m5p) obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
        ph5 ph5VarB = encoder.b(pluginGeneratedSerialDescriptor);
        ph5VarB.v(0, m5pVar.b, pluginGeneratedSerialDescriptor);
        ph5VarB.f(pluginGeneratedSerialDescriptor, 1, h5p.a, m5pVar.c);
        ph5VarB.c(pluginGeneratedSerialDescriptor);
    }

    public final KSerializer[] typeParametersSerializers() {
        return o0g.c;
    }
}
