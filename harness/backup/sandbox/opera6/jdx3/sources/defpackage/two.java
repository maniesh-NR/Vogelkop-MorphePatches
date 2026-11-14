package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes.dex */
public final class two implements iv9 {
    public static final two a;
    public static final /* synthetic */ PluginGeneratedSerialDescriptor b;

    static {
        two twoVar = new two();
        a = twoVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.opera.ads.internal.data.BidRequestObject.User", twoVar, 3);
        pluginGeneratedSerialDescriptor.k("id", false);
        pluginGeneratedSerialDescriptor.k("consent", false);
        pluginGeneratedSerialDescriptor.k("ext", true);
        b = pluginGeneratedSerialDescriptor;
    }

    public final KSerializer[] childSerializers() {
        KSerializer kSerializer = xhk.a;
        return new KSerializer[]{kSerializer, f03.B(kSerializer), f03.B(xwo.a)};
    }

    public final Object deserialize(Decoder decoder) {
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
        oh5 oh5VarB = decoder.b(pluginGeneratedSerialDescriptor);
        boolean z = true;
        int i = 0;
        String strO = null;
        String str = null;
        zwo zwoVar = null;
        while (z) {
            int iP = oh5VarB.p(pluginGeneratedSerialDescriptor);
            if (iP == -1) {
                z = false;
            } else if (iP == 0) {
                strO = oh5VarB.o(pluginGeneratedSerialDescriptor, 0);
                i |= 1;
            } else if (iP == 1) {
                str = (String) oh5VarB.m(pluginGeneratedSerialDescriptor, 1, xhk.a);
                i |= 2;
            } else {
                if (iP != 2) {
                    t3p.d(iP);
                    return null;
                }
                zwoVar = (zwo) oh5VarB.m(pluginGeneratedSerialDescriptor, 2, xwo.a);
                i |= 4;
            }
        }
        oh5VarB.c(pluginGeneratedSerialDescriptor);
        return new wwo(i, strO, str, zwoVar);
    }

    public final SerialDescriptor getDescriptor() {
        return b;
    }

    public final void serialize(Encoder encoder, Object obj) {
        wwo wwoVar = (wwo) obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
        ph5 ph5VarB = encoder.b(pluginGeneratedSerialDescriptor);
        String str = wwoVar.a;
        zwo zwoVar = wwoVar.c;
        ph5VarB.z(pluginGeneratedSerialDescriptor, 0, str);
        ph5VarB.j(pluginGeneratedSerialDescriptor, 1, xhk.a, wwoVar.b);
        if (ph5VarB.E() || zwoVar != null) {
            ph5VarB.j(pluginGeneratedSerialDescriptor, 2, xwo.a, zwoVar);
        }
        ph5VarB.c(pluginGeneratedSerialDescriptor);
    }

    public final KSerializer[] typeParametersSerializers() {
        return o0g.c;
    }
}
