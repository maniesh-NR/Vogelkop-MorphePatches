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
public final /* synthetic */ class lb8 implements iv9 {
    public static final lb8 a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        lb8 lb8Var = new lb8();
        a = lb8Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.opera.android.news.newsfeed.internal.json_responses.EventCarouselInfo", lb8Var, 9);
        pluginGeneratedSerialDescriptor.k("logo", false);
        pluginGeneratedSerialDescriptor.k("logoDark", false);
        pluginGeneratedSerialDescriptor.k("contentColor", false);
        pluginGeneratedSerialDescriptor.k("contentColorDark", false);
        pluginGeneratedSerialDescriptor.k("backgroundColor", false);
        pluginGeneratedSerialDescriptor.k("backgroundColorDark", false);
        pluginGeneratedSerialDescriptor.k("moreText", false);
        pluginGeneratedSerialDescriptor.k("moreUrl", false);
        pluginGeneratedSerialDescriptor.k("themeID", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    public final KSerializer[] childSerializers() {
        xhk xhkVar = xhk.a;
        return new KSerializer[]{xhkVar, xhkVar, xhkVar, xhkVar, xhkVar, xhkVar, xhkVar, xhkVar, xhkVar};
    }

    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        oh5 oh5VarB = decoder.b(serialDescriptor);
        boolean z = true;
        int i = 0;
        String strO = null;
        String strO2 = null;
        String strO3 = null;
        String strO4 = null;
        String strO5 = null;
        String strO6 = null;
        String strO7 = null;
        String strO8 = null;
        String strO9 = null;
        while (z) {
            int iP = oh5VarB.p(serialDescriptor);
            switch (iP) {
                case -1:
                    z = false;
                    break;
                case 0:
                    strO = oh5VarB.o(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    strO2 = oh5VarB.o(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    strO3 = oh5VarB.o(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    strO4 = oh5VarB.o(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    strO5 = oh5VarB.o(serialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    strO6 = oh5VarB.o(serialDescriptor, 5);
                    i |= 32;
                    break;
                case 6:
                    strO7 = oh5VarB.o(serialDescriptor, 6);
                    i |= 64;
                    break;
                case 7:
                    strO8 = oh5VarB.o(serialDescriptor, 7);
                    i |= ResourceQualifiers.Qualifier.AnonymousClass5.SCREENLAYOUT_LAYOUTDIR_RTL;
                    break;
                case 8:
                    strO9 = oh5VarB.o(serialDescriptor, 8);
                    i |= Constants.Crypt.KEY_LENGTH;
                    break;
                default:
                    t3p.d(iP);
                    return null;
            }
        }
        oh5VarB.c(serialDescriptor);
        return new nb8(strO, strO2, strO3, strO4, strO5, strO6, i, strO7, strO8, strO9);
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public final void serialize(Encoder encoder, Object obj) {
        nb8 nb8Var = (nb8) obj;
        SerialDescriptor serialDescriptor = descriptor;
        ph5 ph5VarB = encoder.b(serialDescriptor);
        ph5VarB.z(serialDescriptor, 0, nb8Var.a);
        ph5VarB.z(serialDescriptor, 1, nb8Var.b);
        ph5VarB.z(serialDescriptor, 2, nb8Var.c);
        ph5VarB.z(serialDescriptor, 3, nb8Var.d);
        ph5VarB.z(serialDescriptor, 4, nb8Var.e);
        ph5VarB.z(serialDescriptor, 5, nb8Var.f);
        ph5VarB.z(serialDescriptor, 6, nb8Var.g);
        ph5VarB.z(serialDescriptor, 7, nb8Var.h);
        ph5VarB.z(serialDescriptor, 8, nb8Var.i);
        ph5VarB.c(serialDescriptor);
    }
}
