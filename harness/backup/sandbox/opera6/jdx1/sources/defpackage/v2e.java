package defpackage;

import android.content.SharedPreferences;
import com.opera.android.OperaApplication;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final /* synthetic */ class v2e implements Function1 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;

    public /* synthetic */ v2e(byte b, Object obj, Object obj2, boolean z) {
        this.a = b;
        this.d = obj;
        this.b = obj2;
        this.c = z;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [boolean, int] */
    public /* synthetic */ v2e(long j, Long l, String str) {
        this.a = (byte) 0;
        this.c = (int) j;
        this.d = l;
        this.b = str;
    }

    public /* synthetic */ v2e(String str, String str2, boolean z) {
        this.a = (byte) 1;
        this.b = str;
        this.d = str2;
        this.c = z;
    }

    public /* synthetic */ v2e(boolean z, gu6 gu6Var, nx5 nx5Var) {
        this.a = (byte) 3;
        this.c = z;
        this.d = gu6Var;
        this.b = nx5Var;
    }

    public /* synthetic */ v2e(boolean z, String str, nsj nsjVar) {
        this.a = (byte) 4;
        this.c = z;
        this.b = str;
        this.d = nsjVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        final byte b2 = 2;
        final byte b3 = 1;
        final byte b4 = 3;
        boolean z = this.c;
        Object obj2 = this.b;
        Object obj3 = this.d;
        final byte b5 = 0;
        switch (b) {
            case 0:
                wa1 wa1Var = (wa1) obj;
                wa1Var.x(0, Long.valueOf(z ? 1L : 0L));
                wa1Var.x(1, (Long) obj3);
                wa1Var.w(2, (String) obj2);
                break;
            case 1:
                String str = (String) obj2;
                String str2 = (String) obj3;
                ki0 ki0Var = (ki0) obj;
                ji0 ji0Var = ki0Var.a;
                ji0 ji0Var2 = ki0Var.a;
                ji0Var.p(0, 1, 1L);
                if (str.length() > 0) {
                    ji0Var2.q(1, 1, str);
                }
                if (str2.length() > 0) {
                    ji0Var2.q(2, 1, str2);
                }
                ji0Var2.q(3, 1, z ? ii0.d : ii0.b);
                break;
            case 2:
                b80 b80Var = (b80) obj3;
                a80 a80Var = (a80) obj2;
                td0 td0Var = (td0) obj;
                td0Var.a.getClass();
                c80 c80Var = new c80(2443, -1, 3);
                qd0 qd0Var = td0Var.b;
                List list = (List) qd0Var.n(56);
                ((list == null || list.isEmpty()) ? new hf0(qd0Var, 56, vep.t(qd0Var, 56, 1)) : new hf0(qd0Var, 56, list)).add(c80Var);
                c80Var.q(1, 1, b80Var);
                if (a80Var != null) {
                    c80Var.q(0, 1, a80Var);
                }
                c80Var.r(2, 1, z);
                break;
            case 3:
                final gu6 gu6Var = (gu6) obj3;
                final nx5 nx5Var = (nx5) obj2;
                q0j q0jVar = (q0j) obj;
                if (z) {
                    Function0 function0 = new Function0() { // from class: exf
                        public final Object invoke() {
                            byte b6 = b5;
                            nx5 nx5Var2 = nx5Var;
                            gu6 gu6Var2 = gu6Var;
                            boolean z2 = false;
                            switch (b6) {
                                case 0:
                                    if (gu6Var2.c()) {
                                        na2.B(nx5Var2, null, null, new fxf(gu6Var2, null, (byte) 0), 3);
                                        z2 = true;
                                        break;
                                    }
                                    break;
                                case 1:
                                    if (gu6Var2.d()) {
                                        na2.B(nx5Var2, null, null, new fxf(gu6Var2, null, (byte) 1), 3);
                                        z2 = true;
                                        break;
                                    }
                                    break;
                                case 2:
                                    if (gu6Var2.c()) {
                                        na2.B(nx5Var2, null, null, new fxf(gu6Var2, null, (byte) 0), 3);
                                        z2 = true;
                                        break;
                                    }
                                    break;
                                default:
                                    if (gu6Var2.d()) {
                                        na2.B(nx5Var2, null, null, new fxf(gu6Var2, null, (byte) 1), 3);
                                        z2 = true;
                                        break;
                                    }
                                    break;
                            }
                            return Boolean.valueOf(z2);
                        }
                    };
                    xtb[] xtbVarArr = o0j.a;
                    q0jVar.b(e0j.y, new c8(null, function0));
                    q0jVar.b(e0j.A, new c8(null, new Function0() { // from class: exf
                        public final Object invoke() {
                            byte b6 = b3;
                            nx5 nx5Var2 = nx5Var;
                            gu6 gu6Var2 = gu6Var;
                            boolean z2 = false;
                            switch (b6) {
                                case 0:
                                    if (gu6Var2.c()) {
                                        na2.B(nx5Var2, null, null, new fxf(gu6Var2, null, (byte) 0), 3);
                                        z2 = true;
                                        break;
                                    }
                                    break;
                                case 1:
                                    if (gu6Var2.d()) {
                                        na2.B(nx5Var2, null, null, new fxf(gu6Var2, null, (byte) 1), 3);
                                        z2 = true;
                                        break;
                                    }
                                    break;
                                case 2:
                                    if (gu6Var2.c()) {
                                        na2.B(nx5Var2, null, null, new fxf(gu6Var2, null, (byte) 0), 3);
                                        z2 = true;
                                        break;
                                    }
                                    break;
                                default:
                                    if (gu6Var2.d()) {
                                        na2.B(nx5Var2, null, null, new fxf(gu6Var2, null, (byte) 1), 3);
                                        z2 = true;
                                        break;
                                    }
                                    break;
                            }
                            return Boolean.valueOf(z2);
                        }
                    }));
                } else {
                    Function0 function02 = new Function0() { // from class: exf
                        public final Object invoke() {
                            byte b6 = b2;
                            nx5 nx5Var2 = nx5Var;
                            gu6 gu6Var2 = gu6Var;
                            boolean z2 = false;
                            switch (b6) {
                                case 0:
                                    if (gu6Var2.c()) {
                                        na2.B(nx5Var2, null, null, new fxf(gu6Var2, null, (byte) 0), 3);
                                        z2 = true;
                                        break;
                                    }
                                    break;
                                case 1:
                                    if (gu6Var2.d()) {
                                        na2.B(nx5Var2, null, null, new fxf(gu6Var2, null, (byte) 1), 3);
                                        z2 = true;
                                        break;
                                    }
                                    break;
                                case 2:
                                    if (gu6Var2.c()) {
                                        na2.B(nx5Var2, null, null, new fxf(gu6Var2, null, (byte) 0), 3);
                                        z2 = true;
                                        break;
                                    }
                                    break;
                                default:
                                    if (gu6Var2.d()) {
                                        na2.B(nx5Var2, null, null, new fxf(gu6Var2, null, (byte) 1), 3);
                                        z2 = true;
                                        break;
                                    }
                                    break;
                            }
                            return Boolean.valueOf(z2);
                        }
                    };
                    xtb[] xtbVarArr2 = o0j.a;
                    q0jVar.b(e0j.z, new c8(null, function02));
                    q0jVar.b(e0j.B, new c8(null, new Function0() { // from class: exf
                        public final Object invoke() {
                            byte b6 = b4;
                            nx5 nx5Var2 = nx5Var;
                            gu6 gu6Var2 = gu6Var;
                            boolean z2 = false;
                            switch (b6) {
                                case 0:
                                    if (gu6Var2.c()) {
                                        na2.B(nx5Var2, null, null, new fxf(gu6Var2, null, (byte) 0), 3);
                                        z2 = true;
                                        break;
                                    }
                                    break;
                                case 1:
                                    if (gu6Var2.d()) {
                                        na2.B(nx5Var2, null, null, new fxf(gu6Var2, null, (byte) 1), 3);
                                        z2 = true;
                                        break;
                                    }
                                    break;
                                case 2:
                                    if (gu6Var2.c()) {
                                        na2.B(nx5Var2, null, null, new fxf(gu6Var2, null, (byte) 0), 3);
                                        z2 = true;
                                        break;
                                    }
                                    break;
                                default:
                                    if (gu6Var2.d()) {
                                        na2.B(nx5Var2, null, null, new fxf(gu6Var2, null, (byte) 1), 3);
                                        z2 = true;
                                        break;
                                    }
                                    break;
                            }
                            return Boolean.valueOf(z2);
                        }
                    }));
                }
                break;
            case 4:
                String str3 = (String) obj2;
                nsj nsjVar = (nsj) obj3;
                q0j q0jVar2 = (q0j) obj;
                if (z) {
                    xtb[] xtbVarArr3 = o0j.a;
                    p0j p0jVar = n0j.k;
                    xtb xtbVar = o0j.a[3];
                    nkc nkcVar = new nkc(0);
                    p0jVar.getClass();
                    q0jVar2.b(p0jVar, nkcVar);
                }
                lsj lsjVar = new lsj(nsjVar, (byte) 0);
                xtb[] xtbVarArr4 = o0j.a;
                q0jVar2.b(e0j.v, new c8(null, lsjVar));
                o0j.g(q0jVar2, str3);
                break;
            default:
                Locale locale = (Locale) obj3;
                OperaApplication operaApplication = (OperaApplication) obj2;
                String string = locale.toString();
                String string2 = operaApplication.getSharedPreferences("uninstall_survey", 0).getString("uninstall_shortcut_last_locale", null);
                if (string2 != null) {
                    if (!string2.equals(string)) {
                        if (w1h.n(operaApplication).a) {
                            try {
                                phj.C0(operaApplication, Collections.singletonList(w1h.i(operaApplication, locale)));
                                String string3 = locale.toString();
                                SharedPreferences.Editor editorEdit = operaApplication.getSharedPreferences("uninstall_survey", 0).edit();
                                editorEdit.putString("uninstall_shortcut_last_locale", string3);
                                editorEdit.apply();
                            } catch (IllegalArgumentException | IllegalStateException unused) {
                            }
                        }
                        break;
                    } else {
                        break;
                    }
                } else {
                    if (z) {
                        SharedPreferences.Editor editorEdit2 = operaApplication.getSharedPreferences("uninstall_survey", 0).edit();
                        editorEdit2.putString("uninstall_shortcut_last_locale", string);
                        editorEdit2.apply();
                    }
                    break;
                }
        }
        return Unit.a;
    }
}
