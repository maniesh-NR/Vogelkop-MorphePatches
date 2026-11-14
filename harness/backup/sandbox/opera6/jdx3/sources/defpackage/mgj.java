package defpackage;

import com.leanplum.internal.Constants;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final /* synthetic */ class mgj implements iv9 {
    public static final mgj a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        mgj mgjVar = new mgj();
        a = mgjVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.opera.android.aiassistant.api.ShodanApiImpl.FilesUploadRequest", mgjVar, 2);
        pluginGeneratedSerialDescriptor.k("mimetype", false);
        pluginGeneratedSerialDescriptor.k(Constants.Keys.SIZE, false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    public final KSerializer[] childSerializers() {
        return new KSerializer[]{xhk.a, h1d.a};
    }

    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        oh5 oh5VarB = decoder.b(serialDescriptor);
        long jG = 0;
        boolean z = true;
        int i = 0;
        String strO = null;
        while (z) {
            int iP = oh5VarB.p(serialDescriptor);
            if (iP == -1) {
                z = false;
            } else if (iP == 0) {
                strO = oh5VarB.o(serialDescriptor, 0);
                i |= 1;
            } else {
                if (iP != 1) {
                    t3p.d(iP);
                    return null;
                }
                jG = oh5VarB.g(serialDescriptor, 1);
                i |= 2;
            }
        }
        oh5VarB.c(serialDescriptor);
        return new ogj(i, jG, strO);
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public final void serialize(Encoder encoder, Object obj) {
        ogj ogjVar = (ogj) obj;
        SerialDescriptor serialDescriptor = descriptor;
        ph5 ph5VarB = encoder.b(serialDescriptor);
        ph5VarB.z(serialDescriptor, 0, ogjVar.a);
        ph5VarB.F(serialDescriptor, 1, ogjVar.b);
        ph5VarB.c(serialDescriptor);
    }
}
