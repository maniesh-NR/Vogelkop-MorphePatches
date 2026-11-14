package defpackage;

import android.content.Context;
import com.opera.android.FullscreenWebActivity;
import com.opera.api.Callback;
import java.util.ArrayList;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public abstract class zz1 {
    public static final long l;
    public static final /* synthetic */ int m = 0;
    public final Context a;
    public final ndc b;
    public final esk c;
    public final mlj d;
    public final Callback e;
    public final Function2 f;
    public final esk g;
    public final g7m h;
    public final k42 i;
    public final v5n j;
    public final gjm k;

    static {
        on7 on7Var = pn7.b;
        l = cs5.x0(500, un7.d);
    }

    public zz1(Context context, ndc ndcVar, esk eskVar, mlj mljVar, Callback callback, Function2 function2, esk eskVar2, g7m g7mVar, k42 k42Var, v5n v5nVar, gjm gjmVar) {
        this.a = context;
        this.b = ndcVar;
        this.c = eskVar;
        this.d = mljVar;
        this.e = callback;
        this.f = function2;
        this.g = eskVar2;
        this.h = g7mVar;
        this.i = k42Var;
        this.j = v5nVar;
        this.k = gjmVar;
    }

    public void a(long j) {
    }

    public void b() {
    }

    public void c(String str, String str2) {
    }

    public abstract void d(String str, boolean z);

    public abstract void e(String str, ArrayList arrayList);

    public final void f(vz1 vz1Var) {
        String str;
        rxh rxhVar;
        int iOrdinal = vz1Var.ordinal();
        if (iOrdinal == 0) {
            str = "https://help.opera.com/en/browser-ai-faq/";
        } else if (iOrdinal == 1) {
            str = "https://help.opera.com/en/browser-ai-faq/#accuracy";
        } else if (iOrdinal == 2) {
            str = "https://help.opera.com/en/browser-ai-faq/#limits-and-terms";
        } else if (iOrdinal == 3) {
            str = "https://www.opera.com/privacy";
        } else {
            if (iOrdinal != 4) {
                h9o.p();
                return;
            }
            str = "https://www.opera.com/terms";
        }
        int iOrdinal2 = vz1Var.ordinal();
        if (iOrdinal2 == 0 || iOrdinal2 == 1 || iOrdinal2 == 2) {
            rxhVar = new rxh(2132021212);
        } else if (iOrdinal2 == 3) {
            rxhVar = new rxh(2132021379);
        } else {
            if (iOrdinal2 != 4) {
                h9o.p();
                return;
            }
            rxhVar = new rxh(2132021773);
        }
        FullscreenWebActivity.A0(this.a, str, rxhVar);
    }

    public abstract void g(String str);
}
