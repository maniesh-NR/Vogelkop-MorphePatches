package defpackage;

import com.leanplum.internal.Constants;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes.dex */
public final class v3p implements iv9 {
    public static final v3p a;
    public static final /* synthetic */ PluginGeneratedSerialDescriptor b;

    static {
        v3p v3pVar = new v3p();
        a = v3pVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.opera.ads.internal.analytics.AdErrorEvent", v3pVar, 7);
        pluginGeneratedSerialDescriptor.k(Constants.Params.REQUEST_ID, false);
        pluginGeneratedSerialDescriptor.k("placementId", false);
        pluginGeneratedSerialDescriptor.k("crId", false);
        pluginGeneratedSerialDescriptor.k("connectionType", true);
        pluginGeneratedSerialDescriptor.k("vpn", true);
        pluginGeneratedSerialDescriptor.k("errorCode", false);
        pluginGeneratedSerialDescriptor.k(Constants.Params.MESSAGE, true);
        b = pluginGeneratedSerialDescriptor;
    }

    public final KSerializer[] childSerializers() {
        KSerializer kSerializer = xhk.a;
        return new KSerializer[]{kSerializer, f03.B(kSerializer), kSerializer, f03.B(kSerializer), f03.B(rn3.a), ecb.a, f03.B(kSerializer)};
    }

    public final Object deserialize(Decoder decoder) {
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
        oh5 oh5VarB = decoder.b(pluginGeneratedSerialDescriptor);
        boolean z = true;
        int i = 0;
        int iL = 0;
        String strO = null;
        String str = null;
        String strO2 = null;
        String str2 = null;
        Boolean bool = null;
        String str3 = null;
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
                    str = (String) oh5VarB.m(pluginGeneratedSerialDescriptor, 1, xhk.a);
                    i |= 2;
                    break;
                case 2:
                    strO2 = oh5VarB.o(pluginGeneratedSerialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    str2 = (String) oh5VarB.m(pluginGeneratedSerialDescriptor, 3, xhk.a);
                    i |= 8;
                    break;
                case 4:
                    bool = (Boolean) oh5VarB.m(pluginGeneratedSerialDescriptor, 4, rn3.a);
                    i |= 16;
                    break;
                case 5:
                    iL = oh5VarB.l(pluginGeneratedSerialDescriptor, 5);
                    i |= 32;
                    break;
                case 6:
                    str3 = (String) oh5VarB.m(pluginGeneratedSerialDescriptor, 6, xhk.a);
                    i |= 64;
                    break;
                default:
                    t3p.d(iP);
                    return null;
            }
        }
        oh5VarB.c(pluginGeneratedSerialDescriptor);
        return new r5p(i, strO, str, strO2, str2, bool, iL, str3);
    }

    public final SerialDescriptor getDescriptor() {
        return b;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void serialize(kotlinx.serialization.encoding.Encoder r7, java.lang.Object r8) {
        /*
            r6 = this;
            r5p r8 = (defpackage.r5p) r8
            kotlinx.serialization.internal.PluginGeneratedSerialDescriptor r6 = defpackage.v3p.b
            ph5 r7 = r7.b(r6)
            java.lang.String r0 = r8.g
            java.lang.String r1 = r8.n
            java.lang.Boolean r2 = r8.k
            java.lang.String r3 = r8.j
            r4 = 0
            r7.z(r6, r4, r0)
            xhk r0 = xhk.a
            java.lang.String r4 = r8.h
            r5 = 1
            r7.j(r6, r5, r0, r4)
            java.lang.String r4 = r8.i
            r5 = 2
            r7.z(r6, r5, r4)
            boolean r4 = r7.E()
            if (r4 != 0) goto L2a
            if (r3 == 0) goto L2e
        L2a:
            r4 = 3
            r7.j(r6, r4, r0, r3)
        L2e:
            boolean r3 = r7.E()
            if (r3 != 0) goto L36
            if (r2 == 0) goto L3c
        L36:
            rn3 r3 = rn3.a
            r4 = 4
            r7.j(r6, r4, r3, r2)
        L3c:
            int r2 = r8.l
            r3 = 5
            r7.v(r3, r2, r6)
            boolean r2 = r7.E()
            if (r2 != 0) goto L5a
            java.lang.String r8 = r8.m
            if (r8 == 0) goto L53
            r2 = 1024(0x400, float:1.435E-42)
            java.lang.String r8 = pik.D(r2, r8)
            goto L54
        L53:
            r8 = 0
        L54:
            boolean r8 = kotlin.jvm.internal.Intrinsics.a(r1, r8)
            if (r8 != 0) goto L5e
        L5a:
            r8 = 6
            r7.j(r6, r8, r0, r1)
        L5e:
            r7.c(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v3p.serialize(kotlinx.serialization.encoding.Encoder, java.lang.Object):void");
    }

    public final KSerializer[] typeParametersSerializers() {
        return o0g.c;
    }
}
