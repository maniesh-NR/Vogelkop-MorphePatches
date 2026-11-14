package defpackage;

import com.leanplum.internal.Constants;
import com.leanplum.internal.ResourceQualifiers;
import com.leanplum.utils.SizeUtil;
import java.util.List;
import java.util.Set;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.json.c;

/* loaded from: classes.dex */
public final class b8p implements iv9 {
    public static final b8p a;
    public static final /* synthetic */ PluginGeneratedSerialDescriptor b;

    static {
        b8p b8pVar = new b8p();
        a = b8pVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.opera.ads.internal.SdkConfig", b8pVar, 28);
        pluginGeneratedSerialDescriptor.k("update_interval", true);
        pluginGeneratedSerialDescriptor.k("bg_cancel_delay", true);
        pluginGeneratedSerialDescriptor.k("max_blocked_ads", true);
        pluginGeneratedSerialDescriptor.k("blocked_ad_expires", true);
        pluginGeneratedSerialDescriptor.k("browser_prioritized_list", true);
        pluginGeneratedSerialDescriptor.k("browser_whitelist", true);
        pluginGeneratedSerialDescriptor.k("browser_blacklist", true);
        pluginGeneratedSerialDescriptor.k("banner_auto_refresh_interval", true);
        pluginGeneratedSerialDescriptor.k("banner_transition_content_ready_timeout", true);
        pluginGeneratedSerialDescriptor.k("accepts_coea", true);
        pluginGeneratedSerialDescriptor.k("oac_enabled", true);
        pluginGeneratedSerialDescriptor.k("oac_whitelist", true);
        pluginGeneratedSerialDescriptor.k("oac_blacklist", true);
        pluginGeneratedSerialDescriptor.k("oac_error_enabled", true);
        pluginGeneratedSerialDescriptor.k("oac_error_whitelist", true);
        pluginGeneratedSerialDescriptor.k("oac_error_blacklist", true);
        pluginGeneratedSerialDescriptor.k("oac_bpis_throttle_interval", true);
        pluginGeneratedSerialDescriptor.k("oac_report_click_coords", true);
        pluginGeneratedSerialDescriptor.k("interstitial_enable_back_button_interval", true);
        pluginGeneratedSerialDescriptor.k("appopen_enable_back_button_interval", true);
        pluginGeneratedSerialDescriptor.k("indexurl_domains", true);
        pluginGeneratedSerialDescriptor.k("authorized_domains", true);
        pluginGeneratedSerialDescriptor.k("aqurl", true);
        pluginGeneratedSerialDescriptor.k("ab_group", true);
        pluginGeneratedSerialDescriptor.k("ab_tpl_indexurl", true);
        pluginGeneratedSerialDescriptor.k("ab_tpl_settings", true);
        pluginGeneratedSerialDescriptor.k("geofetch_enabled", true);
        pluginGeneratedSerialDescriptor.k("sf_clint_enabled", true);
        b = pluginGeneratedSerialDescriptor;
    }

    public final KSerializer[] childSerializers() {
        KSerializer[] kSerializerArr = z8p.L;
        KSerializer kSerializerB = f03.B(kSerializerArr[4]);
        KSerializer kSerializerB2 = f03.B(kSerializerArr[5]);
        KSerializer kSerializerB3 = f03.B(kSerializerArr[6]);
        KSerializer kSerializerB4 = f03.B(kSerializerArr[11]);
        KSerializer kSerializerB5 = f03.B(kSerializerArr[12]);
        KSerializer kSerializerB6 = f03.B(kSerializerArr[14]);
        KSerializer kSerializerB7 = f03.B(kSerializerArr[15]);
        KSerializer kSerializerB8 = f03.B(kSerializerArr[20]);
        KSerializer kSerializerB9 = f03.B(kSerializerArr[21]);
        xhk xhkVar = xhk.a;
        KSerializer kSerializerB10 = f03.B(xhkVar);
        KSerializer kSerializerB11 = f03.B(xhkVar);
        KSerializer kSerializerB12 = f03.B(xhkVar);
        KSerializer kSerializerB13 = f03.B(kno.a);
        ecb ecbVar = ecb.a;
        oe7 oe7Var = oe7.a;
        rn3 rn3Var = rn3.a;
        return new KSerializer[]{ecbVar, ecbVar, ecbVar, oe7Var, kSerializerB, kSerializerB2, kSerializerB3, ecbVar, ecbVar, rn3Var, rn3Var, kSerializerB4, kSerializerB5, rn3Var, kSerializerB6, kSerializerB7, oe7Var, rn3Var, ecbVar, ecbVar, kSerializerB8, kSerializerB9, kSerializerB10, kSerializerB11, kSerializerB12, kSerializerB13, rn3Var, rn3Var};
    }

    public final Object deserialize(Decoder decoder) {
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
        oh5 oh5VarB = decoder.b(pluginGeneratedSerialDescriptor);
        KSerializer[] kSerializerArr = z8p.L;
        double dE = 0.0d;
        double dE2 = 0.0d;
        boolean z = true;
        int i = 0;
        int iL = 0;
        int iL2 = 0;
        int iL3 = 0;
        List list = null;
        Set set = null;
        Set set2 = null;
        int iL4 = 0;
        int iL5 = 0;
        boolean zC = false;
        boolean zC2 = false;
        Set set3 = null;
        Set set4 = null;
        boolean zC3 = false;
        Set set5 = null;
        Set set6 = null;
        boolean zC4 = false;
        int iL6 = 0;
        int iL7 = 0;
        Set set7 = null;
        Set set8 = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        c cVar = null;
        boolean zC5 = false;
        boolean zC6 = false;
        while (z) {
            int iP = oh5VarB.p(pluginGeneratedSerialDescriptor);
            int i2 = 2;
            int i3 = 4;
            switch (iP) {
                case -1:
                    z = false;
                case 0:
                    i3 = 1;
                    iL = oh5VarB.l(pluginGeneratedSerialDescriptor, 0);
                    i2 = i3;
                    i |= i2;
                case 1:
                    iL2 = oh5VarB.l(pluginGeneratedSerialDescriptor, 1);
                    i |= i2;
                case 2:
                    iL3 = oh5VarB.l(pluginGeneratedSerialDescriptor, 2);
                    i2 = i3;
                    i |= i2;
                case 3:
                    dE = oh5VarB.E(pluginGeneratedSerialDescriptor, 3);
                    i2 = 8;
                    i |= i2;
                case 4:
                    list = (List) oh5VarB.m(pluginGeneratedSerialDescriptor, 4, kSerializerArr[4]);
                    i2 = 16;
                    i |= i2;
                case 5:
                    set = (Set) oh5VarB.m(pluginGeneratedSerialDescriptor, 5, kSerializerArr[5]);
                    i2 = 32;
                    i |= i2;
                case 6:
                    set2 = (Set) oh5VarB.m(pluginGeneratedSerialDescriptor, 6, kSerializerArr[6]);
                    i2 = 64;
                    i |= i2;
                case 7:
                    iL4 = oh5VarB.l(pluginGeneratedSerialDescriptor, 7);
                    i2 = ResourceQualifiers.Qualifier.AnonymousClass5.SCREENLAYOUT_LAYOUTDIR_RTL;
                    i |= i2;
                case 8:
                    iL5 = oh5VarB.l(pluginGeneratedSerialDescriptor, 8);
                    i2 = Constants.Crypt.KEY_LENGTH;
                    i |= i2;
                case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                    zC = oh5VarB.C(pluginGeneratedSerialDescriptor, 9);
                    i2 = 512;
                    i |= i2;
                case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                    zC2 = oh5VarB.C(pluginGeneratedSerialDescriptor, 10);
                    i2 = 1024;
                    i |= i2;
                case 11:
                    set3 = (Set) oh5VarB.m(pluginGeneratedSerialDescriptor, 11, kSerializerArr[11]);
                    i2 = 2048;
                    i |= i2;
                case 12:
                    set4 = (Set) oh5VarB.m(pluginGeneratedSerialDescriptor, 12, kSerializerArr[12]);
                    i2 = 4096;
                    i |= i2;
                case 13:
                    zC3 = oh5VarB.C(pluginGeneratedSerialDescriptor, 13);
                    i2 = 8192;
                    i |= i2;
                case 14:
                    set5 = (Set) oh5VarB.m(pluginGeneratedSerialDescriptor, 14, kSerializerArr[14]);
                    i2 = 16384;
                    i |= i2;
                case 15:
                    set6 = (Set) oh5VarB.m(pluginGeneratedSerialDescriptor, 15, kSerializerArr[15]);
                    i2 = 32768;
                    i |= i2;
                case 16:
                    dE2 = oh5VarB.E(pluginGeneratedSerialDescriptor, 16);
                    i2 = 65536;
                    i |= i2;
                case 17:
                    zC4 = oh5VarB.C(pluginGeneratedSerialDescriptor, 17);
                    i2 = 131072;
                    i |= i2;
                case SizeUtil.textSize0_1 /* 18 */:
                    iL6 = oh5VarB.l(pluginGeneratedSerialDescriptor, 18);
                    i2 = 262144;
                    i |= i2;
                case 19:
                    iL7 = oh5VarB.l(pluginGeneratedSerialDescriptor, 19);
                    i2 = 524288;
                    i |= i2;
                case SizeUtil.textSize0 /* 20 */:
                    set7 = (Set) oh5VarB.m(pluginGeneratedSerialDescriptor, 20, kSerializerArr[20]);
                    i2 = 1048576;
                    i |= i2;
                case 21:
                    set8 = (Set) oh5VarB.m(pluginGeneratedSerialDescriptor, 21, kSerializerArr[21]);
                    i2 = 2097152;
                    i |= i2;
                case SizeUtil.textSize1 /* 22 */:
                    str = (String) oh5VarB.m(pluginGeneratedSerialDescriptor, 22, xhk.a);
                    i2 = 4194304;
                    i |= i2;
                case 23:
                    str2 = (String) oh5VarB.m(pluginGeneratedSerialDescriptor, 23, xhk.a);
                    i2 = 8388608;
                    i |= i2;
                case SizeUtil.textSize2 /* 24 */:
                    str3 = (String) oh5VarB.m(pluginGeneratedSerialDescriptor, 24, xhk.a);
                    i2 = 16777216;
                    i |= i2;
                case 25:
                    cVar = (c) oh5VarB.m(pluginGeneratedSerialDescriptor, 25, kno.a);
                    i2 = 33554432;
                    i |= i2;
                case 26:
                    zC5 = oh5VarB.C(pluginGeneratedSerialDescriptor, 26);
                    i2 = 67108864;
                    i |= i2;
                case 27:
                    zC6 = oh5VarB.C(pluginGeneratedSerialDescriptor, 27);
                    i2 = 134217728;
                    i |= i2;
                default:
                    t3p.d(iP);
                    return null;
            }
        }
        oh5VarB.c(pluginGeneratedSerialDescriptor);
        return new z8p(i, iL, iL2, iL3, dE, list, set, set2, iL4, iL5, zC, zC2, set3, set4, zC3, set5, set6, dE2, zC4, iL6, iL7, set7, set8, str, str2, str3, cVar, zC5, zC6);
    }

    public final SerialDescriptor getDescriptor() {
        return b;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void serialize(kotlinx.serialization.encoding.Encoder r10, java.lang.Object r11) {
        /*
            Method dump skipped, instructions count: 576
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b8p.serialize(kotlinx.serialization.encoding.Encoder, java.lang.Object):void");
    }

    public final KSerializer[] typeParametersSerializers() {
        return o0g.c;
    }
}
