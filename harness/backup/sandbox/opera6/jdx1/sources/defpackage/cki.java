package defpackage;

import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final /* synthetic */ class cki implements iv9 {
    public static final cki a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        cki ckiVar = new cki();
        a = ckiVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.arkivanov.decompose.router.children.SavedState", ckiVar, 2);
        pluginGeneratedSerialDescriptor.k("navState", false);
        pluginGeneratedSerialDescriptor.k("childState", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    public final KSerializer[] childSerializers() {
        return new KSerializer[]{j2j.a, eki.c[1]};
    }

    public final Object deserialize(Decoder decoder) throws o2j {
        SerialDescriptor serialDescriptor = descriptor;
        oh5 oh5VarB = decoder.b(serialDescriptor);
        KSerializer[] kSerializerArr = eki.c;
        boolean z = true;
        int i = 0;
        k2j k2jVar = null;
        List list = null;
        while (z) {
            int iP = oh5VarB.p(serialDescriptor);
            if (iP == -1) {
                z = false;
            } else if (iP == 0) {
                k2jVar = (k2j) oh5VarB.z(serialDescriptor, 0, j2j.a);
                i |= 1;
            } else {
                if (iP != 1) {
                    t3p.d(iP);
                    return null;
                }
                list = (List) oh5VarB.z(serialDescriptor, 1, kSerializerArr[1]);
                i |= 2;
            }
        }
        oh5VarB.c(serialDescriptor);
        return new eki(i, k2jVar, list);
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public final void serialize(Encoder encoder, Object obj) {
        eki ekiVar = (eki) obj;
        SerialDescriptor serialDescriptor = descriptor;
        ph5 ph5VarB = encoder.b(serialDescriptor);
        KSerializer[] kSerializerArr = eki.c;
        ph5VarB.f(serialDescriptor, 0, j2j.a, ekiVar.a);
        ph5VarB.f(serialDescriptor, 1, kSerializerArr[1], ekiVar.b);
        ph5VarB.c(serialDescriptor);
    }

    public final KSerializer[] typeParametersSerializers() {
        return o0g.c;
    }
}
