package defpackage;

import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final /* synthetic */ class xyl implements iv9 {
    public static final xyl a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        xyl xylVar = new xyl();
        a = xylVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.opera.android.ntp.TrackerInfo", xylVar, 2);
        pluginGeneratedSerialDescriptor.k("eventType", false);
        pluginGeneratedSerialDescriptor.k("urls", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final KSerializer[] childSerializers() {
        l4c[] l4cVarArr = zyl.c;
        return new KSerializer[]{l4cVarArr[0].getValue(), l4cVarArr[1].getValue()};
    }

    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        oh5 oh5VarB = decoder.b(serialDescriptor);
        l4c[] l4cVarArr = zyl.c;
        boolean z = true;
        int i = 0;
        ld8 ld8Var = null;
        List list = null;
        while (z) {
            int iP = oh5VarB.p(serialDescriptor);
            if (iP == -1) {
                z = false;
            } else if (iP == 0) {
                ld8Var = (ld8) oh5VarB.z(serialDescriptor, 0, (KSerializer) l4cVarArr[0].getValue());
                i |= 1;
            } else {
                if (iP != 1) {
                    t3p.d(iP);
                    return null;
                }
                list = (List) oh5VarB.z(serialDescriptor, 1, (KSerializer) l4cVarArr[1].getValue());
                i |= 2;
            }
        }
        oh5VarB.c(serialDescriptor);
        return new zyl(i, ld8Var, list);
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public final void serialize(Encoder encoder, Object obj) {
        zyl zylVar = (zyl) obj;
        SerialDescriptor serialDescriptor = descriptor;
        ph5 ph5VarB = encoder.b(serialDescriptor);
        l4c[] l4cVarArr = zyl.c;
        ph5VarB.f(serialDescriptor, 0, (KSerializer) l4cVarArr[0].getValue(), zylVar.a);
        ph5VarB.f(serialDescriptor, 1, (KSerializer) l4cVarArr[1].getValue(), zylVar.b);
        ph5VarB.c(serialDescriptor);
    }
}
