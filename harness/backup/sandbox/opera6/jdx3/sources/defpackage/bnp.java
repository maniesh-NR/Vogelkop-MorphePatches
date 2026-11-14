package defpackage;

import com.leanplum.internal.Constants;
import com.leanplum.internal.ResourceQualifiers;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes.dex */
public final class bnp implements iv9 {
    public static final bnp a;
    public static final /* synthetic */ PluginGeneratedSerialDescriptor b;

    static {
        bnp bnpVar = new bnp();
        a = bnpVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.opera.ads.internal.analytics.InstallReferrerEvent", bnpVar, 9);
        pluginGeneratedSerialDescriptor.k("r", false);
        pluginGeneratedSerialDescriptor.k("cts", false);
        pluginGeneratedSerialDescriptor.k("its", false);
        pluginGeneratedSerialDescriptor.k("ctss", false);
        pluginGeneratedSerialDescriptor.k("itss", false);
        pluginGeneratedSerialDescriptor.k("i", false);
        pluginGeneratedSerialDescriptor.k("v", false);
        pluginGeneratedSerialDescriptor.k("lut", false);
        pluginGeneratedSerialDescriptor.k("is", false);
        b = pluginGeneratedSerialDescriptor;
    }

    public final KSerializer[] childSerializers() {
        KSerializer kSerializer = xhk.a;
        KSerializer kSerializerB = f03.B(kSerializer);
        KSerializer kSerializer2 = h1d.a;
        return new KSerializer[]{kSerializerB, f03.B(kSerializer2), f03.B(kSerializer2), f03.B(kSerializer2), f03.B(kSerializer2), f03.B(rn3.a), kSerializer, kSerializer2, f03.B(kSerializer)};
    }

    public final Object deserialize(Decoder decoder) {
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
        oh5 oh5VarB = decoder.b(pluginGeneratedSerialDescriptor);
        int i = 0;
        String str = null;
        Long l = null;
        Long l2 = null;
        Long l3 = null;
        Long l4 = null;
        Boolean bool = null;
        String strO = null;
        String str2 = null;
        long jG = 0;
        boolean z = true;
        while (z) {
            int iP = oh5VarB.p(pluginGeneratedSerialDescriptor);
            switch (iP) {
                case -1:
                    z = false;
                    break;
                case 0:
                    str = (String) oh5VarB.m(pluginGeneratedSerialDescriptor, 0, xhk.a);
                    i |= 1;
                    break;
                case 1:
                    l = (Long) oh5VarB.m(pluginGeneratedSerialDescriptor, 1, h1d.a);
                    i |= 2;
                    break;
                case 2:
                    l2 = (Long) oh5VarB.m(pluginGeneratedSerialDescriptor, 2, h1d.a);
                    i |= 4;
                    break;
                case 3:
                    l3 = (Long) oh5VarB.m(pluginGeneratedSerialDescriptor, 3, h1d.a);
                    i |= 8;
                    break;
                case 4:
                    l4 = (Long) oh5VarB.m(pluginGeneratedSerialDescriptor, 4, h1d.a);
                    i |= 16;
                    break;
                case 5:
                    bool = (Boolean) oh5VarB.m(pluginGeneratedSerialDescriptor, 5, rn3.a);
                    i |= 32;
                    break;
                case 6:
                    strO = oh5VarB.o(pluginGeneratedSerialDescriptor, 6);
                    i |= 64;
                    break;
                case 7:
                    jG = oh5VarB.g(pluginGeneratedSerialDescriptor, 7);
                    i |= ResourceQualifiers.Qualifier.AnonymousClass5.SCREENLAYOUT_LAYOUTDIR_RTL;
                    break;
                case 8:
                    str2 = (String) oh5VarB.m(pluginGeneratedSerialDescriptor, 8, xhk.a);
                    i |= Constants.Crypt.KEY_LENGTH;
                    break;
                default:
                    t3p.d(iP);
                    return null;
            }
        }
        oh5VarB.c(pluginGeneratedSerialDescriptor);
        return new fnp(i, str, l, l2, l3, l4, bool, strO, jG, str2);
    }

    public final SerialDescriptor getDescriptor() {
        return b;
    }

    public final void serialize(Encoder encoder, Object obj) {
        fnp fnpVar = (fnp) obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
        ph5 ph5VarB = encoder.b(pluginGeneratedSerialDescriptor);
        cnp cnpVar = fnp.Companion;
        xhk xhkVar = xhk.a;
        ph5VarB.j(pluginGeneratedSerialDescriptor, 0, xhkVar, fnpVar.g);
        h1d h1dVar = h1d.a;
        ph5VarB.j(pluginGeneratedSerialDescriptor, 1, h1dVar, fnpVar.h);
        ph5VarB.j(pluginGeneratedSerialDescriptor, 2, h1dVar, fnpVar.i);
        ph5VarB.j(pluginGeneratedSerialDescriptor, 3, h1dVar, fnpVar.j);
        ph5VarB.j(pluginGeneratedSerialDescriptor, 4, h1dVar, fnpVar.k);
        ph5VarB.j(pluginGeneratedSerialDescriptor, 5, rn3.a, fnpVar.l);
        ph5VarB.z(pluginGeneratedSerialDescriptor, 6, fnpVar.m);
        ph5VarB.F(pluginGeneratedSerialDescriptor, 7, fnpVar.n);
        ph5VarB.j(pluginGeneratedSerialDescriptor, 8, xhkVar, fnpVar.o);
        ph5VarB.c(pluginGeneratedSerialDescriptor);
    }

    public final KSerializer[] typeParametersSerializers() {
        return o0g.c;
    }
}
