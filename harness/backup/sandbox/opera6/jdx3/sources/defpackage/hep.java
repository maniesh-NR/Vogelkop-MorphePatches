package defpackage;

import com.leanplum.internal.Constants;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes.dex */
public final class hep implements iv9 {
    public static final hep a;
    public static final /* synthetic */ PluginGeneratedSerialDescriptor b;

    static {
        hep hepVar = new hep();
        a = hepVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.opera.ads.internal.analytics.AdViewableEvent", hepVar, 5);
        pluginGeneratedSerialDescriptor.k(Constants.Params.REQUEST_ID, false);
        pluginGeneratedSerialDescriptor.k("placementId", false);
        pluginGeneratedSerialDescriptor.k("crId", false);
        pluginGeneratedSerialDescriptor.k("adType", false);
        pluginGeneratedSerialDescriptor.k("ecpm", true);
        b = pluginGeneratedSerialDescriptor;
    }

    public final KSerializer[] childSerializers() {
        KSerializer kSerializer = tep.l[3];
        KSerializer kSerializerB = f03.B(oe7.a);
        xhk xhkVar = xhk.a;
        return new KSerializer[]{xhkVar, xhkVar, xhkVar, kSerializer, kSerializerB};
    }

    public final Object deserialize(Decoder decoder) {
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
        oh5 oh5VarB = decoder.b(pluginGeneratedSerialDescriptor);
        KSerializer[] kSerializerArr = tep.l;
        boolean z = true;
        int i = 0;
        fuo fuoVar = null;
        Double d = null;
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
            } else if (iP == 2) {
                strO3 = oh5VarB.o(pluginGeneratedSerialDescriptor, 2);
                i |= 4;
            } else if (iP == 3) {
                fuoVar = (fuo) oh5VarB.z(pluginGeneratedSerialDescriptor, 3, kSerializerArr[3]);
                i |= 8;
            } else {
                if (iP != 4) {
                    t3p.d(iP);
                    return null;
                }
                d = (Double) oh5VarB.m(pluginGeneratedSerialDescriptor, 4, oe7.a);
                i |= 16;
            }
        }
        oh5VarB.c(pluginGeneratedSerialDescriptor);
        return new tep(i, fuoVar, d, strO, strO2, strO3);
    }

    public final SerialDescriptor getDescriptor() {
        return b;
    }

    public final void serialize(Encoder encoder, Object obj) {
        tep tepVar = (tep) obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
        ph5 ph5VarB = encoder.b(pluginGeneratedSerialDescriptor);
        KSerializer[] kSerializerArr = tep.l;
        String str = tepVar.g;
        Double d = tepVar.k;
        ph5VarB.z(pluginGeneratedSerialDescriptor, 0, str);
        ph5VarB.z(pluginGeneratedSerialDescriptor, 1, tepVar.h);
        ph5VarB.z(pluginGeneratedSerialDescriptor, 2, tepVar.i);
        ph5VarB.f(pluginGeneratedSerialDescriptor, 3, kSerializerArr[3], tepVar.j);
        if (ph5VarB.E() || d != null) {
            ph5VarB.j(pluginGeneratedSerialDescriptor, 4, oe7.a, d);
        }
        ph5VarB.c(pluginGeneratedSerialDescriptor);
    }

    public final KSerializer[] typeParametersSerializers() {
        return o0g.c;
    }
}
