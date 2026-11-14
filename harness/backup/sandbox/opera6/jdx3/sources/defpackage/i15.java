package defpackage;

import com.leanplum.internal.Constants;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final /* synthetic */ class i15 implements iv9 {
    public static final i15 a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        i15 i15Var = new i15();
        a = i15Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.opera.android.rewards.ClaimableData", i15Var, 3);
        pluginGeneratedSerialDescriptor.k("id", false);
        pluginGeneratedSerialDescriptor.k("price", false);
        pluginGeneratedSerialDescriptor.k(Constants.Params.STATE, false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{xhk.a, h1d.a, k15.d[2].getValue()};
    }

    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        oh5 oh5VarB = decoder.b(serialDescriptor);
        l4c[] l4cVarArr = k15.d;
        int i = 0;
        String strO = null;
        l15 l15Var = null;
        long jG = 0;
        boolean z = true;
        while (z) {
            int iP = oh5VarB.p(serialDescriptor);
            if (iP == -1) {
                z = false;
            } else if (iP == 0) {
                strO = oh5VarB.o(serialDescriptor, 0);
                i |= 1;
            } else if (iP == 1) {
                jG = oh5VarB.g(serialDescriptor, 1);
                i |= 2;
            } else {
                if (iP != 2) {
                    t3p.d(iP);
                    return null;
                }
                l15Var = (l15) oh5VarB.z(serialDescriptor, 2, (KSerializer) l4cVarArr[2].getValue());
                i |= 4;
            }
        }
        oh5VarB.c(serialDescriptor);
        return new k15(i, strO, jG, l15Var);
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public final void serialize(Encoder encoder, Object obj) {
        k15 k15Var = (k15) obj;
        SerialDescriptor serialDescriptor = descriptor;
        ph5 ph5VarB = encoder.b(serialDescriptor);
        l4c[] l4cVarArr = k15.d;
        ph5VarB.z(serialDescriptor, 0, k15Var.a);
        ph5VarB.F(serialDescriptor, 1, k15Var.b);
        ph5VarB.f(serialDescriptor, 2, (KSerializer) l4cVarArr[2].getValue(), k15Var.c);
        ph5VarB.c(serialDescriptor);
    }
}
