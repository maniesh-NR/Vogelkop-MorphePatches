package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.json.c;

/* loaded from: classes.dex */
public final class gio implements iv9 {
    public static final gio a;
    public static final /* synthetic */ PluginGeneratedSerialDescriptor b;

    static {
        gio gioVar = new gio();
        a = gioVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.opera.ads.internal.data.AdData.TemplateConfig", gioVar, 3);
        pluginGeneratedSerialDescriptor.k("id", false);
        pluginGeneratedSerialDescriptor.k("indexurl", false);
        pluginGeneratedSerialDescriptor.k("settings", false);
        b = pluginGeneratedSerialDescriptor;
    }

    public final KSerializer[] childSerializers() {
        KSerializer kSerializer = xhk.a;
        return new KSerializer[]{f03.B(kSerializer), kSerializer, kno.a};
    }

    public final Object deserialize(Decoder decoder) {
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
        oh5 oh5VarB = decoder.b(pluginGeneratedSerialDescriptor);
        boolean z = true;
        int i = 0;
        String str = null;
        String strO = null;
        c cVar = null;
        while (z) {
            int iP = oh5VarB.p(pluginGeneratedSerialDescriptor);
            if (iP == -1) {
                z = false;
            } else if (iP == 0) {
                str = (String) oh5VarB.m(pluginGeneratedSerialDescriptor, 0, xhk.a);
                i |= 1;
            } else if (iP == 1) {
                strO = oh5VarB.o(pluginGeneratedSerialDescriptor, 1);
                i |= 2;
            } else {
                if (iP != 2) {
                    t3p.d(iP);
                    return null;
                }
                cVar = (c) oh5VarB.z(pluginGeneratedSerialDescriptor, 2, kno.a);
                i |= 4;
            }
        }
        oh5VarB.c(pluginGeneratedSerialDescriptor);
        return new iio(i, str, strO, cVar);
    }

    public final SerialDescriptor getDescriptor() {
        return b;
    }

    public final void serialize(Encoder encoder, Object obj) {
        iio iioVar = (iio) obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
        ph5 ph5VarB = encoder.b(pluginGeneratedSerialDescriptor);
        ph5VarB.j(pluginGeneratedSerialDescriptor, 0, xhk.a, iioVar.a);
        ph5VarB.z(pluginGeneratedSerialDescriptor, 1, iioVar.b);
        ph5VarB.f(pluginGeneratedSerialDescriptor, 2, kno.a, iioVar.c);
        ph5VarB.c(pluginGeneratedSerialDescriptor);
    }

    public final KSerializer[] typeParametersSerializers() {
        return o0g.c;
    }
}
