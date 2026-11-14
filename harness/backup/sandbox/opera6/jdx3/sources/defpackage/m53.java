package defpackage;

import ads_mobile_sdk.a2;
import ads_mobile_sdk.ej1;
import ads_mobile_sdk.fw0;
import ads_mobile_sdk.gj1;
import ads_mobile_sdk.h13;
import ads_mobile_sdk.hh3;
import ads_mobile_sdk.j13;
import ads_mobile_sdk.mv0;
import ads_mobile_sdk.ob1;
import ads_mobile_sdk.ou0;
import ads_mobile_sdk.q6;
import ads_mobile_sdk.rg3;
import ads_mobile_sdk.sb0;
import ads_mobile_sdk.tu0;
import ads_mobile_sdk.uw0;
import ads_mobile_sdk.xv;
import android.app.Application;
import android.content.Context;
import android.net.Uri;
import android.util.AttributeSet;
import android.util.Size;
import android.view.View;
import androidx.core.widget.NestedScrollView;
import androidx.work.impl.WorkDatabase;
import com.leanplum.internal.Constants;
import com.leanplum.utils.SizeUtil;
import com.usercentrics.sdk.UsercentricsDialog;
import com.usercentrics.sdk.UsercentricsLayout;
import com.usercentrics.sdk.UsercentricsOptions;
import com.usercentrics.sdk.services.tcf.interfaces.TCFData;
import com.usercentrics.sdk.ui.secondLayer.component.footer.UCSecondLayerFooter;
import com.usercentrics.sdk.v2.consent.data.SaveConsentsData;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;

/* loaded from: classes.dex */
public final class m53 extends ozb implements Function0 {
    public final /* synthetic */ byte i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m53(Context context, String str) {
        super(0);
        this.i = (byte) 6;
        wjo wjoVar = wjo.REGULAR;
        this.j = context;
        this.k = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m53(Object obj, Object obj2, byte b) {
        super(0);
        this.i = b;
        this.j = obj;
        this.k = obj2;
    }

    public final Object invoke() {
        owm owmVarE;
        h13 h13Var;
        iio iioVar;
        int i = 0;
        switch (this.i) {
            case 0:
                k73 k73Var = ((o53) this.j).a;
                n53 n53Var = (n53) this.k;
                synchronized (k73Var.d) {
                    if (((LinkedHashSet) k73Var.e).remove(n53Var) && ((LinkedHashSet) k73Var.e).isEmpty()) {
                        k73Var.A();
                    }
                }
                return Unit.a;
            case 1:
                x4o x4oVar = (x4o) this.j;
                WorkDatabase workDatabase = x4oVar.c;
                fh4 fh4Var = new fh4(x4oVar, (UUID) this.k, (byte) 0);
                workDatabase.getClass();
                workDatabase.u(new j3i(fh4Var, (byte) 2));
                ymi.b(x4oVar.b, x4oVar.c, x4oVar.e);
                return Unit.a;
            case 2:
                vn5 vn5Var = (vn5) this.j;
                vn5Var.a.a(new un5(vn5Var, (SaveConsentsData) this.k, (mt5) null, (byte) 1));
                return Unit.a;
            case 3:
                ((b11) this.j).invoke((List) this.k);
                return Unit.a;
            case 4:
                ((b11) this.j).invoke((List) this.k);
                return Unit.a;
            case 5:
                Context context = (Context) ((k8) this.j).a;
                pro proVar = (pro) this.k;
                vdp vdpVar = new vdp(proVar);
                return new yoo(context, new q5p(proVar, vdpVar, wjh.i.b(context), new wtm(context, (qro) ujp.u, vdpVar)));
            case 6:
                Context context2 = (Context) this.j;
                pro proVar2 = new pro((String) this.k, sm.c, null, wjo.REGULAR);
                vdp vdpVar2 = new vdp(proVar2);
                return new o7p(context2, new q5p(proVar2, vdpVar2, wjh.i.b(context2), new wtm(context2, (qro) ydp.n, vdpVar2)));
            case 7:
                List<List> list = (List) this.j;
                ufm ufmVar = (ufm) this.k;
                ArrayList arrayList = new ArrayList(k95.o(list, 10));
                for (List<gqg> list2 : list) {
                    ArrayList arrayList2 = new ArrayList(k95.o(list2, 10));
                    for (gqg gqgVar : list2) {
                        xbm.Companion.getClass();
                        arrayList2.add(wbm.a(gqgVar, ufmVar));
                    }
                    arrayList.add(arrayList2);
                }
                return arrayList;
            case 8:
                NestedScrollView nestedScrollView = new NestedScrollView((Context) this.j, (AttributeSet) null);
                vcm vcmVar = (vcm) this.k;
                nestedScrollView.setId(2131364863);
                vcmVar.setOrientation(1);
                if (true != nestedScrollView.l) {
                    nestedScrollView.l = true;
                    nestedScrollView.requestLayout();
                }
                return nestedScrollView;
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                NestedScrollView nestedScrollView2 = new NestedScrollView((Context) this.j, (AttributeSet) null);
                udm udmVar = (udm) this.k;
                nestedScrollView2.setId(2131364863);
                udmVar.setOrientation(1);
                if (true != nestedScrollView2.l) {
                    nestedScrollView2.l = true;
                    nestedScrollView2.requestLayout();
                }
                return nestedScrollView2;
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                File file = ((UCSecondLayerFooter) this.j).u;
                ((xem) (file != null ? file : null)).f.c(((xbm) this.k).g);
                return Unit.a;
            case 11:
                ((lrk) ((shf) this.j).a).invoke((String) this.k);
                return Unit.a;
            case 12:
                ((lrk) ((shf) this.j).b).invoke((grg) this.k);
                return Unit.a;
            case 13:
                ((lrk) ((shf) this.j).c).invoke((xqg) this.k);
                return Unit.a;
            case 14:
                ((UsercentricsDialog) this.j).e();
                ((Function0) this.k).invoke();
                return Unit.a;
            case 15:
                ((UsercentricsDialog) this.j).h((UsercentricsLayout) this.k);
                return Unit.a;
            case 16:
                nwm nwmVar = nwm.a;
                s5d s5dVarC = nwm.c();
                if (s5dVarC != null && (owmVarE = s5dVarC.e()) != null) {
                    owmVarE.b("Initialize is being invoked more than once, make sure this is the intended behaviour.", (hwm) null);
                }
                nwm.a((UsercentricsOptions) this.j, (Context) this.k);
                return Unit.a;
            case 17:
                ((Function1) this.j).invoke(new fwm(new hwm("", (Throwable) this.k)));
                return Unit.a;
            case SizeUtil.textSize0_1 /* 18 */:
                ((Function1) this.j).invoke((TCFData) this.k);
                return Unit.a;
            case 19:
                a33 a33Var = (a33) ((ami) this.j).h;
                n48 n48Var = new n48((Function1) this.k, (byte) 3);
                pac pacVar = a33Var.b.b;
                a33Var.h.a(new vr(a33Var, pacVar, (mt5) null, (byte) 5)).I(new rd1(a33Var, n48Var, pacVar, (byte) 1));
                return Unit.a;
            case SizeUtil.textSize0 /* 20 */:
                fw0 fw0Var = fw0.I;
                l08 l08Var = l08.a;
                prb prbVar = (prb) this.j;
                h07 h07Var = (h07) this.k;
                rg3 rg3VarA = hh3.a(fw0Var, l08Var, true);
                try {
                    wpb wpbVarV = prbVar.v("responses");
                    prb prbVarH = !wpbVarV.a.isEmpty() ? ((pqb) wpbVarV.a.get(0)).h() : null;
                    wpb wpbVarV2 = prbVarH != null ? prbVarH.v("ad_configs") : null;
                    ArrayList arrayList3 = new ArrayList();
                    if (wpbVarV2 != null) {
                        ArrayList arrayList4 = wpbVarV2.a;
                        int size = arrayList4.size();
                        int i2 = 0;
                        int i3 = 0;
                        while (i3 < size) {
                            Object obj = arrayList4.get(i3);
                            i3++;
                            int i4 = i2 + 1;
                            if (i2 < 0) {
                                j95.n();
                                throw null;
                            }
                            List list3 = a2.D0;
                            a2 a2VarB = mfh.b(((pqb) obj).h(), i2, h07Var);
                            if (a2VarB != null) {
                                arrayList3.add(a2VarB);
                            }
                            i2 = i4;
                        }
                    }
                    xv xvVarE = ioh.e(prbVarH != null ? prbVarH.w("common") : null);
                    pqb pqbVarU = prbVar.u("actions");
                    wpb wpbVarG = pqbVarU != null ? pqbVarU.g() : null;
                    ArrayList arrayList5 = new ArrayList();
                    if (wpbVarG != null) {
                        ArrayList arrayList6 = wpbVarG.a;
                        int size2 = arrayList6.size();
                        int i5 = 0;
                        while (i5 < size2) {
                            Object obj2 = arrayList6.get(i5);
                            int i6 = i5 + 1;
                            int i7 = i + 1;
                            if (i < 0) {
                                j95.n();
                                throw null;
                            }
                            prb prbVarH2 = ((pqb) obj2).h();
                            try {
                                String strN = prbVarH2.u(Constants.Params.NAME).n();
                                pqb pqbVarU2 = prbVarH2.u(Constants.Params.INFO);
                                h13Var = new h13(pqbVarU2 != null ? pqbVarU2.h() : null, strN);
                            } catch (Exception e) {
                                ArrayList arrayList7 = w8h.a(e).s;
                                String message = e.getMessage();
                                if (message == null) {
                                    message = e.getClass().getName();
                                }
                                arrayList7.add(message);
                                h13Var = null;
                            }
                            if (h13Var != null) {
                                arrayList5.add(h13Var);
                            }
                            i5 = i6;
                            i = i7;
                        }
                    }
                    j13 j13Var = new j13(arrayList3, xvVarE, arrayList5);
                    rg3VarA.close();
                    return j13Var;
                } catch (Throwable th) {
                    try {
                        rg3VarA.b(th);
                        if (th instanceof iyo) {
                            throw th;
                        }
                        rg3VarA.a(th);
                        if (th instanceof kql) {
                            throw new uw0((kql) th);
                        }
                        if (th instanceof CancellationException) {
                            throw new ou0(th);
                        }
                        if (th instanceof mv0) {
                            throw th;
                        }
                        throw new tu0(th);
                    } catch (Throwable th2) {
                        try {
                            throw th2;
                        } catch (Throwable th3) {
                            vtp.v(rg3VarA, th2);
                            throw th3;
                        }
                    }
                }
            case 21:
                gj1 gj1Var = (gj1) this.j;
                j7p j7pVar = (j7p) this.k;
                Iterator it = gj1Var.e.values().iterator();
                while (it.hasNext()) {
                    ((q6) it.next()).a();
                }
                Timer timer = new Timer();
                timer.schedule((TimerTask) new ej1(gj1Var, j7pVar, timer), 1000L);
                return Unit.a;
            case SizeUtil.textSize1 /* 22 */:
                ((q6) this.j).a((View) this.k);
                return Unit.a;
            case 23:
                ob1 ob1Var = jso.a;
                WeakReference weakReference = new WeakReference((Context) this.j);
                Application application = (Application) this.k;
                return new sb0(application, application, weakReference);
            case SizeUtil.textSize2 /* 24 */:
                return "Trapped exception (" + ((String) this.j) + "): " + ((Throwable) this.k);
            case 25:
                return "Unsampled trapped exception (" + ((String) this.j) + "): " + ((Exception) this.k);
            case 26:
                return "Saved " + ((String) this.j) + " to " + ((Uri) this.k);
            case 27:
                Size size3 = (Size) this.j;
                if (size3 == null) {
                    return null;
                }
                Pair pair = (Pair) ((tqo) this.k).d.getValue();
                int iIntValue = ((Number) pair.a).intValue();
                int iIntValue2 = ((Number) pair.b).intValue();
                if (size3.getWidth() > 0) {
                    size3.getHeight();
                }
                return elp.c(size3, iIntValue, iIntValue2);
            case 28:
                y2p y2pVar = (y2p) this.j;
                String str = (String) y2pVar.z.p.getValue();
                if (str == null) {
                    return null;
                }
                String str2 = !StringsKt.N(str) ? str : null;
                if (str2 == null || (iioVar = ((oho) this.k).l.e) == null) {
                    return null;
                }
                ylp ylpVar = new ylp(y2pVar.w, y2pVar.b, y2pVar.c, y2pVar.d, y2pVar.e, y2pVar.f, y2pVar.g, y2pVar.a, str2, iioVar, false, 1024);
                File file2 = y2pVar.x;
                ylpVar.x = file2 != null ? file2 : null;
                return ylpVar;
            default:
                ArrayList arrayList8 = new ArrayList();
                StringBuilder sb = new StringBuilder("/");
                a3p a3pVar = (a3p) this.j;
                arrayList8.add(new lyf(o18.p(sb, a3pVar.l, '/'), new nwn((Context) this.k, a3pVar.a)));
                ArrayList arrayList9 = new ArrayList();
                int size4 = arrayList8.size();
                while (i < size4) {
                    Object obj3 = arrayList8.get(i);
                    i++;
                    lyf lyfVar = (lyf) obj3;
                    arrayList9.add(new own((String) lyfVar.a, (nwn) lyfVar.b));
                }
                return new pwn(arrayList9);
        }
    }
}
