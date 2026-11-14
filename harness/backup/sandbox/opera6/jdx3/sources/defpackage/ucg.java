package defpackage;

import com.leanplum.internal.Constants;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final /* synthetic */ class ucg implements iv9 {
    public static final ucg a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        ucg ucgVar = new ucg();
        a = ucgVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.opera.android.startup.fragments.personalization.PersonalizationOnboardingSnapshot.Interest", ucgVar, 3);
        pluginGeneratedSerialDescriptor.k(Constants.Params.NAME, false);
        pluginGeneratedSerialDescriptor.k("enabled", false);
        pluginGeneratedSerialDescriptor.k("tappedByUser", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    public final KSerializer[] childSerializers() {
        rn3 rn3Var = rn3.a;
        return new KSerializer[]{xhk.a, rn3Var, rn3Var};
    }

    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        oh5 oh5VarB = decoder.b(serialDescriptor);
        boolean z = true;
        int i = 0;
        boolean zC = false;
        boolean zC2 = false;
        String strO = null;
        while (z) {
            int iP = oh5VarB.p(serialDescriptor);
            if (iP == -1) {
                z = false;
            } else if (iP == 0) {
                strO = oh5VarB.o(serialDescriptor, 0);
                i |= 1;
            } else if (iP == 1) {
                zC = oh5VarB.C(serialDescriptor, 1);
                i |= 2;
            } else {
                if (iP != 2) {
                    t3p.d(iP);
                    return null;
                }
                zC2 = oh5VarB.C(serialDescriptor, 2);
                i |= 4;
            }
        }
        oh5VarB.c(serialDescriptor);
        return new wcg(i, strO, zC, zC2);
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public final void serialize(Encoder encoder, Object obj) {
        wcg wcgVar = (wcg) obj;
        SerialDescriptor serialDescriptor = descriptor;
        ph5 ph5VarB = encoder.b(serialDescriptor);
        ph5VarB.z(serialDescriptor, 0, wcgVar.a);
        ph5VarB.y(serialDescriptor, 1, wcgVar.b);
        ph5VarB.y(serialDescriptor, 2, wcgVar.c);
        ph5VarB.c(serialDescriptor);
    }
}
