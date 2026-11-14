package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final /* synthetic */ class v1d implements iv9 {
    public static final v1d a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        v1d v1dVar = new v1d();
        a = v1dVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.opera.celopay.model.registration.LookupResponse", v1dVar, 2);
        pluginGeneratedSerialDescriptor.k("address", false);
        pluginGeneratedSerialDescriptor.k("publishedOn", false);
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
        return new x1d(i, jG, strO);
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public final void serialize(Encoder encoder, Object obj) {
        x1d x1dVar = (x1d) obj;
        SerialDescriptor serialDescriptor = descriptor;
        ph5 ph5VarB = encoder.b(serialDescriptor);
        ph5VarB.z(serialDescriptor, 0, x1dVar.a);
        ph5VarB.F(serialDescriptor, 1, x1dVar.b);
        ph5VarB.c(serialDescriptor);
    }
}
