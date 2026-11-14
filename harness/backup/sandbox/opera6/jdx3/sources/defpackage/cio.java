package defpackage;

import com.leanplum.internal.Constants;
import com.leanplum.internal.RequestBuilder;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes.dex */
public final class cio implements iv9 {
    public static final cio a;
    public static final /* synthetic */ PluginGeneratedSerialDescriptor b;

    static {
        cio cioVar = new cio();
        a = cioVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.opera.ads.internal.data.AdData.RewardedExt", cioVar, 5);
        pluginGeneratedSerialDescriptor.k("orientation", true);
        pluginGeneratedSerialDescriptor.k(Constants.Params.TYPE, true);
        pluginGeneratedSerialDescriptor.k("amount", true);
        pluginGeneratedSerialDescriptor.k("rwid", true);
        pluginGeneratedSerialDescriptor.k(RequestBuilder.ACTION_TRACK, true);
        b = pluginGeneratedSerialDescriptor;
    }

    public final KSerializer[] childSerializers() {
        KSerializer kSerializer = ecb.a;
        xhk xhkVar = xhk.a;
        return new KSerializer[]{kSerializer, f03.B(xhkVar), f03.B(kSerializer), f03.B(xhkVar), f03.B(xhkVar)};
    }

    public final Object deserialize(Decoder decoder) {
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
        oh5 oh5VarB = decoder.b(pluginGeneratedSerialDescriptor);
        boolean z = true;
        int i = 0;
        int iL = 0;
        String str = null;
        Integer num = null;
        String str2 = null;
        String str3 = null;
        while (z) {
            int iP = oh5VarB.p(pluginGeneratedSerialDescriptor);
            if (iP == -1) {
                z = false;
            } else if (iP == 0) {
                iL = oh5VarB.l(pluginGeneratedSerialDescriptor, 0);
                i |= 1;
            } else if (iP == 1) {
                str = (String) oh5VarB.m(pluginGeneratedSerialDescriptor, 1, xhk.a);
                i |= 2;
            } else if (iP == 2) {
                num = (Integer) oh5VarB.m(pluginGeneratedSerialDescriptor, 2, ecb.a);
                i |= 4;
            } else if (iP == 3) {
                str2 = (String) oh5VarB.m(pluginGeneratedSerialDescriptor, 3, xhk.a);
                i |= 8;
            } else {
                if (iP != 4) {
                    t3p.d(iP);
                    return null;
                }
                str3 = (String) oh5VarB.m(pluginGeneratedSerialDescriptor, 4, xhk.a);
                i |= 16;
            }
        }
        oh5VarB.c(pluginGeneratedSerialDescriptor);
        return new eio(i, iL, str, num, str2, str3);
    }

    public final SerialDescriptor getDescriptor() {
        return b;
    }

    public final void serialize(Encoder encoder, Object obj) {
        eio eioVar = (eio) obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
        ph5 ph5VarB = encoder.b(pluginGeneratedSerialDescriptor);
        if (ph5VarB.E() || eioVar.a != 0) {
            ph5VarB.v(0, eioVar.a, pluginGeneratedSerialDescriptor);
        }
        if (ph5VarB.E() || eioVar.b != null) {
            ph5VarB.j(pluginGeneratedSerialDescriptor, 1, xhk.a, eioVar.b);
        }
        if (ph5VarB.E() || eioVar.c != null) {
            ph5VarB.j(pluginGeneratedSerialDescriptor, 2, ecb.a, eioVar.c);
        }
        if (ph5VarB.E() || eioVar.d != null) {
            ph5VarB.j(pluginGeneratedSerialDescriptor, 3, xhk.a, eioVar.d);
        }
        if (ph5VarB.E() || eioVar.e != null) {
            ph5VarB.j(pluginGeneratedSerialDescriptor, 4, xhk.a, eioVar.e);
        }
        ph5VarB.c(pluginGeneratedSerialDescriptor);
    }

    public final KSerializer[] typeParametersSerializers() {
        return o0g.c;
    }
}
