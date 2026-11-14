package defpackage;

import com.leanplum.internal.Constants;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes.dex */
public final class d0p implements iv9 {
    public static final d0p a;
    public static final /* synthetic */ PluginGeneratedSerialDescriptor b;

    static {
        d0p d0pVar = new d0p();
        a = d0pVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.opera.ads.internal.analytics.AdClickEvent", d0pVar, 7);
        pluginGeneratedSerialDescriptor.k(Constants.Params.REQUEST_ID, false);
        pluginGeneratedSerialDescriptor.k("placementId", false);
        pluginGeneratedSerialDescriptor.k("crId", false);
        pluginGeneratedSerialDescriptor.k("adType", false);
        pluginGeneratedSerialDescriptor.k("clickHandler", false);
        pluginGeneratedSerialDescriptor.k("destinationUrl", false);
        pluginGeneratedSerialDescriptor.k("element", true);
        b = pluginGeneratedSerialDescriptor;
    }

    public final KSerializer[] childSerializers() {
        KSerializer[] kSerializerArr = i1p.n;
        KSerializer kSerializer = xhk.a;
        return new KSerializer[]{kSerializer, kSerializer, kSerializer, kSerializerArr[3], kSerializer, kSerializer, f03.B(kSerializer)};
    }

    public final Object deserialize(Decoder decoder) {
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
        oh5 oh5VarB = decoder.b(pluginGeneratedSerialDescriptor);
        KSerializer[] kSerializerArr = i1p.n;
        boolean z = true;
        int i = 0;
        String strO = null;
        String strO2 = null;
        String strO3 = null;
        fuo fuoVar = null;
        String strO4 = null;
        String strO5 = null;
        String str = null;
        while (z) {
            int iP = oh5VarB.p(pluginGeneratedSerialDescriptor);
            switch (iP) {
                case -1:
                    z = false;
                    break;
                case 0:
                    strO = oh5VarB.o(pluginGeneratedSerialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    strO2 = oh5VarB.o(pluginGeneratedSerialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    strO3 = oh5VarB.o(pluginGeneratedSerialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    fuoVar = (fuo) oh5VarB.z(pluginGeneratedSerialDescriptor, 3, kSerializerArr[3]);
                    i |= 8;
                    break;
                case 4:
                    strO4 = oh5VarB.o(pluginGeneratedSerialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    strO5 = oh5VarB.o(pluginGeneratedSerialDescriptor, 5);
                    i |= 32;
                    break;
                case 6:
                    str = (String) oh5VarB.m(pluginGeneratedSerialDescriptor, 6, xhk.a);
                    i |= 64;
                    break;
                default:
                    t3p.d(iP);
                    return null;
            }
        }
        oh5VarB.c(pluginGeneratedSerialDescriptor);
        return new i1p(i, strO, strO2, strO3, fuoVar, strO4, strO5, str);
    }

    public final SerialDescriptor getDescriptor() {
        return b;
    }

    public final void serialize(Encoder encoder, Object obj) {
        i1p i1pVar = (i1p) obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
        ph5 ph5VarB = encoder.b(pluginGeneratedSerialDescriptor);
        KSerializer[] kSerializerArr = i1p.n;
        String str = i1pVar.g;
        String str2 = i1pVar.m;
        ph5VarB.z(pluginGeneratedSerialDescriptor, 0, str);
        ph5VarB.z(pluginGeneratedSerialDescriptor, 1, i1pVar.h);
        ph5VarB.z(pluginGeneratedSerialDescriptor, 2, i1pVar.i);
        ph5VarB.f(pluginGeneratedSerialDescriptor, 3, kSerializerArr[3], i1pVar.j);
        ph5VarB.z(pluginGeneratedSerialDescriptor, 4, i1pVar.k);
        ph5VarB.z(pluginGeneratedSerialDescriptor, 5, i1pVar.l);
        if (ph5VarB.E() || str2 != null) {
            ph5VarB.j(pluginGeneratedSerialDescriptor, 6, xhk.a, str2);
        }
        ph5VarB.c(pluginGeneratedSerialDescriptor);
    }

    public final KSerializer[] typeParametersSerializers() {
        return o0g.c;
    }
}
