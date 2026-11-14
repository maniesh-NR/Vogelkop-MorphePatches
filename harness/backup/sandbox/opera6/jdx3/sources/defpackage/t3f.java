package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final /* synthetic */ class t3f implements iv9 {
    public static final t3f a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        t3f t3fVar = new t3f();
        a = t3fVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.opera.android.ntp.NtpResponse", t3fVar, 5);
        pluginGeneratedSerialDescriptor.k("requestId", false);
        pluginGeneratedSerialDescriptor.k("requestOrigin", false);
        pluginGeneratedSerialDescriptor.k("requestEpochMilliseconds", false);
        pluginGeneratedSerialDescriptor.k("serverEpochMilliseconds", false);
        pluginGeneratedSerialDescriptor.k("ntp", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final KSerializer[] childSerializers() {
        l4c[] l4cVarArr = v3f.f;
        h1d h1dVar = h1d.a;
        return new KSerializer[]{xhk.a, l4cVarArr[1].getValue(), h1dVar, h1dVar, k3f.a};
    }

    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        oh5 oh5VarB = decoder.b(serialDescriptor);
        l4c[] l4cVarArr = v3f.f;
        int i = 0;
        String strO = null;
        swh swhVar = null;
        m3f m3fVar = null;
        long jG = 0;
        long jG2 = 0;
        boolean z = true;
        while (z) {
            int iP = oh5VarB.p(serialDescriptor);
            if (iP == -1) {
                z = false;
            } else if (iP == 0) {
                strO = oh5VarB.o(serialDescriptor, 0);
                i |= 1;
            } else if (iP == 1) {
                swhVar = (swh) oh5VarB.z(serialDescriptor, 1, (KSerializer) l4cVarArr[1].getValue());
                i |= 2;
            } else if (iP == 2) {
                jG = oh5VarB.g(serialDescriptor, 2);
                i |= 4;
            } else if (iP == 3) {
                jG2 = oh5VarB.g(serialDescriptor, 3);
                i |= 8;
            } else {
                if (iP != 4) {
                    t3p.d(iP);
                    return null;
                }
                m3fVar = (m3f) oh5VarB.z(serialDescriptor, 4, k3f.a);
                i |= 16;
            }
        }
        oh5VarB.c(serialDescriptor);
        return new v3f(i, strO, swhVar, jG, jG2, m3fVar);
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public final void serialize(Encoder encoder, Object obj) {
        v3f v3fVar = (v3f) obj;
        SerialDescriptor serialDescriptor = descriptor;
        ph5 ph5VarB = encoder.b(serialDescriptor);
        l4c[] l4cVarArr = v3f.f;
        ph5VarB.z(serialDescriptor, 0, v3fVar.a);
        ph5VarB.f(serialDescriptor, 1, (KSerializer) l4cVarArr[1].getValue(), v3fVar.b);
        ph5VarB.F(serialDescriptor, 2, v3fVar.c);
        ph5VarB.F(serialDescriptor, 3, v3fVar.d);
        ph5VarB.f(serialDescriptor, 4, k3f.a, v3fVar.e);
        ph5VarB.c(serialDescriptor);
    }
}
