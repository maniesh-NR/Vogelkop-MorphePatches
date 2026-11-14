package defpackage;

import com.leanplum.internal.Constants;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes.dex */
public final class mto implements iv9 {
    public static final mto a;
    public static final /* synthetic */ PluginGeneratedSerialDescriptor b;

    static {
        mto mtoVar = new mto();
        a = mtoVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.opera.ads.internal.data.AppObject", mtoVar, 7);
        pluginGeneratedSerialDescriptor.k("id", false);
        pluginGeneratedSerialDescriptor.k(Constants.Params.NAME, false);
        pluginGeneratedSerialDescriptor.k("bundle", false);
        pluginGeneratedSerialDescriptor.k("ver", false);
        pluginGeneratedSerialDescriptor.k("privacypolicy", true);
        pluginGeneratedSerialDescriptor.k("publisher", false);
        pluginGeneratedSerialDescriptor.k("ext", false);
        b = pluginGeneratedSerialDescriptor;
    }

    public final KSerializer[] childSerializers() {
        KSerializer kSerializerB = f03.B(oto.a);
        xhk xhkVar = xhk.a;
        return new KSerializer[]{xhkVar, xhkVar, xhkVar, xhkVar, ecb.a, vto.a, kSerializerB};
    }

    public final Object deserialize(Decoder decoder) {
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
        oh5 oh5VarB = decoder.b(pluginGeneratedSerialDescriptor);
        boolean z = true;
        int i = 0;
        int iL = 0;
        String strO = null;
        String strO2 = null;
        String strO3 = null;
        String strO4 = null;
        xto xtoVar = null;
        rto rtoVar = null;
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
                    strO4 = oh5VarB.o(pluginGeneratedSerialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    iL = oh5VarB.l(pluginGeneratedSerialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    xtoVar = (xto) oh5VarB.z(pluginGeneratedSerialDescriptor, 5, vto.a);
                    i |= 32;
                    break;
                case 6:
                    rtoVar = (rto) oh5VarB.m(pluginGeneratedSerialDescriptor, 6, oto.a);
                    i |= 64;
                    break;
                default:
                    t3p.d(iP);
                    return null;
            }
        }
        oh5VarB.c(pluginGeneratedSerialDescriptor);
        return new huo(i, strO, strO2, strO3, strO4, iL, xtoVar, rtoVar);
    }

    public final SerialDescriptor getDescriptor() {
        return b;
    }

    public final void serialize(Encoder encoder, Object obj) {
        huo huoVar = (huo) obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
        ph5 ph5VarB = encoder.b(pluginGeneratedSerialDescriptor);
        String str = huoVar.a;
        int i = huoVar.e;
        ph5VarB.z(pluginGeneratedSerialDescriptor, 0, str);
        ph5VarB.z(pluginGeneratedSerialDescriptor, 1, huoVar.b);
        ph5VarB.z(pluginGeneratedSerialDescriptor, 2, huoVar.c);
        ph5VarB.z(pluginGeneratedSerialDescriptor, 3, huoVar.d);
        if (ph5VarB.E() || i != 1) {
            ph5VarB.v(4, i, pluginGeneratedSerialDescriptor);
        }
        ph5VarB.f(pluginGeneratedSerialDescriptor, 5, vto.a, huoVar.f);
        ph5VarB.j(pluginGeneratedSerialDescriptor, 6, oto.a, huoVar.g);
        ph5VarB.c(pluginGeneratedSerialDescriptor);
    }

    public final KSerializer[] typeParametersSerializers() {
        return o0g.c;
    }
}
