package defpackage;

import J.N;
import android.app.job.JobParameters;
import android.app.job.JobWorkItem;
import android.bluetooth.le.BluetoothLeScanner;
import android.bluetooth.le.ScanCallback;
import android.bluetooth.le.ScanFilter;
import android.bluetooth.le.ScanSettings;
import android.content.ComponentName;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.location.LocationManager;
import android.media.MediaCodec;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.util.LongSparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import androidx.cardview.widget.CardView;
import androidx.core.app.NotificationCompat;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.opera.android.bar.DimmedUrlTextView;
import com.opera.android.browser.BrowserUtils;
import com.opera.android.browser.UrlMangler;
import com.opera.android.custom_views.StylingTextView;
import com.opera.android.weather.ui.WeatherWidgetActivity;
import java.text.DateFormat;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.function.Predicate;
import org.chromium.content.browser.input.ImeAdapterImpl;

/* loaded from: classes.dex */
public final class pad implements tyi, rr9, rk8, sog, wv9, ebf, o87 {
    public static final pad d;
    public final /* synthetic */ byte a;
    public Object b;
    public Object c;

    static {
        Float fValueOf = Float.valueOf(1.0f);
        Float fValueOf2 = Float.valueOf(0.0f);
        d = new pad((Object) new lyf(fValueOf2, fValueOf2), (Object) new lyf(fValueOf, fValueOf), (byte) 1);
    }

    public pad(byte b) {
        this.a = b;
        switch (b) {
            case 13:
                this.b = new k1n(true);
                this.c = new k1n(true);
                break;
            default:
                this.b = new ArrayDeque();
                break;
        }
    }

    public /* synthetic */ pad(byte b, Object obj, Object obj2, boolean z) {
        this.a = b;
        this.c = obj;
        this.b = obj2;
    }

    public /* synthetic */ pad(byte b, boolean z) {
        this.a = b;
    }

    public pad(int i, int i2) {
        this.a = (byte) 19;
        this.b = new int[]{i, i2};
        this.c = new float[]{0.0f, 1.0f};
    }

    public pad(int i, int i2, int i3) {
        this.a = (byte) 19;
        this.b = new int[]{i, i2, i3};
        this.c = new float[]{0.0f, 0.5f, 1.0f};
    }

    public pad(JobParameters jobParameters) {
        this.a = (byte) 27;
        this.b = new Object();
        this.c = jobParameters;
    }

    public pad(BluetoothLeScanner bluetoothLeScanner) {
        this.a = (byte) 6;
        this.b = bluetoothLeScanner;
        this.c = new HashMap();
    }

    public pad(Context context) {
        this.a = (byte) 18;
        this.b = context.getApplicationContext();
        this.c = z4c.b(new al7(this, (byte) 11));
    }

    public pad(ResolveInfo resolveInfo, PackageManager packageManager) {
        this.a = (byte) 11;
        this.b = resolveInfo.loadIcon(packageManager);
        this.c = resolveInfo.loadLabel(packageManager).toString();
    }

    public pad(EditText editText) {
        this.a = (byte) 4;
        this.b = editText;
        this.c = new yqa(editText);
    }

    public pad(bm8 bm8Var) {
        this.a = (byte) 20;
        this.c = new ArrayDeque();
        this.b = bm8Var;
    }

    public pad(gid gidVar, Looper looper) {
        this.a = (byte) 22;
        this.c = gidVar;
        this.b = new Handler(looper, new cj5(this, (byte) 2));
    }

    public /* synthetic */ pad(Object obj, byte b) {
        this.a = b;
        this.c = obj;
    }

    public /* synthetic */ pad(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    public pad(ArrayList arrayList, ArrayList arrayList2) {
        this.a = (byte) 19;
        int size = arrayList.size();
        this.b = new int[size];
        this.c = new float[size];
        for (int i = 0; i < size; i++) {
            ((int[]) this.b)[i] = ((Integer) arrayList.get(i)).intValue();
            ((float[]) this.c)[i] = ((Float) arrayList2.get(i)).floatValue();
        }
    }

    public pad(sse sseVar, Context context, String str, ArrayList arrayList) {
        q0c q0cVarA;
        q0c q0cVarA2;
        this.a = (byte) 25;
        l0c l0cVarA = l0c.a(str);
        this.b = (l0cVarA == null || (q0cVarA2 = r0c.a(l0cVarA)) == null) ? null : new ate(l0cVarA, context.getString(q0cVarA2.a), context.getString(q0cVarA2.b));
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            l0c l0cVarA2 = l0c.a((String) obj);
            ate ateVar = (l0cVarA2 == null || (q0cVarA = r0c.a(l0cVarA2)) == null) ? null : new ate(l0cVarA2, context.getString(q0cVarA.a), context.getString(q0cVarA.b));
            if (ateVar != null) {
                arrayList2.add(ateVar);
            }
        }
        this.c = arrayList2;
    }

    public pad(zpa zpaVar, va0 va0Var) {
        this.a = (byte) 3;
        this.b = zpaVar;
        this.c = va0Var;
        z4c.b(new wa0(this, (byte) 0));
        z4c.b(new wa0(this, (byte) 1));
    }

    public final void A(l24 l24Var) {
        ((ArrayDeque) this.b).remove(l24Var);
        B();
    }

    public final void B() {
        ArrayDeque arrayDeque = (ArrayDeque) this.b;
        l24 l24Var = arrayDeque.isEmpty() ? null : (l24) arrayDeque.peek();
        l24 l24Var2 = (l24) this.c;
        if (l24Var != l24Var2) {
            if (l24Var2 != null) {
                l24Var2.L();
            }
            this.c = l24Var;
            if (l24Var != null) {
                l24Var.l();
            }
        }
    }

    public final JobWorkItem a() {
        synchronized (this.b) {
            JobParameters jobParameters = (JobParameters) this.c;
            if (jobParameters == null) {
                return null;
            }
            try {
                return jobParameters.dequeueWork();
            } catch (SecurityException unused) {
                jlf jlfVar = (jlf) ilf.e.get();
                if (jlfVar != null) {
                    synchronized (jlfVar.b) {
                        SharedPreferences sharedPreferences = (SharedPreferences) jlfVar.c.get();
                        sharedPreferences.edit().putInt("failure_0", sharedPreferences.getInt("failure_0", 0) + 1).apply();
                    }
                }
                return null;
            }
        }
    }

    public final tog b(tog togVar) {
        fsp fspVar;
        cq7 cq7Var = (cq7) this.b;
        j69 j69Var = togVar instanceof j69 ? (j69) togVar : null;
        int iR = lcp.r(cq7Var);
        int i = iR > 250 ? 6 : 5;
        int i2 = 1 << i;
        if (j69Var != null && (fspVar = j69Var.b) != null && fspVar.A() >= i2) {
            return j69Var;
        }
        int i3 = ((iR + i) - 1) / i;
        int i4 = i + 1;
        nq7[] nq7VarArr = new nq7[i4];
        nq7VarArr[0] = (nq7) this.c;
        for (int i5 = 1; i5 < i; i5++) {
            nq7VarArr[i5] = nq7VarArr[i5 - 1].u(i3);
        }
        nq7VarArr[i] = nq7VarArr[0].s(nq7VarArr[1]);
        cq7Var.o(nq7VarArr, 0, i4, (xf8) null);
        nq7[] nq7VarArr2 = new nq7[i2];
        nq7VarArr2[0] = nq7VarArr[0];
        for (int i6 = i - 1; i6 >= 0; i6--) {
            nq7 nq7Var = nq7VarArr[i6];
            int i7 = 1 << i6;
            for (int i8 = i7; i8 < i2; i8 += i7 << 1) {
                nq7VarArr2[i8] = nq7VarArr2[i8 - i7].a(nq7Var);
            }
        }
        cq7Var.o(nq7VarArr2, 0, i2, (xf8) null);
        j69 j69Var2 = new j69();
        j69Var2.a = null;
        j69Var2.b = null;
        j69Var2.c = -1;
        j69Var2.b = cq7Var.b(nq7VarArr2, i2);
        j69Var2.a = nq7VarArr[i];
        j69Var2.c = i;
        return j69Var2;
    }

    public final void c(nj6 nj6Var) {
        synchronized (nj6Var) {
        }
        Handler handler = (Handler) this.b;
        if (handler != null) {
            handler.post(new xa(this, nj6Var, (byte) 25));
        }
    }

    public final List d(List list) {
        return list;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(nt5 r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.po9
            if (r0 == 0) goto L13
            r0 = r6
            po9 r0 = (defpackage.po9) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L18
        L13:
            po9 r0 = new po9
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.t
            px5 r1 = px5.a
            int r2 = r0.v
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L32
            if (r2 != r4) goto L2c
            defpackage.ybh.y(r6)
            t0i r6 = (t0i) r6
            java.lang.Object r5 = r6.a
            return r5
        L2c:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r5)
            return r3
        L32:
            defpackage.ybh.y(r6)
            pv r6 = new pv
            r2 = 12
            r6.<init>(r2, r3, r5)
            r0.v = r4
            java.lang.Object r5 = defpackage.zch.A(r6, r0)
            if (r5 != r1) goto L45
            return r1
        L45:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pad.f(nt5):java.lang.Object");
    }

    public final Object g(WeatherWidgetActivity weatherWidgetActivity, mt5 mt5Var) {
        return Boolean.valueOf(((LocationManager) ((zyk) this.c).getValue()).isProviderEnabled("network"));
    }

    public final int getHeight() {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) ((nv6) this.b).a;
        ExtendedFloatingActionButton extendedFloatingActionButton2 = (ExtendedFloatingActionButton) this.c;
        int i = extendedFloatingActionButton2.i0;
        if (i != -1) {
            return (i == 0 || i == -2) ? extendedFloatingActionButton.getMeasuredHeight() : i;
        }
        if (!(extendedFloatingActionButton2.getParent() instanceof View)) {
            return extendedFloatingActionButton.getMeasuredHeight();
        }
        View view = (View) extendedFloatingActionButton2.getParent();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null || layoutParams.height != -2) {
            return (view.getHeight() - ((!(extendedFloatingActionButton2.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) || (marginLayoutParams = (ViewGroup.MarginLayoutParams) extendedFloatingActionButton2.getLayoutParams()) == null) ? 0 : marginLayoutParams.topMargin + marginLayoutParams.bottomMargin)) - (view.getPaddingBottom() + view.getPaddingTop());
        }
        return extendedFloatingActionButton.getMeasuredHeight();
    }

    public final int getPaddingEnd() {
        return ((ExtendedFloatingActionButton) this.c).c0;
    }

    public final int getPaddingStart() {
        return ((ExtendedFloatingActionButton) this.c).b0;
    }

    public final int getWidth() {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        nv6 nv6Var = (nv6) this.b;
        ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) this.c;
        if (!(extendedFloatingActionButton.getParent() instanceof View)) {
            return nv6Var.getWidth();
        }
        View view = (View) extendedFloatingActionButton.getParent();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null || layoutParams.width != -2) {
            return (view.getWidth() - ((!(extendedFloatingActionButton.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) || (marginLayoutParams = (ViewGroup.MarginLayoutParams) extendedFloatingActionButton.getLayoutParams()) == null) ? 0 : marginLayoutParams.leftMargin + marginLayoutParams.rightMargin)) - (view.getPaddingRight() + view.getPaddingLeft());
        }
        return nv6Var.getWidth();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.util.List] */
    public final ArrayList h() throws PackageManager.NameNotFoundException {
        ?? arrayList;
        ArrayList arrayList2 = new ArrayList();
        zy9 zy9Var = (zy9) this.c;
        Context context = (Context) this.b;
        Class cls = (Class) zy9Var.a;
        Bundle bundle = null;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null) {
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, (Class<?>) cls), NotificationCompat.FLAG_HIGH_PRIORITY);
                if (serviceInfo == null) {
                    Objects.toString(cls);
                } else {
                    bundle = serviceInfo.metaData;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        if (bundle == null) {
            arrayList = Collections.EMPTY_LIST;
        } else {
            arrayList = new ArrayList();
            for (String str : bundle.keySet()) {
                if ("com.google.firebase.components.ComponentRegistrar".equals(bundle.get(str)) && str.startsWith("com.google.firebase.components:")) {
                    arrayList.add(str.substring(31));
                }
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new de5((String) it.next(), (byte) 0));
        }
        return arrayList2;
    }

    public final KeyListener i(KeyListener keyListener) {
        if ((keyListener instanceof NumberKeyListener) || (keyListener instanceof gy7)) {
            return keyListener;
        }
        if (keyListener == null) {
            return null;
        }
        return keyListener instanceof NumberKeyListener ? keyListener : new gy7(keyListener);
    }

    /* JADX WARN: Type inference failed for: r9v5, types: [android.widget.TextView, com.opera.android.bar.DimmedUrlTextView] */
    public final void j(ViewStub viewStub, final abf abfVar) throws NumberFormatException {
        long j;
        String str = ((gbf) this.c).j.t.b.c;
        Objects.requireNonNull(abfVar);
        Object obj = new Object() { // from class: bbf
        };
        String externalUrlWithFallback = BrowserUtils.getExternalUrlWithFallback(str);
        String strA = UrlMangler.a(str, "offline_page_timestamp");
        if (strA != null) {
            try {
                j = Long.parseLong(strA);
            } catch (NumberFormatException unused) {
            }
        } else {
            j = 0;
        }
        hv3 hv3Var = (hv3) this.b;
        Context context = viewStub.getContext();
        viewStub.setLayoutResource(2131559167);
        View viewInflate = viewStub.inflate();
        int i = 2131362494;
        StylingTextView stylingTextViewJ = w1h.j(2131362494, viewInflate);
        if (stylingTextViewJ != null) {
            i = 2131362594;
            if (w1h.j(2131362594, viewInflate) != null) {
                i = 2131363747;
                MaterialButton materialButtonJ = w1h.j(2131363747, viewInflate);
                if (materialButtonJ != null) {
                    i = 2131364466;
                    if (w1h.j(2131364466, viewInflate) != null) {
                        i = 2131363525;
                        if (w1h.j(2131363525, viewInflate) != null) {
                            i = 2131364964;
                            ?? r9 = (DimmedUrlTextView) w1h.j(2131364964, viewInflate);
                            if (r9 != 0) {
                                String string = j == 0 ? "" : context.getString(2132020145, DateFormat.getDateInstance(2, Locale.getDefault()).format(new Date(j)));
                                String str2 = (String) N.MR6Af3ZS(BrowserUtils.getExternalUrlWithFallback(externalUrlWithFallback), 0);
                                j97 j97Var = r9.m;
                                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str2);
                                Uri uri = Uri.parse(str2);
                                String strH = wqm.h(uri);
                                if (!TextUtils.isEmpty(strH)) {
                                    int iIndexOf = str2.indexOf(strH);
                                    if (iIndexOf >= 0) {
                                        spannableStringBuilder.setSpan(j97Var, 0, iIndexOf, 33);
                                        if (!"content".equals(uri.getScheme())) {
                                            spannableStringBuilder.setSpan(r9.n, strH.length() + iIndexOf, str2.length(), 33);
                                        }
                                    }
                                } else if (!TextUtils.isEmpty(uri.getScheme())) {
                                    spannableStringBuilder.setSpan(j97Var, 0, uri.getScheme().length() + 1, 33);
                                }
                                r9.setText(spannableStringBuilder);
                                stylingTextViewJ.setText(string);
                                materialButtonJ.setOnClickListener(new jf7(hv3Var, obj, (byte) 26));
                                return;
                            }
                        }
                    }
                }
            }
        }
        t3p.q("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }

    public final f99 k() {
        return qbe.t(ma9.b((f99) ((zyk) ((u7k) ((eq6) this.b).a).a).getValue(), new zp6((byte) 1, (mt5) null, this)));
    }

    public final boolean l() {
        return false;
    }

    public final ViewGroup.LayoutParams n() {
        int i = ((ExtendedFloatingActionButton) this.c).i0;
        if (i == 0) {
            i = -2;
        }
        return new ViewGroup.LayoutParams(-1, i);
    }

    public final void o(AttributeSet attributeSet, int i) {
        int i2 = 0;
        TypedArray typedArrayObtainStyledAttributes = ((EditText) this.b).getContext().obtainStyledAttributes(attributeSet, zhh.j, i, 0);
        try {
            boolean z = typedArrayObtainStyledAttributes.hasValue(14) ? typedArrayObtainStyledAttributes.getBoolean(14, true) : true;
            typedArrayObtainStyledAttributes.recycle();
            jz7 jz7Var = (jz7) ((yqa) this.c).c;
            if (jz7Var.c != z) {
                if (jz7Var.b != null) {
                    xx7 xx7VarA = xx7.a();
                    iz7 iz7Var = jz7Var.b;
                    t72 t72Var = xx7VarA.b;
                    jpo.m(iz7Var, "initCallback cannot be null");
                    ReentrantReadWriteLock reentrantReadWriteLock = xx7VarA.a;
                    reentrantReadWriteLock.writeLock().lock();
                    try {
                        ArrayList arrayList = new ArrayList();
                        t72Var.getClass();
                        m72 m72Var = new m72(t72Var);
                        while (m72Var.hasNext()) {
                            vx7 vx7Var = (vx7) m72Var.next();
                            if (vx7Var.a == iz7Var) {
                                arrayList.add(vx7Var);
                            }
                        }
                        int size = arrayList.size();
                        while (i2 < size) {
                            Object obj = arrayList.get(i2);
                            i2++;
                            t72Var.remove((vx7) obj);
                        }
                    } finally {
                        reentrantReadWriteLock.writeLock().unlock();
                    }
                }
                jz7Var.c = z;
                if (z) {
                    jz7.a(jz7Var.a, xx7.a().c());
                }
            }
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final void onFailure(Throwable th) {
        f28 f28Var = ((d28) this.c).l;
        f28Var.m.remove((q18) this.b);
        if (!(th instanceof MediaCodec.CodecException)) {
            f28Var.a(0, th.getMessage(), th);
        } else {
            MediaCodec.CodecException codecException = (MediaCodec.CodecException) th;
            f28Var.a(1, codecException.getMessage(), codecException);
        }
    }

    public final void onSuccess(Object obj) {
        ((d28) this.c).l.m.remove((q18) this.b);
    }

    public final dy7 q(InputConnection inputConnection, EditorInfo editorInfo) {
        yqa yqaVar = (yqa) this.c;
        if (inputConnection == null) {
            return null;
        }
        return inputConnection instanceof dy7 ? (dy7) inputConnection : new dy7(editorInfo, inputConnection, (EditText) yqaVar.b);
    }

    public final j87 r(List list, List list2) {
        d5g d5gVar = (d5g) this.c;
        if (d5gVar == null) {
            d5gVar = null;
        }
        d5g d5gVar2 = (d5g) this.b;
        return uup.k(new js8(d5gVar, d5gVar2 != null ? d5gVar2 : null, (byte) 1), false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:136:0x01f3, code lost:
    
        continue;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Removed duplicated region for block: B:104:0x00fa A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f3 A[Catch: IOException | XmlPullParserException -> 0x01f9, IOException | XmlPullParserException -> 0x01f9, TryCatch #0 {IOException | XmlPullParserException -> 0x01f9, blocks: (B:17:0x0054, B:24:0x0064, B:25:0x0072, B:27:0x0077, B:30:0x0081, B:38:0x009b, B:33:0x008a, B:36:0x0093, B:89:0x01f3, B:89:0x01f3, B:39:0x00a9, B:43:0x00b8, B:43:0x00b8, B:45:0x00c0, B:45:0x00c0, B:46:0x00ca, B:46:0x00ca, B:55:0x00f3, B:55:0x00f3, B:56:0x00fa, B:56:0x00fa, B:57:0x0112, B:57:0x0112, B:49:0x00d3, B:49:0x00d3, B:51:0x00db, B:51:0x00db, B:52:0x00e9, B:52:0x00e9, B:58:0x0113, B:58:0x0113, B:60:0x011b, B:60:0x011b, B:61:0x0129, B:61:0x0129, B:64:0x0133, B:64:0x0133, B:65:0x013e, B:65:0x013e, B:66:0x0156, B:66:0x0156, B:67:0x0157, B:67:0x0157, B:70:0x0161, B:70:0x0161, B:71:0x016c, B:71:0x016c, B:72:0x0184, B:72:0x0184, B:73:0x0185, B:73:0x0185, B:75:0x018d, B:75:0x018d, B:76:0x0196, B:76:0x0196, B:79:0x01a0, B:79:0x01a0, B:80:0x01aa, B:80:0x01aa, B:81:0x01c2, B:81:0x01c2, B:82:0x01c3, B:82:0x01c3, B:85:0x01cd, B:85:0x01cd, B:86:0x01d7, B:86:0x01d7, B:87:0x01ef, B:87:0x01ef, B:88:0x01f0, B:88:0x01f0), top: B:96:0x0054 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void s(android.content.Context r10, android.content.res.XmlResourceParser r11) throws org.xmlpull.v1.XmlPullParserException, java.lang.NumberFormatException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 578
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pad.s(android.content.Context, android.content.res.XmlResourceParser):void");
    }

    public final void t(l24 l24Var) {
        ((ArrayDeque) this.b).push(l24Var);
        B();
    }

    public final String toString() {
        switch (this.a) {
            case 0:
                ua7 ua7Var = new ua7(pad.class.getSimpleName());
                wad wadVar = (wad) this.b;
                if (wadVar != null) {
                    String strK0 = cqp.K0(wadVar.toString());
                    x77 x77Var = new x77((byte) 25, false);
                    ((x77) ua7Var.d).d = x77Var;
                    ua7Var.d = x77Var;
                    x77Var.c = strK0;
                    x77Var.b = "keyStrength";
                }
                if (((o58) this.c) != null) {
                    x77 x77Var2 = new x77((byte) 25, false);
                    ((x77) ua7Var.d).d = x77Var2;
                    ua7Var.d = x77Var2;
                    x77Var2.c = "keyEquivalence";
                }
                return ua7Var.toString();
            case 29:
                String strN = "[ ";
                if (((pvj) this.b) != null) {
                    for (int i = 0; i < 9; i++) {
                        strN = am2.n(new StringBuilder(strN), ((pvj) this.b).h[i], " ");
                    }
                }
                StringBuilder sbR = p3p.r(strN, "] ");
                sbR.append((pvj) this.b);
                return sbR.toString();
            default:
                return super.toString();
        }
    }

    public final void u() {
        ArrayDeque arrayDeque = (ArrayDeque) this.c;
        long jUptimeMillis = SystemClock.uptimeMillis();
        while (!arrayDeque.isEmpty() && jUptimeMillis - ((KeyEvent) arrayDeque.element()).getEventTime() >= 1000) {
            arrayDeque.remove();
        }
    }

    public final boolean v(Predicate predicate) {
        KeyEvent keyEvent;
        u();
        ArrayDeque arrayDeque = (ArrayDeque) this.c;
        Iterator it = arrayDeque.iterator();
        while (true) {
            if (!it.hasNext()) {
                keyEvent = null;
                break;
            }
            keyEvent = (KeyEvent) it.next();
            if (predicate.test(keyEvent)) {
                break;
            }
        }
        KeyEvent keyEvent2 = keyEvent;
        if (keyEvent2 == null) {
            return false;
        }
        while (!arrayDeque.isEmpty() && arrayDeque.remove() != keyEvent2) {
        }
        ImeAdapterImpl imeAdapterImpl = (ImeAdapterImpl) ((bm8) this.b).b;
        LongSparseArray longSparseArray = ImeAdapterImpl.E;
        long j = imeAdapterImpl.a;
        int iN = ImeAdapterImpl.n(keyEvent2.getMetaState());
        long eventTime = keyEvent2.getEventTime();
        long jUptimeMillis = SystemClock.uptimeMillis();
        if (eventTime > 0 && eventTime <= jUptimeMillis) {
            jUptimeMillis = eventTime;
        }
        N.M1qwlrOP(j, keyEvent2, 8, iN, jUptimeMillis, keyEvent2.getKeyCode(), keyEvent2.getScanCode(), false, keyEvent2.getUnicodeChar());
        i1 i1Var = imeAdapterImpl.C;
        if (i1Var == null) {
            return true;
        }
        i1Var.L();
        return true;
    }

    public final void w(int i, int i2, int i3, int i4) {
        CardView cardView = (CardView) this.c;
        cardView.d.set(i, i2, i3, i4);
        Rect rect = cardView.c;
        super/*android.view.View*/.setPadding(i + rect.left, i2 + rect.top, i3 + rect.right, i4 + rect.bottom);
    }

    public final List x(String str) {
        mzi mziVar;
        Context context = (Context) this.b;
        ArrayList arrayList = new ArrayList(2);
        ole oleVar = (ole) this.c;
        ue ueVar = (ue) oleVar.a;
        mzi mziVar2 = null;
        if (oleVar.E(str)) {
            if (ueVar.j.h() && oleVar.D()) {
                mziVar = new mzi(context.getResources().getString(2132021043));
                mziVar.c = 2131361893;
                mziVar.i = (byte) 1;
            } else {
                mziVar = null;
            }
            if (mziVar != null) {
                mziVar.b(89, 10);
                arrayList.add(mziVar.a());
            }
        }
        if (ueVar.k.u() && str.length() >= 2 && str.length() <= 50000 && oleVar.D()) {
            mziVar2 = new mzi(context.getResources().getString(2132017628));
            mziVar2.c = 2131364190;
            mziVar2.i = (byte) 2;
        }
        if (mziVar2 != null) {
            mziVar2.b(9, 0);
            arrayList.add(mziVar2.a());
        }
        return arrayList;
    }

    public final void y(List list, u59 u59Var) {
        ScanSettings scanSettingsBuild = new ScanSettings.Builder().setScanMode(2).build();
        ScanCallback nk3Var = new nk3(u59Var);
        ((HashMap) this.c).put(u59Var, nk3Var);
        ((BluetoothLeScanner) this.b).startScan((List<ScanFilter>) list, scanSettingsBuild, nk3Var);
    }

    public final int[] z() {
        int[] iArrM = tyi.m();
        int iL = sgb.L(7, 0, 7, iArrM);
        if (iL == -1) {
            return iArrM;
        }
        int[] iArr = new int[6];
        System.arraycopy(iArrM, 0, iArr, 0, iL);
        System.arraycopy(iArrM, iL + 1, iArr, iL, 6 - iL);
        return iArr;
    }
}
