package defpackage;

import java.math.BigInteger;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final /* synthetic */ class pzl implements iv9 {
    public static final pzl a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        pzl pzlVar = new pzl();
        a = pzlVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.opera.celopay.model.blockchain.Transaction", pzlVar, 7);
        pluginGeneratedSerialDescriptor.k("net", false);
        pluginGeneratedSerialDescriptor.k("from", false);
        pluginGeneratedSerialDescriptor.k("to", false);
        pluginGeneratedSerialDescriptor.k("money", false);
        pluginGeneratedSerialDescriptor.k("encodedData", false);
        pluginGeneratedSerialDescriptor.k("decodedData", false);
        pluginGeneratedSerialDescriptor.k("nonce", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final KSerializer[] childSerializers() {
        l4c[] l4cVarArr = yzl.h;
        vv vvVar = vv.a;
        return new KSerializer[]{l4cVarArr[0].getValue(), vvVar, f03.B(vvVar), u8e.a, xhk.a, f03.B((KSerializer) l4cVarArr[5].getValue()), f03.B(ne3.a)};
    }

    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        oh5 oh5VarB = decoder.b(serialDescriptor);
        l4c[] l4cVarArr = yzl.h;
        boolean z = true;
        int i = 0;
        nle nleVar = null;
        wv wvVar = null;
        wv wvVar2 = null;
        w8e w8eVar = null;
        String strO = null;
        rzl rzlVar = null;
        BigInteger bigInteger = null;
        while (z) {
            int iP = oh5VarB.p(serialDescriptor);
            switch (iP) {
                case -1:
                    z = false;
                    break;
                case 0:
                    nleVar = (nle) oh5VarB.z(serialDescriptor, 0, (KSerializer) l4cVarArr[0].getValue());
                    i |= 1;
                    break;
                case 1:
                    wvVar = (wv) oh5VarB.z(serialDescriptor, 1, vv.a);
                    i |= 2;
                    break;
                case 2:
                    wvVar2 = (wv) oh5VarB.m(serialDescriptor, 2, vv.a);
                    i |= 4;
                    break;
                case 3:
                    w8eVar = (w8e) oh5VarB.z(serialDescriptor, 3, u8e.a);
                    i |= 8;
                    break;
                case 4:
                    strO = oh5VarB.o(serialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    rzlVar = (rzl) oh5VarB.m(serialDescriptor, 5, (KSerializer) l4cVarArr[5].getValue());
                    i |= 32;
                    break;
                case 6:
                    bigInteger = (BigInteger) oh5VarB.m(serialDescriptor, 6, ne3.a);
                    i |= 64;
                    break;
                default:
                    t3p.d(iP);
                    return null;
            }
        }
        oh5VarB.c(serialDescriptor);
        return new yzl(i, nleVar, wvVar, wvVar2, w8eVar, strO, rzlVar, bigInteger);
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public final void serialize(Encoder encoder, Object obj) {
        yzl yzlVar = (yzl) obj;
        SerialDescriptor serialDescriptor = descriptor;
        ph5 ph5VarB = encoder.b(serialDescriptor);
        l4c[] l4cVarArr = yzl.h;
        KSerializer kSerializer = (KSerializer) l4cVarArr[0].getValue();
        nle nleVar = yzlVar.a;
        BigInteger bigInteger = yzlVar.g;
        ph5VarB.f(serialDescriptor, 0, kSerializer, nleVar);
        vv vvVar = vv.a;
        ph5VarB.f(serialDescriptor, 1, vvVar, yzlVar.b);
        ph5VarB.j(serialDescriptor, 2, vvVar, yzlVar.c);
        ph5VarB.f(serialDescriptor, 3, u8e.a, yzlVar.d);
        ph5VarB.z(serialDescriptor, 4, yzlVar.e);
        ph5VarB.j(serialDescriptor, 5, (KSerializer) l4cVarArr[5].getValue(), yzlVar.f);
        if (ph5VarB.E() || bigInteger != null) {
            ph5VarB.j(serialDescriptor, 6, ne3.a, bigInteger);
        }
        ph5VarB.c(serialDescriptor);
    }
}
