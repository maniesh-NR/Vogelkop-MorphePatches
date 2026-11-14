package com.opera.android.custom_views;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.icu.text.Normalizer2;
import android.os.SystemClock;
import android.text.Editable;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.TextView;
import com.opera.android.downloads.SaveSheet;
import defpackage.dll;
import defpackage.hjf;
import defpackage.iji;
import defpackage.k2c;
import defpackage.khh;
import defpackage.kkf;
import defpackage.l2c;
import defpackage.lgl;
import defpackage.mgf;
import defpackage.q9n;
import defpackage.u8n;
import defpackage.uk7;
import defpackage.vdf;
import defpackage.vml;
import defpackage.vr3;

/* loaded from: classes.dex */
public class OperaEditText extends bq1 implements k2c, lgl {
    public static final /* synthetic */ int r = 0;
    public final boolean g;
    public final vr3 h;
    public final zg i;
    public final l2c j;
    public final fr k;
    public boolean l;
    public String m;
    public final int n;
    public boolean o;
    public boolean p;
    public uk7 q;

    /* JADX WARN: Multi-variable type inference failed */
    public OperaEditText(Context context) {
        super(context, (AttributeSet) null, 0);
        this.h = new vr3((TextView) this);
        this.i = new zg(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public OperaEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        byte b = 0;
        vr3 vr3Var = new vr3((TextView) this);
        this.h = vr3Var;
        zg zgVar = new zg(this);
        this.i = zgVar;
        if (attributeSet != null) {
            vr3Var.g(attributeSet, 0);
            this.j = new l2c(this, this, attributeSet);
            Resources.Theme theme = context.getTheme();
            int[] iArr = khh.u;
            TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
            try {
                boolean z = typedArrayObtainStyledAttributes.getBoolean(3, true);
                typedArrayObtainStyledAttributes.recycle();
                this.g = z;
                TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr);
                this.l = typedArrayObtainStyledAttributes2.getBoolean(2, false);
                this.m = typedArrayObtainStyledAttributes2.getString(0);
                this.n = typedArrayObtainStyledAttributes2.getInt(1, Integer.MAX_VALUE);
                typedArrayObtainStyledAttributes2.recycle();
                if (this.m != null && ((getText() == null || getText().length() == 0) && !this.o)) {
                    this.o = true;
                    super/*android.widget.TextView*/.setHint(this.m);
                    setMaxLines(1);
                    setEllipsize(TextUtils.TruncateAt.END);
                }
                zgVar.u(context, attributeSet, 0);
                fr frVarF = fr.f(context, attributeSet);
                this.k = frVarF;
                if (frVarF != null) {
                    frVarF.e(this);
                }
                kkf kkfVar = new kkf(this, b);
                l5b l5bVar = q9n.c;
                dll dllVarV = hjf.v(getContext());
                if (dllVarV == null) {
                    return;
                }
                u8n.b(dllVarV, this, kkfVar);
            } catch (Throwable th) {
                typedArrayObtainStyledAttributes.recycle();
                throw th;
            }
        }
    }

    public static void h(Editable editable) {
        for (CharacterStyle characterStyle : (CharacterStyle[]) editable.getSpans(0, editable.length(), CharacterStyle.class)) {
            editable.removeSpan(characterStyle);
        }
        Normalizer2 nFKDInstance = Normalizer2.getNFKDInstance();
        int iSpanQuickCheckYes = nFKDInstance.spanQuickCheckYes(editable);
        int length = editable.length();
        if (iSpanQuickCheckYes == length) {
            return;
        }
        editable.replace(iSpanQuickCheckYes, length, nFKDInstance.normalize(editable.subSequence(iSpanQuickCheckYes, length)));
    }

    @Override // defpackage.k2c
    public final l2c b() {
        return this.j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int i;
        uk7 uk7Var = this.q;
        if (uk7Var != null && uk7Var.b != null) {
            Drawable drawable = uk7Var.c;
            if (drawable != null && (i = uk7Var.d) != 0) {
                uk7Var.a(motionEvent, drawable, i);
            }
            if (uk7Var.c == null || uk7Var.d == 0) {
                Drawable[] compoundDrawables = uk7Var.a.getCompoundDrawables();
                for (int i2 = 0; i2 < compoundDrawables.length; i2++) {
                    Drawable drawable2 = compoundDrawables[i2];
                    int i3 = vep.B(4)[i2];
                    if (drawable2 != null && uk7Var.a(motionEvent, drawable2, i3)) {
                        break;
                    }
                }
            }
            if (uk7Var.c != null && uk7Var.d != 0) {
                if (motionEvent.getAction() == 1) {
                    mgf mgfVar = uk7Var.b;
                    iji ijiVar = (iji) mgfVar.b;
                    SaveSheet.FilenameEditText filenameEditText = (SaveSheet.FilenameEditText) mgfVar.c;
                    if (ijiVar.v) {
                        filenameEditText.setText("");
                        return true;
                    }
                    ijiVar.f();
                }
                return true;
            }
        }
        return super/*android.view.View*/.dispatchTouchEvent(motionEvent);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean f(int i) {
        long jUptimeMillis = SystemClock.uptimeMillis();
        long longPressTimeout = (jUptimeMillis - ViewConfiguration.getLongPressTimeout()) - 1;
        int selectionStart = getSelectionStart();
        int selectionEnd = getSelectionEnd();
        float width = getWidth() / 2.0f;
        float height = getHeight() / 2.0f;
        MotionEvent motionEventObtain = MotionEvent.obtain(longPressTimeout, longPressTimeout, 0, width, height, 0);
        motionEventObtain.setSource(i);
        boolean zOnTouchEvent = onTouchEvent(motionEventObtain);
        motionEventObtain.recycle();
        if (selectionStart != selectionEnd) {
            setSelection(selectionStart, selectionEnd);
        }
        if (zOnTouchEvent) {
            this.p = true;
            performLongClick();
            this.p = false;
            MotionEvent motionEventObtain2 = MotionEvent.obtain(longPressTimeout, jUptimeMillis, 1, width, height, 0);
            motionEventObtain2.setSource(i);
            onTouchEvent(motionEventObtain2);
            motionEventObtain2.recycle();
        }
        return zOnTouchEvent;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void g(String str) {
        super/*android.widget.TextView*/.setHint(str);
        this.m = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.k2c
    public final void i(int i) {
        zg zgVar = this.i;
        if (zgVar != null && ((((Drawable) zgVar.c) != null || ((Drawable) zgVar.d) != null) && zgVar.a != i)) {
            zgVar.L(i, false);
        }
        fr frVar = this.k;
        if (frVar != null) {
            frVar.e(this);
        }
        refreshDrawableState();
        this.h.c();
        k();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void j() {
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(new int[]{2130969971});
        try {
            if (typedArrayObtainStyledAttributes.getBoolean(0, false)) {
                setImeOptions(getImeOptions() | 16777216);
            } else {
                setImeOptions(getImeOptions() & (-16777217));
            }
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void k() {
        boolean z = true;
        if (this.n > 1) {
            return;
        }
        boolean z2 = (getGravity() & 5) == 5;
        if (TextUtils.isEmpty(getText()) && z2) {
            z = false;
        }
        setHorizontallyScrolling(z);
    }

    @Override // defpackage.lgl
    public final boolean l() {
        l2c l2cVar = this.j;
        if (l2cVar == null) {
            return false;
        }
        return l2cVar.b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onAttachedToWindow() {
        j();
        super/*android.view.View*/.onAttachedToWindow();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFocusChanged(boolean z, int i, Rect rect) {
        super/*android.view.View*/.onFocusChanged(z, i, rect);
        if (this.l && z) {
            this.l = false;
            vml.c(new vdf(this, (byte) 4));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super/*android.widget.TextView*/.onTextChanged(charSequence, i, i2, i3);
        if (this.m != null) {
            int length = charSequence.length();
            boolean z = this.o;
            if (length == 0) {
                if (!z) {
                    this.o = true;
                    super/*android.widget.TextView*/.setHint(this.m);
                    setMaxLines(1);
                    setEllipsize(TextUtils.TruncateAt.END);
                }
            } else if (z) {
                this.o = false;
                super/*android.widget.TextView*/.setHint(null);
                setMaxLines(this.n);
            }
        }
        vr3 vr3Var = this.h;
        if (vr3Var != null) {
            vr3Var.k();
        }
        k();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean onTextContextMenuItem(int i) {
        boolean zOnTextContextMenuItem = super.onTextContextMenuItem(i);
        if (i == 16908322 && this.g) {
            h(getEditableText());
        }
        return zOnTextContextMenuItem;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean performHapticFeedback(int i, int i2) {
        return !this.p && super/*android.view.View*/.performHapticFeedback(i, i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean performLongClick() {
        try {
            return super/*android.view.View*/.performLongClick();
        } catch (ClassCastException unused) {
            return true;
        }
    }
}
