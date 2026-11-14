package defpackage;

import com.leanplum.internal.Constants;
import com.leanplum.internal.ResourceQualifiers;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes.dex */
public final class w0p implements iv9 {
    public static final w0p a;
    public static final /* synthetic */ PluginGeneratedSerialDescriptor b;

    static {
        w0p w0pVar = new w0p();
        a = w0pVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.opera.ads.internal.data.ImpObject.Video", w0pVar, 13);
        pluginGeneratedSerialDescriptor.k("mimes", false);
        pluginGeneratedSerialDescriptor.k("protocols", false);
        pluginGeneratedSerialDescriptor.k("w", false);
        pluginGeneratedSerialDescriptor.k("h", false);
        pluginGeneratedSerialDescriptor.k("placement", false);
        pluginGeneratedSerialDescriptor.k("linearity", true);
        pluginGeneratedSerialDescriptor.k("skip", false);
        pluginGeneratedSerialDescriptor.k("playbackmethod", false);
        pluginGeneratedSerialDescriptor.k("playbackend", true);
        pluginGeneratedSerialDescriptor.k("delivery", true);
        pluginGeneratedSerialDescriptor.k("pos", false);
        pluginGeneratedSerialDescriptor.k("api", false);
        pluginGeneratedSerialDescriptor.k("companiontype", false);
        b = pluginGeneratedSerialDescriptor;
    }

    public final KSerializer[] childSerializers() {
        KSerializer[] kSerializerArr = y0p.n;
        KSerializer kSerializer = kSerializerArr[0];
        KSerializer kSerializer2 = kSerializerArr[1];
        KSerializer kSerializer3 = ecb.a;
        return new KSerializer[]{kSerializer, kSerializer2, kSerializer3, kSerializer3, kSerializer3, kSerializer3, kSerializer3, kSerializerArr[7], kSerializer3, kSerializerArr[9], f03.B(kSerializer3), kSerializerArr[11], f03.B(kSerializerArr[12])};
    }

    public final Object deserialize(Decoder decoder) {
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
        oh5 oh5VarB = decoder.b(pluginGeneratedSerialDescriptor);
        KSerializer[] kSerializerArr = y0p.n;
        Object obj = null;
        boolean z = true;
        int i = 0;
        int iL = 0;
        int iL2 = 0;
        int iL3 = 0;
        int iL4 = 0;
        int iL5 = 0;
        int iL6 = 0;
        List list = null;
        List list2 = null;
        List list3 = null;
        List list4 = null;
        Integer num = null;
        List list5 = null;
        List list6 = null;
        while (z) {
            int iP = oh5VarB.p(pluginGeneratedSerialDescriptor);
            switch (iP) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    list = (List) oh5VarB.z(pluginGeneratedSerialDescriptor, 0, kSerializerArr[0]);
                    i |= 1;
                    break;
                case 1:
                    list2 = (List) oh5VarB.z(pluginGeneratedSerialDescriptor, 1, kSerializerArr[1]);
                    i |= 2;
                    break;
                case 2:
                    iL = oh5VarB.l(pluginGeneratedSerialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    iL2 = oh5VarB.l(pluginGeneratedSerialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    iL3 = oh5VarB.l(pluginGeneratedSerialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    iL4 = oh5VarB.l(pluginGeneratedSerialDescriptor, 5);
                    i |= 32;
                    break;
                case 6:
                    iL5 = oh5VarB.l(pluginGeneratedSerialDescriptor, 6);
                    i |= 64;
                    break;
                case 7:
                    list3 = (List) oh5VarB.z(pluginGeneratedSerialDescriptor, 7, kSerializerArr[7]);
                    i |= ResourceQualifiers.Qualifier.AnonymousClass5.SCREENLAYOUT_LAYOUTDIR_RTL;
                    break;
                case 8:
                    iL6 = oh5VarB.l(pluginGeneratedSerialDescriptor, 8);
                    i |= Constants.Crypt.KEY_LENGTH;
                    break;
                case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                    list4 = (List) oh5VarB.z(pluginGeneratedSerialDescriptor, 9, kSerializerArr[9]);
                    i |= 512;
                    break;
                case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                    num = (Integer) oh5VarB.m(pluginGeneratedSerialDescriptor, 10, ecb.a);
                    i |= 1024;
                    break;
                case 11:
                    list5 = (List) oh5VarB.z(pluginGeneratedSerialDescriptor, 11, kSerializerArr[11]);
                    i |= 2048;
                    break;
                case 12:
                    list6 = (List) oh5VarB.m(pluginGeneratedSerialDescriptor, 12, kSerializerArr[12]);
                    i |= 4096;
                    break;
                default:
                    t3p.d(iP);
                    return obj;
            }
            obj = null;
        }
        oh5VarB.c(pluginGeneratedSerialDescriptor);
        return new y0p(i, list, list2, iL, iL2, iL3, iL4, iL5, list3, iL6, list4, num, list5, list6);
    }

    public final SerialDescriptor getDescriptor() {
        return b;
    }

    public final void serialize(Encoder encoder, Object obj) {
        y0p y0pVar = (y0p) obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
        ph5 ph5VarB = encoder.b(pluginGeneratedSerialDescriptor);
        KSerializer[] kSerializerArr = y0p.n;
        KSerializer kSerializer = kSerializerArr[0];
        List list = y0pVar.a;
        List list2 = y0pVar.j;
        int i = y0pVar.i;
        int i2 = y0pVar.f;
        ph5VarB.f(pluginGeneratedSerialDescriptor, 0, kSerializer, list);
        ph5VarB.f(pluginGeneratedSerialDescriptor, 1, kSerializerArr[1], y0pVar.b);
        ph5VarB.v(2, y0pVar.c, pluginGeneratedSerialDescriptor);
        ph5VarB.v(3, y0pVar.d, pluginGeneratedSerialDescriptor);
        ph5VarB.v(4, y0pVar.e, pluginGeneratedSerialDescriptor);
        if (ph5VarB.E() || i2 != 1) {
            ph5VarB.v(5, i2, pluginGeneratedSerialDescriptor);
        }
        ph5VarB.v(6, y0pVar.g, pluginGeneratedSerialDescriptor);
        ph5VarB.f(pluginGeneratedSerialDescriptor, 7, kSerializerArr[7], y0pVar.h);
        if (ph5VarB.E() || i != 1) {
            ph5VarB.v(8, i, pluginGeneratedSerialDescriptor);
        }
        if (ph5VarB.E() || !Intrinsics.a(list2, Collections.singletonList(2))) {
            ph5VarB.f(pluginGeneratedSerialDescriptor, 9, kSerializerArr[9], list2);
        }
        ph5VarB.j(pluginGeneratedSerialDescriptor, 10, ecb.a, y0pVar.k);
        ph5VarB.f(pluginGeneratedSerialDescriptor, 11, kSerializerArr[11], y0pVar.l);
        ph5VarB.j(pluginGeneratedSerialDescriptor, 12, kSerializerArr[12], y0pVar.m);
        ph5VarB.c(pluginGeneratedSerialDescriptor);
    }

    public final KSerializer[] typeParametersSerializers() {
        return o0g.c;
    }
}
