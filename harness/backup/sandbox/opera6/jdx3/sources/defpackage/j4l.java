package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final /* synthetic */ class j4l implements iv9 {
    public static final j4l a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        j4l j4lVar = new j4l();
        a = j4lVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.opera.android.browser.TabGroup", j4lVar, 3);
        pluginGeneratedSerialDescriptor.k("id", false);
        pluginGeneratedSerialDescriptor.k("title", true);
        pluginGeneratedSerialDescriptor.k("colorIndex", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    public final KSerializer[] childSerializers() {
        KSerializer kSerializerB = f03.B(xhk.a);
        ecb ecbVar = ecb.a;
        return new KSerializer[]{ecbVar, kSerializerB, ecbVar};
    }

    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        oh5 oh5VarB = decoder.b(serialDescriptor);
        boolean z = true;
        int i = 0;
        int iL = 0;
        int iL2 = 0;
        String str = null;
        while (z) {
            int iP = oh5VarB.p(serialDescriptor);
            if (iP == -1) {
                z = false;
            } else if (iP == 0) {
                iL = oh5VarB.l(serialDescriptor, 0);
                i |= 1;
            } else if (iP == 1) {
                str = (String) oh5VarB.m(serialDescriptor, 1, xhk.a);
                i |= 2;
            } else {
                if (iP != 2) {
                    t3p.d(iP);
                    return null;
                }
                iL2 = oh5VarB.l(serialDescriptor, 2);
                i |= 4;
            }
        }
        oh5VarB.c(serialDescriptor);
        return new m4l(i, iL, iL2, str);
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public final void serialize(Encoder encoder, Object obj) {
        m4l m4lVar = (m4l) obj;
        SerialDescriptor serialDescriptor = descriptor;
        ph5 ph5VarB = encoder.b(serialDescriptor);
        int i = m4lVar.a;
        String str = m4lVar.b;
        ph5VarB.v(0, i, serialDescriptor);
        if (ph5VarB.E() || str != null) {
            ph5VarB.j(serialDescriptor, 1, xhk.a, str);
        }
        ph5VarB.v(2, m4lVar.c, serialDescriptor);
        ph5VarB.c(serialDescriptor);
    }
}
