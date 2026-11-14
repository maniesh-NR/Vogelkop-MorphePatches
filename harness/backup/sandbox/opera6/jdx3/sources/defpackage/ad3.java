package defpackage;

import com.leanplum.internal.Constants;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final /* synthetic */ class ad3 implements iv9 {
    public static final ad3 a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        ad3 ad3Var = new ad3();
        a = ad3Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.opera.android.live_score.data.network.BettingModel.BatchOdds", ad3Var, 2);
        pluginGeneratedSerialDescriptor.k("provider", false);
        pluginGeneratedSerialDescriptor.k(Constants.Params.DATA, true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{xhk.a, cd3.c[1].getValue()};
    }

    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        oh5 oh5VarB = decoder.b(serialDescriptor);
        l4c[] l4cVarArr = cd3.c;
        boolean z = true;
        int i = 0;
        String strO = null;
        Map map = null;
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
                map = (Map) oh5VarB.z(serialDescriptor, 1, (KSerializer) l4cVarArr[1].getValue());
                i |= 2;
            }
        }
        oh5VarB.c(serialDescriptor);
        return new cd3(i, strO, map);
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public final void serialize(Encoder encoder, Object obj) {
        cd3 cd3Var = (cd3) obj;
        SerialDescriptor serialDescriptor = descriptor;
        ph5 ph5VarB = encoder.b(serialDescriptor);
        l4c[] l4cVarArr = cd3.c;
        String str = cd3Var.a;
        Map map = cd3Var.b;
        ph5VarB.z(serialDescriptor, 0, str);
        if (ph5VarB.E() || !Intrinsics.a(map, n08.a)) {
            ph5VarB.f(serialDescriptor, 1, (KSerializer) l4cVarArr[1].getValue(), map);
        }
        ph5VarB.c(serialDescriptor);
    }
}
