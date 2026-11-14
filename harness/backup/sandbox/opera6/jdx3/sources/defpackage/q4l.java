package defpackage;

import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final /* synthetic */ class q4l implements iv9 {
    public static final q4l a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        q4l q4lVar = new q4l();
        a = q4lVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.opera.android.browser.TabGroupRep.PersistentState", q4lVar, 2);
        pluginGeneratedSerialDescriptor.k("groups", false);
        pluginGeneratedSerialDescriptor.k("nextGroupColorIndex", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{s4l.c[0].getValue(), ecb.a};
    }

    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        oh5 oh5VarB = decoder.b(serialDescriptor);
        l4c[] l4cVarArr = s4l.c;
        boolean z = true;
        int i = 0;
        int iL = 0;
        List list = null;
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
                iL = oh5VarB.l(serialDescriptor, 1);
                i |= 2;
            }
        }
        oh5VarB.c(serialDescriptor);
        return new s4l(i, iL, list);
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public final void serialize(Encoder encoder, Object obj) {
        s4l s4lVar = (s4l) obj;
        SerialDescriptor serialDescriptor = descriptor;
        ph5 ph5VarB = encoder.b(serialDescriptor);
        ph5VarB.f(serialDescriptor, 0, (KSerializer) s4l.c[0].getValue(), s4lVar.a);
        ph5VarB.v(1, s4lVar.b, serialDescriptor);
        ph5VarB.c(serialDescriptor);
    }
}
