package defpackage;

import java.math.BigInteger;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final /* synthetic */ class szl implements iv9 {
    public static final szl a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        szl szlVar = new szl();
        a = szlVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.opera.celopay.model.blockchain.Transaction.Fee", szlVar, 5);
        pluginGeneratedSerialDescriptor.k("currency", false);
        pluginGeneratedSerialDescriptor.k("maxPriorityPerGas", true);
        pluginGeneratedSerialDescriptor.k("maxPerGas", true);
        pluginGeneratedSerialDescriptor.k("amount", true);
        pluginGeneratedSerialDescriptor.k("maxMoney", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final KSerializer[] childSerializers() {
        ne3 ne3Var = ne3.a;
        return new KSerializer[]{uzl.f[0].getValue(), f03.B(ne3Var), f03.B(ne3Var), f03.B(ne3Var), u8e.a};
    }

    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        oh5 oh5VarB = decoder.b(serialDescriptor);
        l4c[] l4cVarArr = uzl.f;
        boolean z = true;
        int i = 0;
        h46 h46Var = null;
        BigInteger bigInteger = null;
        BigInteger bigInteger2 = null;
        BigInteger bigInteger3 = null;
        w8e w8eVar = null;
        while (z) {
            int iP = oh5VarB.p(serialDescriptor);
            if (iP == -1) {
                z = false;
            } else if (iP == 0) {
                h46Var = (h46) oh5VarB.z(serialDescriptor, 0, (KSerializer) l4cVarArr[0].getValue());
                i |= 1;
            } else if (iP == 1) {
                bigInteger = (BigInteger) oh5VarB.m(serialDescriptor, 1, ne3.a);
                i |= 2;
            } else if (iP == 2) {
                bigInteger2 = (BigInteger) oh5VarB.m(serialDescriptor, 2, ne3.a);
                i |= 4;
            } else if (iP == 3) {
                bigInteger3 = (BigInteger) oh5VarB.m(serialDescriptor, 3, ne3.a);
                i |= 8;
            } else {
                if (iP != 4) {
                    t3p.d(iP);
                    return null;
                }
                w8eVar = (w8e) oh5VarB.z(serialDescriptor, 4, u8e.a);
                i |= 16;
            }
        }
        oh5VarB.c(serialDescriptor);
        return new uzl(i, h46Var, bigInteger, bigInteger2, bigInteger3, w8eVar);
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x006a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void serialize(kotlinx.serialization.encoding.Encoder r7, java.lang.Object r8) {
        /*
            r6 = this;
            uzl r8 = (defpackage.uzl) r8
            kotlinx.serialization.descriptors.SerialDescriptor r6 = defpackage.szl.descriptor
            ph5 r7 = r7.b(r6)
            l4c[] r0 = defpackage.uzl.f
            r1 = 0
            r0 = r0[r1]
            java.lang.Object r0 = r0.getValue()
            kotlinx.serialization.KSerializer r0 = (kotlinx.serialization.KSerializer) r0
            h46 r2 = r8.a
            w8e r3 = r8.e
            java.math.BigInteger r4 = r8.d
            java.math.BigInteger r5 = r8.c
            java.math.BigInteger r8 = r8.b
            r7.f(r6, r1, r0, r2)
            boolean r0 = r7.E()
            if (r0 != 0) goto L28
            if (r8 == 0) goto L2e
        L28:
            ne3 r0 = defpackage.ne3.a
            r1 = 1
            r7.j(r6, r1, r0, r8)
        L2e:
            boolean r8 = r7.E()
            if (r8 != 0) goto L36
            if (r5 == 0) goto L3c
        L36:
            ne3 r8 = defpackage.ne3.a
            r0 = 2
            r7.j(r6, r0, r8, r5)
        L3c:
            boolean r8 = r7.E()
            if (r8 != 0) goto L44
            if (r4 == 0) goto L4a
        L44:
            ne3 r8 = defpackage.ne3.a
            r0 = 3
            r7.j(r6, r0, r8, r4)
        L4a:
            boolean r8 = r7.E()
            if (r8 != 0) goto L6a
            w8e r8 = new w8e
            if (r5 == 0) goto L5b
            if (r4 == 0) goto L5b
            java.math.BigInteger r0 = r5.multiply(r4)
            goto L5d
        L5b:
            java.math.BigInteger r0 = defpackage.pe3.a
        L5d:
            java.math.BigInteger r0 = r2.j(r0)
            r8.<init>(r0, r2)
            boolean r8 = kotlin.jvm.internal.Intrinsics.a(r3, r8)
            if (r8 != 0) goto L70
        L6a:
            u8e r8 = defpackage.u8e.a
            r0 = 4
            r7.f(r6, r0, r8, r3)
        L70:
            r7.c(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.szl.serialize(kotlinx.serialization.encoding.Encoder, java.lang.Object):void");
    }
}
