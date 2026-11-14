package defpackage;

import java.math.BigInteger;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final /* synthetic */ class r8e implements iv9 {
    public static final r8e a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        r8e r8eVar = new r8e();
        a = r8eVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.opera.celopay.model.money.Money.Fiat", r8eVar, 2);
        pluginGeneratedSerialDescriptor.k("amount", false);
        pluginGeneratedSerialDescriptor.k("currency", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{ne3.a, t8e.e[1].getValue()};
    }

    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        oh5 oh5VarB = decoder.b(serialDescriptor);
        l4c[] l4cVarArr = t8e.e;
        boolean z = true;
        int i = 0;
        BigInteger bigInteger = null;
        g46 g46Var = null;
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
                g46Var = (g46) oh5VarB.z(serialDescriptor, 1, (KSerializer) l4cVarArr[1].getValue());
                i |= 2;
            }
        }
        oh5VarB.c(serialDescriptor);
        return new t8e(i, bigInteger, g46Var);
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public final void serialize(Encoder encoder, Object obj) {
        t8e t8eVar = (t8e) obj;
        SerialDescriptor serialDescriptor = descriptor;
        ph5 ph5VarB = encoder.b(serialDescriptor);
        l4c[] l4cVarArr = t8e.e;
        ph5VarB.f(serialDescriptor, 0, ne3.a, t8eVar.c);
        ph5VarB.f(serialDescriptor, 1, (KSerializer) l4cVarArr[1].getValue(), t8eVar.d);
        ph5VarB.c(serialDescriptor);
    }
}
