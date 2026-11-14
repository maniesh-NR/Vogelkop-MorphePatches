package defpackage;

import com.leanplum.internal.Constants;
import com.leanplum.internal.ResourceQualifiers;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes.dex */
public final class svo implements iv9 {
    public static final svo a;
    public static final /* synthetic */ PluginGeneratedSerialDescriptor b;

    static {
        svo svoVar = new svo();
        a = svoVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.opera.ads.internal.analytics.AdBpisEvent", svoVar, 9);
        pluginGeneratedSerialDescriptor.k(Constants.Params.REQUEST_ID, false);
        pluginGeneratedSerialDescriptor.k("placementId", false);
        pluginGeneratedSerialDescriptor.k("crId", false);
        pluginGeneratedSerialDescriptor.k("adType", false);
        pluginGeneratedSerialDescriptor.k("s", true);
        pluginGeneratedSerialDescriptor.k("dl", true);
        pluginGeneratedSerialDescriptor.k("d", true);
        pluginGeneratedSerialDescriptor.k("hl", true);
        pluginGeneratedSerialDescriptor.k("b", true);
        b = pluginGeneratedSerialDescriptor;
    }

    public final KSerializer[] childSerializers() {
        KSerializer[] kSerializerArr = qxo.q;
        KSerializer kSerializer = xhk.a;
        return new KSerializer[]{kSerializer, kSerializer, kSerializer, kSerializerArr[3], f03.B(ecb.a), f03.B(kSerializer), f03.B(kSerializer), f03.B(kSerializerArr[7]), f03.B(kSerializer)};
    }

    public final Object deserialize(Decoder decoder) {
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
        oh5 oh5VarB = decoder.b(pluginGeneratedSerialDescriptor);
        KSerializer[] kSerializerArr = qxo.q;
        Object obj = null;
        boolean z = true;
        int i = 0;
        String strO = null;
        String strO2 = null;
        String strO3 = null;
        fuo fuoVar = null;
        Integer num = null;
        String str = null;
        String str2 = null;
        List list = null;
        String str3 = null;
        while (z) {
            int iP = oh5VarB.p(pluginGeneratedSerialDescriptor);
            switch (iP) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    strO = oh5VarB.o(pluginGeneratedSerialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    strO2 = oh5VarB.o(pluginGeneratedSerialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    strO3 = oh5VarB.o(pluginGeneratedSerialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    fuoVar = (fuo) oh5VarB.z(pluginGeneratedSerialDescriptor, 3, kSerializerArr[3]);
                    i |= 8;
                    break;
                case 4:
                    num = (Integer) oh5VarB.m(pluginGeneratedSerialDescriptor, 4, ecb.a);
                    i |= 16;
                    break;
                case 5:
                    str = (String) oh5VarB.m(pluginGeneratedSerialDescriptor, 5, xhk.a);
                    i |= 32;
                    break;
                case 6:
                    str2 = (String) oh5VarB.m(pluginGeneratedSerialDescriptor, 6, xhk.a);
                    i |= 64;
                    break;
                case 7:
                    list = (List) oh5VarB.m(pluginGeneratedSerialDescriptor, 7, kSerializerArr[7]);
                    i |= ResourceQualifiers.Qualifier.AnonymousClass5.SCREENLAYOUT_LAYOUTDIR_RTL;
                    break;
                case 8:
                    str3 = (String) oh5VarB.m(pluginGeneratedSerialDescriptor, 8, xhk.a);
                    i |= Constants.Crypt.KEY_LENGTH;
                    break;
                default:
                    t3p.d(iP);
                    return obj;
            }
            obj = null;
        }
        oh5VarB.c(pluginGeneratedSerialDescriptor);
        return new qxo(i, strO, strO2, strO3, fuoVar, num, str, str2, list, str3);
    }

    public final SerialDescriptor getDescriptor() {
        return b;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x007e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void serialize(kotlinx.serialization.encoding.Encoder r10, java.lang.Object r11) {
        /*
            r9 = this;
            qxo r11 = (defpackage.qxo) r11
            kotlinx.serialization.internal.PluginGeneratedSerialDescriptor r9 = defpackage.svo.b
            ph5 r10 = r10.b(r9)
            kotlinx.serialization.KSerializer[] r0 = defpackage.qxo.q
            java.lang.String r1 = r11.g
            java.lang.String r2 = r11.p
            java.util.List r3 = r11.o
            java.lang.String r4 = r11.n
            java.lang.String r5 = r11.m
            java.lang.Integer r6 = r11.l
            r7 = 0
            r10.z(r9, r7, r1)
            java.lang.String r1 = r11.h
            r7 = 1
            r10.z(r9, r7, r1)
            java.lang.String r1 = r11.i
            r7 = 2
            r10.z(r9, r7, r1)
            r1 = 3
            r7 = r0[r1]
            fuo r8 = r11.j
            r10.f(r9, r1, r7, r8)
            boolean r1 = r10.E()
            if (r1 != 0) goto L36
            if (r6 == 0) goto L3c
        L36:
            ecb r1 = ecb.a
            r7 = 4
            r10.j(r9, r7, r1, r6)
        L3c:
            boolean r1 = r10.E()
            if (r1 != 0) goto L44
            if (r5 == 0) goto L4a
        L44:
            xhk r1 = xhk.a
            r6 = 5
            r10.j(r9, r6, r1, r5)
        L4a:
            boolean r1 = r10.E()
            if (r1 != 0) goto L52
            if (r4 == 0) goto L58
        L52:
            xhk r1 = xhk.a
            r5 = 6
            r10.j(r9, r5, r1, r4)
        L58:
            boolean r1 = r10.E()
            if (r1 != 0) goto L60
            if (r3 == 0) goto L66
        L60:
            r1 = 7
            r0 = r0[r1]
            r10.j(r9, r1, r0, r3)
        L66:
            boolean r0 = r10.E()
            if (r0 != 0) goto L7e
            java.lang.String r11 = r11.k
            if (r11 == 0) goto L77
            r0 = 255(0xff, float:3.57E-43)
            java.lang.String r11 = pik.D(r0, r11)
            goto L78
        L77:
            r11 = 0
        L78:
            boolean r11 = kotlin.jvm.internal.Intrinsics.a(r2, r11)
            if (r11 != 0) goto L85
        L7e:
            xhk r11 = xhk.a
            r0 = 8
            r10.j(r9, r0, r11, r2)
        L85:
            r10.c(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.svo.serialize(kotlinx.serialization.encoding.Encoder, java.lang.Object):void");
    }

    public final KSerializer[] typeParametersSerializers() {
        return o0g.c;
    }
}
