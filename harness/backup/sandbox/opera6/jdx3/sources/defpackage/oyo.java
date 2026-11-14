package defpackage;

import com.leanplum.internal.Constants;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes.dex */
public final class oyo implements iv9 {
    public static final oyo a;
    public static final /* synthetic */ PluginGeneratedSerialDescriptor b;

    static {
        oyo oyoVar = new oyo();
        a = oyoVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.opera.ads.internal.analytics.AdClickCoordinateEvent", oyoVar, 6);
        pluginGeneratedSerialDescriptor.k(Constants.Params.REQUEST_ID, false);
        pluginGeneratedSerialDescriptor.k("placementId", false);
        pluginGeneratedSerialDescriptor.k("crId", false);
        pluginGeneratedSerialDescriptor.k("adFormat", false);
        pluginGeneratedSerialDescriptor.k("adType", false);
        pluginGeneratedSerialDescriptor.k("clickCoord", false);
        b = pluginGeneratedSerialDescriptor;
    }

    public final KSerializer[] childSerializers() {
        KSerializer[] kSerializerArr = izo.m;
        KSerializer kSerializer = kSerializerArr[3];
        KSerializer kSerializer2 = kSerializerArr[4];
        xhk xhkVar = xhk.a;
        return new KSerializer[]{xhkVar, xhkVar, xhkVar, kSerializer, kSerializer2, rjp.a};
    }

    public final Object deserialize(Decoder decoder) {
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
        oh5 oh5VarB = decoder.b(pluginGeneratedSerialDescriptor);
        KSerializer[] kSerializerArr = izo.m;
        boolean z = true;
        int i = 0;
        String strO = null;
        String strO2 = null;
        String strO3 = null;
        sm smVar = null;
        fuo fuoVar = null;
        wjp wjpVar = null;
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
                    smVar = (sm) oh5VarB.z(pluginGeneratedSerialDescriptor, 3, kSerializerArr[3]);
                    i |= 8;
                    break;
                case 4:
                    fuoVar = (fuo) oh5VarB.z(pluginGeneratedSerialDescriptor, 4, kSerializerArr[4]);
                    i |= 16;
                    break;
                case 5:
                    wjpVar = (wjp) oh5VarB.z(pluginGeneratedSerialDescriptor, 5, rjp.a);
                    i |= 32;
                    break;
                default:
                    t3p.d(iP);
                    return null;
            }
        }
        oh5VarB.c(pluginGeneratedSerialDescriptor);
        return new izo(i, strO, strO2, strO3, smVar, fuoVar, wjpVar);
    }

    public final SerialDescriptor getDescriptor() {
        return b;
    }

    public final void serialize(Encoder encoder, Object obj) {
        izo izoVar = (izo) obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
        ph5 ph5VarB = encoder.b(pluginGeneratedSerialDescriptor);
        KSerializer[] kSerializerArr = izo.m;
        ph5VarB.z(pluginGeneratedSerialDescriptor, 0, izoVar.g);
        ph5VarB.z(pluginGeneratedSerialDescriptor, 1, izoVar.h);
        ph5VarB.z(pluginGeneratedSerialDescriptor, 2, izoVar.i);
        ph5VarB.f(pluginGeneratedSerialDescriptor, 3, kSerializerArr[3], izoVar.j);
        ph5VarB.f(pluginGeneratedSerialDescriptor, 4, kSerializerArr[4], izoVar.k);
        ph5VarB.f(pluginGeneratedSerialDescriptor, 5, rjp.a, izoVar.l);
        ph5VarB.c(pluginGeneratedSerialDescriptor);
    }

    public final KSerializer[] typeParametersSerializers() {
        return o0g.c;
    }
}
