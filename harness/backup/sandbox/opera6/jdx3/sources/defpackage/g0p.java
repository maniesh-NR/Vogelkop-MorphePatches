package defpackage;

import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes.dex */
public final class g0p implements iv9 {
    public static final g0p a;
    public static final /* synthetic */ PluginGeneratedSerialDescriptor b;

    static {
        g0p g0pVar = new g0p();
        a = g0pVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.opera.ads.internal.data.ImpObject.Banner", g0pVar, 3);
        pluginGeneratedSerialDescriptor.k("format", false);
        pluginGeneratedSerialDescriptor.k("mimes", false);
        pluginGeneratedSerialDescriptor.k("api", false);
        b = pluginGeneratedSerialDescriptor;
    }

    public final KSerializer[] childSerializers() {
        KSerializer[] kSerializerArr = k0p.d;
        return new KSerializer[]{kSerializerArr[0], kSerializerArr[1], kSerializerArr[2]};
    }

    public final Object deserialize(Decoder decoder) {
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
        oh5 oh5VarB = decoder.b(pluginGeneratedSerialDescriptor);
        KSerializer[] kSerializerArr = k0p.d;
        boolean z = true;
        int i = 0;
        List list = null;
        List list2 = null;
        List list3 = null;
        while (z) {
            int iP = oh5VarB.p(pluginGeneratedSerialDescriptor);
            if (iP == -1) {
                z = false;
            } else if (iP == 0) {
                list = (List) oh5VarB.z(pluginGeneratedSerialDescriptor, 0, kSerializerArr[0]);
                i |= 1;
            } else if (iP == 1) {
                list2 = (List) oh5VarB.z(pluginGeneratedSerialDescriptor, 1, kSerializerArr[1]);
                i |= 2;
            } else {
                if (iP != 2) {
                    t3p.d(iP);
                    return null;
                }
                list3 = (List) oh5VarB.z(pluginGeneratedSerialDescriptor, 2, kSerializerArr[2]);
                i |= 4;
            }
        }
        oh5VarB.c(pluginGeneratedSerialDescriptor);
        return new k0p(i, list, list2, list3);
    }

    public final SerialDescriptor getDescriptor() {
        return b;
    }

    public final void serialize(Encoder encoder, Object obj) {
        k0p k0pVar = (k0p) obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
        ph5 ph5VarB = encoder.b(pluginGeneratedSerialDescriptor);
        KSerializer[] kSerializerArr = k0p.d;
        ph5VarB.f(pluginGeneratedSerialDescriptor, 0, kSerializerArr[0], k0pVar.a);
        ph5VarB.f(pluginGeneratedSerialDescriptor, 1, kSerializerArr[1], k0pVar.b);
        ph5VarB.f(pluginGeneratedSerialDescriptor, 2, kSerializerArr[2], k0pVar.c);
        ph5VarB.c(pluginGeneratedSerialDescriptor);
    }

    public final KSerializer[] typeParametersSerializers() {
        return o0g.c;
    }
}
