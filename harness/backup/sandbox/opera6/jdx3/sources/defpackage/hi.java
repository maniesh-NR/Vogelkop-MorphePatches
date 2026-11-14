package defpackage;

import com.leanplum.utils.SizeUtil;
import com.opera.android.Lazy;
import com.opera.android.OperaApplication;
import com.opera.android.autofill.AutofillManager;
import com.opera.android.autofill.PasswordManager;
import com.opera.android.settings.SettingsManager;

/* loaded from: classes.dex */
public final class hi extends Lazy {
    public final /* synthetic */ byte e;
    public final /* synthetic */ mi f;

    public /* synthetic */ hi(mi miVar, byte b) {
        this.e = b;
        this.f = miVar;
    }

    /* JADX WARN: Type inference failed for: r12v31, types: [android.app.Activity, hjf] */
    @Override // com.opera.android.Lazy
    public final Object d() {
        byte b = this.e;
        byte b2 = 4;
        byte b3 = 2;
        byte b4 = 0;
        mi miVar = this.f;
        switch (b) {
            case 0:
                return new gw(miVar.a);
            case 1:
                hjf hjfVar = miVar.a;
                return new v00(hjfVar.getLifecycle(), hjfVar, vml.d);
            case 2:
                String[] strArr = OperaApplication.K;
                OperaApplication operaApplication = (OperaApplication) miVar.a.getApplication();
                return new sk6(((lpe) operaApplication.A.get()).c, operaApplication.J());
            case 3:
                return new wh2(miVar.a, (AutofillManager) miVar.g.get());
            case 4:
                return new yu2(miVar.a);
            case 5:
                String[] strArr2 = OperaApplication.K;
                OperaApplication operaApplication2 = (OperaApplication) miVar.a.getApplication();
                return new nv2(new ji(operaApplication2, b4), new ji(operaApplication2, (byte) 1), new g92(operaApplication2.z, new y2((byte) 4)), new ji(operaApplication2, b3));
            case 6:
                return new af3(miVar.a, miVar.b);
            case 7:
                return new wk4((AutofillManager) miVar.g.get());
            case 8:
                return xf8.B(xf8.V((ikc) miVar.B.get(), new iv0(miVar.a, b2)));
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                return (pde) new ole((xd5) miVar.a).a;
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                return new yl6(miVar.a, miVar.b);
            case 11:
                hjf hjfVar2 = miVar.a;
                return new gx8(hjfVar2, hjfVar2, (ikc) miVar.B.get());
            case 12:
                return new xc9(miVar.a, miVar.b);
            case 13:
                return new uab(miVar.a.getApplicationContext(), miVar.b);
            case 14:
                String[] strArr3 = OperaApplication.K;
                ?? r12 = miVar.a;
                OperaApplication operaApplication3 = (OperaApplication) r12.getApplication();
                return new swf(new ni6((hjf) r12), operaApplication3.L().c, operaApplication3.s(), operaApplication3.J());
            case 15:
                String[] strArr4 = OperaApplication.K;
                return new x5g((PasswordManager) miVar.q.get(), (vnj) ((OperaApplication) miVar.a.getApplication()).r.R0.get());
            case 16:
                String[] strArr5 = OperaApplication.K;
                OperaApplication operaApplication4 = (OperaApplication) miVar.a.getApplication();
                return new ktg(operaApplication4.R(), operaApplication4.E());
            case 17:
                fp1 fp1Var = miVar.a;
                return new izj(fp1Var, fp1Var, uyg.e(miVar.a(), "speed_dial.large_icons", new y2((byte) 5)), (ikc) miVar.B.get());
            case SizeUtil.textSize0_1 /* 18 */:
                return new fmk((af3) miVar.k.get(), zsk.f, new jvg(miVar.a, miVar.b), new auj((byte) 2));
            case 19:
                String[] strArr6 = OperaApplication.K;
                return new xg7(new ki(new li((OperaApplication) miVar.a.getApplication(), OperaApplication.class, "accountManager", "getAccountManager()Lcom/opera/android/account/AccountManager;", 0, (byte) 0), b4));
            case SizeUtil.textSize0 /* 20 */:
                String[] strArr7 = OperaApplication.K;
                OperaApplication operaApplication5 = (OperaApplication) miVar.a.getApplication();
                return new m8l(operaApplication5.L().c, operaApplication5.L().d);
            case 21:
                return new nkm(miVar.a);
            default:
                String[] strArr8 = OperaApplication.K;
                OperaApplication operaApplication6 = (OperaApplication) miVar.a.getApplication();
                umi umiVar = vml.d;
                x5f x5fVar = operaApplication6.L().c;
                x5f x5fVar2 = operaApplication6.L().d;
                SettingsManager settingsManagerA = miVar.a();
                b59 b59VarL = w1h.l(operaApplication6, umiVar, "wallpaper_days_counter", new bg1[0]);
                return new onn(b59VarL, new ni6(b59VarL), w1h.l(operaApplication6, umiVar, "system_wallpaper", new bg1[0]), new mgh(operaApplication6), x5fVar, x5fVar2, settingsManagerA);
        }
    }
}
