package defpackage;

import java.util.Map;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final /* synthetic */ class zej implements iv9 {
    public static final zej a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        zej zejVar = new zej();
        a = zejVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.opera.android.aiassistant.api.ShodanApi.FileUploadResponse", zejVar, 3);
        pluginGeneratedSerialDescriptor.k("file_id", false);
        pluginGeneratedSerialDescriptor.k("upload_url", false);
        pluginGeneratedSerialDescriptor.k("headers", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final KSerializer[] childSerializers() {
        l4c[] l4cVarArr = bfj.d;
        xhk xhkVar = xhk.a;
        return new KSerializer[]{xhkVar, xhkVar, l4cVarArr[2].getValue()};
    }

    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        oh5 oh5VarB = decoder.b(serialDescriptor);
        l4c[] l4cVarArr = bfj.d;
        boolean z = true;
        int i = 0;
        String strO = null;
        String strO2 = null;
        Map map = null;
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
            } else {
                if (iP != 2) {
                    t3p.d(iP);
                    return null;
                }
                map = (Map) oh5VarB.z(serialDescriptor, 2, (KSerializer) l4cVarArr[2].getValue());
                i |= 4;
            }
        }
        oh5VarB.c(serialDescriptor);
        return new bfj(map, i, strO, strO2);
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public final void serialize(Encoder encoder, Object obj) {
        bfj bfjVar = (bfj) obj;
        SerialDescriptor serialDescriptor = descriptor;
        ph5 ph5VarB = encoder.b(serialDescriptor);
        l4c[] l4cVarArr = bfj.d;
        ph5VarB.z(serialDescriptor, 0, bfjVar.a);
        ph5VarB.z(serialDescriptor, 1, bfjVar.b);
        ph5VarB.f(serialDescriptor, 2, (KSerializer) l4cVarArr[2].getValue(), bfjVar.c);
        ph5VarB.c(serialDescriptor);
    }
}
