package defpackage;

import J.N;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Animatable2;
import android.net.Uri;
import android.util.Pair;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.d;
import androidx.vectordrawable.graphics.drawable.Animatable2Compat;
import com.leanplum.utils.SizeUtil;
import com.opera.android.FullscreenWebActivity;
import com.opera.android.OperaApplication;
import com.opera.android.browser.BannerBlockerHelper;
import com.opera.android.startup.WelcomeActivity;
import com.opera.api.Callback;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import org.chromium.ui.base.Clipboard;

/* loaded from: classes.dex */
public final /* synthetic */ class vk2 implements Callback {
    public final /* synthetic */ byte a;

    public /* synthetic */ vk2(byte b) {
        this.a = b;
    }

    public /* synthetic */ vk2(Object obj, byte b) {
        this.a = b;
    }

    private final void a(Object obj) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.opera.api.Callback
    public final void run(Object obj) {
        Pair pair;
        byte b = 7;
        double dQ = 0.0d;
        int i = 1;
        switch (this.a) {
            case 0:
                ((Animatable) obj).start();
                return;
            case 1:
                ((Animatable) obj).stop();
                return;
            case 2:
                Animatable2Compat animatable2Compat = (Animatable) obj;
                if (animatable2Compat instanceof Animatable2Compat) {
                    animatable2Compat.registerAnimationCallback(zk2.a);
                    return;
                } else {
                    if (animatable2Compat instanceof Animatable2) {
                        ((Animatable2) animatable2Compat).registerAnimationCallback(yk2.a);
                        return;
                    }
                    return;
                }
            case 3:
                String str = (String) obj;
                if (str.isEmpty()) {
                    BannerBlockerHelper.c = 1;
                    return;
                } else {
                    BannerBlockerHelper.c = Arrays.binarySearch(BannerBlockerHelper.b, str) < 0 ? 2 : 3;
                    return;
                }
            case 4:
                c5k c5kVar = (c5k) ((o8k) obj);
                c5kVar.c.d.c(c5kVar.M);
                ac8.d(c5kVar.E);
                c5kVar.y.H(c5kVar.D);
                bx8 bx8Var = c5kVar.A;
                bx8Var.getClass();
                dg7 dg7Var = new dg7(bx8Var, (byte) 17);
                ArrayList arrayList = bx8Var.a;
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj2 = arrayList.get(i2);
                    i2++;
                    xw8 xw8Var = ((zw8) obj2).b;
                    if (xw8Var != null && xw8.class.isAssignableFrom(xw8.class)) {
                        dg7Var.run(xw8Var);
                    }
                }
                bx8Var.n.f();
                bx8Var.a.clear();
                c5kVar.t.g = null;
                c5kVar.z.c.c(c5kVar);
                cv8 cv8Var = c5kVar.q;
                qie qieVar = cv8Var.g;
                cv8Var.n.p(cv8Var.o);
                cv8Var.c.J = null;
                pr prVar = cv8Var.v;
                ((ode) prVar.d).p(cv8Var.C);
                RecyclerView recyclerView = cv8Var.e;
                recyclerView.q0(cv8Var.r);
                recyclerView.y0((d) null);
                cv8Var.q.f();
                cv8Var.p.onDestroy();
                ((pde) prVar.b).p((hr8) prVar.e);
                ((pde) prVar.c).p((hr8) prVar.f);
                c5kVar.j.H(c5kVar);
                v4k v4kVar = c5kVar.J;
                v4kVar.b.l.D.c(v4kVar);
                x4k x4kVar = c5kVar.L;
                ow8 ow8Var = x4kVar.b;
                if (ow8Var != null) {
                    ow8Var.unregisterAdapterDataObserver(x4kVar);
                    x4kVar.b = null;
                }
                if (x4kVar.c) {
                    vml.c(new mni(x4kVar, (byte) 22));
                    x4kVar.c = false;
                }
                c5kVar.P.b();
                c5kVar.X.d(c5kVar.Y);
                c5kVar.g.r(og.a);
                return;
            case 5:
                return;
            case 6:
                ac8.a(obj);
                return;
            case 7:
                return;
            case 8:
                View view = (View) obj;
                String[] strArr = OperaApplication.K;
                wsf wsfVar = ((OperaApplication) view.getContext().getApplicationContext()).L().g;
                wsfVar.a(new vsf(wsfVar, kl0.h, null == true ? 1 : 0));
                FullscreenWebActivity.z0(view.getContext(), "https://www.opera.com/privacy", new rxh(2132021379));
                return;
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                Clipboard.getInstance().e((Uri) obj);
                return;
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                ((Boolean) obj).getClass();
                return;
            case 11:
                try {
                    ((View) obj).getContext().startActivity(new Intent("android.intent.action.VIEW").setData(Uri.parse("https://play.google.com/store")).setPackage("com.android.vending").putExtra("com.opera.android.extra.DO_NOT_INTERCEPT", true));
                    return;
                } catch (ActivityNotFoundException unused) {
                    return;
                }
            case 12:
                vx3 vx3VarA = ay3.a((String) obj, lqm.t, false);
                vx3VarA.c(true);
                vx3VarA.c = 1;
                am2.v(vx3VarA);
                return;
            case 13:
                return;
            case 14:
                int i3 = ((q43) obj).a;
                return;
            case 15:
                N.MLWmh7HR(((Boolean) obj).booleanValue());
                return;
            case 16:
                mrk mrkVar = ((zqi) obj).b;
                fe5 fe5Var = mrkVar.u;
                fe5Var.d = true;
                fe5Var.b();
                j55 j55Var = mrkVar.K;
                j55Var.f.removePrimaryClipChangedListener(j55Var);
                j55Var.d.getViewTreeObserver().removeOnWindowFocusChangeListener(j55Var.q);
                mrkVar.H.H(mrkVar.I);
                rqk rqkVar = mrkVar.D;
                rqkVar.getClass();
                ava.a.c(rqkVar);
                qt8 qt8Var = mrkVar.L;
                ro9 ro9Var = (ro9) qt8Var.g;
                ro9Var.d = null;
                w6j w6jVar = (w6j) ro9Var.c;
                if (w6jVar != null) {
                    w6jVar.b();
                }
                wcd wcdVar = (wcd) qt8Var.e;
                wcdVar.b.p(wcdVar.f);
                h42 h42Var = wcdVar.g;
                d3g d3gVar = wcdVar.d;
                h42Var.p(d3gVar);
                long j = d3gVar.a;
                if (j != 0) {
                    N.Mby5wR8C(j);
                    d3gVar.a = 0L;
                    d3gVar.b = false;
                    return;
                }
                return;
            case 17:
                String[] strArr2 = OperaApplication.K;
                vml.e(new rl((byte) 24));
                ks3.D((Throwable) obj);
                return;
            case SizeUtil.textSize0_1 /* 18 */:
                pne pneVar = (pne) obj;
                List list = pneVar.c;
                String str2 = pneVar.a;
                if (list.isEmpty() || str2.isEmpty()) {
                    return;
                }
                int size2 = list.size();
                String[] strArr3 = new String[size2];
                for (int i4 = 0; i4 < size2; i4++) {
                    strArr3[i4] = "sha256/" + ((String) list.get(i4));
                }
                N.M6aqNNMf(str2, strArr3);
                return;
            case 19:
                return;
            case SizeUtil.textSize0 /* 20 */:
                return;
            case 21:
                return;
            case SizeUtil.textSize1 /* 22 */:
                kqm kqmVar = (kqm) obj;
                ArrayList arrayListA = kqmVar.d.a();
                if (arrayListA.size() < 3) {
                    pair = new Pair(Collections.EMPTY_LIST, Double.valueOf(0.0d));
                } else {
                    ArrayList arrayList2 = new ArrayList();
                    long jLongValue = ((Long) arrayListA.get(0)).longValue();
                    double d = 0.0d;
                    while (i < arrayListA.size()) {
                        long jLongValue2 = ((Long) arrayListA.get(i)).longValue();
                        double d2 = (jLongValue2 - jLongValue) / 3600000.0d;
                        arrayList2.add(Double.valueOf(d2));
                        d += d2;
                        i++;
                        jLongValue = jLongValue2;
                    }
                    pair = new Pair(arrayList2, Double.valueOf(d));
                }
                List list2 = (List) pair.first;
                double dDoubleValue = ((Double) pair.second).doubleValue();
                if (!list2.isEmpty()) {
                    double dLongValue = (r2.c - ((Long) sfe.c0(r2.a)).longValue()) / 3600000.0d;
                    double size3 = dDoubleValue / list2.size();
                    Iterator it = list2.iterator();
                    double dPow = 0.0d;
                    while (it.hasNext()) {
                        dPow += Math.pow(((Double) it.next()).doubleValue() - size3, 2.0d);
                        dQ = dQ;
                    }
                    double d3 = dQ;
                    double dMax = Math.max(Math.sqrt(dPow / list2.size()), 1.0E-6d);
                    if (dMax <= d3) {
                        throw new h0f(zwc.i, Double.valueOf(dMax), 0);
                    }
                    wp8.c(dMax, (double[]) null);
                    wp8.c(6.283185307179586d, (double[]) null);
                    double d4 = dLongValue - 0.5d;
                    double d5 = dLongValue + 0.5d;
                    if (d4 > d5) {
                        throw new o4f(zwc.f, Double.valueOf(d4), Double.valueOf(d5));
                    }
                    double d6 = dMax * b0f.a;
                    dQ = x1p.q((d4 - size3) / d6, (d5 - size3) / d6) * 0.5d;
                }
                double dB = dQ * r2.b();
                kqmVar.g = dB;
                ListIterator listIterator = kqmVar.b.listIterator();
                while (listIterator.hasNext()) {
                    dB += ((kqm) listIterator.next()).h;
                }
                kqmVar.h = dB;
                return;
            case 23:
                kqm kqmVar2 = (kqm) obj;
                ArrayList arrayList3 = kqmVar2.b;
                ArrayList arrayList4 = kqmVar2.b;
                if (arrayList3.isEmpty()) {
                    return;
                }
                bxl bxlVar = new bxl((byte) 15);
                ListIterator listIterator2 = arrayList4.listIterator();
                while (listIterator2.hasNext()) {
                    kqm kqmVar3 = (kqm) listIterator2.next();
                    if (bxlVar.test(kqmVar3)) {
                        ipm ipmVar = kqmVar2.d;
                        ipm ipmVar2 = kqmVar3.d;
                        ipmVar.a.addAll(ipmVar2.a);
                        ipmVar.d = true;
                        ipmVar.f += ipmVar2.f;
                    }
                }
                sfe.A0(arrayList4, new f15(bxlVar, b));
                return;
            case SizeUtil.textSize2 /* 24 */:
                kqm kqmVar4 = (kqm) obj;
                ArrayList arrayList5 = kqmVar4.b;
                ArrayList arrayList6 = kqmVar4.b;
                if (arrayList5.isEmpty()) {
                    return;
                }
                ListIterator listIterator3 = arrayList6.listIterator();
                while (listIterator3.hasNext()) {
                    dQ += ((kqm) listIterator3.next()).h;
                }
                b5i b5iVar = new b5i((dQ / arrayList6.size()) * 0.1d, (byte) 2);
                ListIterator listIterator4 = arrayList6.listIterator();
                while (listIterator4.hasNext()) {
                    kqm kqmVar5 = (kqm) listIterator4.next();
                    if (b5iVar.test(kqmVar5)) {
                        kqmVar4.g += kqmVar5.h;
                    }
                }
                sfe.A0(arrayList6, new f15(b5iVar, b));
                return;
            case 25:
                return;
            case 26:
                return;
            default:
                ((Boolean) obj).getClass();
                int i5 = WelcomeActivity.w;
                return;
        }
    }
}
