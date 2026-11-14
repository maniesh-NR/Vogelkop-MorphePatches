package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final /* synthetic */ class l7o implements iv9 {
    public static final l7o a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        l7o l7oVar = new l7o();
        a = l7oVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.opera.android.live_score.data.network.WorldCupRecommendedTeamsFetcher.RecommendedTeam", l7oVar, 1);
        pluginGeneratedSerialDescriptor.k("team_id", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    public final KSerializer[] childSerializers() {
        return new KSerializer[]{h1d.a};
    }

    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        oh5 oh5VarB = decoder.b(serialDescriptor);
        long jG = 0;
        boolean z = true;
        int i = 0;
        while (z) {
            int iP = oh5VarB.p(serialDescriptor);
            if (iP == -1) {
                z = false;
            } else {
                if (iP != 0) {
                    t3p.d(iP);
                    return null;
                }
                jG = oh5VarB.g(serialDescriptor, 0);
                i = 1;
            }
        }
        oh5VarB.c(serialDescriptor);
        return new n7o(i, jG);
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public final void serialize(Encoder encoder, Object obj) {
        SerialDescriptor serialDescriptor = descriptor;
        ph5 ph5VarB = encoder.b(serialDescriptor);
        ph5VarB.F(serialDescriptor, 0, ((n7o) obj).a);
        ph5VarB.c(serialDescriptor);
    }
}
