package defpackage;

import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final /* synthetic */ class fne implements iv9 {
    public static final fne a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        fne fneVar = new fne();
        a = fneVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.opera.android.live_score.football.data.network.model.NetworkFootballPopularEvents", fneVar, 2);
        pluginGeneratedSerialDescriptor.k("events", false);
        pluginGeneratedSerialDescriptor.k("tournaments", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final KSerializer[] childSerializers() {
        l4c[] l4cVarArr = hne.c;
        return new KSerializer[]{l4cVarArr[0].getValue(), l4cVarArr[1].getValue()};
    }

    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        oh5 oh5VarB = decoder.b(serialDescriptor);
        l4c[] l4cVarArr = hne.c;
        boolean z = true;
        int i = 0;
        List list = null;
        List list2 = null;
        while (z) {
            int iP = oh5VarB.p(serialDescriptor);
            if (iP == -1) {
                z = false;
            } else if (iP == 0) {
                list = (List) oh5VarB.z(serialDescriptor, 0, (KSerializer) l4cVarArr[0].getValue());
                i |= 1;
            } else {
                if (iP != 1) {
                    t3p.d(iP);
                    return null;
                }
                list2 = (List) oh5VarB.z(serialDescriptor, 1, (KSerializer) l4cVarArr[1].getValue());
                i |= 2;
            }
        }
        oh5VarB.c(serialDescriptor);
        return new hne(list, list2, i);
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public final void serialize(Encoder encoder, Object obj) {
        hne hneVar = (hne) obj;
        SerialDescriptor serialDescriptor = descriptor;
        ph5 ph5VarB = encoder.b(serialDescriptor);
        l4c[] l4cVarArr = hne.c;
        ph5VarB.f(serialDescriptor, 0, (KSerializer) l4cVarArr[0].getValue(), hneVar.a);
        ph5VarB.f(serialDescriptor, 1, (KSerializer) l4cVarArr[1].getValue(), hneVar.b);
        ph5VarB.c(serialDescriptor);
    }
}
