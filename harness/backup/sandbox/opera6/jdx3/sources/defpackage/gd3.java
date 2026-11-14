package defpackage;

import com.leanplum.internal.Constants;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final /* synthetic */ class gd3 implements iv9 {
    public static final gd3 a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        gd3 gd3Var = new gd3();
        a = gd3Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.opera.android.live_score.data.network.BettingModel.Odd", gd3Var, 7);
        pluginGeneratedSerialDescriptor.k("id", false);
        pluginGeneratedSerialDescriptor.k(Constants.Params.NAME, false);
        pluginGeneratedSerialDescriptor.k("handicap_spread", true);
        pluginGeneratedSerialDescriptor.k(Constants.Params.VALUE, false);
        pluginGeneratedSerialDescriptor.k("old_value", false);
        pluginGeneratedSerialDescriptor.k("delta", false);
        pluginGeneratedSerialDescriptor.k("jump_url", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    public final KSerializer[] childSerializers() {
        KSerializer kSerializer = xhk.a;
        KSerializer kSerializerB = f03.B(kSerializer);
        KSerializer kSerializerB2 = f03.B(kSerializer);
        oe7 oe7Var = oe7.a;
        return new KSerializer[]{kSerializer, kSerializer, kSerializerB, oe7Var, oe7Var, ecb.a, kSerializerB2};
    }

    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        oh5 oh5VarB = decoder.b(serialDescriptor);
        int i = 0;
        int iL = 0;
        String strO = null;
        String strO2 = null;
        String str = null;
        String str2 = null;
        double dE = 0.0d;
        double dE2 = 0.0d;
        boolean z = true;
        while (z) {
            int iP = oh5VarB.p(serialDescriptor);
            switch (iP) {
                case -1:
                    z = false;
                    break;
                case 0:
                    strO = oh5VarB.o(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    strO2 = oh5VarB.o(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    str = (String) oh5VarB.m(serialDescriptor, 2, xhk.a);
                    i |= 4;
                    break;
                case 3:
                    dE = oh5VarB.E(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    dE2 = oh5VarB.E(serialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    iL = oh5VarB.l(serialDescriptor, 5);
                    i |= 32;
                    break;
                case 6:
                    str2 = (String) oh5VarB.m(serialDescriptor, 6, xhk.a);
                    i |= 64;
                    break;
                default:
                    t3p.d(iP);
                    return null;
            }
        }
        oh5VarB.c(serialDescriptor);
        return new id3(i, strO, strO2, str, dE, dE2, iL, str2);
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public final void serialize(Encoder encoder, Object obj) {
        id3 id3Var = (id3) obj;
        SerialDescriptor serialDescriptor = descriptor;
        ph5 ph5VarB = encoder.b(serialDescriptor);
        String str = id3Var.a;
        String str2 = id3Var.g;
        String str3 = id3Var.c;
        ph5VarB.z(serialDescriptor, 0, str);
        ph5VarB.z(serialDescriptor, 1, id3Var.b);
        if (ph5VarB.E() || str3 != null) {
            ph5VarB.j(serialDescriptor, 2, xhk.a, str3);
        }
        ph5VarB.D(serialDescriptor, 3, id3Var.d);
        ph5VarB.D(serialDescriptor, 4, id3Var.e);
        ph5VarB.v(5, id3Var.f, serialDescriptor);
        if (ph5VarB.E() || str2 != null) {
            ph5VarB.j(serialDescriptor, 6, xhk.a, str2);
        }
        ph5VarB.c(serialDescriptor);
    }
}
