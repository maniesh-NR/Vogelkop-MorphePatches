package defpackage;

import com.leanplum.internal.Constants;
import com.leanplum.internal.ResourceQualifiers;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes.dex */
public final class qho implements iv9 {
    public static final qho a;
    public static final /* synthetic */ PluginGeneratedSerialDescriptor b;

    static {
        qho qhoVar = new qho();
        a = qhoVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.opera.ads.internal.data.AdData.BidExt", qhoVar, 13);
        pluginGeneratedSerialDescriptor.k("mtype", false);
        pluginGeneratedSerialDescriptor.k("deeplink", true);
        pluginGeneratedSerialDescriptor.k("fallback", true);
        pluginGeneratedSerialDescriptor.k("omid", true);
        pluginGeneratedSerialDescriptor.k("templateconfig", true);
        pluginGeneratedSerialDescriptor.k("adload", true);
        pluginGeneratedSerialDescriptor.k("advisible", true);
        pluginGeneratedSerialDescriptor.k("adviewable", true);
        pluginGeneratedSerialDescriptor.k("clicktrackers", true);
        pluginGeneratedSerialDescriptor.k("privacy", true);
        pluginGeneratedSerialDescriptor.k("adchoice", true);
        pluginGeneratedSerialDescriptor.k("rwdd", true);
        pluginGeneratedSerialDescriptor.k("refreshinterval", true);
        b = pluginGeneratedSerialDescriptor;
    }

    public final KSerializer[] childSerializers() {
        KSerializer[] kSerializerArr = sho.n;
        KSerializer kSerializer = ecb.a;
        KSerializer kSerializer2 = xhk.a;
        return new KSerializer[]{kSerializer, kSerializer2, kSerializer2, f03.B(yho.a), f03.B(gio.a), f03.B(kSerializerArr[5]), f03.B(kSerializerArr[6]), f03.B(kSerializerArr[7]), f03.B(kSerializerArr[8]), f03.B(kSerializer2), f03.B(kSerializer2), f03.B(cio.a), f03.B(kSerializer)};
    }

    public final Object deserialize(Decoder decoder) {
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
        oh5 oh5VarB = decoder.b(pluginGeneratedSerialDescriptor);
        KSerializer[] kSerializerArr = sho.n;
        Object obj = null;
        boolean z = true;
        int i = 0;
        int iL = 0;
        String strO = null;
        String strO2 = null;
        aio aioVar = null;
        iio iioVar = null;
        List list = null;
        List list2 = null;
        List list3 = null;
        List list4 = null;
        String str = null;
        String str2 = null;
        eio eioVar = null;
        Integer num = null;
        while (z) {
            int iP = oh5VarB.p(pluginGeneratedSerialDescriptor);
            switch (iP) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    iL = oh5VarB.l(pluginGeneratedSerialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    strO = oh5VarB.o(pluginGeneratedSerialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    strO2 = oh5VarB.o(pluginGeneratedSerialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    aioVar = (aio) oh5VarB.m(pluginGeneratedSerialDescriptor, 3, yho.a);
                    i |= 8;
                    break;
                case 4:
                    iioVar = (iio) oh5VarB.m(pluginGeneratedSerialDescriptor, 4, gio.a);
                    i |= 16;
                    break;
                case 5:
                    list = (List) oh5VarB.m(pluginGeneratedSerialDescriptor, 5, kSerializerArr[5]);
                    i |= 32;
                    break;
                case 6:
                    list2 = (List) oh5VarB.m(pluginGeneratedSerialDescriptor, 6, kSerializerArr[6]);
                    i |= 64;
                    break;
                case 7:
                    list3 = (List) oh5VarB.m(pluginGeneratedSerialDescriptor, 7, kSerializerArr[7]);
                    i |= ResourceQualifiers.Qualifier.AnonymousClass5.SCREENLAYOUT_LAYOUTDIR_RTL;
                    break;
                case 8:
                    list4 = (List) oh5VarB.m(pluginGeneratedSerialDescriptor, 8, kSerializerArr[8]);
                    i |= Constants.Crypt.KEY_LENGTH;
                    break;
                case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                    str = (String) oh5VarB.m(pluginGeneratedSerialDescriptor, 9, xhk.a);
                    i |= 512;
                    break;
                case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                    str2 = (String) oh5VarB.m(pluginGeneratedSerialDescriptor, 10, xhk.a);
                    i |= 1024;
                    break;
                case 11:
                    eioVar = (eio) oh5VarB.m(pluginGeneratedSerialDescriptor, 11, cio.a);
                    i |= 2048;
                    break;
                case 12:
                    num = (Integer) oh5VarB.m(pluginGeneratedSerialDescriptor, 12, ecb.a);
                    i |= 4096;
                    break;
                default:
                    t3p.d(iP);
                    return obj;
            }
            obj = null;
        }
        oh5VarB.c(pluginGeneratedSerialDescriptor);
        return new sho(i, iL, strO, strO2, aioVar, iioVar, list, list2, list3, list4, str, str2, eioVar, num);
    }

    public final SerialDescriptor getDescriptor() {
        return b;
    }

    public final void serialize(Encoder encoder, Object obj) {
        sho shoVar = (sho) obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
        ph5 ph5VarB = encoder.b(pluginGeneratedSerialDescriptor);
        KSerializer[] kSerializerArr = sho.n;
        int i = shoVar.a;
        Integer num = shoVar.m;
        eio eioVar = shoVar.l;
        String str = shoVar.k;
        String str2 = shoVar.j;
        List list = shoVar.i;
        List list2 = shoVar.h;
        List list3 = shoVar.g;
        List list4 = shoVar.f;
        iio iioVar = shoVar.e;
        aio aioVar = shoVar.d;
        String str3 = shoVar.c;
        String str4 = shoVar.b;
        ph5VarB.v(0, i, pluginGeneratedSerialDescriptor);
        if (ph5VarB.E() || !Intrinsics.a(str4, "")) {
            ph5VarB.z(pluginGeneratedSerialDescriptor, 1, str4);
        }
        if (ph5VarB.E() || !Intrinsics.a(str3, "")) {
            ph5VarB.z(pluginGeneratedSerialDescriptor, 2, str3);
        }
        if (ph5VarB.E() || aioVar != null) {
            ph5VarB.j(pluginGeneratedSerialDescriptor, 3, yho.a, aioVar);
        }
        if (ph5VarB.E() || iioVar != null) {
            ph5VarB.j(pluginGeneratedSerialDescriptor, 4, gio.a, iioVar);
        }
        if (ph5VarB.E() || list4 != null) {
            ph5VarB.j(pluginGeneratedSerialDescriptor, 5, kSerializerArr[5], list4);
        }
        if (ph5VarB.E() || list3 != null) {
            ph5VarB.j(pluginGeneratedSerialDescriptor, 6, kSerializerArr[6], list3);
        }
        if (ph5VarB.E() || list2 != null) {
            ph5VarB.j(pluginGeneratedSerialDescriptor, 7, kSerializerArr[7], list2);
        }
        if (ph5VarB.E() || list != null) {
            ph5VarB.j(pluginGeneratedSerialDescriptor, 8, kSerializerArr[8], list);
        }
        if (ph5VarB.E() || str2 != null) {
            ph5VarB.j(pluginGeneratedSerialDescriptor, 9, xhk.a, str2);
        }
        if (ph5VarB.E() || str != null) {
            ph5VarB.j(pluginGeneratedSerialDescriptor, 10, xhk.a, str);
        }
        if (ph5VarB.E() || eioVar != null) {
            ph5VarB.j(pluginGeneratedSerialDescriptor, 11, cio.a, eioVar);
        }
        if (ph5VarB.E() || num != null) {
            ph5VarB.j(pluginGeneratedSerialDescriptor, 12, ecb.a, num);
        }
        ph5VarB.c(pluginGeneratedSerialDescriptor);
    }

    public final KSerializer[] typeParametersSerializers() {
        return o0g.c;
    }
}
