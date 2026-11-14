package defpackage;

import android.R;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.pm.PackageManager;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.hardware.camera2.CameraCharacteristics;
import android.media.Image;
import android.media.ImageReader;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Trace;
import android.util.AttributeSet;
import android.util.SparseBooleanArray;
import android.view.Surface;
import android.view.View;
import android.view.WindowManager;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.fragment.app.w;
import androidx.recyclerview.widget.RecyclerView;
import com.opera.android.custom_views.ObservableEditText;
import com.opera.android.oauth2.OperaAccessTokenProvider;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.chromium.content.browser.accessibility.WebContentsAccessibilityImpl;

/* loaded from: classes.dex */
public final class rn9 implements uya, igd, rr9, qr9, xl2, cyi {
    public final /* synthetic */ byte a;
    public boolean b;
    public Object c;
    public Object d;

    public rn9(byte b) {
        this.a = b;
        switch (b) {
            case 19:
                break;
            case 26:
                this.c = Collections.newSetFromMap(new WeakHashMap());
                this.d = new ArrayList();
                break;
            default:
                this.c = new HashMap();
                break;
        }
    }

    public /* synthetic */ rn9(byte b, Object obj, Object obj2, boolean z) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.b = z;
    }

    public rn9(Context context, jf4 jf4Var) {
        this.a = (byte) 9;
        this.c = context;
        boolean z = false;
        this.b = Build.VERSION.SDK_INT >= 34 && g8.o(context) != 0;
        PackageManager packageManager = context.getPackageManager();
        Integer numB = jf4Var != null ? jf4Var.b() : null;
        boolean zHasSystemFeature = packageManager.hasSystemFeature("android.hardware.camera");
        boolean zHasSystemFeature2 = packageManager.hasSystemFeature("android.hardware.camera.front");
        boolean z2 = zHasSystemFeature && (numB == null || numB.intValue() == 1);
        if (zHasSystemFeature2 && (numB == null || numB.intValue() == 0)) {
            z = true;
        }
        this.d = new tg4(z2, z);
    }

    public rn9(Context context, wa waVar, ArrayList arrayList, boolean z, int[] iArr) {
        this.a = (byte) 29;
        this.d = waVar;
        ListView listView = new ListView(context);
        listView.setCacheColorHint(0);
        if (urj.c == null) {
            urj.c = new urj((byte) 6);
        }
        AlertDialog alertDialogCreate = new AlertDialog.Builder(context).create();
        this.c = alertDialogCreate;
        alertDialogCreate.setView(listView);
        alertDialogCreate.setCancelable(true);
        alertDialogCreate.setInverseBackgroundForced(true);
        if (z) {
            alertDialogCreate.setButton(-1, (CharSequence) alertDialogCreate.getContext().getString(R.string.ok), (DialogInterface.OnClickListener) new dyi(this, listView, (byte) 0));
            alertDialogCreate.setButton(-2, alertDialogCreate.getContext().getString(R.string.cancel), new sk(this, (byte) 11));
        }
        listView.setAdapter((ListAdapter) new cs2(alertDialogCreate.getContext(), z ? R.layout.select_dialog_multichoice : R.layout.select_dialog_singlechoice, arrayList));
        listView.setFocusableInTouchMode(true);
        if (z) {
            listView.setChoiceMode(2);
            for (int i : iArr) {
                listView.setItemChecked(i, true);
            }
        } else {
            listView.setChoiceMode(1);
            listView.setOnItemClickListener(new vy0(this, listView, (byte) 1));
            if (iArr.length > 0) {
                listView.setSelection(iArr[0]);
                listView.setItemChecked(iArr[0], true);
            }
        }
        ((AlertDialog) this.c).setOnCancelListener(new s77(this, (byte) 1));
    }

    public rn9(Bitmap bitmap, int i) {
        this.a = (byte) 15;
        this.b = bitmap.hasAlpha() && Color.alpha(bitmap.getPixel(0, 0)) < 8;
        if (i == 1) {
            int width = bitmap.getWidth() / 4;
            int height = bitmap.getHeight() / 4;
            this.c = new int[]{bitmap.getPixel(2, (bitmap.getHeight() / 2) - height), bitmap.getPixel(2, (bitmap.getHeight() / 2) + height), bitmap.getPixel((bitmap.getWidth() / 2) - width, 2), bitmap.getPixel((bitmap.getWidth() / 2) + width, 2), bitmap.getPixel(bitmap.getWidth() - 3, (bitmap.getHeight() / 2) - height), bitmap.getPixel(bitmap.getWidth() - 3, (bitmap.getHeight() / 2) + height), bitmap.getPixel((bitmap.getWidth() / 2) - width, bitmap.getHeight() - 3), bitmap.getPixel((bitmap.getWidth() / 2) + width, bitmap.getHeight() - 3)};
        } else {
            this.c = new int[]{bitmap.getPixel(0, 0), bitmap.getPixel(bitmap.getWidth() - 1, 0), bitmap.getPixel(0, bitmap.getHeight() - 1), bitmap.getPixel(bitmap.getWidth() - 1, bitmap.getHeight() - 1)};
        }
        this.d = new int[]{bitmap.getPixel(0, bitmap.getHeight() / 2), bitmap.getPixel(bitmap.getWidth() / 2, 0), bitmap.getPixel(bitmap.getWidth() - 1, bitmap.getHeight() / 2), bitmap.getPixel(bitmap.getWidth() / 2, bitmap.getHeight() - 1)};
    }

    public rn9(PointF pointF, ode odeVar) {
        this.a = (byte) 8;
        this.b = false;
        this.d = new Object();
        this.c = odeVar;
    }

    public rn9(ImageReader imageReader) {
        this.a = (byte) 4;
        this.d = new Object();
        this.b = true;
        this.c = imageReader;
    }

    public rn9(b0e b0eVar) {
        this.a = (byte) 23;
        this.d = b0eVar;
        this.c = new hpd(this, b0eVar, (byte) 8);
    }

    public rn9(bxk bxkVar) {
        this.a = (byte) 7;
        this.c = bxkVar;
        this.d = new q02(this, (byte) 21);
    }

    public rn9(fe5 fe5Var, pde pdeVar, x5f x5fVar) {
        this.a = (byte) 28;
        this.c = pdeVar;
        this.d = x5fVar;
        xf8.g0(pdeVar, fe5Var, new qzg(this, (byte) 6));
    }

    public rn9(ge4 ge4Var) {
        this.a = (byte) 14;
        this.c = ge4Var;
        int[] iArr = (int[]) ((ma4) ge4Var).c(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
        boolean z = false;
        if (iArr != null && e82.t(18, iArr) >= 0) {
            z = true;
        }
        this.b = z;
        this.d = t8.k(ge4Var);
    }

    public /* synthetic */ rn9(Object obj, Object obj2, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
    }

    public rn9(Runnable runnable, ObservableEditText observableEditText) {
        this.a = (byte) 13;
        this.b = false;
        this.c = runnable;
        this.d = observableEditText;
    }

    public rn9(String str, boolean z, j55 j55Var) {
        this.a = (byte) 10;
        this.b = z;
        this.d = j55Var;
        this.c = str;
    }

    public rn9(ArrayList arrayList, gl glVar, boolean z) {
        this.a = (byte) 3;
        this.c = arrayList == null ? null : Collections.unmodifiableList(arrayList);
        this.d = glVar;
        this.b = z;
    }

    public /* synthetic */ rn9(k24 k24Var, byte b) {
        this.a = b;
        this.c = k24Var;
    }

    public rn9(la2 la2Var) {
        this.a = (byte) 5;
        this.c = new Point();
        this.b = true;
        this.d = la2Var;
    }

    public rn9(m0e m0eVar) {
        this.a = (byte) 24;
        this.d = m0eVar;
        byte b = 10;
        this.c = new hpd(this, m0eVar, b);
        a26.T(((z5l) m0eVar.d.b).o.x, m0eVar.a, new d8d(this, b));
    }

    public rn9(npd npdVar, nod nodVar, boolean z, cig cigVar) {
        this.a = (byte) 21;
        this.d = npdVar;
        this.c = nodVar;
        this.b = z;
    }

    public rn9(qb qbVar, Function0 function0) {
        this.a = (byte) 1;
        this.d = qbVar;
        this.c = j95.j(new Function0[]{function0});
    }

    public rn9(r65 r65Var, boolean z, s65 s65Var) {
        this.a = (byte) 11;
        this.d = r65Var;
        this.b = z;
        this.c = s65Var;
    }

    public rn9(se2 se2Var, se2 se2Var2) {
        this.a = (byte) 6;
        this.c = se2Var;
        this.d = se2Var2;
        this.b = true;
    }

    public rn9(ubf ubfVar, yl2 yl2Var) {
        this.a = (byte) 25;
        this.c = yl2Var;
        this.d = ubfVar;
    }

    public rn9(boolean z) {
        this.a = (byte) 2;
        this.c = new HashMap();
        this.d = new ArrayList();
        this.b = z;
    }

    public static void P(LinkedHashSet linkedHashSet, ip7 ip7Var, qe6 qe6Var) {
        jpo.n("Cannot update already-empty constraints.", !linkedHashSet.isEmpty());
        Set setC = ((lp7) qe6Var.b).c(ip7Var);
        Set set = setC;
        if (set.isEmpty()) {
            return;
        }
        Set setN0 = CollectionsKt.n0(linkedHashSet);
        linkedHashSet.retainAll(set);
        if (linkedHashSet.isEmpty()) {
            throw new IllegalArgumentException(("Constraints of dynamic range cannot be combined with existing constraints.\nDynamic range:\n  " + ip7Var + "\nConstraints:\n  " + setC + "\nExisting constraints:\n  " + setN0).toString());
        }
    }

    public static boolean h(int i, int i2) {
        int iRed = Color.red(i) - Color.red(i2);
        int iGreen = Color.green(i) - Color.green(i2);
        int iBlue = Color.blue(i) - Color.blue(i2);
        return Math.sqrt((double) ((iBlue * iBlue) + ((iGreen * iGreen) + (iRed * iRed)))) < 16.0d;
    }

    public static boolean m(ip7 ip7Var, ip7 ip7Var2) {
        boolean zB = ip7Var2.b();
        int i = ip7Var2.a;
        if (!zB) {
            kp5.b(ip7Var2, " not actually fully specified.", "Fully specified range ");
            return false;
        }
        int i2 = ip7Var.a;
        if (i2 != 2 ? i2 == 0 || i2 == i : i != 1) {
            int i3 = ip7Var.b;
            if (i3 == 0 || i3 == ip7Var2.b) {
                return true;
            }
        }
        return false;
    }

    public static ip7 s(ip7 ip7Var, LinkedHashSet linkedHashSet, LinkedHashSet linkedHashSet2) {
        boolean zM;
        if (ip7Var.a != 1) {
            Iterator it = linkedHashSet.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                ip7 ip7Var2 = (ip7) it.next();
                int i = ip7Var2.a;
                if (!ip7Var2.b()) {
                    qp2.n("Fully specified DynamicRange must have fully defined encoding.");
                    break;
                }
                if (i != 1) {
                    if (linkedHashSet2.contains(ip7Var2)) {
                        zM = m(ip7Var, ip7Var2);
                    } else {
                        if (gyg.G(3, "CXCP")) {
                            Objects.toString(ip7Var);
                            Objects.toString(ip7Var2);
                        }
                        zM = false;
                    }
                    if (zM) {
                        return ip7Var2;
                    }
                }
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0084  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.rn9 u(defpackage.q50 r29, defpackage.iq r30, defpackage.orb r31) throws org.json.JSONException {
        /*
            Method dump skipped, instructions count: 274
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rn9.u(q50, iq, orb):rn9");
    }

    public static int[] v(ListView listView) {
        SparseBooleanArray checkedItemPositions = listView.getCheckedItemPositions();
        int i = 0;
        for (int i2 = 0; i2 < checkedItemPositions.size(); i2++) {
            if (checkedItemPositions.valueAt(i2)) {
                i++;
            }
        }
        int[] iArr = new int[i];
        int i3 = 0;
        for (int i4 = 0; i4 < checkedItemPositions.size(); i4++) {
            if (checkedItemPositions.valueAt(i4)) {
                iArr[i3] = checkedItemPositions.keyAt(i4);
                i3++;
            }
        }
        return iArr;
    }

    public static boolean x(Set set, jf4 jf4Var) {
        try {
            jf4Var.c(new LinkedHashSet(set));
            return true;
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    public final boolean A() {
        int i = 0;
        while (true) {
            int[] iArr = (int[]) this.c;
            if (i >= iArr.length) {
                return true;
            }
            if (Color.alpha(iArr[i]) < 250) {
                return false;
            }
            i++;
        }
    }

    public final void B(Context context, AttributeSet attributeSet) {
        Point point = (Point) this.c;
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, khh.d, 0, 0);
        try {
            point.x = typedArrayObtainStyledAttributes.getInt(1, 1);
            point.y = typedArrayObtainStyledAttributes.getInt(0, 1);
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public final boolean C(LinkedHashSet linkedHashSet, Set set) {
        tg4 tg4Var = (tg4) this.d;
        boolean z = tg4Var.b;
        boolean z2 = tg4Var.a;
        if (!this.b && (z2 || z)) {
            boolean zX = x(linkedHashSet, jf4.c);
            boolean zX2 = x(linkedHashSet, jf4.b);
            Set set2 = set;
            ArrayList arrayList = new ArrayList(k95.o(set2, 10));
            Iterator it = set2.iterator();
            while (it.hasNext()) {
                arrayList.add(((td4) it.next()).a());
            }
            Set setN0 = CollectionsKt.n0(arrayList);
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : linkedHashSet) {
                if (!setN0.contains(((zd4) obj).g().e())) {
                    arrayList2.add(obj);
                }
            }
            Set setN02 = CollectionsKt.n0(arrayList2);
            boolean zX3 = x(setN02, jf4.c);
            boolean zX4 = x(setN02, jf4.b);
            boolean z3 = z2 && zX && !zX3;
            boolean z4 = z && zX2 && !zX4;
            if (z3 || z4) {
                return true;
            }
        }
        return false;
    }

    public final void D(String str) {
        ArrayList arrayList = (ArrayList) this.d;
        HashMap map = (HashMap) this.c;
        zb zbVar = (zb) map.get(str);
        if (zbVar == null) {
            zbVar = new zb(str);
            map.put(str, zbVar);
        }
        zbVar.c = System.nanoTime();
        if (this.b) {
            arrayList.remove(zbVar);
            if (!arrayList.isEmpty()) {
                zb zbVar2 = (zb) am2.k(1, arrayList);
                ArrayList arrayList2 = zbVar2.b;
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                    zbVar2.b = arrayList2;
                }
                if (!arrayList2.contains(zbVar)) {
                    zbVar2.b.add(zbVar);
                }
            }
            arrayList.add(zbVar);
        }
    }

    public final void E(RecyclerView recyclerView, int i) {
        if (this.b) {
            return;
        }
        this.b = true;
        if (i != -1) {
            ((ltl) this.c).getLifecycle().a(new qn9(this, i, recyclerView));
        }
    }

    public final void F() {
        if (this.b) {
            return;
        }
        this.b = true;
        oba obaVarA = ((on9) this.d).a();
        if (obaVarA != null) {
            int[] iArr = obaVarA.a;
            if (iArr.length == 0) {
                return;
            }
            ((ltl) this.c).getLifecycle().a(new qn9(this, iArr, obaVarA.b));
        }
    }

    public final void G(int[] iArr) {
        if (this.b) {
            return;
        }
        ((wa) this.d).c(iArr);
        this.b = true;
    }

    public final boolean H(int i, int i2) {
        la2 la2Var = (la2) this.d;
        Point point = (Point) this.c;
        if (!this.b) {
            la2Var.e(i, i2);
            return false;
        }
        if (point.x == 0 || point.y == 0) {
            la2Var.e(i, i2);
            return false;
        }
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        if (mode == 0 && mode2 == 0) {
            la2Var.e(i, i2);
            return false;
        }
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int mode3 = View.MeasureSpec.getMode(i);
        int mode4 = View.MeasureSpec.getMode(i2);
        if (mode3 == 1073741824 || (mode3 == Integer.MIN_VALUE && mode4 != 1073741824)) {
            size2 = (point.y * size) / point.x;
        } else {
            size = (point.x * size2) / point.y;
        }
        la2Var.e(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        return true;
    }

    public final void I() {
        w wVar;
        if (this.b || !((ltl) this.c).getLifecycle().i.d(qcc.c) || (wVar = (w) this.d) == null) {
            return;
        }
        this.b = true;
        xih.t(wVar, false, null);
    }

    public final void J(kf0 kf0Var) {
        if (this.b) {
            return;
        }
        this.b = true;
        ((x5f) ((orm) this.c)).W(kf0Var, (mf0) this.d);
    }

    /* JADX WARN: Removed duplicated region for block: B:76:0x0191  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.LinkedHashMap K(java.util.ArrayList r18, java.util.List r19, java.util.List r20) {
        /*
            Method dump skipped, instructions count: 533
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rn9.K(java.util.ArrayList, java.util.List, java.util.List):java.util.LinkedHashMap");
    }

    public final void L() {
        boolean z;
        ArrayList arrayListY = rm5.y((Set) this.c);
        int size = arrayListY.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayListY.get(i);
            i++;
            zlj zljVar = (zlj) obj;
            if (!zljVar.e()) {
                synchronized (zljVar.b) {
                    z = zljVar.x == 6;
                }
                if (!z) {
                    zljVar.c();
                    if (this.b) {
                        ((ArrayList) this.d).add(zljVar);
                    } else {
                        zljVar.a();
                    }
                }
            }
        }
    }

    public final void M() {
        hpd hpdVar = (hpd) this.c;
        m0e m0eVar = (m0e) this.d;
        RecyclerView recyclerView = m0eVar.e;
        if (((Collection) ((z5l) m0eVar.d.b).o.x.g()).isEmpty()) {
            this.b = false;
            recyclerView.removeCallbacks(hpdVar);
        } else {
            if (this.b) {
                return;
            }
            this.b = true;
            recyclerView.postOnAnimation(hpdVar);
        }
    }

    public final void N() {
        if (this.b) {
            return;
        }
        this.b = true;
        ((b0e) this.d).h.invoke((hpd) this.c);
    }

    public final void O(ehf ehfVar) {
        OperaAccessTokenProvider operaAccessTokenProvider;
        if (this.b) {
            return;
        }
        qb qbVar = (qb) this.d;
        if (ehfVar == null) {
            qbVar.a();
            k();
            return;
        }
        esk eskVar = qbVar.g;
        if (eskVar == null || (operaAccessTokenProvider = (OperaAccessTokenProvider) eskVar.get()) == null) {
            return;
        }
        operaAccessTokenProvider.b(new mb(this, ehfVar, (byte) 0));
    }

    public final void Q(hf4 hf4Var) throws sg4 {
        tg4 tg4Var = (tg4) this.d;
        if (this.b) {
            hf4Var.c().size();
            return;
        }
        String str = Build.DEVICE;
        if (tg4Var.a) {
            try {
                jf4.c.c(hf4Var.c());
                e = null;
            } catch (RuntimeException e) {
                e = e;
            }
        } else {
            e = null;
        }
        if (tg4Var.b) {
            try {
                jf4.b.c(hf4Var.c());
            } catch (RuntimeException e2) {
                if (e == null) {
                    e = e2;
                }
            }
        }
        if (e != null) {
            throw new sg4(hf4Var.c().size(), e);
        }
    }

    public final void a(boolean z) {
        AlertDialog alertDialog = (AlertDialog) this.c;
        if (z) {
            alertDialog.cancel();
            G(null);
        } else {
            this.b = true;
            alertDialog.cancel();
        }
    }

    public final void b(ue5 ue5Var, ih5 ih5Var, int i) {
        xg5 xg5Var;
        vt9 vt9Var = (vt9) ih5Var;
        vt9Var.Y(255378977);
        int i2 = (vt9Var.h(ue5Var) ? 4 : 2) | i | (vt9Var.h(this) ? 32 : 16);
        if (vt9Var.N(i2 & 1, (i2 & 19) != 18)) {
            dg5 dg5Var = (dg5) this.d;
            boolean z = this.b;
            Object obj = hh5.a;
            if (z) {
                vt9Var.W(1608149693);
                Object objK = vt9Var.K();
                if (objK == obj) {
                    objK = new xg5();
                    vt9Var.g0(objK);
                }
                xg5Var = (xg5) objK;
                vt9Var.p(false);
            } else {
                vt9Var.W(1608221861);
                vt9Var.p(false);
                xg5Var = null;
            }
            boolean zH = vt9Var.h(this) | vt9Var.h(xg5Var);
            Object objK2 = vt9Var.K();
            if (zH || objK2 == obj) {
                objK2 = new cv2((Object) this, (Object) xg5Var, (byte) 17);
                vt9Var.g0(objK2);
            }
            rm5.b(xg5Var, (Function1) objK2, vt9Var);
            rof.a(gyg.P(1245722404, new g9(dg5Var, xg5Var, ue5Var, (byte) 9), vt9Var), vt9Var, 6);
        } else {
            vt9Var.Q();
        }
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new ag5(this, ue5Var, i);
        }
    }

    @Override // defpackage.xl2
    public final void c(Drawable drawable) {
        ubf ubfVar = (ubf) this.d;
        vbf vbfVar = ubfVar.g;
        if (drawable != null && ubfVar.f == ((yl2) this.c)) {
            vbfVar.r(4096L, true);
            vbfVar.q.p(drawable);
        } else {
            if (this.b) {
                return;
            }
            vbfVar.r(4096L, false);
            vbfVar.q.p(null);
        }
    }

    @Override // defpackage.uya
    public final void close() {
        synchronized (this.d) {
            ((ImageReader) this.c).close();
        }
    }

    @Override // defpackage.xl2
    public final void d() {
        this.b = true;
        vbf vbfVar = ((ubf) this.d).g;
        vbfVar.r(4096L, false);
        vbfVar.q.p(null);
    }

    @Override // defpackage.uya
    public final qya e() {
        Image imageAcquireLatestImage;
        synchronized (this.d) {
            try {
                imageAcquireLatestImage = ((ImageReader) this.c).acquireLatestImage();
            } catch (RuntimeException e) {
                if (!"ImageReaderContext is not initialized".equals(e.getMessage())) {
                    throw e;
                }
                imageAcquireLatestImage = null;
            }
            if (imageAcquireLatestImage == null) {
                return null;
            }
            return new k71(imageAcquireLatestImage);
        }
    }

    public final boolean f(long j) {
        Object obj;
        ArrayList arrayList = (ArrayList) ((k5o) this.d).b;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                obj = null;
                break;
            }
            obj = arrayList.get(i);
            if (k1g.s(((nmg) obj).a, j)) {
                break;
            }
            i++;
        }
        nmg nmgVar = (nmg) obj;
        if (nmgVar != null) {
            return nmgVar.h;
        }
        return false;
    }

    @Override // defpackage.uya
    public final int getHeight() {
        int height;
        synchronized (this.d) {
            height = ((ImageReader) this.c).getHeight();
        }
        return height;
    }

    @Override // defpackage.uya
    public final Surface getSurface() {
        Surface surface;
        synchronized (this.d) {
            surface = ((ImageReader) this.c).getSurface();
        }
        return surface;
    }

    @Override // defpackage.uya
    public final int getWidth() {
        int width;
        synchronized (this.d) {
            width = ((ImageReader) this.c).getWidth();
        }
        return width;
    }

    @Override // defpackage.uya
    public final int i() {
        int imageFormat;
        synchronized (this.d) {
            imageFormat = ((ImageReader) this.c).getImageFormat();
        }
        return imageFormat;
    }

    public final ch5 j(ue5 ue5Var) {
        ch5 ch5Var = new ch5(((k24) this.c).requireContext());
        ch5Var.m();
        ch5Var.o(new ue5(-542122567, new ag5(this, ue5Var), true));
        return ch5Var;
    }

    public final void k() {
        ArrayList arrayList = (ArrayList) this.c;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((Function0) obj).invoke();
        }
        t();
    }

    @Override // defpackage.uya
    public final void l() {
        synchronized (this.d) {
            this.b = true;
            ((ImageReader) this.c).setOnImageAvailableListener(null, null);
        }
    }

    public final void n() {
        if (this.b) {
            ((WebContentsAccessibilityImpl) ((bxk) this.c).b).i.removeCallbacks((q02) this.d);
            this.b = false;
        }
    }

    public final boolean o(zlj zljVar) {
        boolean z = true;
        if (zljVar == null) {
            return true;
        }
        boolean zRemove = ((Set) this.c).remove(zljVar);
        if (!((ArrayList) this.d).remove(zljVar) && !zRemove) {
            z = false;
        }
        if (z) {
            zljVar.c();
        }
        return z;
    }

    @Override // defpackage.rr9
    public final void onFailure(Throwable th) {
        switch (this.a) {
            case 8:
                synchronized (this.d) {
                    if (this.b) {
                        return;
                    }
                    boolean z = th instanceof gc4;
                    ode odeVar = (ode) this.c;
                    if (!z) {
                        odeVar.n(new ybl(4));
                        return;
                    }
                    odeVar.n(new ybl(0));
                    synchronized (this.d) {
                        try {
                            this.b = true;
                        } finally {
                        }
                    }
                    return;
                }
            default:
                npd npdVar = (npd) this.d;
                if (th instanceof UnsupportedOperationException) {
                    w7d.L("UnsupportedOperationException: Make sure to implement MediaSession.Callback.onPlaybackResumption() if you add a media button receiver to your manifest or if you implement the recent media item contract with your MediaLibraryService.", th);
                } else {
                    w7d.r("Failure calling MediaSession.Callback.onPlaybackResumption(): " + th.getMessage(), th);
                }
                tym.F(npdVar.t);
                if (this.b) {
                    npdVar.o((nod) this.c);
                    return;
                }
                return;
        }
    }

    @Override // defpackage.rr9
    public final void onSuccess(Object obj) {
        switch (this.a) {
            case 8:
                eg9 eg9Var = (eg9) obj;
                synchronized (this.d) {
                    if (this.b) {
                        return;
                    }
                    if (eg9Var == null) {
                        return;
                    }
                    ((ode) this.c).n(new ybl(eg9Var.a ? 2 : 3));
                    return;
                }
            default:
                nod nodVar = (nod) this.c;
                boolean z = this.b;
                npd npdVar = (npd) this.d;
                z5i.n0(npdVar.t, (ood) obj);
                tym.F(npdVar.t);
                if (z) {
                    npdVar.o(nodVar);
                    return;
                }
                return;
        }
    }

    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public final te2 g(igi igiVar) throws Exception {
        MediaCodec mediaCodecCreateByCodecName;
        oji we2Var;
        int i;
        te2 te2Var;
        String str = ((ogd) igiVar.b).a;
        te2 te2Var2 = null;
        try {
            Trace.beginSection("createCodec:" + str);
            mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str);
            try {
                if (!this.b || Build.VERSION.SDK_INT < 36) {
                    we2Var = new we2(mediaCodecCreateByCodecName, (HandlerThread) ((se2) this.d).get());
                    i = 0;
                } else {
                    we2Var = new oji(mediaCodecCreateByCodecName);
                    i = 4;
                }
                te2Var = new te2(mediaCodecCreateByCodecName, (HandlerThread) ((se2) this.c).get(), we2Var, (r3d) igiVar.g);
            } catch (Exception e) {
                e = e;
            }
        } catch (Exception e2) {
            e = e2;
            mediaCodecCreateByCodecName = null;
        }
        try {
            Trace.endSection();
            Surface surface = (Surface) igiVar.e;
            if (surface == null && ((ogd) igiVar.b).h && Build.VERSION.SDK_INT >= 35) {
                i |= 8;
            }
            te2Var.s((MediaFormat) igiVar.c, surface, (MediaCrypto) igiVar.f, i);
            return te2Var;
        } catch (Exception e3) {
            e = e3;
            te2Var2 = te2Var;
            if (te2Var2 != null) {
                te2Var2.release();
            } else if (mediaCodecCreateByCodecName != null) {
                mediaCodecCreateByCodecName.release();
            }
            throw e;
        }
    }

    @Override // defpackage.uya
    public final int q() {
        int maxImages;
        synchronized (this.d) {
            maxImages = ((ImageReader) this.c).getMaxImages();
        }
        return maxImages;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void r(boolean r9) {
        /*
            r8 = this;
            java.lang.Object r0 = r8.c
            s65 r0 = (defpackage.s65) r0
            java.lang.Object r1 = r8.d
            r65 r1 = (defpackage.r65) r1
            r2 = 0
            if (r9 == 0) goto La2
            boolean r9 = r1.d()
            if (r9 == 0) goto La2
            boolean r8 = r8.b
            ru9 r9 = r1.h
            boolean r3 = r1.d()
            r4 = 1
            r5 = 0
            if (r3 == 0) goto L52
            if (r8 != 0) goto L3f
            boolean r8 = r1.s
            if (r8 != 0) goto L52
            zyk r8 = r1.u
            java.lang.Object r8 = r8.getValue()
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 != 0) goto L52
            boolean r8 = r1.k()
            if (r8 != 0) goto L52
            int r8 = defpackage.r65.z
            boolean r8 = i41.j0(r9)
            if (r8 == 0) goto L41
        L3f:
            r8 = r4
            goto L53
        L41:
            android.content.SharedPreferences r8 = r9.a
            java.lang.String r9 = "startup.request_cmp_consent"
            boolean r8 = r8.getBoolean(r9, r4)
            if (r8 == 0) goto L52
            com.usercentrics.sdk.UsercentricsReadyStatus r8 = r1.o
            if (r8 == 0) goto L52
            boolean r8 = r8.a
            goto L53
        L52:
            r8 = r5
        L53:
            if (r8 == 0) goto L98
            f1p r9 = r1.i
            xrf r9 = r9.r(r4)
            com.usercentrics.sdk.UsercentricsOptions r3 = r1.p
            if (r3 == 0) goto L83
            java.lang.String r6 = r3.c
            java.lang.String r3 = r3.a
            java.lang.String r7 = r9.a
            boolean r3 = kotlin.jvm.internal.Intrinsics.a(r3, r7)
            if (r3 == 0) goto L7d
            java.lang.String r3 = "latest"
            boolean r3 = kotlin.jvm.internal.Intrinsics.a(r6, r3)
            if (r3 != 0) goto L7e
            o65 r3 = r9.b
            java.lang.String r3 = r3.a
            boolean r3 = kotlin.jvm.internal.Intrinsics.a(r6, r3)
            if (r3 != 0) goto L7e
        L7d:
            r4 = r5
        L7e:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r4)
            goto L84
        L83:
            r3 = r2
        L84:
            if (r3 == 0) goto L8b
            boolean r3 = r3.booleanValue()
            goto L8c
        L8b:
            r3 = r5
        L8c:
            boolean r4 = r1.l(r5)
            if (r3 != 0) goto L98
            if (r4 == 0) goto L98
            r1.g(r9)
            return
        L98:
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)
            r0.run(r8)
            r1.r = r2
            return
        La2:
            java.lang.Boolean r8 = java.lang.Boolean.FALSE
            r0.run(r8)
            r1.r = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rn9.r(boolean):void");
    }

    public final void show() {
        try {
            ((AlertDialog) this.c).show();
            wxe.V(6);
        } catch (WindowManager.BadTokenException unused) {
            G(null);
        }
    }

    public final void t() {
        this.b = true;
        qb qbVar = (qb) this.d;
        if (Intrinsics.a(qbVar.h, this)) {
            qbVar.h = null;
        }
    }

    public final String toString() {
        switch (this.a) {
            case 26:
                StringBuilder sb = new StringBuilder();
                sb.append(super.toString());
                sb.append("{numRequests=");
                sb.append(((Set) this.c).size());
                sb.append(", isPaused=");
                return z1m.m(sb, this.b, "}");
            default:
                return super.toString();
        }
    }

    @Override // defpackage.uya
    public final void w(final tya tyaVar, final Executor executor) {
        Handler handler;
        synchronized (this.d) {
            this.b = false;
            ImageReader.OnImageAvailableListener onImageAvailableListener = new ImageReader.OnImageAvailableListener() { // from class: l71
                @Override // android.media.ImageReader.OnImageAvailableListener
                public final void onImageAvailable(ImageReader imageReader) {
                    rn9 rn9Var = this.a;
                    Executor executor2 = executor;
                    tya tyaVar2 = tyaVar;
                    synchronized (rn9Var.d) {
                        if (!rn9Var.b) {
                            executor2.execute(new xa(rn9Var, tyaVar2, (byte) 15));
                        }
                    }
                }
            };
            ImageReader imageReader = (ImageReader) this.c;
            if (w7d.a != null) {
                handler = w7d.a;
            } else {
                synchronized (w7d.class) {
                    try {
                        if (w7d.a == null) {
                            w7d.a = Handler.createAsync(Looper.getMainLooper());
                        }
                    } finally {
                    }
                }
                handler = w7d.a;
            }
            imageReader.setOnImageAvailableListener(onImageAvailableListener, handler);
        }
    }

    @Override // defpackage.uya
    public final qya y() {
        Image imageAcquireNextImage;
        synchronized (this.d) {
            try {
                imageAcquireNextImage = ((ImageReader) this.c).acquireNextImage();
            } catch (RuntimeException e) {
                if (!"ImageReaderContext is not initialized".equals(e.getMessage())) {
                    throw e;
                }
                imageAcquireNextImage = null;
            }
            if (imageAcquireNextImage == null) {
                return null;
            }
            return new k71(imageAcquireNextImage);
        }
    }

    public final boolean z() {
        int i = 1;
        while (true) {
            int[] iArr = (int[]) this.c;
            if (i >= iArr.length) {
                return true;
            }
            if (!h(iArr[0], iArr[i])) {
                return false;
            }
            i++;
        }
    }
}
