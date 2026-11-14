package defpackage;

import android.os.Handler;
import android.text.TextUtils;
import com.opera.android.suggestion.SuggestionListCallback;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class km5 implements hh4, qr9, SuggestionListCallback {
    public boolean a;
    public boolean b;
    public Object c;
    public Object d;

    public km5(byte b) {
        switch (b) {
            case 5:
                this.d = new HashSet();
                break;
            default:
                this.a = true;
                break;
        }
    }

    public final lm5 a() {
        return new lm5(this.a, this.b, (String[]) this.c, (String[]) this.d);
    }

    public final void b(e05... e05VarArr) {
        if (!this.a) {
            qp2.o("no cipher suites for cleartext connections");
            return;
        }
        ArrayList arrayList = new ArrayList(e05VarArr.length);
        for (e05 e05Var : e05VarArr) {
            arrayList.add(e05Var.a);
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
        if (!this.a) {
            qp2.o("no cipher suites for cleartext connections");
        } else if (strArr2.length != 0) {
            this.c = (String[]) Arrays.copyOf(strArr2, strArr2.length);
        } else {
            qp2.o("At least one cipher suite is required");
        }
    }

    public final void c(wql... wqlVarArr) {
        if (!this.a) {
            qp2.o("no TLS versions for cleartext connections");
            return;
        }
        ArrayList arrayList = new ArrayList(wqlVarArr.length);
        for (wql wqlVar : wqlVarArr) {
            arrayList.add(wqlVar.a);
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
        if (!this.a) {
            qp2.o("no TLS versions for cleartext connections");
        } else if (strArr2.length != 0) {
            this.d = (String[]) Arrays.copyOf(strArr2, strArr2.length);
        } else {
            qp2.o("At least one TLS version is required");
        }
    }

    @Override // defpackage.hh4
    public final void cancel() {
        this.b = true;
        ((q65) this.d).S();
    }

    @Override // com.opera.android.suggestion.SuggestionListCallback
    public final void d(List list) {
        boolean z = this.a;
        jqk jqkVar = (jqk) this.d;
        String str = (String) this.c;
        if (TextUtils.equals(jqkVar.f, str) && jqkVar.e.equals(list)) {
            return;
        }
        jqkVar.e = list;
        jqkVar.f = str;
        if (jqkVar.i && z) {
            jqkVar.j = true;
            return;
        }
        oml omlVar = jqkVar.h;
        if (omlVar != null) {
            omlVar.cancel(false);
        }
        oml omlVar2 = new oml(jqkVar.a.d(new gh2((byte) 12, this, this.b)));
        jqkVar.h = omlVar2;
        omlVar2.b(null, z ? 0L : 50L, TimeUnit.MILLISECONDS, null);
    }

    public final void onFailure(Throwable th) {
    }

    public final void onSuccess(Object obj) {
        ood oodVar = (ood) obj;
        npd npdVar = ((aqd) this.d).f;
        Handler handler = npdVar.l;
        nod nodVar = (nod) this.c;
        tym.S(handler, new zr9(npdVar, nodVar, (Runnable) new upd(this, oodVar, this.a, this.b, nodVar)));
    }
}
