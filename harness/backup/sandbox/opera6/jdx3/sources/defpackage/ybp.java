package defpackage;

import com.google.android.gms.common.internal.ImagesContract;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes.dex */
public final class ybp implements iv9 {
    public static final ybp a;
    public static final /* synthetic */ PluginGeneratedSerialDescriptor b;

    static {
        ybp ybpVar = new ybp();
        a = ybpVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.opera.ads.internal.analytics.WebViewReceivedError", ybpVar, 3);
        pluginGeneratedSerialDescriptor.k(ImagesContract.URL, false);
        pluginGeneratedSerialDescriptor.k("mainFrame", false);
        pluginGeneratedSerialDescriptor.k("errorCode", false);
        b = pluginGeneratedSerialDescriptor;
    }

    public final KSerializer[] childSerializers() {
        return new KSerializer[]{xhk.a, rn3.a, ecb.a};
    }

    public final Object deserialize(Decoder decoder) {
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
        oh5 oh5VarB = decoder.b(pluginGeneratedSerialDescriptor);
        boolean z = true;
        int i = 0;
        boolean zC = false;
        int iL = 0;
        String strO = null;
        while (z) {
            int iP = oh5VarB.p(pluginGeneratedSerialDescriptor);
            if (iP == -1) {
                z = false;
            } else if (iP == 0) {
                strO = oh5VarB.o(pluginGeneratedSerialDescriptor, 0);
                i |= 1;
            } else if (iP == 1) {
                zC = oh5VarB.C(pluginGeneratedSerialDescriptor, 1);
                i |= 2;
            } else {
                if (iP != 2) {
                    t3p.d(iP);
                    return null;
                }
                iL = oh5VarB.l(pluginGeneratedSerialDescriptor, 2);
                i |= 4;
            }
        }
        oh5VarB.c(pluginGeneratedSerialDescriptor);
        return new acp(i, iL, strO, zC);
    }

    public final SerialDescriptor getDescriptor() {
        return b;
    }

    public final void serialize(Encoder encoder, Object obj) {
        acp acpVar = (acp) obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
        ph5 ph5VarB = encoder.b(pluginGeneratedSerialDescriptor);
        ph5VarB.z(pluginGeneratedSerialDescriptor, 0, acpVar.g);
        ph5VarB.y(pluginGeneratedSerialDescriptor, 1, acpVar.h);
        ph5VarB.v(2, acpVar.i, pluginGeneratedSerialDescriptor);
        ph5VarB.c(pluginGeneratedSerialDescriptor);
    }

    public final KSerializer[] typeParametersSerializers() {
        return o0g.c;
    }
}
