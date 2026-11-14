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
public final /* synthetic */ class hb8 implements iv9 {
    public static final hb8 a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        hb8 hb8Var = new hb8();
        a = hb8Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.opera.android.news.newsfeed.internal.json_responses.EventBannerInfo", hb8Var, 11);
        pluginGeneratedSerialDescriptor.k("title", false);
        pluginGeneratedSerialDescriptor.k("logo", false);
        pluginGeneratedSerialDescriptor.k("logoDark", false);
        pluginGeneratedSerialDescriptor.k("content", false);
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
        return new KSerializer[]{xhkVar, xhkVar, xhkVar, xhkVar, xhkVar, xhkVar, xhkVar, xhkVar, xhkVar, xhkVar, xhkVar};
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
        String strO10 = null;
        String strO11 = null;
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
                case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                    strO10 = oh5VarB.o(serialDescriptor, 9);
                    i |= 512;
                    break;
                case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                    strO11 = oh5VarB.o(serialDescriptor, 10);
                    i |= 1024;
                    break;
                default:
                    t3p.d(iP);
                    return null;
            }
        }
        oh5VarB.c(serialDescriptor);
        return new jb8(i, strO, strO2, strO3, strO4, strO5, strO6, strO7, strO8, strO9, strO10, strO11);
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public final void serialize(Encoder encoder, Object obj) {
        jb8 jb8Var = (jb8) obj;
        SerialDescriptor serialDescriptor = descriptor;
        ph5 ph5VarB = encoder.b(serialDescriptor);
        ph5VarB.z(serialDescriptor, 0, jb8Var.a);
        ph5VarB.z(serialDescriptor, 1, jb8Var.b);
        ph5VarB.z(serialDescriptor, 2, jb8Var.c);
        ph5VarB.z(serialDescriptor, 3, jb8Var.d);
        ph5VarB.z(serialDescriptor, 4, jb8Var.e);
        ph5VarB.z(serialDescriptor, 5, jb8Var.f);
        ph5VarB.z(serialDescriptor, 6, jb8Var.g);
        ph5VarB.z(serialDescriptor, 7, jb8Var.h);
        ph5VarB.z(serialDescriptor, 8, jb8Var.i);
        ph5VarB.z(serialDescriptor, 9, jb8Var.j);
        ph5VarB.z(serialDescriptor, 10, jb8Var.k);
        ph5VarB.c(serialDescriptor);
    }
}
