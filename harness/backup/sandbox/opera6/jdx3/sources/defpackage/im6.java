package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.fragment.app.w;
import com.opera.android.settings.SettingsManager;

/* loaded from: classes.dex */
public final class im6 extends cej {
    public final /* synthetic */ byte a;
    public final Object b;
    public final Object c;
    public Object d;

    public /* synthetic */ im6(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    public im6(n98 n98Var, x5f x5fVar) {
        this.a = (byte) 2;
        this.b = n98Var;
        this.c = x5fVar;
        this.d = wb0.d;
    }

    @Override // defpackage.cej
    public final dej createSheet(mej mejVar, b2l b2lVar) {
        rxh rxhVar;
        m98 m98Var;
        rxh rxhVar2;
        rxh rxhVar3;
        zu5 zu5Var;
        rxh rxhVar4;
        zu5 zu5Var2;
        rxh rxhVar5;
        zu5 zu5Var3;
        rxh rxhVar6;
        m98 m98Var2;
        rxh rxhVar7;
        kp9 kp9Var;
        byte b = this.a;
        byte b2 = 0;
        byte b3 = 2;
        byte b4 = 1;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                SharedPreferences sharedPreferences = (SharedPreferences) this.d;
                sharedPreferences.edit().putInt("show_counter_auto", sharedPreferences.getInt("show_counter_auto", 0) + 1).putLong("last_show_auto", System.currentTimeMillis()).apply();
                return new lm6(mejVar, (yl6) obj, false, new d06(this));
            case 1:
                return new iv6(mejVar, (String) obj2, (q6e) obj, (r9g) this.d);
            case 2:
                Context context = mejVar.getContext();
                n98 n98Var = (n98) obj2;
                pxh pxhVarY = cqp.Y(n98Var);
                rxh rxhVarX = cqp.X(n98Var);
                lxh lxhVar = new lxh(2131232637);
                rxh rxhVar8 = new rxh(2132019498);
                m98 m98Var3 = new m98(this, b2);
                if (o18.h(context, rxhVar8) == 0) {
                    rxhVar = null;
                    m98Var = null;
                } else {
                    rxhVar = rxhVar8;
                    m98Var = m98Var3;
                }
                int iOrdinal = n98Var.ordinal();
                if (iOrdinal == 0) {
                    rxhVar2 = new rxh(2132019209);
                } else {
                    if (iOrdinal != 1) {
                        h9o.p();
                        return null;
                    }
                    rxhVar2 = new rxh(2132018884);
                }
                zu5 zu5Var4 = new zu5((Object) this, context, b4);
                if (o18.h(context, rxhVar2) == 0) {
                    rxhVar3 = null;
                    zu5Var = null;
                } else {
                    rxhVar3 = rxhVar2;
                    zu5Var = zu5Var4;
                }
                return new qf(mejVar, new gua(null, null, null, lxhVar, pxhVarY, rxhVarX, null, rxhVar, m98Var, rxhVar3, zu5Var, true, null, false, null), b3);
            case 3:
                return new uc9(mejVar, (k24) obj2, (tc9[]) obj);
            case 4:
                Context context2 = mejVar.getContext();
                gjm gjmVar = (gjm) this.d;
                orm ormVar = (orm) obj;
                lxh lxhVar2 = new lxh(2131232155);
                dxh dxhVar = new dxh(2130968821);
                rxh rxhVar9 = new rxh(2132021989);
                rxh rxhVar10 = new rxh(2132021988);
                rxh rxhVar11 = new rxh(2132021987);
                zu5 zu5Var5 = new zu5((Object) ormVar, obj2, (byte) 3);
                if (o18.h(context2, rxhVar11) == 0) {
                    rxhVar4 = null;
                    zu5Var2 = null;
                } else {
                    rxhVar4 = rxhVar11;
                    zu5Var2 = zu5Var5;
                }
                rxh rxhVar12 = new rxh(2132019506);
                zu5 zu5Var6 = new zu5((Object) ormVar, (Object) gjmVar, (byte) 4);
                if (o18.h(context2, rxhVar12) == 0) {
                    rxhVar5 = null;
                    zu5Var3 = null;
                } else {
                    rxhVar5 = rxhVar12;
                    zu5Var3 = zu5Var6;
                }
                return new qf(mejVar, new gua(null, lxhVar2, null, null, rxhVar9, rxhVar10, null, rxhVar5, zu5Var3, rxhVar4, zu5Var2, true, dxhVar, false, null), b3);
            case 5:
                return new ywf(mejVar, (k6l) obj2, (SettingsManager) obj, (d8j) this.d);
            case 6:
                Context context3 = mejVar.getContext();
                w wVar = (w) obj2;
                db dbVar = (db) obj;
                tmi tmiVar = (tmi) this.d;
                lxh lxhVar3 = new lxh(2131231676);
                rxh rxhVar13 = new rxh(2132017648);
                rxh rxhVar14 = new rxh(2132017647);
                rxh rxhVar15 = new rxh(2132018111);
                m98 m98Var4 = new m98((Object) tmiVar, (byte) 5);
                if (o18.h(context3, rxhVar15) == 0) {
                    rxhVar6 = null;
                    m98Var2 = null;
                } else {
                    rxhVar6 = rxhVar15;
                    m98Var2 = m98Var4;
                }
                rxh rxhVar16 = new rxh(2132020022);
                kp9 kp9Var2 = new kp9(wVar, dbVar, tmiVar, b4);
                if (o18.h(context3, rxhVar16) == 0) {
                    rxhVar7 = null;
                    kp9Var = null;
                } else {
                    rxhVar7 = rxhVar16;
                    kp9Var = kp9Var2;
                }
                return new qf(mejVar, new gua(null, lxhVar3, null, null, rxhVar13, rxhVar14, null, rxhVar6, m98Var2, rxhVar7, kp9Var, true, null, false, null), b3);
            default:
                return new vxi(mejVar, (swf) obj2, (qp2) obj);
        }
    }

    @Override // defpackage.cej
    public final mej createSheetHost(Context context) {
        switch (this.a) {
            case 7:
                return new wq3(context, f03.E(2130968818, context, 0), true, (byte) 2);
            default:
                return super.createSheetHost(context);
        }
    }

    @Override // defpackage.cej
    public final void onFinished(hjm hjmVar) {
        int i;
        byte b = this.a;
        Object obj = this.b;
        Object obj2 = this.c;
        hjm hjmVar2 = hjm.b;
        switch (b) {
            case 0:
                if (hjmVar == hjmVar2) {
                    ((hm6) obj).n(hjmVar2);
                    break;
                }
                break;
            case 1:
            case 3:
            case 5:
            default:
                super.onFinished(hjmVar);
                break;
            case 2:
                x5f x5fVar = (x5f) obj2;
                int iOrdinal = ((n98) obj).ordinal();
                if (iOrdinal == 0) {
                    i = 9;
                } else if (iOrdinal != 1) {
                    h9o.p();
                    break;
                } else {
                    i = 10;
                }
                x5fVar.L(i, (wb0) this.d, null);
                break;
            case 4:
                if (hjmVar == hjmVar2) {
                    ((x5f) ((orm) obj2)).i0(hl0.d);
                    break;
                }
                break;
            case 6:
                super.onFinished(hjmVar);
                if (hjmVar != hjm.a) {
                    ((tmi) this.d).invoke(Boolean.FALSE);
                    break;
                }
                break;
        }
    }
}
