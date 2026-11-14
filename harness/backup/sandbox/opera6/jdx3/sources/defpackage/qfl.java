package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.leanplum.internal.Constants;
import com.leanplum.utils.SizeUtil;
import com.opera.android.BrowserActivity;
import com.opera.android.OperaApplication;
import com.opera.android.settings.SettingsManager;
import com.opera.android.startup.WelcomeActivity;
import com.opera.android.uninstall.UninstallActivity;
import com.opera.android.weather.ui.WeatherWidgetActivity;
import com.opera.android.webcore.WebcoreRpcBridge;
import com.opera.api.Callback;
import java.util.Collections;
import java.util.Locale;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* loaded from: classes.dex */
public final /* synthetic */ class qfl implements Function1 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ qfl(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public /* synthetic */ qfl(qfl qflVar, lrk lrkVar) {
        this.a = (byte) 2;
        this.b = qflVar;
    }

    /* JADX WARN: Type inference failed for: r1v30, types: [android.app.Activity, android.content.Context, com.opera.android.BrowserActivity, dx3] */
    public final Object invoke(Object obj) {
        int measuredHeight;
        int measuredHeight2;
        nd4 nd4VarC;
        byte b = this.a;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                Drawable drawable = (Drawable) obj2;
                mk7 mk7Var = (mk7) obj;
                a31 a31VarA = mk7Var.s0().A();
                drawable.setBounds(0, 0, (int) Float.intBitsToFloat((int) (mk7Var.e() >> 32)), (int) Float.intBitsToFloat((int) (mk7Var.e() & 4294967295L)));
                Canvas canvas = b31.a;
                drawable.draw(a31VarA.a);
                return Unit.a;
            case 1:
                ((Function1) obj).invoke((ifl) obj2);
                return Unit.a;
            case 2:
                qfl qflVar = (qfl) obj2;
                cv cvVar = (u5m) obj;
                if (cvVar instanceof cv) {
                    qflVar.invoke(cvVar.o);
                    return Boolean.TRUE;
                }
                qp2.n("TextContextMenuDataNode.TraverseKey key must only be attached to instances of TextContextMenuDataNode.");
                return null;
            case 3:
                vhl vhlVar = (vhl) obj2;
                float fFloatValue = ((Float) obj).floatValue();
                p0g p0gVar = vhlVar.a;
                float fH = p0gVar.h() + fFloatValue;
                p0g p0gVar2 = vhlVar.b;
                if (fH > p0gVar2.h()) {
                    fFloatValue = p0gVar2.h() - p0gVar.h();
                } else if (fH < 0.0f) {
                    fFloatValue = -p0gVar.h();
                }
                p0gVar.i(p0gVar.h() + fFloatValue);
                return Float.valueOf(fFloatValue);
            case 4:
                tjl tjlVar = (tjl) obj2;
                rf1 rf1Var = (rf1) obj;
                ofc ofcVar = (of1) rf1Var.a;
                if (ofcVar instanceof ofc) {
                    ofc ofcVar2 = ofcVar;
                    if (ofcVar2.b == null) {
                        return rf1.a(rf1Var, new ofc(ofcVar2.a, tjlVar, ofcVar2.c), 0, 14);
                    }
                }
                if (!(ofcVar instanceof nfc)) {
                    return rf1Var;
                }
                nfc nfcVar = (nfc) ofcVar;
                return nfcVar.b == null ? rf1.a(rf1Var, new nfc(nfcVar.a, tjlVar, nfcVar.c), 0, 14) : rf1Var;
            case 5:
                dwh dwhVar = (dwh) obj;
                e2m e2mVarK = ((zwg) obj2).k();
                if (e2mVarK != null) {
                    dwhVar.b.c(e2mVarK);
                }
                dwhVar.c(kol.t);
                return Unit.a;
            case 6:
                kol kolVar = (kol) obj2;
                ((dwh) obj).b.c(new c69(kolVar.a().d.a, kolVar.a().d.b, (byte) 1));
                return Unit.a;
            case 7:
                ((atl) obj2).b.g(qcc.a);
                return Unit.a;
            case 8:
                wul wulVar = (wul) obj2;
                View view = wulVar.a;
                xul xulVar = (xul) obj;
                wulVar.b.setVisibility(xulVar.c ? 0 : 8);
                pde pdeVar = wulVar.c;
                if (view.isLayoutRequested()) {
                    view.measure(0, 0);
                    measuredHeight = view.getMeasuredHeight();
                } else {
                    measuredHeight = view.getHeight();
                }
                if (view.isLayoutRequested()) {
                    view.measure(0, 0);
                    measuredHeight2 = view.getMeasuredHeight();
                } else {
                    measuredHeight2 = view.getHeight();
                }
                xf8.F0(pdeVar, new vul(measuredHeight, view.getResources().getDimensionPixelSize(2131167744) + measuredHeight2, xulVar));
                return Unit.a;
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                ((g7m) obj2).o();
                return Unit.a;
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                ((kwl) obj2).j = null;
                return Unit.a;
            case 11:
                ((n6j) obj).a(((uj) ((y5g) obj2).i).a);
                return Unit.a;
            case 12:
                lt5 lt5Var = (lt5) obj2;
                t15 t15Var = (t15) obj;
                t15.b(t15Var, "first", lt5Var.b.getDescriptor());
                SerialDescriptor descriptor = ((KSerializer) lt5Var.c).getDescriptor();
                l08 l08Var = l08.a;
                t15Var.a("second", descriptor, l08Var);
                t15Var.a("third", ((KSerializer) lt5Var.d).getDescriptor(), l08Var);
                return Unit.a;
            case 13:
                int i = UninstallActivity.e;
                ((UninstallActivity) obj2).startActivity((Intent) obj);
                return Unit.a;
            case 14:
                ((w6j) obj2).e = (String) obj;
                return Unit.a;
            case 15:
                ((p7l) obj2).invoke();
                return Unit.a;
            case 16:
                return ((SharedPreferences) ((hlm) obj2).c.getValue()).getString("uid", null);
            case 17:
                ((qfl) obj2).invoke((String) obj);
                return Unit.a;
            case SizeUtil.textSize0_1 /* 18 */:
                return Boolean.valueOf(((SettingsManager) obj2).i("ga_usage_statistics"));
            case 19:
                fp1 fp1Var = (hjf) obj2;
                mlm mlmVarN = w1h.n(fp1Var);
                boolean z = mlmVarN.b;
                boolean z2 = mlmVarN.a;
                if (z2 && z) {
                    return Unit.a;
                }
                try {
                    Locale locale = wwc.a;
                    nhj nhjVarI = w1h.i(fp1Var, locale);
                    Context contextH = wwc.h(fp1Var, locale);
                    if (!z2) {
                        phj.u(contextH, Collections.singletonList(nhjVarI));
                    }
                    if (!z) {
                        phj.O(contextH, Collections.singletonList(nhjVarI));
                    }
                    String string = locale.toString();
                    SharedPreferences.Editor editorEdit = fp1Var.getSharedPreferences("uninstall_survey", 0).edit();
                    editorEdit.putString("uninstall_shortcut_last_locale", string);
                    editorEdit.apply();
                } catch (IllegalArgumentException | IllegalStateException unused) {
                }
                return Unit.a;
            case SizeUtil.textSize0 /* 20 */:
                fd4 fd4Var = (fd4) obj;
                qe4 qe4Var = ((ysm) obj2).a;
                synchronized (qe4Var.c) {
                    if (qe4Var.d) {
                        throw new IllegalStateException("Check failed.");
                    }
                    StringBuilder sb = new StringBuilder("CameraGraph-");
                    bf2 bf2Var = ld4.b;
                    bf2Var.getClass();
                    sb.append(bf2.b.incrementAndGet(bf2Var));
                    nd4VarC = qe4Var.c(fd4Var, new ld4(sb.toString()));
                }
                return nd4VarC;
            case 21:
                ukn uknVar = (ukn) obj2;
                boolean z3 = !uknVar.I;
                uknVar.I = z3;
                qkn qknVar = uknVar.D;
                if (qknVar != null) {
                    qknVar.c(z3);
                }
                return Unit.a;
            case SizeUtil.textSize1 /* 22 */:
                s4i s4iVar = (s4i) obj;
                jmn jmnVar = (jmn) ((jl6) obj2).g;
                if (s4iVar == s4i.a) {
                    jmnVar.I0(jmnVar.z.j);
                }
                if (s4iVar == s4i.c) {
                    jmnVar.I.a(jmnVar.requireActivity(), o3i.WALLPAPER_GALLERY, zj6.b.g);
                }
                return Unit.a;
            case 23:
                String str = (String) obj;
                r9i r9iVar = ((WeatherWidgetActivity) obj2).X;
                ((WebcoreRpcBridge) (r9iVar != null ? r9iVar : null).d).a(str);
                return Unit.a;
            case SizeUtil.textSize2 /* 24 */:
                r2n r2nVar = (r2n) obj2;
                orb orbVar = (orb) obj;
                if (orbVar.a.has("error")) {
                    orb orbVarC = orbVar.c("error");
                    r2nVar.n(new rw7(new cqb(orbVarC.a.getInt("code"), orbVarC.e(Constants.Params.MESSAGE))));
                } else {
                    r2nVar.n(new sw7(Unit.a));
                }
                return Unit.a;
            case 25:
                srn srnVar = (srn) obj2;
                ye yeVar = (ye) obj;
                ?? r1 = srnVar.a;
                yw3 yw3Var = new yw3(r1);
                wth wthVar = new wth((BrowserActivity) r1);
                String[] strArr = OperaApplication.K;
                return new ue(r1, yeVar, yw3Var, wthVar, ((OperaApplication) r1.getApplication()).I(), (orm) srnVar.c.get(), new avj((byte) 9), te.Bo);
            case 26:
                dwn dwnVar = (dwn) obj2;
                Throwable th = (Throwable) obj;
                hzc hzcVarC = hzc.c.c("RemoteNode");
                String str2 = hzcVarC.b;
                eaj eajVar = eaj.b;
                if (hzcVarC.a.a.compareTo(eajVar) <= 0) {
                    hzcVarC.b(eajVar, str2, "Closing WS session", th);
                }
                dwnVar.d.invoke(dwnVar);
                na2.B(dwnVar.b, (CoroutineContext) null, (rx5) null, new zhl((byte) 7, (mt5) null, dwnVar), 3);
                return Unit.a;
            case 27:
                return new ci((kxn) obj2, (byte) 15);
            case 28:
                int i2 = WelcomeActivity.w;
                ((WelcomeActivity) obj2).R((u65) obj);
                return Unit.a;
            default:
                ((Callback) ((yzn) obj2).l.get()).run((u65) obj);
                return Unit.a;
        }
    }
}
