package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes.dex */
public final class xap implements iv9 {
    public static final xap a;
    public static final /* synthetic */ PluginGeneratedSerialDescriptor b;

    static {
        xap xapVar = new xap();
        a = xapVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.opera.ads.internal.analytics.ViewRect", xapVar, 4);
        pluginGeneratedSerialDescriptor.k("l", false);
        pluginGeneratedSerialDescriptor.k("t", false);
        pluginGeneratedSerialDescriptor.k("r", false);
        pluginGeneratedSerialDescriptor.k("b", false);
        b = pluginGeneratedSerialDescriptor;
    }

    public final KSerializer[] childSerializers() {
        ecb ecbVar = ecb.a;
        return new KSerializer[]{ecbVar, ecbVar, ecbVar, ecbVar};
    }

    public final Object deserialize(Decoder decoder) {
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
        oh5 oh5VarB = decoder.b(pluginGeneratedSerialDescriptor);
        boolean z = true;
        int i = 0;
        int iL = 0;
        int iL2 = 0;
        int iL3 = 0;
        int iL4 = 0;
        while (z) {
            int iP = oh5VarB.p(pluginGeneratedSerialDescriptor);
            if (iP == -1) {
                z = false;
            } else if (iP == 0) {
                iL = oh5VarB.l(pluginGeneratedSerialDescriptor, 0);
                i |= 1;
            } else if (iP == 1) {
                iL2 = oh5VarB.l(pluginGeneratedSerialDescriptor, 1);
                i |= 2;
            } else if (iP == 2) {
                iL3 = oh5VarB.l(pluginGeneratedSerialDescriptor, 2);
                i |= 4;
            } else {
                if (iP != 3) {
                    t3p.d(iP);
                    return null;
                }
                iL4 = oh5VarB.l(pluginGeneratedSerialDescriptor, 3);
                i |= 8;
            }
        }
        oh5VarB.c(pluginGeneratedSerialDescriptor);
        return new zap(i, iL, iL2, iL3, iL4);
    }

    public final SerialDescriptor getDescriptor() {
        return b;
    }

    public final void serialize(Encoder encoder, Object obj) {
        zap zapVar = (zap) obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
        ph5 ph5VarB = encoder.b(pluginGeneratedSerialDescriptor);
        ph5VarB.v(0, zapVar.a, pluginGeneratedSerialDescriptor);
        ph5VarB.v(1, zapVar.b, pluginGeneratedSerialDescriptor);
        ph5VarB.v(2, zapVar.c, pluginGeneratedSerialDescriptor);
        ph5VarB.v(3, zapVar.d, pluginGeneratedSerialDescriptor);
        ph5VarB.c(pluginGeneratedSerialDescriptor);
    }

    public final KSerializer[] typeParametersSerializers() {
        return o0g.c;
    }
}
