package defpackage;

import com.leanplum.internal.Constants;
import com.leanplum.internal.ResourceQualifiers;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final /* synthetic */ class lne implements iv9 {
    public static final lne a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        lne lneVar = new lne();
        a = lneVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.opera.android.live_score.football.data.network.model.NetworkFootballTeamScore", lneVar, 10);
        pluginGeneratedSerialDescriptor.k("team_id", false);
        pluginGeneratedSerialDescriptor.k(Constants.Params.NAME, false);
        pluginGeneratedSerialDescriptor.k("short_name", true);
        pluginGeneratedSerialDescriptor.k("gender", true);
        pluginGeneratedSerialDescriptor.k("logo_url", true);
        pluginGeneratedSerialDescriptor.k(Constants.Keys.COUNTRY, true);
        pluginGeneratedSerialDescriptor.k("continent", true);
        pluginGeneratedSerialDescriptor.k("score", true);
        pluginGeneratedSerialDescriptor.k("score_penalties", true);
        pluginGeneratedSerialDescriptor.k("aggregate_score", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    public final KSerializer[] childSerializers() {
        l4c[] l4cVarArr = nne.k;
        KSerializer kSerializer = xhk.a;
        KSerializer kSerializerB = f03.B(kSerializer);
        KSerializer kSerializerB2 = f03.B((KSerializer) l4cVarArr[3].getValue());
        KSerializer kSerializerB3 = f03.B(kSerializer);
        KSerializer kSerializerB4 = f03.B(kSerializer);
        KSerializer kSerializerB5 = f03.B(kSerializer);
        ecb ecbVar = ecb.a;
        return new KSerializer[]{h1d.a, kSerializer, kSerializerB, kSerializerB2, kSerializerB3, kSerializerB4, kSerializerB5, f03.B(ecbVar), f03.B(ecbVar), f03.B(ecbVar)};
    }

    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        oh5 oh5VarB = decoder.b(serialDescriptor);
        l4c[] l4cVarArr = nne.k;
        int i = 0;
        long jG = 0;
        String strO = null;
        String str = null;
        boc bocVar = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Integer num = null;
        Integer num2 = null;
        Integer num3 = null;
        boolean z = true;
        while (z) {
            int iP = oh5VarB.p(serialDescriptor);
            switch (iP) {
                case -1:
                    z = false;
                    break;
                case 0:
                    jG = oh5VarB.g(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    strO = oh5VarB.o(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    str = (String) oh5VarB.m(serialDescriptor, 2, xhk.a);
                    i |= 4;
                    break;
                case 3:
                    bocVar = (boc) oh5VarB.m(serialDescriptor, 3, (KSerializer) l4cVarArr[3].getValue());
                    i |= 8;
                    break;
                case 4:
                    str2 = (String) oh5VarB.m(serialDescriptor, 4, xhk.a);
                    i |= 16;
                    break;
                case 5:
                    str3 = (String) oh5VarB.m(serialDescriptor, 5, xhk.a);
                    i |= 32;
                    break;
                case 6:
                    str4 = (String) oh5VarB.m(serialDescriptor, 6, xhk.a);
                    i |= 64;
                    break;
                case 7:
                    num = (Integer) oh5VarB.m(serialDescriptor, 7, ecb.a);
                    i |= ResourceQualifiers.Qualifier.AnonymousClass5.SCREENLAYOUT_LAYOUTDIR_RTL;
                    break;
                case 8:
                    num2 = (Integer) oh5VarB.m(serialDescriptor, 8, ecb.a);
                    i |= Constants.Crypt.KEY_LENGTH;
                    break;
                case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                    num3 = (Integer) oh5VarB.m(serialDescriptor, 9, ecb.a);
                    i |= 512;
                    break;
                default:
                    t3p.d(iP);
                    return null;
            }
        }
        oh5VarB.c(serialDescriptor);
        return new nne(i, jG, strO, str, bocVar, str2, str3, str4, num, num2, num3);
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public final void serialize(Encoder encoder, Object obj) {
        nne nneVar = (nne) obj;
        SerialDescriptor serialDescriptor = descriptor;
        ph5 ph5VarB = encoder.b(serialDescriptor);
        l4c[] l4cVarArr = nne.k;
        long j = nneVar.a;
        Integer num = nneVar.j;
        Integer num2 = nneVar.i;
        Integer num3 = nneVar.h;
        String str = nneVar.g;
        String str2 = nneVar.f;
        String str3 = nneVar.e;
        boc bocVar = nneVar.d;
        String str4 = nneVar.c;
        ph5VarB.F(serialDescriptor, 0, j);
        ph5VarB.z(serialDescriptor, 1, nneVar.b);
        if (ph5VarB.E() || str4 != null) {
            ph5VarB.j(serialDescriptor, 2, xhk.a, str4);
        }
        if (ph5VarB.E() || bocVar != null) {
            ph5VarB.j(serialDescriptor, 3, (KSerializer) l4cVarArr[3].getValue(), bocVar);
        }
        if (ph5VarB.E() || str3 != null) {
            ph5VarB.j(serialDescriptor, 4, xhk.a, str3);
        }
        if (ph5VarB.E() || str2 != null) {
            ph5VarB.j(serialDescriptor, 5, xhk.a, str2);
        }
        if (ph5VarB.E() || str != null) {
            ph5VarB.j(serialDescriptor, 6, xhk.a, str);
        }
        if (ph5VarB.E() || num3 != null) {
            ph5VarB.j(serialDescriptor, 7, ecb.a, num3);
        }
        if (ph5VarB.E() || num2 != null) {
            ph5VarB.j(serialDescriptor, 8, ecb.a, num2);
        }
        if (ph5VarB.E() || num != null) {
            ph5VarB.j(serialDescriptor, 9, ecb.a, num);
        }
        ph5VarB.c(serialDescriptor);
    }
}
