package defpackage;

import android.content.Context;
import com.leanplum.utils.SizeUtil;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final /* synthetic */ class w5f implements Function1 {
    public final /* synthetic */ byte a;

    public /* synthetic */ w5f(byte b) {
        this.a = b;
    }

    public /* synthetic */ w5f(xbf xbfVar) {
        this.a = (byte) 29;
    }

    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                ((rt0) obj).a.p(2, 1, 1L);
                return Unit.a;
            case 1:
                ((zg0) obj).a.p(2, 1, 1L);
                return Unit.a;
            case 2:
                k7f k7fVar = (k7f) obj;
                if (k7fVar.Z()) {
                    k7fVar.a.J();
                }
                return Unit.a;
            case 3:
            case 23:
            case SizeUtil.textSize2 /* 24 */:
            case 25:
            case 26:
                throw sko.g(obj);
            case 4:
                s9f s9fVar = (s9f) obj;
                s9fVar.i = false;
                s9fVar.j = false;
                s9fVar.f = true;
                return Unit.a;
            case 5:
                return Unit.a;
            case 6:
                Integer num = (Integer) obj;
                num.intValue();
                return num;
            case 7:
                m1i m1iVar = (m1i) obj;
                if (m1iVar.w != 15) {
                    m1iVar.a |= 524288;
                    m1iVar.w = 15;
                }
                return Unit.a;
            case 8:
                return Unit.a;
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                return Unit.a;
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                hh0 hh0Var = (hh0) ((yj0) obj).e.getValue();
                hh0Var.a.q(0, 1, "");
                hh0Var.a.q(1, 1, "");
                return Unit.a;
            case 11:
                ((cq0) obj).b.p(0, 1, 1L);
                return Unit.a;
            case 12:
                return new t0i(new q0i((IOException) obj));
            case 13:
                return Unit.a;
            case 14:
                oag oagVar = (oag) obj;
                int i = v81.a;
                hp7 hp7Var = j41.b;
                oagVar.getClass();
                Context context = (Context) alo.d0(oagVar, hp7Var);
                n27 n27Var = (n27) alo.d0(oagVar, mi5.h);
                zuf zufVar = (zuf) alo.d0(oagVar, avf.a);
                if (zufVar == null) {
                    return null;
                }
                return new w51(context, n27Var, zufVar.a, zufVar.b);
            case 15:
                m3c m3cVar = (m3c) obj;
                if (m3cVar.H()) {
                    m3c.T(m3cVar, false, 7);
                }
                return Unit.a;
            case 16:
                m3c m3cVar2 = (m3c) obj;
                if (m3cVar2.H()) {
                    m3c.V(m3cVar2, false, 7);
                }
                return Unit.a;
            case 17:
                m3c m3cVar3 = (m3c) obj;
                if (m3cVar3.H()) {
                    m3cVar3.F();
                }
                return Unit.a;
            case SizeUtil.textSize0_1 /* 18 */:
                m3c m3cVar4 = (m3c) obj;
                if (m3cVar4.H()) {
                    m3cVar4.U(false);
                }
                return Unit.a;
            case 19:
                m3c m3cVar5 = (m3c) obj;
                if (m3cVar5.H()) {
                    m3cVar5.U(false);
                }
                return Unit.a;
            case SizeUtil.textSize0 /* 20 */:
                m3c m3cVar6 = (m3c) obj;
                if (m3cVar6.H()) {
                    m3cVar6.S(false);
                }
                return Unit.a;
            case 21:
                m3c m3cVar7 = (m3c) obj;
                if (m3cVar7.H()) {
                    m3cVar7.S(false);
                }
                return Unit.a;
            case SizeUtil.textSize1 /* 22 */:
                return Boolean.valueOf(!((ivf) obj).Z());
            case 27:
                return Unit.a;
            case 28:
                h1g h1gVar = (h1g) obj;
                StringBuilder sb = new StringBuilder("position ");
                sb.append(h1gVar.a);
                sb.append(": '");
                return o18.p(sb, (String) h1gVar.b.invoke(), '\'');
            default:
                HashMap map = new HashMap();
                for (l2g l2gVar : (List) obj) {
                    map.put(l2gVar.c, l2gVar);
                }
                return map;
        }
    }
}
