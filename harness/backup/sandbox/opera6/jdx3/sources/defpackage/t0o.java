package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final /* synthetic */ class t0o implements iv9 {
    public static final t0o a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        t0o t0oVar = new t0o();
        a = t0oVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.opera.android.ndc.Whoami.Data", t0oVar, 5);
        pluginGeneratedSerialDescriptor.k("homeCountryCode", false);
        pluginGeneratedSerialDescriptor.k("countryCode", false);
        pluginGeneratedSerialDescriptor.k("latestOperatorName", false);
        pluginGeneratedSerialDescriptor.k("operatorName", false);
        pluginGeneratedSerialDescriptor.k("firstSeenAt", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    public final KSerializer[] childSerializers() {
        KSerializer kSerializerB = f03.B(h1d.a);
        xhk xhkVar = xhk.a;
        return new KSerializer[]{xhkVar, xhkVar, xhkVar, xhkVar, kSerializerB};
    }

    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        oh5 oh5VarB = decoder.b(serialDescriptor);
        boolean z = true;
        int i = 0;
        Long l = null;
        String strO = null;
        String strO2 = null;
        String strO3 = null;
        String strO4 = null;
        while (z) {
            int iP = oh5VarB.p(serialDescriptor);
            if (iP == -1) {
                z = false;
            } else if (iP == 0) {
                strO = oh5VarB.o(serialDescriptor, 0);
                i |= 1;
            } else if (iP == 1) {
                strO2 = oh5VarB.o(serialDescriptor, 1);
                i |= 2;
            } else if (iP == 2) {
                strO3 = oh5VarB.o(serialDescriptor, 2);
                i |= 4;
            } else if (iP == 3) {
                strO4 = oh5VarB.o(serialDescriptor, 3);
                i |= 8;
            } else {
                if (iP != 4) {
                    t3p.d(iP);
                    return null;
                }
                l = (Long) oh5VarB.m(serialDescriptor, 4, h1d.a);
                i |= 16;
            }
        }
        oh5VarB.c(serialDescriptor);
        return new v0o(i, l, strO, strO2, strO3, strO4);
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public final void serialize(Encoder encoder, Object obj) {
        v0o v0oVar = (v0o) obj;
        SerialDescriptor serialDescriptor = descriptor;
        ph5 ph5VarB = encoder.b(serialDescriptor);
        String str = v0oVar.a;
        Long l = v0oVar.e;
        ph5VarB.z(serialDescriptor, 0, str);
        ph5VarB.z(serialDescriptor, 1, v0oVar.b);
        ph5VarB.z(serialDescriptor, 2, v0oVar.c);
        ph5VarB.z(serialDescriptor, 3, v0oVar.d);
        if (ph5VarB.E() || l != null) {
            ph5VarB.j(serialDescriptor, 4, h1d.a, l);
        }
        ph5VarB.c(serialDescriptor);
    }
}
