package com.opera.android.widget;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build;
import android.os.StrictMode;
import android.provider.Settings;
import android.text.Editable;
import android.text.Layout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.ViewStructure;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.opera.android.custom_views.ObservableEditText;
import defpackage.aik;
import defpackage.dll;
import defpackage.frk;
import defpackage.hjf;
import defpackage.ip2;
import defpackage.pde;
import defpackage.q9n;
import defpackage.rpm;
import defpackage.tpm;
import defpackage.u8n;
import defpackage.vr3;
import defpackage.wpg;
import defpackage.wpm;
import defpackage.wqm;
import defpackage.wv7;
import defpackage.x5f;
import defpackage.xwj;
import defpackage.ywj;
import java.util.Arrays;
import java.util.Locale;

/* loaded from: classes.dex */
public class UrlFieldEditText extends ObservableEditText implements wpm {
    public static final /* synthetic */ int i0 = 0;
    public boolean A;
    public final tpm B;
    public final tpm C;
    public final vr3 D;
    public int E;
    public CharSequence F;
    public String G;
    public boolean H;
    public boolean I;
    public int J;
    public int K;
    public int L;
    public int M;
    public boolean N;
    public boolean O;
    public int P;
    public int Q;
    public byte R;
    public String S;
    public int T;
    public int U;
    public float V;
    public boolean W;
    public String a0;
    public wpg b0;
    public esk c0;
    public boolean d0;
    public int e0;
    public int f0;
    public byte g0;
    public boolean h0;
    public final AccessibilityManager v;
    public final pde w;
    public ywj x;
    public boolean y;
    public x5f z;

    /* JADX WARN: Multi-variable type inference failed */
    public UrlFieldEditText(Context context) {
        byte b;
        super(context);
        this.w = new pde(Boolean.TRUE);
        this.v = (AccessibilityManager) context.getSystemService("accessibility");
        tpm tpmVar = new tpm();
        this.B = tpmVar;
        tpm tpmVar2 = new tpm();
        this.C = tpmVar2;
        this.D = new vr3(this);
        this.E = -1;
        this.F = "";
        this.G = "";
        this.J = -1;
        this.K = -1;
        byte b2 = 0;
        this.Q = 0;
        this.c0 = new frk((byte) 2);
        tpmVar.a = getHintTextColors();
        tpmVar2.a = getTextColors();
        invalidate();
        rpm rpmVar = new rpm(this, b2);
        l5b l5bVar = q9n.c;
        dll dllVarV = hjf.v(getContext());
        if (dllVarV != null) {
            u8n.b(dllVarV, this, rpmVar);
        }
        int[] drawableState = getDrawableState();
        if (Arrays.equals(tpmVar.b, drawableState)) {
            b = 0;
        } else {
            tpmVar.b = drawableState;
            b = 1;
        }
        int[] drawableState2 = getDrawableState();
        if (!Arrays.equals(tpmVar2.b, drawableState2)) {
            tpmVar2.b = drawableState2;
            b2 = 1;
        }
        if ((b | b2) != 0) {
            invalidate();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public UrlFieldEditText(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        byte b;
        super(context, attributeSet);
        this.w = new pde(Boolean.TRUE);
        this.v = (AccessibilityManager) context.getSystemService("accessibility");
        tpm tpmVar = new tpm();
        this.B = tpmVar;
        tpm tpmVar2 = new tpm();
        this.C = tpmVar2;
        this.D = new vr3(this);
        this.E = -1;
        this.F = "";
        this.G = "";
        this.J = -1;
        this.K = -1;
        byte b2 = 0;
        this.Q = 0;
        this.c0 = new frk((byte) 2);
        tpmVar.a = getHintTextColors();
        tpmVar2.a = getTextColors();
        invalidate();
        rpm rpmVar = new rpm(this, b2);
        l5b l5bVar = q9n.c;
        dll dllVarV = hjf.v(getContext());
        if (dllVarV != null) {
            u8n.b(dllVarV, this, rpmVar);
        }
        int[] drawableState = getDrawableState();
        if (Arrays.equals(tpmVar.b, drawableState)) {
            b = 0;
        } else {
            tpmVar.b = drawableState;
            b = 1;
        }
        int[] drawableState2 = getDrawableState();
        if (!Arrays.equals(tpmVar2.b, drawableState2)) {
            tpmVar2.b = drawableState2;
            b2 = 1;
        }
        if ((b | b2) != 0) {
            invalidate();
        }
    }

    public final void A(boolean z) {
        ywj ywjVar = this.x;
        if (ywjVar != null) {
            ywjVar.i = z;
        }
        xf8.F0(this.w, Boolean.valueOf(z));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void B(CharSequence charSequence, String str, int i, int i2) {
        if (charSequence == null) {
            charSequence = "";
        }
        String[] strArr = aik.a;
        if (str == null) {
            str = "";
        }
        if (TextUtils.equals(getText(), charSequence) && this.G.equals(str)) {
            return;
        }
        A(true);
        this.F = charSequence;
        this.G = str;
        setText(charSequence);
        if (i == 1) {
            this.f0 = i2;
        } else {
            this.f0 = 0;
        }
        this.g0 = i;
        boolean zIsLayoutRequested = isLayoutRequested();
        byte b = this.g0;
        if (zIsLayoutRequested) {
            this.O = b != 0;
        } else {
            v(b);
        }
        A(false);
    }

    public final boolean C() {
        ywj ywjVar = this.x;
        if (ywjVar == null) {
            return false;
        }
        ip2 ip2Var = ywjVar.c;
        if (ywjVar.j != 0 || !ywjVar.h || !ip2Var.d()) {
            return false;
        }
        String string = Settings.Secure.getString(ywjVar.a.getContext().getContentResolver(), "default_input_method");
        if (string == null) {
            string = "";
        }
        if (string.contains(".iqqi") || string.contains("omronsoft") || string.contains(".iwnn")) {
            return false;
        }
        return ywj.o.matcher(ip2Var.a.toString()).matches();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void D() {
        if (this.b0 == null || getWidth() == 0 || isFocused()) {
            return;
        }
        if (((Boolean) this.c0.get()).booleanValue() || isInLayout()) {
            postOnAnimation(new wv7(this, (byte) 2));
            return;
        }
        int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
        wpg wpgVar = this.b0;
        String str = wpgVar.c <= width ? wpgVar.b : wpgVar.a;
        if (str != getHint()) {
            g(str);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void E(boolean z) {
        int iIndexOf;
        Editable text = getText();
        String string = text.toString();
        boolean zIsFocused = isFocused();
        tpm tpmVar = this.B;
        text.removeSpan(tpmVar);
        tpm tpmVar2 = this.C;
        text.removeSpan(tpmVar2);
        int i = 0;
        if (zIsFocused) {
            text.setSpan(tpmVar2, 0, text.length(), 18);
        }
        vr3 vr3Var = this.D;
        if (vr3Var.b != zIsFocused) {
            vr3Var.b = zIsFocused;
            if (zIsFocused) {
                ValueAnimator valueAnimator = (ValueAnimator) vr3Var.d;
                valueAnimator.cancel();
                valueAnimator.setFloatValues(0.0f, 1.0f);
                valueAnimator.start();
                ((UrlFieldEditText) vr3Var.c).setHighlightColor(vr3Var.a);
            }
        }
        if (zIsFocused || !z) {
            return;
        }
        String[] strArr = wqm.a;
        int iIndexOf2 = string.indexOf(58);
        if (iIndexOf2 != -1 && ((iIndexOf = string.indexOf(47)) == -1 || iIndexOf >= iIndexOf2)) {
            if (string.startsWith("://", iIndexOf2)) {
                i = iIndexOf2 + 3;
                if (string.startsWith("www.", i)) {
                    i = iIndexOf2 + 7;
                }
            } else {
                i = iIndexOf2 + 1;
            }
        }
        int iIndexOf3 = string.indexOf(47, i);
        if (iIndexOf3 != -1) {
            text.setSpan(tpmVar, iIndexOf3, text.length(), 33);
        }
    }

    @Override // defpackage.wpm
    public final int L() {
        return this.Q;
    }

    public final boolean bringPointIntoView(int i) {
        if (i != this.E && this.N) {
            return o(i);
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [android.widget.EditText, com.opera.android.custom_views.ObservableEditText, com.opera.android.widget.UrlFieldEditText] */
    @Override // com.opera.android.custom_views.ObservableEditText
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean zDispatchKeyEvent;
        ywj ywjVar = this.x;
        if (ywjVar == null) {
            return super.dispatchKeyEvent(keyEvent);
        }
        ip2 ip2Var = ywjVar.c;
        ?? r1 = ywjVar.a;
        xwj xwjVar = ywjVar.g;
        if (xwjVar == null) {
            return super.dispatchKeyEvent(keyEvent);
        }
        xwjVar.d();
        if (ip2Var.c() && keyEvent.getAction() == 0) {
            zDispatchKeyEvent = true;
            if (keyEvent.getKeyCode() == 112) {
                ywjVar.e.b = "";
                ip2Var.b = "";
                ywjVar.h = false;
            } else {
                int keyCode = keyEvent.getKeyCode();
                if (keyCode == 123 || keyCode == 122 || keyCode == 21 || keyCode == 22) {
                    int i = ip2Var.c;
                    int length = ip2Var.a.length();
                    if (ip2Var.c()) {
                        length += ip2Var.b.length();
                    }
                    ywjVar.g.a();
                    r1.setSelection(i, length);
                    zDispatchKeyEvent = super.dispatchKeyEvent(keyEvent);
                } else if (keyEvent.getKeyCode() == 61) {
                    ywjVar.g.a();
                } else {
                    zDispatchKeyEvent = super.dispatchKeyEvent(keyEvent);
                }
            }
        } else {
            if (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 112) {
                ywjVar.h = false;
            }
            zDispatchKeyEvent = super.dispatchKeyEvent(keyEvent);
        }
        ywjVar.g.e();
        return zDispatchKeyEvent;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void drawableStateChanged() {
        boolean z;
        super.drawableStateChanged();
        tpm tpmVar = this.B;
        if (tpmVar != null) {
            int[] drawableState = getDrawableState();
            boolean z2 = false;
            if (Arrays.equals(tpmVar.b, drawableState)) {
                z = false;
            } else {
                tpmVar.b = drawableState;
                z = true;
            }
            int[] drawableState2 = getDrawableState();
            tpm tpmVar2 = this.C;
            if (!Arrays.equals(tpmVar2.b, drawableState2)) {
                tpmVar2.b = drawableState2;
                z2 = true;
            }
            if (z || z2) {
                invalidate();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int getTextDirection() {
        if (this.I) {
            return 3;
        }
        return super/*android.view.View*/.getTextDirection();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean o(int i) {
        if (this.A) {
            return false;
        }
        return super/*android.widget.TextView*/.bringPointIntoView(i);
    }

    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (inputConnectionOnCreateInputConnection == null && this.x == null) {
            return null;
        }
        p();
        ywj ywjVar = this.x;
        bq1 bq1Var = ywjVar.a;
        ywjVar.l = bq1Var.getSelectionStart();
        ywjVar.m = bq1Var.getSelectionEnd();
        ywjVar.j = 0;
        if (inputConnectionOnCreateInputConnection == null) {
            ywjVar.g = null;
            return null;
        }
        xwj xwjVar = new xwj(ywjVar);
        ywjVar.g = xwjVar;
        xwjVar.setTarget(inputConnectionOnCreateInputConnection);
        return ywjVar.g;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (Build.VERSION.SDK_INT == 29) {
            ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.opera.android.custom_views.ObservableEditText, com.opera.android.custom_views.OperaEditText
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        this.E = (!z || getText() == null) ? -1 : getText().length();
        this.N = z;
        t(z, i, rect);
        if (!z || this.h0) {
            return;
        }
        this.O = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            super/*android.view.View*/.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        } finally {
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super/*android.view.View*/.onLayout(z, i, i2, i3, i4);
        if (this.O) {
            v(this.g0);
            return;
        }
        int i5 = i3 - i;
        if (this.P != i5) {
            v(this.g0);
            this.P = i5;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onMeasure(int i, int i2) {
        if (this.J == i && this.K == i2 && getLayout() != null) {
            setMeasuredDimension(this.L, this.M);
            return;
        }
        this.J = i;
        this.K = i2;
        super/*android.view.View*/.onMeasure(i, i2);
        this.L = getMeasuredWidth();
        this.M = getMeasuredHeight();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean onPreDraw() {
        boolean zOnPreDraw = super/*android.widget.TextView*/.onPreDraw();
        if (!this.A) {
            return zOnPreDraw;
        }
        this.A = false;
        bringPointIntoView(getSelectionStart());
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onProvideAutofillStructure(ViewStructure viewStructure, int i) {
        if (!TextUtils.isEmpty(this.a0)) {
            Uri uri = Uri.parse(this.a0);
            String scheme = uri.getScheme();
            String host = uri.getHost();
            if (("http".equals(scheme) || "https".equals(scheme)) && !TextUtils.isEmpty(host)) {
                viewStructure.setWebDomain(new Uri.Builder().scheme(scheme).authority(host).build().toString());
            }
        }
        super/*android.view.View*/.onProvideAutofillStructure(viewStructure, i);
        viewStructure.setId(getId(), getContext().getPackageName(), "id", "url_bar");
    }

    @Override // com.opera.android.custom_views.ObservableEditText
    public final void onSelectionChanged(int i, int i2) {
        if (i2 != this.E) {
            this.E = -1;
        }
        u(i, i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super/*android.view.View*/.onSizeChanged(i, i2, i3, i4);
        D();
        boolean z = (getGravity() & 5) == 5;
        Layout layout = getLayout();
        if (!this.H || layout == null) {
            return;
        }
        if (z) {
            scrollTo(getPaddingRight() + getPaddingLeft() + (layout.getWidth() - i), 0);
        } else {
            scrollTo(0, 0);
        }
    }

    @Override // com.opera.android.custom_views.OperaEditText
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        this.y = false;
        ywj ywjVar = this.x;
        if (ywjVar != null) {
            ywjVar.d(charSequence);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.opera.android.custom_views.ObservableEditText, com.opera.android.custom_views.OperaEditText
    public final boolean onTextContextMenuItem(int i) {
        if ((i != 16908321 && i != 16908320) || getSelectionStart() != 0 || getSelectionEnd() != getText().length() || !TextUtils.equals(getText(), this.F)) {
            return super.onTextContextMenuItem(i);
        }
        setText(this.G);
        setSelection(0, this.G.length());
        boolean zOnTextContextMenuItem = super.onTextContextMenuItem(i);
        if (i == 16908321) {
            setText(this.F);
        }
        return zOnTextContextMenuItem;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.Q = motionEvent.getSource();
        }
        return super/*android.view.View*/.onTouchEvent(motionEvent);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void p() {
        if (this.x != null) {
            return;
        }
        this.x = new ywj(this, this.z);
        boolean zBooleanValue = ((Boolean) this.w.g()).booleanValue();
        A(true);
        ywj ywjVar = this.x;
        if (hasFocus()) {
            ywjVar.getClass();
        } else {
            ip2 ip2Var = ywjVar.d;
            ip2Var.c = 0;
            ip2Var.d = 0;
            ip2 ip2Var2 = ywjVar.c;
            ip2Var2.c = 0;
            ip2Var2.d = 0;
        }
        this.x.c(getText());
        ywj ywjVar2 = this.x;
        Editable text = getText();
        getText().length();
        ywjVar2.d(text);
        this.x.b(getSelectionStart(), getSelectionEnd());
        if (this.y) {
            this.x.getClass();
        }
        A(zBooleanValue);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final CharSequence q() {
        ywj ywjVar = this.x;
        if (ywjVar != null) {
            return ywjVar.c.b();
        }
        Editable text = getText();
        String[] strArr = aik.a;
        return text == null ? "" : text;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final CharSequence r() {
        ywj ywjVar = this.x;
        if (ywjVar != null) {
            return ywjVar.c.a;
        }
        Editable text = getText();
        String[] strArr = aik.a;
        return text == null ? "" : text;
    }

    public final boolean s() {
        ywj ywjVar = this.x;
        if (ywjVar == null) {
            return false;
        }
        return ywjVar.c.c();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        int eventType = accessibilityEvent.getEventType();
        if (eventType == 8192 || eventType == 16) {
            pde pdeVar = this.w;
            if (pdeVar == null || ((Boolean) pdeVar.g()).booleanValue()) {
                return;
            }
            ywj ywjVar = this.x;
            if (ywjVar != null && ywjVar.n) {
                return;
            }
        }
        super/*android.view.View*/.sendAccessibilityEventUnchecked(accessibilityEvent);
    }

    public final void setHighlightColor(int i) {
        vr3 vr3Var = this.D;
        if (vr3Var == null) {
            z(i);
            return;
        }
        vr3Var.a = i;
        ValueAnimator valueAnimator = (ValueAnimator) vr3Var.d;
        z(p37.a0((!valueAnimator.isStarted() || valueAnimator.isRunning()) ? ((Float) valueAnimator.getAnimatedValue()).floatValue() : 0.0f, i));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setHorizontallyScrolling(boolean z) {
        super/*android.widget.TextView*/.setHorizontallyScrolling(z);
        this.H = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        this.A = false;
        if (!TextUtils.equals(getEditableText(), charSequence)) {
            StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
            try {
                super/*android.widget.TextView*/.setText(charSequence, bufferType);
            } finally {
                StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
            }
        }
        ywj ywjVar = this.x;
        if (ywjVar != null) {
            ywjVar.c(charSequence);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void t(boolean z, int i, Rect rect) {
        ywj ywjVar = this.x;
        if (ywjVar != null && !z) {
            ip2 ip2Var = ywjVar.d;
            ip2Var.c = 0;
            ip2Var.d = 0;
            ip2 ip2Var2 = ywjVar.c;
            ip2Var2.c = 0;
            ip2Var2.d = 0;
        }
        super.onFocusChanged(z, i, rect);
        setCursorVisible(z);
    }

    public final void u(int i, int i2) {
        ywj ywjVar = this.x;
        if (ywjVar != null) {
            ywjVar.b(i, i2);
        }
        super.onSelectionChanged(i, i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void v(int i) {
        int iMax;
        float f;
        float f2;
        this.O = false;
        if (!this.N || this.h0) {
            Editable text = getText();
            byte b = TextUtils.isEmpty(text) ? 2 : i;
            if (!this.h0) {
                setSelection(0);
            }
            float textSize = getTextSize();
            boolean zW = cs5.W(this);
            int measuredWidth = getMeasuredWidth() - (getPaddingRight() + getPaddingLeft());
            if (b == this.R && TextUtils.equals(text, this.S) && measuredWidth == this.T && textSize == this.V && zW == this.W) {
                scrollTo(this.U, getScrollY());
                return;
            }
            if (b != 0) {
                float fMax = 0.0f;
                if (b == 1) {
                    Editable text2 = getText();
                    int measuredWidth2 = getMeasuredWidth() - (getPaddingRight() + getPaddingLeft());
                    Layout layout = getLayout();
                    int iMin = Math.min(this.f0, text2.length());
                    text2.length();
                    float primaryHorizontal = layout.getPrimaryHorizontal(iMin);
                    int i2 = iMin - 1;
                    float primaryHorizontal2 = layout.getPrimaryHorizontal(Math.max(0, i2));
                    float fMax2 = Math.max(0, computeHorizontalScrollRange() - measuredWidth2);
                    int horizontalFadingEdgeLength = getHorizontalFadingEdgeLength();
                    if (primaryHorizontal2 < primaryHorizontal) {
                        f2 = primaryHorizontal - measuredWidth2;
                    } else {
                        int iMax2 = Math.max(0, i2);
                        int i3 = iMin - 2;
                        while (true) {
                            int i4 = i3;
                            iMax = iMax2;
                            iMax2 = i4;
                            if (iMax2 >= 0) {
                                if (layout.getPrimaryHorizontal(iMax2) <= primaryHorizontal) {
                                    iMax = Math.max(0, iMax - 1);
                                    break;
                                }
                                i3 = iMax2 - 1;
                            } else {
                                break;
                            }
                        }
                        float fMeasureText = layout.getPaint().measureText(text2.subSequence(iMax, iMin).toString());
                        float f3 = measuredWidth2;
                        if (fMeasureText < f3) {
                            f2 = (primaryHorizontal + fMeasureText) - f3;
                        } else {
                            f = primaryHorizontal - horizontalFadingEdgeLength;
                            scrollTo((int) cs5.s(f, 0.0f, fMax2), getScrollY());
                        }
                    }
                    f = f2 + horizontalFadingEdgeLength;
                    scrollTo((int) cs5.s(f, 0.0f, fMax2), getScrollY());
                } else if (b == 2) {
                    if (this.H) {
                        Editable text3 = getText();
                        int measuredWidth3 = getMeasuredWidth() - (getPaddingRight() + getPaddingLeft());
                        if (cs5.W(this)) {
                            if (TextUtils.isEmpty(text3)) {
                                String str = be3.b;
                                be3 be3Var = TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1 ? be3.e : be3.d;
                                CharSequence hint = getHint();
                                be3Var.getClass();
                                if (kgl.c.k(hint.length(), hint)) {
                                    fMax = ((int) getLayout().getPrimaryHorizontal(0)) - measuredWidth3;
                                }
                            } else if (cs5.J(text3) != 0) {
                                fMax = Math.max(0.0f, (getLayout().getPrimaryHorizontal(text3.length()) - measuredWidth3) + getLayout().getPaint().measureText(text3.toString()));
                            }
                        }
                        scrollTo((int) fMax, getScrollY());
                    } else {
                        scrollTo(getScrollX(), 0);
                    }
                }
                this.R = b;
                this.S = text.toString();
                this.T = measuredWidth;
                this.V = textSize;
                this.U = getScrollX();
                this.W = zW;
            }
        }
    }

    public final void x(CharSequence charSequence, CharSequence charSequence2) {
        if (!TextUtils.isEmpty(charSequence2)) {
            this.A = true;
        }
        ywj ywjVar = this.x;
        if (ywjVar != null) {
            ywjVar.e.f(charSequence.length(), charSequence.length(), charSequence, charSequence2);
            xwj xwjVar = ywjVar.g;
            if (xwjVar != null) {
                xwjVar.d();
                ywjVar.g.e();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void y(boolean z) {
        if (this.d0 != z) {
            this.d0 = z;
            invalidate();
            if (z) {
                this.e0 = getScrollBarSize();
                setScrollBarSize(0);
                return;
            }
            setScrollBarSize(this.e0);
            if (canScrollVertically(-1) || canScrollVertically(1) || canScrollHorizontally(-1) || canScrollHorizontally(1)) {
                awakenScrollBars();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void z(int i) {
        super/*android.widget.TextView*/.setHighlightColor(i);
        if (s()) {
            ywj ywjVar = this.x;
            if ((ywjVar == null ? 0 : ywjVar.c.b.length()) > 0) {
                ywj ywjVar2 = this.x;
                xwj xwjVar = ywjVar2 == null ? null : ywjVar2.g;
                if (xwjVar != null) {
                    xwjVar.beginBatchEdit();
                    xwjVar.endBatchEdit();
                }
            }
        }
    }
}
