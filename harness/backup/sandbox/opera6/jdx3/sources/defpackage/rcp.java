package defpackage;

import com.leanplum.internal.Constants;
import com.leanplum.internal.ResourceQualifiers;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes.dex */
public final class rcp implements iv9 {
    public static final rcp a;
    public static final /* synthetic */ PluginGeneratedSerialDescriptor b;

    static {
        rcp rcpVar = new rcp();
        a = rcpVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.opera.ads.internal.analytics.AdRequestEvent", rcpVar, 9);
        pluginGeneratedSerialDescriptor.k(Constants.Params.REQUEST_ID, false);
        pluginGeneratedSerialDescriptor.k("httpCode", false);
        pluginGeneratedSerialDescriptor.k("duration", false);
        pluginGeneratedSerialDescriptor.k("connectionType", false);
        pluginGeneratedSerialDescriptor.k("vpn", true);
        pluginGeneratedSerialDescriptor.k("placementId", false);
        pluginGeneratedSerialDescriptor.k("adTypes", false);
        pluginGeneratedSerialDescriptor.k("crIds", false);
        pluginGeneratedSerialDescriptor.k("reason", false);
        b = pluginGeneratedSerialDescriptor;
    }

    public final KSerializer[] childSerializers() {
        KSerializer[] kSerializerArr = bdp.p;
        KSerializer kSerializerB = f03.B(rn3.a);
        KSerializer kSerializer = kSerializerArr[6];
        KSerializer kSerializer2 = kSerializerArr[7];
        xhk xhkVar = xhk.a;
        ecb ecbVar = ecb.a;
        return new KSerializer[]{xhkVar, ecbVar, ecbVar, xhkVar, kSerializerB, xhkVar, kSerializer, kSerializer2, ecbVar};
    }

    public final Object deserialize(Decoder decoder) {
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
        oh5 oh5VarB = decoder.b(pluginGeneratedSerialDescriptor);
        KSerializer[] kSerializerArr = bdp.p;
        Object obj = null;
        boolean z = true;
        int i = 0;
        int iL = 0;
        int iL2 = 0;
        int iL3 = 0;
        String strO = null;
        String strO2 = null;
        Boolean bool = null;
        String strO3 = null;
        List list = null;
        List list2 = null;
        while (z) {
            int iP = oh5VarB.p(pluginGeneratedSerialDescriptor);
            switch (iP) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    strO = oh5VarB.o(pluginGeneratedSerialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    iL = oh5VarB.l(pluginGeneratedSerialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    iL2 = oh5VarB.l(pluginGeneratedSerialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    strO2 = oh5VarB.o(pluginGeneratedSerialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    bool = (Boolean) oh5VarB.m(pluginGeneratedSerialDescriptor, 4, rn3.a);
                    i |= 16;
                    break;
                case 5:
                    strO3 = oh5VarB.o(pluginGeneratedSerialDescriptor, 5);
                    i |= 32;
                    break;
                case 6:
                    list = (List) oh5VarB.z(pluginGeneratedSerialDescriptor, 6, kSerializerArr[6]);
                    i |= 64;
                    break;
                case 7:
                    list2 = (List) oh5VarB.z(pluginGeneratedSerialDescriptor, 7, kSerializerArr[7]);
                    i |= ResourceQualifiers.Qualifier.AnonymousClass5.SCREENLAYOUT_LAYOUTDIR_RTL;
                    break;
                case 8:
                    iL3 = oh5VarB.l(pluginGeneratedSerialDescriptor, 8);
                    i |= Constants.Crypt.KEY_LENGTH;
                    continue;
                default:
                    t3p.d(iP);
                    return obj;
            }
            obj = null;
        }
        oh5VarB.c(pluginGeneratedSerialDescriptor);
        return new bdp(i, strO, iL, iL2, strO2, bool, strO3, list, list2, iL3);
    }

    public final SerialDescriptor getDescriptor() {
        return b;
    }

    public final void serialize(Encoder encoder, Object obj) {
        bdp bdpVar = (bdp) obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
        ph5 ph5VarB = encoder.b(pluginGeneratedSerialDescriptor);
        KSerializer[] kSerializerArr = bdp.p;
        String str = bdpVar.g;
        Boolean bool = bdpVar.k;
        ph5VarB.z(pluginGeneratedSerialDescriptor, 0, str);
        ph5VarB.v(1, bdpVar.h, pluginGeneratedSerialDescriptor);
        ph5VarB.v(2, bdpVar.i, pluginGeneratedSerialDescriptor);
        ph5VarB.z(pluginGeneratedSerialDescriptor, 3, bdpVar.j);
        if (ph5VarB.E() || bool != null) {
            ph5VarB.j(pluginGeneratedSerialDescriptor, 4, rn3.a, bool);
        }
        ph5VarB.z(pluginGeneratedSerialDescriptor, 5, bdpVar.l);
        ph5VarB.f(pluginGeneratedSerialDescriptor, 6, kSerializerArr[6], bdpVar.m);
        ph5VarB.f(pluginGeneratedSerialDescriptor, 7, kSerializerArr[7], bdpVar.n);
        ph5VarB.v(8, bdpVar.o, pluginGeneratedSerialDescriptor);
        ph5VarB.c(pluginGeneratedSerialDescriptor);
    }

    public final KSerializer[] typeParametersSerializers() {
        return o0g.c;
    }
}
