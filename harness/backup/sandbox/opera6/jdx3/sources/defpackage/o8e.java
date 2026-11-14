package defpackage;

import java.math.BigInteger;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final /* synthetic */ class o8e implements iv9 {
    public static final o8e a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        o8e o8eVar = new o8e();
        a = o8eVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.opera.celopay.model.money.Money.Custom", o8eVar, 2);
        pluginGeneratedSerialDescriptor.k("amount", false);
        pluginGeneratedSerialDescriptor.k("currency", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    public final KSerializer[] childSerializers() {
        return new KSerializer[]{ne3.a, d46.a};
    }

    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        oh5 oh5VarB = decoder.b(serialDescriptor);
        boolean z = true;
        int i = 0;
        BigInteger bigInteger = null;
        f46 f46Var = null;
        while (z) {
            int iP = oh5VarB.p(serialDescriptor);
            if (iP == -1) {
                z = false;
            } else if (iP == 0) {
                bigInteger = (BigInteger) oh5VarB.z(serialDescriptor, 0, ne3.a);
                i |= 1;
            } else {
                if (iP != 1) {
                    t3p.d(iP);
                    return null;
                }
                f46Var = (f46) oh5VarB.z(serialDescriptor, 1, d46.a);
                i |= 2;
            }
        }
        oh5VarB.c(serialDescriptor);
        return new q8e(i, bigInteger, f46Var);
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public final void serialize(Encoder encoder, Object obj) {
        q8e q8eVar = (q8e) obj;
        SerialDescriptor serialDescriptor = descriptor;
        ph5 ph5VarB = encoder.b(serialDescriptor);
        p8e p8eVar = q8e.Companion;
        ph5VarB.f(serialDescriptor, 0, ne3.a, q8eVar.c);
        ph5VarB.f(serialDescriptor, 1, d46.a, q8eVar.d);
        ph5VarB.c(serialDescriptor);
    }
}
