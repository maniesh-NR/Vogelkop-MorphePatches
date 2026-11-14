package defpackage;

import com.leanplum.internal.Constants;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final /* synthetic */ class lpc implements iv9 {
    public static final lpc a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        lpc lpcVar = new lpc();
        a = lpcVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.opera.android.live_score.data.network.model.LiveScoreTeamWithCountry", lpcVar, 7);
        pluginGeneratedSerialDescriptor.k("team_id", false);
        pluginGeneratedSerialDescriptor.k(Constants.Params.NAME, false);
        pluginGeneratedSerialDescriptor.k("short_name", true);
        pluginGeneratedSerialDescriptor.k("gender", true);
        pluginGeneratedSerialDescriptor.k("logo_url", true);
        pluginGeneratedSerialDescriptor.k(Constants.Keys.COUNTRY, true);
        pluginGeneratedSerialDescriptor.k("continent", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    public final KSerializer[] childSerializers() {
        l4c[] l4cVarArr = npc.h;
        KSerializer kSerializer = xhk.a;
        return new KSerializer[]{h1d.a, kSerializer, f03.B(kSerializer), f03.B((KSerializer) l4cVarArr[3].getValue()), f03.B(kSerializer), f03.B(kSerializer), f03.B(kSerializer)};
    }

    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        oh5 oh5VarB = decoder.b(serialDescriptor);
        l4c[] l4cVarArr = npc.h;
        int i = 0;
        long jG = 0;
        String strO = null;
        String str = null;
        boc bocVar = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
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
                default:
                    t3p.d(iP);
                    return null;
            }
        }
        oh5VarB.c(serialDescriptor);
        return new npc(i, jG, strO, str, bocVar, str2, str3, str4);
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public final void serialize(Encoder encoder, Object obj) {
        npc npcVar = (npc) obj;
        SerialDescriptor serialDescriptor = descriptor;
        ph5 ph5VarB = encoder.b(serialDescriptor);
        l4c[] l4cVarArr = npc.h;
        long j = npcVar.a;
        String str = npcVar.g;
        String str2 = npcVar.f;
        String str3 = npcVar.e;
        boc bocVar = npcVar.d;
        String str4 = npcVar.c;
        ph5VarB.F(serialDescriptor, 0, j);
        ph5VarB.z(serialDescriptor, 1, npcVar.b);
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
        ph5VarB.c(serialDescriptor);
    }
}
