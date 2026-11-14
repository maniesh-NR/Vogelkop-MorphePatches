package defpackage;

import com.leanplum.internal.Constants;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final /* synthetic */ class j7l implements iv9 {
    public static final j7l a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        j7l j7lVar = new j7l();
        a = j7lVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.opera.android.tabui2.screenshots.TabScreenshotDb.Description", j7lVar, 5);
        pluginGeneratedSerialDescriptor.k(Constants.Keys.FILENAME, false);
        pluginGeneratedSerialDescriptor.k("width", false);
        pluginGeneratedSerialDescriptor.k("height", false);
        pluginGeneratedSerialDescriptor.k("darkMode", false);
        pluginGeneratedSerialDescriptor.k("topOffsetRatio", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    public final KSerializer[] childSerializers() {
        ecb ecbVar = ecb.a;
        return new KSerializer[]{xhk.a, ecbVar, ecbVar, rn3.a, v89.a};
    }

    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        oh5 oh5VarB = decoder.b(serialDescriptor);
        int i = 0;
        int iL = 0;
        int iL2 = 0;
        boolean zC = false;
        String strO = null;
        float fU = 0.0f;
        boolean z = true;
        while (z) {
            int iP = oh5VarB.p(serialDescriptor);
            if (iP == -1) {
                z = false;
            } else if (iP == 0) {
                strO = oh5VarB.o(serialDescriptor, 0);
                i |= 1;
            } else if (iP == 1) {
                iL = oh5VarB.l(serialDescriptor, 1);
                i |= 2;
            } else if (iP == 2) {
                iL2 = oh5VarB.l(serialDescriptor, 2);
                i |= 4;
            } else if (iP == 3) {
                zC = oh5VarB.C(serialDescriptor, 3);
                i |= 8;
            } else {
                if (iP != 4) {
                    t3p.d(iP);
                    return null;
                }
                fU = oh5VarB.u(serialDescriptor, 4);
                i |= 16;
            }
        }
        oh5VarB.c(serialDescriptor);
        return new l7l(i, strO, iL, iL2, zC, fU);
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public final void serialize(Encoder encoder, Object obj) {
        l7l l7lVar = (l7l) obj;
        SerialDescriptor serialDescriptor = descriptor;
        ph5 ph5VarB = encoder.b(serialDescriptor);
        ph5VarB.z(serialDescriptor, 0, l7lVar.a);
        ph5VarB.v(1, l7lVar.b, serialDescriptor);
        ph5VarB.v(2, l7lVar.c, serialDescriptor);
        ph5VarB.y(serialDescriptor, 3, l7lVar.d);
        ph5VarB.u(serialDescriptor, 4, l7lVar.e);
        ph5VarB.c(serialDescriptor);
    }
}
