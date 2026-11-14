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
public final /* synthetic */ class qb2 implements iv9 {
    public static final qb2 a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        qb2 qb2Var = new qb2();
        a = qb2Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.opera.android.autofill.assetlinks.network.AssetLinksNetworkModel", qb2Var, 2);
        pluginGeneratedSerialDescriptor.k("relation", true);
        pluginGeneratedSerialDescriptor.k("target", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{sb2.c[0].getValue(), f03.B(vb2.a)};
    }

    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        oh5 oh5VarB = decoder.b(serialDescriptor);
        l4c[] l4cVarArr = sb2.c;
        boolean z = true;
        int i = 0;
        List list = null;
        xb2 xb2Var = null;
        while (z) {
            int iP = oh5VarB.p(serialDescriptor);
            if (iP == -1) {
                z = false;
            } else if (iP == 0) {
                list = (List) oh5VarB.z(serialDescriptor, 0, (KSerializer) l4cVarArr[0].getValue());
                i |= 1;
            } else {
                if (iP != 1) {
                    t3p.d(iP);
                    return null;
                }
                xb2Var = (xb2) oh5VarB.m(serialDescriptor, 1, vb2.a);
                i |= 2;
            }
        }
        oh5VarB.c(serialDescriptor);
        return new sb2(i, list, xb2Var);
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public final void serialize(Encoder encoder, Object obj) {
        sb2 sb2Var = (sb2) obj;
        SerialDescriptor serialDescriptor = descriptor;
        ph5 ph5VarB = encoder.b(serialDescriptor);
        l4c[] l4cVarArr = sb2.c;
        if (ph5VarB.E() || !Intrinsics.a(sb2Var.a, l08.a)) {
            ph5VarB.f(serialDescriptor, 0, (KSerializer) l4cVarArr[0].getValue(), sb2Var.a);
        }
        if (ph5VarB.E() || sb2Var.b != null) {
            ph5VarB.j(serialDescriptor, 1, vb2.a, sb2Var.b);
        }
        ph5VarB.c(serialDescriptor);
    }
}
