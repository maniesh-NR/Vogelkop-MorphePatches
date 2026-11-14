package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes.dex */
public final class ewo implements iv9 {
    public static final ewo a;
    public static final /* synthetic */ PluginGeneratedSerialDescriptor b;

    static {
        ewo ewoVar = new ewo();
        a = ewoVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.opera.ads.internal.data.BidRequestObject.Regs", ewoVar, 3);
        pluginGeneratedSerialDescriptor.k("coppa", false);
        pluginGeneratedSerialDescriptor.k("gdpr", false);
        pluginGeneratedSerialDescriptor.k("us_privacy", false);
        b = pluginGeneratedSerialDescriptor;
    }

    public final KSerializer[] childSerializers() {
        ecb ecbVar = ecb.a;
        return new KSerializer[]{f03.B(ecbVar), f03.B(ecbVar), f03.B(xhk.a)};
    }

    public final Object deserialize(Decoder decoder) {
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
        oh5 oh5VarB = decoder.b(pluginGeneratedSerialDescriptor);
        boolean z = true;
        int i = 0;
        Integer num = null;
        Integer num2 = null;
        String str = null;
        while (z) {
            int iP = oh5VarB.p(pluginGeneratedSerialDescriptor);
            if (iP == -1) {
                z = false;
            } else if (iP == 0) {
                num = (Integer) oh5VarB.m(pluginGeneratedSerialDescriptor, 0, ecb.a);
                i |= 1;
            } else if (iP == 1) {
                num2 = (Integer) oh5VarB.m(pluginGeneratedSerialDescriptor, 1, ecb.a);
                i |= 2;
            } else {
                if (iP != 2) {
                    t3p.d(iP);
                    return null;
                }
                str = (String) oh5VarB.m(pluginGeneratedSerialDescriptor, 2, xhk.a);
                i |= 4;
            }
        }
        oh5VarB.c(pluginGeneratedSerialDescriptor);
        return new hwo(i, num, num2, str);
    }

    public final SerialDescriptor getDescriptor() {
        return b;
    }

    public final void serialize(Encoder encoder, Object obj) {
        hwo hwoVar = (hwo) obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
        ph5 ph5VarB = encoder.b(pluginGeneratedSerialDescriptor);
        ecb ecbVar = ecb.a;
        ph5VarB.j(pluginGeneratedSerialDescriptor, 0, ecbVar, hwoVar.a);
        ph5VarB.j(pluginGeneratedSerialDescriptor, 1, ecbVar, hwoVar.b);
        ph5VarB.j(pluginGeneratedSerialDescriptor, 2, xhk.a, hwoVar.c);
        ph5VarB.c(pluginGeneratedSerialDescriptor);
    }

    public final KSerializer[] typeParametersSerializers() {
        return o0g.c;
    }
}
