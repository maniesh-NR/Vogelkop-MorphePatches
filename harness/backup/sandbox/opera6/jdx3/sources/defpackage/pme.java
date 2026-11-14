package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final /* synthetic */ class pme implements iv9 {
    public static final pme a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        pme pmeVar = new pme();
        a = pmeVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.opera.android.live_score.football.data.network.model.NetworkFootballEventEnvelope.Score", pmeVar, 2);
        pluginGeneratedSerialDescriptor.k("score", true);
        pluginGeneratedSerialDescriptor.k("score_penalties", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    public final KSerializer[] childSerializers() {
        ecb ecbVar = ecb.a;
        return new KSerializer[]{ecbVar, ecbVar};
    }

    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        oh5 oh5VarB = decoder.b(serialDescriptor);
        boolean z = true;
        int i = 0;
        int iL = 0;
        int iL2 = 0;
        while (z) {
            int iP = oh5VarB.p(serialDescriptor);
            if (iP == -1) {
                z = false;
            } else if (iP == 0) {
                iL = oh5VarB.l(serialDescriptor, 0);
                i |= 1;
            } else {
                if (iP != 1) {
                    t3p.d(iP);
                    return null;
                }
                iL2 = oh5VarB.l(serialDescriptor, 1);
                i |= 2;
            }
        }
        oh5VarB.c(serialDescriptor);
        return new rme(i, iL, iL2);
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public final void serialize(Encoder encoder, Object obj) {
        rme rmeVar = (rme) obj;
        SerialDescriptor serialDescriptor = descriptor;
        ph5 ph5VarB = encoder.b(serialDescriptor);
        if (ph5VarB.E() || rmeVar.a != 0) {
            ph5VarB.v(0, rmeVar.a, serialDescriptor);
        }
        if (ph5VarB.E() || rmeVar.b != 0) {
            ph5VarB.v(1, rmeVar.b, serialDescriptor);
        }
        ph5VarB.c(serialDescriptor);
    }
}
