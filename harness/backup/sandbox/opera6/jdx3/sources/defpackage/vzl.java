package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final /* synthetic */ class vzl implements iv9 {
    public static final vzl a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        vzl vzlVar = new vzl();
        a = vzlVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.opera.celopay.model.blockchain.Transaction.WithFee", vzlVar, 2);
        pluginGeneratedSerialDescriptor.k("transaction", false);
        pluginGeneratedSerialDescriptor.k("fee", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    public final KSerializer[] childSerializers() {
        return new KSerializer[]{pzl.a, szl.a};
    }

    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        oh5 oh5VarB = decoder.b(serialDescriptor);
        boolean z = true;
        int i = 0;
        yzl yzlVar = null;
        uzl uzlVar = null;
        while (z) {
            int iP = oh5VarB.p(serialDescriptor);
            if (iP == -1) {
                z = false;
            } else if (iP == 0) {
                yzlVar = (yzl) oh5VarB.z(serialDescriptor, 0, pzl.a);
                i |= 1;
            } else {
                if (iP != 1) {
                    t3p.d(iP);
                    return null;
                }
                uzlVar = (uzl) oh5VarB.z(serialDescriptor, 1, szl.a);
                i |= 2;
            }
        }
        oh5VarB.c(serialDescriptor);
        return new xzl(i, yzlVar, uzlVar);
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public final void serialize(Encoder encoder, Object obj) {
        xzl xzlVar = (xzl) obj;
        SerialDescriptor serialDescriptor = descriptor;
        ph5 ph5VarB = encoder.b(serialDescriptor);
        ph5VarB.f(serialDescriptor, 0, pzl.a, xzlVar.a);
        ph5VarB.f(serialDescriptor, 1, szl.a, xzlVar.b);
        ph5VarB.c(serialDescriptor);
    }
}
