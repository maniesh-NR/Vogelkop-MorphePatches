package defpackage;

import com.leanplum.internal.Constants;
import com.leanplum.internal.ResourceQualifiers;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes.dex */
public final class b2p implements iv9 {
    public static final b2p a;
    public static final /* synthetic */ PluginGeneratedSerialDescriptor b;

    static {
        b2p b2pVar = new b2p();
        a = b2pVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.opera.ads.internal.analytics.AdCloseEvent", b2pVar, 11);
        pluginGeneratedSerialDescriptor.k(Constants.Params.REQUEST_ID, false);
        pluginGeneratedSerialDescriptor.k("placementId", false);
        pluginGeneratedSerialDescriptor.k("crId", false);
        pluginGeneratedSerialDescriptor.k("adType", false);
        pluginGeneratedSerialDescriptor.k("connectionType", true);
        pluginGeneratedSerialDescriptor.k("vpn", true);
        pluginGeneratedSerialDescriptor.k("duration", false);
        pluginGeneratedSerialDescriptor.k("pn", false);
        pluginGeneratedSerialDescriptor.k("o2rd", false);
        pluginGeneratedSerialDescriptor.k("r2vd", false);
        pluginGeneratedSerialDescriptor.k("v2cd", false);
        b = pluginGeneratedSerialDescriptor;
    }

    public final KSerializer[] childSerializers() {
        KSerializer[] kSerializerArr = x2p.r;
        KSerializer kSerializer = xhk.a;
        KSerializer kSerializer2 = kSerializerArr[3];
        KSerializer kSerializerB = f03.B(kSerializer);
        KSerializer kSerializerB2 = f03.B(rn3.a);
        h1d h1dVar = h1d.a;
        return new KSerializer[]{kSerializer, kSerializer, kSerializer, kSerializer2, kSerializerB, kSerializerB2, h1dVar, ecb.a, h1dVar, h1dVar, h1dVar};
    }

    public final Object deserialize(Decoder decoder) {
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
        oh5 oh5VarB = decoder.b(pluginGeneratedSerialDescriptor);
        KSerializer[] kSerializerArr = x2p.r;
        int i = 0;
        int iL = 0;
        String strO = null;
        String strO2 = null;
        String strO3 = null;
        fuo fuoVar = null;
        String str = null;
        Boolean bool = null;
        long jG = 0;
        long jG2 = 0;
        long jG3 = 0;
        long jG4 = 0;
        boolean z = true;
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
                    str = (String) oh5VarB.m(pluginGeneratedSerialDescriptor, 4, xhk.a);
                    i |= 16;
                    break;
                case 5:
                    bool = (Boolean) oh5VarB.m(pluginGeneratedSerialDescriptor, 5, rn3.a);
                    i |= 32;
                    break;
                case 6:
                    jG = oh5VarB.g(pluginGeneratedSerialDescriptor, 6);
                    i |= 64;
                    break;
                case 7:
                    iL = oh5VarB.l(pluginGeneratedSerialDescriptor, 7);
                    i |= ResourceQualifiers.Qualifier.AnonymousClass5.SCREENLAYOUT_LAYOUTDIR_RTL;
                    break;
                case 8:
                    jG2 = oh5VarB.g(pluginGeneratedSerialDescriptor, 8);
                    i |= Constants.Crypt.KEY_LENGTH;
                    break;
                case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                    jG3 = oh5VarB.g(pluginGeneratedSerialDescriptor, 9);
                    i |= 512;
                    break;
                case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                    jG4 = oh5VarB.g(pluginGeneratedSerialDescriptor, 10);
                    i |= 1024;
                    break;
                default:
                    t3p.d(iP);
                    return null;
            }
        }
        oh5VarB.c(pluginGeneratedSerialDescriptor);
        return new x2p(i, strO, strO2, strO3, fuoVar, str, bool, jG, iL, jG2, jG3, jG4);
    }

    public final SerialDescriptor getDescriptor() {
        return b;
    }

    public final void serialize(Encoder encoder, Object obj) {
        x2p x2pVar = (x2p) obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
        ph5 ph5VarB = encoder.b(pluginGeneratedSerialDescriptor);
        KSerializer[] kSerializerArr = x2p.r;
        String str = x2pVar.g;
        Boolean bool = x2pVar.l;
        String str2 = x2pVar.k;
        ph5VarB.z(pluginGeneratedSerialDescriptor, 0, str);
        ph5VarB.z(pluginGeneratedSerialDescriptor, 1, x2pVar.h);
        ph5VarB.z(pluginGeneratedSerialDescriptor, 2, x2pVar.i);
        ph5VarB.f(pluginGeneratedSerialDescriptor, 3, kSerializerArr[3], x2pVar.j);
        if (ph5VarB.E() || str2 != null) {
            ph5VarB.j(pluginGeneratedSerialDescriptor, 4, xhk.a, str2);
        }
        if (ph5VarB.E() || bool != null) {
            ph5VarB.j(pluginGeneratedSerialDescriptor, 5, rn3.a, bool);
        }
        ph5VarB.F(pluginGeneratedSerialDescriptor, 6, x2pVar.m);
        ph5VarB.v(7, x2pVar.n, pluginGeneratedSerialDescriptor);
        ph5VarB.F(pluginGeneratedSerialDescriptor, 8, x2pVar.o);
        ph5VarB.F(pluginGeneratedSerialDescriptor, 9, x2pVar.p);
        ph5VarB.F(pluginGeneratedSerialDescriptor, 10, x2pVar.q);
        ph5VarB.c(pluginGeneratedSerialDescriptor);
    }

    public final KSerializer[] typeParametersSerializers() {
        return o0g.c;
    }
}
