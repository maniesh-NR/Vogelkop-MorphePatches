package defpackage;

import com.leanplum.internal.Constants;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final /* synthetic */ class sme implements iv9 {
    public static final sme a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        sme smeVar = new sme();
        a = smeVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.opera.android.live_score.football.data.network.model.NetworkFootballEventEnvelope.Team", smeVar, 3);
        pluginGeneratedSerialDescriptor.k(Constants.Params.NAME, false);
        pluginGeneratedSerialDescriptor.k("logo_url", true);
        pluginGeneratedSerialDescriptor.k("scores", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    public final KSerializer[] childSerializers() {
        xhk xhkVar = xhk.a;
        return new KSerializer[]{xhkVar, xhkVar, pme.a};
    }

    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        oh5 oh5VarB = decoder.b(serialDescriptor);
        boolean z = true;
        int i = 0;
        String strO = null;
        String strO2 = null;
        rme rmeVar = null;
        while (z) {
            int iP = oh5VarB.p(serialDescriptor);
            if (iP == -1) {
                z = false;
            } else if (iP == 0) {
                strO = oh5VarB.o(serialDescriptor, 0);
                i |= 1;
            } else if (iP == 1) {
                strO2 = oh5VarB.o(serialDescriptor, 1);
                i |= 2;
            } else {
                if (iP != 2) {
                    t3p.d(iP);
                    return null;
                }
                rmeVar = (rme) oh5VarB.z(serialDescriptor, 2, pme.a);
                i |= 4;
            }
        }
        oh5VarB.c(serialDescriptor);
        return new ume(i, strO, strO2, rmeVar);
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public final void serialize(Encoder encoder, Object obj) {
        ume umeVar = (ume) obj;
        SerialDescriptor serialDescriptor = descriptor;
        ph5 ph5VarB = encoder.b(serialDescriptor);
        String str = umeVar.a;
        rme rmeVar = umeVar.c;
        String str2 = umeVar.b;
        ph5VarB.z(serialDescriptor, 0, str);
        if (ph5VarB.E() || !Intrinsics.a(str2, "")) {
            ph5VarB.z(serialDescriptor, 1, str2);
        }
        if (ph5VarB.E() || !Intrinsics.a(rmeVar, new rme())) {
            ph5VarB.f(serialDescriptor, 2, pme.a, rmeVar);
        }
        ph5VarB.c(serialDescriptor);
    }
}
