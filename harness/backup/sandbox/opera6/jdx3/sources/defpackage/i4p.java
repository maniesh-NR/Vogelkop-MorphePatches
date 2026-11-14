package defpackage;

import com.leanplum.internal.Constants;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes.dex */
public final class i4p implements iv9 {
    public static final i4p a;
    public static final /* synthetic */ PluginGeneratedSerialDescriptor b;

    static {
        i4p i4pVar = new i4p();
        a = i4pVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.opera.ads.internal.data.NativeAdm.Data", i4pVar, 2);
        pluginGeneratedSerialDescriptor.k(Constants.Params.TYPE, true);
        pluginGeneratedSerialDescriptor.k(Constants.Params.VALUE, false);
        b = pluginGeneratedSerialDescriptor;
    }

    public final KSerializer[] childSerializers() {
        return new KSerializer[]{f03.B(ecb.a), xhk.a};
    }

    public final Object deserialize(Decoder decoder) {
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
        oh5 oh5VarB = decoder.b(pluginGeneratedSerialDescriptor);
        boolean z = true;
        int i = 0;
        Integer num = null;
        String strO = null;
        while (z) {
            int iP = oh5VarB.p(pluginGeneratedSerialDescriptor);
            if (iP == -1) {
                z = false;
            } else if (iP == 0) {
                num = (Integer) oh5VarB.m(pluginGeneratedSerialDescriptor, 0, ecb.a);
                i |= 1;
            } else {
                if (iP != 1) {
                    t3p.d(iP);
                    return null;
                }
                strO = oh5VarB.o(pluginGeneratedSerialDescriptor, 1);
                i |= 2;
            }
        }
        oh5VarB.c(pluginGeneratedSerialDescriptor);
        return new k4p(i, strO, num);
    }

    public final SerialDescriptor getDescriptor() {
        return b;
    }

    public final void serialize(Encoder encoder, Object obj) {
        Integer num;
        k4p k4pVar = (k4p) obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
        ph5 ph5VarB = encoder.b(pluginGeneratedSerialDescriptor);
        if (ph5VarB.E() || (num = k4pVar.a) == null || num.intValue() != 0) {
            ph5VarB.j(pluginGeneratedSerialDescriptor, 0, ecb.a, k4pVar.a);
        }
        ph5VarB.z(pluginGeneratedSerialDescriptor, 1, k4pVar.b);
        ph5VarB.c(pluginGeneratedSerialDescriptor);
    }

    public final KSerializer[] typeParametersSerializers() {
        return o0g.c;
    }
}
