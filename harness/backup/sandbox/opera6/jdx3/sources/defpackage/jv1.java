package defpackage;

import android.text.TextUtils;
import com.leanplum.utils.SizeUtil;
import com.opera.android.OperaApplication;
import java.util.Collections;
import java.util.Locale;
import java.util.Set;
import kotlin.text.StringsKt;

/* loaded from: classes.dex */
public final /* synthetic */ class jv1 implements esk {
    public final /* synthetic */ byte a;
    public final /* synthetic */ xv1 b;

    public /* synthetic */ jv1(xv1 xv1Var, byte b) {
        this.a = b;
        this.b = xv1Var;
    }

    public final Object get() {
        String str;
        boolean z;
        h1b h1bVar;
        byte b = this.a;
        xv1 xv1Var = this.b;
        switch (b) {
            case 0:
                OperaApplication operaApplication = xv1Var.a;
                Locale locale = wwc.a;
                String string = ipe.z(operaApplication).getString("language_code", null);
                if (TextUtils.isEmpty(string)) {
                    string = wwc.d(wwc.a);
                }
                String strC = wwc.c(string);
                ywc.d();
                Set setKeySet = ywc.a.keySet();
                if (!setKeySet.contains(strC)) {
                    if (StringsKt.K(strC, '-', 0, 6) == -1) {
                        return "en";
                    }
                    strC = strC.substring(0, StringsKt.K(strC, '-', 0, 6));
                    if (!setKeySet.contains(strC)) {
                        return "en";
                    }
                }
                return strC;
            case 1:
                return new pjn(xv1Var, (byte) 10);
            case 2:
                return oup.Z(xv1Var.a);
            case 3:
                return Boolean.valueOf(((k3i) xv1Var.E0.get()).c());
            case 4:
                return ((d3j) e3j.t(xv1Var.a).i()).d(45, false);
            case 5:
                OperaApplication operaApplication2 = xv1Var.a;
                return new ien(operaApplication2, operaApplication2.L().c, operaApplication2.M(), (nzk) xv1Var.c1.get(), operaApplication2.R());
            case 6:
                return Integer.valueOf(nr8.e(xv1Var.a));
            case 7:
                n9a n9aVar = hs3.a;
                OperaApplication operaApplication3 = xv1Var.a;
                n9aVar.getClass();
                return n9a.t(operaApplication3);
            case 8:
                OperaApplication operaApplication4 = xv1Var.a;
                String strD = jpo.D(operaApplication4);
                return strD == null ? operaApplication4.J().u("personalized_ads") ? "true" : "false" : strD;
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                return xv1Var.a.i().a();
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                return oup.a0(4, vtp.G(1, xv1Var.a));
            case 11:
                OperaApplication operaApplication5 = xv1Var.a;
                return r9n.u(operaApplication5, operaApplication5.getPackageName(), 0L).versionName;
            case 12:
                return oup.a0(1, vtp.G(1, xv1Var.a));
            case 13:
                OperaApplication operaApplication6 = xv1Var.a;
                return new yen(operaApplication6, operaApplication6.L().c, operaApplication6.M(), operaApplication6.R());
            case 14:
                return v1.u(xv1Var.a).x();
            case 15:
                return new l45(xv1Var.a, (byte) 24);
            case 16:
                return ((d6j) xv1Var.X0.get()).d;
            case 17:
                return e3j.t(xv1Var.a);
            case SizeUtil.textSize0_1 /* 18 */:
                n9a n9aVar2 = hs3.a;
                OperaApplication operaApplication7 = xv1Var.a;
                n9aVar2.getClass();
                return n9a.t(operaApplication7);
            case 19:
                OperaApplication operaApplication8 = xv1Var.a;
                return new fjn(operaApplication8, ru9.c(operaApplication8), dj9.t(operaApplication8), operaApplication8.L().d);
            case SizeUtil.textSize0 /* 20 */:
                jk5 jk5VarI = xv1Var.a.i();
                synchronized (jk5VarI.d) {
                    str = jk5VarI.e;
                }
                return str == null ? jk5VarI.a() : str;
            case 21:
                OperaApplication operaApplication9 = xv1Var.a;
                if (!operaApplication9.J().i("eula_accepted.gdpr")) {
                    return null;
                }
                String strD2 = jpo.D(operaApplication9);
                return strD2 != null ? new qcl(strD2) : operaApplication9.J().u("personalized_ads") ? qcl.b : qcl.c;
            case SizeUtil.textSize1 /* 22 */:
                OperaApplication operaApplication10 = xv1Var.a;
                return r9n.u(operaApplication10, operaApplication10.getPackageName(), 0L).versionName;
            case 23:
                ebb ebbVar = ebb.c;
                return j06.m(u59.C(xv1Var.a).H().b);
            case SizeUtil.textSize2 /* 24 */:
                jk5 jk5Var = (jk5) xv1Var.v.get();
                synchronized (jk5Var.d) {
                    z = jk5Var.e != null;
                }
                return Boolean.valueOf(z);
            case 25:
                String strB = "";
                String strB2 = "redirect.opera.com";
                c3j c3jVarD = ((d3j) e3j.t(xv1Var.a).i()).d(34, true);
                if (c3jVarD != null) {
                    strB2 = aik.b((String) c3jVarD.d, "redirect.opera.com");
                    strB = aik.b((String) c3jVarD.b, "");
                    h1bVar = (h1b) c3jVarD.c;
                } else {
                    h1bVar = Collections.EMPTY_LIST;
                }
                return new pne(strB2, strB, h1bVar);
            case 26:
                return new wyn(dj9.t(xv1Var.a), new hv1(xv1Var, (byte) 26), new hv1(xv1Var, (byte) 27));
            case 27:
                n9a n9aVar3 = hs3.a;
                OperaApplication operaApplication11 = xv1Var.a;
                n9aVar3.getClass();
                return n9a.s(operaApplication11);
            case 28:
                OperaApplication operaApplication12 = xv1Var.a;
                return r9n.u(operaApplication12, operaApplication12.getPackageName(), 0L).versionName;
            default:
                return v1.u(xv1Var.a).x();
        }
    }
}
