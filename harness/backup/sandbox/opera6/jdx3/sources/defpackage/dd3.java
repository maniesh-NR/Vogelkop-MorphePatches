package defpackage;

import com.leanplum.internal.Constants;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final /* synthetic */ class dd3 implements iv9 {
    public static final dd3 a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        dd3 dd3Var = new dd3();
        a = dd3Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.opera.android.live_score.data.network.BettingModel.EventOdds", dd3Var, 3);
        pluginGeneratedSerialDescriptor.k("id", false);
        pluginGeneratedSerialDescriptor.k(Constants.Params.NAME, false);
        pluginGeneratedSerialDescriptor.k("odds", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final KSerializer[] childSerializers() {
        l4c[] l4cVarArr = fd3.d;
        xhk xhkVar = xhk.a;
        return new KSerializer[]{xhkVar, xhkVar, l4cVarArr[2].getValue()};
    }

    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        oh5 oh5VarB = decoder.b(serialDescriptor);
        l4c[] l4cVarArr = fd3.d;
        boolean z = true;
        int i = 0;
        String strO = null;
        String strO2 = null;
        List list = null;
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
                list = (List) oh5VarB.z(serialDescriptor, 2, (KSerializer) l4cVarArr[2].getValue());
                i |= 4;
            }
        }
        oh5VarB.c(serialDescriptor);
        return new fd3(i, strO, strO2, list);
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public final void serialize(Encoder encoder, Object obj) {
        fd3 fd3Var = (fd3) obj;
        SerialDescriptor serialDescriptor = descriptor;
        ph5 ph5VarB = encoder.b(serialDescriptor);
        l4c[] l4cVarArr = fd3.d;
        ph5VarB.z(serialDescriptor, 0, fd3Var.a);
        ph5VarB.z(serialDescriptor, 1, fd3Var.b);
        ph5VarB.f(serialDescriptor, 2, (KSerializer) l4cVarArr[2].getValue(), fd3Var.c);
        ph5VarB.c(serialDescriptor);
    }
}
