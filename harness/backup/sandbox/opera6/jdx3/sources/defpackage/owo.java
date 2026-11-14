package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes.dex */
public final class owo implements iv9 {
    public static final owo a;
    public static final /* synthetic */ PluginGeneratedSerialDescriptor b;

    static {
        owo owoVar = new owo();
        a = owoVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.opera.ads.internal.data.BidRequestObject.SourceExt", owoVar, 7);
        pluginGeneratedSerialDescriptor.k("omidpn", true);
        pluginGeneratedSerialDescriptor.k("omidpv", true);
        pluginGeneratedSerialDescriptor.k("mediationid", true);
        pluginGeneratedSerialDescriptor.k("mediationsdkv", true);
        pluginGeneratedSerialDescriptor.k("mediationasdkv", true);
        pluginGeneratedSerialDescriptor.k("bidtokenmedid", true);
        pluginGeneratedSerialDescriptor.k("bidtype", false);
        b = pluginGeneratedSerialDescriptor;
    }

    public final KSerializer[] childSerializers() {
        KSerializer kSerializer = xhk.a;
        return new KSerializer[]{kSerializer, kSerializer, f03.B(kSerializer), f03.B(kSerializer), f03.B(kSerializer), f03.B(kSerializer), f03.B(ecb.a)};
    }

    public final Object deserialize(Decoder decoder) {
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
        oh5 oh5VarB = decoder.b(pluginGeneratedSerialDescriptor);
        boolean z = true;
        int i = 0;
        String strO = null;
        String strO2 = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Integer num = null;
        while (z) {
            int iP = oh5VarB.p(pluginGeneratedSerialDescriptor);
            switch (iP) {
                case -1:
                    z = false;
                    break;
                case 0:
                    strO = oh5VarB.o(pluginGeneratedSerialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    strO2 = oh5VarB.o(pluginGeneratedSerialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    str = (String) oh5VarB.m(pluginGeneratedSerialDescriptor, 2, xhk.a);
                    i |= 4;
                    break;
                case 3:
                    str2 = (String) oh5VarB.m(pluginGeneratedSerialDescriptor, 3, xhk.a);
                    i |= 8;
                    break;
                case 4:
                    str3 = (String) oh5VarB.m(pluginGeneratedSerialDescriptor, 4, xhk.a);
                    i |= 16;
                    break;
                case 5:
                    str4 = (String) oh5VarB.m(pluginGeneratedSerialDescriptor, 5, xhk.a);
                    i |= 32;
                    break;
                case 6:
                    num = (Integer) oh5VarB.m(pluginGeneratedSerialDescriptor, 6, ecb.a);
                    i |= 64;
                    break;
                default:
                    t3p.d(iP);
                    return null;
            }
        }
        oh5VarB.c(pluginGeneratedSerialDescriptor);
        return new qwo(i, strO, strO2, str, str2, str3, str4, num);
    }

    public final SerialDescriptor getDescriptor() {
        return b;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0087  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void serialize(kotlinx.serialization.encoding.Encoder r5, java.lang.Object r6) {
        /*
            r4 = this;
            qwo r6 = (defpackage.qwo) r6
            kotlinx.serialization.internal.PluginGeneratedSerialDescriptor r4 = defpackage.owo.b
            ph5 r5 = r5.b(r4)
            boolean r0 = r5.E()
            if (r0 != 0) goto L18
            java.lang.String r0 = r6.a
            java.lang.String r1 = "Opera"
            boolean r0 = kotlin.jvm.internal.Intrinsics.a(r0, r1)
            if (r0 != 0) goto L1e
        L18:
            java.lang.String r0 = r6.a
            r1 = 0
            r5.z(r4, r1, r0)
        L1e:
            boolean r0 = r5.E()
            if (r0 != 0) goto L2e
            java.lang.String r0 = r6.b
            java.lang.String r1 = defpackage.rxo.k
            boolean r0 = kotlin.jvm.internal.Intrinsics.a(r0, r1)
            if (r0 != 0) goto L34
        L2e:
            java.lang.String r0 = r6.b
            r1 = 1
            r5.z(r4, r1, r0)
        L34:
            boolean r0 = r5.E()
            r1 = 0
            if (r0 != 0) goto L4d
            java.lang.String r0 = r6.c
            c30 r2 = defpackage.fcp.c
            if (r2 == 0) goto L46
            kn[] r2 = defpackage.kn.a
            java.lang.String r2 = "admob"
            goto L47
        L46:
            r2 = r1
        L47:
            boolean r0 = kotlin.jvm.internal.Intrinsics.a(r0, r2)
            if (r0 != 0) goto L55
        L4d:
            xhk r0 = xhk.a
            java.lang.String r2 = r6.c
            r3 = 2
            r5.j(r4, r3, r0, r2)
        L55:
            boolean r0 = r5.E()
            if (r0 != 0) goto L6b
            java.lang.String r0 = r6.d
            c30 r2 = defpackage.fcp.c
            if (r2 == 0) goto L64
            java.lang.String r2 = r2.b
            goto L65
        L64:
            r2 = r1
        L65:
            boolean r0 = kotlin.jvm.internal.Intrinsics.a(r0, r2)
            if (r0 != 0) goto L73
        L6b:
            xhk r0 = xhk.a
            java.lang.String r2 = r6.d
            r3 = 3
            r5.j(r4, r3, r0, r2)
        L73:
            boolean r0 = r5.E()
            if (r0 != 0) goto L87
            java.lang.String r0 = r6.e
            c30 r2 = defpackage.fcp.c
            if (r2 == 0) goto L81
            java.lang.String r1 = "2.14.0.0"
        L81:
            boolean r0 = kotlin.jvm.internal.Intrinsics.a(r0, r1)
            if (r0 != 0) goto L8f
        L87:
            xhk r0 = xhk.a
            java.lang.String r1 = r6.e
            r2 = 4
            r5.j(r4, r2, r0, r1)
        L8f:
            boolean r0 = r5.E()
            if (r0 != 0) goto L99
            java.lang.String r0 = r6.f
            if (r0 == 0) goto La1
        L99:
            xhk r0 = xhk.a
            java.lang.String r1 = r6.f
            r2 = 5
            r5.j(r4, r2, r0, r1)
        La1:
            ecb r0 = ecb.a
            java.lang.Integer r6 = r6.g
            r1 = 6
            r5.j(r4, r1, r0, r6)
            r5.c(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.owo.serialize(kotlinx.serialization.encoding.Encoder, java.lang.Object):void");
    }

    public final KSerializer[] typeParametersSerializers() {
        return o0g.c;
    }
}
