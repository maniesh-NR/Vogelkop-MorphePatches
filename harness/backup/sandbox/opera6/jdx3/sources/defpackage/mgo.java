package defpackage;

import com.leanplum.internal.Constants;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes.dex */
public final class mgo implements iv9 {
    public static final mgo a;
    public static final /* synthetic */ PluginGeneratedSerialDescriptor b;

    static {
        mgo mgoVar = new mgo();
        a = mgoVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.opera.ads.internal.analytics.AdAttachedEvent", mgoVar, 4);
        pluginGeneratedSerialDescriptor.k(Constants.Params.REQUEST_ID, false);
        pluginGeneratedSerialDescriptor.k("placementId", false);
        pluginGeneratedSerialDescriptor.k("crId", false);
        pluginGeneratedSerialDescriptor.k("adType", false);
        b = pluginGeneratedSerialDescriptor;
    }

    public final KSerializer[] childSerializers() {
        KSerializer kSerializer = xjo.k[3];
        xhk xhkVar = xhk.a;
        return new KSerializer[]{xhkVar, xhkVar, xhkVar, kSerializer};
    }

    public final Object deserialize(Decoder decoder) {
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
        oh5 oh5VarB = decoder.b(pluginGeneratedSerialDescriptor);
        KSerializer[] kSerializerArr = xjo.k;
        boolean z = true;
        int i = 0;
        String strO = null;
        String strO2 = null;
        String strO3 = null;
        fuo fuoVar = null;
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
            } else {
                if (iP != 3) {
                    t3p.d(iP);
                    return null;
                }
                fuoVar = (fuo) oh5VarB.z(pluginGeneratedSerialDescriptor, 3, kSerializerArr[3]);
                i |= 8;
            }
        }
        oh5VarB.c(pluginGeneratedSerialDescriptor);
        return new xjo(i, strO, strO2, strO3, fuoVar);
    }

    public final SerialDescriptor getDescriptor() {
        return b;
    }

    public final void serialize(Encoder encoder, Object obj) {
        xjo xjoVar = (xjo) obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
        ph5 ph5VarB = encoder.b(pluginGeneratedSerialDescriptor);
        KSerializer[] kSerializerArr = xjo.k;
        ph5VarB.z(pluginGeneratedSerialDescriptor, 0, xjoVar.g);
        ph5VarB.z(pluginGeneratedSerialDescriptor, 1, xjoVar.h);
        ph5VarB.z(pluginGeneratedSerialDescriptor, 2, xjoVar.i);
        ph5VarB.f(pluginGeneratedSerialDescriptor, 3, kSerializerArr[3], xjoVar.j);
        ph5VarB.c(pluginGeneratedSerialDescriptor);
    }

    public final KSerializer[] typeParametersSerializers() {
        return o0g.c;
    }
}
