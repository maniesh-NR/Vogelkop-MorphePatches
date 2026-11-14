package defpackage;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.SharedPreferences;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import android.util.LogPrinter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.core.graphics.drawable.IconCompat;
import androidx.fragment.app.Fragment;
import androidx.gridlayout.widget.GridLayout;
import androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat;
import com.bumptech.glide.load.ImageHeaderParser;
import com.google.common.util.concurrent.ListenableFuture;
import com.leanplum.utils.SizeUtil;
import com.opera.android.OperaApplication;
import com.opera.android.custom_views.LayoutDirectionLinearLayout;
import com.opera.android.custom_views.StylingImageView;
import com.opera.android.custom_views.StylingTextView;
import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.coroutines.h;
import kotlin.jvm.functions.Function1;
import org.chromium.components.embedder_support.delegate.HtmlColorPickerAdvanced;

/* loaded from: classes.dex */
public class ua7 implements jzh, f94, et8, rya, x6f {
    public final /* synthetic */ byte a;
    public Object b;
    public Object c;
    public Object d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ua7(byte b) {
        this((Object) new long[10], (Object) new long[10], (Object) new long[10], (byte) 4);
        this.a = b;
        switch (b) {
            case SizeUtil.textSize0 /* 20 */:
                this.b = new ode();
                this.c = new HashMap();
                break;
            case 21:
                this.b = new g3d();
                this.d = null;
                break;
            default:
                break;
        }
    }

    public /* synthetic */ ua7(byte b, boolean z) {
        this.a = b;
    }

    public ua7(Context context) {
        this.a = (byte) 28;
        this.c = new ii((byte) 19);
        this.b = context;
        this.d = new ni6(context);
    }

    public ua7(Context context, String str, ws4 ws4Var, cm cmVar) {
        this.a = (byte) 29;
        if (str != null) {
            ws4Var.c(Collections.EMPTY_LIST, Collections.singletonList(str));
        }
        this.b = new l1f(context, str);
        this.c = cmVar;
        this.d = context;
    }

    public ua7(Context context, qy7 qy7Var, View view) {
        this.a = (byte) 6;
        this.b = context;
        this.c = view;
        this.d = new PopupWindow((View) qy7Var, -2, -2, false);
    }

    public ua7(Context context, wu5 wu5Var) {
        this.a = (byte) 15;
        this.c = new ArrayList();
        this.d = uup.m(Boolean.FALSE);
        this.b = context;
    }

    public ua7(ContextWrapper contextWrapper) {
        this.a = (byte) 3;
        this.b = contextWrapper.getApplicationContext();
        this.c = ap7.a;
        this.d = new zo7();
        C(contextWrapper instanceof xd5 ? (xd5) contextWrapper : null);
    }

    public ua7(ParcelFileDescriptor parcelFileDescriptor, ArrayList arrayList, jl6 jl6Var) {
        this.a = (byte) 17;
        this.b = jl6Var;
        this.c = arrayList;
        this.d = new wub(parcelFileDescriptor);
    }

    public ua7(View view, int i, int i2, HtmlColorPickerAdvanced htmlColorPickerAdvanced) {
        this.a = (byte) 16;
        this.b = view.findViewById(2131363048);
        ((TextView) view.findViewById(2131363485)).setText(i);
        this.d = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, null);
        SeekBar seekBar = (SeekBar) view.findViewById(2131364186);
        this.c = seekBar;
        seekBar.setOnSeekBarChangeListener(htmlColorPickerAdvanced);
        seekBar.setMax(i2);
        Context context = view.getContext();
        seekBar.setThumbOffset(g8.q(context.getResources(), 2131231310).getIntrinsicWidth() / 2);
        seekBar.setContentDescription(context.getString(i));
    }

    public ua7(View view, int i, PorterDuff.Mode mode) {
        this.a = (byte) 12;
        this.b = view;
        zg zgVar = new zg();
        zgVar.a = -1;
        zgVar.b = mode;
        this.c = zgVar;
        this.d = new Drawable[i];
    }

    public ua7(Fragment fragment, gjm gjmVar) {
        this.a = (byte) 13;
        this.b = fragment;
        this.c = gjmVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ua7(esg esgVar) {
        this((byte) 4);
        this.a = (byte) 4;
        t(this, esgVar);
    }

    public ua7(f38 f38Var, zlj zljVar, r38 r38Var) {
        this.a = (byte) 7;
        this.d = f38Var;
        this.c = zljVar;
        this.b = r38Var;
    }

    public /* synthetic */ ua7(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    public /* synthetic */ ua7(Object obj, Object obj2, Object obj3, boolean z, byte b) {
        this.a = b;
        this.d = obj;
        this.b = obj2;
        this.c = obj3;
    }

    public ua7(String str) {
        this.a = (byte) 26;
        x77 x77Var = new x77((byte) 25, false);
        this.c = x77Var;
        this.d = x77Var;
        this.b = str;
    }

    public ua7(List list) {
        this.a = (byte) 22;
        this.d = list;
        this.b = new ArrayList(list.size());
        this.c = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            ((ArrayList) this.b).add(new dbj((List) ((ccd) list.get(i)).b.b));
            ((ArrayList) this.c).add(((ccd) list.get(i)).c.D());
        }
    }

    public ua7(List list, b9e b9eVar) throws GeneralSecurityException {
        this.a = (byte) 19;
        this.b = list;
        this.c = b9eVar;
        if (((AtomicBoolean) oz9.a.a).get()) {
            HashSet hashSet = new HashSet();
            Iterator it = list.iterator();
            boolean z = false;
            while (it.hasNext()) {
                qwb qwbVar = (qwb) it.next();
                int i = qwbVar.d;
                if (hashSet.contains(Integer.valueOf(i))) {
                    throw new GeneralSecurityException(p3p.i(i, "KeyID ", " is duplicated in the keyset, and Tink is configured to reject such keysets with the flag validateKeysetsOnParsing."));
                }
                hashSet.add(Integer.valueOf(i));
                if (qwbVar.e) {
                    z = true;
                }
            }
            if (!z) {
                t3p.w("Primary key id not found in keyset, and Tink is configured to reject such keysets with the flag validateKeysetsOnParsing.");
                throw null;
            }
        }
        this.d = null;
    }

    public ua7(nkj nkjVar) {
        this.a = (byte) 21;
        this.b = new g3d();
        this.d = nkjVar;
    }

    public ua7(nwf nwfVar, View view, View view2) {
        this.a = (byte) 27;
        this.b = nwfVar;
        this.c = view;
        this.d = view2;
        uje ujeVar = new uje(this);
        view.setOnClickListener(ujeVar);
        view.setOnLongClickListener(ujeVar);
        view2.setOnClickListener(ujeVar);
        view2.setOnLongClickListener(ujeVar);
    }

    public ua7(rf7 rf7Var, umi umiVar, Context context) {
        this.a = (byte) 1;
        x1p.o = this;
        this.b = context;
        this.c = umiVar;
        this.d = rf7Var;
        rf7Var.g.d(new bl6(this, (byte) 18));
    }

    public ua7(ua7 ua7Var) {
        this.a = (byte) 4;
        this.b = Arrays.copyOf((long[]) ua7Var.b, 10);
        this.c = Arrays.copyOf((long[]) ua7Var.c, 10);
        this.d = Arrays.copyOf((long[]) ua7Var.d, 10);
    }

    public ua7(v31 v31Var) {
        this.a = (byte) 18;
        this.b = v31Var;
        this.c = z4c.a(f7c.c, new q4b(this, (byte) 2));
        this.d = new oji((View) v31Var);
    }

    public ua7(x5f x5fVar) {
        this.a = (byte) 25;
        this.b = x5fVar;
        this.c = new LinkedHashSet();
        p4j p4jVar = new p4j();
        p4jVar.add("virus");
        p4jVar.add("sexual");
        this.d = z4j.a(p4jVar);
    }

    public ua7(Object[] objArr, Object[] objArr2) {
        this.a = (byte) 14;
        int length = objArr.length;
        int[] iArr = new int[length];
        HashMap map = new HashMap();
        for (int i = 0; i < length; i++) {
            Object obj = objArr[i];
            Integer numValueOf = (Integer) map.get(obj);
            if (numValueOf == null) {
                numValueOf = Integer.valueOf(map.size());
                map.put(obj, numValueOf);
            }
            iArr[i] = numValueOf.intValue();
        }
        this.b = iArr;
        this.c = m(objArr, iArr);
        this.d = m(objArr2, iArr);
    }

    public static boolean B(ivb ivbVar) {
        int iOrdinal = ivbVar.ordinal();
        return iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 3;
    }

    public static final ua7 J(frb frbVar) throws GeneralSecurityException, IOException {
        try {
            ByteArrayInputStream byteArrayInputStream = frbVar.a;
            try {
                try {
                    pwb pwbVarB = frb.b(wrb.b(new String(rym.a(byteArrayInputStream), frb.b)).h());
                    byteArrayInputStream.close();
                    try {
                        pwb pwbVarB2 = pwb.B(pwbVarB.d(), xk8.a());
                        k(pwbVarB2);
                        return r(pwbVarB2);
                    } catch (ajb unused) {
                        t3p.w("invalid keyset");
                        return null;
                    }
                } catch (srb | IllegalStateException e) {
                    throw new IOException((Throwable) e);
                }
            } catch (Throwable th) {
                byteArrayInputStream.close();
                throw th;
            }
        } catch (ajb unused2) {
            t3p.w("invalid keyset");
            return null;
        }
    }

    public static oup V(owb owbVar) {
        r6h r6hVarW = W(owbVar);
        uee ueeVar = uee.b;
        r2j r2jVar = (r2j) ueeVar.a.get();
        r2jVar.getClass();
        return !r2jVar.b.containsKey(new p2j(r6h.class, r6hVarW.b)) ? new cbc(r6hVarW) : ueeVar.a(r6hVarW);
    }

    public static r6h W(owb owbVar) {
        return r6h.a(owbVar.v().x(), owbVar.v().y(), owbVar.v().w(), owbVar.x(), owbVar.x() == iuf.e ? null : Integer.valueOf(owbVar.w()));
    }

    public static void k(pwb pwbVar) throws GeneralSecurityException {
        for (owb owbVar : pwbVar.y()) {
            if (owbVar.v().w() == mub.b || owbVar.v().w() == mub.c || owbVar.v().w() == mub.d) {
                throw new GeneralSecurityException(p3p.w("keyset contains key material of type ", owbVar.v().w().name(), " for type url ", owbVar.v().x()));
            }
        }
    }

    public static Object[] m(Object[] objArr, int[] iArr) {
        int length = objArr.length;
        Class<?> componentType = objArr.getClass().getComponentType();
        LogPrinter logPrinter = GridLayout.i;
        int iMax = -1;
        for (int i : iArr) {
            iMax = Math.max(iMax, i);
        }
        Object[] objArr2 = (Object[]) Array.newInstance(componentType, iMax + 1);
        for (int i2 = 0; i2 < length; i2++) {
            objArr2[iArr[i2]] = objArr[i2];
        }
        return objArr2;
    }

    public static owb o(oup oupVar, ivb ivbVar, int i) throws GeneralSecurityException {
        r6h r6hVarJ;
        r2j r2jVar = (r2j) uee.b.a.get();
        r2jVar.getClass();
        q2j q2jVar = new q2j(oupVar.getClass(), r6h.class);
        HashMap map = r2jVar.a;
        if (map.containsKey(q2jVar)) {
            r6hVarJ = ((gvb) map.get(q2jVar)).b.j(oupVar);
        } else {
            sjn.h(q2jVar, " available", "No Key serializer for ");
            r6hVarJ = null;
        }
        Integer numB0 = oupVar.b0();
        if (numB0 != null && numB0.intValue() != i) {
            t3p.w("Wrong ID set for key with ID requirement");
            return null;
        }
        nwb nwbVarA = owb.A();
        lub lubVarZ = nub.z();
        String str = r6hVarJ.a;
        lubVarZ.f();
        ((av9) lubVarZ).b.B(str);
        e54 e54Var = r6hVarJ.c;
        lubVarZ.f();
        ((av9) lubVarZ).b.C(e54Var);
        mub mubVar = r6hVarJ.d;
        lubVarZ.f();
        ((av9) lubVarZ).b.A(mubVar);
        nwbVarA.f();
        ((av9) nwbVarA).b.B(lubVarZ.b());
        nwbVarA.f();
        ((av9) nwbVarA).b.E(ivbVar);
        nwbVarA.f();
        ((av9) nwbVarA).b.C(i);
        iuf iufVar = r6hVarJ.e;
        nwbVarA.f();
        ((av9) nwbVarA).b.D(iufVar);
        return nwbVarA.b();
    }

    public static final ua7 r(pwb pwbVar) throws GeneralSecurityException {
        oup cbcVar;
        boolean z;
        if (pwbVar.x() <= 0) {
            t3p.w("empty keyset");
            return null;
        }
        ArrayList arrayList = new ArrayList(pwbVar.x());
        for (owb owbVar : pwbVar.y()) {
            int iW = owbVar.w();
            try {
                cbcVar = V(owbVar);
                z = false;
            } catch (GeneralSecurityException e) {
                if (((AtomicBoolean) oz9.a.a).get()) {
                    throw e;
                }
                cbcVar = new cbc(W(owbVar));
                z = true;
            }
            if (((AtomicBoolean) oz9.a.a).get() && !B(owbVar.y())) {
                t3p.w("Parsing of a single key failed (wrong status) and Tink is configured via validateKeysetsOnParsing to reject such keysets.");
                return null;
            }
            arrayList.add(new qwb(cbcVar, owbVar.y(), iW, iW == pwbVar.z(), z, qwb.h));
        }
        return new ua7(Collections.unmodifiableList(arrayList), b9e.b);
    }

    public static void t(ua7 ua7Var, esg esgVar) {
        long[] jArr = (long[]) ua7Var.b;
        ua7 ua7Var2 = (ua7) esgVar.b;
        long[] jArr2 = (long[]) ua7Var2.b;
        long[] jArr3 = (long[]) esgVar.c;
        aib.z(jArr, jArr2, jArr3);
        long[] jArr4 = (long[]) ua7Var.c;
        long[] jArr5 = (long[]) ua7Var2.c;
        long[] jArr6 = (long[]) ua7Var2.d;
        aib.z(jArr4, jArr5, jArr6);
        aib.z((long[]) ua7Var.d, jArr6, jArr3);
    }

    public final void A(TypedArray typedArray, int i) {
        zg zgVar = (zg) this.c;
        zgVar.a = 0;
        zgVar.c = typedArray.getColorStateList(i);
    }

    public final void C(xd5 xd5Var) {
        tcc lifecycle;
        Context context = (Context) this.b;
        if (((ap7) this.c) != ap7.a) {
            return;
        }
        this.c = ap7.b;
        ((zo7) this.d).a.r(bp7.a);
        rz rzVar = new rz();
        rzVar.b = xd5Var;
        if (xd5Var != null && (lifecycle = xd5Var.getLifecycle()) != null) {
            lifecycle.a(rzVar);
        }
        String[] strArr = OperaApplication.K;
        r0k r0kVarK = ((OperaApplication) context.getApplicationContext()).K();
        wci wciVar = new wci();
        ((ArrayList) wciVar.b).add(context.getString(2132019796));
        r0kVarK.i(new n9h(wciVar)).addOnSuccessListener(new uk6((Object) new yo7((Object) rzVar, (Object) this, (Object) r0kVarK, (byte) 0), (byte) 16)).addOnFailureListener(new uk6((Object) this, (byte) 17));
    }

    public final void D() {
        ((gjm) this.c).b(p());
    }

    public final void E(r37 r37Var, f7f f7fVar) {
        gjm gjmVar = (gjm) this.c;
        gjmVar.c(r37Var, gjmVar.a(p().getId()), f7fVar);
    }

    public final void F() {
        int i = 0;
        ((zg) this.c).a = 0;
        while (true) {
            Drawable[] drawableArr = (Drawable[]) this.d;
            if (i >= drawableArr.length) {
                ((View) this.b).invalidate();
                return;
            } else {
                drawableArr[i] = null;
                i++;
            }
        }
    }

    public final void G() {
        zg zgVar = (zg) this.c;
        View view = (View) this.b;
        int[] drawableState = view.getDrawableState();
        int i = zgVar.a;
        ColorStateList colorStateList = (ColorStateList) zgVar.c;
        if (i != (colorStateList != null ? colorStateList.getColorForState(drawableState, -1) : -1)) {
            view.invalidate();
        }
    }

    public final void H(Function1 function1) {
        t0i t0iVar = (t0i) this.b;
        if (t0iVar == null) {
            this.c = function1;
            return;
        }
        Throwable thD = t0i.d(t0iVar.a);
        if (thD != null) {
            function1.invoke(thD);
        }
    }

    public final void I(Function1 function1) {
        t0i t0iVar = (t0i) this.b;
        if (t0iVar == null) {
            this.d = function1;
            return;
        }
        Object obj = t0iVar.a;
        if (!(obj instanceof q0i)) {
            function1.invoke(obj);
        }
        p0i p0iVar = t0i.b;
    }

    public final boolean K(Object obj) {
        if (obj instanceof xn8) {
            ((xn8) obj).c().a = true;
        }
        ((yn8) this.c).f(obj);
        return ((wng) this.d).c(obj);
    }

    public final void L(String str) {
        ((lv7) this.b).invoke();
        pde pdeVar = (pde) ((tah) ((i3j) this.c).c).h;
        ArrayList arrayList = new ArrayList((Collection) pdeVar.g());
        if (arrayList.removeIf(new zx1(new tx0(str, (byte) 15), (byte) 11))) {
            pdeVar.r(arrayList);
        }
    }

    public final void M(ColorStateList colorStateList) {
        zg zgVar = (zg) this.c;
        View view = (View) this.b;
        int[] drawableState = view.getDrawableState();
        zgVar.c = colorStateList;
        if (zgVar.a != (colorStateList != null ? colorStateList.getColorForState(drawableState, -1) : -1)) {
            view.invalidate();
        }
    }

    public final void N(yhe yheVar) {
        ((l1f) this.b).g = yheVar != null ? (PendingIntent) yheVar.b : null;
    }

    public final void O(CharSequence charSequence) {
        ((l1f) this.b).e(charSequence);
    }

    public final void P(CharSequence charSequence) {
        ((l1f) this.b).f(charSequence);
    }

    public final void Q(int[] iArr) {
        int[] iArr2 = (int[]) iArr.clone();
        GradientDrawable gradientDrawable = (GradientDrawable) this.d;
        gradientDrawable.setColors(iArr2);
        ((View) this.b).setBackground(gradientDrawable);
    }

    public final void R(boolean z) {
        ((l1f) this.b).h(2, z);
    }

    public final void S(int i) {
        ((l1f) this.b).G.icon = i;
    }

    public final void T(Icon icon) {
        IconCompat iconCompatD;
        IconCompat iconCompat;
        l1f l1fVar = (l1f) this.b;
        Context context = (Context) this.d;
        PorterDuff.Mode mode = IconCompat.k;
        icon.getClass();
        int type = icon.getType();
        if (type != 2) {
            if (type == 4) {
                Uri uri = icon.getUri();
                uri.getClass();
                String string = uri.toString();
                string.getClass();
                iconCompat = new IconCompat(4);
                iconCompat.b = string;
            } else if (type != 6) {
                iconCompatD = new IconCompat(-1);
                iconCompatD.b = icon;
            } else {
                Uri uri2 = icon.getUri();
                uri2.getClass();
                String string2 = uri2.toString();
                string2.getClass();
                iconCompat = new IconCompat(6);
                iconCompat.b = string2;
            }
            iconCompatD = iconCompat;
        } else {
            String resPackage = icon.getResPackage();
            try {
                iconCompatD = IconCompat.d(IconCompat.g(context, resPackage), resPackage, icon.getResId());
            } catch (Resources.NotFoundException unused) {
                qp2.o("Icon resource cannot be found");
                return;
            }
        }
        l1fVar.H = fr3.f0(iconCompatD, l1fVar.a);
    }

    public final byte[] U() {
        long[] jArr = new long[10];
        long[] jArr2 = new long[10];
        long[] jArr3 = new long[10];
        long[] jArr4 = (long[]) this.d;
        long[] jArr5 = new long[10];
        long[] jArr6 = new long[10];
        long[] jArr7 = new long[10];
        long[] jArr8 = new long[10];
        long[] jArr9 = new long[10];
        long[] jArr10 = new long[10];
        long[] jArr11 = new long[10];
        long[] jArr12 = new long[10];
        long[] jArr13 = new long[10];
        long[] jArr14 = new long[10];
        aib.L(jArr5, jArr4);
        aib.L(jArr14, jArr5);
        aib.L(jArr13, jArr14);
        aib.z(jArr6, jArr13, jArr4);
        aib.z(jArr7, jArr6, jArr5);
        aib.L(jArr13, jArr7);
        aib.z(jArr8, jArr13, jArr6);
        aib.L(jArr13, jArr8);
        aib.L(jArr14, jArr13);
        aib.L(jArr13, jArr14);
        aib.L(jArr14, jArr13);
        aib.L(jArr13, jArr14);
        aib.z(jArr9, jArr13, jArr8);
        aib.L(jArr13, jArr9);
        aib.L(jArr14, jArr13);
        for (int i = 2; i < 10; i += 2) {
            aib.L(jArr13, jArr14);
            aib.L(jArr14, jArr13);
        }
        aib.z(jArr10, jArr14, jArr9);
        aib.L(jArr13, jArr10);
        aib.L(jArr14, jArr13);
        for (int i2 = 2; i2 < 20; i2 += 2) {
            aib.L(jArr13, jArr14);
            aib.L(jArr14, jArr13);
        }
        aib.z(jArr13, jArr14, jArr10);
        aib.L(jArr14, jArr13);
        aib.L(jArr13, jArr14);
        for (int i3 = 2; i3 < 10; i3 += 2) {
            aib.L(jArr14, jArr13);
            aib.L(jArr13, jArr14);
        }
        aib.z(jArr11, jArr13, jArr9);
        aib.L(jArr13, jArr11);
        aib.L(jArr14, jArr13);
        for (int i4 = 2; i4 < 50; i4 += 2) {
            aib.L(jArr13, jArr14);
            aib.L(jArr14, jArr13);
        }
        aib.z(jArr12, jArr14, jArr11);
        aib.L(jArr14, jArr12);
        aib.L(jArr13, jArr14);
        for (int i5 = 2; i5 < 100; i5 += 2) {
            aib.L(jArr14, jArr13);
            aib.L(jArr13, jArr14);
        }
        aib.z(jArr14, jArr13, jArr12);
        aib.L(jArr13, jArr14);
        aib.L(jArr14, jArr13);
        for (int i6 = 2; i6 < 50; i6 += 2) {
            aib.L(jArr13, jArr14);
            aib.L(jArr14, jArr13);
        }
        aib.z(jArr13, jArr14, jArr11);
        aib.L(jArr14, jArr13);
        aib.L(jArr13, jArr14);
        aib.L(jArr14, jArr13);
        aib.L(jArr13, jArr14);
        aib.L(jArr14, jArr13);
        aib.z(jArr, jArr14, jArr7);
        aib.z(jArr2, (long[]) this.b, jArr);
        aib.z(jArr3, (long[]) this.c, jArr);
        byte[] bArrQ = aib.q(jArr3);
        bArrQ[31] = (byte) (bArrQ[31] ^ ((aib.q(jArr2)[0] & 1) << 7));
        return bArrQ;
    }

    public final void X(int[] iArr, int i, Drawable drawable) {
        Drawable[] drawableArr = (Drawable[]) this.d;
        zg zgVar = (zg) this.c;
        Drawable drawable2 = drawableArr[i];
        ColorStateList colorStateList = (ColorStateList) zgVar.c;
        if (colorStateList != null) {
            int colorForState = colorStateList != null ? colorStateList.getColorForState(iArr, -1) : -1;
            if (colorForState != zgVar.a) {
                zgVar.a = colorForState;
                zgVar.d = new PorterDuffColorFilter(colorForState, (PorterDuff.Mode) zgVar.b);
                drawable2 = null;
            }
            if (drawable == drawable2) {
                drawable = drawable2;
            } else {
                if (!(drawable instanceof AnimatedVectorDrawableCompat) && !(drawable instanceof AnimatedVectorDrawable)) {
                    drawable.mutate();
                }
                drawable.setColorFilter((PorterDuffColorFilter) zgVar.d);
            }
        }
        drawableArr[i] = drawable;
    }

    public final Bitmap a(BitmapFactory.Options options) {
        return BitmapFactory.decodeFileDescriptor(((wub) this.d).h().getFileDescriptor(), null, options);
    }

    public final ListenableFuture b() {
        return k1g.z(new yzb((Object) this, (byte) 6));
    }

    public final void c() {
    }

    public final int d() throws Throwable {
        cph cphVar;
        ArrayList arrayList = (ArrayList) this.c;
        wub wubVar = (wub) this.d;
        jl6 jl6Var = (jl6) this.b;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            rxa rxaVar = (rxa) arrayList.get(i);
            cph cphVar2 = null;
            try {
                cphVar = new cph(new FileInputStream(wubVar.h().getFileDescriptor()), jl6Var);
            } catch (Throwable th) {
                th = th;
            }
            try {
                int iA = rxaVar.a(cphVar, jl6Var);
                try {
                    cphVar.close();
                } catch (IOException unused) {
                }
                wubVar.h();
                if (iA != -1) {
                    return iA;
                }
            } catch (Throwable th2) {
                th = th2;
                cphVar2 = cphVar;
                if (cphVar2 != null) {
                    try {
                        cphVar2.close();
                    } catch (IOException unused2) {
                    }
                }
                wubVar.h();
                throw th;
            }
        }
        return -1;
    }

    public final ImageHeaderParser.ImageType e() throws Throwable {
        cph cphVar;
        ArrayList arrayList = (ArrayList) this.c;
        wub wubVar = (wub) this.d;
        jl6 jl6Var = (jl6) this.b;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            rxa rxaVar = (rxa) arrayList.get(i);
            cph cphVar2 = null;
            try {
                cphVar = new cph(new FileInputStream(wubVar.h().getFileDescriptor()), jl6Var);
            } catch (Throwable th) {
                th = th;
            }
            try {
                ImageHeaderParser.ImageType imageTypeC = rxaVar.c(cphVar);
                try {
                    cphVar.close();
                } catch (IOException unused) {
                }
                wubVar.h();
                if (imageTypeC != ImageHeaderParser.ImageType.UNKNOWN) {
                    return imageTypeC;
                }
            } catch (Throwable th2) {
                th = th2;
                cphVar2 = cphVar;
                if (cphVar2 != null) {
                    try {
                        cphVar2.close();
                    } catch (IOException unused2) {
                    }
                }
                wubVar.h();
                throw th;
            }
        }
        return ImageHeaderParser.ImageType.UNKNOWN;
    }

    public final void f(v6f v6fVar) {
        synchronized (((HashMap) this.c)) {
            ((HashMap) this.c).remove(v6fVar);
            if (((HashMap) this.c).isEmpty()) {
                x7d.l().execute(new fkc(this, (byte) 0));
            }
        }
    }

    public final void g(Executor executor, v6f v6fVar) {
        synchronized (((HashMap) this.c)) {
            boolean zIsEmpty = ((HashMap) this.c).isEmpty();
            ((HashMap) this.c).put(v6fVar, executor);
            if (zIsEmpty) {
                x7d.l().execute(new fkc(this, (byte) 1));
            } else {
                executor.execute(new zr9((Object) this, (Object) v6fVar, (byte) 18));
            }
        }
    }

    public final Object h() {
        Object objA = ((wng) this.d).a();
        if (objA == null) {
            objA = ((wn8) this.b).f();
            if (Log.isLoggable("FactoryPools", 2)) {
                objA.getClass().toString();
            }
        }
        if (objA instanceof xn8) {
            ((xn8) objA).c().a = false;
        }
        return objA;
    }

    public final void i(int i, String str, yhe yheVar) {
        PendingIntent pendingIntent = (PendingIntent) yheVar.b;
        l1f l1fVar = (l1f) this.b;
        if (i == 0) {
            l1fVar.a(i, str, pendingIntent);
        } else {
            l1fVar.b.add(new c1f(IconCompat.c(i, (Context) this.d), str, pendingIntent).a());
        }
    }

    public final boolean j(u3j u3jVar) {
        qb4 qb4Var = new qb4();
        tb5 tb5Var = new tb5();
        ma4 ma4Var = (ge4) this.b;
        m20 m20Var = new m20(ma4Var.a, (byte) 4);
        gf4 gf4Var = (gf4) this.d;
        kd4 kd4Var = new kd4(qb4Var, tb5Var, m20Var, gf4Var, new rdo(), new za9(gf4Var.a()), ma4Var, (yg4) null, (i16) null);
        n08 n08Var = n08.a;
        return ((Boolean) scd.g0(h.a, new fg6(this, kd4Var.a(0, u3jVar, true, (o3a) null, (Integer) null, n08Var, n08Var), null, (byte) 15))).booleanValue();
    }

    public final i16 l() {
        Notification notificationB;
        try {
            notificationB = ((l1f) this.b).b();
            ioh.t("Notifications.Android.Build", true);
        } catch (NullPointerException unused) {
            ioh.t("Notifications.Android.Build", false);
            notificationB = null;
        } catch (Throwable th) {
            ioh.t("Notifications.Android.Build", false);
            throw th;
        }
        return new i16((Object) notificationB, this.c, (byte) 27);
    }

    public final void n(cwd cwdVar) {
        LayoutInflater layoutInflater = (LayoutInflater) this.b;
        ViewGroup viewGroup = (ViewGroup) this.c;
        View viewInflate = layoutInflater.inflate(2131558860, viewGroup, false);
        viewGroup.addView(viewInflate);
        int i = 2131362594;
        StylingImageView stylingImageView = (StylingImageView) w1h.j(2131362594, viewInflate);
        if (stylingImageView != null) {
            i = 2131363525;
            yq1 yq1Var = (StylingTextView) w1h.j(2131363525, viewInflate);
            if (yq1Var != null) {
                LayoutDirectionLinearLayout layoutDirectionLinearLayout = (LayoutDirectionLinearLayout) viewInflate;
                stylingImageView.setImageResource(cwdVar.b);
                yq1Var.setText(yq1Var.getResources().getString(cwdVar.a));
                layoutDirectionLinearLayout.setEnabled(true);
                layoutDirectionLinearLayout.setOnClickListener(new ks8(new jf7(this, cwdVar, (byte) 22), (byte) 2));
                return;
            }
        }
        t3p.q("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }

    public final void onFailure(v84 v84Var, IOException iOException) {
        g77 g77Var = (g77) this.b;
        qq8 qq8Var = (qq8) this.c;
        ((umi) g77Var.a).d(new pq8(true, (y03) this.d, g77Var, qq8Var, v84Var)).a(null);
    }

    public final void onResponse(v84 v84Var, pzh pzhVar) throws IOException {
        y03 y03Var = (y03) this.d;
        qq8 qq8Var = (qq8) this.c;
        g77 g77Var = (g77) this.b;
        umi umiVar = (umi) g77Var.a;
        if (!pzhVar.q) {
            pzhVar.close();
            umiVar.d(new pq8(false, y03Var, g77Var, qq8Var, v84Var)).a(null);
        } else {
            if (pzhVar.d == 204) {
                umiVar.d(new bn7((Object) qq8Var, (byte) 19)).a(null);
                return;
            }
            try {
                vzh vzhVar = pzhVar.g;
                try {
                    umiVar.d(new cn7(qq8Var, vzhVar.string(), (byte) 20)).a(null);
                    vzhVar.close();
                } finally {
                }
            } catch (IOException unused) {
                umiVar.d(new pq8(true, y03Var, g77Var, qq8Var, v84Var)).a(null);
            }
        }
    }

    public final n37 p() {
        n37 n37Var = (n37) this.d;
        if (n37Var != null) {
            return n37Var;
        }
        n37 n37VarE = p37.E(((Fragment) this.b).requireArguments());
        this.d = n37VarE;
        return n37VarE;
    }

    public final void q(boolean z) {
        if (x1p.o == this) {
            x1p.o = null;
        }
        if (z) {
            nv6 nv6VarB = ru9.c((Context) this.b).b();
            ((SharedPreferences.Editor) nv6VarB.a).putBoolean("download.access_after_upgrade.all_access", true);
            nv6VarB.w();
        }
    }

    public final kyh s(kyh kyhVar, trf trfVar) {
        Drawable drawable = (Drawable) kyhVar.get();
        if (drawable instanceof BitmapDrawable) {
            return ((rbe) this.c).s(ah3.c((zg3) this.b, ((BitmapDrawable) drawable).getBitmap()), trfVar);
        }
        if (drawable instanceof kx9) {
            return ((s16) this.d).s(kyhVar, trfVar);
        }
        return null;
    }

    public final String toString() throws e22 {
        switch (this.a) {
            case 19:
                pwb pwbVarV = v();
                int i = rym.a;
                rwb rwbVarW = uwb.w();
                int iZ = pwbVarV.z();
                rwbVarW.f();
                ((av9) rwbVarW).b.x(iZ);
                for (owb owbVar : pwbVarV.y()) {
                    swb swbVarV = twb.v();
                    String strX = owbVar.v().x();
                    swbVarV.f();
                    ((av9) swbVarV).b.z(strX);
                    ivb ivbVarY = owbVar.y();
                    swbVarV.f();
                    ((av9) swbVarV).b.y(ivbVarY);
                    iuf iufVarX = owbVar.x();
                    swbVarV.f();
                    ((av9) swbVarV).b.x(iufVarX);
                    int iW = owbVar.w();
                    swbVarV.f();
                    ((av9) swbVarV).b.w(iW);
                    twb twbVarB = swbVarV.b();
                    rwbVarW.f();
                    ((av9) rwbVarW).b.v(twbVarB);
                }
                return rwbVarW.b().toString();
            case 26:
                StringBuilder sb = new StringBuilder(32);
                sb.append((String) this.b);
                sb.append('{');
                x77 x77Var = (x77) ((x77) this.c).d;
                String str = "";
                while (x77Var != null) {
                    Object obj = x77Var.c;
                    sb.append(str);
                    String str2 = (String) x77Var.b;
                    if (str2 != null) {
                        sb.append(str2);
                        sb.append('=');
                    }
                    if (obj == null || !obj.getClass().isArray()) {
                        sb.append(obj);
                    } else {
                        String strDeepToString = Arrays.deepToString(new Object[]{obj});
                        sb.append((CharSequence) strDeepToString, 1, strDeepToString.length() - 1);
                    }
                    x77Var = (x77) x77Var.d;
                    str = ", ";
                }
                sb.append('}');
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public final qwb u(int i) {
        List list = (List) this.b;
        if (i < 0 || i >= list.size()) {
            h9o.g(list.size(), p3p.o(i, "Invalid index ", " for keyset of size "));
            return null;
        }
        qwb qwbVar = (qwb) list.get(i);
        if (!B(qwbVar.b)) {
            qp2.n(p3p.i(i, "Keyset-Entry at position ", " has wrong status"));
            return null;
        }
        if (!qwbVar.f) {
            return (qwb) list.get(i);
        }
        qp2.n(p3p.i(i, "Keyset-Entry at position ", " didn't parse correctly"));
        return null;
    }

    public final pwb v() throws e22 {
        try {
            mwb mwbVarA = pwb.A();
            for (qwb qwbVar : (List) this.b) {
                oup oupVarA = qwbVar.a();
                int i = qwbVar.d;
                owb owbVarO = o(oupVarA, qwbVar.b, i);
                mwbVarA.f();
                ((av9) mwbVarA).b.v(owbVarO);
                if (qwbVar.e) {
                    mwbVarA.f();
                    ((av9) mwbVarA).b.C(i);
                }
            }
            return mwbVarA.b();
        } catch (GeneralSecurityException e) {
            pza.m(e);
            return null;
        }
    }

    public final qwb w() {
        for (qwb qwbVar : (List) this.b) {
            if (qwbVar != null && qwbVar.e) {
                if (qwbVar.c == b30.h) {
                    return qwbVar;
                }
                qp2.n("Keyset has primary which isn't enabled");
                return null;
            }
        }
        qp2.n("Keyset has no valid primary");
        return null;
    }

    public final Object x() throws GeneralSecurityException, e22 {
        m54 m54VarZ0;
        List arrayList;
        m54 m54VarZ02;
        List list;
        m54 m54VarZ03;
        List list2;
        m54 m54VarZ04;
        List arrayList2;
        List list3 = (List) this.b;
        ua7 ua7Var = (ua7) this.d;
        pwb pwbVarV = (ua7Var == null ? this : ua7Var).v();
        int i = rym.a;
        int iZ = pwbVarV.z();
        int i2 = 0;
        boolean z = true;
        int i3 = 0;
        boolean z2 = false;
        for (owb owbVar : pwbVarV.y()) {
            if (owbVar.y() == ivb.c) {
                if (!owbVar.z()) {
                    throw new GeneralSecurityException(String.format("key %d has no key data", Integer.valueOf(owbVar.w())));
                }
                if (owbVar.x() == iuf.b) {
                    throw new GeneralSecurityException(String.format("key %d has unknown prefix", Integer.valueOf(owbVar.w())));
                }
                if (owbVar.y() == ivb.b) {
                    throw new GeneralSecurityException(String.format("key %d has unknown status", Integer.valueOf(owbVar.w())));
                }
                if (owbVar.w() == iZ) {
                    if (z2) {
                        t3p.w("keyset contains multiple primary keys");
                        return null;
                    }
                    z2 = true;
                }
                if (owbVar.v().w() != mub.e) {
                    z = false;
                }
                i3++;
            }
        }
        if (i3 == 0) {
            t3p.w("keyset must contain at least one ENABLED key");
            return null;
        }
        if (!z2 && !z) {
            t3p.w("keyset doesn't contain a valid primary key");
            return null;
        }
        for (int i4 = 0; i4 < list3.size(); i4++) {
            if (((qwb) list3.get(i4)).f || !B(((qwb) list3.get(i4)).b)) {
                owb owbVarW = pwbVarV.w(i4);
                StringBuilder sbO = p3p.o(i4, "Key parsing of key with index ", " and type_url ");
                sbO.append(owbVarW.v().x());
                sbO.append(" failed, unable to get primitive");
                throw new GeneralSecurityException(sbO.toString());
            }
        }
        if (ua7Var == null) {
            ua7Var = this;
        }
        b9e b9eVar = (b9e) this.c;
        byg bygVar = (byg) mee.b.a.get();
        HashMap map = bygVar.b;
        if (!map.containsKey(k9h.class)) {
            pza.n(k9h.class, "No wrapper found for ");
            return null;
        }
        e20 e20Var = (e20) map.get(k9h.class);
        mgf mgfVar = new mgf((Object) bygVar, (Object) e20Var, (byte) 9);
        switch (e20Var.a) {
            case 0:
                HashMap map2 = new HashMap();
                while (i2 < ((List) ua7Var.b).size()) {
                    qwb qwbVarU = ua7Var.u(i2);
                    if (qwbVarU.c == b30.h) {
                        b20 b20VarA = qwbVarU.a();
                        if (b20VarA instanceof b20) {
                            m54VarZ0 = b20VarA.z0();
                        } else {
                            if (!(b20VarA instanceof cbc)) {
                                throw new GeneralSecurityException("Cannot get output prefix for key of class " + b20VarA.getClass().getName() + " with parameters " + b20VarA.c0());
                            }
                            m54VarZ0 = ((cbc) b20VarA).z0();
                        }
                        ujp ujpVar = new ujp((byte) 15);
                        byte[] bArr = m54VarZ0.a;
                        if (bArr.length != 0 && bArr.length != 5) {
                            t3p.w("PrefixMap only supports 0 and 5 byte prefixes");
                            return null;
                        }
                        if (map2.containsKey(m54VarZ0)) {
                            arrayList = (List) map2.get(m54VarZ0);
                        } else {
                            arrayList = new ArrayList();
                            map2.put(m54VarZ0, arrayList);
                        }
                        arrayList.add(ujpVar);
                    }
                    i2++;
                }
                if (!b9eVar.a.isEmpty()) {
                    yde.b.a().getClass();
                }
                ua7Var.w();
                return new d20();
            case 1:
                qwb qwbVarW = ua7Var.w();
                HashMap map3 = new HashMap();
                while (i2 < ((List) ua7Var.b).size()) {
                    qwb qwbVarU2 = ua7Var.u(i2);
                    if (qwbVarU2.c == b30.h) {
                        c05 c05Var = (c05) mgfVar.h(qwbVarU2);
                        h5d h5dVarA = qwbVarU2.a();
                        if (h5dVarA instanceof h5d) {
                            m54VarZ02 = h5dVarA.z0();
                        } else {
                            if (!(h5dVarA instanceof cbc)) {
                                throw new GeneralSecurityException("Cannot get output prefix for key of class " + h5dVarA.getClass().getName() + " with parameters " + h5dVarA.c0());
                            }
                            m54VarZ02 = ((cbc) h5dVarA).z0();
                        }
                        byte[] bArr2 = m54VarZ02.a;
                        if (bArr2.length != 0 && bArr2.length != 5) {
                            t3p.w("PrefixMap only supports 0 and 5 byte prefixes");
                            return null;
                        }
                        if (map3.containsKey(m54VarZ02)) {
                            list = (List) map3.get(m54VarZ02);
                        } else {
                            ArrayList arrayList3 = new ArrayList();
                            map3.put(m54VarZ02, arrayList3);
                            list = arrayList3;
                        }
                        list.add(c05Var);
                    }
                    i2++;
                }
                return new c05();
            case 2:
                HashMap map4 = new HashMap();
                while (i2 < ((List) ua7Var.b).size()) {
                    qwb qwbVarU3 = ua7Var.u(i2);
                    if (qwbVarU3.c == b30.h) {
                        h5d h5dVarA2 = qwbVarU3.a();
                        if (h5dVarA2 instanceof h5d) {
                            m54VarZ03 = h5dVarA2.z0();
                        } else {
                            if (!(h5dVarA2 instanceof cbc)) {
                                throw new GeneralSecurityException("Cannot get output prefix for key of class " + h5dVarA2.getClass().getName() + " with parameters " + h5dVarA2.c0());
                            }
                            m54VarZ03 = ((cbc) h5dVarA2).z0();
                        }
                        a36 a36Var = new a36();
                        byte[] bArr3 = m54VarZ03.a;
                        if (bArr3.length != 0 && bArr3.length != 5) {
                            t3p.w("PrefixMap only supports 0 and 5 byte prefixes");
                            return null;
                        }
                        if (map4.containsKey(m54VarZ03)) {
                            list2 = (List) map4.get(m54VarZ03);
                        } else {
                            ArrayList arrayList4 = new ArrayList();
                            map4.put(m54VarZ03, arrayList4);
                            list2 = arrayList4;
                        }
                        list2.add(a36Var);
                    }
                    i2++;
                }
                if (!b9eVar.a.isEmpty()) {
                    yde.b.a().getClass();
                }
                ua7Var.w();
                return new hxg();
            case 3:
                if (!b9eVar.a.isEmpty()) {
                    yde.b.a().getClass();
                }
                int i5 = ua7Var.w().d;
                return new kr7();
            default:
                HashMap map5 = new HashMap();
                while (i2 < ((List) ua7Var.b).size()) {
                    qwb qwbVarU4 = ua7Var.u(i2);
                    if (qwbVarU4.c == b30.h) {
                        k9h k9hVar = (k9h) mgfVar.h(qwbVarU4);
                        njj njjVarA = qwbVarU4.a();
                        if (njjVarA instanceof njj) {
                            m54VarZ04 = njjVarA.z0();
                        } else {
                            if (!(njjVarA instanceof cbc)) {
                                throw new GeneralSecurityException("Cannot get output prefix for key of class " + njjVarA.getClass().getName() + " with parameters " + njjVarA.c0());
                            }
                            m54VarZ04 = ((cbc) njjVarA).z0();
                        }
                        l9h l9hVar = new l9h(k9hVar, qwbVarU4.d);
                        byte[] bArr4 = m54VarZ04.a;
                        if (bArr4.length != 0 && bArr4.length != 5) {
                            t3p.w("PrefixMap only supports 0 and 5 byte prefixes");
                            return null;
                        }
                        if (map5.containsKey(m54VarZ04)) {
                            arrayList2 = (List) map5.get(m54VarZ04);
                        } else {
                            arrayList2 = new ArrayList();
                            map5.put(m54VarZ04, arrayList2);
                        }
                        arrayList2.add(l9hVar);
                    }
                    i2++;
                }
                if (!b9eVar.a.isEmpty()) {
                    yde.b.a().getClass();
                }
                return new m9h(new btg(map5));
        }
    }

    public Object y(g3d g3dVar) {
        return this.d;
    }

    public final Object z(float f, float f2, Object obj, Object obj2, float f3, float f4, float f5) {
        g3d g3dVar = (g3d) this.b;
        g3dVar.a = f;
        g3dVar.b = f2;
        g3dVar.c = obj;
        g3dVar.d = obj2;
        g3dVar.e = f3;
        g3dVar.f = f4;
        g3dVar.g = f5;
        return y(g3dVar);
    }
}
