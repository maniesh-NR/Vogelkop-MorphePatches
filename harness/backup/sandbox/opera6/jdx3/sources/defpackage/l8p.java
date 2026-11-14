package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes.dex */
public final class l8p implements iv9 {
    public static final l8p a;
    public static final /* synthetic */ PluginGeneratedSerialDescriptor b;

    static {
        l8p l8pVar = new l8p();
        a = l8pVar;
        b = new PluginGeneratedSerialDescriptor("com.opera.ads.internal.analytics.TrackEventImpl.WebViewVmEventImpl", l8pVar, 0);
    }

    public final KSerializer[] childSerializers() {
        return new KSerializer[0];
    }

    public final Object deserialize(Decoder decoder) {
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
        oh5 oh5VarB = decoder.b(pluginGeneratedSerialDescriptor);
        int iP = oh5VarB.p(pluginGeneratedSerialDescriptor);
        if (iP == -1) {
            oh5VarB.c(pluginGeneratedSerialDescriptor);
            return new n8p();
        }
        t3p.d(iP);
        return null;
    }

    public final SerialDescriptor getDescriptor() {
        return b;
    }

    public final void serialize(Encoder encoder, Object obj) {
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
        ph5 ph5VarB = encoder.b(pluginGeneratedSerialDescriptor);
        m8p m8pVar = n8p.Companion;
        ph5VarB.c(pluginGeneratedSerialDescriptor);
    }

    public final KSerializer[] typeParametersSerializers() {
        return o0g.c;
    }
}
