package defpackage;

import java.math.BigInteger;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final /* synthetic */ class u8e implements iv9 {
    public static final u8e a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        u8e u8eVar = new u8e();
        a = u8eVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.opera.celopay.model.money.Money.Token", u8eVar, 2);
        pluginGeneratedSerialDescriptor.k("amount", false);
        pluginGeneratedSerialDescriptor.k("currency", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{ne3.a, w8e.e[1].getValue()};
    }

    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        oh5 oh5VarB = decoder.b(serialDescriptor);
        l4c[] l4cVarArr = w8e.e;
        boolean z = true;
        int i = 0;
        BigInteger bigInteger = null;
        h46 h46Var = null;
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
                h46Var = (h46) oh5VarB.z(serialDescriptor, 1, (KSerializer) l4cVarArr[1].getValue());
                i |= 2;
            }
        }
        oh5VarB.c(serialDescriptor);
        return new w8e(i, bigInteger, h46Var);
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public final void serialize(Encoder encoder, Object obj) {
        w8e w8eVar = (w8e) obj;
        SerialDescriptor serialDescriptor = descriptor;
        ph5 ph5VarB = encoder.b(serialDescriptor);
        l4c[] l4cVarArr = w8e.e;
        ph5VarB.f(serialDescriptor, 0, ne3.a, w8eVar.c);
        ph5VarB.f(serialDescriptor, 1, (KSerializer) l4cVarArr[1].getValue(), w8eVar.d);
        ph5VarB.c(serialDescriptor);
    }
}
