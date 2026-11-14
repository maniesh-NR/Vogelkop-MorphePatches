package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final /* synthetic */ class xoe implements iv9 {
    public static final xoe a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        xoe xoeVar = new xoe();
        a = xoeVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.opera.android.weather.data.network.model.NetworkTemperature", xoeVar, 3);
        pluginGeneratedSerialDescriptor.k("Value", false);
        pluginGeneratedSerialDescriptor.k("Unit", false);
        pluginGeneratedSerialDescriptor.k("UnitType", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    public final KSerializer[] childSerializers() {
        return new KSerializer[]{oe7.a, xhk.a, ecb.a};
    }

    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        oh5 oh5VarB = decoder.b(serialDescriptor);
        int i = 0;
        int iL = 0;
        double dE = 0.0d;
        String strO = null;
        boolean z = true;
        while (z) {
            int iP = oh5VarB.p(serialDescriptor);
            if (iP == -1) {
                z = false;
            } else if (iP == 0) {
                dE = oh5VarB.E(serialDescriptor, 0);
                i |= 1;
            } else if (iP == 1) {
                strO = oh5VarB.o(serialDescriptor, 1);
                i |= 2;
            } else {
                if (iP != 2) {
                    t3p.d(iP);
                    return null;
                }
                iL = oh5VarB.l(serialDescriptor, 2);
                i |= 4;
            }
        }
        oh5VarB.c(serialDescriptor);
        return new zoe(i, iL, strO, dE);
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public final void serialize(Encoder encoder, Object obj) {
        zoe zoeVar = (zoe) obj;
        SerialDescriptor serialDescriptor = descriptor;
        ph5 ph5VarB = encoder.b(serialDescriptor);
        ph5VarB.D(serialDescriptor, 0, zoeVar.a);
        ph5VarB.z(serialDescriptor, 1, zoeVar.b);
        ph5VarB.v(2, zoeVar.c, serialDescriptor);
        ph5VarB.c(serialDescriptor);
    }
}
