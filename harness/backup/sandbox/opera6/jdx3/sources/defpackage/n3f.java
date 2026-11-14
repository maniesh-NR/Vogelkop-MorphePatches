package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final /* synthetic */ class n3f implements iv9 {
    public static final n3f a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        n3f n3fVar = new n3f();
        a = n3fVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.opera.android.ntp.NtpEntry", n3fVar, 6);
        pluginGeneratedSerialDescriptor.k("id", false);
        pluginGeneratedSerialDescriptor.k("customizationId", true);
        pluginGeneratedSerialDescriptor.k("title", false);
        pluginGeneratedSerialDescriptor.k("openUrl", false);
        pluginGeneratedSerialDescriptor.k("imageUrl", false);
        pluginGeneratedSerialDescriptor.k("trackingUrls", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final KSerializer[] childSerializers() {
        l4c[] l4cVarArr = p3f.g;
        ecb ecbVar = ecb.a;
        xhk xhkVar = xhk.a;
        return new KSerializer[]{ecbVar, f03.B(ecbVar), xhkVar, xhkVar, xhkVar, l4cVarArr[5].getValue()};
    }

    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        oh5 oh5VarB = decoder.b(serialDescriptor);
        l4c[] l4cVarArr = p3f.g;
        boolean z = true;
        int i = 0;
        int iL = 0;
        Integer num = null;
        String strO = null;
        String strO2 = null;
        String strO3 = null;
        List list = null;
        while (z) {
            int iP = oh5VarB.p(serialDescriptor);
            switch (iP) {
                case -1:
                    z = false;
                    break;
                case 0:
                    iL = oh5VarB.l(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    num = (Integer) oh5VarB.m(serialDescriptor, 1, ecb.a);
                    i |= 2;
                    break;
                case 2:
                    strO = oh5VarB.o(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    strO2 = oh5VarB.o(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    strO3 = oh5VarB.o(serialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    list = (List) oh5VarB.z(serialDescriptor, 5, (KSerializer) l4cVarArr[5].getValue());
                    i |= 32;
                    break;
                default:
                    t3p.d(iP);
                    return null;
            }
        }
        oh5VarB.c(serialDescriptor);
        return new p3f(i, iL, num, strO, strO2, strO3, list);
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public final void serialize(Encoder encoder, Object obj) {
        p3f p3fVar = (p3f) obj;
        SerialDescriptor serialDescriptor = descriptor;
        ph5 ph5VarB = encoder.b(serialDescriptor);
        l4c[] l4cVarArr = p3f.g;
        int i = p3fVar.a;
        List list = p3fVar.f;
        Integer num = p3fVar.b;
        ph5VarB.v(0, i, serialDescriptor);
        if (ph5VarB.E() || num != null) {
            ph5VarB.j(serialDescriptor, 1, ecb.a, num);
        }
        ph5VarB.z(serialDescriptor, 2, p3fVar.c);
        ph5VarB.z(serialDescriptor, 3, p3fVar.d);
        ph5VarB.z(serialDescriptor, 4, p3fVar.e);
        if (ph5VarB.E() || !Intrinsics.a(list, l08.a)) {
            ph5VarB.f(serialDescriptor, 5, (KSerializer) l4cVarArr[5].getValue(), list);
        }
        ph5VarB.c(serialDescriptor);
    }
}
