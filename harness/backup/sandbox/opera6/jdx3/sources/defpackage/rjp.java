package defpackage;

import com.leanplum.internal.Constants;
import com.leanplum.internal.ResourceQualifiers;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes.dex */
public final class rjp implements iv9 {
    public static final rjp a;
    public static final /* synthetic */ PluginGeneratedSerialDescriptor b;

    static {
        rjp rjpVar = new rjp();
        a = rjpVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.opera.ads.internal.analytics.ClickCoordinate", rjpVar, 12);
        pluginGeneratedSerialDescriptor.k("x0", false);
        pluginGeneratedSerialDescriptor.k("y0", false);
        pluginGeneratedSerialDescriptor.k("x", false);
        pluginGeneratedSerialDescriptor.k("y", false);
        pluginGeneratedSerialDescriptor.k("d", false);
        pluginGeneratedSerialDescriptor.k("r", false);
        pluginGeneratedSerialDescriptor.k("t", true);
        pluginGeneratedSerialDescriptor.k("sw", false);
        pluginGeneratedSerialDescriptor.k("sh", false);
        pluginGeneratedSerialDescriptor.k("e", true);
        pluginGeneratedSerialDescriptor.k("ct", true);
        pluginGeneratedSerialDescriptor.k("ucd", true);
        b = pluginGeneratedSerialDescriptor;
    }

    public final KSerializer[] childSerializers() {
        KSerializer kSerializer = xap.a;
        KSerializer kSerializerB = f03.B(kSerializer);
        KSerializer kSerializerB2 = f03.B(xhk.a);
        ecb ecbVar = ecb.a;
        h1d h1dVar = h1d.a;
        return new KSerializer[]{ecbVar, ecbVar, ecbVar, ecbVar, h1dVar, kSerializer, kSerializerB, ecbVar, ecbVar, kSerializerB2, rn3.a, h1dVar};
    }

    public final Object deserialize(Decoder decoder) {
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
        oh5 oh5VarB = decoder.b(pluginGeneratedSerialDescriptor);
        int i = 0;
        int iL = 0;
        int iL2 = 0;
        int iL3 = 0;
        int iL4 = 0;
        int iL5 = 0;
        int iL6 = 0;
        boolean zC = false;
        long jG = 0;
        long jG2 = 0;
        zap zapVar = null;
        zap zapVar2 = null;
        String str = null;
        boolean z = true;
        while (z) {
            int iP = oh5VarB.p(pluginGeneratedSerialDescriptor);
            switch (iP) {
                case -1:
                    z = false;
                    break;
                case 0:
                    iL = oh5VarB.l(pluginGeneratedSerialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    iL2 = oh5VarB.l(pluginGeneratedSerialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    iL3 = oh5VarB.l(pluginGeneratedSerialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    iL4 = oh5VarB.l(pluginGeneratedSerialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    jG = oh5VarB.g(pluginGeneratedSerialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    zapVar = (zap) oh5VarB.z(pluginGeneratedSerialDescriptor, 5, xap.a);
                    i |= 32;
                    break;
                case 6:
                    zapVar2 = (zap) oh5VarB.m(pluginGeneratedSerialDescriptor, 6, xap.a);
                    i |= 64;
                    break;
                case 7:
                    iL5 = oh5VarB.l(pluginGeneratedSerialDescriptor, 7);
                    i |= ResourceQualifiers.Qualifier.AnonymousClass5.SCREENLAYOUT_LAYOUTDIR_RTL;
                    break;
                case 8:
                    iL6 = oh5VarB.l(pluginGeneratedSerialDescriptor, 8);
                    i |= Constants.Crypt.KEY_LENGTH;
                    break;
                case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                    str = (String) oh5VarB.m(pluginGeneratedSerialDescriptor, 9, xhk.a);
                    i |= 512;
                    break;
                case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                    zC = oh5VarB.C(pluginGeneratedSerialDescriptor, 10);
                    i |= 1024;
                    break;
                case 11:
                    jG2 = oh5VarB.g(pluginGeneratedSerialDescriptor, 11);
                    i |= 2048;
                    break;
                default:
                    t3p.d(iP);
                    return null;
            }
        }
        oh5VarB.c(pluginGeneratedSerialDescriptor);
        return new wjp(i, iL, iL2, iL3, iL4, jG, zapVar, zapVar2, iL5, iL6, str, zC, jG2);
    }

    public final SerialDescriptor getDescriptor() {
        return b;
    }

    public final void serialize(Encoder encoder, Object obj) {
        wjp wjpVar = (wjp) obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
        ph5 ph5VarB = encoder.b(pluginGeneratedSerialDescriptor);
        int i = wjpVar.a;
        String str = wjpVar.j;
        zap zapVar = wjpVar.g;
        ph5VarB.v(0, i, pluginGeneratedSerialDescriptor);
        ph5VarB.v(1, wjpVar.b, pluginGeneratedSerialDescriptor);
        ph5VarB.v(2, wjpVar.c, pluginGeneratedSerialDescriptor);
        ph5VarB.v(3, wjpVar.d, pluginGeneratedSerialDescriptor);
        ph5VarB.F(pluginGeneratedSerialDescriptor, 4, wjpVar.e);
        xap xapVar = xap.a;
        ph5VarB.f(pluginGeneratedSerialDescriptor, 5, xapVar, wjpVar.f);
        if (ph5VarB.E() || zapVar != null) {
            ph5VarB.j(pluginGeneratedSerialDescriptor, 6, xapVar, zapVar);
        }
        ph5VarB.v(7, wjpVar.h, pluginGeneratedSerialDescriptor);
        ph5VarB.v(8, wjpVar.i, pluginGeneratedSerialDescriptor);
        if (ph5VarB.E() || str != null) {
            ph5VarB.j(pluginGeneratedSerialDescriptor, 9, xhk.a, str);
        }
        if (ph5VarB.E() || wjpVar.k) {
            ph5VarB.y(pluginGeneratedSerialDescriptor, 10, wjpVar.k);
        }
        if (ph5VarB.E() || wjpVar.l != -1) {
            ph5VarB.F(pluginGeneratedSerialDescriptor, 11, wjpVar.l);
        }
        ph5VarB.c(pluginGeneratedSerialDescriptor);
    }

    public final KSerializer[] typeParametersSerializers() {
        return o0g.c;
    }
}
