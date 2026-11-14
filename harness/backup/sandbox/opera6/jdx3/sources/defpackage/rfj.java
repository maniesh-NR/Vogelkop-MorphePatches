package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final /* synthetic */ class rfj implements iv9 {
    public static final rfj a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        rfj rfjVar = new rfj();
        a = rfjVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.opera.android.aiassistant.api.ShodanApi.Thumbnails", rfjVar, 3);
        pluginGeneratedSerialDescriptor.k("small", true);
        pluginGeneratedSerialDescriptor.k("medium", true);
        pluginGeneratedSerialDescriptor.k("large", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    public final KSerializer[] childSerializers() {
        xhk xhkVar = xhk.a;
        return new KSerializer[]{f03.B(xhkVar), f03.B(xhkVar), f03.B(xhkVar)};
    }

    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        oh5 oh5VarB = decoder.b(serialDescriptor);
        boolean z = true;
        int i = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        while (z) {
            int iP = oh5VarB.p(serialDescriptor);
            if (iP == -1) {
                z = false;
            } else if (iP == 0) {
                str = (String) oh5VarB.m(serialDescriptor, 0, xhk.a);
                i |= 1;
            } else if (iP == 1) {
                str2 = (String) oh5VarB.m(serialDescriptor, 1, xhk.a);
                i |= 2;
            } else {
                if (iP != 2) {
                    t3p.d(iP);
                    return null;
                }
                str3 = (String) oh5VarB.m(serialDescriptor, 2, xhk.a);
                i |= 4;
            }
        }
        oh5VarB.c(serialDescriptor);
        return new tfj(i, str, str2, str3);
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public final void serialize(Encoder encoder, Object obj) {
        tfj tfjVar = (tfj) obj;
        SerialDescriptor serialDescriptor = descriptor;
        ph5 ph5VarB = encoder.b(serialDescriptor);
        if (ph5VarB.E() || tfjVar.a != null) {
            ph5VarB.j(serialDescriptor, 0, xhk.a, tfjVar.a);
        }
        if (ph5VarB.E() || tfjVar.b != null) {
            ph5VarB.j(serialDescriptor, 1, xhk.a, tfjVar.b);
        }
        if (ph5VarB.E() || tfjVar.c != null) {
            ph5VarB.j(serialDescriptor, 2, xhk.a, tfjVar.c);
        }
        ph5VarB.c(serialDescriptor);
    }
}
