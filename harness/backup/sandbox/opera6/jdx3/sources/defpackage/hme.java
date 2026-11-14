package defpackage;

import com.leanplum.internal.Constants;
import com.leanplum.internal.ResourceQualifiers;
import com.leanplum.utils.SizeUtil;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final /* synthetic */ class hme implements iv9 {
    public static final hme a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        hme hmeVar = new hme();
        a = hmeVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.opera.android.live_score.football.data.network.model.NetworkFootballEvent", hmeVar, 19);
        pluginGeneratedSerialDescriptor.k("event_id", false);
        pluginGeneratedSerialDescriptor.k("sport", true);
        pluginGeneratedSerialDescriptor.k("tournament_association_id", false);
        pluginGeneratedSerialDescriptor.k("tournament_stage_id", false);
        pluginGeneratedSerialDescriptor.k("tournament_season_id", false);
        pluginGeneratedSerialDescriptor.k("live_details", false);
        pluginGeneratedSerialDescriptor.k(Constants.Params.NAME, false);
        pluginGeneratedSerialDescriptor.k("leg", true);
        pluginGeneratedSerialDescriptor.k("total_legs", true);
        pluginGeneratedSerialDescriptor.k("status", true);
        pluginGeneratedSerialDescriptor.k("status_description", true);
        pluginGeneratedSerialDescriptor.k("status_description_en", true);
        pluginGeneratedSerialDescriptor.k("finish_type", true);
        pluginGeneratedSerialDescriptor.k("series_winner_team_id", true);
        pluginGeneratedSerialDescriptor.k("home_team", false);
        pluginGeneratedSerialDescriptor.k("away_team", false);
        pluginGeneratedSerialDescriptor.k("planned_start_timestamp", false);
        pluginGeneratedSerialDescriptor.k(Constants.Params.TIME, false);
        pluginGeneratedSerialDescriptor.k("tournament", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    public final KSerializer[] childSerializers() {
        l4c[] l4cVarArr = mme.t;
        KSerializer kSerializer = h1d.a;
        KSerializer kSerializerB = f03.B((KSerializer) l4cVarArr[1].getValue());
        KSerializer kSerializer2 = xhk.a;
        ecb ecbVar = ecb.a;
        KSerializer kSerializerB2 = f03.B(ecbVar);
        KSerializer kSerializerB3 = f03.B(ecbVar);
        KSerializer kSerializerB4 = f03.B((KSerializer) l4cVarArr[9].getValue());
        KSerializer kSerializerB5 = f03.B(kSerializer2);
        KSerializer kSerializerB6 = f03.B(kSerializer2);
        KSerializer kSerializerB7 = f03.B((KSerializer) l4cVarArr[12].getValue());
        KSerializer kSerializerB8 = f03.B(kSerializer);
        KSerializer kSerializerB9 = f03.B(ppc.a);
        lne lneVar = lne.a;
        return new KSerializer[]{kSerializer, kSerializerB, kSerializer, kSerializer, kSerializer, rn3.a, kSerializer2, kSerializerB2, kSerializerB3, kSerializerB4, kSerializerB5, kSerializerB6, kSerializerB7, kSerializerB8, lneVar, lneVar, kSerializer, jme.a, kSerializerB9};
    }

    public final Object deserialize(Decoder decoder) {
        int i;
        SerialDescriptor serialDescriptor = descriptor;
        oh5 oh5VarB = decoder.b(serialDescriptor);
        l4c[] l4cVarArr = mme.t;
        int i2 = 0;
        boolean zC = false;
        long jG = 0;
        long jG2 = 0;
        long jG3 = 0;
        long jG4 = 0;
        long jG5 = 0;
        cpc cpcVar = null;
        String strO = null;
        Integer num = null;
        Integer num2 = null;
        jnc jncVar = null;
        String str = null;
        String str2 = null;
        ene eneVar = null;
        Long l = null;
        nne nneVar = null;
        nne nneVar2 = null;
        lme lmeVar = null;
        rpc rpcVar = null;
        boolean z = true;
        while (z) {
            int iP = oh5VarB.p(serialDescriptor);
            switch (iP) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    jG = oh5VarB.g(serialDescriptor, 0);
                    i2 |= 1;
                    continue;
                case 1:
                    cpcVar = (cpc) oh5VarB.m(serialDescriptor, 1, (KSerializer) l4cVarArr[1].getValue());
                    i2 |= 2;
                    continue;
                case 2:
                    jG2 = oh5VarB.g(serialDescriptor, 2);
                    i2 |= 4;
                    continue;
                case 3:
                    jG3 = oh5VarB.g(serialDescriptor, 3);
                    i2 |= 8;
                    continue;
                case 4:
                    jG4 = oh5VarB.g(serialDescriptor, 4);
                    i2 |= 16;
                    continue;
                case 5:
                    zC = oh5VarB.C(serialDescriptor, 5);
                    i2 |= 32;
                    continue;
                case 6:
                    strO = oh5VarB.o(serialDescriptor, 6);
                    i2 |= 64;
                    continue;
                case 7:
                    num = (Integer) oh5VarB.m(serialDescriptor, 7, ecb.a);
                    i2 |= ResourceQualifiers.Qualifier.AnonymousClass5.SCREENLAYOUT_LAYOUTDIR_RTL;
                    continue;
                case 8:
                    num2 = (Integer) oh5VarB.m(serialDescriptor, 8, ecb.a);
                    i2 |= Constants.Crypt.KEY_LENGTH;
                    continue;
                case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                    jncVar = (jnc) oh5VarB.m(serialDescriptor, 9, (KSerializer) l4cVarArr[9].getValue());
                    i2 |= 512;
                    continue;
                case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                    str = (String) oh5VarB.m(serialDescriptor, 10, xhk.a);
                    i2 |= 1024;
                    continue;
                case 11:
                    str2 = (String) oh5VarB.m(serialDescriptor, 11, xhk.a);
                    i2 |= 2048;
                    continue;
                case 12:
                    eneVar = (ene) oh5VarB.m(serialDescriptor, 12, (KSerializer) l4cVarArr[12].getValue());
                    i2 |= 4096;
                    continue;
                case 13:
                    l = (Long) oh5VarB.m(serialDescriptor, 13, h1d.a);
                    i2 |= 8192;
                    continue;
                case 14:
                    nneVar = (nne) oh5VarB.z(serialDescriptor, 14, lne.a);
                    i2 |= 16384;
                    continue;
                case 15:
                    nneVar2 = (nne) oh5VarB.z(serialDescriptor, 15, lne.a);
                    i = 32768;
                    break;
                case 16:
                    jG5 = oh5VarB.g(serialDescriptor, 16);
                    i = 65536;
                    break;
                case 17:
                    lmeVar = (lme) oh5VarB.z(serialDescriptor, 17, jme.a);
                    i = 131072;
                    break;
                case SizeUtil.textSize0_1 /* 18 */:
                    rpcVar = (rpc) oh5VarB.m(serialDescriptor, 18, ppc.a);
                    i = 262144;
                    break;
                default:
                    t3p.d(iP);
                    return null;
            }
            i2 |= i;
        }
        oh5VarB.c(serialDescriptor);
        return new mme(i2, jG, cpcVar, jG2, jG3, jG4, zC, strO, num, num2, jncVar, str, str2, eneVar, l, nneVar, nneVar2, jG5, lmeVar, rpcVar);
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public final void serialize(Encoder encoder, Object obj) {
        mme mmeVar = (mme) obj;
        SerialDescriptor serialDescriptor = descriptor;
        ph5 ph5VarB = encoder.b(serialDescriptor);
        l4c[] l4cVarArr = mme.t;
        long j = mmeVar.a;
        rpc rpcVar = mmeVar.s;
        Long l = mmeVar.n;
        ene eneVar = mmeVar.m;
        String str = mmeVar.l;
        String str2 = mmeVar.k;
        jnc jncVar = mmeVar.j;
        Integer num = mmeVar.i;
        Integer num2 = mmeVar.h;
        cpc cpcVar = mmeVar.b;
        ph5VarB.F(serialDescriptor, 0, j);
        if (ph5VarB.E() || cpcVar != null) {
            ph5VarB.j(serialDescriptor, 1, (KSerializer) l4cVarArr[1].getValue(), cpcVar);
        }
        ph5VarB.F(serialDescriptor, 2, mmeVar.c);
        ph5VarB.F(serialDescriptor, 3, mmeVar.d);
        ph5VarB.F(serialDescriptor, 4, mmeVar.e);
        ph5VarB.y(serialDescriptor, 5, mmeVar.f);
        ph5VarB.z(serialDescriptor, 6, mmeVar.g);
        if (ph5VarB.E() || num2 != null) {
            ph5VarB.j(serialDescriptor, 7, ecb.a, num2);
        }
        if (ph5VarB.E() || num != null) {
            ph5VarB.j(serialDescriptor, 8, ecb.a, num);
        }
        if (ph5VarB.E() || jncVar != null) {
            ph5VarB.j(serialDescriptor, 9, (KSerializer) l4cVarArr[9].getValue(), jncVar);
        }
        if (ph5VarB.E() || str2 != null) {
            ph5VarB.j(serialDescriptor, 10, xhk.a, str2);
        }
        if (ph5VarB.E() || str != null) {
            ph5VarB.j(serialDescriptor, 11, xhk.a, str);
        }
        if (ph5VarB.E() || eneVar != null) {
            ph5VarB.j(serialDescriptor, 12, (KSerializer) l4cVarArr[12].getValue(), eneVar);
        }
        if (ph5VarB.E() || l != null) {
            ph5VarB.j(serialDescriptor, 13, h1d.a, l);
        }
        lne lneVar = lne.a;
        ph5VarB.f(serialDescriptor, 14, lneVar, mmeVar.o);
        ph5VarB.f(serialDescriptor, 15, lneVar, mmeVar.p);
        ph5VarB.F(serialDescriptor, 16, mmeVar.q);
        ph5VarB.f(serialDescriptor, 17, jme.a, mmeVar.r);
        if (ph5VarB.E() || rpcVar != null) {
            ph5VarB.j(serialDescriptor, 18, ppc.a, rpcVar);
        }
        ph5VarB.c(serialDescriptor);
    }
}
