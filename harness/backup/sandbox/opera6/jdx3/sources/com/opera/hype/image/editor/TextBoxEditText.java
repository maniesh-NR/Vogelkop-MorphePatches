package com.opera.hype.image.editor;

import android.content.Context;
import android.text.Editable;
import android.text.InputFilter;
import android.text.method.ArrowKeyMovementMethod;
import android.text.method.MovementMethod;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.TextView;
import com.opera.hype.emoji.EmojiTextView;
import defpackage.a01;
import defpackage.bu4;
import defpackage.bvk;
import defpackage.bxk;
import defpackage.cfl;
import defpackage.exj;
import defpackage.fz2;
import defpackage.h63;
import defpackage.pwj;
import defpackage.sik;
import defpackage.uam;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Pair;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\bB\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/opera/hype/image/editor/TextBoxEditText;", "Lcom/opera/hype/emoji/EmojiTextView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "cfl", "image-editor"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TextBoxEditText extends EmojiTextView {
    public static final /* synthetic */ xtb[] o = {new pee(TextBoxEditText.class, "strokeColor", "getStrokeColor()I", 0)};
    public final fz2 j;
    public boolean k;
    public uam l;
    public final a01 m;
    public boolean n;

    /* JADX WARN: Multi-variable type inference failed */
    public TextBoxEditText(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 2130969588);
        this.j = new fz2(this);
        this.l = new bxk((Object) this, (byte) 5);
        a01 a01Var = new a01();
        a01Var.a = false;
        this.m = a01Var;
        if (getMaxLines() >= 1 && (getInputType() & 131087) == 131073) {
            addTextChangedListener(new cfl(this));
        }
        InputFilter[] filters = getFilters();
        int length = filters.length;
        Object[] objArrCopyOf = Arrays.copyOf(filters, length + 1);
        objArrCopyOf[length] = a01Var;
        setFilters((InputFilter[]) objArrCopyOf);
        addTextChangedListener(new h63((Object) this, (byte) 8));
    }

    public static void s(Editable editable) {
        k1j k1jVarA = t1j.a(new exj(editable, editable.length(), uqh.a(sik.class), null));
        while (k1jVarA.hasNext()) {
            Object obj = ((pwj) k1jVarA.next()).a;
            if (obj != null) {
                editable.removeSpan(obj);
            }
        }
    }

    public final boolean getDefaultEditable() {
        return true;
    }

    public final MovementMethod getDefaultMovementMethod() {
        return ArrowKeyMovementMethod.getInstance();
    }

    public final boolean getFreezesText() {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.k) {
            return false;
        }
        return super/*android.view.View*/.onTouchEvent(motionEvent);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setAllCaps(boolean z) {
        a01 a01Var = this.m;
        if (a01Var.a != z) {
            a01Var.a = z;
            if (z) {
                setText(getText());
            }
        }
    }

    @Override // com.opera.hype.emoji.EmojiTextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        super.setText(charSequence, TextView.BufferType.EDITABLE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public final Editable getText() {
        Editable editable;
        if (this.n) {
            return getEditableText();
        }
        try {
            this.n = true;
            CharSequence text = super.getText();
            if (text == null) {
                this.n = false;
                return null;
            }
            if (text instanceof Editable) {
                editable = (Editable) super.getText();
            } else {
                super.setText(text, TextView.BufferType.EDITABLE);
                editable = (Editable) super.getText();
            }
            return editable;
        } finally {
            this.n = false;
        }
    }

    public final void u(Editable editable) {
        s(editable);
        k1j k1jVarA = t1j.a(new x1j(new m2m(new d82(new bj9(new d82(new bu4(editable, null), (byte) 3), new Pair(Integer.valueOf(editable.length()), 0), (mt5) null, (byte) 3), (byte) 3), new bvk((byte) 14)), new ali((byte) 26), (mt5) null));
        while (k1jVarA.hasNext()) {
            Pair pair = (Pair) k1jVarA.next();
            int iIntValue = ((Number) pair.a).intValue();
            int iIntValue2 = ((Number) pair.b).intValue();
            xtb xtbVar = o[0];
            editable.setSpan(new sik(((Number) this.j.b).intValue(), this), iIntValue, iIntValue2, 18);
        }
    }
}
