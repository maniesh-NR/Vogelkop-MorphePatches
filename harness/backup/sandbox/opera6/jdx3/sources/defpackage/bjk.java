package defpackage;

import com.leanplum.internal.Constants;
import java.util.Map;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.json.c;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final /* synthetic */ class bjk implements iv9 {
    public static final bjk a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        bjk bjkVar = new bjk();
        a = bjkVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.opera.celopay.model.crypto.struct.StructuredData.Message", bjkVar, 4);
        pluginGeneratedSerialDescriptor.k("types", false);
        pluginGeneratedSerialDescriptor.k("primaryType", false);
        pluginGeneratedSerialDescriptor.k(Constants.Params.MESSAGE, false);
        pluginGeneratedSerialDescriptor.k("domain", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final KSerializer[] childSerializers() {
        rrb rrbVar = rrb.a;
        return new KSerializer[]{djk.e[0].getValue(), xhk.a, rrbVar, rrbVar};
    }

    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        oh5 oh5VarB = decoder.b(serialDescriptor);
        l4c[] l4cVarArr = djk.e;
        boolean z = true;
        int i = 0;
        Map map = null;
        String strO = null;
        c cVar = null;
        c cVar2 = null;
        while (z) {
            int iP = oh5VarB.p(serialDescriptor);
            if (iP == -1) {
                z = false;
            } else if (iP == 0) {
                map = (Map) oh5VarB.z(serialDescriptor, 0, (KSerializer) l4cVarArr[0].getValue());
                i |= 1;
            } else if (iP == 1) {
                strO = oh5VarB.o(serialDescriptor, 1);
                i |= 2;
            } else if (iP == 2) {
                cVar = (c) oh5VarB.z(serialDescriptor, 2, rrb.a);
                i |= 4;
            } else {
                if (iP != 3) {
                    t3p.d(iP);
                    return null;
                }
                cVar2 = (c) oh5VarB.z(serialDescriptor, 3, rrb.a);
                i |= 8;
            }
        }
        oh5VarB.c(serialDescriptor);
        return new djk(i, map, strO, cVar, cVar2);
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public final void serialize(Encoder encoder, Object obj) {
        djk djkVar = (djk) obj;
        SerialDescriptor serialDescriptor = descriptor;
        ph5 ph5VarB = encoder.b(serialDescriptor);
        ph5VarB.f(serialDescriptor, 0, (KSerializer) djk.e[0].getValue(), djkVar.a);
        ph5VarB.z(serialDescriptor, 1, djkVar.b);
        rrb rrbVar = rrb.a;
        ph5VarB.f(serialDescriptor, 2, rrbVar, djkVar.c);
        ph5VarB.f(serialDescriptor, 3, rrbVar, djkVar.d);
        ph5VarB.c(serialDescriptor);
    }
}
