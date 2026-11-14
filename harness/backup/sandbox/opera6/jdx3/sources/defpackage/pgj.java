package defpackage;

import com.google.android.gms.common.internal.ImagesContract;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final /* synthetic */ class pgj implements iv9 {
    public static final pgj a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        pgj pgjVar = new pgj();
        a = pgjVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.opera.android.aiassistant.api.ShodanApiImpl.PostWebpageContentQuery", pgjVar, 4);
        pluginGeneratedSerialDescriptor.k(ImagesContract.URL, false);
        pluginGeneratedSerialDescriptor.k("title", false);
        pluginGeneratedSerialDescriptor.k("content", false);
        pluginGeneratedSerialDescriptor.k("encryption", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    public final KSerializer[] childSerializers() {
        xhk xhkVar = xhk.a;
        return new KSerializer[]{xhkVar, xhkVar, xhkVar, ggj.a};
    }

    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        oh5 oh5VarB = decoder.b(serialDescriptor);
        boolean z = true;
        int i = 0;
        String strO = null;
        String strO2 = null;
        String strO3 = null;
        igj igjVar = null;
        while (z) {
            int iP = oh5VarB.p(serialDescriptor);
            if (iP == -1) {
                z = false;
            } else if (iP == 0) {
                strO = oh5VarB.o(serialDescriptor, 0);
                i |= 1;
            } else if (iP == 1) {
                strO2 = oh5VarB.o(serialDescriptor, 1);
                i |= 2;
            } else if (iP == 2) {
                strO3 = oh5VarB.o(serialDescriptor, 2);
                i |= 4;
            } else {
                if (iP != 3) {
                    t3p.d(iP);
                    return null;
                }
                igjVar = (igj) oh5VarB.z(serialDescriptor, 3, ggj.a);
                i |= 8;
            }
        }
        oh5VarB.c(serialDescriptor);
        return new rgj(i, strO, strO2, strO3, igjVar);
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public final void serialize(Encoder encoder, Object obj) {
        rgj rgjVar = (rgj) obj;
        SerialDescriptor serialDescriptor = descriptor;
        ph5 ph5VarB = encoder.b(serialDescriptor);
        ph5VarB.z(serialDescriptor, 0, rgjVar.a);
        ph5VarB.z(serialDescriptor, 1, rgjVar.b);
        ph5VarB.z(serialDescriptor, 2, rgjVar.c);
        ph5VarB.f(serialDescriptor, 3, ggj.a, rgjVar.d);
        ph5VarB.c(serialDescriptor);
    }
}
