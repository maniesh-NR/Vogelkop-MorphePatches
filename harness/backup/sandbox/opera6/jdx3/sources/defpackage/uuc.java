package defpackage;

import com.leanplum.utils.SizeUtil;
import java.lang.annotation.Annotation;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.h;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* loaded from: classes.dex */
public final /* synthetic */ class uuc implements Function0 {
    public final /* synthetic */ byte a;

    public /* synthetic */ uuc(byte b) {
        this.a = b;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
            case 1:
                return null;
            case 2:
                hp7 hp7Var = nvc.a;
                return ulp.g;
            case 3:
                throw new IllegalStateException("CompositionLocal LocalSavedStateRegistryOwner not present");
            case 4:
                return null;
            case 5:
                svc svcVar = new svc(new fv1((byte) 0));
                nh6.o(svcVar);
                f03.i(svcVar, ':');
                nh6.n(svcVar);
                f03.e(svcVar, new Function1[]{new g8c((byte) 28)}, new g8c((byte) 29));
                return new tvc(svcVar.build());
            case 6:
                return Boolean.FALSE;
            case 7:
                return iae.a;
            case 8:
                return Unit.a;
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                return Unit.a;
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                qfb qfbVar = u5e.a;
                return t5e.a;
            case 11:
                qfb qfbVar2 = u5e.a;
                return s5e.a;
            case 12:
                return new r5e();
            case 13:
                return UUID.randomUUID();
            case 14:
                return new yqi("com.opera.celopay.model.money.Money", uqh.a(x8e.class), new itb[]{uqh.a(q8e.class), uqh.a(t8e.class), uqh.a(w8e.class)}, new KSerializer[]{o8e.a, r8e.a, u8e.a}, new Annotation[0]);
            case 15:
                return new i58("com.opera.celopay.model.money.Currency.Fiat", g46.values());
            case 16:
                return new i58("com.opera.celopay.model.money.Currency.Token", h46.values());
            case 17:
                SerialDescriptor[] serialDescriptorArr = new SerialDescriptor[0];
                if (StringsKt.N("kotlinx.datetime.MonthBased")) {
                    qp2.o("Blank serial names are prohibited");
                    return null;
                }
                t15 t15Var = new t15("kotlinx.datetime.MonthBased");
                t15Var.a("months", ecb.b, l08.a);
                return new d2j("kotlinx.datetime.MonthBased", xik.b, t15Var.c.size(), e82.B(serialDescriptorArr), t15Var);
            case SizeUtil.textSize0_1 /* 18 */:
                a64 a64VarB = sgb.b(h.a);
                sgb.k(a64VarB, (CancellationException) null);
                return a64VarB;
            case 19:
                return m74.a;
            case SizeUtil.textSize0 /* 20 */:
                return gkm.a;
            case 21:
                return cpc.Companion.serializer();
            case SizeUtil.textSize1 /* 22 */:
                return jnc.Companion.serializer();
            case 23:
                return ene.Companion.serializer();
            case SizeUtil.textSize2 /* 24 */:
                return new m58();
            case 25:
                return new m58();
            case 26:
                return new m58();
            case 27:
                return new m58();
            case 28:
                return new m58();
            default:
                return new m58();
        }
    }
}
