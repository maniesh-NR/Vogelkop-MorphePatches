package defpackage;

import com.leanplum.internal.Constants;
import com.leanplum.internal.ResourceQualifiers;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final /* synthetic */ class vlg implements iv9 {
    public static final vlg a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        vlg vlgVar = new vlg();
        a = vlgVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.opera.android.news.newsfeed.Podcast", vlgVar, 13);
        pluginGeneratedSerialDescriptor.k("id", false);
        pluginGeneratedSerialDescriptor.k("title", false);
        pluginGeneratedSerialDescriptor.k("icons", false);
        pluginGeneratedSerialDescriptor.k("audioUrl", false);
        pluginGeneratedSerialDescriptor.k("source", true);
        pluginGeneratedSerialDescriptor.k("categoryId", false);
        pluginGeneratedSerialDescriptor.k("categoryName", false);
        pluginGeneratedSerialDescriptor.k("duration", false);
        pluginGeneratedSerialDescriptor.k("requestId", false);
        pluginGeneratedSerialDescriptor.k("shareUrl", true);
        pluginGeneratedSerialDescriptor.k("timestamp", true);
        pluginGeneratedSerialDescriptor.k("highlightTitle", true);
        pluginGeneratedSerialDescriptor.k("theme", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final KSerializer[] childSerializers() {
        l4c[] l4cVarArr = xlg.n;
        xhk xhkVar = xhk.a;
        h1d h1dVar = h1d.a;
        return new KSerializer[]{xhkVar, xhkVar, l4cVarArr[2].getValue(), xhkVar, f03.B(xhkVar), xhkVar, xhkVar, h1dVar, xhkVar, f03.B(xhkVar), f03.B(h1dVar), f03.B(xhkVar), f03.B(xhkVar)};
    }

    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        oh5 oh5VarB = decoder.b(serialDescriptor);
        l4c[] l4cVarArr = xlg.n;
        int i = 0;
        String strO = null;
        String strO2 = null;
        List list = null;
        String strO3 = null;
        String str = null;
        String strO4 = null;
        String strO5 = null;
        String strO6 = null;
        String str2 = null;
        Long l = null;
        String str3 = null;
        String str4 = null;
        long jG = 0;
        boolean z = true;
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
                    list = (List) oh5VarB.z(serialDescriptor, 2, (KSerializer) l4cVarArr[2].getValue());
                    i |= 4;
                    break;
                case 3:
                    strO3 = oh5VarB.o(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    str = (String) oh5VarB.m(serialDescriptor, 4, xhk.a);
                    i |= 16;
                    break;
                case 5:
                    strO4 = oh5VarB.o(serialDescriptor, 5);
                    i |= 32;
                    break;
                case 6:
                    strO5 = oh5VarB.o(serialDescriptor, 6);
                    i |= 64;
                    break;
                case 7:
                    jG = oh5VarB.g(serialDescriptor, 7);
                    i |= ResourceQualifiers.Qualifier.AnonymousClass5.SCREENLAYOUT_LAYOUTDIR_RTL;
                    break;
                case 8:
                    strO6 = oh5VarB.o(serialDescriptor, 8);
                    i |= Constants.Crypt.KEY_LENGTH;
                    break;
                case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                    str2 = (String) oh5VarB.m(serialDescriptor, 9, xhk.a);
                    i |= 512;
                    break;
                case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                    l = (Long) oh5VarB.m(serialDescriptor, 10, h1d.a);
                    i |= 1024;
                    break;
                case 11:
                    str3 = (String) oh5VarB.m(serialDescriptor, 11, xhk.a);
                    i |= 2048;
                    break;
                case 12:
                    str4 = (String) oh5VarB.m(serialDescriptor, 12, xhk.a);
                    i |= 4096;
                    break;
                default:
                    t3p.d(iP);
                    return null;
            }
        }
        oh5VarB.c(serialDescriptor);
        return new xlg(i, strO, strO2, list, strO3, str, strO4, strO5, jG, strO6, str2, l, str3, str4);
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public final void serialize(Encoder encoder, Object obj) {
        xlg xlgVar = (xlg) obj;
        SerialDescriptor serialDescriptor = descriptor;
        ph5 ph5VarB = encoder.b(serialDescriptor);
        l4c[] l4cVarArr = xlg.n;
        String str = xlgVar.a;
        String str2 = xlgVar.m;
        String str3 = xlgVar.l;
        Long l = xlgVar.k;
        String str4 = xlgVar.j;
        String str5 = xlgVar.e;
        ph5VarB.z(serialDescriptor, 0, str);
        ph5VarB.z(serialDescriptor, 1, xlgVar.b);
        ph5VarB.f(serialDescriptor, 2, (KSerializer) l4cVarArr[2].getValue(), xlgVar.c);
        ph5VarB.z(serialDescriptor, 3, xlgVar.d);
        if (ph5VarB.E() || str5 != null) {
            ph5VarB.j(serialDescriptor, 4, xhk.a, str5);
        }
        ph5VarB.z(serialDescriptor, 5, xlgVar.f);
        ph5VarB.z(serialDescriptor, 6, xlgVar.g);
        ph5VarB.F(serialDescriptor, 7, xlgVar.h);
        ph5VarB.z(serialDescriptor, 8, xlgVar.i);
        if (ph5VarB.E() || str4 != null) {
            ph5VarB.j(serialDescriptor, 9, xhk.a, str4);
        }
        if (ph5VarB.E() || l != null) {
            ph5VarB.j(serialDescriptor, 10, h1d.a, l);
        }
        if (ph5VarB.E() || str3 != null) {
            ph5VarB.j(serialDescriptor, 11, xhk.a, str3);
        }
        if (ph5VarB.E() || str2 != null) {
            ph5VarB.j(serialDescriptor, 12, xhk.a, str2);
        }
        ph5VarB.c(serialDescriptor);
    }
}
