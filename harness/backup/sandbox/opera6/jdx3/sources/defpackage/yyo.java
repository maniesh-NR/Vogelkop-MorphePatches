package defpackage;

import com.leanplum.internal.Constants;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes.dex */
public final class yyo implements iv9 {
    public static final yyo a;
    public static final /* synthetic */ PluginGeneratedSerialDescriptor b;

    static {
        yyo yyoVar = new yyo();
        a = yyoVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.opera.ads.internal.data.DeviceObject.Geo", yyoVar, 5);
        pluginGeneratedSerialDescriptor.k("lat", false);
        pluginGeneratedSerialDescriptor.k("lon", false);
        pluginGeneratedSerialDescriptor.k(Constants.Params.TYPE, false);
        pluginGeneratedSerialDescriptor.k(Constants.Keys.COUNTRY, true);
        pluginGeneratedSerialDescriptor.k("utcoffset", false);
        b = pluginGeneratedSerialDescriptor;
    }

    public final KSerializer[] childSerializers() {
        v89 v89Var = v89.a;
        KSerializer kSerializerB = f03.B(v89Var);
        KSerializer kSerializerB2 = f03.B(v89Var);
        ecb ecbVar = ecb.a;
        return new KSerializer[]{kSerializerB, kSerializerB2, f03.B(ecbVar), f03.B(xhk.a), f03.B(ecbVar)};
    }

    public final Object deserialize(Decoder decoder) {
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
        oh5 oh5VarB = decoder.b(pluginGeneratedSerialDescriptor);
        boolean z = true;
        int i = 0;
        Float f = null;
        Float f2 = null;
        Integer num = null;
        String str = null;
        Integer num2 = null;
        while (z) {
            int iP = oh5VarB.p(pluginGeneratedSerialDescriptor);
            if (iP == -1) {
                z = false;
            } else if (iP == 0) {
                f = (Float) oh5VarB.m(pluginGeneratedSerialDescriptor, 0, v89.a);
                i |= 1;
            } else if (iP == 1) {
                f2 = (Float) oh5VarB.m(pluginGeneratedSerialDescriptor, 1, v89.a);
                i |= 2;
            } else if (iP == 2) {
                num = (Integer) oh5VarB.m(pluginGeneratedSerialDescriptor, 2, ecb.a);
                i |= 4;
            } else if (iP == 3) {
                str = (String) oh5VarB.m(pluginGeneratedSerialDescriptor, 3, xhk.a);
                i |= 8;
            } else {
                if (iP != 4) {
                    t3p.d(iP);
                    return null;
                }
                num2 = (Integer) oh5VarB.m(pluginGeneratedSerialDescriptor, 4, ecb.a);
                i |= 16;
            }
        }
        oh5VarB.c(pluginGeneratedSerialDescriptor);
        return new azo(i, f, f2, num, str, num2);
    }

    public final SerialDescriptor getDescriptor() {
        return b;
    }

    public final void serialize(Encoder encoder, Object obj) {
        azo azoVar = (azo) obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
        ph5 ph5VarB = encoder.b(pluginGeneratedSerialDescriptor);
        v89 v89Var = v89.a;
        Float f = azoVar.a;
        String str = azoVar.d;
        ph5VarB.j(pluginGeneratedSerialDescriptor, 0, v89Var, f);
        ph5VarB.j(pluginGeneratedSerialDescriptor, 1, v89Var, azoVar.b);
        ecb ecbVar = ecb.a;
        ph5VarB.j(pluginGeneratedSerialDescriptor, 2, ecbVar, azoVar.c);
        if (ph5VarB.E() || str != null) {
            ph5VarB.j(pluginGeneratedSerialDescriptor, 3, xhk.a, str);
        }
        ph5VarB.j(pluginGeneratedSerialDescriptor, 4, ecbVar, azoVar.e);
        ph5VarB.c(pluginGeneratedSerialDescriptor);
    }

    public final KSerializer[] typeParametersSerializers() {
        return o0g.c;
    }
}
