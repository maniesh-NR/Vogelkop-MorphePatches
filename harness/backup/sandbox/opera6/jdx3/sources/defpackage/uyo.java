package defpackage;

import com.leanplum.internal.Constants;
import com.leanplum.internal.ResourceQualifiers;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes.dex */
public final class uyo implements iv9 {
    public static final uyo a;
    public static final /* synthetic */ PluginGeneratedSerialDescriptor b;

    static {
        uyo uyoVar = new uyo();
        a = uyoVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.opera.ads.internal.data.DeviceObject.DeviceExt", uyoVar, 11);
        pluginGeneratedSerialDescriptor.k("ifa_type", true);
        pluginGeneratedSerialDescriptor.k("osvi", false);
        pluginGeneratedSerialDescriptor.k("gmsavail", false);
        pluginGeneratedSerialDescriptor.k("battlevel", false);
        pluginGeneratedSerialDescriptor.k("battstatus", false);
        pluginGeneratedSerialDescriptor.k("vollevel", false);
        pluginGeneratedSerialDescriptor.k("mute", false);
        pluginGeneratedSerialDescriptor.k("sdavail", false);
        pluginGeneratedSerialDescriptor.k("sbt", false);
        pluginGeneratedSerialDescriptor.k("osbdt", false);
        pluginGeneratedSerialDescriptor.k("romf", false);
        b = pluginGeneratedSerialDescriptor;
    }

    public final KSerializer[] childSerializers() {
        xhk xhkVar = xhk.a;
        ecb ecbVar = ecb.a;
        h1d h1dVar = h1d.a;
        return new KSerializer[]{xhkVar, ecbVar, ecbVar, ecbVar, ecbVar, ecbVar, ecbVar, ecbVar, h1dVar, h1dVar, xhkVar};
    }

    public final Object deserialize(Decoder decoder) {
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
        oh5 oh5VarB = decoder.b(pluginGeneratedSerialDescriptor);
        int i = 0;
        int iL = 0;
        int iL2 = 0;
        int iL3 = 0;
        int iL4 = 0;
        int iL5 = 0;
        int iL6 = 0;
        int iL7 = 0;
        String strO = null;
        String strO2 = null;
        long jG = 0;
        long jG2 = 0;
        boolean z = true;
        while (z) {
            int iP = oh5VarB.p(pluginGeneratedSerialDescriptor);
            switch (iP) {
                case -1:
                    z = false;
                    break;
                case 0:
                    strO = oh5VarB.o(pluginGeneratedSerialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    iL = oh5VarB.l(pluginGeneratedSerialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    iL2 = oh5VarB.l(pluginGeneratedSerialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    iL3 = oh5VarB.l(pluginGeneratedSerialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    iL4 = oh5VarB.l(pluginGeneratedSerialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    iL5 = oh5VarB.l(pluginGeneratedSerialDescriptor, 5);
                    i |= 32;
                    break;
                case 6:
                    iL6 = oh5VarB.l(pluginGeneratedSerialDescriptor, 6);
                    i |= 64;
                    break;
                case 7:
                    iL7 = oh5VarB.l(pluginGeneratedSerialDescriptor, 7);
                    i |= ResourceQualifiers.Qualifier.AnonymousClass5.SCREENLAYOUT_LAYOUTDIR_RTL;
                    break;
                case 8:
                    jG = oh5VarB.g(pluginGeneratedSerialDescriptor, 8);
                    i |= Constants.Crypt.KEY_LENGTH;
                    break;
                case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                    jG2 = oh5VarB.g(pluginGeneratedSerialDescriptor, 9);
                    i |= 512;
                    break;
                case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                    strO2 = oh5VarB.o(pluginGeneratedSerialDescriptor, 10);
                    i |= 1024;
                    break;
                default:
                    t3p.d(iP);
                    return null;
            }
        }
        oh5VarB.c(pluginGeneratedSerialDescriptor);
        return new wyo(i, strO, iL, iL2, iL3, iL4, iL5, iL6, iL7, jG, jG2, strO2);
    }

    public final SerialDescriptor getDescriptor() {
        return b;
    }

    public final void serialize(Encoder encoder, Object obj) {
        wyo wyoVar = (wyo) obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
        ph5 ph5VarB = encoder.b(pluginGeneratedSerialDescriptor);
        if (ph5VarB.E() || !Intrinsics.a(wyoVar.a, "aaid")) {
            ph5VarB.z(pluginGeneratedSerialDescriptor, 0, wyoVar.a);
        }
        ph5VarB.v(1, wyoVar.b, pluginGeneratedSerialDescriptor);
        ph5VarB.v(2, wyoVar.c, pluginGeneratedSerialDescriptor);
        ph5VarB.v(3, wyoVar.d, pluginGeneratedSerialDescriptor);
        ph5VarB.v(4, wyoVar.e, pluginGeneratedSerialDescriptor);
        ph5VarB.v(5, wyoVar.f, pluginGeneratedSerialDescriptor);
        ph5VarB.v(6, wyoVar.g, pluginGeneratedSerialDescriptor);
        ph5VarB.v(7, wyoVar.h, pluginGeneratedSerialDescriptor);
        ph5VarB.F(pluginGeneratedSerialDescriptor, 8, wyoVar.i);
        ph5VarB.F(pluginGeneratedSerialDescriptor, 9, wyoVar.j);
        ph5VarB.z(pluginGeneratedSerialDescriptor, 10, wyoVar.k);
        ph5VarB.c(pluginGeneratedSerialDescriptor);
    }

    public final KSerializer[] typeParametersSerializers() {
        return o0g.c;
    }
}
