package defpackage;

import ads_mobile_sdk.ai1;
import ads_mobile_sdk.ph0;
import ads_mobile_sdk.vk3;
import ads_mobile_sdk.z42;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.text.MatchResult;
import kotlinx.serialization.KSerializer;
import okhttp3.internal.connection.RealCall;
import org.chromium.net.UrlRequest;

/* loaded from: classes.dex */
public final class cno extends ozb implements Function1 {
    public final /* synthetic */ byte i;
    public final /* synthetic */ Object j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cno(Object obj, byte b) {
        super(1);
        this.i = b;
        this.j = obj;
    }

    public final Object invoke(Object obj) {
        Unit unit;
        switch (this.i) {
            case 0:
                exo exoVar = (exo) this.j;
                jno jnoVar = jno.a;
                rpb rpbVarD = fcp.d();
                rpbVarD.getClass();
                KSerializer kSerializerSerializer = exo.Companion.serializer();
                zyk zykVar = gbp.a;
                ((fvh) obj).f(new nvh(rpbVarD, kSerializerSerializer, exoVar, (byte) 2));
                return Unit.a;
            case 1:
                ((UrlRequest) this.j).cancel();
                return Unit.a;
            case 2:
                ((RealCall) this.j).cancel();
                return Unit.a;
            case 3:
                ((z42) this.j).c = new vk3((UnifiedNativeAdMapper) obj);
                return Unit.a;
            case 4:
                xn xnVar = (xn) obj;
                ph0 ph0VarJ = ((ai1) this.j).b.j();
                synchronized (ph0VarJ) {
                    ph0VarJ.a(xnVar);
                    ph0VarJ.a(xnVar);
                    unit = Unit.a;
                }
                return unit;
            case 5:
                Throwable th = (Throwable) obj;
                sro sroVar = (sro) this.j;
                sroVar.h = true;
                sroVar.i = th;
                if (sroVar.e != null) {
                    u6p u6pVar = sroVar.g;
                    if (u6pVar != null) {
                        u6pVar.invoke(th);
                    }
                    sroVar.g = null;
                }
                return Unit.a;
            case 6:
                guo guoVar = (guo) this.j;
                ne5 ne5Var = guoVar.m;
                if (ne5Var != null) {
                    ne5Var.o();
                }
                guoVar.m = null;
                sxo sxoVar = guoVar.g;
                if (sxoVar != null) {
                    uio uioVar = sxoVar.a;
                    if (uioVar != null) {
                        uioVar.c();
                    }
                    sxoVar.a = null;
                    sxoVar.b = null;
                    sxoVar.c = null;
                }
                guoVar.g = null;
                lzo lzoVar = guoVar.l;
                if (lzoVar != null) {
                    xgh.g(lzoVar.a);
                }
                lzo lzoVar2 = guoVar.l;
                if (lzoVar2 != null) {
                    lzoVar2.a();
                }
                guoVar.l = null;
                d3k d3kVar = guoVar.n;
                if (d3kVar != null) {
                    d3kVar.k((CancellationException) null);
                }
                guoVar.n = null;
                super/*pxo*/.a();
                return null;
            case 7:
                String str = (String) ((Map) this.j).get(((MatchResult) obj).getValue());
                return str == null ? "" : str;
            case 8:
                fvh fvhVar = (fvh) obj;
                fvhVar.c();
                if (((l5b) this.j).b) {
                    fvhVar.b(e74.p);
                }
                return Unit.a;
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                ((a3p) this.j).t();
                return Unit.a;
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                p5p p5pVar = (p5p) this.j;
                zyk zykVar2 = aap.a;
                rpb rpbVarD2 = fcp.d();
                rpbVarD2.getClass();
                KSerializer kSerializerSerializer2 = p5p.Companion.serializer();
                zyk zykVar3 = gbp.a;
                ((fvh) obj).f(new nvh(rpbVarD2, kSerializerSerializer2, p5pVar, (byte) 2));
                return Unit.a;
            default:
                ((fvh) obj).f((nvh) this.j);
                return Unit.a;
        }
    }
}
