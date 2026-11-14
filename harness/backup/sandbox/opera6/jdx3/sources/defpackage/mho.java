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
public final class mho implements iv9 {
    public static final mho a;
    public static final /* synthetic */ PluginGeneratedSerialDescriptor b;

    static {
        mho mhoVar = new mho();
        a = mhoVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.opera.ads.internal.data.AdData.BidData", mhoVar, 16);
        pluginGeneratedSerialDescriptor.k("id", false);
        pluginGeneratedSerialDescriptor.k("impid", false);
        pluginGeneratedSerialDescriptor.k("adm", false);
        pluginGeneratedSerialDescriptor.k("exp", false);
        pluginGeneratedSerialDescriptor.k("cid", false);
        pluginGeneratedSerialDescriptor.k("adid", true);
        pluginGeneratedSerialDescriptor.k("crid", true);
        pluginGeneratedSerialDescriptor.k("w", true);
        pluginGeneratedSerialDescriptor.k("h", true);
        pluginGeneratedSerialDescriptor.k("adomain", true);
        pluginGeneratedSerialDescriptor.k("cat", true);
        pluginGeneratedSerialDescriptor.k("ext", false);
        pluginGeneratedSerialDescriptor.k("nurl", true);
        pluginGeneratedSerialDescriptor.k("lurl", true);
        pluginGeneratedSerialDescriptor.k("bundle", true);
        pluginGeneratedSerialDescriptor.k("price", true);
        b = pluginGeneratedSerialDescriptor;
    }

    public final KSerializer[] childSerializers() {
        KSerializer[] kSerializerArr = oho.q;
        KSerializer kSerializer = xhk.a;
        KSerializer kSerializer2 = ecb.a;
        return new KSerializer[]{kSerializer, kSerializer, kSerializer, kSerializer2, kSerializer, f03.B(kSerializer), f03.B(kSerializer), f03.B(kSerializer2), f03.B(kSerializer2), f03.B(kSerializerArr[9]), f03.B(kSerializerArr[10]), qho.a, f03.B(kSerializer), f03.B(kSerializer), f03.B(kSerializer), f03.B(oe7.a)};
    }

    public final Object deserialize(Decoder decoder) {
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
        oh5 oh5VarB = decoder.b(pluginGeneratedSerialDescriptor);
        KSerializer[] kSerializerArr = oho.q;
        Object obj = null;
        boolean z = true;
        String strO = null;
        String strO2 = null;
        String strO3 = null;
        String strO4 = null;
        String str = null;
        String str2 = null;
        Integer num = null;
        Integer num2 = null;
        List list = null;
        List list2 = null;
        sho shoVar = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        Double d = null;
        int i = 0;
        int iL = 0;
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
                    iL = oh5VarB.l(pluginGeneratedSerialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    strO4 = oh5VarB.o(pluginGeneratedSerialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    str = (String) oh5VarB.m(pluginGeneratedSerialDescriptor, 5, xhk.a);
                    i |= 32;
                    break;
                case 6:
                    str2 = (String) oh5VarB.m(pluginGeneratedSerialDescriptor, 6, xhk.a);
                    i |= 64;
                    break;
                case 7:
                    num = (Integer) oh5VarB.m(pluginGeneratedSerialDescriptor, 7, ecb.a);
                    i |= ResourceQualifiers.Qualifier.AnonymousClass5.SCREENLAYOUT_LAYOUTDIR_RTL;
                    break;
                case 8:
                    num2 = (Integer) oh5VarB.m(pluginGeneratedSerialDescriptor, 8, ecb.a);
                    i |= Constants.Crypt.KEY_LENGTH;
                    break;
                case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                    list = (List) oh5VarB.m(pluginGeneratedSerialDescriptor, 9, kSerializerArr[9]);
                    i |= 512;
                    break;
                case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                    list2 = (List) oh5VarB.m(pluginGeneratedSerialDescriptor, 10, kSerializerArr[10]);
                    i |= 1024;
                    break;
                case 11:
                    shoVar = (sho) oh5VarB.z(pluginGeneratedSerialDescriptor, 11, qho.a);
                    i |= 2048;
                    break;
                case 12:
                    str3 = (String) oh5VarB.m(pluginGeneratedSerialDescriptor, 12, xhk.a);
                    i |= 4096;
                    break;
                case 13:
                    str4 = (String) oh5VarB.m(pluginGeneratedSerialDescriptor, 13, xhk.a);
                    i |= 8192;
                    break;
                case 14:
                    str5 = (String) oh5VarB.m(pluginGeneratedSerialDescriptor, 14, xhk.a);
                    i |= 16384;
                    break;
                case 15:
                    d = (Double) oh5VarB.m(pluginGeneratedSerialDescriptor, 15, oe7.a);
                    i |= 32768;
                    break;
                default:
                    t3p.d(iP);
                    return obj;
            }
            obj = null;
        }
        oh5VarB.c(pluginGeneratedSerialDescriptor);
        return new oho(i, strO, strO2, strO3, iL, strO4, str, str2, num, num2, list, list2, shoVar, str3, str4, str5, d);
    }

    public final SerialDescriptor getDescriptor() {
        return b;
    }

    public final void serialize(Encoder encoder, Object obj) {
        oho ohoVar = (oho) obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
        ph5 ph5VarB = encoder.b(pluginGeneratedSerialDescriptor);
        KSerializer[] kSerializerArr = oho.q;
        String str = ohoVar.a;
        Double d = ohoVar.p;
        String str2 = ohoVar.o;
        String str3 = ohoVar.n;
        String str4 = ohoVar.m;
        List list = ohoVar.k;
        List list2 = ohoVar.j;
        Integer num = ohoVar.i;
        Integer num2 = ohoVar.h;
        String str5 = ohoVar.g;
        String str6 = ohoVar.f;
        ph5VarB.z(pluginGeneratedSerialDescriptor, 0, str);
        ph5VarB.z(pluginGeneratedSerialDescriptor, 1, ohoVar.b);
        ph5VarB.z(pluginGeneratedSerialDescriptor, 2, ohoVar.c);
        ph5VarB.v(3, ohoVar.d, pluginGeneratedSerialDescriptor);
        ph5VarB.z(pluginGeneratedSerialDescriptor, 4, ohoVar.e);
        if (ph5VarB.E() || str6 != null) {
            ph5VarB.j(pluginGeneratedSerialDescriptor, 5, xhk.a, str6);
        }
        if (ph5VarB.E() || str5 != null) {
            ph5VarB.j(pluginGeneratedSerialDescriptor, 6, xhk.a, str5);
        }
        if (ph5VarB.E() || num2 == null || num2.intValue() != 0) {
            ph5VarB.j(pluginGeneratedSerialDescriptor, 7, ecb.a, num2);
        }
        if (ph5VarB.E() || num == null || num.intValue() != 0) {
            ph5VarB.j(pluginGeneratedSerialDescriptor, 8, ecb.a, num);
        }
        if (ph5VarB.E() || list2 != null) {
            ph5VarB.j(pluginGeneratedSerialDescriptor, 9, kSerializerArr[9], list2);
        }
        if (ph5VarB.E() || list != null) {
            ph5VarB.j(pluginGeneratedSerialDescriptor, 10, kSerializerArr[10], list);
        }
        ph5VarB.f(pluginGeneratedSerialDescriptor, 11, qho.a, ohoVar.l);
        if (ph5VarB.E() || str4 != null) {
            ph5VarB.j(pluginGeneratedSerialDescriptor, 12, xhk.a, str4);
        }
        if (ph5VarB.E() || str3 != null) {
            ph5VarB.j(pluginGeneratedSerialDescriptor, 13, xhk.a, str3);
        }
        if (ph5VarB.E() || str2 != null) {
            ph5VarB.j(pluginGeneratedSerialDescriptor, 14, xhk.a, str2);
        }
        if (ph5VarB.E() || d != null) {
            ph5VarB.j(pluginGeneratedSerialDescriptor, 15, oe7.a, d);
        }
        ph5VarB.c(pluginGeneratedSerialDescriptor);
    }

    public final KSerializer[] typeParametersSerializers() {
        return o0g.c;
    }
}
