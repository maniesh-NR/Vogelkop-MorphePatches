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
public final /* synthetic */ class wme implements iv9 {
    public static final wme a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        wme wmeVar = new wme();
        a = wmeVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.opera.android.live_score.football.data.network.model.NetworkFootballEventEnvelope.Timepoints", wmeVar, 10);
        pluginGeneratedSerialDescriptor.k("planned_start", true);
        pluginGeneratedSerialDescriptor.k("base_time_1st_half_start", true);
        pluginGeneratedSerialDescriptor.k("base_time_1st_half_end", true);
        pluginGeneratedSerialDescriptor.k("base_time_2nd_half_start", true);
        pluginGeneratedSerialDescriptor.k("base_time_2nd_half_end", true);
        pluginGeneratedSerialDescriptor.k("extra_time_1st_half_start", true);
        pluginGeneratedSerialDescriptor.k("extra_time_1st_half_end", true);
        pluginGeneratedSerialDescriptor.k("extra_time_2nd_half_start", true);
        pluginGeneratedSerialDescriptor.k("extra_time_2nd_half_end", true);
        pluginGeneratedSerialDescriptor.k("end", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    public final KSerializer[] childSerializers() {
        l4c[] l4cVarArr = yme.k;
        return new KSerializer[]{f03.B((KSerializer) l4cVarArr[0].getValue()), f03.B((KSerializer) l4cVarArr[1].getValue()), f03.B((KSerializer) l4cVarArr[2].getValue()), f03.B((KSerializer) l4cVarArr[3].getValue()), f03.B((KSerializer) l4cVarArr[4].getValue()), f03.B((KSerializer) l4cVarArr[5].getValue()), f03.B((KSerializer) l4cVarArr[6].getValue()), f03.B((KSerializer) l4cVarArr[7].getValue()), f03.B((KSerializer) l4cVarArr[8].getValue()), f03.B((KSerializer) l4cVarArr[9].getValue())};
    }

    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        oh5 oh5VarB = decoder.b(serialDescriptor);
        l4c[] l4cVarArr = yme.k;
        Object obj = null;
        boolean z = true;
        int i = 0;
        ebb ebbVar = null;
        ebb ebbVar2 = null;
        ebb ebbVar3 = null;
        ebb ebbVar4 = null;
        ebb ebbVar5 = null;
        ebb ebbVar6 = null;
        ebb ebbVar7 = null;
        ebb ebbVar8 = null;
        ebb ebbVar9 = null;
        ebb ebbVar10 = null;
        while (z) {
            int iP = oh5VarB.p(serialDescriptor);
            switch (iP) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    ebbVar = (ebb) oh5VarB.m(serialDescriptor, 0, (KSerializer) l4cVarArr[0].getValue());
                    i |= 1;
                    break;
                case 1:
                    ebbVar2 = (ebb) oh5VarB.m(serialDescriptor, 1, (KSerializer) l4cVarArr[1].getValue());
                    i |= 2;
                    break;
                case 2:
                    ebbVar3 = (ebb) oh5VarB.m(serialDescriptor, 2, (KSerializer) l4cVarArr[2].getValue());
                    i |= 4;
                    break;
                case 3:
                    ebbVar4 = (ebb) oh5VarB.m(serialDescriptor, 3, (KSerializer) l4cVarArr[3].getValue());
                    i |= 8;
                    break;
                case 4:
                    ebbVar5 = (ebb) oh5VarB.m(serialDescriptor, 4, (KSerializer) l4cVarArr[4].getValue());
                    i |= 16;
                    break;
                case 5:
                    ebbVar6 = (ebb) oh5VarB.m(serialDescriptor, 5, (KSerializer) l4cVarArr[5].getValue());
                    i |= 32;
                    break;
                case 6:
                    ebbVar7 = (ebb) oh5VarB.m(serialDescriptor, 6, (KSerializer) l4cVarArr[6].getValue());
                    i |= 64;
                    break;
                case 7:
                    ebbVar8 = (ebb) oh5VarB.m(serialDescriptor, 7, (KSerializer) l4cVarArr[7].getValue());
                    i |= ResourceQualifiers.Qualifier.AnonymousClass5.SCREENLAYOUT_LAYOUTDIR_RTL;
                    break;
                case 8:
                    ebbVar9 = (ebb) oh5VarB.m(serialDescriptor, 8, (KSerializer) l4cVarArr[8].getValue());
                    i |= Constants.Crypt.KEY_LENGTH;
                    break;
                case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                    ebbVar10 = (ebb) oh5VarB.m(serialDescriptor, 9, (KSerializer) l4cVarArr[9].getValue());
                    i |= 512;
                    break;
                default:
                    t3p.d(iP);
                    return obj;
            }
            obj = null;
        }
        oh5VarB.c(serialDescriptor);
        return new yme(i, ebbVar, ebbVar2, ebbVar3, ebbVar4, ebbVar5, ebbVar6, ebbVar7, ebbVar8, ebbVar9, ebbVar10);
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public final void serialize(Encoder encoder, Object obj) {
        yme ymeVar = (yme) obj;
        SerialDescriptor serialDescriptor = descriptor;
        ph5 ph5VarB = encoder.b(serialDescriptor);
        l4c[] l4cVarArr = yme.k;
        if (ph5VarB.E() || ymeVar.a != null) {
            ph5VarB.j(serialDescriptor, 0, (KSerializer) l4cVarArr[0].getValue(), ymeVar.a);
        }
        if (ph5VarB.E() || ymeVar.b != null) {
            ph5VarB.j(serialDescriptor, 1, (KSerializer) l4cVarArr[1].getValue(), ymeVar.b);
        }
        if (ph5VarB.E() || ymeVar.c != null) {
            ph5VarB.j(serialDescriptor, 2, (KSerializer) l4cVarArr[2].getValue(), ymeVar.c);
        }
        if (ph5VarB.E() || ymeVar.d != null) {
            ph5VarB.j(serialDescriptor, 3, (KSerializer) l4cVarArr[3].getValue(), ymeVar.d);
        }
        if (ph5VarB.E() || ymeVar.e != null) {
            ph5VarB.j(serialDescriptor, 4, (KSerializer) l4cVarArr[4].getValue(), ymeVar.e);
        }
        if (ph5VarB.E() || ymeVar.f != null) {
            ph5VarB.j(serialDescriptor, 5, (KSerializer) l4cVarArr[5].getValue(), ymeVar.f);
        }
        if (ph5VarB.E() || ymeVar.g != null) {
            ph5VarB.j(serialDescriptor, 6, (KSerializer) l4cVarArr[6].getValue(), ymeVar.g);
        }
        if (ph5VarB.E() || ymeVar.h != null) {
            ph5VarB.j(serialDescriptor, 7, (KSerializer) l4cVarArr[7].getValue(), ymeVar.h);
        }
        if (ph5VarB.E() || ymeVar.i != null) {
            ph5VarB.j(serialDescriptor, 8, (KSerializer) l4cVarArr[8].getValue(), ymeVar.i);
        }
        if (ph5VarB.E() || ymeVar.j != null) {
            ph5VarB.j(serialDescriptor, 9, (KSerializer) l4cVarArr[9].getValue(), ymeVar.j);
        }
        ph5VarB.c(serialDescriptor);
    }
}
