package defpackage;

import com.leanplum.internal.Constants;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes.dex */
public final class kmo implements iv9 {
    public static final kmo a;
    public static final /* synthetic */ PluginGeneratedSerialDescriptor b;

    static {
        kmo kmoVar = new kmo();
        a = kmoVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.opera.ads.internal.analytics.AdBidEvent", kmoVar, 4);
        pluginGeneratedSerialDescriptor.k(Constants.Params.REQUEST_ID, false);
        pluginGeneratedSerialDescriptor.k("placementId", false);
        pluginGeneratedSerialDescriptor.k("adTypes", false);
        pluginGeneratedSerialDescriptor.k("bidType", false);
        b = pluginGeneratedSerialDescriptor;
    }

    public final KSerializer[] childSerializers() {
        KSerializer kSerializer = soo.k[2];
        xhk xhkVar = xhk.a;
        return new KSerializer[]{xhkVar, xhkVar, kSerializer, ecb.a};
    }

    public final Object deserialize(Decoder decoder) {
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
        oh5 oh5VarB = decoder.b(pluginGeneratedSerialDescriptor);
        KSerializer[] kSerializerArr = soo.k;
        boolean z = true;
        int i = 0;
        int iL = 0;
        String strO = null;
        String strO2 = null;
        List list = null;
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
            } else {
                if (iP != 3) {
                    t3p.d(iP);
                    return null;
                }
                iL = oh5VarB.l(pluginGeneratedSerialDescriptor, 3);
                i |= 8;
            }
        }
        oh5VarB.c(pluginGeneratedSerialDescriptor);
        return new soo(i, iL, strO, strO2, list);
    }

    public final SerialDescriptor getDescriptor() {
        return b;
    }

    public final void serialize(Encoder encoder, Object obj) {
        soo sooVar = (soo) obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
        ph5 ph5VarB = encoder.b(pluginGeneratedSerialDescriptor);
        KSerializer[] kSerializerArr = soo.k;
        ph5VarB.z(pluginGeneratedSerialDescriptor, 0, sooVar.g);
        ph5VarB.z(pluginGeneratedSerialDescriptor, 1, sooVar.h);
        ph5VarB.f(pluginGeneratedSerialDescriptor, 2, kSerializerArr[2], sooVar.i);
        ph5VarB.v(3, sooVar.j, pluginGeneratedSerialDescriptor);
        ph5VarB.c(pluginGeneratedSerialDescriptor);
    }

    public final KSerializer[] typeParametersSerializers() {
        return o0g.c;
    }
}
