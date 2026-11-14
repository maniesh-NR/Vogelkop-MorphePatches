package defpackage;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Selection;
import android.text.Spannable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.DragEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;

/* loaded from: classes.dex */
public class bq1 extends EditText {
    public final hp1 a;
    public final wq1 b;
    public final ukl c;
    public final pad d;
    public zy9 e;
    public vq1 f;

    public bq1(Context context, AttributeSet attributeSet, int i) throws Resources.NotFoundException {
        super(context, attributeSet, 2130969588);
        gll.a(getContext(), this);
        hp1 hp1Var = new hp1(this);
        this.a = hp1Var;
        hp1Var.b(attributeSet, 2130969588);
        wq1 wq1Var = new wq1(this);
        this.b = wq1Var;
        wq1Var.e(attributeSet, 2130969588);
        wq1Var.b();
        this.c = new ukl();
        pad padVar = new pad(this);
        this.d = padVar;
        padVar.o(attributeSet, 2130969588);
        KeyListener keyListener = getKeyListener();
        if (keyListener instanceof NumberKeyListener) {
            return;
        }
        boolean zIsFocusable = super.isFocusable();
        boolean zIsClickable = super.isClickable();
        boolean zIsLongClickable = super.isLongClickable();
        int inputType = super.getInputType();
        KeyListener keyListenerI = padVar.i(keyListener);
        if (keyListenerI != keyListener) {
            super.setKeyListener(keyListenerI);
            super.setRawInputType(inputType);
            super.setFocusable(zIsFocusable);
            super.setClickable(zIsClickable);
            super.setLongClickable(zIsLongClickable);
        }
    }

    public final vq1 c() {
        vq1 vq1Var = this.f;
        if (vq1Var != null) {
            return vq1Var;
        }
        vq1 vq1Var2 = new vq1(this, new ip1(this, (byte) 1));
        this.f = vq1Var2;
        return vq1Var2;
    }

    @Override // android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        hp1 hp1Var = this.a;
        if (hp1Var != null) {
            hp1Var.a();
        }
        wq1 wq1Var = this.b;
        if (wq1Var != null) {
            wq1Var.b();
        }
    }

    public final sq5 e(sq5 sq5Var) {
        this.c.getClass();
        return ukl.a(this, sq5Var);
    }

    @Override // android.widget.TextView
    public final String getFontVariationSettings() {
        return c().e;
    }

    @Override // android.widget.EditText, android.widget.TextView
    public final CharSequence getText() {
        return super.getText();
    }

    @Override // android.widget.TextView
    public final TextClassifier getTextClassifier() {
        zy9 zy9Var = this.e;
        if (zy9Var == null) {
            zy9Var = new zy9(this);
            this.e = zy9Var;
        }
        return super.getTextClassifier();
    }

    @Override // android.widget.TextView
    public final Typeface getTypeface() {
        return c().c;
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        String[] strArrF;
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.b.getClass();
        int i = Build.VERSION.SDK_INT;
        if (i < 30 && inputConnectionOnCreateInputConnection != null) {
            sfe.B0(editorInfo, getText());
        }
        c09.x(editorInfo, inputConnectionOnCreateInputConnection, this);
        if (inputConnectionOnCreateInputConnection != null && i <= 30 && (strArrF = r5n.f(this)) != null) {
            editorInfo.contentMimeTypes = strArrF;
            inputConnectionOnCreateInputConnection = new n8b(inputConnectionOnCreateInputConnection, new bm8(this, (byte) 24));
        }
        return this.d.q(inputConnectionOnCreateInputConnection, editorInfo);
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i = Build.VERSION.SDK_INT;
        if (i < 30 || i >= 33) {
            return;
        }
        ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onDragEvent(DragEvent dragEvent) {
        Activity activity;
        oq5 nq5Var;
        if (Build.VERSION.SDK_INT < 31 && dragEvent.getLocalState() == null && r5n.f(this) != null) {
            Context context = getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    activity = null;
                    break;
                }
                if (context instanceof Activity) {
                    activity = (Activity) context;
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            }
            if (activity == null) {
                toString();
            } else if (dragEvent.getAction() != 1 && dragEvent.getAction() == 3) {
                activity.requestDragAndDropPermissions(dragEvent);
                int offsetForPosition = getOffsetForPosition(dragEvent.getX(), dragEvent.getY());
                beginBatchEdit();
                try {
                    Selection.setSelection((Spannable) getText(), offsetForPosition);
                    ClipData clipData = dragEvent.getClipData();
                    if (Build.VERSION.SDK_INT >= 31) {
                        nq5Var = new nq5(clipData, 3);
                    } else {
                        pq5 pq5Var = new pq5();
                        pq5Var.b = clipData;
                        pq5Var.c = (byte) 3;
                        nq5Var = pq5Var;
                    }
                    r5n.i(this, nq5Var.build());
                    return true;
                } finally {
                    endBatchEdit();
                }
            }
        }
        return super.onDragEvent(dragEvent);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public boolean onTextContextMenuItem(int i) {
        oq5 nq5Var;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31 || r5n.f(this) == null || !(i == 16908322 || i == 16908337)) {
            return super.onTextContextMenuItem(i);
        }
        ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
        ClipData primaryClip = clipboardManager == null ? null : clipboardManager.getPrimaryClip();
        if (primaryClip != null && primaryClip.getItemCount() > 0) {
            if (i2 >= 31) {
                nq5Var = new nq5(primaryClip, 1);
            } else {
                pq5 pq5Var = new pq5();
                pq5Var.b = primaryClip;
                pq5Var.c = (byte) 1;
                nq5Var = pq5Var;
            }
            nq5Var.d(i == 16908322 ? 0 : 1);
            r5n.i(this, nq5Var.build());
        }
        return true;
    }

    @Override // android.view.View
    public final void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        hp1 hp1Var = this.a;
        if (hp1Var != null) {
            hp1Var.c();
        }
    }

    @Override // android.view.View
    public final void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        hp1 hp1Var = this.a;
        if (hp1Var != null) {
            hp1Var.d(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        wq1 wq1Var = this.b;
        if (wq1Var != null) {
            wq1Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        wq1 wq1Var = this.b;
        if (wq1Var != null) {
            wq1Var.b();
        }
    }

    @Override // android.widget.TextView
    public final boolean setFontVariationSettings(String str) {
        return c().a(str);
    }

    @Override // android.widget.TextView
    public final void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.d.i(keyListener));
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) throws Resources.NotFoundException {
        super.setTextAppearance(context, i);
        wq1 wq1Var = this.b;
        if (wq1Var != null) {
            wq1Var.f(i, context);
        }
    }

    @Override // android.widget.TextView
    public final void setTextClassifier(TextClassifier textClassifier) {
        zy9 zy9Var = this.e;
        if (zy9Var == null) {
            zy9Var = new zy9(this);
            this.e = zy9Var;
        }
        super.setTextClassifier(textClassifier);
    }

    @Override // android.widget.TextView
    public final void setTypeface(Typeface typeface) {
        vq1 vq1VarC = c();
        vq1VarC.c = typeface;
        vq1VarC.d = typeface;
        vq1VarC.b.accept(typeface);
    }
}
