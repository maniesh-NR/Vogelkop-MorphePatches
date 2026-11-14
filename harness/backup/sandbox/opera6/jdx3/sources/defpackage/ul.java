package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final /* synthetic */ class ul implements iv9 {
    public static final ul a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        ul ulVar = new ul();
        a = ulVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.opera.android.ads.AdDebugPageEventLogger.Impression", ulVar, 6);
        pluginGeneratedSerialDescriptor.k("timestamp", false);
        pluginGeneratedSerialDescriptor.k("placementId", false);
        pluginGeneratedSerialDescriptor.k("provider", false);
        pluginGeneratedSerialDescriptor.k("title", false);
        pluginGeneratedSerialDescriptor.k("clickUrl", false);
        pluginGeneratedSerialDescriptor.k("responseId", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final KSerializer[] childSerializers() {
        l4c[] l4cVarArr = wl.g;
        xhk xhkVar = xhk.a;
        return new KSerializer[]{h1d.a, xhkVar, l4cVarArr[2].getValue(), xhkVar, f03.B(xhkVar), f03.B(xhkVar)};
    }

    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        oh5 oh5VarB = decoder.b(serialDescriptor);
        l4c[] l4cVarArr = wl.g;
        int i = 0;
        long jG = 0;
        String strO = null;
        yo yoVar = null;
        String strO2 = null;
        String str = null;
        String str2 = null;
        boolean z = true;
        while (z) {
            int iP = oh5VarB.p(serialDescriptor);
            switch (iP) {
                case -1:
                    z = false;
                    break;
                case 0:
                    jG = oh5VarB.g(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    strO = oh5VarB.o(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    yoVar = (yo) oh5VarB.z(serialDescriptor, 2, (KSerializer) l4cVarArr[2].getValue());
                    i |= 4;
                    break;
                case 3:
                    strO2 = oh5VarB.o(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    str = (String) oh5VarB.m(serialDescriptor, 4, xhk.a);
                    i |= 16;
                    break;
                case 5:
                    str2 = (String) oh5VarB.m(serialDescriptor, 5, xhk.a);
                    i |= 32;
                    break;
                default:
                    t3p.d(iP);
                    return null;
            }
        }
        oh5VarB.c(serialDescriptor);
        return new wl(i, jG, strO, yoVar, strO2, str, str2);
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public final void serialize(Encoder encoder, Object obj) {
        wl wlVar = (wl) obj;
        SerialDescriptor serialDescriptor = descriptor;
        ph5 ph5VarB = encoder.b(serialDescriptor);
        l4c[] l4cVarArr = wl.g;
        ph5VarB.F(serialDescriptor, 0, wlVar.a);
        ph5VarB.z(serialDescriptor, 1, wlVar.b);
        ph5VarB.f(serialDescriptor, 2, (KSerializer) l4cVarArr[2].getValue(), wlVar.c);
        ph5VarB.z(serialDescriptor, 3, wlVar.d);
        xhk xhkVar = xhk.a;
        ph5VarB.j(serialDescriptor, 4, xhkVar, wlVar.e);
        ph5VarB.j(serialDescriptor, 5, xhkVar, wlVar.f);
        ph5VarB.c(serialDescriptor);
    }
}
