package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final /* synthetic */ class scg implements iv9 {
    public static final scg a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        scg scgVar = new scg();
        a = scgVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.opera.android.startup.fragments.personalization.PersonalizationOnboardingSnapshot", scgVar, 4);
        pluginGeneratedSerialDescriptor.k("viewedWallpaperIds", true);
        pluginGeneratedSerialDescriptor.k("selectedWallpaperId", true);
        pluginGeneratedSerialDescriptor.k("interests", true);
        pluginGeneratedSerialDescriptor.k("wallpapersSource", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final KSerializer[] childSerializers() {
        l4c[] l4cVarArr = xcg.e;
        return new KSerializer[]{l4cVarArr[0].getValue(), f03.B(xhk.a), l4cVarArr[2].getValue(), l4cVarArr[3].getValue()};
    }

    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        oh5 oh5VarB = decoder.b(serialDescriptor);
        l4c[] l4cVarArr = xcg.e;
        boolean z = true;
        int i = 0;
        List list = null;
        String str = null;
        List list2 = null;
        hff hffVar = null;
        while (z) {
            int iP = oh5VarB.p(serialDescriptor);
            if (iP == -1) {
                z = false;
            } else if (iP == 0) {
                list = (List) oh5VarB.z(serialDescriptor, 0, (KSerializer) l4cVarArr[0].getValue());
                i |= 1;
            } else if (iP == 1) {
                str = (String) oh5VarB.m(serialDescriptor, 1, xhk.a);
                i |= 2;
            } else if (iP == 2) {
                list2 = (List) oh5VarB.z(serialDescriptor, 2, (KSerializer) l4cVarArr[2].getValue());
                i |= 4;
            } else {
                if (iP != 3) {
                    t3p.d(iP);
                    return null;
                }
                hffVar = (hff) oh5VarB.z(serialDescriptor, 3, (KSerializer) l4cVarArr[3].getValue());
                i |= 8;
            }
        }
        oh5VarB.c(serialDescriptor);
        return new xcg(i, list, str, list2, hffVar);
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public final void serialize(Encoder encoder, Object obj) {
        xcg xcgVar = (xcg) obj;
        SerialDescriptor serialDescriptor = descriptor;
        ph5 ph5VarB = encoder.b(serialDescriptor);
        l4c[] l4cVarArr = xcg.e;
        if (ph5VarB.E() || !Intrinsics.a(xcgVar.a, l08.a)) {
            ph5VarB.f(serialDescriptor, 0, (KSerializer) l4cVarArr[0].getValue(), xcgVar.a);
        }
        if (ph5VarB.E() || xcgVar.b != null) {
            ph5VarB.j(serialDescriptor, 1, xhk.a, xcgVar.b);
        }
        if (ph5VarB.E() || !Intrinsics.a(xcgVar.c, l08.a)) {
            ph5VarB.f(serialDescriptor, 2, (KSerializer) l4cVarArr[2].getValue(), xcgVar.c);
        }
        ph5VarB.f(serialDescriptor, 3, (KSerializer) l4cVarArr[3].getValue(), xcgVar.d);
        ph5VarB.c(serialDescriptor);
    }
}
