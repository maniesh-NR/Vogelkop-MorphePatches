package defpackage;

import java.util.Map;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final /* synthetic */ class gw6 implements iv9 {
    public static final gw6 a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        gw6 gw6Var = new gw6();
        a = gw6Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.arkivanov.essenty.statekeeper.DefaultStateKeeperDispatcher.SavedState", gw6Var, 1);
        pluginGeneratedSerialDescriptor.k("map", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    public final KSerializer[] childSerializers() {
        return new KSerializer[]{iw6.b[0]};
    }

    public final Object deserialize(Decoder decoder) throws o2j {
        SerialDescriptor serialDescriptor = descriptor;
        oh5 oh5VarB = decoder.b(serialDescriptor);
        KSerializer[] kSerializerArr = iw6.b;
        boolean z = true;
        int i = 0;
        Map map = null;
        while (z) {
            int iP = oh5VarB.p(serialDescriptor);
            if (iP == -1) {
                z = false;
            } else {
                if (iP != 0) {
                    t3p.d(iP);
                    return null;
                }
                map = (Map) oh5VarB.z(serialDescriptor, 0, kSerializerArr[0]);
                i = 1;
            }
        }
        oh5VarB.c(serialDescriptor);
        return new iw6(i, map);
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public final void serialize(Encoder encoder, Object obj) {
        SerialDescriptor serialDescriptor = descriptor;
        ph5 ph5VarB = encoder.b(serialDescriptor);
        ph5VarB.f(serialDescriptor, 0, iw6.b[0], ((iw6) obj).a);
        ph5VarB.c(serialDescriptor);
    }

    public final KSerializer[] typeParametersSerializers() {
        return o0g.c;
    }
}
