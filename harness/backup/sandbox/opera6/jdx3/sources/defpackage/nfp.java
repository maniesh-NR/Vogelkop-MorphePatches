package defpackage;

import com.google.android.gms.common.internal.ImagesContract;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes.dex */
public final class nfp implements iv9 {
    public static final nfp a;
    public static final /* synthetic */ PluginGeneratedSerialDescriptor b;

    static {
        nfp nfpVar = new nfp();
        a = nfpVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.opera.ads.internal.analytics.WebViewRenderProcessUnresponsiveEvent", nfpVar, 1);
        pluginGeneratedSerialDescriptor.k(ImagesContract.URL, false);
        b = pluginGeneratedSerialDescriptor;
    }

    public final KSerializer[] childSerializers() {
        return new KSerializer[]{f03.B(xhk.a)};
    }

    public final Object deserialize(Decoder decoder) {
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
        oh5 oh5VarB = decoder.b(pluginGeneratedSerialDescriptor);
        boolean z = true;
        int i = 0;
        String str = null;
        while (z) {
            int iP = oh5VarB.p(pluginGeneratedSerialDescriptor);
            if (iP == -1) {
                z = false;
            } else {
                if (iP != 0) {
                    t3p.d(iP);
                    return null;
                }
                str = (String) oh5VarB.m(pluginGeneratedSerialDescriptor, 0, xhk.a);
                i = 1;
            }
        }
        oh5VarB.c(pluginGeneratedSerialDescriptor);
        return new qfp(i, str);
    }

    public final SerialDescriptor getDescriptor() {
        return b;
    }

    public final void serialize(Encoder encoder, Object obj) {
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
        ph5 ph5VarB = encoder.b(pluginGeneratedSerialDescriptor);
        ofp ofpVar = qfp.Companion;
        ph5VarB.j(pluginGeneratedSerialDescriptor, 0, xhk.a, ((qfp) obj).g);
        ph5VarB.c(pluginGeneratedSerialDescriptor);
    }

    public final KSerializer[] typeParametersSerializers() {
        return o0g.c;
    }
}
