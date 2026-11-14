package defpackage;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final /* synthetic */ class k3f implements iv9 {
    public static final k3f a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        k3f k3fVar = new k3f();
        a = k3fVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.opera.android.ntp.NtpConfiguration", k3fVar, 2);
        pluginGeneratedSerialDescriptor.k("paid", true);
        pluginGeneratedSerialDescriptor.k("oao", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    public final KSerializer[] childSerializers() {
        h3f h3fVar = h3f.a;
        return new KSerializer[]{h3fVar, h3fVar};
    }

    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        oh5 oh5VarB = decoder.b(serialDescriptor);
        boolean z = true;
        int i = 0;
        j3f j3fVar = null;
        j3f j3fVar2 = null;
        while (z) {
            int iP = oh5VarB.p(serialDescriptor);
            if (iP == -1) {
                z = false;
            } else if (iP == 0) {
                j3fVar = (j3f) oh5VarB.z(serialDescriptor, 0, h3f.a);
                i |= 1;
            } else {
                if (iP != 1) {
                    t3p.d(iP);
                    return null;
                }
                j3fVar2 = (j3f) oh5VarB.z(serialDescriptor, 1, h3f.a);
                i |= 2;
            }
        }
        oh5VarB.c(serialDescriptor);
        return new m3f(i, j3fVar, j3fVar2);
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public final void serialize(Encoder encoder, Object obj) {
        m3f m3fVar = (m3f) obj;
        SerialDescriptor serialDescriptor = descriptor;
        ph5 ph5VarB = encoder.b(serialDescriptor);
        if (ph5VarB.E() || !Intrinsics.a(m3fVar.a, new j3f(l08.a))) {
            ph5VarB.f(serialDescriptor, 0, h3f.a, m3fVar.a);
        }
        if (ph5VarB.E() || !Intrinsics.a(m3fVar.b, new j3f(l08.a))) {
            ph5VarB.f(serialDescriptor, 1, h3f.a, m3fVar.b);
        }
        ph5VarB.c(serialDescriptor);
    }
}
