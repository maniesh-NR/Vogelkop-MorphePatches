package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final /* synthetic */ class jgj implements iv9 {
    public static final jgj a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        jgj jgjVar = new jgj();
        a = jgjVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.opera.android.aiassistant.api.ShodanApiImpl.ErrorDetail", jgjVar, 1);
        pluginGeneratedSerialDescriptor.k("detail", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    public final KSerializer[] childSerializers() {
        return new KSerializer[]{xhk.a};
    }

    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        oh5 oh5VarB = decoder.b(serialDescriptor);
        boolean z = true;
        int i = 0;
        String strO = null;
        while (z) {
            int iP = oh5VarB.p(serialDescriptor);
            if (iP == -1) {
                z = false;
            } else {
                if (iP != 0) {
                    t3p.d(iP);
                    return null;
                }
                strO = oh5VarB.o(serialDescriptor, 0);
                i = 1;
            }
        }
        oh5VarB.c(serialDescriptor);
        return new lgj(i, strO);
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public final void serialize(Encoder encoder, Object obj) {
        SerialDescriptor serialDescriptor = descriptor;
        ph5 ph5VarB = encoder.b(serialDescriptor);
        ph5VarB.z(serialDescriptor, 0, ((lgj) obj).a);
        ph5VarB.c(serialDescriptor);
    }
}
