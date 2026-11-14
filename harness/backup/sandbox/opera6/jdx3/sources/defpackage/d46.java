package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final /* synthetic */ class d46 implements iv9 {
    public static final d46 a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        d46 d46Var = new d46();
        a = d46Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.opera.celopay.model.money.Currency.Custom", d46Var, 5);
        pluginGeneratedSerialDescriptor.k("fiat", false);
        pluginGeneratedSerialDescriptor.k("code", true);
        pluginGeneratedSerialDescriptor.k("symbol", true);
        pluginGeneratedSerialDescriptor.k("decimals", true);
        pluginGeneratedSerialDescriptor.k("formatDecimals", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final KSerializer[] childSerializers() {
        xhk xhkVar = xhk.a;
        ecb ecbVar = ecb.a;
        return new KSerializer[]{f46.f[0].getValue(), xhkVar, xhkVar, ecbVar, ecbVar};
    }

    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        oh5 oh5VarB = decoder.b(serialDescriptor);
        l4c[] l4cVarArr = f46.f;
        boolean z = true;
        int i = 0;
        int iL = 0;
        int iL2 = 0;
        g46 g46Var = null;
        String strO = null;
        String strO2 = null;
        while (z) {
            int iP = oh5VarB.p(serialDescriptor);
            if (iP == -1) {
                z = false;
            } else if (iP == 0) {
                g46Var = (g46) oh5VarB.z(serialDescriptor, 0, (KSerializer) l4cVarArr[0].getValue());
                i |= 1;
            } else if (iP == 1) {
                strO = oh5VarB.o(serialDescriptor, 1);
                i |= 2;
            } else if (iP == 2) {
                strO2 = oh5VarB.o(serialDescriptor, 2);
                i |= 4;
            } else if (iP == 3) {
                iL = oh5VarB.l(serialDescriptor, 3);
                i |= 8;
            } else {
                if (iP != 4) {
                    t3p.d(iP);
                    return null;
                }
                iL2 = oh5VarB.l(serialDescriptor, 4);
                i |= 16;
            }
        }
        oh5VarB.c(serialDescriptor);
        return new f46(i, g46Var, strO, strO2, iL, iL2);
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void serialize(kotlinx.serialization.encoding.Encoder r7, java.lang.Object r8) {
        /*
            r6 = this;
            f46 r8 = (defpackage.f46) r8
            kotlinx.serialization.descriptors.SerialDescriptor r6 = defpackage.d46.descriptor
            ph5 r7 = r7.b(r6)
            l4c[] r0 = defpackage.f46.f
            r1 = 0
            r0 = r0[r1]
            java.lang.Object r0 = r0.getValue()
            kotlinx.serialization.KSerializer r0 = (kotlinx.serialization.KSerializer) r0
            g46 r2 = r8.a
            int r3 = r8.e
            int r4 = r8.d
            java.lang.String r5 = r8.c
            java.lang.String r8 = r8.b
            r7.f(r6, r1, r0, r2)
            boolean r0 = r7.E()
            if (r0 != 0) goto L2e
            java.lang.String r0 = r2.a
            boolean r0 = kotlin.jvm.internal.Intrinsics.a(r8, r0)
            if (r0 != 0) goto L32
        L2e:
            r0 = 1
            r7.z(r6, r0, r8)
        L32:
            boolean r8 = r7.E()
            if (r8 != 0) goto L44
            java.lang.String r8 = r2.d
            if (r8 != 0) goto L3e
            java.lang.String r8 = r2.a
        L3e:
            boolean r8 = kotlin.jvm.internal.Intrinsics.a(r5, r8)
            if (r8 != 0) goto L48
        L44:
            r8 = 2
            r7.z(r6, r8, r5)
        L48:
            boolean r8 = r7.E()
            if (r8 != 0) goto L52
            byte r8 = r2.b
            if (r4 == r8) goto L56
        L52:
            r8 = 3
            r7.v(r8, r4, r6)
        L56:
            boolean r8 = r7.E()
            if (r8 != 0) goto L60
            int r8 = r2.c
            if (r3 == r8) goto L64
        L60:
            r8 = 4
            r7.v(r8, r3, r6)
        L64:
            r7.c(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d46.serialize(kotlinx.serialization.encoding.Encoder, java.lang.Object):void");
    }
}
