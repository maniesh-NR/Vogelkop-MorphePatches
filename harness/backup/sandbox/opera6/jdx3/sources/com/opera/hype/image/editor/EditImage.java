package com.opera.hype.image.editor;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PointF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import defpackage.al7;
import defpackage.at7;
import defpackage.ba3;
import defpackage.bfl;
import defpackage.bt7;
import defpackage.ci7;
import defpackage.cv2;
import defpackage.dya;
import defpackage.ean;
import defpackage.et7;
import defpackage.ew7;
import defpackage.ft7;
import defpackage.fya;
import defpackage.fz2;
import defpackage.i06;
import defpackage.i76;
import defpackage.i97;
import defpackage.it7;
import defpackage.jf7;
import defpackage.kk7;
import defpackage.lxa;
import defpackage.lxl;
import defpackage.m57;
import defpackage.mel;
import defpackage.n8g;
import defpackage.nil;
import defpackage.nsl;
import defpackage.o8g;
import defpackage.oel;
import defpackage.ox7;
import defpackage.qk3;
import defpackage.qp8;
import defpackage.qq6;
import defpackage.ra5;
import defpackage.rdb;
import defpackage.s5h;
import defpackage.tam;
import defpackage.up2;
import defpackage.vs7;
import defpackage.wg5;
import defpackage.whf;
import defpackage.ws7;
import defpackage.ydb;
import defpackage.ys7;
import defpackage.ywa;
import defpackage.ywl;
import defpackage.z61;
import defpackage.zs7;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b¨\u0006\t"}, d2 = {"Lcom/opera/hype/image/editor/EditImage;", "Landroid/widget/FrameLayout;", "qq6", "bt7", "gt7", "ht7", "ft7", "at7", "zs7", "image-editor"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final class EditImage extends FrameLayout {
    public static final /* synthetic */ xtb[] s = {new pee(EditImage.class, "textMode", "getTextMode()Lcom/opera/hype/image/editor/EditImage$TextMode;", 0)};
    public final float a;
    public final ean b;
    public final it7 c;
    public dya d;
    public final ywl e;
    public final kk7 f;
    public final bpd g;
    public final lxl h;
    public at7 i;
    public bfl j;
    public zs7 k;
    public final rdb l;
    public qq6 m;
    public final o8g n;
    public final qk3 o;
    public final et7 p;
    public final i76 q;
    public tam r;

    public EditImage(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0.0f, 12);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public EditImage(Context context, AttributeSet attributeSet, float f, int i) {
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        byte b = 8;
        f = (i & 8) != 0 ? 1.0f : f;
        byte b2 = 0;
        super(context, attributeSet, 0);
        this.a = f;
        ydb ydbVar = new ydb(context);
        ydbVar.D = true;
        ydbVar.E = true;
        ydbVar.F = true;
        ean eanVar = new ean(ydbVar);
        ydbVar.setId(View.generateViewId());
        addView(ydbVar, new FrameLayout.LayoutParams(-1, -1));
        this.b = eanVar;
        this.c = new it7(this, b2);
        this.d = new dya(Uri.EMPTY);
        this.e = new ywl(context, new ft7(this));
        this.f = new kk7(context, new i97(null, 7));
        this.g = new bpd(this);
        this.h = new lxl(new qq6(this, b), this);
        this.i = at7.f;
        this.k = zs7.a;
        this.l = new rdb(new ws7(this, b2));
        this.n = new o8g(this);
        this.o = new qk3(this);
        this.p = new et7(new bt7(-1, true, 0, nil.b, false, 0), this);
        this.q = new i76(this);
        this.r = new n57((byte) 29);
        setWillNotDraw(false);
        setFocusable(true);
        setFocusableInTouchMode(true);
    }

    public final void a(bfl bflVar, boolean z) {
        if (this.j != bflVar) {
            c(false, false);
            this.j = bflVar;
            if (z) {
                yq1 yq1Var = bflVar.f;
                if (yq1Var.requestFocus()) {
                    ((InputMethodManager) yq1Var.getContext().getSystemService("input_method")).showSoftInput(yq1Var, 1);
                }
            }
            bflVar.e(true, false);
            bflVar.f(true);
            qq6 qq6Var = this.m;
            if (qq6Var != null) {
                ba3 ba3Var = bflVar.b;
                lxa lxaVarG0 = ((ywa) qq6Var.b).g0();
                ra5 ra5Var = lxaVarG0.g;
                nak nakVar = lxaVarG0.n;
                nak nakVar2 = lxaVarG0.p;
                if (!(ba3Var instanceof oel)) {
                    if (ba3Var instanceof ox7) {
                        nakVar.j(nsl.i);
                        return;
                    }
                    return;
                }
                oel oelVar = (oel) ba3Var;
                nakVar.j(oelVar.l ? nsl.g : nsl.f);
                a36 a36Var = n8g.c;
                int i = oelVar.i();
                n8g n8gVar = ((s5h) nakVar2.getValue()).a;
                a36Var.getClass();
                n8g n8gVarK = a36.k(i, n8gVar, ra5Var);
                n8g n8gVarK2 = a36.k(oelVar.k(), ((s5h) nakVar2.getValue()).f, ra5Var);
                s5h s5hVar = (s5h) nakVar2.getValue();
                boolean zJ = oelVar.j();
                int iL = oelVar.l();
                boolean zU = oelVar.u();
                mel melVar = oelVar.p;
                xtb xtbVar = oel.t[3];
                nil nilVar = (nil) melVar.b;
                s5hVar.getClass();
                nakVar2.k((Object) null, new s5h(n8gVarK, zJ, iL, nilVar, zU, n8gVarK2));
            }
        }
    }

    public final bfl b(ba3 ba3Var) {
        byte b = 1;
        bfl bflVar = new bfl(getContext(), ba3Var, this.r, new al7(this, b));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 51;
        View view = bflVar.e;
        view.setLayoutParams(layoutParams);
        bpd bpdVar = this.g;
        i97 i97Var = (i97) bpdVar.c;
        if (i97Var.c((EditImage) bpdVar.b)) {
            bflVar.d(i97Var);
        }
        byte b2 = 0;
        TextView.OnEditorActionListener ys7Var = new ys7(this, b2);
        yq1 yq1Var = bflVar.f;
        yq1Var.setOnEditorActionListener(ys7Var);
        view.addOnLayoutChangeListener(new vs7(this, bflVar, b2));
        yq1Var.setOnFocusChangeListener(new up2(this, bflVar, b));
        ((ImageView) bflVar.d.k).setOnClickListener(new jf7(this, ba3Var, b));
        i06 i06Var = ew7.e;
        ci7 ci7Var = new ci7(1, this.l, rdb.class, "onUserInteracting", "onUserInteracting(Z)V", 0, (byte) 1);
        i06Var.getClass();
        TextWatcher ew7Var = new ew7(ci7Var);
        yq1Var.addTextChangedListener(ew7Var);
        yq1Var.addOnAttachStateChangeListener(new z61(ew7Var, (byte) 9));
        addView(view);
        return bflVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [android.view.View, com.opera.hype.image.editor.TextBoxEditText] */
    public final boolean c(boolean z, boolean z2) {
        bfl bflVar = this.j;
        if (bflVar == null) {
            return false;
        }
        ba3 ba3Var = bflVar.b;
        this.j = null;
        ?? r4 = bflVar.f;
        if (z) {
            ba3Var.e.g(ba3.j[0], String.valueOf(r4.getText()));
            dya dyaVar = ((EditImage) bflVar.c.b).d;
            if (CollectionsKt.E(dyaVar, ba3Var)) {
                if (!bflVar.a() && !bflVar.b()) {
                    dyaVar.c(ba3Var);
                }
            } else if (bflVar.a() || bflVar.b()) {
                ba3Var.d(null);
                dyaVar.b(ba3Var);
            }
        } else {
            ba3Var.h(r4);
        }
        if (r4 != 0) {
            r4.clearFocus();
            if (r4.getWindowToken() != null) {
                ((InputMethodManager) r4.getContext().getSystemService("input_method")).hideSoftInputFromWindow(r4.getWindowToken(), 0);
            }
        }
        bflVar.e(false, z2);
        bflVar.f(false);
        if (!CollectionsKt.E(this.d, ba3Var)) {
            removeView(bflVar.e);
        }
        qq6 qq6Var = this.m;
        if (qq6Var == null) {
            return true;
        }
        lxa lxaVarG0 = ((ywa) qq6Var.b).g0();
        List list = lxaVarG0.f;
        nak nakVar = lxaVarG0.n;
        if (CollectionsKt.E(list, nakVar.getValue())) {
            return true;
        }
        nakVar.j((Object) null);
        return true;
    }

    public final Bitmap d() {
        Drawable drawable = this.b.a.getDrawable();
        if (drawable == null) {
            return null;
        }
        if (drawable instanceof BitmapDrawable) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        if (drawable instanceof qp8) {
            return ((qp8) drawable).a;
        }
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        zs7 zs7Var = zs7.a;
        this.k = zs7Var;
        if (this.b.a.getDrawable() != null) {
            bpd bpdVar = this.g;
            i97 i97Var = (i97) bpdVar.c;
            i97 i97Var2 = (i97) bpdVar.c;
            EditImage editImage = (EditImage) bpdVar.b;
            if (i97Var.c(editImage)) {
                PointF pointF = i97Var.a;
                float f = pointF.x;
                float f2 = pointF.y;
                PointF pointF2 = i97Var.b;
                canvas.clipRect(f, f2, pointF2.x + f, pointF2.y + f2);
                this.k = zs7.b;
                super.dispatchDraw(canvas);
                this.k = zs7.c;
                if (this.i == at7.a) {
                    qk3 qk3Var = this.o;
                    fz2 fz2Var = qk3Var.c;
                    xtb xtbVar = qk3.d[0];
                    Bitmap bitmap = (Bitmap) fz2Var.b;
                    if (bitmap != null && i97Var2.c(editImage)) {
                        canvas.drawPath(this.h.c, qk3Var.b.f(getResources(), bitmap, i97Var2));
                    }
                }
                whf whfVar = new whf(this, (byte) 22);
                if (i97Var2.c(editImage)) {
                    int iSave = canvas.save();
                    PointF pointF3 = i97Var2.a;
                    canvas.translate(pointF3.x, pointF3.y);
                    whfVar.invoke(canvas, i97Var2);
                    canvas.restoreToCount(iSave);
                }
                bpdVar.c0(new cv2((Object) this, (Object) canvas, (byte) 27));
                this.k = zs7.d;
                super.dispatchDraw(canvas);
                this.k = zs7Var;
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        int iOrdinal = this.k.ordinal();
        ean eanVar = this.b;
        if (iOrdinal == 1) {
            if (Intrinsics.a(view, eanVar.a)) {
                return super.drawChild(canvas, view, j);
            }
            return false;
        }
        if (iOrdinal != 3 || Intrinsics.a(view, eanVar.a)) {
            return false;
        }
        return super.drawChild(canvas, view, j);
    }

    public final bfl e(ba3 ba3Var) {
        Object next;
        u39 u39Var = new u39(f());
        while (true) {
            if (!u39Var.hasNext()) {
                next = null;
                break;
            }
            next = u39Var.next();
            if (((bfl) next).b.equals(ba3Var)) {
                break;
            }
        }
        return (bfl) next;
    }

    public final v39 f() {
        return new v39(new m2m(new g6n(this), new m57((byte) 17)), false, new bli((byte) 13));
    }

    public final bt7 g() {
        xtb xtbVar = s[0];
        return (bt7) this.p.b;
    }

    public final void h(ba3 ba3Var) {
        bfl bflVar = this.j;
        if (bflVar != null) {
            if (!bflVar.b.equals(ba3Var)) {
                bflVar = null;
            }
            if (bflVar != null) {
                c(false, false);
            }
        }
        u39 u39Var = new u39(y1j.c(new g6n(this), new wg5(ba3Var, (byte) 28)));
        while (u39Var.hasNext()) {
            removeView((View) u39Var.next());
        }
    }

    public final void i(int i) {
        u39 u39Var = new u39(f());
        while (u39Var.hasNext()) {
            bfl bflVar = (bfl) u39Var.next();
            if (bflVar.b.e() > 1.0f) {
                bflVar.f.setLayerType(i, null);
            }
        }
    }

    public final void j(at7 at7Var) {
        if (this.i == at7Var) {
            return;
        }
        at7 at7Var2 = at7.c;
        if (at7Var != at7Var2 && at7Var != at7.d) {
            c(true, false);
        }
        this.e.b.g(ywl.c[0], Boolean.valueOf(at7Var == at7Var2 || at7Var == at7.d || at7Var == at7.f));
        this.i = at7Var;
        int iOrdinal = at7Var.ordinal();
        ean eanVar = this.b;
        lxl lxlVar = this.h;
        if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 4) {
            ydb ydbVar = eanVar.a;
            ydbVar.F = false;
            ydbVar.E = true;
            ydbVar.D = true;
            ((EditImage) lxlVar.a.b).b.a.setOnTouchListener(lxlVar);
            return;
        }
        if (iOrdinal != 6) {
            ydb ydbVar2 = eanVar.a;
            ydbVar2.F = true;
            ydbVar2.E = true;
            ydbVar2.D = true;
            lxlVar.b();
            ((EditImage) lxlVar.a.b).b.a.setOnTouchListener(null);
            return;
        }
        ydb ydbVar3 = eanVar.a;
        ydbVar3.F = false;
        ydbVar3.E = false;
        ydbVar3.D = false;
        lxlVar.b();
        ((EditImage) lxlVar.a.b).b.a.setOnTouchListener(null);
    }

    public final void k(dya dyaVar) {
        dya dyaVar2 = this.d;
        if (dyaVar2 != dyaVar) {
            ArrayList arrayList = dyaVar2.c;
            it7 it7Var = this.c;
            arrayList.remove(it7Var);
            int i = 0;
            c(false, false);
            ArrayList arrayList2 = this.d.d;
            int size = arrayList2.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList2.get(i2);
                i2++;
                it7Var.c((fya) obj);
            }
            this.d = dyaVar;
            WeakHashMap weakHashMap = r5n.a;
            if (!isLaidOut() || isLayoutRequested()) {
                addOnLayoutChangeListener(new ho3(this, (byte) 2));
                return;
            }
            this.d.c.add(it7Var);
            ArrayList arrayList3 = this.d.d;
            int size2 = arrayList3.size();
            while (i < size2) {
                Object obj2 = arrayList3.get(i);
                i++;
                it7Var.a((fya) obj2);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.e.onTouchEvent(motionEvent)) {
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }
}
