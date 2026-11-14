package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final /* synthetic */ class mx4 implements iv9 {
    public static final mx4 a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        mx4 mx4Var = new mx4();
        a = mx4Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.arkivanov.decompose.router.children.ChildrenNavigator.SavedChildState", mx4Var, 2);
        pluginGeneratedSerialDescriptor.k("key", false);
        pluginGeneratedSerialDescriptor.k("savedState", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    public final KSerializer[] childSerializers() {
        return new KSerializer[]{xhk.a, f03.B(j2j.a)};
    }

    public final Object deserialize(Decoder decoder) throws o2j {
        SerialDescriptor serialDescriptor = descriptor;
        oh5 oh5VarB = decoder.b(serialDescriptor);
        boolean z = true;
        int i = 0;
        String strO = null;
        k2j k2jVar = null;
        while (z) {
            int iP = oh5VarB.p(serialDescriptor);
            if (iP == -1) {
                z = false;
            } else if (iP == 0) {
                strO = oh5VarB.o(serialDescriptor, 0);
                i |= 1;
            } else {
                if (iP != 1) {
                    t3p.d(iP);
                    return null;
                }
                k2jVar = (k2j) oh5VarB.m(serialDescriptor, 1, j2j.a);
                i |= 2;
            }
        }
        oh5VarB.c(serialDescriptor);
        return new ox4(i, strO, k2jVar);
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public final void serialize(Encoder encoder, Object obj) {
        ox4 ox4Var = (ox4) obj;
        SerialDescriptor serialDescriptor = descriptor;
        ph5 ph5VarB = encoder.b(serialDescriptor);
        ph5VarB.z(serialDescriptor, 0, ox4Var.a);
        ph5VarB.j(serialDescriptor, 1, j2j.a, ox4Var.b);
        ph5VarB.c(serialDescriptor);
    }

    public final KSerializer[] typeParametersSerializers() {
        return o0g.c;
    }
}
