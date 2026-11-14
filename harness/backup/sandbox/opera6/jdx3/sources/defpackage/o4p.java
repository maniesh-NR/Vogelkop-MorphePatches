package defpackage;

import com.google.android.gms.common.internal.ImagesContract;
import com.leanplum.internal.Constants;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes.dex */
public final class o4p implements iv9 {
    public static final o4p a;
    public static final /* synthetic */ PluginGeneratedSerialDescriptor b;

    static {
        o4p o4pVar = new o4p();
        a = o4pVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.opera.ads.internal.data.NativeAdm.Image", o4pVar, 4);
        pluginGeneratedSerialDescriptor.k(Constants.Params.TYPE, true);
        pluginGeneratedSerialDescriptor.k(ImagesContract.URL, false);
        pluginGeneratedSerialDescriptor.k("w", true);
        pluginGeneratedSerialDescriptor.k("h", true);
        b = pluginGeneratedSerialDescriptor;
    }

    public final KSerializer[] childSerializers() {
        ecb ecbVar = ecb.a;
        return new KSerializer[]{f03.B(ecbVar), xhk.a, f03.B(ecbVar), f03.B(ecbVar)};
    }

    public final Object deserialize(Decoder decoder) {
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
        oh5 oh5VarB = decoder.b(pluginGeneratedSerialDescriptor);
        boolean z = true;
        int i = 0;
        Integer num = null;
        String strO = null;
        Integer num2 = null;
        Integer num3 = null;
        while (z) {
            int iP = oh5VarB.p(pluginGeneratedSerialDescriptor);
            if (iP == -1) {
                z = false;
            } else if (iP == 0) {
                num = (Integer) oh5VarB.m(pluginGeneratedSerialDescriptor, 0, ecb.a);
                i |= 1;
            } else if (iP == 1) {
                strO = oh5VarB.o(pluginGeneratedSerialDescriptor, 1);
                i |= 2;
            } else if (iP == 2) {
                num2 = (Integer) oh5VarB.m(pluginGeneratedSerialDescriptor, 2, ecb.a);
                i |= 4;
            } else {
                if (iP != 3) {
                    t3p.d(iP);
                    return null;
                }
                num3 = (Integer) oh5VarB.m(pluginGeneratedSerialDescriptor, 3, ecb.a);
                i |= 8;
            }
        }
        oh5VarB.c(pluginGeneratedSerialDescriptor);
        return new q4p(i, num, strO, num2, num3);
    }

    public final SerialDescriptor getDescriptor() {
        return b;
    }

    public final void serialize(Encoder encoder, Object obj) {
        Integer num;
        q4p q4pVar = (q4p) obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
        ph5 ph5VarB = encoder.b(pluginGeneratedSerialDescriptor);
        if (ph5VarB.E() || (num = q4pVar.a) == null || num.intValue() != 0) {
            ph5VarB.j(pluginGeneratedSerialDescriptor, 0, ecb.a, q4pVar.a);
        }
        String str = q4pVar.b;
        Integer num2 = q4pVar.d;
        Integer num3 = q4pVar.c;
        ph5VarB.z(pluginGeneratedSerialDescriptor, 1, str);
        if (ph5VarB.E() || num3 == null || num3.intValue() != 0) {
            ph5VarB.j(pluginGeneratedSerialDescriptor, 2, ecb.a, num3);
        }
        if (ph5VarB.E() || num2 == null || num2.intValue() != 0) {
            ph5VarB.j(pluginGeneratedSerialDescriptor, 3, ecb.a, num2);
        }
        ph5VarB.c(pluginGeneratedSerialDescriptor);
    }

    public final KSerializer[] typeParametersSerializers() {
        return o0g.c;
    }
}
