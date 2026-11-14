package defpackage;

import com.leanplum.internal.Constants;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final /* synthetic */ class ddk implements iv9 {
    public static final ddk a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        ddk ddkVar = new ddk();
        a = ddkVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.opera.android.ntp.Storage.Data", ddkVar, 2);
        pluginGeneratedSerialDescriptor.k(Constants.Params.RESPONSE, false);
        pluginGeneratedSerialDescriptor.k("lastUpdated", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    public final KSerializer[] childSerializers() {
        return new KSerializer[]{f03.B(t3f.a), f03.B(ibb.a)};
    }

    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        oh5 oh5VarB = decoder.b(serialDescriptor);
        boolean z = true;
        int i = 0;
        v3f v3fVar = null;
        ebb ebbVar = null;
        while (z) {
            int iP = oh5VarB.p(serialDescriptor);
            if (iP == -1) {
                z = false;
            } else if (iP == 0) {
                v3fVar = (v3f) oh5VarB.m(serialDescriptor, 0, t3f.a);
                i |= 1;
            } else {
                if (iP != 1) {
                    t3p.d(iP);
                    return null;
                }
                ebbVar = (ebb) oh5VarB.m(serialDescriptor, 1, ibb.a);
                i |= 2;
            }
        }
        oh5VarB.c(serialDescriptor);
        return new fdk(i, v3fVar, ebbVar);
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public final void serialize(Encoder encoder, Object obj) {
        fdk fdkVar = (fdk) obj;
        SerialDescriptor serialDescriptor = descriptor;
        ph5 ph5VarB = encoder.b(serialDescriptor);
        ph5VarB.j(serialDescriptor, 0, t3f.a, fdkVar.a);
        ph5VarB.j(serialDescriptor, 1, ibb.a, fdkVar.b);
        ph5VarB.c(serialDescriptor);
    }
}
