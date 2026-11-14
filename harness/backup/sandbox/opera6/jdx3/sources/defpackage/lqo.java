package defpackage;

import com.leanplum.internal.Constants;
import com.leanplum.internal.ResourceQualifiers;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes.dex */
public final class lqo implements iv9 {
    public static final lqo a;
    public static final /* synthetic */ PluginGeneratedSerialDescriptor b;

    static {
        lqo lqoVar = new lqo();
        a = lqoVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.opera.ads.internal.analytics.AdBidTokenEvent", lqoVar, 8);
        pluginGeneratedSerialDescriptor.k(Constants.Params.REQUEST_ID, false);
        pluginGeneratedSerialDescriptor.k("len", false);
        pluginGeneratedSerialDescriptor.k("duration", false);
        pluginGeneratedSerialDescriptor.k("connectionType", false);
        pluginGeneratedSerialDescriptor.k("vpn", true);
        pluginGeneratedSerialDescriptor.k("placementId", true);
        pluginGeneratedSerialDescriptor.k("format", true);
        pluginGeneratedSerialDescriptor.k(Constants.Keys.SIZE, true);
        b = pluginGeneratedSerialDescriptor;
    }

    public final KSerializer[] childSerializers() {
        KSerializer kSerializer = xhk.a;
        KSerializer kSerializerB = f03.B(rn3.a);
        KSerializer kSerializerB2 = f03.B(kSerializer);
        KSerializer kSerializerB3 = f03.B(kSerializer);
        KSerializer kSerializerB4 = f03.B(kSerializer);
        ecb ecbVar = ecb.a;
        return new KSerializer[]{kSerializer, ecbVar, ecbVar, kSerializer, kSerializerB, kSerializerB2, kSerializerB3, kSerializerB4};
    }

    public final Object deserialize(Decoder decoder) {
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
        oh5 oh5VarB = decoder.b(pluginGeneratedSerialDescriptor);
        boolean z = true;
        int i = 0;
        int iL = 0;
        int iL2 = 0;
        String strO = null;
        String strO2 = null;
        Boolean bool = null;
        String str = null;
        String str2 = null;
        String str3 = null;
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
                    str = (String) oh5VarB.m(pluginGeneratedSerialDescriptor, 5, xhk.a);
                    i |= 32;
                    break;
                case 6:
                    str2 = (String) oh5VarB.m(pluginGeneratedSerialDescriptor, 6, xhk.a);
                    i |= 64;
                    break;
                case 7:
                    str3 = (String) oh5VarB.m(pluginGeneratedSerialDescriptor, 7, xhk.a);
                    i |= ResourceQualifiers.Qualifier.AnonymousClass5.SCREENLAYOUT_LAYOUTDIR_RTL;
                    break;
                default:
                    t3p.d(iP);
                    return null;
            }
        }
        oh5VarB.c(pluginGeneratedSerialDescriptor);
        return new rro(i, strO, iL, iL2, strO2, bool, str, str2, str3);
    }

    public final SerialDescriptor getDescriptor() {
        return b;
    }

    public final void serialize(Encoder encoder, Object obj) {
        rro rroVar = (rro) obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
        ph5 ph5VarB = encoder.b(pluginGeneratedSerialDescriptor);
        String str = rroVar.g;
        String str2 = rroVar.n;
        String str3 = rroVar.m;
        String str4 = rroVar.l;
        Boolean bool = rroVar.k;
        ph5VarB.z(pluginGeneratedSerialDescriptor, 0, str);
        ph5VarB.v(1, rroVar.h, pluginGeneratedSerialDescriptor);
        ph5VarB.v(2, rroVar.i, pluginGeneratedSerialDescriptor);
        ph5VarB.z(pluginGeneratedSerialDescriptor, 3, rroVar.j);
        if (ph5VarB.E() || bool != null) {
            ph5VarB.j(pluginGeneratedSerialDescriptor, 4, rn3.a, bool);
        }
        if (ph5VarB.E() || str4 != null) {
            ph5VarB.j(pluginGeneratedSerialDescriptor, 5, xhk.a, str4);
        }
        if (ph5VarB.E() || !Intrinsics.a(str3, (Object) null)) {
            ph5VarB.j(pluginGeneratedSerialDescriptor, 6, xhk.a, str3);
        }
        if (ph5VarB.E() || !Intrinsics.a(str2, (Object) null)) {
            ph5VarB.j(pluginGeneratedSerialDescriptor, 7, xhk.a, str2);
        }
        ph5VarB.c(pluginGeneratedSerialDescriptor);
    }

    public final KSerializer[] typeParametersSerializers() {
        return o0g.c;
    }
}
