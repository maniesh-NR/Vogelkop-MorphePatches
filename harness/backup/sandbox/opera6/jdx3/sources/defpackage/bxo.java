package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes.dex */
public final class bxo implements iv9 {
    public static final bxo a;
    public static final /* synthetic */ PluginGeneratedSerialDescriptor b;

    static {
        bxo bxoVar = new bxo();
        a = bxoVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.opera.ads.internal.analytics.PostBody", bxoVar, 6);
        pluginGeneratedSerialDescriptor.k("sdkVer", true);
        pluginGeneratedSerialDescriptor.k("sdkSession", true);
        pluginGeneratedSerialDescriptor.k("app", false);
        pluginGeneratedSerialDescriptor.k("device", false);
        pluginGeneratedSerialDescriptor.k("user", false);
        pluginGeneratedSerialDescriptor.k("events", false);
        b = pluginGeneratedSerialDescriptor;
    }

    public final KSerializer[] childSerializers() {
        KSerializer kSerializer = exo.g[5];
        xhk xhkVar = xhk.a;
        return new KSerializer[]{xhkVar, xhkVar, mto.a, pyo.a, two.a, kSerializer};
    }

    public final Object deserialize(Decoder decoder) {
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
        oh5 oh5VarB = decoder.b(pluginGeneratedSerialDescriptor);
        KSerializer[] kSerializerArr = exo.g;
        boolean z = true;
        int i = 0;
        String strO = null;
        String strO2 = null;
        huo huoVar = null;
        jzo jzoVar = null;
        wwo wwoVar = null;
        List list = null;
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
                    huoVar = (huo) oh5VarB.z(pluginGeneratedSerialDescriptor, 2, mto.a);
                    i |= 4;
                    break;
                case 3:
                    jzoVar = (jzo) oh5VarB.z(pluginGeneratedSerialDescriptor, 3, pyo.a);
                    i |= 8;
                    break;
                case 4:
                    wwoVar = (wwo) oh5VarB.z(pluginGeneratedSerialDescriptor, 4, two.a);
                    i |= 16;
                    break;
                case 5:
                    list = (List) oh5VarB.z(pluginGeneratedSerialDescriptor, 5, kSerializerArr[5]);
                    i |= 32;
                    break;
                default:
                    t3p.d(iP);
                    return null;
            }
        }
        oh5VarB.c(pluginGeneratedSerialDescriptor);
        return new exo(i, strO, strO2, huoVar, jzoVar, wwoVar, list);
    }

    public final SerialDescriptor getDescriptor() {
        return b;
    }

    public final void serialize(Encoder encoder, Object obj) {
        exo exoVar = (exo) obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
        ph5 ph5VarB = encoder.b(pluginGeneratedSerialDescriptor);
        KSerializer[] kSerializerArr = exo.g;
        if (ph5VarB.E() || !Intrinsics.a(exoVar.a, "2.14.0")) {
            ph5VarB.z(pluginGeneratedSerialDescriptor, 0, exoVar.a);
        }
        if (ph5VarB.E() || !Intrinsics.a(exoVar.b, fcp.f())) {
            ph5VarB.z(pluginGeneratedSerialDescriptor, 1, exoVar.b);
        }
        ph5VarB.f(pluginGeneratedSerialDescriptor, 2, mto.a, exoVar.c);
        ph5VarB.f(pluginGeneratedSerialDescriptor, 3, pyo.a, exoVar.d);
        ph5VarB.f(pluginGeneratedSerialDescriptor, 4, two.a, exoVar.e);
        ph5VarB.f(pluginGeneratedSerialDescriptor, 5, kSerializerArr[5], exoVar.f);
        ph5VarB.c(pluginGeneratedSerialDescriptor);
    }

    public final KSerializer[] typeParametersSerializers() {
        return o0g.c;
    }
}
