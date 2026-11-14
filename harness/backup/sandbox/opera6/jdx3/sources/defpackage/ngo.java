package defpackage;

import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes.dex */
public final class ngo implements iv9 {
    public static final ngo a;
    public static final /* synthetic */ PluginGeneratedSerialDescriptor b;

    static {
        ngo ngoVar = new ngo();
        a = ngoVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.opera.ads.internal.data.AdData", ngoVar, 5);
        pluginGeneratedSerialDescriptor.k("id", false);
        pluginGeneratedSerialDescriptor.k("bidid", false);
        pluginGeneratedSerialDescriptor.k("seatbid", false);
        pluginGeneratedSerialDescriptor.k("cur", true);
        pluginGeneratedSerialDescriptor.k("nbr", true);
        b = pluginGeneratedSerialDescriptor;
    }

    public final KSerializer[] childSerializers() {
        KSerializer[] kSerializerArr = zjo.f;
        KSerializer kSerializer = xhk.a;
        return new KSerializer[]{kSerializer, kSerializer, kSerializerArr[2], f03.B(kSerializer), f03.B(ecb.a)};
    }

    public final Object deserialize(Decoder decoder) {
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
        oh5 oh5VarB = decoder.b(pluginGeneratedSerialDescriptor);
        KSerializer[] kSerializerArr = zjo.f;
        boolean z = true;
        int i = 0;
        String strO = null;
        String strO2 = null;
        List list = null;
        String str = null;
        Integer num = null;
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
            } else if (iP == 2) {
                list = (List) oh5VarB.z(pluginGeneratedSerialDescriptor, 2, kSerializerArr[2]);
                i |= 4;
            } else if (iP == 3) {
                str = (String) oh5VarB.m(pluginGeneratedSerialDescriptor, 3, xhk.a);
                i |= 8;
            } else {
                if (iP != 4) {
                    t3p.d(iP);
                    return null;
                }
                num = (Integer) oh5VarB.m(pluginGeneratedSerialDescriptor, 4, ecb.a);
                i |= 16;
            }
        }
        oh5VarB.c(pluginGeneratedSerialDescriptor);
        return new zjo(i, strO, strO2, list, str, num);
    }

    public final SerialDescriptor getDescriptor() {
        return b;
    }

    public final void serialize(Encoder encoder, Object obj) {
        zjo zjoVar = (zjo) obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
        ph5 ph5VarB = encoder.b(pluginGeneratedSerialDescriptor);
        KSerializer[] kSerializerArr = zjo.f;
        String str = zjoVar.a;
        Integer num = zjoVar.e;
        String str2 = zjoVar.d;
        ph5VarB.z(pluginGeneratedSerialDescriptor, 0, str);
        ph5VarB.z(pluginGeneratedSerialDescriptor, 1, zjoVar.b);
        ph5VarB.f(pluginGeneratedSerialDescriptor, 2, kSerializerArr[2], zjoVar.c);
        if (ph5VarB.E() || str2 != null) {
            ph5VarB.j(pluginGeneratedSerialDescriptor, 3, xhk.a, str2);
        }
        if (ph5VarB.E() || num != null) {
            ph5VarB.j(pluginGeneratedSerialDescriptor, 4, ecb.a, num);
        }
        ph5VarB.c(pluginGeneratedSerialDescriptor);
    }

    public final KSerializer[] typeParametersSerializers() {
        return o0g.c;
    }
}
