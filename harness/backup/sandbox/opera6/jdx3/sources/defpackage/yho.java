package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes.dex */
public final class yho implements iv9 {
    public static final yho a;
    public static final /* synthetic */ PluginGeneratedSerialDescriptor b;

    static {
        yho yhoVar = new yho();
        a = yhoVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.opera.ads.internal.data.AdData.Omid", yhoVar, 3);
        pluginGeneratedSerialDescriptor.k("vendorkey", false);
        pluginGeneratedSerialDescriptor.k("verifyparams", false);
        pluginGeneratedSerialDescriptor.k("verifyurl", false);
        b = pluginGeneratedSerialDescriptor;
    }

    public final KSerializer[] childSerializers() {
        xhk xhkVar = xhk.a;
        return new KSerializer[]{xhkVar, xhkVar, xhkVar};
    }

    public final Object deserialize(Decoder decoder) {
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
        oh5 oh5VarB = decoder.b(pluginGeneratedSerialDescriptor);
        boolean z = true;
        int i = 0;
        String strO = null;
        String strO2 = null;
        String strO3 = null;
        while (z) {
            int iP = oh5VarB.p(pluginGeneratedSerialDescriptor);
            if (iP == -1) {
                z = false;
            } else if (iP == 0) {
                strO = oh5VarB.o(pluginGeneratedSerialDescriptor, 0);
                i |= 1;
            } else if (iP == 1) {
                strO2 = oh5VarB.o(pluginGeneratedSerialDescriptor, 1);
                i |= 2;
            } else {
                if (iP != 2) {
                    t3p.d(iP);
                    return null;
                }
                strO3 = oh5VarB.o(pluginGeneratedSerialDescriptor, 2);
                i |= 4;
            }
        }
        oh5VarB.c(pluginGeneratedSerialDescriptor);
        return new aio(i, strO, strO2, strO3);
    }

    public final SerialDescriptor getDescriptor() {
        return b;
    }

    public final void serialize(Encoder encoder, Object obj) {
        aio aioVar = (aio) obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
        ph5 ph5VarB = encoder.b(pluginGeneratedSerialDescriptor);
        ph5VarB.z(pluginGeneratedSerialDescriptor, 0, aioVar.a);
        ph5VarB.z(pluginGeneratedSerialDescriptor, 1, aioVar.b);
        ph5VarB.z(pluginGeneratedSerialDescriptor, 2, aioVar.c);
        ph5VarB.c(pluginGeneratedSerialDescriptor);
    }

    public final KSerializer[] typeParametersSerializers() {
        return o0g.c;
    }
}
