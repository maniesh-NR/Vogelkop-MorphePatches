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
public final /* synthetic */ class ppc implements iv9 {
    public static final ppc a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        ppc ppcVar = new ppc();
        a = ppcVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.opera.android.live_score.data.network.model.LiveScoreTournament", ppcVar, 9);
        pluginGeneratedSerialDescriptor.k("tournament_stage_id", false);
        pluginGeneratedSerialDescriptor.k("tournament_season_id", false);
        pluginGeneratedSerialDescriptor.k(Constants.Params.NAME, false);
        pluginGeneratedSerialDescriptor.k("season", true);
        pluginGeneratedSerialDescriptor.k("gender", true);
        pluginGeneratedSerialDescriptor.k("logo_url", true);
        pluginGeneratedSerialDescriptor.k("flag_url", true);
        pluginGeneratedSerialDescriptor.k(Constants.Keys.COUNTRY, true);
        pluginGeneratedSerialDescriptor.k("continent", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    public final KSerializer[] childSerializers() {
        l4c[] l4cVarArr = rpc.j;
        KSerializer kSerializer = xhk.a;
        KSerializer kSerializerB = f03.B(kSerializer);
        KSerializer kSerializerB2 = f03.B((KSerializer) l4cVarArr[4].getValue());
        KSerializer kSerializerB3 = f03.B(kSerializer);
        KSerializer kSerializerB4 = f03.B(kSerializer);
        KSerializer kSerializerB5 = f03.B(kSerializer);
        KSerializer kSerializerB6 = f03.B(kSerializer);
        h1d h1dVar = h1d.a;
        return new KSerializer[]{h1dVar, h1dVar, kSerializer, kSerializerB, kSerializerB2, kSerializerB3, kSerializerB4, kSerializerB5, kSerializerB6};
    }

    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        oh5 oh5VarB = decoder.b(serialDescriptor);
        l4c[] l4cVarArr = rpc.j;
        int i = 0;
        long jG = 0;
        long jG2 = 0;
        String strO = null;
        String str = null;
        boc bocVar = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
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
                    jG2 = oh5VarB.g(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    strO = oh5VarB.o(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    str = (String) oh5VarB.m(serialDescriptor, 3, xhk.a);
                    i |= 8;
                    break;
                case 4:
                    bocVar = (boc) oh5VarB.m(serialDescriptor, 4, (KSerializer) l4cVarArr[4].getValue());
                    i |= 16;
                    break;
                case 5:
                    str2 = (String) oh5VarB.m(serialDescriptor, 5, xhk.a);
                    i |= 32;
                    break;
                case 6:
                    str3 = (String) oh5VarB.m(serialDescriptor, 6, xhk.a);
                    i |= 64;
                    break;
                case 7:
                    str4 = (String) oh5VarB.m(serialDescriptor, 7, xhk.a);
                    i |= ResourceQualifiers.Qualifier.AnonymousClass5.SCREENLAYOUT_LAYOUTDIR_RTL;
                    break;
                case 8:
                    str5 = (String) oh5VarB.m(serialDescriptor, 8, xhk.a);
                    i |= Constants.Crypt.KEY_LENGTH;
                    break;
                default:
                    t3p.d(iP);
                    return null;
            }
        }
        oh5VarB.c(serialDescriptor);
        return new rpc(i, jG, jG2, strO, str, bocVar, str2, str3, str4, str5);
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public final void serialize(Encoder encoder, Object obj) {
        rpc rpcVar = (rpc) obj;
        SerialDescriptor serialDescriptor = descriptor;
        ph5 ph5VarB = encoder.b(serialDescriptor);
        l4c[] l4cVarArr = rpc.j;
        long j = rpcVar.a;
        String str = rpcVar.i;
        String str2 = rpcVar.h;
        String str3 = rpcVar.g;
        String str4 = rpcVar.f;
        boc bocVar = rpcVar.e;
        String str5 = rpcVar.d;
        ph5VarB.F(serialDescriptor, 0, j);
        ph5VarB.F(serialDescriptor, 1, rpcVar.b);
        ph5VarB.z(serialDescriptor, 2, rpcVar.c);
        if (ph5VarB.E() || str5 != null) {
            ph5VarB.j(serialDescriptor, 3, xhk.a, str5);
        }
        if (ph5VarB.E() || bocVar != null) {
            ph5VarB.j(serialDescriptor, 4, (KSerializer) l4cVarArr[4].getValue(), bocVar);
        }
        if (ph5VarB.E() || str4 != null) {
            ph5VarB.j(serialDescriptor, 5, xhk.a, str4);
        }
        if (ph5VarB.E() || str3 != null) {
            ph5VarB.j(serialDescriptor, 6, xhk.a, str3);
        }
        if (ph5VarB.E() || str2 != null) {
            ph5VarB.j(serialDescriptor, 7, xhk.a, str2);
        }
        if (ph5VarB.E() || str != null) {
            ph5VarB.j(serialDescriptor, 8, xhk.a, str);
        }
        ph5VarB.c(serialDescriptor);
    }
}
