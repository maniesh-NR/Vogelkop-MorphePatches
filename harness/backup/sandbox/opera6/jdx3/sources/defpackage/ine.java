package defpackage;

import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final /* synthetic */ class ine implements iv9 {
    public static final ine a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        ine ineVar = new ine();
        a = ineVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.opera.android.live_score.football.data.network.model.NetworkFootballTeamEvents", ineVar, 2);
        pluginGeneratedSerialDescriptor.k("team", false);
        pluginGeneratedSerialDescriptor.k("events", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{lpc.a, kne.c[1].getValue()};
    }

    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        oh5 oh5VarB = decoder.b(serialDescriptor);
        l4c[] l4cVarArr = kne.c;
        boolean z = true;
        int i = 0;
        npc npcVar = null;
        List list = null;
        while (z) {
            int iP = oh5VarB.p(serialDescriptor);
            if (iP == -1) {
                z = false;
            } else if (iP == 0) {
                npcVar = (npc) oh5VarB.z(serialDescriptor, 0, lpc.a);
                i |= 1;
            } else {
                if (iP != 1) {
                    t3p.d(iP);
                    return null;
                }
                list = (List) oh5VarB.z(serialDescriptor, 1, (KSerializer) l4cVarArr[1].getValue());
                i |= 2;
            }
        }
        oh5VarB.c(serialDescriptor);
        return new kne(i, npcVar, list);
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public final void serialize(Encoder encoder, Object obj) {
        kne kneVar = (kne) obj;
        SerialDescriptor serialDescriptor = descriptor;
        ph5 ph5VarB = encoder.b(serialDescriptor);
        l4c[] l4cVarArr = kne.c;
        ph5VarB.f(serialDescriptor, 0, lpc.a, kneVar.a);
        ph5VarB.f(serialDescriptor, 1, (KSerializer) l4cVarArr[1].getValue(), kneVar.b);
        ph5VarB.c(serialDescriptor);
    }
}
