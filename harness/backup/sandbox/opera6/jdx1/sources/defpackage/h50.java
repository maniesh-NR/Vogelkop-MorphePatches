package defpackage;

import com.usercentrics.sdk.services.tcf.interfaces.TCFPurpose;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class h50 extends ozb implements Function1 {
    public static final h50 A;
    public static final h50 B;
    public static final h50 C;
    public static final h50 D;
    public static final h50 E;
    public static final h50 F;
    public static final h50 G;
    public static final h50 H;
    public static final h50 I;
    public static final h50 J;
    public static final h50 K;
    public static final h50 L;
    public static final h50 M;
    public static final h50 j;
    public static final h50 k;
    public static final h50 l;
    public static final h50 m;
    public static final h50 n;
    public static final h50 o;
    public static final h50 p;
    public static final h50 q;
    public static final h50 r;
    public static final h50 s;
    public static final h50 t;
    public static final h50 u;
    public static final h50 v;
    public static final h50 w;
    public static final h50 x;
    public static final h50 y;
    public static final h50 z;
    public final /* synthetic */ byte i;

    static {
        int i = 1;
        j = new h50((byte) 0, i);
        k = new h50((byte) 1, i);
        l = new h50((byte) 2, i);
        m = new h50((byte) 3, i);
        n = new h50((byte) 4, i);
        o = new h50((byte) 5, i);
        p = new h50((byte) 6, i);
        q = new h50((byte) 7, i);
        r = new h50((byte) 8, i);
        s = new h50((byte) 9, i);
        t = new h50((byte) 10, i);
        u = new h50((byte) 11, i);
        v = new h50((byte) 12, i);
        w = new h50((byte) 13, i);
        x = new h50((byte) 14, i);
        y = new h50((byte) 15, i);
        z = new h50((byte) 16, i);
        A = new h50((byte) 17, i);
        B = new h50((byte) 18, i);
        C = new h50((byte) 19, i);
        D = new h50((byte) 20, i);
        E = new h50((byte) 21, i);
        F = new h50((byte) 22, i);
        G = new h50((byte) 23, i);
        H = new h50((byte) 24, i);
        I = new h50((byte) 25, i);
        J = new h50((byte) 26, i);
        K = new h50((byte) 27, i);
        L = new h50((byte) 28, i);
        M = new h50((byte) 29, i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h50(byte b, int i) {
        super(i);
        this.i = b;
    }

    public final Object invoke(Object obj) {
        switch (this.i) {
            case 0:
                wa3 wa3Var = (wa3) obj;
                return sko.v(wa3Var.a, "@", wa3Var.b);
            case 1:
                return new or5(o48.e(rm5.X(220, 4, null), 2).a(new x48(new a3m((co8) null, (ypj) null, (mr4) null, new mli(0.92f, a2m.b, rm5.X(220, 4, null)), (LinkedHashMap) null, 119))), o48.f(rm5.X(90, 6, null), 2));
            case 2:
                return null;
            case 3:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return bool;
            case 4:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                return bool2;
            case 5:
                Boolean bool3 = (Boolean) obj;
                bool3.booleanValue();
                return bool3;
            case 6:
                long jA = u95.a(((u95) obj).a, xa5.x);
                return new hf1(u95.c(jA), u95.g(jA), u95.f(jA), u95.d(jA));
            case 7:
                return obj;
            case 8:
                Map.Entry entry = (Map.Entry) obj;
                String str = (String) entry.getKey();
                Object value = entry.getValue();
                StringBuilder sbH = u35.h(str, " : ");
                if (value instanceof Object[]) {
                    value = Arrays.toString((Object[]) value);
                }
                sbH.append(value);
                return sbH.toString();
            case 9:
                return (String) obj;
            case 10:
                return String.valueOf(((Number) obj).intValue());
            case 11:
                long j2 = ((a2m) obj).a;
                return new ff1(Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)));
            case 12:
                ff1 ff1Var = (ff1) obj;
                return new a2m(z7h.a(ff1Var.a, ff1Var.b));
            case 13:
                return rm5.R(0.0f, 0.0f, null, 7);
            case 14:
                long j3 = ((gcb) obj).a;
                return new gcb(0L);
            case 15:
                long j4 = ((gcb) obj).a;
                return new gcb(0L);
            case 16:
                long j5 = ((gcb) obj).a;
                return new ybb(0L);
            case 17:
                gcb gcbVar = (gcb) obj;
                long j6 = gcbVar.a;
                return gcbVar;
            case 18:
                return o48.d;
            case 19:
                return Unit.a;
            case 20:
                aqb aqbVar = (aqb) obj;
                aqbVar.a = true;
                aqbVar.c = true;
                aqbVar.g = true;
                aqbVar.k = false;
                return Unit.a;
            case 21:
                return ((fbc) obj).h;
            case 22:
                return sko.j("• ", (String) obj);
            case 23:
                ((Boolean) obj).getClass();
                return Unit.a;
            case 24:
                ((Boolean) obj).getClass();
                return Unit.a;
            case 25:
                return ((fbc) obj).h;
            case 26:
                return Integer.valueOf(((TCFPurpose) obj).c);
            case 27:
                return Boolean.valueOf(((TCFPurpose) obj).h);
            case 28:
                return Boolean.valueOf(((TCFPurpose) obj).i);
            default:
                return ((TCFPurpose) obj).e;
        }
    }
}
