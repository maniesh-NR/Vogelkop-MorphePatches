package defpackage;

import J.N;
import android.content.Context;
import android.net.Uri;
import com.opera.android.OperaApplication;
import java.util.ArrayList;
import java.util.Locale;
import kotlin.text.StringsKt;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class v00 {
    public final umi a;
    public final ru9 b;
    public Boolean c;
    public oml d;

    /* JADX WARN: Multi-variable type inference failed */
    public v00(tcc tccVar, hjf hjfVar, umi umiVar) {
        this.a = umiVar;
        this.b = ru9.c(hjfVar);
        String[] strArr = OperaApplication.K;
        aib.C(((OperaApplication) hjfVar.getApplicationContext()).J(), tccVar, new t00(this, hjfVar, (byte) 0));
        c(hjfVar);
    }

    public final void a(orb orbVar) throws JSONException {
        String str;
        String strE = orbVar.e("Domain");
        String strE2 = orbVar.e("Name");
        String strE3 = orbVar.e("Value");
        JSONObject jSONObject = orbVar.a;
        boolean z = jSONObject.getBoolean("HttpOnly");
        Long lValueOf = Long.valueOf(jSONObject.getLong("Max-Age"));
        boolean z2 = jSONObject.getBoolean("Secure");
        String strE4 = orbVar.e("SameSite");
        if (!rm5.c0(strE2)) {
            bxl.d("Invalid name: ".concat(strE2));
            return;
        }
        for (int i = 0; i < strE3.length(); i++) {
            char cCharAt = strE3.charAt(i);
            if (' ' > cCharAt || cCharAt >= 127 || StringsKt.F(" \\\",;", cCharAt)) {
                bxl.d("Invalid value: ".concat(strE3));
                return;
            }
        }
        String strK = sko.k(strE2, "=", strE3);
        if (!rm5.b0(strE)) {
            bxl.d("Invalid domain: ".concat(strE));
            return;
        }
        String strConcat = sko.k(strK, "; Domain=", strE.toLowerCase(Locale.ROOT)) + "; Max-Age=" + lValueOf;
        if (z) {
            strConcat = strConcat.concat("; HttpOnly");
        }
        if (z2) {
            strConcat = strConcat.concat("; Secure");
        }
        int i2 = 0;
        while (true) {
            if (i2 < strE4.length()) {
                char cCharAt2 = strE4.charAt(i2);
                if (' ' > cCharAt2 || cCharAt2 >= 127) {
                    break;
                } else {
                    i2++;
                }
            } else {
                String lowerCase = strE4.toLowerCase(Locale.ROOT);
                int iHashCode = lowerCase.hashCode();
                if (iHashCode != -891986231) {
                    if (iHashCode != 106915) {
                        if (iHashCode != 3387192 || !lowerCase.equals("none")) {
                            break;
                        } else {
                            str = "None";
                        }
                    } else if (lowerCase.equals("lax")) {
                        str = "Lax";
                    }
                } else if (!lowerCase.equals("strict")) {
                    break;
                } else {
                    str = "Strict";
                }
            }
        }
        str = null;
        if (str == null) {
            bxl.d("Invalid samesite: ".concat(strE4));
        } else if (str.equals("None") && !z2) {
            qp2.o("SameSite=None can only be set with Secure");
        } else {
            N.MtwtLBqE(false, new Uri.Builder().scheme("https").authority(strE).path("/").build().toString(), sko.k(strConcat, "; SameSite=", str), new xa(this, orbVar, (byte) 8));
        }
    }

    public final void b(Context context) {
        oml omlVar = this.d;
        if (omlVar != null) {
            omlVar.cancel(true);
        }
        oml omlVar2 = new oml(this.a.d(new u00(this, context, (byte) 1)));
        this.d = omlVar2;
        on7 on7Var = pn7.b;
        coh.k(omlVar2, (Object) null, cs5.x0(0, un7.e));
    }

    public final void c(Context context) {
        avj avjVar = cak.d;
        final byte b = 0;
        if (!avj.b(9)) {
            avj.g(9, new u00(this, context.getApplicationContext(), (byte) 0));
            return;
        }
        z3 z3Var = new z3(this, (byte) 13);
        String[] strArr = OperaApplication.K;
        OperaApplication operaApplication = (OperaApplication) context.getApplicationContext();
        if (!operaApplication.J().u("personalized_ads")) {
            z3Var.invoke(Boolean.FALSE);
            return;
        }
        final e00 e00VarD = operaApplication.d();
        final o8f o8fVar = new o8f(z3Var, (byte) 21);
        ArrayList arrayList = e00VarD.g;
        if (arrayList != null) {
            arrayList.add(new Runnable() { // from class: b00
                @Override // java.lang.Runnable
                public final void run() {
                    byte b2 = b;
                    o8f o8fVar2 = o8fVar;
                    e00 e00Var = e00VarD;
                    switch (b2) {
                        case 0:
                            o8fVar2.run(Boolean.valueOf(e00Var.b().b));
                            break;
                        default:
                            o8fVar2.run(Boolean.valueOf(e00Var.b().b));
                            break;
                    }
                }
            });
            return;
        }
        c00 c00Var = e00VarD.e;
        if (c00Var != null) {
            o8fVar.run(Boolean.valueOf(c00Var.b));
            return;
        }
        c00 c00Var2 = (c00) e00VarD.d.get();
        if (c00Var2.c) {
            nrl nrlVar = e00VarD.f;
            if (!nrlVar.a) {
                final byte b2 = 1;
                nrlVar.d(new Runnable() { // from class: b00
                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b22 = b2;
                        o8f o8fVar2 = o8fVar;
                        e00 e00Var = e00VarD;
                        switch (b22) {
                            case 0:
                                o8fVar2.run(Boolean.valueOf(e00Var.b().b));
                                break;
                            default:
                                o8fVar2.run(Boolean.valueOf(e00Var.b().b));
                                break;
                        }
                    }
                });
                return;
            }
        }
        o8fVar.run(Boolean.valueOf(c00Var2.b));
    }
}
