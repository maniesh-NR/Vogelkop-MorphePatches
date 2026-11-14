package defpackage;

import com.leanplum.internal.Constants;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final /* synthetic */ class z0m implements iv9 {
    public static final z0m a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        z0m z0mVar = new z0m();
        a = z0mVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.opera.celopay.model.blockchain.TransactionReceipt", z0mVar, 5);
        pluginGeneratedSerialDescriptor.k("from", false);
        pluginGeneratedSerialDescriptor.k("to", false);
        pluginGeneratedSerialDescriptor.k("status", false);
        pluginGeneratedSerialDescriptor.k("transactionHash", false);
        pluginGeneratedSerialDescriptor.k(Constants.Params.TYPE, false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    public final KSerializer[] childSerializers() {
        vv vvVar = vv.a;
        je3 je3Var = je3.a;
        return new KSerializer[]{vvVar, vvVar, je3Var, p7a.a, je3Var};
    }

    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        oh5 oh5VarB = decoder.b(serialDescriptor);
        boolean z = true;
        int i = 0;
        wv wvVar = null;
        wv wvVar2 = null;
        ke3 ke3Var = null;
        r7a r7aVar = null;
        ke3 ke3Var2 = null;
        while (z) {
            int iP = oh5VarB.p(serialDescriptor);
            if (iP == -1) {
                z = false;
            } else if (iP == 0) {
                wvVar = (wv) oh5VarB.z(serialDescriptor, 0, vv.a);
                i |= 1;
            } else if (iP == 1) {
                wvVar2 = (wv) oh5VarB.z(serialDescriptor, 1, vv.a);
                i |= 2;
            } else if (iP == 2) {
                ke3Var = (ke3) oh5VarB.z(serialDescriptor, 2, je3.a);
                i |= 4;
            } else if (iP == 3) {
                r7aVar = (r7a) oh5VarB.z(serialDescriptor, 3, p7a.a);
                i |= 8;
            } else {
                if (iP != 4) {
                    t3p.d(iP);
                    return null;
                }
                ke3Var2 = (ke3) oh5VarB.z(serialDescriptor, 4, je3.a);
                i |= 16;
            }
        }
        oh5VarB.c(serialDescriptor);
        return new b1m(i, wvVar, wvVar2, ke3Var, r7aVar, ke3Var2);
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public final void serialize(Encoder encoder, Object obj) {
        b1m b1mVar = (b1m) obj;
        SerialDescriptor serialDescriptor = descriptor;
        ph5 ph5VarB = encoder.b(serialDescriptor);
        a1m a1mVar = b1m.Companion;
        vv vvVar = vv.a;
        ph5VarB.f(serialDescriptor, 0, vvVar, b1mVar.a);
        ph5VarB.f(serialDescriptor, 1, vvVar, b1mVar.b);
        je3 je3Var = je3.a;
        ph5VarB.f(serialDescriptor, 2, je3Var, b1mVar.c);
        ph5VarB.f(serialDescriptor, 3, p7a.a, b1mVar.d);
        ph5VarB.f(serialDescriptor, 4, je3Var, b1mVar.e);
        ph5VarB.c(serialDescriptor);
    }
}
