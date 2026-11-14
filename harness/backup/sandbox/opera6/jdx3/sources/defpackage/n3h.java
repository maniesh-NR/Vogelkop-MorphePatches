package defpackage;

import com.leanplum.internal.Constants;
import com.opera.android.suggestion.Suggestion;
import com.opera.android.suggestion.SuggestionProviderBridge;
import java.util.Currency;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class n3h extends SuggestionProviderBridge {
    public static final long o;
    public static final long p;
    public static final /* synthetic */ int q = 0;
    public final frk d;
    public final jjg e;
    public final jjg f;
    public final kw3 g;
    public final yqk h;
    public final plh i;
    public final ddc j;
    public final jg8 k;
    public final x5f l;
    public final long m;
    public j3h n;

    static {
        on7 on7Var = pn7.b;
        long jX0 = cs5.x0(400, un7.d);
        o = jX0;
        p = pn7.f(jX0) / 20;
    }

    public n3h(frk frkVar, e3j e3jVar, dj9 dj9Var, yqk yqkVar, plh plhVar, ddc ddcVar, jg8 jg8Var, x5f x5fVar) {
        jjg jjgVar = new jjg(e3jVar, (byte) 1);
        jjg jjgVar2 = new jjg(dj9Var, (byte) 2);
        kw3 kw3Var = new kw3((byte) 22);
        super(1);
        this.d = frkVar;
        this.e = jjgVar;
        this.f = jjgVar2;
        this.g = kw3Var;
        this.h = yqkVar;
        this.i = plhVar;
        this.j = ddcVar;
        this.k = jg8Var;
        this.l = x5fVar;
        this.m = o;
        if (x5fVar.h) {
            zpa zpaVar = x5fVar.d;
            x56 x56VarF = zpa.F();
            ((nn0) ((vo0) new ck0(zpaVar, x56VarF).p.getValue()).c.getValue()).a.p(3, 1, 20L);
            x5fVar.U0(x56VarF);
        }
    }

    @Override // com.opera.android.suggestion.SuggestionProviderBridge
    public final void cancel() {
        j3h j3hVar = this.n;
        if (j3hVar != null) {
            j3hVar.b = null;
            d3k d3kVar = j3hVar.c;
            if (d3kVar != null) {
                d3kVar.k((CancellationException) null);
                this.n = null;
            }
        }
    }

    @Override // com.opera.android.suggestion.SuggestionProviderBridge
    public final void g(String str, boolean z, boolean z2, yv4 yv4Var) {
        if (!z) {
            cancel();
            yv4Var.d(l08.a);
            return;
        }
        String string = StringsKt.l0(str).toString();
        j3h j3hVar = this.n;
        if (Intrinsics.a(string, j3hVar != null ? j3hVar.a : null)) {
            List list = j3hVar.d;
            if (list != null) {
                yv4Var.d(list);
                return;
            } else {
                j3hVar.b = yv4Var;
                return;
            }
        }
        cancel();
        if (string.length() < 3) {
            yv4Var.d(l08.a);
        } else {
            this.n = new j3h(string, yv4Var, na2.B(this.j, (CoroutineContext) null, (rx5) null, new qmb(this, string, (mt5) null, (byte) 28), 3));
        }
    }

    public final boolean h(orb orbVar) {
        String strM = orbVar.m("currency", "");
        int length = strM.length();
        x5f x5fVar = this.l;
        if (length == 0) {
            x5fVar.R(30, "Missing currency field");
            return false;
        }
        try {
            Currency.getInstance(strM);
            return true;
        } catch (IllegalArgumentException unused) {
            x5fVar.R(30, "Invalid currency code: ".concat(strM));
            return false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0070, code lost:
    
        if (r15 == r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(java.lang.String r14, nt5 r15) {
        /*
            r13 = this;
            boolean r0 = r15 instanceof defpackage.k3h
            if (r0 == 0) goto L13
            r0 = r15
            k3h r0 = (defpackage.k3h) r0
            int r1 = r0.w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.w = r1
            goto L18
        L13:
            k3h r0 = new k3h
            r0.<init>(r13, r15)
        L18:
            java.lang.Object r15 = r0.u
            px5 r1 = px5.a
            int r2 = r0.w
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L39
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2c
            ybh.y(r15)
            r7 = r13
            goto L73
        L2c:
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qp2.n(r13)
            return r5
        L32:
            java.lang.String r14 = r0.t
            ybh.y(r15)
        L37:
            r9 = r14
            goto L49
        L39:
            ybh.y(r15)
            r0.t = r14
            r0.w = r4
            plh r15 = r13.i
            java.lang.Object r15 = cs5.E(r15, r0)
            if (r15 != r1) goto L37
            goto L72
        L49:
            f3h r15 = (f3h) r15
            boolean r14 = r15.d()
            if (r14 == 0) goto L57
            float r14 = r15.c()
        L55:
            r8 = r14
            goto L5b
        L57:
            r14 = 1063675494(0x3f666666, float:0.9)
            goto L55
        L5b:
            long r10 = android.os.SystemClock.uptimeMillis()
            m3h r6 = new m3h
            r12 = 0
            r7 = r13
            r6.<init>(r7, r8, r9, r10, r12)
            r0.t = r5
            r0.w = r3
            jg8 r13 = r7.k
            java.lang.Object r15 = na2.Z(r13, r6, r0)
            if (r15 != r1) goto L73
        L72:
            return r1
        L73:
            java.util.List r15 = (java.util.List) r15
            j3h r13 = r7.n
            if (r13 == 0) goto L7e
            yv4 r14 = r13.b
            r13.c = r5
            goto L7f
        L7e:
            r14 = r5
        L7f:
            if (r15 != 0) goto L8b
            r7.n = r5
            if (r14 == 0) goto L96
            l08 r13 = l08.a
            r14.d(r13)
            goto L96
        L8b:
            if (r13 == 0) goto L91
            r13.d = r15
            r13.b = r5
        L91:
            if (r14 == 0) goto L96
            r14.d(r15)
        L96:
            kotlin.Unit r13 = kotlin.Unit.a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n3h.i(java.lang.String, nt5):java.lang.Object");
    }

    public final Suggestion j(orb orbVar, String str) throws JSONException {
        String strE = orbVar.e("platform_url");
        JSONObject jSONObject = orbVar.a;
        String strT = dbh.t(((pne) this.h.get()).a, strE);
        if (strT.length() == 0) {
            strT = orbVar.e("platform_favicon");
        }
        String str2 = strT;
        return new Suggestion(32, orbVar.e(Constants.Params.NAME), "", orbVar.e("origin_url"), null, null, 2147483646, orbVar.e("image_link"), 0, -1, new c3h((float) jSONObject.getDouble("price_value"), orbVar.e("currency"), orbVar.e("platform_name"), str2, orbVar.e("platform_favicon"), (float) jSONObject.optDouble("review_stars", 0.0d), orbVar.e("product_id"), String.valueOf(str.hashCode())));
    }
}
