package defpackage;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import android.util.Rational;
import android.util.Size;
import android.view.textclassifier.SelectionEvent;
import android.view.textclassifier.TextClassification;
import android.view.textclassifier.TextClassifier;
import android.view.textclassifier.TextSelection;
import android.widget.ImageView;
import android.widget.ScrollView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.a;
import androidx.fragment.app.r;
import androidx.fragment.app.w;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.leanplum.internal.Constants;
import com.leanplum.internal.RequestBuilder;
import com.opera.android.browser.BrowserUtils;
import com.opera.android.custom_views.ToolbarProgressBar;
import com.opera.android.osp.OspCollectorService;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigInteger;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.GeneralSecurityException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes.dex */
public class shf implements fie, qvi, rr9, o7h, d94, r6l {
    public static shf d;
    public Object a;
    public Object b;
    public Object c;

    public shf() {
        this.b = new Handler(Looper.getMainLooper());
        this.c = new AtomicReference();
    }

    public shf(Context context, lkk lkkVar) {
        this.b = new ArrayList();
        this.a = context.getApplicationContext();
        this.c = lkkVar;
    }

    public shf(Context context, pde pdeVar, tsd tsdVar) {
        this.a = context;
        this.b = tsdVar;
        this.c = new pde(Integer.valueOf(k()));
        a26.T(tsdVar, pdeVar, new qzg(this, (byte) 18));
    }

    public shf(ToolbarProgressBar toolbarProgressBar) {
        this.c = new n4h(this);
        this.a = toolbarProgressBar;
        this.b = new wjh(toolbarProgressBar);
        q9n.f(toolbarProgressBar, new kkf(this, (byte) 7));
    }

    public /* synthetic */ shf(Object obj, Object obj2, Object obj3) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    public shf(String str, byte b) {
        switch (b) {
            case 13:
                this.a = str;
                this.b = BrowserUtils.getEditableString(str);
                this.c = null;
                break;
            default:
                nj9 nj9Var = new nj9();
                nj9Var.l = dzd.p("video/mp2t");
                nj9Var.m = dzd.p(str);
                this.a = new oj9(nj9Var);
                break;
        }
    }

    public shf(kze kzeVar, k6l k6lVar, m3l m3lVar, Function1 function1) {
        this.a = k6lVar;
        this.b = m3lVar;
        this.c = function1;
        a26.U(k6lVar, kzeVar, new k3l(this), new dnj(this, (byte) 25));
    }

    public shf(pde pdeVar, ScrollView scrollView) {
        this.a = pdeVar;
        this.b = scrollView;
        this.c = new d8d(this, (byte) 18);
        z61 z61Var = new z61(this, (byte) 17);
        scrollView.setClipToPadding(false);
        q9n.g(scrollView, z61Var);
    }

    public shf(xd4 xd4Var, Size size) {
        Rational rational;
        this.a = xd4Var;
        xd4Var.c();
        xd4Var.j();
        if (size != null) {
            rational = new Rational(size.getWidth(), size.getHeight());
        } else {
            List listT = xd4Var.t(Constants.Crypt.KEY_LENGTH);
            if (listT.isEmpty()) {
                rational = null;
            } else {
                Size size2 = (Size) Collections.max(listT, new uc5((byte) 0, false));
                rational = new Rational(size2.getWidth(), size2.getHeight());
            }
        }
        this.b = rational;
        w5a w5aVar = new w5a();
        w5aVar.a = xd4Var.c();
        w5aVar.b = xd4Var.j();
        w5aVar.d = rational;
        w5aVar.c = rational == null || rational.getNumerator() >= rational.getDenominator();
        this.c = w5aVar;
    }

    public static HashMap A(ArrayList arrayList) {
        HashMap map = new HashMap();
        ArrayList arrayListX = x(arrayList);
        int size = arrayListX.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayListX.get(i2);
            i2++;
            map.put((Rational) obj, new ArrayList());
        }
        int size2 = arrayList.size();
        while (i < size2) {
            Object obj2 = arrayList.get(i);
            i++;
            Size size3 = (Size) obj2;
            for (Rational rational : map.keySet()) {
                if (ua2.a(size3, rational, qpj.c)) {
                    ((List) map.get(rational)).add(size3);
                }
            }
        }
        return map;
    }

    public static void J(List list, Size size, boolean z) {
        ArrayList arrayList = new ArrayList();
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            Size size3 = (Size) list.get(size2);
            if (size3.getWidth() >= size.getWidth() && size3.getHeight() >= size.getHeight()) {
                break;
            }
            arrayList.add(0, size3);
        }
        list.removeAll(arrayList);
        Collections.reverse(list);
        if (z) {
            list.addAll(arrayList);
        }
    }

    public static void K(List list, Size size, boolean z) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            Size size2 = (Size) list.get(i);
            if (size2.getWidth() <= size.getWidth() && size2.getHeight() <= size.getHeight()) {
                break;
            }
            arrayList.add(0, size2);
        }
        list.removeAll(arrayList);
        if (z) {
            list.addAll(arrayList);
        }
    }

    public static void M(ImageView imageView, int i, boolean z) {
        oel.s.getClass();
        int i2 = ab5.f(i) >= 0.5d ? -16777216 : -1;
        if (!z) {
            int i3 = i2;
            i2 = i;
            i = i3;
        }
        imageView.getDrawable().setTint(i2);
        imageView.getBackground().setTint(i);
    }

    public static Object d(Task task) throws IOException {
        try {
            return Tasks.await(task, 30L, TimeUnit.SECONDS);
        } catch (InterruptedException | TimeoutException e) {
            throw new IOException("SERVICE_NOT_AVAILABLE", e);
        } catch (ExecutionException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof IOException) {
                throw ((IOException) cause);
            }
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            t3p.r(e2);
            return null;
        }
    }

    public static shf o(SharedPreferences sharedPreferences, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        shf shfVar = new shf();
        shfVar.b = new ArrayDeque();
        shfVar.a = sharedPreferences;
        shfVar.c = scheduledThreadPoolExecutor;
        synchronized (((ArrayDeque) shfVar.b)) {
            ((ArrayDeque) shfVar.b).clear();
            String string = ((SharedPreferences) shfVar.a).getString("topic_operation_queue", "");
            if (TextUtils.isEmpty(string) || !string.contains(",")) {
                return shfVar;
            }
            String[] strArrSplit = string.split(",", -1);
            int length = strArrSplit.length;
            for (String str : strArrSplit) {
                if (!TextUtils.isEmpty(str)) {
                    ((ArrayDeque) shfVar.b).add(str);
                }
            }
            return shfVar;
        }
    }

    public static zcm s(arg argVar, vzk vzkVar) {
        ArrayList arrayListU = yi4.u(argVar.e);
        if (arrayListU.isEmpty()) {
            return null;
        }
        vz vzVar = (vz) ((j1c) vzkVar.b).a;
        return new zcm(vzVar.b, vzVar.a, (lem) null, (ArrayList) null, arrayListU, 44);
    }

    public static zcm t(arg argVar, vzk vzkVar) {
        ArrayList arrayListU = yi4.u(argVar.g);
        if (arrayListU.isEmpty()) {
            return null;
        }
        vz vzVar = (vz) ((j1c) vzkVar.b).c;
        return new zcm(vzVar.b, vzVar.a, (lem) null, (ArrayList) null, arrayListU, 44);
    }

    public static zcm u(arg argVar, vzk vzkVar) {
        ArrayList arrayListU = yi4.u(argVar.h);
        if (arrayListU.isEmpty()) {
            return null;
        }
        return new zcm((String) ((j1c) vzkVar.b).d, (String) null, (lem) null, (ArrayList) null, arrayListU, 46);
    }

    public static xcm v(arg argVar, vzk vzkVar) {
        yqg yqgVar = argVar.o;
        ArrayList arrayList = yqgVar != null ? yqgVar.a : null;
        if (arrayList == null || arrayList.isEmpty()) {
            return null;
        }
        String str = ((vz) ((j1c) vzkVar.b).f).b;
        tcd tcdVar = new tcd(arrayList, (byte) 1);
        ArrayList arrayList2 = new ArrayList(k95.o(tcdVar, 10));
        q1i it = tcdVar.iterator();
        while (true) {
            ListIterator listIterator = (ListIterator) it.b;
            if (!listIterator.hasPrevious()) {
                ne5 ne5Var = (ne5) vzkVar.a;
                return new xcm(str, (String) ne5Var.c, (String) ne5Var.b, arrayList2);
            }
            hqg hqgVar = (hqg) listIterator.previous();
            arrayList2.add(new jcm(hqgVar.a, hqgVar.c, hqgVar.b));
        }
    }

    public static zcm w(arg argVar, vzk vzkVar) {
        StringBuilder sb = new StringBuilder();
        uqg uqgVar = argVar.j;
        String str = uqgVar != null ? uqgVar.c : null;
        if (str != null && !StringsKt.N(str)) {
            sb.append(str);
        }
        String str2 = uqgVar != null ? uqgVar.a : null;
        if (str2 != null && !StringsKt.N(str2)) {
            if (sb.length() > 0) {
                sb.append("\n");
            }
            sb.append(str2);
        }
        String string = sb.toString();
        if (StringsKt.N(string)) {
            return null;
        }
        return new zcm((String) ((j1c) vzkVar.b).h, string, (lem) null, (ArrayList) null, (List) null, 60);
    }

    public static ArrayList x(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(ua2.a);
        arrayList2.add(ua2.c);
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            Size size2 = (Size) obj;
            Rational rational = new Rational(size2.getWidth(), size2.getHeight());
            if (!arrayList2.contains(rational)) {
                int size3 = arrayList2.size();
                int i2 = 0;
                while (true) {
                    if (i2 >= size3) {
                        arrayList2.add(rational);
                        break;
                    }
                    Object obj2 = arrayList2.get(i2);
                    i2++;
                    if (ua2.a(size2, (Rational) obj2, qpj.c)) {
                        break;
                    }
                }
            }
        }
        return arrayList2;
    }

    public static Rational z(int i, boolean z) {
        if (i == -1 || i == 0) {
            return z ? ua2.a : ua2.b;
        }
        if (i != 1) {
            return null;
        }
        return z ? ua2.c : ua2.d;
    }

    public final void B(SelectionEvent selectionEvent) {
        ((TextClassifier) this.b).onSelectionEvent(selectionEvent);
    }

    public final boolean C(Integer num) {
        w wVar = (w) this.a;
        int iJ = wVar.J();
        if (iJ > 0) {
            int i = iJ - 1;
            int iIntValue = num != null ? num.intValue() : i;
            if (iJ > iIntValue) {
                ArrayList arrayList = new ArrayList();
                int i2 = wVar.I(iIntValue).v;
                for (int i3 = iIntValue; i3 < i; i3++) {
                    Fragment fragmentE = wVar.E(wVar.I(i3).v);
                    if (fragmentE != null) {
                        arrayList.add(fragmentE);
                    }
                }
                for (int i4 = iIntValue - 1; i4 >= 0; i4--) {
                    a aVarI = wVar.I(i4);
                    if (((Boolean) ((lrk) this.b).invoke(aVarI)).booleanValue()) {
                        break;
                    }
                    i2 = aVarI.v;
                    Fragment fragmentF = wVar.F(((ym9) aVarI).k);
                    if (fragmentF != null) {
                        arrayList.add(fragmentF);
                    }
                }
                p7l p7lVar = (p7l) this.c;
                if (arrayList.isEmpty()) {
                    wVar.W(i2, false);
                    p7lVar.invoke();
                    return true;
                }
                a aVar = new a(wVar);
                ((ym9) aVar).h = 0;
                int size = arrayList.size();
                int i5 = 0;
                while (i5 < size) {
                    Object obj = arrayList.get(i5);
                    i5++;
                    aVar.m((Fragment) obj);
                }
                br brVar = new br((Object) this, i2, (byte) 23);
                if (((ym9) aVar).i) {
                    qp2.n("This transaction is already being added to the back stack");
                    return false;
                }
                ((ym9) aVar).j = false;
                ArrayList arrayList2 = ((ym9) aVar).s;
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                    ((ym9) aVar).s = arrayList2;
                }
                arrayList2.add(brVar);
                aVar.h();
                p7lVar.invoke();
                return true;
            }
        }
        return false;
    }

    public final void D(String str, int i, int i2, vyi vyiVar) {
        TextClassification textClassification;
        if (((TextClassifier) this.b) != null) {
            if (!((izi) this.c).b(i, str)) {
                p();
                return;
            }
            int[] iArr = new int[2];
            if (!((izi) this.c).a(i, str.length() + i, iArr)) {
                p();
                return;
            }
            if (vyiVar == null || (textClassification = vyiVar.f) == null) {
                B(SelectionEvent.createSelectionActionEvent(iArr[0], iArr[1], i2));
            } else {
                B(SelectionEvent.createSelectionActionEvent(iArr[0], iArr[1], i2, textClassification));
            }
            if (SelectionEvent.isTerminal(i2)) {
                p();
            }
        }
    }

    public final void E(String str, int i, vyi vyiVar) {
        if (((TextClassifier) this.b) == null) {
            return;
        }
        if (!((izi) this.c).b(i, str)) {
            p();
            return;
        }
        int[] iArr = new int[2];
        if (!((izi) this.c).a(i, str.length() + i, iArr)) {
            p();
            return;
        }
        if (vyiVar != null) {
            TextSelection textSelection = vyiVar.g;
            if (textSelection != null) {
                B(SelectionEvent.createSelectionModifiedEvent(iArr[0], iArr[1], textSelection));
                return;
            }
            TextClassification textClassification = vyiVar.f;
            if (textClassification != null) {
                B(SelectionEvent.createSelectionModifiedEvent(iArr[0], iArr[1], textClassification));
                return;
            }
        }
        B(SelectionEvent.createSelectionModifiedEvent(iArr[0], iArr[1]));
    }

    /* JADX WARN: Finally extract failed */
    public final void F(String str, String str2, String str3, String str4) throws IOException {
        r49 r49Var = (r49) this.b;
        if (str2 == null || str3 == null) {
            s49.m("FIS auth token or FIS ID is empty");
            return;
        }
        r49Var.a();
        j59 j59Var = r49Var.c;
        String str5 = j59Var.h;
        r49Var.a();
        String str6 = j59Var.a;
        if (str5 == null) {
            s49.m("Project ID or API Key is missing");
            return;
        }
        URL url = new URL(p3p.n(z1m.n("https://fcmregistrations.googleapis.com/v1/projects/", str5, "/registrations/", str3, "/topicSubscriptions/"), str, ":", str4));
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            url.toString();
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setRequestMethod(RequestBuilder.POST);
        httpURLConnection.setRequestProperty("x-goog-api-key", str6);
        httpURLConnection.setRequestProperty("x-goog-firebase-installations-auth", str2);
        httpURLConnection.setDoOutput(false);
        try {
            try {
                int responseCode = httpURLConnection.getResponseCode();
                String responseMessage = httpURLConnection.getResponseMessage();
                try {
                    InputStream inputStream = httpURLConnection.getInputStream();
                    if (inputStream != null) {
                        inputStream.close();
                    }
                } catch (IOException unused) {
                }
                try {
                    InputStream errorStream = httpURLConnection.getErrorStream();
                    if (errorStream != null) {
                        errorStream.close();
                    }
                } catch (IOException unused2) {
                }
                httpURLConnection.disconnect();
                if (responseCode < 200 || responseCode >= 300) {
                    if (responseCode == 404 || responseCode == 403) {
                        s49.m(p3p.w("Topic ", str4, " failed: ", responseMessage));
                        return;
                    }
                    if (responseCode >= 500) {
                        s49.m("INTERNAL_SERVER_ERROR");
                        return;
                    }
                    throw new IOException("Topic " + str4 + " failed with status: " + responseCode);
                }
            } catch (Throwable th) {
                try {
                    InputStream inputStream2 = httpURLConnection.getInputStream();
                    if (inputStream2 != null) {
                        inputStream2.close();
                    }
                } catch (IOException unused3) {
                }
                try {
                    InputStream errorStream2 = httpURLConnection.getErrorStream();
                    if (errorStream2 != null) {
                        errorStream2.close();
                    }
                } catch (IOException unused4) {
                }
                httpURLConnection.disconnect();
                throw th;
            }
        } catch (IOException e) {
            throw new IOException("SERVICE_NOT_AVAILABLE", e);
        }
    }

    public final void G(int i, long j) {
        ObjectAnimator objectAnimator;
        n4h n4hVar = (n4h) this.c;
        if (j == 0) {
            n4hVar.getClass();
            vml.a(n4hVar);
            n4hVar.a = -1;
            n4hVar.b = 0;
            ToolbarProgressBar toolbarProgressBar = (ToolbarProgressBar) this.a;
            toolbarProgressBar.a = false;
            toolbarProgressBar.setProgress(i);
            return;
        }
        n4hVar.getClass();
        vml.a(n4hVar);
        n4hVar.b = 0;
        n4hVar.a = i;
        ToolbarProgressBar toolbarProgressBar2 = (ToolbarProgressBar) n4hVar.c.a;
        if (toolbarProgressBar2.getProgress() > 0 || toolbarProgressBar2.isIndeterminate() || ((objectAnimator = toolbarProgressBar2.f) != null && objectAnimator.isStarted())) {
            n4hVar.run();
        } else {
            vml.d(n4hVar, j);
        }
    }

    public final void H(byte[] bArr) {
        Message messageObtain = Message.obtain((Handler) null, 2);
        Bundle bundle = new Bundle();
        bundle.putByteArray("com.opera.android.browser.DATA_VALUE", bArr);
        messageObtain.setData(bundle);
        I(messageObtain);
    }

    public final void I(Message message) {
        message.arg1 = ((lkk) this.c).a;
        Intent intent = new Intent("com.opera.android.osp.action.OSP_MSG");
        intent.putExtra("com.opera.android.osp.extra.MSG_DATA", message);
        ilf.a((Context) this.a, OspCollectorService.class, 1003, intent);
    }

    public final zcm L(zqg zqgVar) {
        hrg hrgVar = (hrg) zqgVar.b;
        ArrayList arrayList = new ArrayList();
        grg grgVar = hrgVar.o;
        if (grgVar != null) {
            arrayList.add(new lem(grgVar.a, new m53(this, grgVar, (byte) 12)));
        }
        xqg xqgVar = hrgVar.p;
        if (xqgVar != null) {
            arrayList.add(new lem(xqgVar.a, new m53(this, xqgVar, (byte) 13)));
        }
        return new zcm(zqgVar.a, hrgVar.n, (lem) null, arrayList, (List) null, 20);
    }

    public final void N(r rVar) {
        psf psfVar;
        synchronized (((ArrayList) this.b)) {
            ArrayList arrayList = (ArrayList) this.b;
            int size = arrayList.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    psfVar = null;
                    break;
                }
                Object obj = arrayList.get(i);
                i++;
                psfVar = (psf) obj;
                if (psfVar.c == rVar) {
                    break;
                }
            }
            if (psfVar == null) {
                return;
            }
            ((ArrayList) this.b).remove(psfVar);
            psfVar.b = false;
            psfVar.c.unbindService(psfVar);
        }
    }

    public final void O() {
        pde pdeVar = (pde) this.b;
        ArrayList arrayList = (ArrayList) this.c;
        int size = arrayList.size();
        final byte b = 0;
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            qck qckVar = (qck) obj;
            qckVar.a.p(qckVar.b);
        }
        arrayList.clear();
        Object objG = null;
        for (Fragment fragment : ((w) this.a).c.f()) {
            if (fragment != null) {
                if (fragment instanceof eak) {
                    eak eakVar = (eak) fragment;
                    ikc ikcVarT = eakVar.T();
                    hze hzeVar = new hze(eakVar.T(), new Function1(this) { // from class: ock
                        public final /* synthetic */ shf b;

                        {
                            this.b = this;
                        }

                        public final Object invoke(Object obj2) {
                            byte b2 = b;
                            shf shfVar = this.b;
                            switch (b2) {
                                case 0:
                                    shfVar.O();
                                    break;
                                default:
                                    shfVar.O();
                                    break;
                            }
                            return Unit.a;
                        }
                    });
                    arrayList.add(new qck(ikcVarT, hzeVar));
                    ikcVarT.k(hzeVar);
                    kl0 kl0Var = (kl0) eakVar.T().g();
                    if (kl0Var != null) {
                        objG = kl0Var;
                    }
                } else if (fragment instanceof x65) {
                    tsd tsdVarB = xf8.B(xf8.V(((x65) fragment).o, new r4k((byte) 5)));
                    final byte b2 = 1;
                    hze hzeVar2 = new hze(tsdVarB, new Function1(this) { // from class: ock
                        public final /* synthetic */ shf b;

                        {
                            this.b = this;
                        }

                        public final Object invoke(Object obj2) {
                            byte b22 = b2;
                            shf shfVar = this.b;
                            switch (b22) {
                                case 0:
                                    shfVar.O();
                                    break;
                                default:
                                    shfVar.O();
                                    break;
                            }
                            return Unit.a;
                        }
                    });
                    arrayList.add(new qck(tsdVarB, hzeVar2));
                    tsdVarB.k(hzeVar2);
                    objG = tsdVarB.g();
                }
            }
        }
        if (Intrinsics.a(objG, pdeVar.g())) {
            return;
        }
        pdeVar.r(objG);
    }

    public final void P(long j, boolean z) {
        Message messageObtain = Message.obtain((Handler) null, 3);
        messageObtain.arg2 = z ? 1 : 0;
        Bundle bundle = new Bundle();
        bundle.putLong("com.opera.android.browser.DATA_VALUE", j);
        messageObtain.setData(bundle);
        I(messageObtain);
    }

    public final void Q() {
        wjh wjhVar = (wjh) this.b;
        Context context = ((ToolbarProgressBar) this.a).getContext();
        ((hr5) wjhVar.f).getClass();
        int iL = hr5.l(context);
        int iT = f03.t(2130969343, context, 2131102491);
        ((GradientDrawable) wjhVar.b).setColor(iL);
        ((GradientDrawable) wjhVar.c).setColor(iT);
        ((q4h) wjhVar.d).setColor(iL);
        ((GradientDrawable) wjhVar.e).setColor(iT);
    }

    public final void R() {
        k6l k6lVar = (k6l) this.a;
        b2l b2lVar = k6lVar.o;
        int iS = k6lVar.s(b2lVar != null ? b2lVar.T() : p6l.a);
        ((m3l) this.b).a(iS);
        ((Function1) this.c).invoke(Integer.valueOf(iS));
    }

    public final void S(Object obj) {
        wr9 wr9Var = new wr9(this, obj, (byte) 19);
        Handler handler = (Handler) this.b;
        handler.post(wr9Var);
        Runnable runnable = (Runnable) ((AtomicReference) this.c).getAndSet(wr9Var);
        if (runnable != null) {
            handler.removeCallbacks(runnable);
        }
    }

    public final void a(g1g g1gVar) {
        long jD;
        long j;
        ((pql) this.b).getClass();
        String str = tym.a;
        pql pqlVar = (pql) this.b;
        synchronized (pqlVar) {
            long j2 = pqlVar.c;
            jD = j2 != -9223372036854775807L ? j2 + pqlVar.b : pqlVar.d();
        }
        pql pqlVar2 = (pql) this.b;
        synchronized (pqlVar2) {
            j = pqlVar2.b;
        }
        if (jD == -9223372036854775807L || j == -9223372036854775807L) {
            return;
        }
        oj9 oj9Var = (oj9) this.a;
        if (j != oj9Var.s) {
            nj9 nj9VarA = oj9Var.a();
            nj9VarA.r = j;
            oj9 oj9Var2 = new oj9(nj9VarA);
            this.a = oj9Var2;
            ((hyl) this.c).g(oj9Var2);
        }
        int iA = g1gVar.a();
        ((hyl) this.c).f(iA, g1gVar);
        ((hyl) this.c).a(jD, 1, iA, 0, (gyl) null);
    }

    public final void b() {
        nh4 nh4Var = (nh4) this.a;
        p0i p0iVar = t0i.b;
        nh4Var.resumeWith(Boolean.FALSE);
        ((deg) this.b).a((ImageView) this.c);
    }

    public final void c() {
        ((bp) this.a).W();
    }

    public final void e(pql pqlVar, en8 en8Var, s7m s7mVar) {
        this.b = pqlVar;
        s7mVar.a();
        s7mVar.b();
        hyl hylVarTrack = en8Var.track(s7mVar.d, 5);
        this.c = hylVarTrack;
        hylVarTrack.g((oj9) this.a);
    }

    public final void f(r rVar) {
        psf psfVar;
        synchronized (((ArrayList) this.b)) {
            psfVar = new psf(rVar);
            ((ArrayList) this.b).add(psfVar);
        }
        psfVar.b = true;
        r rVar2 = psfVar.c;
        rVar2.bindService(new Intent((Context) rVar2, (Class<?>) OspCollectorService.class), psfVar, 1);
    }

    public final void g(cm cmVar) {
        ((rhf) this.b).h(cmVar, v50.b);
    }

    public final Object get() {
        return new x77((Context) ((qh) this.a).a, (ydi) ((o7h) this.b).get(), (no2) ((s16) this.c).get(), false, (byte) 18);
    }

    @Override // defpackage.r6l
    public final pxh h() {
        ArrayList arrayList = (ArrayList) this.c;
        return new txh(new Object[]{Integer.valueOf(arrayList.size())}, 2131886149, arrayList.size());
    }

    public final dbi i() throws GeneralSecurityException {
        m54 m54VarA;
        if (((vai) this.a) == null) {
            t3p.w("Cannot build without parameters");
            return null;
        }
        BigInteger bigInteger = (BigInteger) this.b;
        if (bigInteger == null) {
            t3p.w("Cannot build without modulus");
            return null;
        }
        int iBitLength = bigInteger.bitLength();
        vai vaiVar = (vai) this.a;
        int i = vaiVar.a;
        if (iBitLength != i) {
            throw new GeneralSecurityException(sko.h(iBitLength, i, "Got modulus size ", ", but parameters requires modulus size "));
        }
        if (vaiVar.a() && ((Integer) this.c) == null) {
            t3p.w("Cannot create key without ID requirement with parameters with ID requirement");
            return null;
        }
        if (!((vai) this.a).a() && ((Integer) this.c) != null) {
            t3p.w("Cannot create key with ID requirement with parameters without ID requirement");
            return null;
        }
        uai uaiVar = ((vai) this.a).c;
        if (uaiVar == uai.e) {
            m54VarA = juf.a;
        } else if (uaiVar == uai.d || uaiVar == uai.c) {
            m54VarA = juf.a(((Integer) this.c).intValue());
        } else {
            if (uaiVar != uai.b) {
                j9h.u(((vai) this.a).c, "Unknown RsaSsaPssParameters.Variant: ");
                return null;
            }
            m54VarA = juf.b(((Integer) this.c).intValue());
        }
        return new dbi((vai) this.a, (BigInteger) this.b, m54VarA, (Integer) this.c);
    }

    public final String j(long j, long j2, String str, int i) {
        ArrayList arrayList = (ArrayList) this.c;
        ArrayList arrayList2 = (ArrayList) this.b;
        StringBuilder sb = new StringBuilder();
        int i2 = 0;
        while (true) {
            int size = arrayList2.size();
            ArrayList arrayList3 = (ArrayList) this.a;
            if (i2 >= size) {
                sb.append((String) arrayList3.get(arrayList2.size()));
                return sb.toString();
            }
            sb.append((String) arrayList3.get(i2));
            if (((Integer) arrayList2.get(i2)).intValue() == 1) {
                sb.append(str);
            } else if (((Integer) arrayList2.get(i2)).intValue() == 2) {
                sb.append(String.format(Locale.US, (String) arrayList.get(i2), Long.valueOf(j)));
            } else if (((Integer) arrayList2.get(i2)).intValue() == 3) {
                sb.append(String.format(Locale.US, (String) arrayList.get(i2), Integer.valueOf(i)));
            } else if (((Integer) arrayList2.get(i2)).intValue() == 4) {
                sb.append(String.format(Locale.US, (String) arrayList.get(i2), Long.valueOf(j2)));
            }
            i2++;
        }
    }

    public final int k() throws Resources.NotFoundException {
        int dimensionPixelSize;
        Context context = (Context) this.a;
        Resources resources = context.getResources();
        int iWidth = ((kl5) ((tsd) this.b).g()).b.width();
        int iOrdinal = ddh.t(iWidth, context).ordinal();
        if (iOrdinal == 0) {
            dimensionPixelSize = resources.getDimensionPixelSize(2131167607);
        } else if (iOrdinal == 1) {
            dimensionPixelSize = resources.getDimensionPixelSize(2131167609);
        } else {
            if (iOrdinal != 2 && iOrdinal != 3) {
                h9o.p();
                return 0;
            }
            dimensionPixelSize = resources.getDimensionPixelSize(2131167608);
        }
        int dimensionPixelSize2 = (iWidth - resources.getDimensionPixelSize(2131167606)) / 2;
        int iW = f03.w(2130970851, context, 0);
        if (dimensionPixelSize2 < iW) {
            dimensionPixelSize2 = iW;
        }
        return dimensionPixelSize < dimensionPixelSize2 ? dimensionPixelSize2 : dimensionPixelSize;
    }

    @Override // defpackage.r6l
    public final void l() {
        fnh fnhVar = (fnh) ((Function0) this.b).invoke();
        k6l k6lVar = (k6l) this.a;
        h6l h6lVar = h6l.b;
        k6lVar.h(h6lVar);
        try {
            ArrayList arrayList = (ArrayList) this.c;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                int i2 = i + 1;
                w6l w6lVar = (w6l) arrayList.get(i);
                int iA = w6lVar.a();
                int size2 = k6lVar.b.size();
                int i3 = iA > size2 ? size2 : iA;
                char c = w6lVar instanceof u6l ? (char) 0 : w6lVar instanceof v6l ? (char) 1 : (char) 65534;
                if (c == 0) {
                    vx3 vx3VarA = ay3.a(((u6l) w6lVar).b, lqm.d, true);
                    vx3VarA.c(true);
                    vx3VarA.j = i3;
                    vx3VarA.e(true);
                    vx3VarA.h = ((u6l) w6lVar).c;
                    vx3VarA.d = 1;
                    vx3VarA.d(false);
                    vx3VarA.f = false;
                    ac8.a(new ay3(vx3VarA));
                } else {
                    if (c != 1) {
                        throw new oye();
                    }
                    fnhVar.a(((v6l) w6lVar).b, ((v6l) w6lVar).c, ((v6l) w6lVar).d, i3, false);
                }
                i = i2;
            }
            exg.d(k6lVar);
        } finally {
            k6lVar.n(h6lVar);
        }
    }

    public final void m(fvh fvhVar, String str, b94 b94Var, int i) {
        j7c.q(fvhVar, (t9f) ((ii) this.c).get()).enqueue(new pyl(b94Var, str, i, this, fvhVar));
    }

    public final void n(u5 u5Var) {
        HashSet hashSet = (HashSet) this.c;
        ArrayList arrayList = (ArrayList) this.b;
        if (arrayList.contains(u5Var)) {
            return;
        }
        if (hashSet.contains(u5Var)) {
            pza.i(hashSet, "Cyclic dependency chain found: ");
            return;
        }
        hashSet.add(u5Var);
        u5Var.b(this);
        hashSet.remove(u5Var);
        if (arrayList.contains(u5Var)) {
            return;
        }
        if (gw5.class.isAssignableFrom(u5Var.getClass())) {
            arrayList.add(0, u5Var);
        } else {
            arrayList.add(u5Var);
        }
    }

    public final void onAdClicked() {
        ((bp) this.a).V();
    }

    public final void onAdLoaded(Object obj) {
        Uri uri;
        Uri uri2;
        bie bieVar = (bie) obj;
        rhf rhfVar = (rhf) this.b;
        String str = rhfVar.c;
        dl dlVar = rhfVar.d;
        int i = oo8.s + 1;
        oo8.s = i;
        bp bpVar = (bp) this.a;
        oo8 oo8Var = (oo8) this.c;
        i3j i3jVar = oo8Var.h;
        ap apVar = oo8Var.i;
        c4p c4pVarJ = bieVar.b().j();
        String str2 = c4pVarJ != null ? (String) c4pVarJ.i.getValue() : null;
        if (str2 == null) {
            str2 = "";
        }
        String strF = bieVar.f();
        if (strF == null) {
            strF = "";
        }
        String strC = bieVar.c();
        String str3 = strC != null ? strC : "";
        qhe qheVar = (qhe) bieVar.e.getValue();
        String string = (qheVar == null || (uri2 = qheVar.a) == null) ? null : uri2.toString();
        qhe qheVar2 = (qhe) bieVar.d.getValue();
        String string2 = (qheVar2 == null || (uri = qheVar2.a) == null) ? null : uri.toString();
        c4p c4pVarJ2 = bieVar.b().j();
        rhfVar.d(new gnf(str2, strF, str3, string, string2, str, dlVar, c4pVarJ2 != null ? (String) c4pVarJ2.n.getValue() : null, bieVar, i, bpVar, i3jVar, apVar));
    }

    @Override // defpackage.rr9
    public final void onFailure(Throwable th) {
        ((xwg) this.c).e = null;
        ArrayList arrayList = (ArrayList) this.a;
        if (arrayList.isEmpty()) {
            return;
        }
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((ud4) this.b).v((rb4) obj);
        }
        arrayList.clear();
    }

    public final void onSuccess() {
        nh4 nh4Var = (nh4) this.a;
        p0i p0iVar = t0i.b;
        nh4Var.resumeWith(Boolean.TRUE);
        ((deg) this.b).a((ImageView) this.c);
    }

    @Override // defpackage.rr9
    public final void onSuccess(Object obj) {
        ((xwg) this.c).e = null;
    }

    public final void p() {
        TextClassifier textClassifier = (TextClassifier) this.b;
        if (textClassifier == null || textClassifier.isDestroyed()) {
            return;
        }
        ((TextClassifier) this.b).destroy();
        this.b = null;
    }

    public final void q() {
        Runnable runnable;
        if (!Intrinsics.a(Looper.myLooper(), Looper.getMainLooper()) || (runnable = (Runnable) ((AtomicReference) this.c).getAndSet(null)) == null) {
            return;
        }
        runnable.run();
    }

    public final void r(boolean z) {
        ToolbarProgressBar toolbarProgressBar = (ToolbarProgressBar) this.a;
        n4h n4hVar = (n4h) this.c;
        n4hVar.getClass();
        vml.a(n4hVar);
        n4hVar.a = -1;
        n4hVar.b = 0;
        if (!z || toolbarProgressBar.isIndeterminate()) {
            toolbarProgressBar.d();
        } else {
            if (n4hVar.a != -1) {
                n4hVar.b = 100;
                return;
            }
            ToolbarProgressBar toolbarProgressBar2 = (ToolbarProgressBar) n4hVar.c.a;
            toolbarProgressBar2.a = true;
            toolbarProgressBar2.setProgress(100);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.ArrayList y(qsm r15) {
        /*
            Method dump skipped, instructions count: 905
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.shf.y(qsm):java.util.ArrayList");
    }
}
