package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final /* synthetic */ class uej implements iv9 {
    public static final uej a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        uej uejVar = new uej();
        a = uejVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.opera.android.aiassistant.api.ShodanApi.FilePollingResponse", uejVar, 3);
        pluginGeneratedSerialDescriptor.k("upload_status", false);
        pluginGeneratedSerialDescriptor.k("image_thumbnail_url", true);
        pluginGeneratedSerialDescriptor.k("image_original_size_url", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final KSerializer[] childSerializers() {
        xhk xhkVar = xhk.a;
        return new KSerializer[]{wej.d[0].getValue(), f03.B(xhkVar), f03.B(xhkVar)};
    }

    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        oh5 oh5VarB = decoder.b(serialDescriptor);
        l4c[] l4cVarArr = wej.d;
        boolean z = true;
        int i = 0;
        dfj dfjVar = null;
        String str = null;
        String str2 = null;
        while (z) {
            int iP = oh5VarB.p(serialDescriptor);
            if (iP == -1) {
                z = false;
            } else if (iP == 0) {
                dfjVar = (dfj) oh5VarB.z(serialDescriptor, 0, (KSerializer) l4cVarArr[0].getValue());
                i |= 1;
            } else if (iP == 1) {
                str = (String) oh5VarB.m(serialDescriptor, 1, xhk.a);
                i |= 2;
            } else {
                if (iP != 2) {
                    t3p.d(iP);
                    return null;
                }
                str2 = (String) oh5VarB.m(serialDescriptor, 2, xhk.a);
                i |= 4;
            }
        }
        oh5VarB.c(serialDescriptor);
        return new wej(i, dfjVar, str, str2);
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public final void serialize(Encoder encoder, Object obj) {
        wej wejVar = (wej) obj;
        SerialDescriptor serialDescriptor = descriptor;
        ph5 ph5VarB = encoder.b(serialDescriptor);
        KSerializer kSerializer = (KSerializer) wej.d[0].getValue();
        dfj dfjVar = wejVar.a;
        String str = wejVar.c;
        String str2 = wejVar.b;
        ph5VarB.f(serialDescriptor, 0, kSerializer, dfjVar);
        if (ph5VarB.E() || str2 != null) {
            ph5VarB.j(serialDescriptor, 1, xhk.a, str2);
        }
        if (ph5VarB.E() || str != null) {
            ph5VarB.j(serialDescriptor, 2, xhk.a, str);
        }
        ph5VarB.c(serialDescriptor);
    }
}
