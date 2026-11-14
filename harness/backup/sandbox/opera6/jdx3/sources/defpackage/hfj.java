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
public final /* synthetic */ class hfj implements iv9 {
    public static final hfj a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        hfj hfjVar = new hfj();
        a = hfjVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.opera.android.aiassistant.api.ShodanApi.SuggestionsQuestion", hfjVar, 10);
        pluginGeneratedSerialDescriptor.k("id", false);
        pluginGeneratedSerialDescriptor.k("title", true);
        pluginGeneratedSerialDescriptor.k("subtitle", true);
        pluginGeneratedSerialDescriptor.k("text", false);
        pluginGeneratedSerialDescriptor.k("image", true);
        pluginGeneratedSerialDescriptor.k("categories", true);
        pluginGeneratedSerialDescriptor.k("image_hash", true);
        pluginGeneratedSerialDescriptor.k("thumbnails", true);
        pluginGeneratedSerialDescriptor.k("attachment_image", true);
        pluginGeneratedSerialDescriptor.k("requires_a_chat", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    public final KSerializer[] childSerializers() {
        l4c[] l4cVarArr = jfj.k;
        KSerializer kSerializer = xhk.a;
        return new KSerializer[]{kSerializer, f03.B(kSerializer), f03.B(kSerializer), kSerializer, f03.B(kSerializer), f03.B((KSerializer) l4cVarArr[5].getValue()), f03.B(kSerializer), f03.B(rfj.a), f03.B(kSerializer), rn3.a};
    }

    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        oh5 oh5VarB = decoder.b(serialDescriptor);
        l4c[] l4cVarArr = jfj.k;
        Object obj = null;
        boolean z = true;
        int i = 0;
        boolean zC = false;
        String strO = null;
        String str = null;
        String str2 = null;
        String strO2 = null;
        String str3 = null;
        List list = null;
        String str4 = null;
        tfj tfjVar = null;
        String str5 = null;
        while (z) {
            int iP = oh5VarB.p(serialDescriptor);
            switch (iP) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    strO = oh5VarB.o(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    str = (String) oh5VarB.m(serialDescriptor, 1, xhk.a);
                    i |= 2;
                    break;
                case 2:
                    str2 = (String) oh5VarB.m(serialDescriptor, 2, xhk.a);
                    i |= 4;
                    break;
                case 3:
                    strO2 = oh5VarB.o(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    str3 = (String) oh5VarB.m(serialDescriptor, 4, xhk.a);
                    i |= 16;
                    break;
                case 5:
                    list = (List) oh5VarB.m(serialDescriptor, 5, (KSerializer) l4cVarArr[5].getValue());
                    i |= 32;
                    break;
                case 6:
                    str4 = (String) oh5VarB.m(serialDescriptor, 6, xhk.a);
                    i |= 64;
                    break;
                case 7:
                    tfjVar = (tfj) oh5VarB.m(serialDescriptor, 7, rfj.a);
                    i |= ResourceQualifiers.Qualifier.AnonymousClass5.SCREENLAYOUT_LAYOUTDIR_RTL;
                    break;
                case 8:
                    str5 = (String) oh5VarB.m(serialDescriptor, 8, xhk.a);
                    i |= Constants.Crypt.KEY_LENGTH;
                    break;
                case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                    zC = oh5VarB.C(serialDescriptor, 9);
                    i |= 512;
                    continue;
                default:
                    t3p.d(iP);
                    return obj;
            }
            obj = null;
        }
        oh5VarB.c(serialDescriptor);
        return new jfj(i, strO, str, str2, strO2, str3, list, str4, tfjVar, str5, zC);
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public final void serialize(Encoder encoder, Object obj) {
        jfj jfjVar = (jfj) obj;
        SerialDescriptor serialDescriptor = descriptor;
        ph5 ph5VarB = encoder.b(serialDescriptor);
        l4c[] l4cVarArr = jfj.k;
        String str = jfjVar.a;
        boolean z = jfjVar.j;
        String str2 = jfjVar.i;
        tfj tfjVar = jfjVar.h;
        String str3 = jfjVar.g;
        List list = jfjVar.f;
        String str4 = jfjVar.e;
        String str5 = jfjVar.c;
        String str6 = jfjVar.b;
        ph5VarB.z(serialDescriptor, 0, str);
        if (ph5VarB.E() || str6 != null) {
            ph5VarB.j(serialDescriptor, 1, xhk.a, str6);
        }
        if (ph5VarB.E() || str5 != null) {
            ph5VarB.j(serialDescriptor, 2, xhk.a, str5);
        }
        ph5VarB.z(serialDescriptor, 3, jfjVar.d);
        if (ph5VarB.E() || str4 != null) {
            ph5VarB.j(serialDescriptor, 4, xhk.a, str4);
        }
        if (ph5VarB.E() || list != null) {
            ph5VarB.j(serialDescriptor, 5, (KSerializer) l4cVarArr[5].getValue(), list);
        }
        if (ph5VarB.E() || str3 != null) {
            ph5VarB.j(serialDescriptor, 6, xhk.a, str3);
        }
        if (ph5VarB.E() || tfjVar != null) {
            ph5VarB.j(serialDescriptor, 7, rfj.a, tfjVar);
        }
        if (ph5VarB.E() || str2 != null) {
            ph5VarB.j(serialDescriptor, 8, xhk.a, str2);
        }
        if (ph5VarB.E() || z) {
            ph5VarB.y(serialDescriptor, 9, z);
        }
        ph5VarB.c(serialDescriptor);
    }
}
