package defpackage;

import com.leanplum.internal.Constants;
import com.leanplum.internal.ResourceQualifiers;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes.dex */
public final class ifp implements iv9 {
    public static final ifp a;
    public static final /* synthetic */ PluginGeneratedSerialDescriptor b;

    static {
        ifp ifpVar = new ifp();
        a = ifpVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.opera.ads.internal.analytics.AdVisibleEvent", ifpVar, 10);
        pluginGeneratedSerialDescriptor.k(Constants.Params.REQUEST_ID, false);
        pluginGeneratedSerialDescriptor.k("placementId", false);
        pluginGeneratedSerialDescriptor.k("crId", false);
        pluginGeneratedSerialDescriptor.k("adType", false);
        pluginGeneratedSerialDescriptor.k("connectionType", true);
        pluginGeneratedSerialDescriptor.k("vpn", true);
        pluginGeneratedSerialDescriptor.k("ecpm", true);
        pluginGeneratedSerialDescriptor.k("pn", true);
        pluginGeneratedSerialDescriptor.k("o2rd", true);
        pluginGeneratedSerialDescriptor.k("r2vd", true);
        b = pluginGeneratedSerialDescriptor;
    }

    public final KSerializer[] childSerializers() {
        KSerializer[] kSerializerArr = wfp.q;
        KSerializer kSerializer = xhk.a;
        KSerializer kSerializer2 = kSerializerArr[3];
        KSerializer kSerializerB = f03.B(kSerializer);
        KSerializer kSerializerB2 = f03.B(rn3.a);
        KSerializer kSerializerB3 = f03.B(oe7.a);
        KSerializer kSerializerB4 = f03.B(ecb.a);
        h1d h1dVar = h1d.a;
        return new KSerializer[]{kSerializer, kSerializer, kSerializer, kSerializer2, kSerializerB, kSerializerB2, kSerializerB3, kSerializerB4, f03.B(h1dVar), f03.B(h1dVar)};
    }

    public final Object deserialize(Decoder decoder) {
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
        oh5 oh5VarB = decoder.b(pluginGeneratedSerialDescriptor);
        KSerializer[] kSerializerArr = wfp.q;
        Object obj = null;
        boolean z = true;
        int i = 0;
        String strO = null;
        String strO2 = null;
        String strO3 = null;
        fuo fuoVar = null;
        String str = null;
        Boolean bool = null;
        Double d = null;
        Integer num = null;
        Long l = null;
        Long l2 = null;
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
                    str = (String) oh5VarB.m(pluginGeneratedSerialDescriptor, 4, xhk.a);
                    i |= 16;
                    break;
                case 5:
                    bool = (Boolean) oh5VarB.m(pluginGeneratedSerialDescriptor, 5, rn3.a);
                    i |= 32;
                    break;
                case 6:
                    d = (Double) oh5VarB.m(pluginGeneratedSerialDescriptor, 6, oe7.a);
                    i |= 64;
                    break;
                case 7:
                    num = (Integer) oh5VarB.m(pluginGeneratedSerialDescriptor, 7, ecb.a);
                    i |= ResourceQualifiers.Qualifier.AnonymousClass5.SCREENLAYOUT_LAYOUTDIR_RTL;
                    break;
                case 8:
                    l = (Long) oh5VarB.m(pluginGeneratedSerialDescriptor, 8, h1d.a);
                    i |= Constants.Crypt.KEY_LENGTH;
                    break;
                case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                    l2 = (Long) oh5VarB.m(pluginGeneratedSerialDescriptor, 9, h1d.a);
                    i |= 512;
                    break;
                default:
                    t3p.d(iP);
                    return obj;
            }
            obj = null;
        }
        oh5VarB.c(pluginGeneratedSerialDescriptor);
        return new wfp(i, strO, strO2, strO3, fuoVar, str, bool, d, num, l, l2);
    }

    public final SerialDescriptor getDescriptor() {
        return b;
    }

    public final void serialize(Encoder encoder, Object obj) {
        wfp wfpVar = (wfp) obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
        ph5 ph5VarB = encoder.b(pluginGeneratedSerialDescriptor);
        KSerializer[] kSerializerArr = wfp.q;
        String str = wfpVar.g;
        Long l = wfpVar.p;
        Long l2 = wfpVar.o;
        Integer num = wfpVar.n;
        Double d = wfpVar.m;
        Boolean bool = wfpVar.l;
        String str2 = wfpVar.k;
        ph5VarB.z(pluginGeneratedSerialDescriptor, 0, str);
        ph5VarB.z(pluginGeneratedSerialDescriptor, 1, wfpVar.h);
        ph5VarB.z(pluginGeneratedSerialDescriptor, 2, wfpVar.i);
        ph5VarB.f(pluginGeneratedSerialDescriptor, 3, kSerializerArr[3], wfpVar.j);
        if (ph5VarB.E() || str2 != null) {
            ph5VarB.j(pluginGeneratedSerialDescriptor, 4, xhk.a, str2);
        }
        if (ph5VarB.E() || bool != null) {
            ph5VarB.j(pluginGeneratedSerialDescriptor, 5, rn3.a, bool);
        }
        if (ph5VarB.E() || d != null) {
            ph5VarB.j(pluginGeneratedSerialDescriptor, 6, oe7.a, d);
        }
        if (ph5VarB.E() || num != null) {
            ph5VarB.j(pluginGeneratedSerialDescriptor, 7, ecb.a, num);
        }
        if (ph5VarB.E() || l2 != null) {
            ph5VarB.j(pluginGeneratedSerialDescriptor, 8, h1d.a, l2);
        }
        if (ph5VarB.E() || l != null) {
            ph5VarB.j(pluginGeneratedSerialDescriptor, 9, h1d.a, l);
        }
        ph5VarB.c(pluginGeneratedSerialDescriptor);
    }

    public final KSerializer[] typeParametersSerializers() {
        return o0g.c;
    }
}
