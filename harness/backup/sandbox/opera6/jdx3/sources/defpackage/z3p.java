package defpackage;

import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes.dex */
public final class z3p implements iv9 {
    public static final z3p a;
    public static final /* synthetic */ PluginGeneratedSerialDescriptor b;

    static {
        z3p z3pVar = new z3p();
        a = z3pVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.opera.ads.internal.data.NativeAdm.AdMarkup", z3pVar, 5);
        pluginGeneratedSerialDescriptor.k("link", false);
        pluginGeneratedSerialDescriptor.k("ver", true);
        pluginGeneratedSerialDescriptor.k("assets", true);
        pluginGeneratedSerialDescriptor.k("eventtrackers", true);
        pluginGeneratedSerialDescriptor.k("imptrackers", true);
        b = pluginGeneratedSerialDescriptor;
    }

    public final KSerializer[] childSerializers() {
        KSerializer[] kSerializerArr = c4p.u;
        return new KSerializer[]{y4p.a, f03.B(xhk.a), f03.B(kSerializerArr[2]), f03.B(kSerializerArr[3]), f03.B(kSerializerArr[4])};
    }

    public final Object deserialize(Decoder decoder) {
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
        oh5 oh5VarB = decoder.b(pluginGeneratedSerialDescriptor);
        KSerializer[] kSerializerArr = c4p.u;
        boolean z = true;
        int i = 0;
        a5p a5pVar = null;
        String str = null;
        List list = null;
        List list2 = null;
        List list3 = null;
        while (z) {
            int iP = oh5VarB.p(pluginGeneratedSerialDescriptor);
            if (iP == -1) {
                z = false;
            } else if (iP == 0) {
                a5pVar = (a5p) oh5VarB.z(pluginGeneratedSerialDescriptor, 0, y4p.a);
                i |= 1;
            } else if (iP == 1) {
                str = (String) oh5VarB.m(pluginGeneratedSerialDescriptor, 1, xhk.a);
                i |= 2;
            } else if (iP == 2) {
                list = (List) oh5VarB.m(pluginGeneratedSerialDescriptor, 2, kSerializerArr[2]);
                i |= 4;
            } else if (iP == 3) {
                list2 = (List) oh5VarB.m(pluginGeneratedSerialDescriptor, 3, kSerializerArr[3]);
                i |= 8;
            } else {
                if (iP != 4) {
                    t3p.d(iP);
                    return null;
                }
                list3 = (List) oh5VarB.m(pluginGeneratedSerialDescriptor, 4, kSerializerArr[4]);
                i |= 16;
            }
        }
        oh5VarB.c(pluginGeneratedSerialDescriptor);
        return new c4p(i, a5pVar, str, list, list2, list3);
    }

    public final SerialDescriptor getDescriptor() {
        return b;
    }

    public final void serialize(Encoder encoder, Object obj) {
        c4p c4pVar = (c4p) obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
        ph5 ph5VarB = encoder.b(pluginGeneratedSerialDescriptor);
        KSerializer[] kSerializerArr = c4p.u;
        y4p y4pVar = y4p.a;
        a5p a5pVar = c4pVar.a;
        List list = c4pVar.e;
        List list2 = c4pVar.d;
        List list3 = c4pVar.c;
        String str = c4pVar.b;
        ph5VarB.f(pluginGeneratedSerialDescriptor, 0, y4pVar, a5pVar);
        if (ph5VarB.E() || str != null) {
            ph5VarB.j(pluginGeneratedSerialDescriptor, 1, xhk.a, str);
        }
        if (ph5VarB.E() || list3 != null) {
            ph5VarB.j(pluginGeneratedSerialDescriptor, 2, kSerializerArr[2], list3);
        }
        if (ph5VarB.E() || list2 != null) {
            ph5VarB.j(pluginGeneratedSerialDescriptor, 3, kSerializerArr[3], list2);
        }
        if (ph5VarB.E() || list != null) {
            ph5VarB.j(pluginGeneratedSerialDescriptor, 4, kSerializerArr[4], list);
        }
        ph5VarB.c(pluginGeneratedSerialDescriptor);
    }

    public final KSerializer[] typeParametersSerializers() {
        return o0g.c;
    }
}
