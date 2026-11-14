package defpackage;

import com.leanplum.internal.Constants;
import com.leanplum.internal.ResourceQualifiers;
import com.leanplum.utils.SizeUtil;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final /* synthetic */ class q3f implements iv9 {
    public static final q3f a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        q3f q3fVar = new q3f();
        a = q3fVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.opera.android.ntp.NtpRequest", q3fVar, 24);
        pluginGeneratedSerialDescriptor.k("timestamp", true);
        pluginGeneratedSerialDescriptor.k("homeCountryCode", false);
        pluginGeneratedSerialDescriptor.k("languageCode", false);
        pluginGeneratedSerialDescriptor.k("platformName", false);
        pluginGeneratedSerialDescriptor.k("latestOperatorName", false);
        pluginGeneratedSerialDescriptor.k("brandName", false);
        pluginGeneratedSerialDescriptor.k("advertisingId", true);
        pluginGeneratedSerialDescriptor.k("huid", true);
        pluginGeneratedSerialDescriptor.k("userConsent", false);
        pluginGeneratedSerialDescriptor.k("id", false);
        pluginGeneratedSerialDescriptor.k("origin", false);
        pluginGeneratedSerialDescriptor.k("epochMilliseconds", false);
        pluginGeneratedSerialDescriptor.k("productName", false);
        pluginGeneratedSerialDescriptor.k("configBundle", false);
        pluginGeneratedSerialDescriptor.k("referrerSource", true);
        pluginGeneratedSerialDescriptor.k("appVersion", false);
        pluginGeneratedSerialDescriptor.k("referrerCampaign", true);
        pluginGeneratedSerialDescriptor.k("userPlan", true);
        pluginGeneratedSerialDescriptor.k("abGroup", true);
        pluginGeneratedSerialDescriptor.k("cryptoWalletEnabled", true);
        pluginGeneratedSerialDescriptor.k("preferredImageWidth", true);
        pluginGeneratedSerialDescriptor.k("dmpSegmentsIds", true);
        pluginGeneratedSerialDescriptor.k("isAdult", true);
        pluginGeneratedSerialDescriptor.k("installationDate", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final KSerializer[] childSerializers() {
        l4c[] l4cVarArr = s3f.y;
        xhk xhkVar = xhk.a;
        h1d h1dVar = h1d.a;
        rn3 rn3Var = rn3.a;
        return new KSerializer[]{f03.B(xhkVar), xhkVar, xhkVar, xhkVar, xhkVar, xhkVar, f03.B(xhkVar), f03.B(xhkVar), xhkVar, xhkVar, l4cVarArr[10].getValue(), h1dVar, xhkVar, xhkVar, f03.B(xhkVar), xhkVar, f03.B(xhkVar), f03.B(xhkVar), f03.B(xhkVar), f03.B(rn3Var), f03.B(ecb.a), f03.B((KSerializer) l4cVarArr[21].getValue()), f03.B(rn3Var), f03.B(h1dVar)};
    }

    public final Object deserialize(Decoder decoder) {
        int i;
        SerialDescriptor serialDescriptor = descriptor;
        oh5 oh5VarB = decoder.b(serialDescriptor);
        l4c[] l4cVarArr = s3f.y;
        int i2 = 0;
        String str = null;
        String strO = null;
        String strO2 = null;
        String strO3 = null;
        String strO4 = null;
        String strO5 = null;
        String str2 = null;
        String str3 = null;
        String strO6 = null;
        String strO7 = null;
        swh swhVar = null;
        String strO8 = null;
        String strO9 = null;
        String str4 = null;
        String strO10 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        Boolean bool = null;
        Integer num = null;
        List list = null;
        Boolean bool2 = null;
        Long l = null;
        long jG = 0;
        boolean z = true;
        while (z) {
            int iP = oh5VarB.p(serialDescriptor);
            switch (iP) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    str = (String) oh5VarB.m(serialDescriptor, 0, xhk.a);
                    i2 |= 1;
                    continue;
                case 1:
                    strO = oh5VarB.o(serialDescriptor, 1);
                    i2 |= 2;
                    continue;
                case 2:
                    strO2 = oh5VarB.o(serialDescriptor, 2);
                    i2 |= 4;
                    continue;
                case 3:
                    strO3 = oh5VarB.o(serialDescriptor, 3);
                    i2 |= 8;
                    continue;
                case 4:
                    strO4 = oh5VarB.o(serialDescriptor, 4);
                    i2 |= 16;
                    continue;
                case 5:
                    strO5 = oh5VarB.o(serialDescriptor, 5);
                    i2 |= 32;
                    continue;
                case 6:
                    str2 = (String) oh5VarB.m(serialDescriptor, 6, xhk.a);
                    i2 |= 64;
                    continue;
                case 7:
                    str3 = (String) oh5VarB.m(serialDescriptor, 7, xhk.a);
                    i2 |= ResourceQualifiers.Qualifier.AnonymousClass5.SCREENLAYOUT_LAYOUTDIR_RTL;
                    continue;
                case 8:
                    strO6 = oh5VarB.o(serialDescriptor, 8);
                    i2 |= Constants.Crypt.KEY_LENGTH;
                    continue;
                case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                    strO7 = oh5VarB.o(serialDescriptor, 9);
                    i2 |= 512;
                    continue;
                case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                    swhVar = (swh) oh5VarB.z(serialDescriptor, 10, (KSerializer) l4cVarArr[10].getValue());
                    i2 |= 1024;
                    continue;
                case 11:
                    jG = oh5VarB.g(serialDescriptor, 11);
                    i2 |= 2048;
                    continue;
                case 12:
                    strO8 = oh5VarB.o(serialDescriptor, 12);
                    i2 |= 4096;
                    continue;
                case 13:
                    strO9 = oh5VarB.o(serialDescriptor, 13);
                    i2 |= 8192;
                    continue;
                case 14:
                    str4 = (String) oh5VarB.m(serialDescriptor, 14, xhk.a);
                    i2 |= 16384;
                    continue;
                case 15:
                    strO10 = oh5VarB.o(serialDescriptor, 15);
                    i = 32768;
                    break;
                case 16:
                    str5 = (String) oh5VarB.m(serialDescriptor, 16, xhk.a);
                    i = 65536;
                    break;
                case 17:
                    str6 = (String) oh5VarB.m(serialDescriptor, 17, xhk.a);
                    i = 131072;
                    break;
                case SizeUtil.textSize0_1 /* 18 */:
                    str7 = (String) oh5VarB.m(serialDescriptor, 18, xhk.a);
                    i = 262144;
                    break;
                case 19:
                    bool = (Boolean) oh5VarB.m(serialDescriptor, 19, rn3.a);
                    i = 524288;
                    break;
                case SizeUtil.textSize0 /* 20 */:
                    num = (Integer) oh5VarB.m(serialDescriptor, 20, ecb.a);
                    i = 1048576;
                    break;
                case 21:
                    list = (List) oh5VarB.m(serialDescriptor, 21, (KSerializer) l4cVarArr[21].getValue());
                    i = 2097152;
                    break;
                case SizeUtil.textSize1 /* 22 */:
                    bool2 = (Boolean) oh5VarB.m(serialDescriptor, 22, rn3.a);
                    i = 4194304;
                    break;
                case 23:
                    l = (Long) oh5VarB.m(serialDescriptor, 23, h1d.a);
                    i = 8388608;
                    break;
                default:
                    t3p.d(iP);
                    return null;
            }
            i2 |= i;
        }
        oh5VarB.c(serialDescriptor);
        return new s3f(i2, str, strO, strO2, strO3, strO4, strO5, str2, str3, strO6, strO7, swhVar, jG, strO8, strO9, str4, strO10, str5, str6, str7, bool, num, list, bool2, l);
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public final void serialize(Encoder encoder, Object obj) {
        s3f s3fVar = (s3f) obj;
        SerialDescriptor serialDescriptor = descriptor;
        ph5 ph5VarB = encoder.b(serialDescriptor);
        l4c[] l4cVarArr = s3f.y;
        if (ph5VarB.E() || s3fVar.a != null) {
            ph5VarB.j(serialDescriptor, 0, xhk.a, s3fVar.a);
        }
        String str = s3fVar.b;
        Long l = s3fVar.x;
        Boolean bool = s3fVar.w;
        List list = s3fVar.v;
        Integer num = s3fVar.u;
        Boolean bool2 = s3fVar.t;
        String str2 = s3fVar.s;
        String str3 = s3fVar.r;
        String str4 = s3fVar.q;
        String str5 = s3fVar.o;
        String str6 = s3fVar.h;
        String str7 = s3fVar.g;
        ph5VarB.z(serialDescriptor, 1, str);
        ph5VarB.z(serialDescriptor, 2, s3fVar.c);
        ph5VarB.z(serialDescriptor, 3, s3fVar.d);
        ph5VarB.z(serialDescriptor, 4, s3fVar.e);
        ph5VarB.z(serialDescriptor, 5, s3fVar.f);
        if (ph5VarB.E() || str7 != null) {
            ph5VarB.j(serialDescriptor, 6, xhk.a, str7);
        }
        if (ph5VarB.E() || str6 != null) {
            ph5VarB.j(serialDescriptor, 7, xhk.a, str6);
        }
        ph5VarB.z(serialDescriptor, 8, s3fVar.i);
        ph5VarB.z(serialDescriptor, 9, s3fVar.j);
        ph5VarB.f(serialDescriptor, 10, (KSerializer) l4cVarArr[10].getValue(), s3fVar.k);
        ph5VarB.F(serialDescriptor, 11, s3fVar.l);
        ph5VarB.z(serialDescriptor, 12, s3fVar.m);
        ph5VarB.z(serialDescriptor, 13, s3fVar.n);
        if (ph5VarB.E() || str5 != null) {
            ph5VarB.j(serialDescriptor, 14, xhk.a, str5);
        }
        ph5VarB.z(serialDescriptor, 15, s3fVar.p);
        if (ph5VarB.E() || str4 != null) {
            ph5VarB.j(serialDescriptor, 16, xhk.a, str4);
        }
        if (ph5VarB.E() || str3 != null) {
            ph5VarB.j(serialDescriptor, 17, xhk.a, str3);
        }
        if (ph5VarB.E() || str2 != null) {
            ph5VarB.j(serialDescriptor, 18, xhk.a, str2);
        }
        if (ph5VarB.E() || bool2 != null) {
            ph5VarB.j(serialDescriptor, 19, rn3.a, bool2);
        }
        if (ph5VarB.E() || num != null) {
            ph5VarB.j(serialDescriptor, 20, ecb.a, num);
        }
        if (ph5VarB.E() || list != null) {
            ph5VarB.j(serialDescriptor, 21, (KSerializer) l4cVarArr[21].getValue(), list);
        }
        if (ph5VarB.E() || bool != null) {
            ph5VarB.j(serialDescriptor, 22, rn3.a, bool);
        }
        if (ph5VarB.E() || l != null) {
            ph5VarB.j(serialDescriptor, 23, h1d.a, l);
        }
        ph5VarB.c(serialDescriptor);
    }
}
