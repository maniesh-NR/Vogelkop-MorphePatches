package defpackage;

import com.google.android.gms.common.internal.ImagesContract;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes.dex */
public final class mep implements iv9 {
    public static final mep a;
    public static final /* synthetic */ PluginGeneratedSerialDescriptor b;

    static {
        mep mepVar = new mep();
        a = mepVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.opera.ads.internal.analytics.WebViewRenderProcessGoneEvent", mepVar, 3);
        pluginGeneratedSerialDescriptor.k(ImagesContract.URL, false);
        pluginGeneratedSerialDescriptor.k("didCrash", false);
        pluginGeneratedSerialDescriptor.k("rendererPriority", false);
        b = pluginGeneratedSerialDescriptor;
    }

    public final KSerializer[] childSerializers() {
        return new KSerializer[]{f03.B(xhk.a), rn3.a, ecb.a};
    }

    public final Object deserialize(Decoder decoder) {
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
        oh5 oh5VarB = decoder.b(pluginGeneratedSerialDescriptor);
        boolean z = true;
        int i = 0;
        boolean zC = false;
        int iL = 0;
        String str = null;
        while (z) {
            int iP = oh5VarB.p(pluginGeneratedSerialDescriptor);
            if (iP == -1) {
                z = false;
            } else if (iP == 0) {
                str = (String) oh5VarB.m(pluginGeneratedSerialDescriptor, 0, xhk.a);
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
        return new qep(i, iL, str, zC);
    }

    public final SerialDescriptor getDescriptor() {
        return b;
    }

    public final void serialize(Encoder encoder, Object obj) {
        qep qepVar = (qep) obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
        ph5 ph5VarB = encoder.b(pluginGeneratedSerialDescriptor);
        nep nepVar = qep.Companion;
        ph5VarB.j(pluginGeneratedSerialDescriptor, 0, xhk.a, qepVar.g);
        ph5VarB.y(pluginGeneratedSerialDescriptor, 1, qepVar.h);
        ph5VarB.v(2, qepVar.i, pluginGeneratedSerialDescriptor);
        ph5VarB.c(pluginGeneratedSerialDescriptor);
    }

    public final KSerializer[] typeParametersSerializers() {
        return o0g.c;
    }
}
