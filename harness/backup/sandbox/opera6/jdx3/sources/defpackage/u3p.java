package defpackage;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes.dex */
public final class u3p implements iv9 {
    public static final u3p a;
    public static final /* synthetic */ PluginGeneratedSerialDescriptor b;

    static {
        u3p u3pVar = new u3p();
        a = u3pVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.opera.ads.internal.PostBody", u3pVar, 6);
        pluginGeneratedSerialDescriptor.k("sdkVer", true);
        pluginGeneratedSerialDescriptor.k("sdkSession", true);
        pluginGeneratedSerialDescriptor.k("app", false);
        pluginGeneratedSerialDescriptor.k("device", false);
        pluginGeneratedSerialDescriptor.k("user", false);
        pluginGeneratedSerialDescriptor.k("source", false);
        b = pluginGeneratedSerialDescriptor;
    }

    public final KSerializer[] childSerializers() {
        xhk xhkVar = xhk.a;
        return new KSerializer[]{xhkVar, xhkVar, mto.a, pyo.a, two.a, jwo.a};
    }

    public final Object deserialize(Decoder decoder) {
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
        oh5 oh5VarB = decoder.b(pluginGeneratedSerialDescriptor);
        boolean z = true;
        int i = 0;
        String strO = null;
        String strO2 = null;
        huo huoVar = null;
        jzo jzoVar = null;
        wwo wwoVar = null;
        mwo mwoVar = null;
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
                    mwoVar = (mwo) oh5VarB.z(pluginGeneratedSerialDescriptor, 5, jwo.a);
                    i |= 32;
                    break;
                default:
                    t3p.d(iP);
                    return null;
            }
        }
        oh5VarB.c(pluginGeneratedSerialDescriptor);
        return new p5p(i, strO, strO2, huoVar, jzoVar, wwoVar, mwoVar);
    }

    public final SerialDescriptor getDescriptor() {
        return b;
    }

    public final void serialize(Encoder encoder, Object obj) {
        p5p p5pVar = (p5p) obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
        ph5 ph5VarB = encoder.b(pluginGeneratedSerialDescriptor);
        if (ph5VarB.E() || !Intrinsics.a(p5pVar.a, "2.14.0")) {
            ph5VarB.z(pluginGeneratedSerialDescriptor, 0, p5pVar.a);
        }
        if (ph5VarB.E() || !Intrinsics.a(p5pVar.b, fcp.f())) {
            ph5VarB.z(pluginGeneratedSerialDescriptor, 1, p5pVar.b);
        }
        ph5VarB.f(pluginGeneratedSerialDescriptor, 2, mto.a, p5pVar.c);
        ph5VarB.f(pluginGeneratedSerialDescriptor, 3, pyo.a, p5pVar.d);
        ph5VarB.f(pluginGeneratedSerialDescriptor, 4, two.a, p5pVar.e);
        ph5VarB.f(pluginGeneratedSerialDescriptor, 5, jwo.a, p5pVar.f);
        ph5VarB.c(pluginGeneratedSerialDescriptor);
    }

    public final KSerializer[] typeParametersSerializers() {
        return o0g.c;
    }
}
