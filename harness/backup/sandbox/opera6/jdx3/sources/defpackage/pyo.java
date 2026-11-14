package defpackage;

import com.leanplum.internal.Constants;
import com.leanplum.internal.ResourceQualifiers;
import com.leanplum.utils.SizeUtil;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes.dex */
public final class pyo implements iv9 {
    public static final pyo a;
    public static final /* synthetic */ PluginGeneratedSerialDescriptor b;

    static {
        pyo pyoVar = new pyo();
        a = pyoVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.opera.ads.internal.data.DeviceObject", pyoVar, 22);
        pluginGeneratedSerialDescriptor.k("ua", false);
        pluginGeneratedSerialDescriptor.k("geo", false);
        pluginGeneratedSerialDescriptor.k("lmt", false);
        pluginGeneratedSerialDescriptor.k("ip", true);
        pluginGeneratedSerialDescriptor.k("devicetype", true);
        pluginGeneratedSerialDescriptor.k("make", false);
        pluginGeneratedSerialDescriptor.k("model", false);
        pluginGeneratedSerialDescriptor.k("os", false);
        pluginGeneratedSerialDescriptor.k("osv", false);
        pluginGeneratedSerialDescriptor.k("hwv", false);
        pluginGeneratedSerialDescriptor.k("w", false);
        pluginGeneratedSerialDescriptor.k("h", false);
        pluginGeneratedSerialDescriptor.k("ppi", false);
        pluginGeneratedSerialDescriptor.k("pxratio", false);
        pluginGeneratedSerialDescriptor.k("js", true);
        pluginGeneratedSerialDescriptor.k("geofetch", false);
        pluginGeneratedSerialDescriptor.k("language", true);
        pluginGeneratedSerialDescriptor.k("carrier", true);
        pluginGeneratedSerialDescriptor.k("mccmnc", true);
        pluginGeneratedSerialDescriptor.k("connectiontype", false);
        pluginGeneratedSerialDescriptor.k("ifa", true);
        pluginGeneratedSerialDescriptor.k("ext", false);
        b = pluginGeneratedSerialDescriptor;
    }

    public final KSerializer[] childSerializers() {
        KSerializer kSerializer = xhk.a;
        KSerializer kSerializerB = f03.B(kSerializer);
        KSerializer kSerializerB2 = f03.B(kSerializer);
        KSerializer kSerializerB3 = f03.B(kSerializer);
        KSerializer kSerializerB4 = f03.B(kSerializer);
        ecb ecbVar = ecb.a;
        return new KSerializer[]{kSerializer, yyo.a, ecbVar, kSerializer, ecbVar, kSerializer, kSerializer, kSerializer, kSerializer, kSerializer, ecbVar, ecbVar, ecbVar, v89.a, ecbVar, ecbVar, kSerializerB, kSerializerB2, kSerializerB3, ecbVar, kSerializerB4, uyo.a};
    }

    public final Object deserialize(Decoder decoder) {
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
        oh5 oh5VarB = decoder.b(pluginGeneratedSerialDescriptor);
        float fU = 0.0f;
        boolean z = true;
        int i = 0;
        String strO = null;
        azo azoVar = null;
        int iL = 0;
        String strO2 = null;
        int iL2 = 0;
        String strO3 = null;
        String strO4 = null;
        String strO5 = null;
        String strO6 = null;
        String strO7 = null;
        int iL3 = 0;
        int iL4 = 0;
        int iL5 = 0;
        int iL6 = 0;
        int iL7 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        int iL8 = 0;
        String str4 = null;
        wyo wyoVar = null;
        while (z) {
            int iP = oh5VarB.p(pluginGeneratedSerialDescriptor);
            int i2 = 4;
            int i3 = 8;
            int i4 = 16;
            switch (iP) {
                case -1:
                    z = false;
                case 0:
                    i4 = 1;
                    strO = oh5VarB.o(pluginGeneratedSerialDescriptor, 0);
                    i2 = i4;
                    i |= i2;
                case 1:
                    i3 = 2;
                    azoVar = (azo) oh5VarB.z(pluginGeneratedSerialDescriptor, 1, yyo.a);
                    i2 = i3;
                    i |= i2;
                case 2:
                    iL = oh5VarB.l(pluginGeneratedSerialDescriptor, 2);
                    i |= i2;
                case 3:
                    strO2 = oh5VarB.o(pluginGeneratedSerialDescriptor, 3);
                    i2 = i3;
                    i |= i2;
                case 4:
                    iL2 = oh5VarB.l(pluginGeneratedSerialDescriptor, 4);
                    i2 = i4;
                    i |= i2;
                case 5:
                    strO3 = oh5VarB.o(pluginGeneratedSerialDescriptor, 5);
                    i4 = 32;
                    i2 = i4;
                    i |= i2;
                case 6:
                    strO4 = oh5VarB.o(pluginGeneratedSerialDescriptor, 6);
                    i4 = 64;
                    i2 = i4;
                    i |= i2;
                case 7:
                    strO5 = oh5VarB.o(pluginGeneratedSerialDescriptor, 7);
                    i4 = ResourceQualifiers.Qualifier.AnonymousClass5.SCREENLAYOUT_LAYOUTDIR_RTL;
                    i2 = i4;
                    i |= i2;
                case 8:
                    strO6 = oh5VarB.o(pluginGeneratedSerialDescriptor, 8);
                    i4 = Constants.Crypt.KEY_LENGTH;
                    i2 = i4;
                    i |= i2;
                case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                    strO7 = oh5VarB.o(pluginGeneratedSerialDescriptor, 9);
                    i4 = 512;
                    i2 = i4;
                    i |= i2;
                case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                    iL3 = oh5VarB.l(pluginGeneratedSerialDescriptor, 10);
                    i4 = 1024;
                    i2 = i4;
                    i |= i2;
                case 11:
                    iL4 = oh5VarB.l(pluginGeneratedSerialDescriptor, 11);
                    i4 = 2048;
                    i2 = i4;
                    i |= i2;
                case 12:
                    iL5 = oh5VarB.l(pluginGeneratedSerialDescriptor, 12);
                    i4 = 4096;
                    i2 = i4;
                    i |= i2;
                case 13:
                    i4 = 8192;
                    fU = oh5VarB.u(pluginGeneratedSerialDescriptor, 13);
                    i2 = i4;
                    i |= i2;
                case 14:
                    iL6 = oh5VarB.l(pluginGeneratedSerialDescriptor, 14);
                    i4 = 16384;
                    i2 = i4;
                    i |= i2;
                case 15:
                    iL7 = oh5VarB.l(pluginGeneratedSerialDescriptor, 15);
                    i4 = 32768;
                    i2 = i4;
                    i |= i2;
                case 16:
                    str = (String) oh5VarB.m(pluginGeneratedSerialDescriptor, 16, xhk.a);
                    i4 = 65536;
                    i2 = i4;
                    i |= i2;
                case 17:
                    str2 = (String) oh5VarB.m(pluginGeneratedSerialDescriptor, 17, xhk.a);
                    i4 = 131072;
                    i2 = i4;
                    i |= i2;
                case SizeUtil.textSize0_1 /* 18 */:
                    str3 = (String) oh5VarB.m(pluginGeneratedSerialDescriptor, 18, xhk.a);
                    i4 = 262144;
                    i2 = i4;
                    i |= i2;
                case 19:
                    iL8 = oh5VarB.l(pluginGeneratedSerialDescriptor, 19);
                    i4 = 524288;
                    i2 = i4;
                    i |= i2;
                case SizeUtil.textSize0 /* 20 */:
                    str4 = (String) oh5VarB.m(pluginGeneratedSerialDescriptor, 20, xhk.a);
                    i4 = 1048576;
                    i2 = i4;
                    i |= i2;
                case 21:
                    wyoVar = (wyo) oh5VarB.z(pluginGeneratedSerialDescriptor, 21, uyo.a);
                    i4 = 2097152;
                    i2 = i4;
                    i |= i2;
                default:
                    t3p.d(iP);
                    return null;
            }
        }
        oh5VarB.c(pluginGeneratedSerialDescriptor);
        return new jzo(i, strO, azoVar, iL, strO2, iL2, strO3, strO4, strO5, strO6, strO7, iL3, iL4, iL5, fU, iL6, iL7, str, str2, str3, iL8, str4, wyoVar);
    }

    public final SerialDescriptor getDescriptor() {
        return b;
    }

    public final void serialize(Encoder encoder, Object obj) {
        jzo jzoVar = (jzo) obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
        ph5 ph5VarB = encoder.b(pluginGeneratedSerialDescriptor);
        String str = jzoVar.a;
        String str2 = jzoVar.u;
        String str3 = jzoVar.s;
        String str4 = jzoVar.r;
        String str5 = jzoVar.q;
        int i = jzoVar.o;
        int i2 = jzoVar.e;
        String str6 = jzoVar.d;
        ph5VarB.z(pluginGeneratedSerialDescriptor, 0, str);
        ph5VarB.f(pluginGeneratedSerialDescriptor, 1, yyo.a, jzoVar.b);
        ph5VarB.v(2, jzoVar.c, pluginGeneratedSerialDescriptor);
        if (ph5VarB.E() || !Intrinsics.a(str6, "127.0.0.1")) {
            ph5VarB.z(pluginGeneratedSerialDescriptor, 3, str6);
        }
        if (ph5VarB.E() || i2 != 1) {
            ph5VarB.v(4, i2, pluginGeneratedSerialDescriptor);
        }
        ph5VarB.z(pluginGeneratedSerialDescriptor, 5, jzoVar.f);
        ph5VarB.z(pluginGeneratedSerialDescriptor, 6, jzoVar.g);
        ph5VarB.z(pluginGeneratedSerialDescriptor, 7, jzoVar.h);
        ph5VarB.z(pluginGeneratedSerialDescriptor, 8, jzoVar.i);
        ph5VarB.z(pluginGeneratedSerialDescriptor, 9, jzoVar.j);
        ph5VarB.v(10, jzoVar.k, pluginGeneratedSerialDescriptor);
        ph5VarB.v(11, jzoVar.l, pluginGeneratedSerialDescriptor);
        ph5VarB.v(12, jzoVar.m, pluginGeneratedSerialDescriptor);
        ph5VarB.u(pluginGeneratedSerialDescriptor, 13, jzoVar.n);
        if (ph5VarB.E() || i != 1) {
            ph5VarB.v(14, i, pluginGeneratedSerialDescriptor);
        }
        ph5VarB.v(15, jzoVar.p, pluginGeneratedSerialDescriptor);
        if (ph5VarB.E() || str5 != null) {
            ph5VarB.j(pluginGeneratedSerialDescriptor, 16, xhk.a, str5);
        }
        if (ph5VarB.E() || str4 != null) {
            ph5VarB.j(pluginGeneratedSerialDescriptor, 17, xhk.a, str4);
        }
        if (ph5VarB.E() || str3 != null) {
            ph5VarB.j(pluginGeneratedSerialDescriptor, 18, xhk.a, str3);
        }
        ph5VarB.v(19, jzoVar.t, pluginGeneratedSerialDescriptor);
        if (ph5VarB.E() || str2 != null) {
            ph5VarB.j(pluginGeneratedSerialDescriptor, 20, xhk.a, str2);
        }
        ph5VarB.f(pluginGeneratedSerialDescriptor, 21, uyo.a, jzoVar.v);
        ph5VarB.c(pluginGeneratedSerialDescriptor);
    }

    public final KSerializer[] typeParametersSerializers() {
        return o0g.c;
    }
}
