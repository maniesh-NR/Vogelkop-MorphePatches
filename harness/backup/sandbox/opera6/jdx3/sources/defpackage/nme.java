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
public final /* synthetic */ class nme implements iv9 {
    public static final nme a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        nme nmeVar = new nme();
        a = nmeVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.opera.android.live_score.football.data.network.model.NetworkFootballEventEnvelope", nmeVar, 9);
        pluginGeneratedSerialDescriptor.k("event_id", false);
        pluginGeneratedSerialDescriptor.k("sport", true);
        pluginGeneratedSerialDescriptor.k("tournament_stage_id", true);
        pluginGeneratedSerialDescriptor.k("status", false);
        pluginGeneratedSerialDescriptor.k("status_description_en", true);
        pluginGeneratedSerialDescriptor.k("finish_type", true);
        pluginGeneratedSerialDescriptor.k("home_team", false);
        pluginGeneratedSerialDescriptor.k("away_team", false);
        pluginGeneratedSerialDescriptor.k("timepoints", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    public final KSerializer[] childSerializers() {
        KSerializer kSerializer = h1d.a;
        KSerializer kSerializer2 = xhk.a;
        KSerializer kSerializerB = f03.B(kSerializer2);
        KSerializer kSerializerB2 = f03.B(kSerializer);
        KSerializer kSerializerB3 = f03.B(kSerializer2);
        KSerializer kSerializerB4 = f03.B(kSerializer2);
        KSerializer kSerializerB5 = f03.B(wme.a);
        sme smeVar = sme.a;
        return new KSerializer[]{kSerializer, kSerializerB, kSerializerB2, kSerializer2, kSerializerB3, kSerializerB4, smeVar, smeVar, kSerializerB5};
    }

    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        oh5 oh5VarB = decoder.b(serialDescriptor);
        int i = 0;
        long jG = 0;
        String str = null;
        Long l = null;
        String strO = null;
        String str2 = null;
        String str3 = null;
        ume umeVar = null;
        ume umeVar2 = null;
        yme ymeVar = null;
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
                    str = (String) oh5VarB.m(serialDescriptor, 1, xhk.a);
                    i |= 2;
                    break;
                case 2:
                    l = (Long) oh5VarB.m(serialDescriptor, 2, h1d.a);
                    i |= 4;
                    break;
                case 3:
                    strO = oh5VarB.o(serialDescriptor, 3);
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
                    umeVar = (ume) oh5VarB.z(serialDescriptor, 6, sme.a);
                    i |= 64;
                    break;
                case 7:
                    umeVar2 = (ume) oh5VarB.z(serialDescriptor, 7, sme.a);
                    i |= ResourceQualifiers.Qualifier.AnonymousClass5.SCREENLAYOUT_LAYOUTDIR_RTL;
                    break;
                case 8:
                    ymeVar = (yme) oh5VarB.m(serialDescriptor, 8, wme.a);
                    i |= Constants.Crypt.KEY_LENGTH;
                    break;
                default:
                    t3p.d(iP);
                    return null;
            }
        }
        oh5VarB.c(serialDescriptor);
        return new zme(i, jG, str, l, strO, str2, str3, umeVar, umeVar2, ymeVar);
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public final void serialize(Encoder encoder, Object obj) {
        zme zmeVar = (zme) obj;
        SerialDescriptor serialDescriptor = descriptor;
        ph5 ph5VarB = encoder.b(serialDescriptor);
        long j = zmeVar.a;
        yme ymeVar = zmeVar.i;
        String str = zmeVar.f;
        String str2 = zmeVar.e;
        Long l = zmeVar.c;
        String str3 = zmeVar.b;
        ph5VarB.F(serialDescriptor, 0, j);
        if (ph5VarB.E() || str3 != null) {
            ph5VarB.j(serialDescriptor, 1, xhk.a, str3);
        }
        if (ph5VarB.E() || l != null) {
            ph5VarB.j(serialDescriptor, 2, h1d.a, l);
        }
        ph5VarB.z(serialDescriptor, 3, zmeVar.d);
        if (ph5VarB.E() || str2 != null) {
            ph5VarB.j(serialDescriptor, 4, xhk.a, str2);
        }
        if (ph5VarB.E() || str != null) {
            ph5VarB.j(serialDescriptor, 5, xhk.a, str);
        }
        sme smeVar = sme.a;
        ph5VarB.f(serialDescriptor, 6, smeVar, zmeVar.g);
        ph5VarB.f(serialDescriptor, 7, smeVar, zmeVar.h);
        if (ph5VarB.E() || ymeVar != null) {
            ph5VarB.j(serialDescriptor, 8, wme.a, ymeVar);
        }
        ph5VarB.c(serialDescriptor);
    }
}
