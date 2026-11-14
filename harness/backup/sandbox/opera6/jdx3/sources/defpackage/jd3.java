package defpackage;

import com.leanplum.internal.Constants;
import com.leanplum.internal.ResourceQualifiers;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final /* synthetic */ class jd3 implements iv9 {
    public static final jd3 a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        jd3 jd3Var = new jd3();
        a = jd3Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.opera.android.live_score.data.network.BettingModel.ProviderConfig", jd3Var, 8);
        pluginGeneratedSerialDescriptor.k("id", false);
        pluginGeneratedSerialDescriptor.k(Constants.Params.NAME, true);
        pluginGeneratedSerialDescriptor.k("normal_icon", true);
        pluginGeneratedSerialDescriptor.k("light_icon", true);
        pluginGeneratedSerialDescriptor.k("small_icon", true);
        pluginGeneratedSerialDescriptor.k("logo_click_url", true);
        pluginGeneratedSerialDescriptor.k("features", true);
        pluginGeneratedSerialDescriptor.k("countries", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final KSerializer[] childSerializers() {
        l4c[] l4cVarArr = ld3.i;
        xhk xhkVar = xhk.a;
        return new KSerializer[]{xhkVar, f03.B(xhkVar), f03.B(xhkVar), f03.B(xhkVar), f03.B(xhkVar), f03.B(xhkVar), l4cVarArr[6].getValue(), l4cVarArr[7].getValue()};
    }

    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        oh5 oh5VarB = decoder.b(serialDescriptor);
        l4c[] l4cVarArr = ld3.i;
        Object obj = null;
        boolean z = true;
        int i = 0;
        String strO = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        List list = null;
        List list2 = null;
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
                    str3 = (String) oh5VarB.m(serialDescriptor, 3, xhk.a);
                    i |= 8;
                    break;
                case 4:
                    str4 = (String) oh5VarB.m(serialDescriptor, 4, xhk.a);
                    i |= 16;
                    break;
                case 5:
                    str5 = (String) oh5VarB.m(serialDescriptor, 5, xhk.a);
                    i |= 32;
                    break;
                case 6:
                    list = (List) oh5VarB.z(serialDescriptor, 6, (KSerializer) l4cVarArr[6].getValue());
                    i |= 64;
                    break;
                case 7:
                    list2 = (List) oh5VarB.z(serialDescriptor, 7, (KSerializer) l4cVarArr[7].getValue());
                    i |= ResourceQualifiers.Qualifier.AnonymousClass5.SCREENLAYOUT_LAYOUTDIR_RTL;
                    break;
                default:
                    t3p.d(iP);
                    return obj;
            }
            obj = null;
        }
        oh5VarB.c(serialDescriptor);
        return new ld3(i, strO, str, str2, str3, str4, str5, list, list2);
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public final void serialize(Encoder encoder, Object obj) {
        ld3 ld3Var = (ld3) obj;
        SerialDescriptor serialDescriptor = descriptor;
        ph5 ph5VarB = encoder.b(serialDescriptor);
        l4c[] l4cVarArr = ld3.i;
        String str = ld3Var.a;
        List list = ld3Var.h;
        List list2 = ld3Var.g;
        String str2 = ld3Var.f;
        String str3 = ld3Var.e;
        String str4 = ld3Var.d;
        String str5 = ld3Var.c;
        String str6 = ld3Var.b;
        ph5VarB.z(serialDescriptor, 0, str);
        if (ph5VarB.E() || str6 != null) {
            ph5VarB.j(serialDescriptor, 1, xhk.a, str6);
        }
        if (ph5VarB.E() || str5 != null) {
            ph5VarB.j(serialDescriptor, 2, xhk.a, str5);
        }
        if (ph5VarB.E() || str4 != null) {
            ph5VarB.j(serialDescriptor, 3, xhk.a, str4);
        }
        if (ph5VarB.E() || str3 != null) {
            ph5VarB.j(serialDescriptor, 4, xhk.a, str3);
        }
        if (ph5VarB.E() || str2 != null) {
            ph5VarB.j(serialDescriptor, 5, xhk.a, str2);
        }
        if (ph5VarB.E() || !Intrinsics.a(list2, l08.a)) {
            ph5VarB.f(serialDescriptor, 6, (KSerializer) l4cVarArr[6].getValue(), list2);
        }
        if (ph5VarB.E() || !Intrinsics.a(list, l08.a)) {
            ph5VarB.f(serialDescriptor, 7, (KSerializer) l4cVarArr[7].getValue(), list);
        }
        ph5VarB.c(serialDescriptor);
    }
}
