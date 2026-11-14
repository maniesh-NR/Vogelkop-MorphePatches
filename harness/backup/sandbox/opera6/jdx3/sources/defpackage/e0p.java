package defpackage;

import com.leanplum.internal.Constants;
import com.leanplum.internal.ResourceQualifiers;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes.dex */
public final class e0p implements iv9 {
    public static final e0p a;
    public static final /* synthetic */ PluginGeneratedSerialDescriptor b;

    static {
        e0p e0pVar = new e0p();
        a = e0pVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.opera.ads.internal.data.ImpObject", e0pVar, 13);
        pluginGeneratedSerialDescriptor.k("id", false);
        pluginGeneratedSerialDescriptor.k("banner", true);
        pluginGeneratedSerialDescriptor.k("video", true);
        pluginGeneratedSerialDescriptor.k("native", true);
        pluginGeneratedSerialDescriptor.k("displaymanager", true);
        pluginGeneratedSerialDescriptor.k("displaymanagerver", true);
        pluginGeneratedSerialDescriptor.k("instl", false);
        pluginGeneratedSerialDescriptor.k("tagid", false);
        pluginGeneratedSerialDescriptor.k("clickbrowser", true);
        pluginGeneratedSerialDescriptor.k("secure", true);
        pluginGeneratedSerialDescriptor.k("rwdd", false);
        pluginGeneratedSerialDescriptor.k("exp", true);
        pluginGeneratedSerialDescriptor.k("ext", false);
        b = pluginGeneratedSerialDescriptor;
    }

    public final KSerializer[] childSerializers() {
        KSerializer kSerializerB = f03.B(g0p.a);
        KSerializer kSerializerB2 = f03.B(w0p.a);
        KSerializer kSerializerB3 = f03.B(t0p.a);
        KSerializer kSerializerB4 = f03.B(q0p.a);
        xhk xhkVar = xhk.a;
        ecb ecbVar = ecb.a;
        return new KSerializer[]{xhkVar, kSerializerB, kSerializerB2, kSerializerB3, xhkVar, xhkVar, ecbVar, xhkVar, ecbVar, ecbVar, ecbVar, ecbVar, kSerializerB4};
    }

    public final Object deserialize(Decoder decoder) {
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
        oh5 oh5VarB = decoder.b(pluginGeneratedSerialDescriptor);
        Object obj = null;
        boolean z = true;
        int i = 0;
        int iL = 0;
        int iL2 = 0;
        int iL3 = 0;
        int iL4 = 0;
        int iL5 = 0;
        String strO = null;
        k0p k0pVar = null;
        y0p y0pVar = null;
        v0p v0pVar = null;
        String strO2 = null;
        String strO3 = null;
        String strO4 = null;
        s0p s0pVar = null;
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
                    k0pVar = (k0p) oh5VarB.m(pluginGeneratedSerialDescriptor, 1, g0p.a);
                    i |= 2;
                    break;
                case 2:
                    y0pVar = (y0p) oh5VarB.m(pluginGeneratedSerialDescriptor, 2, w0p.a);
                    i |= 4;
                    break;
                case 3:
                    v0pVar = (v0p) oh5VarB.m(pluginGeneratedSerialDescriptor, 3, t0p.a);
                    i |= 8;
                    break;
                case 4:
                    strO2 = oh5VarB.o(pluginGeneratedSerialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    strO3 = oh5VarB.o(pluginGeneratedSerialDescriptor, 5);
                    i |= 32;
                    break;
                case 6:
                    iL = oh5VarB.l(pluginGeneratedSerialDescriptor, 6);
                    i |= 64;
                    break;
                case 7:
                    strO4 = oh5VarB.o(pluginGeneratedSerialDescriptor, 7);
                    i |= ResourceQualifiers.Qualifier.AnonymousClass5.SCREENLAYOUT_LAYOUTDIR_RTL;
                    break;
                case 8:
                    iL2 = oh5VarB.l(pluginGeneratedSerialDescriptor, 8);
                    i |= Constants.Crypt.KEY_LENGTH;
                    break;
                case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                    iL3 = oh5VarB.l(pluginGeneratedSerialDescriptor, 9);
                    i |= 512;
                    break;
                case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                    iL4 = oh5VarB.l(pluginGeneratedSerialDescriptor, 10);
                    i |= 1024;
                    break;
                case 11:
                    iL5 = oh5VarB.l(pluginGeneratedSerialDescriptor, 11);
                    i |= 2048;
                    break;
                case 12:
                    s0pVar = (s0p) oh5VarB.m(pluginGeneratedSerialDescriptor, 12, q0p.a);
                    i |= 4096;
                    break;
                default:
                    t3p.d(iP);
                    return obj;
            }
            obj = null;
        }
        oh5VarB.c(pluginGeneratedSerialDescriptor);
        return new j1p(i, strO, k0pVar, y0pVar, v0pVar, strO2, strO3, iL, strO4, iL2, iL3, iL4, iL5, s0pVar);
    }

    public final SerialDescriptor getDescriptor() {
        return b;
    }

    public final void serialize(Encoder encoder, Object obj) {
        j1p j1pVar = (j1p) obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
        ph5 ph5VarB = encoder.b(pluginGeneratedSerialDescriptor);
        String str = j1pVar.a;
        int i = j1pVar.l;
        int i2 = j1pVar.j;
        int i3 = j1pVar.i;
        String str2 = j1pVar.f;
        String str3 = j1pVar.e;
        v0p v0pVar = j1pVar.d;
        y0p y0pVar = j1pVar.c;
        k0p k0pVar = j1pVar.b;
        ph5VarB.z(pluginGeneratedSerialDescriptor, 0, str);
        if (ph5VarB.E() || k0pVar != null) {
            ph5VarB.j(pluginGeneratedSerialDescriptor, 1, g0p.a, k0pVar);
        }
        if (ph5VarB.E() || y0pVar != null) {
            ph5VarB.j(pluginGeneratedSerialDescriptor, 2, w0p.a, y0pVar);
        }
        if (ph5VarB.E() || v0pVar != null) {
            ph5VarB.j(pluginGeneratedSerialDescriptor, 3, t0p.a, v0pVar);
        }
        if (ph5VarB.E() || !Intrinsics.a(str3, "Opera")) {
            ph5VarB.z(pluginGeneratedSerialDescriptor, 4, str3);
        }
        if (ph5VarB.E() || !Intrinsics.a(str2, "2.14.0")) {
            ph5VarB.z(pluginGeneratedSerialDescriptor, 5, str2);
        }
        ph5VarB.v(6, j1pVar.g, pluginGeneratedSerialDescriptor);
        ph5VarB.z(pluginGeneratedSerialDescriptor, 7, j1pVar.h);
        if (ph5VarB.E() || i3 != 1) {
            ph5VarB.v(8, i3, pluginGeneratedSerialDescriptor);
        }
        if (ph5VarB.E() || i2 != 1) {
            ph5VarB.v(9, i2, pluginGeneratedSerialDescriptor);
        }
        ph5VarB.v(10, j1pVar.k, pluginGeneratedSerialDescriptor);
        if (ph5VarB.E() || i != 3600) {
            ph5VarB.v(11, i, pluginGeneratedSerialDescriptor);
        }
        ph5VarB.j(pluginGeneratedSerialDescriptor, 12, q0p.a, j1pVar.m);
        ph5VarB.c(pluginGeneratedSerialDescriptor);
    }

    public final KSerializer[] typeParametersSerializers() {
        return o0g.c;
    }
}
