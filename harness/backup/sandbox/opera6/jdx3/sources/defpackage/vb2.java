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
public final /* synthetic */ class vb2 implements iv9 {
    public static final vb2 a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        vb2 vb2Var = new vb2();
        a = vb2Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.opera.android.autofill.assetlinks.network.AssetLinksTargetNetworkModel", vb2Var, 3);
        pluginGeneratedSerialDescriptor.k("namespace", true);
        pluginGeneratedSerialDescriptor.k("package_name", true);
        pluginGeneratedSerialDescriptor.k("sha256_cert_fingerprints", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final KSerializer[] childSerializers() {
        l4c[] l4cVarArr = xb2.d;
        xhk xhkVar = xhk.a;
        return new KSerializer[]{f03.B(xhkVar), f03.B(xhkVar), l4cVarArr[2].getValue()};
    }

    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        oh5 oh5VarB = decoder.b(serialDescriptor);
        l4c[] l4cVarArr = xb2.d;
        boolean z = true;
        int i = 0;
        String str = null;
        String str2 = null;
        List list = null;
        while (z) {
            int iP = oh5VarB.p(serialDescriptor);
            if (iP == -1) {
                z = false;
            } else if (iP == 0) {
                str = (String) oh5VarB.m(serialDescriptor, 0, xhk.a);
                i |= 1;
            } else if (iP == 1) {
                str2 = (String) oh5VarB.m(serialDescriptor, 1, xhk.a);
                i |= 2;
            } else {
                if (iP != 2) {
                    t3p.d(iP);
                    return null;
                }
                list = (List) oh5VarB.z(serialDescriptor, 2, (KSerializer) l4cVarArr[2].getValue());
                i |= 4;
            }
        }
        oh5VarB.c(serialDescriptor);
        return new xb2(i, str, str2, list);
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public final void serialize(Encoder encoder, Object obj) {
        xb2 xb2Var = (xb2) obj;
        SerialDescriptor serialDescriptor = descriptor;
        ph5 ph5VarB = encoder.b(serialDescriptor);
        l4c[] l4cVarArr = xb2.d;
        if (ph5VarB.E() || xb2Var.a != null) {
            ph5VarB.j(serialDescriptor, 0, xhk.a, xb2Var.a);
        }
        if (ph5VarB.E() || xb2Var.b != null) {
            ph5VarB.j(serialDescriptor, 1, xhk.a, xb2Var.b);
        }
        if (ph5VarB.E() || !Intrinsics.a(xb2Var.c, l08.a)) {
            ph5VarB.f(serialDescriptor, 2, (KSerializer) l4cVarArr[2].getValue(), xb2Var.c);
        }
        ph5VarB.c(serialDescriptor);
    }
}
