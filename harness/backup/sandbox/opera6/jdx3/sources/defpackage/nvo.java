package defpackage;

import com.leanplum.internal.Constants;
import com.leanplum.internal.ResourceQualifiers;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes.dex */
public final class nvo implements iv9 {
    public static final nvo a;
    public static final /* synthetic */ PluginGeneratedSerialDescriptor b;

    static {
        nvo nvoVar = new nvo();
        a = nvoVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.opera.ads.internal.data.BidRequestObject", nvoVar, 9);
        pluginGeneratedSerialDescriptor.k("id", false);
        pluginGeneratedSerialDescriptor.k("imp", false);
        pluginGeneratedSerialDescriptor.k("app", false);
        pluginGeneratedSerialDescriptor.k("device", false);
        pluginGeneratedSerialDescriptor.k("user", false);
        pluginGeneratedSerialDescriptor.k("at", true);
        pluginGeneratedSerialDescriptor.k("source", false);
        pluginGeneratedSerialDescriptor.k("regs", false);
        pluginGeneratedSerialDescriptor.k("ext", false);
        b = pluginGeneratedSerialDescriptor;
    }

    public final KSerializer[] childSerializers() {
        return new KSerializer[]{xhk.a, rxo.j[1], mto.a, pyo.a, two.a, ecb.a, jwo.a, ewo.a, f03.B(uvo.a)};
    }

    public final Object deserialize(Decoder decoder) {
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
        oh5 oh5VarB = decoder.b(pluginGeneratedSerialDescriptor);
        KSerializer[] kSerializerArr = rxo.j;
        Object obj = null;
        boolean z = true;
        int i = 0;
        int iL = 0;
        String strO = null;
        List list = null;
        huo huoVar = null;
        jzo jzoVar = null;
        wwo wwoVar = null;
        mwo mwoVar = null;
        hwo hwoVar = null;
        zvo zvoVar = null;
        while (z) {
            int iP = oh5VarB.p(pluginGeneratedSerialDescriptor);
            switch (iP) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    strO = oh5VarB.o(pluginGeneratedSerialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    list = (List) oh5VarB.z(pluginGeneratedSerialDescriptor, 1, kSerializerArr[1]);
                    i |= 2;
                    break;
                case 2:
                    huoVar = (huo) oh5VarB.z(pluginGeneratedSerialDescriptor, 2, mto.a);
                    i |= 4;
                    break;
                case 3:
                    jzoVar = (jzo) oh5VarB.z(pluginGeneratedSerialDescriptor, 3, pyo.a);
                    i |= 8;
                    break;
                case 4:
                    wwoVar = (wwo) oh5VarB.z(pluginGeneratedSerialDescriptor, 4, two.a);
                    i |= 16;
                    break;
                case 5:
                    iL = oh5VarB.l(pluginGeneratedSerialDescriptor, 5);
                    i |= 32;
                    break;
                case 6:
                    mwoVar = (mwo) oh5VarB.z(pluginGeneratedSerialDescriptor, 6, jwo.a);
                    i |= 64;
                    break;
                case 7:
                    hwoVar = (hwo) oh5VarB.z(pluginGeneratedSerialDescriptor, 7, ewo.a);
                    i |= ResourceQualifiers.Qualifier.AnonymousClass5.SCREENLAYOUT_LAYOUTDIR_RTL;
                    break;
                case 8:
                    zvoVar = (zvo) oh5VarB.m(pluginGeneratedSerialDescriptor, 8, uvo.a);
                    i |= Constants.Crypt.KEY_LENGTH;
                    break;
                default:
                    t3p.d(iP);
                    return obj;
            }
            obj = null;
        }
        oh5VarB.c(pluginGeneratedSerialDescriptor);
        return new rxo(i, strO, list, huoVar, jzoVar, wwoVar, iL, mwoVar, hwoVar, zvoVar);
    }

    public final SerialDescriptor getDescriptor() {
        return b;
    }

    public final void serialize(Encoder encoder, Object obj) {
        rxo rxoVar = (rxo) obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
        ph5 ph5VarB = encoder.b(pluginGeneratedSerialDescriptor);
        KSerializer[] kSerializerArr = rxo.j;
        String str = rxoVar.a;
        int i = rxoVar.f;
        ph5VarB.z(pluginGeneratedSerialDescriptor, 0, str);
        ph5VarB.f(pluginGeneratedSerialDescriptor, 1, kSerializerArr[1], rxoVar.b);
        ph5VarB.f(pluginGeneratedSerialDescriptor, 2, mto.a, rxoVar.c);
        ph5VarB.f(pluginGeneratedSerialDescriptor, 3, pyo.a, rxoVar.d);
        ph5VarB.f(pluginGeneratedSerialDescriptor, 4, two.a, rxoVar.e);
        if (ph5VarB.E() || i != 1) {
            ph5VarB.v(5, i, pluginGeneratedSerialDescriptor);
        }
        ph5VarB.f(pluginGeneratedSerialDescriptor, 6, jwo.a, rxoVar.g);
        ph5VarB.f(pluginGeneratedSerialDescriptor, 7, ewo.a, rxoVar.h);
        ph5VarB.j(pluginGeneratedSerialDescriptor, 8, uvo.a, rxoVar.i);
        ph5VarB.c(pluginGeneratedSerialDescriptor);
    }

    public final KSerializer[] typeParametersSerializers() {
        return o0g.c;
    }
}
