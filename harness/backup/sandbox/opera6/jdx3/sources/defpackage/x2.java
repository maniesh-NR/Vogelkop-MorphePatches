package defpackage;

import android.content.Context;
import android.content.Intent;
import android.view.accessibility.AccessibilityManager;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.leanplum.utils.SizeUtil;
import com.opera.android.Lazy;
import com.opera.android.autofill.passwords.picker.AutofillPasswordPickerActivity;
import com.opera.android.settings.SettingsManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes.dex */
public final /* synthetic */ class x2 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ x2(byte b, Object obj, Function1 function1) {
        this.a = b;
        this.c = function1;
        this.b = obj;
    }

    public /* synthetic */ x2(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    public final Object invoke() {
        k0j k0jVar;
        m3c m3cVar;
        byte b = this.a;
        byte b2 = 23;
        byte b3 = 0;
        wyh u52Var = null;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                q0g q0gVar = (q0g) obj2;
                q0gVar.i(q0gVar.h() + 1);
                ((Function1) obj).invoke(Integer.valueOf(q0gVar.h()));
                break;
            case 1:
                ((ejc) obj2).f((AccessibilityManager) obj);
                break;
            case 2:
                ((rmg) obj2).invoke((zf) obj);
                break;
            case 3:
                fg fgVar = (fg) obj2;
                xo8 xo8Var = (xo8) obj;
                if (Intrinsics.a(fgVar.l, xo8Var)) {
                    fgVar.l = null;
                }
                xo8Var.a();
                break;
            case 4:
                ((au) obj2).d.a((is) obj);
                break;
            case 5:
                ((cu) obj2).d.a((is) obj);
                break;
            case 6:
                ((gx0) obj2).b.invoke();
                ((xf5) ((wf5) obj)).a.finish(hjm.b);
                break;
            case 7:
                rx8 rx8Var = (rx8) obj2;
                ((Function1) obj).invoke(new vke(StringsKt.l0(rx8Var.a()).toString(), ((Boolean) rx8Var.b.getValue()).booleanValue(), ((Boolean) rx8Var.c.getValue()).booleanValue(), ((Boolean) rx8Var.d.getValue()).booleanValue()));
                break;
            case 8:
                my0 my0Var = (my0) obj;
                h42 h42VarJ = b8h.j((ekc) ((dw3) obj2).get(), new y2((byte) 24));
                h42VarJ.j(my0Var.a, new ug(new ky0(my0Var, b3), (byte) 1));
                break;
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                break;
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                soi soiVar = (soi) obj2;
                b41 b41Var = (b41) obj;
                eoi eoiVar = soiVar.e;
                eoi eoiVar2 = soiVar.f;
                Float f = soiVar.c;
                Float f2 = soiVar.d;
                float fFloatValue = (eoiVar == null || f == null) ? 0.0f : ((Number) eoiVar.a.invoke()).floatValue() - f.floatValue();
                float fFloatValue2 = (eoiVar2 == null || f2 == null) ? 0.0f : ((Number) eoiVar2.a.invoke()).floatValue() - f2.floatValue();
                if (fFloatValue != 0.0f || fFloatValue2 != 0.0f) {
                    int iA = b41Var.A(soiVar.a);
                    m0j m0jVar = (m0j) b41Var.s().e(b41Var.k);
                    if (m0jVar != null) {
                        try {
                            AccessibilityNodeInfoCompat accessibilityNodeInfoCompat = b41Var.m;
                            if (accessibilityNodeInfoCompat != null) {
                                accessibilityNodeInfoCompat.s(b41Var.k(m0jVar));
                            }
                        } catch (IllegalStateException unused) {
                        }
                    }
                    m0j m0jVar2 = (m0j) b41Var.s().e(b41Var.l);
                    if (m0jVar2 != null) {
                        try {
                            AccessibilityNodeInfoCompat accessibilityNodeInfoCompat2 = b41Var.n;
                            if (accessibilityNodeInfoCompat2 != null) {
                                accessibilityNodeInfoCompat2.s(b41Var.k(m0jVar2));
                            }
                        } catch (IllegalStateException unused2) {
                        }
                    }
                    b41Var.d.invalidate();
                    m0j m0jVar3 = (m0j) b41Var.s().e(iA);
                    if (m0jVar3 != null && (k0jVar = m0jVar3.a) != null && (m3cVar = k0jVar.c) != null) {
                        if (eoiVar != null) {
                            b41Var.p.i(iA, eoiVar);
                        }
                        if (eoiVar2 != null) {
                            b41Var.q.i(iA, eoiVar2);
                        }
                        b41Var.w(m3cVar);
                    }
                }
                if (eoiVar != null) {
                    soiVar.c = (Float) eoiVar.a.invoke();
                }
                if (eoiVar2 != null) {
                    soiVar.d = (Float) eoiVar2.a.invoke();
                }
                break;
            case 11:
                to9 to9Var = (to9) obj;
                qsk qskVar = ((va1) obj2).a;
                if (qskVar != null && (r15 = qskVar.getWritableDatabase()) != null) {
                    break;
                }
                break;
            case 12:
                break;
            case 13:
                ((pqh) obj2).a = ((Function0) obj).invoke();
                break;
            case 14:
                ((or4) obj2).b(obj);
                break;
            case 15:
                Function0 function0 = (Function0) obj;
                ms1 ms1Var = (ms1) ((gs1) obj2).a.getValue();
                c7j c7jVar = ms1Var.d;
                if (c7jVar != ms1Var.c) {
                    SettingsManager settingsManager = ms1Var.b;
                    settingsManager.getClass();
                    settingsManager.V(c7jVar.ordinal(), "app_font");
                    ms1Var.c = ms1Var.d;
                    nak nakVar = ms1Var.e;
                    ks1 ks1VarF = ms1Var.f();
                    nakVar.getClass();
                    nakVar.k((Object) null, ks1VarF);
                    ac8.a(new yzh());
                }
                function0.invoke();
                break;
            case 16:
                ((Function1) obj).invoke(((js1) obj2).a);
                break;
            case 17:
                at1 at1Var = (at1) obj2;
                at1Var.r = true;
                at1Var.g.e(oi.d((Context) obj), null);
                break;
            case SizeUtil.textSize0_1 /* 18 */:
                break;
            case 19:
                break;
            case SizeUtil.textSize0 /* 20 */:
                break;
            case 21:
                s62 s62Var = (s62) obj;
                break;
            case SizeUtil.textSize1 /* 22 */:
                s62 s62Var2 = (s62) obj2;
                z5i z5iVar = (z5i) obj;
                if (!z5iVar.equals(c62.x)) {
                    if (!z5iVar.equals(z52.x)) {
                        if (!(z5iVar instanceof y52)) {
                            if (!(z5iVar instanceof b62)) {
                                if (!(z5iVar instanceof a62)) {
                                    h9o.p();
                                    break;
                                } else {
                                    u52Var = new u52(((a62) z5iVar).x);
                                }
                            } else {
                                b62 b62Var = (b62) z5iVar;
                                u52Var = new v52(b62Var.x, b62Var.y);
                            }
                        } else {
                            u52Var = new s52(((y52) z5iVar).x);
                        }
                    } else {
                        u52Var = t52.k;
                    }
                }
                if (u52Var == null) {
                    s62Var2.t.r(Boolean.TRUE);
                } else {
                    s62Var2.c().a(u52Var, new m62(s62Var2, (byte) 0));
                }
                break;
            case 23:
                s62 s62Var3 = (s62) obj2;
                qyj qyjVar = new qyj(s62Var3, s62Var3.d(), ((rni) s62Var3.j.getValue()).b, s62Var3.x, new k62(s62Var3, (byte) 2), (Lazy) obj, s62Var3.g, new l62(s62Var3, (byte) 3));
                c12 c12Var = s62Var3.r;
                c12Var.h = qyjVar;
                c12Var.i.t(qyjVar.j);
                break;
            case SizeUtil.textSize2 /* 24 */:
                gg2 gg2Var = (gg2) obj2;
                gg2Var.w.b.setOnClickListener(null);
                gg2Var.w.b.animate().setDuration(pn7.f(gg2.F)).alpha(0.0f).withEndAction(new xa(gg2Var, (ei7) obj, b2));
                break;
            case 25:
                Intent intent = new Intent("android.intent.action.OPEN_DOCUMENT");
                intent.setType("text/comma-separated-values");
                intent.addCategory("android.intent.category.OPENABLE");
                ((hjf) oi.d(((ot2) obj2).a)).D(intent, (g2b) obj);
                break;
            case 26:
                ndc ndcVar = (AutofillPasswordPickerActivity) obj2;
                int i = AutofillPasswordPickerActivity.o;
                ndcVar.F().c(new ku((j2g) obj, true), ndcVar, new ug(new t02(ndcVar, (byte) 16), (byte) 7));
                break;
            case 27:
                int i2 = AutofillPasswordPickerActivity.o;
                ((AutofillPasswordPickerActivity) obj2).F().e(new zv7(Integer.parseInt((String) obj)), false);
                break;
            case 28:
                ((qf5) obj2).c = (Function0) obj;
                break;
            default:
                j03 j03Var = (j03) obj2;
                o3c o3cVar = (o3c) obj;
                j03Var.w = j03Var.r.a(o3cVar.a.e(), o3cVar.getLayoutDirection(), o3cVar);
                break;
        }
        return Unit.a;
    }
}
