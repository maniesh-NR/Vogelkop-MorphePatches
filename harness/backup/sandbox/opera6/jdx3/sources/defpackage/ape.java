package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final /* synthetic */ class ape implements iv9 {
    public static final ape a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        ape apeVar = new ape();
        a = apeVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.opera.android.weather.data.network.model.NetworkTemperatureSet", apeVar, 2);
        pluginGeneratedSerialDescriptor.k("Metric", false);
        pluginGeneratedSerialDescriptor.k("Imperial", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    public final KSerializer[] childSerializers() {
        xoe xoeVar = xoe.a;
        return new KSerializer[]{xoeVar, xoeVar};
    }

    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        oh5 oh5VarB = decoder.b(serialDescriptor);
        boolean z = true;
        int i = 0;
        zoe zoeVar = null;
        zoe zoeVar2 = null;
        while (z) {
            int iP = oh5VarB.p(serialDescriptor);
            if (iP == -1) {
                z = false;
            } else if (iP == 0) {
                zoeVar = (zoe) oh5VarB.z(serialDescriptor, 0, xoe.a);
                i |= 1;
            } else {
                if (iP != 1) {
                    t3p.d(iP);
                    return null;
                }
                zoeVar2 = (zoe) oh5VarB.z(serialDescriptor, 1, xoe.a);
                i |= 2;
            }
        }
        oh5VarB.c(serialDescriptor);
        return new cpe(i, zoeVar, zoeVar2);
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public final void serialize(Encoder encoder, Object obj) {
        cpe cpeVar = (cpe) obj;
        SerialDescriptor serialDescriptor = descriptor;
        ph5 ph5VarB = encoder.b(serialDescriptor);
        xoe xoeVar = xoe.a;
        ph5VarB.f(serialDescriptor, 0, xoeVar, cpeVar.a);
        ph5VarB.f(serialDescriptor, 1, xoeVar, cpeVar.b);
        ph5VarB.c(serialDescriptor);
    }
}
