package defpackage;

import com.google.android.gms.common.internal.ImagesContract;
import com.leanplum.internal.Constants;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes.dex */
public final class v4p implements iv9 {
    public static final v4p a;
    public static final /* synthetic */ PluginGeneratedSerialDescriptor b;

    static {
        v4p v4pVar = new v4p();
        a = v4pVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.opera.ads.internal.data.NativeAdm.ImpressionTracker", v4pVar, 3);
        pluginGeneratedSerialDescriptor.k(Constants.Params.EVENT, false);
        pluginGeneratedSerialDescriptor.k("method", false);
        pluginGeneratedSerialDescriptor.k(ImagesContract.URL, false);
        b = pluginGeneratedSerialDescriptor;
    }

    public final KSerializer[] childSerializers() {
        ecb ecbVar = ecb.a;
        return new KSerializer[]{ecbVar, ecbVar, xhk.a};
    }

    public final Object deserialize(Decoder decoder) {
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
        oh5 oh5VarB = decoder.b(pluginGeneratedSerialDescriptor);
        boolean z = true;
        int i = 0;
        int iL = 0;
        int iL2 = 0;
        String strO = null;
        while (z) {
            int iP = oh5VarB.p(pluginGeneratedSerialDescriptor);
            if (iP == -1) {
                z = false;
            } else if (iP == 0) {
                iL = oh5VarB.l(pluginGeneratedSerialDescriptor, 0);
                i |= 1;
            } else if (iP == 1) {
                iL2 = oh5VarB.l(pluginGeneratedSerialDescriptor, 1);
                i |= 2;
            } else {
                if (iP != 2) {
                    t3p.d(iP);
                    return null;
                }
                strO = oh5VarB.o(pluginGeneratedSerialDescriptor, 2);
                i |= 4;
            }
        }
        oh5VarB.c(pluginGeneratedSerialDescriptor);
        return new x4p(i, iL, iL2, strO);
    }

    public final SerialDescriptor getDescriptor() {
        return b;
    }

    public final void serialize(Encoder encoder, Object obj) {
        x4p x4pVar = (x4p) obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
        ph5 ph5VarB = encoder.b(pluginGeneratedSerialDescriptor);
        ph5VarB.v(0, x4pVar.a, pluginGeneratedSerialDescriptor);
        ph5VarB.v(1, x4pVar.b, pluginGeneratedSerialDescriptor);
        ph5VarB.z(pluginGeneratedSerialDescriptor, 2, x4pVar.c);
        ph5VarB.c(pluginGeneratedSerialDescriptor);
    }

    public final KSerializer[] typeParametersSerializers() {
        return o0g.c;
    }
}
