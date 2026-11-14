package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import com.opera.android.Lazy;
import com.opera.android.OperaApplication;
import java.util.Objects;

/* loaded from: classes.dex */
public final class fx3 extends Lazy {
    public final /* synthetic */ byte e;
    public final /* synthetic */ hx3 f;

    public /* synthetic */ fx3(hx3 hx3Var, byte b) {
        this.e = b;
        this.f = hx3Var;
    }

    /* JADX WARN: Type inference failed for: r0v48, types: [android.content.Context, dx3] */
    /* JADX WARN: Type inference failed for: r9v2, types: [android.app.Activity, android.content.Context, dx3, oi] */
    @Override // com.opera.android.Lazy
    public final Object d() {
        byte b = this.e;
        byte b2 = 4;
        byte b3 = 25;
        byte b4 = 24;
        byte b5 = 1;
        byte b6 = 26;
        byte b7 = 5;
        byte b8 = 6;
        byte b9 = 8;
        byte b10 = 7;
        hx3 hx3Var = this.f;
        switch (b) {
            case 0:
                String[] strArr = OperaApplication.K;
                return new lg(((OperaApplication) hx3Var.b.getApplication()).I());
            case 1:
                dx3 dx3Var = hx3Var.b;
                ViewGroup viewGroup = (ViewGroup) dx3Var.findViewById(2131362089);
                if (viewGroup != null) {
                    return new bt2(dx3Var, viewGroup);
                }
                return null;
            case 2:
                String[] strArr2 = OperaApplication.K;
                OperaApplication operaApplication = (OperaApplication) hx3Var.b.getApplication();
                return new ul3((in3) operaApplication.r.r.get(), operaApplication.L().c, operaApplication.g(), ((mi) hx3Var.a.b).z, new gx3(hx3Var, (byte) 0), new gx3(hx3Var, b5), hx3Var.p);
            case 3:
                ?? r9 = hx3Var.b;
                qim qimVar = r9.o;
                Objects.requireNonNull(qimVar);
                ki kiVar = new ki(qimVar, b2);
                hi hiVar = ((mi) hx3Var.a.b).m;
                ki kiVar2 = new ki(u59.C(r9), b7);
                ki kiVar3 = new ki(xnh.t(r9), b8);
                String[] strArr3 = OperaApplication.K;
                return new mm6(kiVar, hiVar, kiVar2, kiVar3, ((lpe) ((OperaApplication) r9.getApplication()).A.get()).c, r9, ((OperaApplication) r9.getApplication()).L().c);
            case 4:
                vo7 vo7Var = new vo7(new gx3(hx3Var, (byte) 2), new gx3(hx3Var, (byte) 3), new mr3((byte) 7), new yqa((Object) new gx3(hx3Var, b2), (Object) new gx3(hx3Var, b7), (byte) 13), new kw3(b7), new qq6(new gx3(hx3Var, b8), b10), new gx3(hx3Var, b10));
                hx3Var.b.getLifecycle().a(vo7Var);
                return vo7Var;
            case 5:
                fp1 fp1Var = hx3Var.b;
                tz8 tz8Var = new tz8();
                tz8Var.a = fp1Var;
                fp1Var.getLifecycle().a(tz8Var);
                return tz8Var;
            case 6:
                String[] strArr4 = OperaApplication.K;
                OperaApplication operaApplication2 = (OperaApplication) hx3Var.b.getApplication();
                return new eq9(vml.d, operaApplication2.L().c, operaApplication2.L().e, new ki(new pw3(operaApplication2, OperaApplication.class, "vpnManager", "getVpnManager()Lcom/opera/android/vpn/VpnManager;", 0, (byte) 2), b9));
            case 7:
                umi umiVar = hx3Var.c;
                r16 r16Var = ngh.a;
                fp1 fp1Var2 = hx3Var.b;
                kw3 kw3Var = new kw3(b8);
                String[] strArr5 = OperaApplication.K;
                return new i9c(umiVar, fp1Var2, kw3Var, xf8.u(((lpe) ((OperaApplication) fp1Var2.getApplication()).A.get()).o), new ydp((byte) 25), xne.b);
            case 8:
                String[] strArr6 = OperaApplication.K;
                fp1 fp1Var3 = hx3Var.b;
                OperaApplication operaApplication3 = (OperaApplication) fp1Var3.getApplication();
                return new xg7(fp1Var3, new nw3(operaApplication3, (byte) 23), new nw3(operaApplication3, b4), new nw3(operaApplication3, b3), new gx3(hx3Var, b9), new nw3(operaApplication3, b6), hx3Var.p);
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                String[] strArr7 = OperaApplication.K;
                ndc ndcVar = hx3Var.b;
                OperaApplication operaApplication4 = (OperaApplication) ndcVar.getApplication();
                k6l k6lVarW = ndcVar.W();
                Objects.requireNonNull(k6lVarW);
                return new iv7(ndcVar, k6lVarW, operaApplication4.I(), (lg) hx3Var.d.get());
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                String[] strArr8 = OperaApplication.K;
                Class<Lazy> cls = Lazy.class;
                return new yug(new et3((OperaApplication) hx3Var.b.getApplication(), b10), new q2(0, hx3Var.p, cls, "get", "get()Ljava/lang/Object;", 0, (byte) 14), new q2(0, hx3Var.n, cls, "get", "get()Ljava/lang/Object;", 0, (byte) 15));
            case 11:
                String[] strArr9 = OperaApplication.K;
                fp1 fp1Var4 = hx3Var.b;
                OperaApplication operaApplication5 = (OperaApplication) fp1Var4.getApplication();
                return new nvg(fp1Var4, new ki(hx3Var.p, b10), new p8f((Context) fp1Var4, hx3Var.c, operaApplication5.L().c, operaApplication5.L().d), (vvg) operaApplication5.r.u0.get(), (yvg) hx3Var.o.get(), operaApplication5.E(), new nw3(operaApplication5, (byte) 27));
            case 12:
                String[] strArr10 = OperaApplication.K;
                xd5 xd5Var = hx3Var.b;
                OperaApplication operaApplication6 = (OperaApplication) xd5Var.getApplication();
                tcc lifecycle = xd5Var.getLifecycle();
                gmk gmkVarE = operaApplication6.E();
                qim qimVar2 = xd5Var.o;
                Objects.requireNonNull(qimVar2);
                z77 z77Var = qimVar2.c;
                umi umiVar2 = hx3Var.c;
                tcc lifecycle2 = xd5Var.getLifecycle();
                ydn ydnVarR = operaApplication6.R();
                slk slkVarM = operaApplication6.M();
                qim qimVar3 = xd5Var.o;
                Objects.requireNonNull(qimVar3);
                return new yvg(xd5Var, lifecycle, gmkVarE, z77Var, umiVar2, new c1a(lifecycle2, ydnVarR, slkVarM, qimVar3.c, (gjm) hx3Var.p.get(), operaApplication6.L().c));
            case 13:
                return new tgi(hx3Var.b.getResources().getDisplayMetrics().density);
            case 14:
                return new u4l(hx3Var.c);
            case 15:
                dx3 dx3Var2 = hx3Var.b;
                return new gjm(dx3Var2.getSupportFragmentManager(), dx3Var2.getLifecycle(), new r2(1, dx3Var2, dx3.class, "resolveFragmentProperties", "resolveFragmentProperties(Ljava/lang/Class;)Lcom/opera/android/ui/navigation/UiNavigatorImpl$FragmentProperties;", 0, (byte) 14));
            case 16:
                fp1 fp1Var5 = hx3Var.b;
                jbn jbnVar = new jbn(fp1Var5.getApplicationContext(), fp1Var5, new oc2(hx3Var, b6), new umk(fp1Var5.getApplicationContext(), vml.d, (byte) 1), new l45((Context) fp1Var5, (byte) 24));
                fac.C(hx3Var.c, new gb3(jbnVar, hx3Var, (byte) 8));
                return jbnVar;
            default:
                ?? r0 = hx3Var.b;
                return new cdn(r0.getApplicationContext(), r0.W(), r0.O());
        }
    }
}
