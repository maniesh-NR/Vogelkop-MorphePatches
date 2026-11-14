package defpackage;

import com.leanplum.internal.Constants;
import com.leanplum.internal.RequestBuilder;
import com.leanplum.internal.ResourceQualifiers;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final /* synthetic */ class jme implements iv9 {
    public static final jme a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        jme jmeVar = new jme();
        a = jmeVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.opera.android.live_score.football.data.network.model.NetworkFootballEvent.LiveScoreEventTime", jmeVar, 10);
        pluginGeneratedSerialDescriptor.k(RequestBuilder.ACTION_START, true);
        pluginGeneratedSerialDescriptor.k("first_half", true);
        pluginGeneratedSerialDescriptor.k("first_half_extended", true);
        pluginGeneratedSerialDescriptor.k("second_half", true);
        pluginGeneratedSerialDescriptor.k("second_half_extended", true);
        pluginGeneratedSerialDescriptor.k("first_half_extra", true);
        pluginGeneratedSerialDescriptor.k("first_half_extra_extended", true);
        pluginGeneratedSerialDescriptor.k("second_half_extra", true);
        pluginGeneratedSerialDescriptor.k("second_half_extra_extended", true);
        pluginGeneratedSerialDescriptor.k("current", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    public final KSerializer[] childSerializers() {
        KSerializer kSerializerB = f03.B(h1d.a);
        ecb ecbVar = ecb.a;
        return new KSerializer[]{kSerializerB, f03.B(ecbVar), f03.B(ecbVar), f03.B(ecbVar), f03.B(ecbVar), f03.B(ecbVar), f03.B(ecbVar), f03.B(ecbVar), f03.B(ecbVar), f03.B(ecbVar)};
    }

    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        oh5 oh5VarB = decoder.b(serialDescriptor);
        Object obj = null;
        boolean z = true;
        int i = 0;
        Long l = null;
        Integer num = null;
        Integer num2 = null;
        Integer num3 = null;
        Integer num4 = null;
        Integer num5 = null;
        Integer num6 = null;
        Integer num7 = null;
        Integer num8 = null;
        Integer num9 = null;
        while (z) {
            int iP = oh5VarB.p(serialDescriptor);
            switch (iP) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    l = (Long) oh5VarB.m(serialDescriptor, 0, h1d.a);
                    i |= 1;
                    break;
                case 1:
                    num = (Integer) oh5VarB.m(serialDescriptor, 1, ecb.a);
                    i |= 2;
                    break;
                case 2:
                    num2 = (Integer) oh5VarB.m(serialDescriptor, 2, ecb.a);
                    i |= 4;
                    break;
                case 3:
                    num3 = (Integer) oh5VarB.m(serialDescriptor, 3, ecb.a);
                    i |= 8;
                    break;
                case 4:
                    num4 = (Integer) oh5VarB.m(serialDescriptor, 4, ecb.a);
                    i |= 16;
                    break;
                case 5:
                    num5 = (Integer) oh5VarB.m(serialDescriptor, 5, ecb.a);
                    i |= 32;
                    break;
                case 6:
                    num6 = (Integer) oh5VarB.m(serialDescriptor, 6, ecb.a);
                    i |= 64;
                    break;
                case 7:
                    num7 = (Integer) oh5VarB.m(serialDescriptor, 7, ecb.a);
                    i |= ResourceQualifiers.Qualifier.AnonymousClass5.SCREENLAYOUT_LAYOUTDIR_RTL;
                    break;
                case 8:
                    num8 = (Integer) oh5VarB.m(serialDescriptor, 8, ecb.a);
                    i |= Constants.Crypt.KEY_LENGTH;
                    break;
                case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                    num9 = (Integer) oh5VarB.m(serialDescriptor, 9, ecb.a);
                    i |= 512;
                    break;
                default:
                    t3p.d(iP);
                    return obj;
            }
            obj = null;
        }
        oh5VarB.c(serialDescriptor);
        return new lme(i, l, num, num2, num3, num4, num5, num6, num7, num8, num9);
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public final void serialize(Encoder encoder, Object obj) {
        lme lmeVar = (lme) obj;
        SerialDescriptor serialDescriptor = descriptor;
        ph5 ph5VarB = encoder.b(serialDescriptor);
        if (ph5VarB.E() || lmeVar.a != null) {
            ph5VarB.j(serialDescriptor, 0, h1d.a, lmeVar.a);
        }
        if (ph5VarB.E() || lmeVar.b != null) {
            ph5VarB.j(serialDescriptor, 1, ecb.a, lmeVar.b);
        }
        if (ph5VarB.E() || lmeVar.c != null) {
            ph5VarB.j(serialDescriptor, 2, ecb.a, lmeVar.c);
        }
        if (ph5VarB.E() || lmeVar.d != null) {
            ph5VarB.j(serialDescriptor, 3, ecb.a, lmeVar.d);
        }
        if (ph5VarB.E() || lmeVar.e != null) {
            ph5VarB.j(serialDescriptor, 4, ecb.a, lmeVar.e);
        }
        if (ph5VarB.E() || lmeVar.f != null) {
            ph5VarB.j(serialDescriptor, 5, ecb.a, lmeVar.f);
        }
        if (ph5VarB.E() || lmeVar.g != null) {
            ph5VarB.j(serialDescriptor, 6, ecb.a, lmeVar.g);
        }
        if (ph5VarB.E() || lmeVar.h != null) {
            ph5VarB.j(serialDescriptor, 7, ecb.a, lmeVar.h);
        }
        if (ph5VarB.E() || lmeVar.i != null) {
            ph5VarB.j(serialDescriptor, 8, ecb.a, lmeVar.i);
        }
        if (ph5VarB.E() || lmeVar.j != null) {
            ph5VarB.j(serialDescriptor, 9, ecb.a, lmeVar.j);
        }
        ph5VarB.c(serialDescriptor);
    }
}
