package defpackage;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes.dex */
public final class t0p implements iv9 {
    public static final t0p a;
    public static final /* synthetic */ PluginGeneratedSerialDescriptor b;

    static {
        t0p t0pVar = new t0p();
        a = t0pVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.opera.ads.internal.data.ImpObject.Native", t0pVar, 2);
        pluginGeneratedSerialDescriptor.k("request", false);
        pluginGeneratedSerialDescriptor.k("ver", true);
        b = pluginGeneratedSerialDescriptor;
    }

    public final KSerializer[] childSerializers() {
        xhk xhkVar = xhk.a;
        return new KSerializer[]{xhkVar, xhkVar};
    }

    public final Object deserialize(Decoder decoder) {
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
        oh5 oh5VarB = decoder.b(pluginGeneratedSerialDescriptor);
        boolean z = true;
        int i = 0;
        String strO = null;
        String strO2 = null;
        while (z) {
            int iP = oh5VarB.p(pluginGeneratedSerialDescriptor);
            if (iP == -1) {
                z = false;
            } else if (iP == 0) {
                strO = oh5VarB.o(pluginGeneratedSerialDescriptor, 0);
                i |= 1;
            } else {
                if (iP != 1) {
                    t3p.d(iP);
                    return null;
                }
                strO2 = oh5VarB.o(pluginGeneratedSerialDescriptor, 1);
                i |= 2;
            }
        }
        oh5VarB.c(pluginGeneratedSerialDescriptor);
        return new v0p(i, strO, strO2);
    }

    public final SerialDescriptor getDescriptor() {
        return b;
    }

    public final void serialize(Encoder encoder, Object obj) {
        v0p v0pVar = (v0p) obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
        ph5 ph5VarB = encoder.b(pluginGeneratedSerialDescriptor);
        String str = v0pVar.a;
        String str2 = v0pVar.b;
        ph5VarB.z(pluginGeneratedSerialDescriptor, 0, str);
        if (ph5VarB.E() || !Intrinsics.a(str2, "1.2")) {
            ph5VarB.z(pluginGeneratedSerialDescriptor, 1, str2);
        }
        ph5VarB.c(pluginGeneratedSerialDescriptor);
    }

    public final KSerializer[] typeParametersSerializers() {
        return o0g.c;
    }
}
