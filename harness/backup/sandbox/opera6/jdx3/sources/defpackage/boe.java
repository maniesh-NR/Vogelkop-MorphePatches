package defpackage;

import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final /* synthetic */ class boe implements iv9 {
    public static final boe a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        boe boeVar = new boe();
        a = boeVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.opera.android.weather.data.network.model.NetworkMinimalWeatherData", boeVar, 5);
        pluginGeneratedSerialDescriptor.k("LocationID", false);
        pluginGeneratedSerialDescriptor.k("City", false);
        pluginGeneratedSerialDescriptor.k("WeatherIcon", false);
        pluginGeneratedSerialDescriptor.k("Temperature", false);
        pluginGeneratedSerialDescriptor.k("FcmTopics", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    public final KSerializer[] childSerializers() {
        KSerializer kSerializerB = f03.B((KSerializer) doe.f[4].getValue());
        xhk xhkVar = xhk.a;
        return new KSerializer[]{xhkVar, xhkVar, xhkVar, ape.a, kSerializerB};
    }

    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        oh5 oh5VarB = decoder.b(serialDescriptor);
        l4c[] l4cVarArr = doe.f;
        boolean z = true;
        int i = 0;
        String strO = null;
        String strO2 = null;
        String strO3 = null;
        cpe cpeVar = null;
        List list = null;
        while (z) {
            int iP = oh5VarB.p(serialDescriptor);
            if (iP == -1) {
                z = false;
            } else if (iP == 0) {
                strO = oh5VarB.o(serialDescriptor, 0);
                i |= 1;
            } else if (iP == 1) {
                strO2 = oh5VarB.o(serialDescriptor, 1);
                i |= 2;
            } else if (iP == 2) {
                strO3 = oh5VarB.o(serialDescriptor, 2);
                i |= 4;
            } else if (iP == 3) {
                cpeVar = (cpe) oh5VarB.z(serialDescriptor, 3, ape.a);
                i |= 8;
            } else {
                if (iP != 4) {
                    t3p.d(iP);
                    return null;
                }
                list = (List) oh5VarB.m(serialDescriptor, 4, (KSerializer) l4cVarArr[4].getValue());
                i |= 16;
            }
        }
        oh5VarB.c(serialDescriptor);
        return new doe(i, strO, strO2, strO3, cpeVar, list);
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public final void serialize(Encoder encoder, Object obj) {
        doe doeVar = (doe) obj;
        SerialDescriptor serialDescriptor = descriptor;
        ph5 ph5VarB = encoder.b(serialDescriptor);
        l4c[] l4cVarArr = doe.f;
        String str = doeVar.a;
        List list = doeVar.e;
        ph5VarB.z(serialDescriptor, 0, str);
        ph5VarB.z(serialDescriptor, 1, doeVar.b);
        ph5VarB.z(serialDescriptor, 2, doeVar.c);
        ph5VarB.f(serialDescriptor, 3, ape.a, doeVar.d);
        if (ph5VarB.E() || list != null) {
            ph5VarB.j(serialDescriptor, 4, (KSerializer) l4cVarArr[4].getValue(), list);
        }
        ph5VarB.c(serialDescriptor);
    }
}
