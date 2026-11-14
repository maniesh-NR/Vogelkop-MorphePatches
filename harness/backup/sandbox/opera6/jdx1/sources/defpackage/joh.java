package defpackage;

import ads_mobile_sdk.a42;
import ads_mobile_sdk.bw2;
import ads_mobile_sdk.z32;
import android.R;
import android.app.Activity;
import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.pm.ActivityInfo;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.usercentrics.sdk.ui.components.UCImageView;
import com.usercentrics.sdk.ui.components.UCTextView;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class joh {
    public static final l68 a(bza bzaVar, Throwable th) {
        if (th instanceof g4f) {
            bzaVar.getClass();
            zya zyaVar = bzaVar.q;
            zyaVar.getClass();
            zyaVar.getClass();
        } else {
            bzaVar.q.getClass();
        }
        return new l68(null, bzaVar, th);
    }

    public static a42 b(prb prbVar) {
        try {
            ftj ftjVar = z32.a;
            int iA = bw2.a(prbVar, "impression_prerequisite", 0);
            ftjVar.getClass();
            z32 z32Var = iA != 0 ? iA != 1 ? iA != 2 ? z32.b : z32.d : z32.c : z32.b;
            int iA2 = bw2.a(prbVar, "click_prerequisite", 0);
            return new a42(z32Var, iA2 != 0 ? iA2 != 1 ? iA2 != 2 ? z32.b : z32.d : z32.c : z32.b, bw2.a(prbVar, "notification_flow_enabled", false));
        } catch (Exception e) {
            ArrayList arrayList = w8h.a(e).s;
            String message = e.getMessage();
            if (message == null) {
                message = e.getClass().getName();
            }
            arrayList.add(message);
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x001a, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String c(ads_mobile_sdk.xi r3, java.lang.String r4, java.lang.String r5) {
        /*
            java.util.Map r3 = r3.r()
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r5 = r5.toLowerCase(r0)
            java.lang.Object r3 = r3.get(r5)
            ads_mobile_sdk.d9 r3 = (ads_mobile_sdk.d9) r3
            if (r3 == 0) goto L90
            flp r3 = r3.o()
            java.util.Iterator r3 = r3.iterator()
        L1a:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L90
            java.lang.Object r5 = r3.next()
            ads_mobile_sdk.z8 r5 = (ads_mobile_sdk.z8) r5
            java.util.List r0 = r5.q()
            boolean r1 = r0 instanceof java.util.Collection
            if (r1 == 0) goto L34
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L1a
        L34:
            java.util.Iterator r0 = r0.iterator()
        L38:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1a
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            kotlin.text.Regex r2 = new kotlin.text.Regex
            r2.<init>(r1)
            java.util.Locale r1 = java.util.Locale.ROOT
            java.lang.String r1 = r4.toLowerCase(r1)
            boolean r1 = r2.j(r1)
            if (r1 == 0) goto L38
            flp r0 = r5.p$1()
            boolean r1 = r0 instanceof java.util.Collection
            if (r1 == 0) goto L63
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L85
        L63:
            java.util.Iterator r0 = r0.iterator()
        L67:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L85
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            kotlin.text.Regex r2 = new kotlin.text.Regex
            r2.<init>(r1)
            java.util.Locale r1 = java.util.Locale.ROOT
            java.lang.String r1 = r4.toLowerCase(r1)
            boolean r1 = r2.j(r1)
            if (r1 == 0) goto L67
            goto L1a
        L85:
            java.lang.String r3 = r5.o()
            java.util.Locale r4 = java.util.Locale.ROOT
            java.lang.String r3 = r3.toLowerCase(r4)
            return r3
        L90:
            java.lang.String r3 = ""
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.joh.c(ads_mobile_sdk.xi, java.lang.String, java.lang.String):java.lang.String");
    }

    public static String d(String str, Object... objArr) {
        int length;
        int iIndexOf;
        StringBuilder sb = new StringBuilder(str.length() + (objArr.length << 4));
        int i = 0;
        int i2 = 0;
        while (true) {
            length = objArr.length;
            if (i >= length || (iIndexOf = str.indexOf("%s", i2)) == -1) {
                break;
            }
            sb.append((CharSequence) str, i2, iIndexOf);
            sb.append(i(objArr[i]));
            i2 = iIndexOf + 2;
            i++;
        }
        sb.append((CharSequence) str, i2, str.length());
        if (i < length) {
            String str2 = " [";
            while (i < objArr.length) {
                sb.append(str2);
                sb.append(i(objArr[i]));
                i++;
                str2 = ", ";
            }
            sb.append(']');
        }
        return sb.toString();
    }

    public static final void e(afc afcVar, ufm ufmVar, zdm zdmVar) {
        Drawable drawableF = sgb.F(2131233282, afcVar.getContext());
        if (drawableF != null) {
            Integer num = ufmVar.a.b;
            if (num != null) {
                drawableF.setColorFilter(new PorterDuffColorFilter(num.intValue(), PorterDuff.Mode.SRC_IN));
            }
        } else {
            drawableF = null;
        }
        Integer num2 = zdmVar.b().e;
        if (num2 != null) {
            int iIntValue = num2.intValue();
            if (drawableF != null) {
                drawableF.setColorFilter(new PorterDuffColorFilter(iIntValue, PorterDuff.Mode.SRC_IN));
            }
        }
        UCImageView uCImageView = new UCImageView(afcVar.getContext(), (AttributeSet) null);
        int iR = (int) rm5.r(uCImageView.getContext(), 13.0f);
        uCImageView.setPaddingRelative(iR, iR, iR, iR);
        uCImageView.setOnClickListener(new pdm(zdmVar, (byte) 1));
        uCImageView.setImageDrawable(drawableF);
        TypedValue typedValue = new TypedValue();
        uCImageView.getContext().getTheme().resolveAttribute(R.attr.selectableItemBackgroundBorderless, typedValue, true);
        uCImageView.setBackgroundResource(typedValue.resourceId);
        uCImageView.setFocusable(true);
        y4h.p(uCImageView, zdmVar.j.a);
        uCImageView.post(new tcm(uCImageView, (byte) 1));
        zec zecVar = new zec(-2, -2);
        ((LinearLayout.LayoutParams) zecVar).gravity = 8388613;
        zecVar.setMarginStart(0);
        zecVar.setMarginEnd((int) rm5.r(afcVar.getContext(), 4.0f));
        afcVar.addView((View) uCImageView, (ViewGroup.LayoutParams) zecVar);
    }

    public static final void f(afc afcVar, ufm ufmVar, zdm zdmVar) throws Resources.NotFoundException {
        afc afcVar2 = new afc(afcVar.getContext());
        afcVar2.setOrientation(0);
        TypedValue typedValue = new TypedValue();
        afcVar2.getContext().getTheme().resolveAttribute(R.attr.selectableItemBackground, typedValue, true);
        afcVar2.setBackgroundResource(typedValue.resourceId);
        int dimensionPixelOffset = afcVar2.getResources().getDimensionPixelOffset(2131167765);
        afcVar2.setPaddingRelative(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
        afcVar2.setOnClickListener(new pdm(zdmVar, (byte) 0));
        afcVar2.setFocusable(true);
        afcVar2.post(new cbl(afcVar2, (byte) 25));
        UCTextView uCTextView = new UCTextView(afcVar.getContext(), (AttributeSet) null);
        uCTextView.setText((String) zdmVar.b.b.h);
        UCTextView.u(uCTextView, ufmVar, false, 14);
        uCTextView.setIncludeFontPadding(false);
        if (Intrinsics.a(zdmVar.b().g, Boolean.TRUE)) {
            uCTextView.setPaintFlags(uCTextView.getPaintFlags() | 8);
        }
        Integer num = zdmVar.b().e;
        if (num != null) {
            uCTextView.setTextColor(num.intValue());
        }
        Integer num2 = zdmVar.b().f;
        if (num2 != null) {
            uCTextView.setTextColor(num2.intValue());
        }
        afcVar2.addView((View) uCTextView, (ViewGroup.LayoutParams) new zec(-2, -2));
        Drawable drawableF = sgb.F(2131233280, afcVar.getContext());
        if (drawableF != null) {
            Integer num3 = ufmVar.a.b;
            if (num3 != null) {
                drawableF.setColorFilter(new PorterDuffColorFilter(num3.intValue(), PorterDuff.Mode.SRC_IN));
            }
        } else {
            drawableF = null;
        }
        Integer num4 = zdmVar.b().f;
        if (num4 != null) {
            int iIntValue = num4.intValue();
            if (drawableF != null) {
                drawableF.setColorFilter(new PorterDuffColorFilter(iIntValue, PorterDuff.Mode.SRC_IN));
            }
        }
        UCImageView uCImageView = new UCImageView(afcVar.getContext(), (AttributeSet) null);
        uCImageView.setImageDrawable(drawableF);
        uCImageView.setRotationY(TextUtils.getLayoutDirectionFromLocale(uCTextView.getTextLocale()) == 1 ? 0.0f : 180.0f);
        afcVar2.addView((View) uCImageView, (ViewGroup.LayoutParams) new zec(-2, -1));
        zec zecVar = new zec(-2, -2);
        ((LinearLayout.LayoutParams) zecVar).gravity = 8388613;
        afcVar.addView(afcVar2, zecVar);
    }

    public static final void g(ysj ysjVar, rxh rxhVar, int i, rxh rxhVar2, Function0 function0) {
        glj gljVar = new glj(rxhVar, i, rxhVar2, function0);
        ysjVar.getClass();
        ysjVar.b(gljVar, ijm.b);
    }

    public static void h(ysj ysjVar, pxh pxhVar) {
        glj gljVar = new glj(pxhVar);
        ysjVar.getClass();
        ysjVar.b(gljVar, ijm.b);
    }

    public static String i(Object obj) {
        if (obj == null) {
            return "null";
        }
        try {
            return obj.toString();
        } catch (Exception e) {
            String strK = sko.k(obj.getClass().getName(), "@", Integer.toHexString(System.identityHashCode(obj)));
            Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(strK), (Throwable) e);
            return sko.l("<", strK, " threw ", e.getClass().getName(), ">");
        }
    }

    public static void j(Closeable closeable) {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        } catch (IOException unused) {
        }
    }

    public static final long k() {
        return Thread.currentThread().getId();
    }

    public static final soi l(int i, ArrayList arrayList) {
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (((soi) arrayList.get(i2)).a == i) {
                return (soi) arrayList.get(i2);
            }
        }
        return null;
    }

    public static final l9i m(pfd pfdVar) {
        Object objP = pfdVar.p();
        if (objP instanceof l9i) {
            return (l9i) objP;
        }
        return null;
    }

    public static final njl n(f0j f0jVar) {
        Function1 function1;
        ArrayList arrayList = new ArrayList();
        Object objG = f0jVar.a.g(e0j.a);
        if (objG == null) {
            objG = null;
        }
        c8 c8Var = (c8) objG;
        if (c8Var == null || (function1 = c8Var.b) == null || !((Boolean) function1.invoke(arrayList)).booleanValue()) {
            return null;
        }
        return (njl) arrayList.get(0);
    }

    public static final float o(l9i l9iVar) {
        if (l9iVar != null) {
            return l9iVar.a;
        }
        return 0.0f;
    }

    public static final boolean p(Activity activity) {
        ActivityManager.RecentTaskInfo taskInfo;
        ComponentName componentName = null;
        try {
            List<ActivityManager.AppTask> appTasks = ((ActivityManager) activity.getSystemService("activity")).getAppTasks();
            if (!appTasks.isEmpty() && (taskInfo = appTasks.get(0).getTaskInfo()) != null) {
                componentName = taskInfo.topActivity;
            }
        } catch (RuntimeException unused) {
        }
        if (!Intrinsics.a(activity.getComponentName(), componentName)) {
            ActivityInfo activityInfoL = Build.VERSION.SDK_INT >= 33 ? t8.l(activity) : activity.getPackageManager().getActivityInfo(activity.getComponentName(), 0);
            if (activityInfoL == null || componentName == null || !Intrinsics.a(activityInfoL.targetActivity, componentName.getClassName())) {
                return false;
            }
        }
        return true;
    }

    public static void q(String str) {
        wjh wjhVar = ujm.a;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        ReentrantReadWriteLock reentrantReadWriteLock = (ReentrantReadWriteLock) wjhVar.b;
        reentrantReadWriteLock.readLock().lock();
        try {
            ke4 ke4Var = (ke4) wjhVar.f;
            if (ke4Var != null) {
                ke4Var.g(jElapsedRealtime, str);
                return;
            }
            reentrantReadWriteLock.readLock().unlock();
            reentrantReadWriteLock.writeLock().lock();
            try {
                if (((ke4) wjhVar.f) == null) {
                    if (((ArrayList) wjhVar.e).size() < 256) {
                        ((ArrayList) wjhVar.e).add(new i84(str, jElapsedRealtime));
                    }
                } else {
                    reentrantReadWriteLock.readLock().lock();
                    try {
                        ((ke4) wjhVar.f).g(jElapsedRealtime, str);
                    } finally {
                    }
                }
            } finally {
                reentrantReadWriteLock.writeLock().unlock();
            }
        } finally {
        }
    }

    public static final c6n r(nc1 nc1Var, int i) {
        Object next;
        Iterator it = ((HashMap) nc1Var.c).entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((m3c) ((Map.Entry) next).getKey()).b == i) {
                break;
            }
        }
        Map.Entry entry = (Map.Entry) next;
        if (entry != null) {
            return (c6n) entry.getValue();
        }
        return null;
    }

    public static final String s(int i) {
        if (i == 0) {
            return "android.widget.Button";
        }
        if (i == 1) {
            return "android.widget.CheckBox";
        }
        if (i == 3) {
            return "android.widget.RadioButton";
        }
        if (i == 5) {
            return "android.widget.ImageView";
        }
        if (i == 6) {
            return "android.widget.Spinner";
        }
        if (i == 7) {
            return "android.widget.NumberPicker";
        }
        return null;
    }
}
