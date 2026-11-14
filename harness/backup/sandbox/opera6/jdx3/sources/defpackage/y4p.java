package defpackage;

import com.google.android.gms.common.internal.ImagesContract;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes.dex */
public final class y4p implements iv9 {
    public static final y4p a;
    public static final /* synthetic */ PluginGeneratedSerialDescriptor b;

    static {
        y4p y4pVar = new y4p();
        a = y4pVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.opera.ads.internal.data.NativeAdm.Link", y4pVar, 3);
        pluginGeneratedSerialDescriptor.k(ImagesContract.URL, false);
        pluginGeneratedSerialDescriptor.k("fallback", true);
        pluginGeneratedSerialDescriptor.k("clicktrackers", true);
        b = pluginGeneratedSerialDescriptor;
    }

    public final KSerializer[] childSerializers() {
        KSerializer[] kSerializerArr = a5p.d;
        KSerializer kSerializer = xhk.a;
        return new KSerializer[]{kSerializer, f03.B(kSerializer), f03.B(kSerializerArr[2])};
    }

    public final Object deserialize(Decoder decoder) {
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
        oh5 oh5VarB = decoder.b(pluginGeneratedSerialDescriptor);
        KSerializer[] kSerializerArr = a5p.d;
        boolean z = true;
        int i = 0;
        String strO = null;
        String str = null;
        List list = null;
        while (z) {
            int iP = oh5VarB.p(pluginGeneratedSerialDescriptor);
            if (iP == -1) {
                z = false;
            } else if (iP == 0) {
                strO = oh5VarB.o(pluginGeneratedSerialDescriptor, 0);
                i |= 1;
            } else if (iP == 1) {
                str = (String) oh5VarB.m(pluginGeneratedSerialDescriptor, 1, xhk.a);
                i |= 2;
            } else {
                if (iP != 2) {
                    t3p.d(iP);
                    return null;
                }
                list = (List) oh5VarB.m(pluginGeneratedSerialDescriptor, 2, kSerializerArr[2]);
                i |= 4;
            }
        }
        oh5VarB.c(pluginGeneratedSerialDescriptor);
        return new a5p(i, strO, str, list);
    }

    public final SerialDescriptor getDescriptor() {
        return b;
    }

    public final void serialize(Encoder encoder, Object obj) {
        a5p a5pVar = (a5p) obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
        ph5 ph5VarB = encoder.b(pluginGeneratedSerialDescriptor);
        KSerializer[] kSerializerArr = a5p.d;
        String str = a5pVar.a;
        List list = a5pVar.c;
        String str2 = a5pVar.b;
        ph5VarB.z(pluginGeneratedSerialDescriptor, 0, str);
        if (ph5VarB.E() || str2 != null) {
            ph5VarB.j(pluginGeneratedSerialDescriptor, 1, xhk.a, str2);
        }
        if (ph5VarB.E() || list != null) {
            ph5VarB.j(pluginGeneratedSerialDescriptor, 2, kSerializerArr[2], list);
        }
        ph5VarB.c(pluginGeneratedSerialDescriptor);
    }

    public final KSerializer[] typeParametersSerializers() {
        return o0g.c;
    }
}
