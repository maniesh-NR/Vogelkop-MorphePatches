package defpackage;

import com.leanplum.internal.Constants;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final /* synthetic */ class npb implements iv9 {
    public static final npb a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        npb npbVar = new npb();
        a = npbVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.multiplatform.webview.jsbridge.JsMessage", npbVar, 3);
        pluginGeneratedSerialDescriptor.k("callbackId", false);
        pluginGeneratedSerialDescriptor.k("methodName", false);
        pluginGeneratedSerialDescriptor.k(Constants.Params.PARAMS, false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    public final KSerializer[] childSerializers() {
        xhk xhkVar = xhk.a;
        return new KSerializer[]{ecb.a, xhkVar, xhkVar};
    }

    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        oh5 oh5VarB = decoder.b(serialDescriptor);
        boolean z = true;
        int i = 0;
        int iL = 0;
        String strO = null;
        String strO2 = null;
        while (z) {
            int iP = oh5VarB.p(serialDescriptor);
            if (iP == -1) {
                z = false;
            } else if (iP == 0) {
                iL = oh5VarB.l(serialDescriptor, 0);
                i |= 1;
            } else if (iP == 1) {
                strO = oh5VarB.o(serialDescriptor, 1);
                i |= 2;
            } else {
                if (iP != 2) {
                    t3p.d(iP);
                    return null;
                }
                strO2 = oh5VarB.o(serialDescriptor, 2);
                i |= 4;
            }
        }
        oh5VarB.c(serialDescriptor);
        return new ppb(i, iL, strO, strO2);
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public final void serialize(Encoder encoder, Object obj) {
        ppb ppbVar = (ppb) obj;
        SerialDescriptor serialDescriptor = descriptor;
        ph5 ph5VarB = encoder.b(serialDescriptor);
        ph5VarB.v(0, ppbVar.a, serialDescriptor);
        ph5VarB.z(serialDescriptor, 1, ppbVar.b);
        ph5VarB.z(serialDescriptor, 2, ppbVar.c);
        ph5VarB.c(serialDescriptor);
    }
}
