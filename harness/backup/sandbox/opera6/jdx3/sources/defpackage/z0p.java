package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes.dex */
public final class z0p implements iv9 {
    public static final z0p a;
    public static final /* synthetic */ PluginGeneratedSerialDescriptor b;

    static {
        z0p z0pVar = new z0p();
        a = z0pVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.opera.ads.internal.analytics.SDKInitializeEvent", z0pVar, 7);
        pluginGeneratedSerialDescriptor.k("status", false);
        pluginGeneratedSerialDescriptor.k("duration", false);
        pluginGeneratedSerialDescriptor.k("reason", false);
        pluginGeneratedSerialDescriptor.k("medId", true);
        pluginGeneratedSerialDescriptor.k("medSdkVer", true);
        pluginGeneratedSerialDescriptor.k("medACN", true);
        pluginGeneratedSerialDescriptor.k("medAVer", true);
        b = pluginGeneratedSerialDescriptor;
    }

    public final KSerializer[] childSerializers() {
        xhk xhkVar = xhk.a;
        KSerializer kSerializerB = f03.B(xhkVar);
        KSerializer kSerializerB2 = f03.B(xhkVar);
        KSerializer kSerializerB3 = f03.B(xhkVar);
        KSerializer kSerializerB4 = f03.B(xhkVar);
        ecb ecbVar = ecb.a;
        return new KSerializer[]{ecbVar, ecbVar, ecbVar, kSerializerB, kSerializerB2, kSerializerB3, kSerializerB4};
    }

    public final Object deserialize(Decoder decoder) {
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
        oh5 oh5VarB = decoder.b(pluginGeneratedSerialDescriptor);
        boolean z = true;
        int i = 0;
        int iL = 0;
        int iL2 = 0;
        int iL3 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        while (z) {
            int iP = oh5VarB.p(pluginGeneratedSerialDescriptor);
            switch (iP) {
                case -1:
                    z = false;
                    break;
                case 0:
                    iL = oh5VarB.l(pluginGeneratedSerialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    iL2 = oh5VarB.l(pluginGeneratedSerialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    iL3 = oh5VarB.l(pluginGeneratedSerialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    str = (String) oh5VarB.m(pluginGeneratedSerialDescriptor, 3, xhk.a);
                    i |= 8;
                    break;
                case 4:
                    str2 = (String) oh5VarB.m(pluginGeneratedSerialDescriptor, 4, xhk.a);
                    i |= 16;
                    break;
                case 5:
                    str3 = (String) oh5VarB.m(pluginGeneratedSerialDescriptor, 5, xhk.a);
                    i |= 32;
                    break;
                case 6:
                    str4 = (String) oh5VarB.m(pluginGeneratedSerialDescriptor, 6, xhk.a);
                    i |= 64;
                    break;
                default:
                    t3p.d(iP);
                    return null;
            }
        }
        oh5VarB.c(pluginGeneratedSerialDescriptor);
        return new c1p(str, i, iL, str2, iL2, str3, iL3, str4);
    }

    public final SerialDescriptor getDescriptor() {
        return b;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void serialize(kotlinx.serialization.encoding.Encoder r5, java.lang.Object r6) {
        /*
            r4 = this;
            c1p r6 = (defpackage.c1p) r6
            kotlinx.serialization.internal.PluginGeneratedSerialDescriptor r4 = defpackage.z0p.b
            ph5 r5 = r5.b(r4)
            int r0 = r6.g
            r1 = 0
            r5.v(r1, r0, r4)
            int r0 = r6.h
            r1 = 1
            r5.v(r1, r0, r4)
            int r0 = r6.i
            r1 = 2
            r5.v(r1, r0, r4)
            boolean r0 = r5.E()
            r1 = 0
            if (r0 != 0) goto L33
            java.lang.String r0 = r6.j
            c30 r2 = defpackage.fcp.c
            if (r2 == 0) goto L2c
            kn[] r2 = defpackage.kn.a
            java.lang.String r2 = "admob"
            goto L2d
        L2c:
            r2 = r1
        L2d:
            boolean r0 = kotlin.jvm.internal.Intrinsics.a(r0, r2)
            if (r0 != 0) goto L3b
        L33:
            xhk r0 = xhk.a
            java.lang.String r2 = r6.j
            r3 = 3
            r5.j(r4, r3, r0, r2)
        L3b:
            boolean r0 = r5.E()
            if (r0 != 0) goto L51
            java.lang.String r0 = r6.k
            c30 r2 = defpackage.fcp.c
            if (r2 == 0) goto L4a
            java.lang.String r2 = r2.b
            goto L4b
        L4a:
            r2 = r1
        L4b:
            boolean r0 = kotlin.jvm.internal.Intrinsics.a(r0, r2)
            if (r0 != 0) goto L59
        L51:
            xhk r0 = xhk.a
            java.lang.String r2 = r6.k
            r3 = 4
            r5.j(r4, r3, r0, r2)
        L59:
            boolean r0 = r5.E()
            if (r0 != 0) goto L73
            java.lang.String r0 = r6.l
            c30 r2 = defpackage.fcp.c
            if (r2 == 0) goto L6c
            java.lang.Class<com.opera.ads.mediation.admob.OperaMediationAdapter> r2 = com.opera.ads.mediation.admob.OperaMediationAdapter.class
            java.lang.String r2 = r2.getName()
            goto L6d
        L6c:
            r2 = r1
        L6d:
            boolean r0 = kotlin.jvm.internal.Intrinsics.a(r0, r2)
            if (r0 != 0) goto L7b
        L73:
            xhk r0 = xhk.a
            java.lang.String r2 = r6.l
            r3 = 5
            r5.j(r4, r3, r0, r2)
        L7b:
            boolean r0 = r5.E()
            if (r0 != 0) goto L8f
            java.lang.String r0 = r6.m
            c30 r2 = defpackage.fcp.c
            if (r2 == 0) goto L89
            java.lang.String r1 = "2.14.0.0"
        L89:
            boolean r0 = kotlin.jvm.internal.Intrinsics.a(r0, r1)
            if (r0 != 0) goto L97
        L8f:
            xhk r0 = xhk.a
            java.lang.String r6 = r6.m
            r1 = 6
            r5.j(r4, r1, r0, r6)
        L97:
            r5.c(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z0p.serialize(kotlinx.serialization.encoding.Encoder, java.lang.Object):void");
    }

    public final KSerializer[] typeParametersSerializers() {
        return o0g.c;
    }
}
